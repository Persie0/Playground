import 'dart:io';
import 'dart:math' as math;
import 'dart:typed_data';

import 'package:dpdfnet_flutter/dpdfnet_flutter.dart';
import 'package:ffmpeg_kit_flutter_new_audio/ffprobe_kit.dart';
import 'package:ffmpeg_kit_flutter_new_audio/return_code.dart';
import 'package:flutter/widgets.dart';
import 'package:flutter_nnnoiseless/flutter_nnnoiseless.dart';
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

Future<void> _runSmoke() async {
  final dir = await getTemporaryDirectory();

  print('R8_SMOKE_STAGE:FFPROBE');
  final input = File('${dir.path}/r8_smoke_input.wav');
  final rnnoise = File('${dir.path}/r8_smoke_rnnoise.wav');
  final ffmpeg = File('${dir.path}/r8_smoke_ffmpeg.wav');
  await input.writeAsBytes(makeWav(), flush: true);
  if (await input.length() <= 100000) {
    throw StateError('Generated WAV is unexpectedly small');
  }

  final probe = await FFprobeKit.getMediaInformation(input.path);
  if (probe.getMediaInformation() == null) {
    throw StateError('FFprobe Java/JNI bridge returned no media information');
  }

  print('R8_SMOKE_STAGE:RNNOISE');
  await ensureFlutterNnnoiselessInitialized();
  await Noiseless.instance.denoiseFile(
    inputPathStr: input.path,
    outputPathStr: rnnoise.path,
    onProgress: (_) {},
  );
  if (!await rnnoise.exists() || await rnnoise.length() <= 44) {
    throw StateError('RNNoise Rust bridge produced no output');
  }

  print('R8_SMOKE_STAGE:FFMPEG');
  final session = await executeFFmpegAsync(
    '-y -i "${rnnoise.path}" -ac 1 -ar 48000 -c:a pcm_s16le "${ffmpeg.path}"',
  );
  final rc = await session.getReturnCode();
  if (!ReturnCode.isSuccess(rc) || !await ffmpeg.exists() || await ffmpeg.length() <= 44) {
    throw StateError('FFmpeg callback/JNI bridge failed');
  }

  print('R8_SMOKE_STAGE:DPDFNET');
  final dpdfInput = File('${dir.path}/r8_dpdf_input.wav');
  final dpdfOutput = File('${dir.path}/r8_dpdf_output.wav');
  await dpdfInput.writeAsBytes(makeWav(seconds: 2), flush: true);
  await DPDFNetEngine.processFileInIsolate(
    DPDFNetModel.dpdfnet2_48khzHr.packageAssetPath(),
    dpdfInput.path,
    dpdfOutput.path,
    useHardwareAcceleration: false,
  );
  if (!await dpdfOutput.exists() || await dpdfOutput.length() <= 44) {
    throw StateError('DPDFNet Rust/ONNX bridge produced no output');
  }
}

Future<void> main() async {
  WidgetsFlutterBinding.ensureInitialized();
  runApp(const Directionality(
    textDirection: TextDirection.ltr,
    child: Center(child: Text('Noise Remover release smoke test')),
  ));

  try {
    await _runSmoke();
    print('R8_SMOKE_PASS');
  } catch (error, stackTrace) {
    print('R8_SMOKE_FAIL:$error');
    print(stackTrace);
  }
}
