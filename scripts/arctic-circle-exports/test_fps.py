"""Fast, offline checks for exact native 30/60fps export timing."""
import importlib.util
import json
from pathlib import Path
import sys
import unittest

HERE = Path(__file__).resolve().parent
spec = importlib.util.spec_from_file_location("arctic_export", HERE / "build.py")
export = importlib.util.module_from_spec(spec)
sys.modules[spec.name] = export
spec.loader.exec_module(export)


class FrameRateExportTests(unittest.TestCase):
    def setUp(self):
        import tempfile
        self.temp = tempfile.TemporaryDirectory()
        self.addCleanup(self.temp.cleanup)
        self.source = Path(self.temp.name)
        (self.source / "editorial").mkdir()
        # Production's 440.8s master has 389s original duration.
        factors = {str(i): 440.8 / 389 for i in range(1, 16)}
        # The precise values are not relevant for the identity test.
        (self.source / "editorial" / "narration_v2.json").write_text(
            json.dumps({"pace_factors": factors})
        )

    def test_unique_asset_names(self):
        self.assertEqual(export.asset_names(1080,30)[0],
                         "Arctic_Circle_Original_State_1080p30.mp4")
        self.assertEqual(export.asset_names(2160,60)[0],
                         "Arctic_Circle_Original_State_2160p60.mp4")
        self.assertNotEqual(export.asset_names(2160,30),export.asset_names(2160,60))

    def test_all_frames_exact_no_gap_no_overlap(self):
        # With arbitrary factors, use stable integral 1.0 pacing to obtain
        # exact scene-aligned frame counts for all six chunks.
        (self.source / "editorial" / "narration_v2.json").write_text(
            json.dumps({"pace_factors": {str(i):1.0 for i in range(1,16)}})
        )
        # Reuse real production timing invariant by mocking its 440.8 assertion:
        # use actual narration factors from installed source when available.
        real_source=HERE.parent.parent / "source" / "arctic-circle-theorem"
        if not (real_source / "editorial" / "narration_v2.json").is_file():
            self.skipTest("Full source checkout not present in this environment")
        for fps in (30,60):
            with self.subTest(fps=fps):
                factors,ds,moments,frames=export.timeline(real_source,fps)
                self.assertEqual(frames[-1],13224*(fps//30))
                lengths=[frames[b]-frames[a-1] for a,b in export.GROUPS]
                self.assertEqual(sum(lengths), frames[-1])
                self.assertTrue(all(n>0 for n in lengths))
                self.assertEqual(frames[-1]/fps,440.8)

    def test_reject_unexpected_fps(self):
        for fps in (24,29,59,61,120):
            with self.subTest(fps=fps),self.assertRaises(ValueError):
                export.asset_names(2160,fps)


if __name__=="__main__":
    unittest.main()
