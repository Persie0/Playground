from pathlib import Path
import sys

root = Path(sys.argv[1] if len(sys.argv) > 1 else "app")


def replace_once(text: str, old: str, new: str, label: str) -> str:
    count = text.count(old)
    if count != 1:
        raise SystemExit(f"{label}: expected replacement once, found {count}")
    return text.replace(old, new, 1)


pipeline = root / "app/src/main/java/at/austriao/resistorscanner/pipeline/ScannerPipeline.kt"
text = pipeline.read_text()
text = replace_once(
    text,
    "    private var consecutiveFailures = 0\n",
    "    private var consecutiveFailures = 0\n    private var livePreviewSnapshot: LiveResultPreviewSnapshot? = null\n",
    "pipeline snapshot field",
)
text = replace_once(
    text,
    """            } catch (t: Throwable) {
                _resultPreview.value = null
                stability.reset()
""",
    """            } catch (t: Throwable) {
                clearLiveResultPreview()
                stability.reset()
""",
    "pipeline live exception cleanup",
)
text = replace_once(
    text,
    """    private fun handleLiveSuccess(outcome: FrameOutcome.Success) {
        consecutiveFailures = 0
        if (bestOfEnabled) {
            resetVotesIfGeometryChanged(outcome.geometry)
            val progress = voteAggregator.add(outcome.decoded)
            _aggregationProgress.value = progress
            val displayed = progress.result ?: outcome.decoded
            _state.value = progress.result?.let { stateFor(it, outcome.geometry) }
                ?: ScanState.Reading(outcome.geometry, outcome.decoded)
            _resultPreview.value = ResultPreview.fromRectified(outcome.rectified, displayed)
            return
        }

        val observation = ScanObservation(
            decoded = outcome.decoded,
            centroidX = outcome.geometry.centroidX,
            centroidY = outcome.geometry.centroidY,
            scale = outcome.geometry.majorLength,
            geometryUsable = true,
        )
        val decision = stability.update(observation)
        val displayed = when (decision) {
            is StableDecision.Stable -> decision.result
            is StableDecision.Ambiguous -> decision.result
            null -> outcome.decoded
        }
        _state.value = when (decision) {
            is StableDecision.Stable -> ScanState.Stable(decision.result, outcome.geometry)
            is StableDecision.Ambiguous -> ScanState.Ambiguous(decision.result, outcome.geometry)
            null -> ScanState.Reading(outcome.geometry, outcome.decoded)
        }
        _resultPreview.value = ResultPreview.fromRectified(outcome.rectified, displayed)
    }

    private fun handleFailure(state: ScanState) {
""",
    """    private fun handleLiveSuccess(outcome: FrameOutcome.Success) {
        consecutiveFailures = 0
        if (bestOfEnabled) {
            resetVotesIfGeometryChanged(outcome.geometry)
            val progress = voteAggregator.add(outcome.decoded)
            _aggregationProgress.value = progress
            val aggregate = progress.result
            _state.value = aggregate?.let { stateFor(it, outcome.geometry) }
                ?: ScanState.Reading(outcome.geometry, outcome.decoded)
            if (aggregate != null) {
                updateLiveResultPreview(outcome.rectified, aggregate, outcome.geometry)
            } else {
                clearLiveResultPreview()
            }
            return
        }

        val observation = ScanObservation(
            decoded = outcome.decoded,
            centroidX = outcome.geometry.centroidX,
            centroidY = outcome.geometry.centroidY,
            scale = outcome.geometry.majorLength,
            geometryUsable = true,
        )
        val decision = stability.update(observation)
        _state.value = when (decision) {
            is StableDecision.Stable -> ScanState.Stable(decision.result, outcome.geometry)
            is StableDecision.Ambiguous -> ScanState.Ambiguous(decision.result, outcome.geometry)
            null -> ScanState.Reading(outcome.geometry, outcome.decoded)
        }
        when (decision) {
            is StableDecision.Stable -> updateLiveResultPreview(outcome.rectified, decision.result, outcome.geometry)
            is StableDecision.Ambiguous -> updateLiveResultPreview(outcome.rectified, decision.result, outcome.geometry)
            null -> clearLiveResultPreview()
        }
    }

    private fun updateLiveResultPreview(
        rectified: RectifiedResistor,
        decoded: DecodedBands,
        geometry: ResistorGeometry,
    ) {
        if (!LiveResultPreviewPolicy.shouldRefresh(
                previous = livePreviewSnapshot,
                decoded = decoded,
                centroidX = geometry.centroidX,
                centroidY = geometry.centroidY,
                scale = geometry.majorLength,
            )
        ) return

        _resultPreview.value = ResultPreview.fromRectified(rectified, decoded)
        livePreviewSnapshot = LiveResultPreviewPolicy.snapshot(
            decoded = decoded,
            centroidX = geometry.centroidX,
            centroidY = geometry.centroidY,
            scale = geometry.majorLength,
        )
    }

    private fun clearLiveResultPreview() {
        _resultPreview.value = null
        livePreviewSnapshot = null
    }

    private fun handleFailure(state: ScanState) {
""",
    "pipeline live preview update",
)
text = replace_once(
    text,
    """        _resultPreview.value = null
        _state.value = state
    }
""",
    """        clearLiveResultPreview()
        _state.value = state
    }
""",
    "pipeline failure cleanup",
)
text = replace_once(
    text,
    """    private fun resetInternal() {
        lastSegmentTimestampNs = Long.MIN_VALUE
        _resultPreview.value = null
""",
    """    private fun resetInternal() {
        lastSegmentTimestampNs = Long.MIN_VALUE
        clearLiveResultPreview()
""",
    "pipeline reset cleanup",
)
pipeline.write_text(text)

screen = root / "app/src/main/java/at/austriao/resistorscanner/ui/ScannerScreen.kt"
text = screen.read_text()
text = replace_once(
    text,
    """    onDismiss: () -> Unit,
) {
    ModalBottomSheet(onDismissRequest = onDismiss) {
""",
    """    onDismiss: () -> Unit,
) {
    var pendingMinimumDetectionConfidence by remember(minimumDetectionConfidence) {
        mutableStateOf(minimumDetectionConfidence)
    }

    ModalBottomSheet(onDismissRequest = onDismiss) {
""",
    "settings draft confidence",
)
text = replace_once(
    text,
    "                            \"Model confidence from the selected band count and colors.\",\n",
    "                            \"Confidence from the selected band count and colors; combined scans also include vote agreement.\",\n",
    "settings confidence copy",
)
text = replace_once(
    text,
    "                        \"${(minimumDetectionConfidence * 100).roundToInt()}%\",\n",
    "                        \"${(pendingMinimumDetectionConfidence * 100).roundToInt()}%\",\n",
    "settings confidence label",
)
text = replace_once(
    text,
    """                Slider(
                    value = minimumDetectionConfidence,
                    onValueChange = onMinimumDetectionConfidenceChange,
                    valueRange = 0.50f..0.95f,
                )
""",
    """                Slider(
                    value = pendingMinimumDetectionConfidence,
                    onValueChange = { pendingMinimumDetectionConfidence = it },
                    onValueChangeFinished = {
                        onMinimumDetectionConfidenceChange(pendingMinimumDetectionConfidence)
                    },
                    valueRange = 0.50f..0.95f,
                    steps = 8,
                )
""",
    "settings confidence slider",
)
screen.write_text(text)
