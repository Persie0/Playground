#!/usr/bin/env python3
from pathlib import Path
import sys

root = Path(sys.argv[1])
path = root / "tool/configure_platforms.dart"
text = path.read_text()
old = '''        val candidates = focalLengths.mapNotNull { focalValue ->
            val focal = focalValue.toDouble()
            if (focal <= 0.0) return@mapNotNull null
            val horizontal = 2.0 * atan(sensor.width.toDouble() / (2.0 * focal)) * 180.0 / PI
            val vertical = 2.0 * atan(sensor.height.toDouble() / (2.0 * focal)) * 180.0 / PI
            if (!horizontal.isFinite() || !vertical.isFinite()) null else Pair(horizontal, vertical)
        }
        val selected = candidates.minByOrNull { abs(it.first - 72.0) } ?: return null
        return mapOf("horizontal" to selected.first, "vertical" to selected.second)
'''
new = '''        var selectedHorizontal: Double? = null
        var selectedVertical: Double? = null
        var selectedDistance = Double.POSITIVE_INFINITY
        for (focalValue in focalLengths) {
            val focal = focalValue.toDouble()
            if (focal <= 0.0) continue
            val horizontal = 2.0 * atan(sensor.width.toDouble() / (2.0 * focal)) * 180.0 / PI
            val vertical = 2.0 * atan(sensor.height.toDouble() / (2.0 * focal)) * 180.0 / PI
            if (!horizontal.isFinite() || !vertical.isFinite()) continue
            val distance = abs(horizontal - 72.0)
            if (distance < selectedDistance) {
                selectedDistance = distance
                selectedHorizontal = horizontal
                selectedVertical = vertical
            }
        }
        val horizontal = selectedHorizontal ?: return null
        val vertical = selectedVertical ?: return null
        return mapOf("horizontal" to horizontal, "vertical" to vertical)
'''
if old not in text:
    if new in text:
        raise SystemExit(0)
    raise RuntimeError("Expected FloatArray.mapNotNull block not found")
path.write_text(text.replace(old, new, 1))
