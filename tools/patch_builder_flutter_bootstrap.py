#!/usr/bin/env python3
from pathlib import Path
import sys

root = Path(sys.argv[1])
insertion = r'''
      - name: Prepare generated Flutter platforms
        if: steps.project.outputs.type == 'flutter'
        shell: bash
        run: |
          set -euo pipefail
          if [ ! -f android/app/build.gradle ] && [ ! -f android/app/build.gradle.kts ]; then
            PROJECT_NAME="$(sed -n 's/^name:[[:space:]]*//p' pubspec.yaml | head -n1 | tr '-' '_')"
            flutter create --platforms=android --project-name="$PROJECT_NAME" --no-pub .
            if [ -f tool/configure_platforms.dart ]; then
              dart run tool/configure_platforms.dart
            fi
            if [ -f tool/set_android_sdk37.dart ]; then
              dart run tool/set_android_sdk37.dart
            elif [ -f tool/configure_android_sdk.sh ]; then
              bash tool/configure_android_sdk.sh
            fi
            if ! git ls-files --error-unmatch test/widget_test.dart >/dev/null 2>&1; then
              rm -f test/widget_test.dart
            fi
          fi
'''
anchor = "      - name: Setup standalone Gradle\n        if: startsWith(steps.project.outputs.type, 'gradle-system-')\n"
for relative in (
    '.github/workflows/debug_create_app.yml',
    '.github/workflows/debug_build_release_reusable.yml',
):
    path = root / relative
    text = path.read_text()
    old_start = text.find("\n      - name: Prepare generated Flutter platforms\n")
    if old_start >= 0:
        old_end = text.find("\n      - name: Setup standalone Gradle\n", old_start)
        if old_end < 0:
            raise RuntimeError(f'Could not locate end of existing bootstrap step in {path}')
        text = text[:old_start] + text[old_end:]
    if anchor not in text:
        raise RuntimeError(f'Builder insertion anchor not found in {path}')
    path.write_text(text.replace(anchor, insertion + "\n" + anchor, 1))
