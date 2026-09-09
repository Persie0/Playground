import 'dart:async';
import 'dart:convert';
import 'dart:io';

import 'package:dpdfnet_flutter/dpdfnet_flutter.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:flutter_nnnoiseless/flutter_nnnoiseless.dart';
import 'package:noise_remover/services/background_processing_task.dart';
import 'package:noise_remover/services/settings_service.dart';
import 'package:noise_remover/utils/ffmpeg_utils.dart';
import 'package:path/path.dart' as path;
import 'package:path_provider/path_provider.dart';

const _caseTimeout = Duration(minutes: 8);

String? _conversionTemplate(String format) => switch (format) {
      'wav' => null,
      'mp3' => '-i "{input}" -c:a libmp3lame -b:a 192k -y "{output}"',
      'aac' || 'm4a' => '-i "{input}" -c:a aac -b:a 192k -y "{output}"',
      _ => '-i "{input}" -y "{output}"',
    };

Future<String> _runPipeline({
  required String inputPath,
  required String tempDir,
  required bool isVideo,
  required double durationSeconds,
  required String outputFormat,
  bool useDpdfnet = false,
}) async {
  final done = Completer<String>();
  final cancellationToken = FFmpegCancellationToken();
  final modelAsset = useDpdfnet
      ? DPDFNetModel.dpdfnet2_48khzHr.packageAssetPath()
      : DPDFNetModel.dpdfnet2_48khzHr.packageAssetPath();

  await runProcessingTask(
    data: <String, dynamic>{
      'filePath': inputPath,
      'tempDir': tempDir,
      'isVideo': isVideo,
      'useDpdfnet': useDpdfnet,
      'modelAsset': modelAsset,
      'useHwAccel': false,
      'useIsolate': true,
      'targetExt': '.$outputFormat',
      'conversionCmd': isVideo ? null : _conversionTemplate(outputFormat),
      'friendlyModelName': useDpdfnet ? 'DPDFNet CI' : 'RNNoise CI',
      'totalDurationMs': durationSeconds * 1000.0,
      'msgExtracting': 'Extracting',
      'msgLoadingModel': 'Loading model',
      'msgDenoising': 'Removing noise',
      'msgCombining': 'Combining video',
      'msgConverting': 'Converting',
      'msgErrorDuration': 'Invalid duration',
      'errorAudioConversion': 'Audio conversion failed',
    },
    onProgress: (progress, message) {},
    onDone: (result) {
      if (!done.isCompleted) {
        done.complete(result['finalOutputPath'] as String);
      }
    },
    onError: (error) {
      if (!done.isCompleted) done.completeError(error, StackTrace.current);
    },
    cancellationToken: cancellationToken,
  ).timeout(
    _caseTimeout,
    onTimeout: () {
      cancellationToken.cancel();
      throw TimeoutException('Processing task exceeded $_caseTimeout');
    },
  );

  return done.future.timeout(const Duration(seconds: 5));
}

Future<double> _probeAndValidateInput(String inputPath, bool isVideo) async {
  final info = await probeMediaInformation(
    inputPath,
    timeout: const Duration(seconds: 30),
    attempts: 2,
  );
  if (!mediaInformationContainsAudio(info)) {
    throw StateError('Input has no decodable audio stream: $inputPath');
  }
  if (isVideo && !mediaInformationContainsVideo(info, filePath: inputPath)) {
    throw StateError('Input has no decodable video stream: $inputPath');
  }
  final duration = double.tryParse(info.getDuration() ?? '');
  if (duration == null || !duration.isFinite || duration <= 0) {
    throw StateError('Input has no valid duration: $inputPath');
  }
  return duration;
}

Future<void> _validateOutput({
  required String outputPath,
  required bool expectVideo,
  required double expectedDuration,
}) async {
  final file = File(outputPath);
  if (!await file.exists()) throw StateError('Output does not exist: $outputPath');
  final bytes = await file.length();
  if (bytes <= 44) throw StateError('Output is empty/truncated: $outputPath ($bytes bytes)');

  final info = await probeMediaInformation(
    outputPath,
    timeout: const Duration(seconds: 30),
    attempts: 2,
  );
  if (!mediaInformationContainsAudio(info)) {
    throw StateError('Processed output has no audio stream: $outputPath');
  }
  if (expectVideo && !mediaInformationContainsVideo(info, filePath: outputPath)) {
    throw StateError('Processed video output lost its video stream: $outputPath');
  }
  final duration = double.tryParse(info.getDuration() ?? '');
  if (duration == null || !duration.isFinite || duration <= 0) {
    throw StateError('Processed output has invalid duration: $outputPath');
  }
  final tolerance = (expectedDuration * 0.08).clamp(0.75, 3.0);
  if ((duration - expectedDuration).abs() > tolerance) {
    throw StateError(
      'Processed output duration drifted: input=$expectedDuration output=$duration tolerance=$tolerance path=$outputPath',
    );
  }
}

Future<void> _copyAsset(String assetPath, String destination) async {
  final data = await rootBundle.load(assetPath);
  await File(destination).writeAsBytes(
    data.buffer.asUint8List(data.offsetInBytes, data.lengthInBytes),
    flush: true,
  );
}

Future<void> _runOneFormat({
  required Directory root,
  required String kind,
  required String extension,
  required int index,
}) async {
  final isVideo = kind == 'video';
  final caseDir = Directory(path.join(root.path, 'case_${index}_$kind-$extension'));
  await caseDir.create(recursive: true);
  final inputPath = path.join(caseDir.path, 'input.$extension');
  await _copyAsset('assets/ci_formats/sample.$extension', inputPath);
  final duration = await _probeAndValidateInput(inputPath, isVideo);

  print('FORMAT_CHECK_CASE_START:$kind:$extension:${duration.toStringAsFixed(3)}');
  final outputPath = await _runPipeline(
    inputPath: inputPath,
    tempDir: caseDir.path,
    isVideo: isVideo,
    durationSeconds: duration,
    outputFormat: 'wav',
  );
  await _validateOutput(
    outputPath: outputPath,
    expectVideo: isVideo,
    expectedDuration: duration,
  );
  print('FORMAT_CHECK_CASE_PASS:$kind:$extension:${await File(outputPath).length()}');

  try {
    await caseDir.delete(recursive: true);
  } catch (_) {}
}

Future<void> _runOutputFormatMatrix({
  required Directory root,
  required List<String> outputFormats,
}) async {
  for (final format in outputFormats) {
    final caseDir = Directory(path.join(root.path, 'output-$format'));
    await caseDir.create(recursive: true);
    final inputPath = path.join(caseDir.path, 'input.wav');
    await _copyAsset('assets/ci_formats/sample.wav', inputPath);
    final duration = await _probeAndValidateInput(inputPath, false);
    print('OUTPUT_FORMAT_CHECK_START:$format');
    final outputPath = await _runPipeline(
      inputPath: inputPath,
      tempDir: caseDir.path,
      isVideo: false,
      durationSeconds: duration,
      outputFormat: format,
    );
    if (path.extension(outputPath).toLowerCase() != '.$format') {
      throw StateError('Requested .$format but pipeline returned $outputPath');
    }
    await _validateOutput(
      outputPath: outputPath,
      expectVideo: false,
      expectedDuration: duration,
    );
    print('OUTPUT_FORMAT_CHECK_PASS:$format:${await File(outputPath).length()}');
    try {
      await caseDir.delete(recursive: true);
    } catch (_) {}
  }
}

Future<void> _runDpdfnetCrossChecks(Directory root) async {
  for (final item in const [('audio', 'wav'), ('video', 'mp4')]) {
    final kind = item.$1;
    final ext = item.$2;
    final isVideo = kind == 'video';
    final caseDir = Directory(path.join(root.path, 'dpdf-$kind'));
    await caseDir.create(recursive: true);
    final inputPath = path.join(caseDir.path, 'input.$ext');
    await _copyAsset('assets/ci_formats/sample.$ext', inputPath);
    final duration = await _probeAndValidateInput(inputPath, isVideo);
    print('DPDF_FORMAT_CHECK_START:$kind:$ext');
    final outputPath = await _runPipeline(
      inputPath: inputPath,
      tempDir: caseDir.path,
      isVideo: isVideo,
      durationSeconds: duration,
      outputFormat: 'wav',
      useDpdfnet: true,
    );
    await _validateOutput(
      outputPath: outputPath,
      expectVideo: isVideo,
      expectedDuration: duration,
    );
    print('DPDF_FORMAT_CHECK_PASS:$kind:$ext');
    try {
      await caseDir.delete(recursive: true);
    } catch (_) {}
  }
}

Future<void> _runAllChecks() async {
  final manifestData = await rootBundle.loadString('assets/ci_formats/manifest.json');
  final manifest = jsonDecode(manifestData) as Map<String, dynamic>;
  final audio = List<String>.from(manifest['audio'] as List);
  final video = List<String>.from(manifest['video'] as List);
  final outputs = List<String>.from(manifest['outputs'] as List);

  final declaredAudio = SettingsService.supportedAudioExtensions.toSet();
  final declaredVideo = SettingsService.supportedVideoExtensions.toSet();
  final declaredOutputs = SettingsService.supportedFormats.toSet();
  if (audio.toSet().difference(declaredAudio).isNotEmpty ||
      declaredAudio.difference(audio.toSet()).isNotEmpty) {
    throw StateError('Audio fixture manifest does not exactly match SettingsService: manifest=$audio declared=$declaredAudio');
  }
  if (video.toSet().difference(declaredVideo).isNotEmpty ||
      declaredVideo.difference(video.toSet()).isNotEmpty) {
    throw StateError('Video fixture manifest does not exactly match SettingsService: manifest=$video declared=$declaredVideo');
  }
  if (outputs.toSet().difference(declaredOutputs).isNotEmpty ||
      declaredOutputs.difference(outputs.toSet()).isNotEmpty) {
    throw StateError('Output-format manifest does not exactly match SettingsService: manifest=$outputs declared=$declaredOutputs');
  }

  await ensureFlutterNnnoiselessInitialized();
  final base = await getTemporaryDirectory();
  final root = Directory(path.join(base.path, 'all_format_e2e_${DateTime.now().millisecondsSinceEpoch}'));
  await root.create(recursive: true);

  var passed = 0;
  var index = 0;
  for (final ext in audio) {
    await _runOneFormat(root: root, kind: 'audio', extension: ext, index: index++);
    passed++;
  }
  for (final ext in video) {
    await _runOneFormat(root: root, kind: 'video', extension: ext, index: index++);
    passed++;
  }

  await _runOutputFormatMatrix(root: root, outputFormats: outputs);
  await _runDpdfnetCrossChecks(root);

  print('FORMAT_CHECK_SUMMARY:inputs=$passed/${audio.length + video.length}:outputs=${outputs.length}/${outputs.length}:dpdf=2/2');
  try {
    await root.delete(recursive: true);
  } catch (_) {}
}

Future<void> main() async {
  WidgetsFlutterBinding.ensureInitialized();
  runApp(
    const Directionality(
      textDirection: TextDirection.ltr,
      child: Center(child: Text('Noise Remover all-format processing check')),
    ),
  );

  try {
    await _runAllChecks();
    print('FORMAT_CHECK_PASS');
  } catch (error, stackTrace) {
    print('FORMAT_CHECK_FAIL:$error');
    print(stackTrace);
  }
}
