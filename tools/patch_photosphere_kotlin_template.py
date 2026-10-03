#!/usr/bin/env python3
from pathlib import Path
import sys

path = Path(sys.argv[1]) / 'tool/configure_platforms.dart'
text = path.read_text()
old = '''        val candidates = focalLengths.mapNotNull { focalValue ->
            val focal = focalValue.toDouble()
            if (focal <= 0.0) return@mapNotNull null
            val horizontal = 2.0 * atan(sensor.width.toDouble() / (2.0 * focal)) * 180.0 / PI
            val vertical = 2.0 * atan(sensor.height.toDouble() / (2.0 * focal)) * 180.0 / PI
            if (!horizontal.isFinite() || !vertical.isFinite()) null else Pair(horizontal, vertical)
        }
        val selected = candidates.minByOrNull { abs(it.first - 72.0) } ?: return null
'''
new = '''        var selectedHorizontal: Double? = null
        var selectedVertical: Double? = null
        var selectedDelta = Double.POSITIVE_INFINITY
        for (focalValue in focalLengths) {
            val focal = focalValue.toDouble()
            if (focal <= 0.0) continue
            val horizontal = 2.0 * atan(sensor.width.toDouble() / (2.0 * focal)) * 180.0 / PI
            val vertical = 2.0 * atan(sensor.height.toDouble() / (2.0 * focal)) * 180.0 / PI
            if (!horizontal.isFinite() || !vertical.isFinite()) continue
            val delta = abs(horizontal - 72.0)
            if (delta < selectedDelta) {
                selectedDelta = delta
                selectedHorizontal = horizontal
                selectedVertical = vertical
            }
        }
        val horizontal = selectedHorizontal ?: return null
        val vertical = selectedVertical ?: return null
'''
if old not in text:
    raise SystemExit('Expected focal-length candidate block was not found')
text = text.replace(old, new, 1)
text = text.replace(
    '        return mapOf("horizontal" to selected.first, "vertical" to selected.second)\n',
    '        return mapOf("horizontal" to horizontal, "vertical" to vertical)\n',
    1,
)
path.write_text(text)
