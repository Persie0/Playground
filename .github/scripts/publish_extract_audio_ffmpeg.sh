#!/usr/bin/env bash
set -euo pipefail
ROOT="$1"
ASSETS="$RUNNER_TEMP/ffmpeg-assets"
TAG="extract-audio-ffmpegkitnext-lgpl-v9.0.0"
rm -rf "$ASSETS"; mkdir -p "$ASSETS"
for n in ffmpegkit libavcodec libavdevice libavfilter libavformat libavutil libswresample libswscale; do
  z="$ASSETS/$n.xcframework.zip"
  ditto -c -k --sequesterRsrc --keepParent "$ROOT/$n.xcframework" "$z"
  printf '%s=%s\n' "$n" "$(swift package compute-checksum "$z")" >> "$ASSETS/checksums.env"
done
gh release view "$TAG" --repo Persie0/Playground >/dev/null 2>&1 || gh release create "$TAG" --repo Persie0/Playground --title "ExtractAudio FFmpegKitNext LGPL v9.0.0" --notes "Source-built FFmpegKitNext v9.0.0 for iOS 17 arm64 device + arm64 simulator. Final Mach-O binaries are dynamically linked and scanned for GPL/nonfree FFmpeg flags before upload."
gh release upload "$TAG" "$ASSETS"/*.xcframework.zip --repo Persie0/Playground --clobber
echo "ASSETS=$ASSETS" >> "$GITHUB_ENV"
