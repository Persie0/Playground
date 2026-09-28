import 'dart:async';
import 'dart:io';
import 'dart:ui' as ui;

import 'package:device_info_plus/device_info_plus.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:image_enhancer/services/image_processing_job.dart';
import 'package:image_enhancer/services/image_processing_job_store.dart';
import 'package:image_enhancer/services/image_processing_service.dart';
import 'package:integration_test/integration_test.dart';
import 'package:path/path.dart' as path;
import 'package:path_provider/path_provider.dart';

const _terminalTimeout = Duration(minutes: 4);

void main() {
  IntegrationTestWidgetsFlutterBinding.ensureInitialized();

  testWidgets(
    'Android foreground worker finishes an upscale while Activity is backgrounded',
    (_) async {
      if (!Platform.isAndroid) return;

      ImageProcessingService.initializeCommunicationPort();
      final service = ImageProcessingService.instance;
      service.initialize();
      const store = ImageProcessingJobStore();
      await store.clear();

      final support = await getApplicationSupportDirectory();
      final work = Directory(
        path.join(
          support.path,
          'foreground-image-smoke-${DateTime.now().microsecondsSinceEpoch}',
        ),
      );
      await work.create(recursive: true);
      final inputPath = path.join(work.path, 'input.png');
      final stagingPath = path.join(work.path, 'upscaled.png.new');
      final outputPath = path.join(work.path, 'upscaled.png');

      try {
        await _writeFixturePng(inputPath, 1408, 1408);
        final now = DateTime.now().toUtc();
        final job = ImageProcessingJob(
          jobId: 'foreground-image-${now.microsecondsSinceEpoch}',
          inputPath: inputPath,
          stagingOutputPath: stagingPath,
          outputPath: outputPath,
          modelKey: 'video2xfast_rl',
          modelPath: 'assets/video_models/video2xfast_rl.onnx',
          scale: 2,
          tileSize: 64,
          overlap: 2,
          fastMode: true,
          disableXnnpack: false,
          status: ImageProcessingStatus.processing,
          progress: 0,
          message: 'Preparing image',
          createdAt: now,
          updatedAt: now,
        );

        final sdk = (await DeviceInfoPlugin().androidInfo).version.sdkInt;
        await service.start(job, sdkInt: sdk);
        await _waitUntil(
          () => service.isRunning,
          timeout: const Duration(seconds: 20),
          description: 'image foreground service to start',
        );
        debugPrint('IMAGE_FOREGROUND_SMOKE_READY:${job.jobId}');

        final terminal = await _waitForTerminal(store, job.jobId);
        expect(
          terminal.status,
          ImageProcessingStatus.completed,
          reason: terminal.error,
        );
        expect(terminal.progress, 1.0);

        final output = File(outputPath);
        expect(await output.exists(), isTrue);
        expect(await output.length(), greaterThan(100));
        final bytes = await output.readAsBytes();
        final codec = await ui.instantiateImageCodec(bytes);
        try {
          final frame = await codec.getNextFrame();
          try {
            expect(frame.image.width, 2816);
            expect(frame.image.height, 2816);
          } finally {
            frame.image.dispose();
          }
        } finally {
          codec.dispose();
        }

        await _waitUntil(
          () async => !(await service.isRunning),
          timeout: const Duration(seconds: 20),
          description: 'image foreground service to stop after completion',
        );
      } finally {
        if (await service.isRunning) {
          await service.cancel();
          await Future<void>.delayed(const Duration(milliseconds: 500));
        }
        await store.clear();
        if (await work.exists()) await work.delete(recursive: true);
      }
    },
    timeout: const Timeout(Duration(minutes: 5)),
  );
}

Future<void> _writeFixturePng(String outputPath, int width, int height) async {
  final recorder = ui.PictureRecorder();
  final canvas = Canvas(recorder);
  canvas.drawRect(
    Rect.fromLTWH(0, 0, width.toDouble(), height.toDouble()),
    Paint()..color = const Color(0xFF274060),
  );
  final stripe = Paint()..color = const Color(0xFFE6AF2E);
  for (var x = 0; x < width; x += 32) {
    canvas.drawRect(Rect.fromLTWH(x.toDouble(), 0, 12, height.toDouble()), stripe);
  }
  final picture = recorder.endRecording();
  final image = await picture.toImage(width, height);
  picture.dispose();
  try {
    final png = await image.toByteData(format: ui.ImageByteFormat.png);
    if (png == null) throw StateError('Could not encode image fixture.');
    await File(outputPath).writeAsBytes(
      png.buffer.asUint8List(png.offsetInBytes, png.lengthInBytes),
      flush: true,
    );
  } finally {
    image.dispose();
  }
}

Future<ImageProcessingJob> _waitForTerminal(
  ImageProcessingJobStore store,
  String jobId,
) async {
  final deadline = DateTime.now().add(_terminalTimeout);
  ImageProcessingJob? latest;
  while (DateTime.now().isBefore(deadline)) {
    latest = await store.load();
    if (latest?.jobId == jobId && latest!.isTerminal) return latest;
    await Future<void>.delayed(const Duration(milliseconds: 200));
  }
  throw TimeoutException(
    'Image foreground job did not finish. Last job: ${latest?.toJson()}',
    _terminalTimeout,
  );
}

Future<void> _waitUntil(
  Future<bool> Function() condition, {
  required Duration timeout,
  required String description,
}) async {
  final deadline = DateTime.now().add(timeout);
  while (DateTime.now().isBefore(deadline)) {
    if (await condition()) return;
    await Future<void>.delayed(const Duration(milliseconds: 100));
  }
  throw TimeoutException('Timed out waiting for $description.', timeout);
}
