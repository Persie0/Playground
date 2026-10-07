#!/usr/bin/env bash
set -euo pipefail
TARGET="$1"
ASSETS="$2"
SRC="a724ed99583dcfe2af497c794fdd6b24ddd54a4e"
TAG="extract-audio-ffmpegkitnext-lgpl-v9.0.0"
cd "$TARGET"
git fetch origin main
git rebase origin/main
source "$ASSETS/checksums.env"
DEST="swift-ios/Vendor/FFmpegKitNextLGPL"
rm -rf "$DEST"; mkdir -p "$DEST"
BASE="https://github.com/Persie0/Playground/releases/download/$TAG"
cat > "$DEST/Package.swift" <<EOF
// swift-tools-version: 5.9
import PackageDescription
let package = Package(
  name: "FFmpegKitNextLGPL",
  platforms: [.iOS(.v17)],
  products: [.library(name: "ffmpeg-kit", targets: [
    "ffmpegkit","libavcodec","libavdevice","libavfilter",
    "libavformat","libavutil","libswresample","libswscale"
  ])],
  targets: [
    .binaryTarget(name:"ffmpegkit",url:"$BASE/ffmpegkit.xcframework.zip",checksum:"$ffmpegkit"),
    .binaryTarget(name:"libavcodec",url:"$BASE/libavcodec.xcframework.zip",checksum:"$libavcodec"),
    .binaryTarget(name:"libavdevice",url:"$BASE/libavdevice.xcframework.zip",checksum:"$libavdevice"),
    .binaryTarget(name:"libavfilter",url:"$BASE/libavfilter.xcframework.zip",checksum:"$libavfilter"),
    .binaryTarget(name:"libavformat",url:"$BASE/libavformat.xcframework.zip",checksum:"$libavformat"),
    .binaryTarget(name:"libavutil",url:"$BASE/libavutil.xcframework.zip",checksum:"$libavutil"),
    .binaryTarget(name:"libswresample",url:"$BASE/libswresample.xcframework.zip",checksum:"$libswresample"),
    .binaryTarget(name:"libswscale",url:"$BASE/libswscale.xcframework.zip",checksum:"$libswscale")
  ])
)
EOF
cat > "$DEST/BUILD_PROVENANCE.md" <<EOF
# FFmpegKitNext LGPL iOS binary provenance
Source: https://github.com/arthenica/ffmpeg-kit-next
Release: v9.0.0
Commit: $SRC
Build: ./ios.sh -x --spm --target=17.0 --arch=arm64,arm64-simulator --jobs=4
Binary release: https://github.com/Persie0/Playground/releases/tag/$TAG

GPL/nonfree options and GPL codec libraries are not enabled.
The publisher verifies dynamic linkage and scans final Mach-O binaries
for forbidden GPL/nonfree configure flags before upload.
EOF
cp ../ffmpeg-kit-next/LICENSE "$DEST/LICENSE-FFMPEGKITNEXT.txt"
git add "$DEST"
git diff --cached --quiet && exit 0
git config user.name "github-actions[bot]"
git config user.email "41898282+github-actions[bot]@users.noreply.github.com"
git commit -m "Add verified LGPL FFmpegKitNext SwiftPM package"
git push origin main
