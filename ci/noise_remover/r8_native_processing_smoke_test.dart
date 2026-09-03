import 'dart:io';
import 'dart:math' as math;
import 'dart:typed_data';

import 'package:dpdfnet_flutter/dpdfnet_flutter.dart';
import 'package:ffmpeg_kit_flutter_new_audio/ffprobe_kit.dart';
import 'package:ffmpeg_kit_flutter_new_audio/return_code.dart';
import 'package:flutter_nnnoiseless/flutter_nnnoiseless.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:integration_test/integration_test.dart';
import 'package:noise_remover/utils/ffmpeg_utils.dart';
import 'package:path_provider/path_provider.dart';

Uint8List makeWav({int seconds = 3, int sampleRate = 48000}) {
  final samples = seconds * sampleRate;
  final dataSize = samples * 2;
  final out = ByteData(44 + dataSize);

  void ascii(int offset, String text) {
    for (var i = 0; i < text.length; i++) {
      out.setUint8(offset + i, text.codeUnitAt(i));
    }
  }

  ascii(0, 'RIFF');
  out.setUint32(4, 36 + dataSize, Endian.little);
  ascii(8, 'WAVE');
  ascii(12, 'fmt ');
  out.setUint32(16, 16, Endian.little);
  out.setUint16(20, 1, Endian.little);
  out.setUint16(22, 1, Endian.little);
  out.setUint32(24, sampleRate, Endian.little);
  out.setUint32(28, sampleRate * 2, Endian.little);
  out.setUint16(32, 2, Endian.little);
  out.setUint16(34, 16, Endian.little);
  ascii(36, 'data');
  out.setUint32(40, dataSize, Endian.little);

  for (var i = 0; i < samples; i++) {
    final t = i / sampleRate;
    final signal = 0.22 * math.sin(2 * math.pi * 220 * t) +
        0.10 * math.sin(2 * math.pi * 440 * t) +
        0.03 * math.sin(2 * math.pi * 3173 * t);
    final value = (signal.clamp(-0.95, 0.95) * 32767).round();
    out.setInt16(44 + i * 2, value, Endian.little);
  }
  return out.buffer.asUint8List();
}

void main() {
  IntegrationTestWidgetsFlutterBinding.ensureInitialized();

  testWidgets('R8 release keeps FFmpeg and RNNoise native bridges', (tester) async {
    final dir = await getTemporaryDirectory();
    final input = File('${dir.path}/r8_smoke_input.wav');
    final rnnoise = File('${dir.path}/r8_smoke_rnnoise.wav');
    final ffmpeg = File('${dir.path}/r8_smoke_ffmpeg.wav');
    await input.writeAsBytes(makeWav(), flush: true);
    expect(await input.length(), greaterThan(100000));

    final probe = await FFprobeKit.getMediaInformation(input.path);
    expect(
      probe.getMediaInformation(),
      isNotNull,
      reason: 'FFprobe Java/JNI bridge failed under R8 release',
    );

    await ensureFlutterNnnoiselessInitialized();
    await Noiseless.instance.denoiseFile(
      inputPathStr: input.path,
      outputPathStr: rnnoise.path,
      onProgress: (_) {},
    );
    expect(await rnnoise.exists(), isTrue);
    expect(
      await rnnoise.length(),
      greaterThan(44),
      reason: 'RNNoise Rust bridge produced no output under R8',
    );

    final session = await executeFFmpegAsync(
      '-y -i "${rnnoise.path}" -ac 1 -ar 48000 -c:a pcm_s16le "${ffmpeg.path}"',
    );
    final rc = await session.getReturnCode();
    expect(
      ReturnCode.isSuccess(rc),
      isTrue,
      reason: 'FFmpeg callback/JNI bridge failed under R8 release',
    );
    expect(await ffmpeg.length(), greaterThan(44));
  }, timeout: const Timeout(Duration(minutes: 5)));

  testWidgets('R8 release keeps DPDFNet/ONNX processing bridge', (tester) async {
    final dir = await getTemporaryDirectory();
    final input = File('${dir.path}/r8_dpdf_input.wav');
    final output = File('${dir.path}/r8_dpdf_output.wav');
    await input.writeAsBytes(makeWav(seconds: 2), flush: true);

    await DPDFNetEngine.processFileInIsolate(
      DPDFNetModel.dpdfnet2_48khzHr.packageAssetPath(),
      input.path,
      output.path,
      useHardwareAcceleration: false,
    );
    expect(await output.exists(), isTrue);
    expect(
      await output.length(),
      greaterThan(44),
      reason: 'DPDFNet Rust/ONNX bridge produced no output under R8',
    );
  }, timeout: const Timeout(Duration(minutes: 8)));
}
