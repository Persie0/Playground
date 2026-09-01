#!/usr/bin/env python3
"""Black-box scientific contracts for the private intersection pipeline.

The checks intentionally print only stable issue IDs. Private source code,
tracebacks, database contents, and generated artifacts are never emitted by
the public CI job.
"""

from __future__ import annotations

from pathlib import Path
import tempfile

import numpy as np

from intersection_analytics.autocalibration import ScaleCue, fuse_scale_cues
from intersection_analytics.calibration import CalibrationError, HomographyCalibration
from intersection_analytics.heatmap import MetricGridSpec, OccupancyGrid
from intersection_analytics.models import (
    Gate,
    Observation,
    RoadUserClass,
    TrackPoint,
    WaitEvent,
)
from intersection_analytics.movements import MovementAnalyzer
from intersection_analytics.scene_automation import (
    AutomaticSceneConfig,
    AutomaticTrajectorySceneDiscovery,
)
from intersection_analytics.store import AnalyticsStore


class ContractFailure(AssertionError):
    pass


def require(condition: bool) -> None:
    if not condition:
        raise ContractFailure


def ia001_visual_scale_rejection_is_total() -> None:
    result = fuse_scale_cues(
        (
            ScaleCue("visual-family-a", 1.0, 2.0, "family-a"),
            ScaleCue("visual-family-b", 5.0, 2.0, "family-b"),
        )
    )
    require(result.status == "inconsistent")
    require(result.hard_anchor_present is False)


def ia002_quality_labels_are_truthful_without_holdouts() -> None:
    calibration = HomographyCalibration.fit(
        ((0, 0), (100, 0), (100, 100), (0, 100)),
        ((0, 0), (10, 0), (10, 10), (0, 10)),
    )
    require(
        calibration.quality.validation_point_count > 0
        or calibration.quality.error_basis != "measured_holdout"
    )


def ia003_od_crossings_reject_long_unobserved_gaps() -> None:
    west = Gate("west", 0, -5, 0, 5, 1, 0)
    east = Gate("east", 10, -5, 10, 5, -1, 0)
    points = [
        TrackPoint("run", "car:1", RoadUserClass.MOTOR_VEHICLE, 0.0, -2.0, 0.0),
        TrackPoint("run", "car:1", RoadUserClass.MOTOR_VEHICLE, 0.1, 2.0, 0.0),
        TrackPoint("run", "car:1", RoadUserClass.MOTOR_VEHICLE, 0.2, 8.0, 0.0),
        TrackPoint("run", "car:1", RoadUserClass.MOTOR_VEHICLE, 30.0, 12.0, 0.0),
    ]
    require(MovementAnalyzer([west, east]).analyze(points) is None)


def ia004_wait_grid_stores_seconds_per_occupied_cell() -> None:
    event = WaitEvent(
        "run",
        "car:1",
        RoadUserClass.MOTOR_VEHICLE,
        0.0,
        10.0,
        5.0,
        5.0,
    )
    maxima = []
    for cell_size in (1.0, 0.5, 0.25):
        grid = OccupancyGrid(MetricGridSpec(0, 0, 10, 10, cell_size_m=cell_size))
        grid.add_wait_event(event)
        maxima.append(float(np.max(grid.wait_seconds)))
    require(all(np.isclose(value, event.duration_s) for value in maxima))


def ia005_reprojection_cannot_silently_mix_calibrations() -> None:
    first = HomographyCalibration.fit(
        ((0, 0), (10, 0), (10, 10), (0, 10)),
        ((0, 0), (10, 0), (10, 10), (0, 10)),
    )
    second = HomographyCalibration.fit(
        ((0, 0), (10, 0), (10, 10), (0, 10)),
        ((0, 0), (20, 0), (20, 20), (0, 20)),
    )
    with tempfile.TemporaryDirectory() as directory:
        with AnalyticsStore(Path(directory) / "audit.sqlite3") as store:
            store.add_observations(
                [
                    Observation(
                        "run",
                        "car:1",
                        RoadUserClass.MOTOR_VEHICLE,
                        1,
                        0.0,
                        1.0,
                        1.0,
                    )
                ]
            )
            require(store.project_observations(first, run_id="run") == 1)
            try:
                changed = store.project_observations(second, run_id="run")
            except CalibrationError:
                return
            row = store.connection.execute(
                "SELECT world_x_m, world_y_m FROM observations WHERE run_id='run'"
            ).fetchone()
            require(changed == 1 and np.allclose(row, (2.0, 2.0)))


def ia006_temporal_scene_splits_reestimate_roi() -> None:
    class CountingDiscovery(AutomaticTrajectorySceneDiscovery):
        def __init__(self, config: AutomaticSceneConfig):
            super().__init__(config)
            self.roi_fit_calls = 0

        def _infer_roi(self, tracks: dict[str, list[TrackPoint]]):
            self.roi_fit_calls += 1
            return super()._infer_roi(tracks)

    tracks: dict[str, list[TrackPoint]] = {}
    for index in range(80):
        family = index % 4
        values = np.linspace(-12.0, 12.0, 21)
        lateral = (index % 5 - 2) * 0.18
        if family == 0:
            coordinates = [(value, lateral) for value in values]
        elif family == 1:
            coordinates = [(-value, lateral) for value in values]
        elif family == 2:
            coordinates = [(lateral, value) for value in values]
        else:
            coordinates = [(lateral, -value) for value in values]
        start = index * 55.0
        tracks[str(index)] = [
            TrackPoint(
                "run",
                str(index),
                RoadUserClass.MOTOR_VEHICLE,
                start + point_index * 0.20,
                x,
                y,
            )
            for point_index, (x, y) in enumerate(coordinates)
        ]
    discovery = CountingDiscovery(
        AutomaticSceneConfig(
            min_complete_tracks=40,
            min_calibration_duration_s=1800.0,
            min_gate_support=4,
            max_split_gate_shift_m=0.6,
        )
    )
    proposal = discovery.propose(tracks)
    require(proposal.status == "accepted_automatic")
    require(discovery.roi_fit_calls >= 3)


def ia007_stored_calibration_quality_is_revalidated() -> None:
    payload = """{
      "matrix": [[1, 0, 0], [0, 1, 0], [0, 0, 1]],
      "quality": {
        "rmse_m": 9.0,
        "p95_m": 12.0,
        "max_error_m": 15.0,
        "inlier_ratio": 0.1,
        "control_point_count": 4,
        "validation_point_count": 0,
        "error_basis": "measured_holdout"
      },
      "source_space": "rectified_image_px",
      "world_unit": "metre",
      "method": "ground_control_points",
      "support_world_polygon": [[0, 0], [10, 0], [10, 10], [0, 10]]
    }"""
    with tempfile.TemporaryDirectory() as directory:
        path = Path(directory) / "bad-calibration.json"
        path.write_text(payload, encoding="utf-8")
        try:
            HomographyCalibration.load(path)
        except CalibrationError:
            return
    raise ContractFailure


CHECKS = (
    ("IA-001", ia001_visual_scale_rejection_is_total),
    ("IA-002", ia002_quality_labels_are_truthful_without_holdouts),
    ("IA-003", ia003_od_crossings_reject_long_unobserved_gaps),
    ("IA-004", ia004_wait_grid_stores_seconds_per_occupied_cell),
    ("IA-005", ia005_reprojection_cannot_silently_mix_calibrations),
    ("IA-006", ia006_temporal_scene_splits_reestimate_roi),
    ("IA-007", ia007_stored_calibration_quality_is_revalidated),
)


def main() -> int:
    failures: list[tuple[str, str]] = []
    for check_id, check in CHECKS:
        try:
            check()
        except Exception as exc:  # noqa: BLE001 - CI must conceal private tracebacks.
            failures.append((check_id, type(exc).__name__))
            print(f"FAIL: {check_id} ({type(exc).__name__})")
        else:
            print(f"PASS: {check_id}")
    print(f"Scientific contracts: {len(CHECKS) - len(failures)}/{len(CHECKS)} passed")
    return 1 if failures else 0


if __name__ == "__main__":
    raise SystemExit(main())
