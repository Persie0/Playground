#!/usr/bin/env bash
set -euo pipefail

APP_DIR="${1:-app}"
OUT_DIR="$APP_DIR/assets/ci_formats"
SETTINGS="$APP_DIR/lib/services/settings_service.dart"

rm -rf "$OUT_DIR"
mkdir -p "$OUT_DIR"
work="$(mktemp -d)"
trap 'rm -rf "$work"' EXIT

python3 - "$SETTINGS" "$work/formats.json" <<'PY'
import json, re, sys
from pathlib import Path
src = Path(sys.argv[1]).read_text()

def read_list(name):
    match = re.search(rf"static const List<String> {name}\s*=\s*\[(.*?)\];", src, re.S)
    if not match:
        raise SystemExit(f"Could not find {name}")
    return re.findall(r"'([^']+)'", match.group(1))

data = {
    "audio": read_list("supportedAudioExtensions"),
    "video": read_list("supportedVideoExtensions"),
    "outputs": read_list("supportedFormats"),
}
Path(sys.argv[2]).write_text(json.dumps(data, indent=2) + "\n")
print(json.dumps(data))
PY

# Produce a short, noisy, genuinely encoded reference audio track. Every fixture
# below is a real container/codec file; extensions are never created by renaming.
ffmpeg -hide_banner -loglevel error -y \
  -f lavfi -i 'sine=frequency=440:sample_rate=48000:duration=2.8' \
  -f lavfi -i 'anoisesrc=color=white:amplitude=0.035:sample_rate=48000:duration=2.8' \
  -filter_complex '[0:a][1:a]amix=inputs=2:weights=1 1:normalize=0[a]' \
  -map '[a]' -ac 1 -ar 48000 -c:a pcm_s16le "$work/base.wav"

# A small reference video with both moving picture and noisy audio.
ffmpeg -hide_banner -loglevel error -y \
  -f lavfi -i 'testsrc2=size=192x128:rate=12:duration=2.8' \
  -f lavfi -i 'sine=frequency=660:sample_rate=48000:duration=2.8' \
  -f lavfi -i 'anoisesrc=color=pink:amplitude=0.025:sample_rate=48000:duration=2.8' \
  -filter_complex '[1:a][2:a]amix=inputs=2:weights=1 1:normalize=0[a]' \
  -map 0:v -map '[a]' -c:v mpeg4 -q:v 5 -pix_fmt yuv420p -c:a aac -b:a 128k \
  -shortest "$work/base.mp4"

make_audio() {
  local ext="$1" out="$OUT_DIR/sample.$1"
  case "$ext" in
    wav)  ffmpeg -hide_banner -loglevel error -y -i "$work/base.wav" -c:a pcm_s16le "$out" ;;
    mp3)  ffmpeg -hide_banner -loglevel error -y -i "$work/base.wav" -c:a libmp3lame -b:a 160k "$out" ;;
    m4a)  ffmpeg -hide_banner -loglevel error -y -i "$work/base.wav" -c:a aac -b:a 160k -f mp4 "$out" ;;
    aac)  ffmpeg -hide_banner -loglevel error -y -i "$work/base.wav" -c:a aac -b:a 160k -f adts "$out" ;;
    flac) ffmpeg -hide_banner -loglevel error -y -i "$work/base.wav" -c:a flac "$out" ;;
    ogg)  ffmpeg -hide_banner -loglevel error -y -i "$work/base.wav" -c:a libvorbis -q:a 4 -f ogg "$out" ;;
    opus) ffmpeg -hide_banner -loglevel error -y -i "$work/base.wav" -c:a libopus -b:a 96k -f opus "$out" ;;
    wma)  ffmpeg -hide_banner -loglevel error -y -i "$work/base.wav" -c:a wmav2 -b:a 128k -f asf "$out" ;;
    aiff|aif) ffmpeg -hide_banner -loglevel error -y -i "$work/base.wav" -c:a pcm_s16be -f aiff "$out" ;;
    ac3)  ffmpeg -hide_banner -loglevel error -y -i "$work/base.wav" -c:a ac3 -b:a 192k -f ac3 "$out" ;;
    mp2)  ffmpeg -hide_banner -loglevel error -y -i "$work/base.wav" -c:a mp2 -b:a 192k -f mp2 "$out" ;;
    m4b|m4r) ffmpeg -hide_banner -loglevel error -y -i "$work/base.wav" -c:a aac -b:a 160k -f mp4 "$out" ;;
    ape)
      # FFmpeg decodes Monkey's Audio but intentionally has no APE encoder.
      # Use FFmpeg's long-lived public codec corpus as the one external fixture.
      curl --fail --location --retry 4 --retry-delay 2 \
        'https://samples.ffmpeg.org/monkeyaudio/sh3.ape' -o "$out"
      ;;
    *) echo "No real-audio fixture recipe for .$ext" >&2; exit 41 ;;
  esac
}

make_video() {
  local ext="$1" out="$OUT_DIR/sample.$1"
  case "$ext" in
    mp4)  ffmpeg -hide_banner -loglevel error -y -i "$work/base.mp4" -c:v mpeg4 -q:v 5 -c:a aac -b:a 128k -f mp4 "$out" ;;
    mov)  ffmpeg -hide_banner -loglevel error -y -i "$work/base.mp4" -c:v mpeg4 -q:v 5 -c:a aac -b:a 128k -f mov "$out" ;;
    avi)  ffmpeg -hide_banner -loglevel error -y -i "$work/base.mp4" -c:v mpeg4 -q:v 5 -c:a libmp3lame -b:a 128k -f avi "$out" ;;
    mkv)  ffmpeg -hide_banner -loglevel error -y -i "$work/base.mp4" -c:v mpeg4 -q:v 5 -c:a aac -b:a 128k -f matroska "$out" ;;
    webm) ffmpeg -hide_banner -loglevel error -y -i "$work/base.mp4" -c:v libvpx -deadline realtime -cpu-used 8 -b:v 220k -c:a libopus -b:a 64k -f webm "$out" ;;
    flv)  ffmpeg -hide_banner -loglevel error -y -i "$work/base.mp4" -c:v flv -b:v 300k -c:a libmp3lame -b:a 96k -f flv "$out" ;;
    wmv)  ffmpeg -hide_banner -loglevel error -y -i "$work/base.mp4" -c:v wmv2 -b:v 350k -c:a wmav2 -b:a 96k -f asf "$out" ;;
    3gp)  ffmpeg -hide_banner -loglevel error -y -i "$work/base.mp4" -c:v mpeg4 -q:v 6 -c:a aac -b:a 96k -ar 44100 -f 3gp "$out" ;;
    m4v)  ffmpeg -hide_banner -loglevel error -y -i "$work/base.mp4" -c:v mpeg4 -q:v 5 -c:a aac -b:a 128k -f mp4 "$out" ;;
    mpg|mpeg) ffmpeg -hide_banner -loglevel error -y -i "$work/base.mp4" -c:v mpeg2video -b:v 450k -c:a mp2 -b:a 128k -f mpeg "$out" ;;
    m2ts|mts|ts) ffmpeg -hide_banner -loglevel error -y -i "$work/base.mp4" -c:v mpeg2video -b:v 450k -c:a mp2 -b:a 128k -f mpegts "$out" ;;
    vob)  ffmpeg -hide_banner -loglevel error -y -i "$work/base.mp4" -c:v mpeg2video -b:v 500k -c:a ac3 -b:a 192k -f vob "$out" ;;
    asf)  ffmpeg -hide_banner -loglevel error -y -i "$work/base.mp4" -c:v wmv2 -b:v 350k -c:a wmav2 -b:a 96k -f asf "$out" ;;
    *) echo "No real-video fixture recipe for .$ext" >&2; exit 42 ;;
  esac
}

mapfile -t AUDIO_FORMATS < <(python3 -c 'import json; d=json.load(open("'"$work/formats.json"'")); print("\\n".join(d["audio"]))')
mapfile -t VIDEO_FORMATS < <(python3 -c 'import json; d=json.load(open("'"$work/formats.json"'")); print("\\n".join(d["video"]))')

for ext in "${AUDIO_FORMATS[@]}"; do
  echo "Generating real audio fixture: .$ext"
  make_audio "$ext"
done
for ext in "${VIDEO_FORMATS[@]}"; do
  echo "Generating real video fixture: .$ext"
  make_video "$ext"
done

cp "$work/formats.json" "$OUT_DIR/manifest.json"

# Host-side corpus gate: every advertised fixture must already be a valid,
# decodable media file before it is bundled into the Android test app.
python3 - "$OUT_DIR" "$work/formats.json" <<'PY'
import json, subprocess, sys
from pathlib import Path
root = Path(sys.argv[1])
data = json.load(open(sys.argv[2]))
errors = []
for kind in ("audio", "video"):
    for ext in data[kind]:
        path = root / f"sample.{ext}"
        if not path.exists() or path.stat().st_size <= 0:
            errors.append(f"{kind} .{ext}: missing/empty fixture")
            continue
        probe = subprocess.run(
            ["ffprobe", "-v", "error", "-show_entries", "stream=codec_type", "-show_entries", "format=duration", "-of", "json", str(path)],
            text=True, capture_output=True,
        )
        if probe.returncode != 0:
            errors.append(f"{kind} .{ext}: ffprobe failed: {probe.stderr.strip()}")
            continue
        meta = json.loads(probe.stdout or "{}")
        stream_types = [s.get("codec_type") for s in meta.get("streams", [])]
        if "audio" not in stream_types:
            errors.append(f"{kind} .{ext}: no audio stream")
        if kind == "video" and "video" not in stream_types:
            errors.append(f"video .{ext}: no video stream")
        try:
            duration = float(meta.get("format", {}).get("duration", 0) or 0)
        except ValueError:
            duration = 0
        if duration <= 0:
            errors.append(f"{kind} .{ext}: invalid duration")
if errors:
    raise SystemExit("Corpus validation failed:\n" + "\n".join(errors))
print(f"Validated {sum(len(data[k]) for k in ('audio','video'))} real input fixtures")
PY
