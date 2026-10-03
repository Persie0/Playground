#!/usr/bin/env python3
from pathlib import Path
import sys


def replace_required(path: Path, old: str, new: str, count: int = -1) -> None:
    text = path.read_text()
    if old not in text:
        raise RuntimeError(f"Expected pattern not found in {path}: {old[:120]!r}")
    updated = text.replace(old, new, count)
    path.write_text(updated)


def ensure_after(path: Path, anchor: str, addition: str) -> None:
    text = path.read_text()
    if addition.strip() in text:
        return
    if anchor not in text:
        raise RuntimeError(f"Anchor not found in {path}: {anchor!r}")
    path.write_text(text.replace(anchor, anchor + addition, 1))


def patch_photosphere(root: Path) -> None:
    services = root / "lib/src/services"

    (services / "math_compat.dart").write_text(
        "library math_compat;\n\n"
        "import 'dart:math' as dart_math;\n"
        "export 'dart:math';\n\n"
        "double hypot(num x, num y) {\n"
        "  final dx = x.toDouble();\n"
        "  final dy = y.toDouble();\n"
        "  return dart_math.sqrt(dx * dx + dy * dy);\n"
        "}\n"
    )
    (services / "keypoint_compat.dart").write_text(
        "import 'package:opencv_dart/opencv.dart' as cv;\n\n"
        "extension KeyPointPointCompatibility on cv.KeyPoint {\n"
        "  cv.Point2f get pt => cv.Point2f(x, y);\n"
        "}\n"
    )
    (services / "opencv_compat.dart").write_text(
        "import 'package:opencv_dart/opencv.dart' as raw;\n"
        "export 'package:opencv_dart/opencv.dart' hide findHomographyAsync;\n\n"
        "Future<(raw.Mat, raw.Mat)> findHomographyAsync(\n"
        "  Object srcPoints,\n"
        "  Object dstPoints, {\n"
        "  int method = 0,\n"
        "  double ransacReprojThreshold = 3,\n"
        "  raw.Mat? mask,\n"
        "  int maxIters = 2000,\n"
        "  double confidence = 0.995,\n"
        "}) async {\n"
        "  final src = _pointInput(srcPoints);\n"
        "  final dst = _pointInput(dstPoints);\n"
        "  try {\n"
        "    return await raw.findHomographyAsync(\n"
        "      src.$1,\n"
        "      dst.$1,\n"
        "      method: method,\n"
        "      ransacReprojThreshold: ransacReprojThreshold,\n"
        "      mask: mask,\n"
        "      maxIters: maxIters,\n"
        "      confidence: confidence,\n"
        "    );\n"
        "  } finally {\n"
        "    if (src.$2) src.$1.dispose();\n"
        "    if (dst.$2) dst.$1.dispose();\n"
        "  }\n"
        "}\n\n"
        "(raw.Mat, bool) _pointInput(Object input) {\n"
        "  if (input is raw.Mat) return (input, false);\n"
        "  if (input is raw.VecPoint2f) {\n"
        "    final values = <double>[];\n"
        "    for (final point in input) {\n"
        "      values\n"
        "        ..add(point.x)\n"
        "        ..add(point.y);\n"
        "    }\n"
        "    return (\n"
        "      raw.Mat.fromList(\n"
        "        input.length,\n"
        "        1,\n"
        "        raw.MatType.CV_32FC2,\n"
        "        values,\n"
        "      ),\n"
        "      true,\n"
        "    );\n"
        "  }\n"
        "  throw ArgumentError.value(input, 'input', 'Expected Mat or VecPoint2f');\n"
        "}\n"
    )

    for name in (
        "local_residual_warp.dart",
        "hybrid_local_warp.dart",
        "structure_line_protector.dart",
        "structure_preserving_warp.dart",
    ):
        path = services / name
        replace_required(path, "import 'dart:math' as math;", "import 'math_compat.dart' as math;")

    homography_files = (
        "photosphere_engine.dart",
        "sift_graph_rescue.dart",
        "local_residual_warp.dart",
        "motion_registration_masks.dart",
        "hybrid_local_warp.dart",
        "advanced_photosphere_engine.dart",
    )
    for name in homography_files:
        path = services / name
        replace_required(
            path,
            "import 'package:opencv_dart/opencv.dart' as cv;",
            "import 'opencv_compat.dart' as cv;",
        )

    for name in (
        "photosphere_engine.dart",
        "sift_graph_rescue.dart",
        "local_residual_warp.dart",
        "motion_registration_masks.dart",
    ):
        path = services / name
        ensure_after(path, "import 'opencv_compat.dart' as cv;\n", "import 'keypoint_compat.dart';\n")

    ensure_after(
        services / "sift_graph_rescue.dart",
        "import 'keypoint_compat.dart';\n",
        "import '../models/stitch_profile.dart';\n",
    )

    for name in ("hybrid_local_warp.dart", "advanced_photosphere_engine.dart"):
        path = services / name
        replace_required(
            path,
            "(point.x, point.y)",
            "cv.Point2f(point.x, point.y)",
        )

    path = services / "structure_line_protector.dart"
    replace_required(path, "cv.CannyAsync", "cv.cannyAsync")
    replace_required(
        path,
        "      edges = await cv.cannyAsync(bounded, 70, 180, apertureSize: 3);\n",
        "      final detectedEdges = await cv.cannyAsync(\n"
        "        bounded,\n"
        "        70,\n"
        "        180,\n"
        "        apertureSize: 3,\n"
        "      );\n"
        "      edges = detectedEdges;\n",
    )
    replace_required(
        path,
        "      lines = await cv.HoughLinesPAsync(\n        edges,\n",
        "      lines = await cv.HoughLinesPAsync(\n        detectedEdges,\n",
    )

    replace_required(
        services / "dynamic_region_cleaner.dart",
        "cv.MatType.CV_64F",
        "cv.MatType.CV_64FC1",
    )
    for name in ("local_residual_warp.dart", "hybrid_local_warp.dart"):
        replace_required(
            services / name,
            "cv.MatType.CV_32F",
            "cv.MatType.CV_32FC1",
        )
    path = services / "local_patch_alignment_repair.dart"
    replace_required(path, "cv.MatType.CV_64F", "cv.MatType.CV_64FC1")
    replace_required(path, "cv.MatType.CV_32F", "cv.MatType.CV_32FC1")
    replace_required(
        services / "xfeat_matcher.dart",
        "        descriptors: cv.Mat.fromList(\n"
        "          points.length,\n"
        "          64,\n"
        "          cv.MatType.CV_32F,\n",
        "        descriptors: cv.Mat.fromList(\n"
        "          points.length,\n"
        "          64,\n"
        "          cv.MatType.CV_32FC1,\n",
    )


def patch_builder(root: Path) -> None:
    insertion = (
        "\n      - name: Prepare generated Flutter platforms\n"
        "        if: steps.project.outputs.type == 'flutter'\n"
        "        shell: bash\n"
        "        run: |\n"
        "          set -euo pipefail\n"
        "          if [ ! -f android/app/build.gradle ] && [ ! -f android/app/build.gradle.kts ]; then\n"
        "            if [ -f tool/bootstrap.sh ]; then\n"
        "              bash tool/bootstrap.sh\n"
        "            else\n"
        "              PROJECT_NAME=\"$(sed -n 's/^name:[[:space:]]*//p' pubspec.yaml | head -n1 | tr '-' '_')\"\n"
        "              flutter create --platforms=android --project-name=\"$PROJECT_NAME\" .\n"
        "            fi\n"
        "          fi\n"
    )
    anchor = (
        "      - name: Setup standalone Gradle\n"
        "        if: startsWith(steps.project.outputs.type, 'gradle-system-')\n"
    )
    for relative in (
        ".github/workflows/debug_create_app.yml",
        ".github/workflows/debug_build_release_reusable.yml",
    ):
        path = root / relative
        text = path.read_text()
        if "- name: Prepare generated Flutter platforms" in text:
            continue
        if anchor not in text:
            raise RuntimeError(f"Builder insertion anchor not found in {path}")
        path.write_text(text.replace(anchor, insertion + "\n" + anchor, 1))


def main() -> None:
    if len(sys.argv) != 3:
        raise SystemExit("usage: repair_photosphere_build.py <photosphere|builder> <root>")
    mode = sys.argv[1]
    root = Path(sys.argv[2])
    if mode == "photosphere":
        patch_photosphere(root)
    elif mode == "builder":
        patch_builder(root)
    else:
        raise SystemExit(f"unknown mode: {mode}")


if __name__ == "__main__":
    main()
