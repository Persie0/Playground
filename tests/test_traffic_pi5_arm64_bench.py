import importlib.util
import json
import tempfile
import unittest
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
HARNESS = ROOT / "benchmarks" / "traffic_pi5_arm64_bench.py"
WORKFLOW = ROOT / ".github" / "workflows" / "traffic-pi5-arm64-bench.yml"


def load_harness():
    if not HARNESS.exists():
        raise AssertionError(f"benchmark harness missing: {HARNESS}")
    spec = importlib.util.spec_from_file_location("traffic_pi5_arm64_bench", HARNESS)
    module = importlib.util.module_from_spec(spec)
    assert spec.loader is not None
    spec.loader.exec_module(module)
    return module


class TrafficPi5Arm64BenchTests(unittest.TestCase):
    def test_summary_reports_median_p95_and_count(self):
        bench = load_harness()
        summary = bench.summarize_ms([1.0, 2.0, 3.0, 4.0, 5.0])
        self.assertEqual(summary["count"], 5)
        self.assertEqual(summary["median_ms"], 3.0)
        self.assertEqual(summary["p95_ms"], 5.0)

    def test_speedup_is_baseline_over_optimized(self):
        bench = load_harness()
        self.assertEqual(bench.speedup(20.0, 5.0), 4.0)

    def test_write_json_creates_machine_readable_result(self):
        bench = load_harness()
        payload = {"architecture": "aarch64", "checks": {"equivalent": True}}
        with tempfile.TemporaryDirectory() as td:
            path = Path(td) / "result.json"
            bench.write_json(path, payload)
            self.assertEqual(json.loads(path.read_text()), payload)

    def test_workflow_fetches_lfs_models_for_both_checkouts(self):
        workflow = WORKFLOW.read_text(encoding="utf-8")
        self.assertGreaterEqual(workflow.count("lfs: true"), 2)

    def test_workflow_does_not_let_tee_mask_benchmark_failures(self):
        workflow = WORKFLOW.read_text(encoding="utf-8")
        self.assertIn("set -o pipefail", workflow)


if __name__ == "__main__":
    unittest.main()
