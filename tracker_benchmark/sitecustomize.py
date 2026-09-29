"""Compatibility shim for BoxMOT 25's TrackerSpec-only create_tracker API.

The benchmark harness intentionally uses a common create_tracker(name, **options)
shape. BoxMOT 25.0.0 requires an immutable TrackerSpec instead, so adapt only the
benchmark process without modifying the installed package.
"""
from __future__ import annotations

try:
    import boxmot
    from boxmot.trackers import TrackerSpec

    _create_tracker = boxmot.create_tracker

    def _compat_create_tracker(name, *, backend="python", geometry="aabb", per_class=False, **options):
        if not isinstance(name, str):
            return _create_tracker(name)
        spec = TrackerSpec(
            name=name,
            backend=backend,
            geometry=geometry,
            per_class=per_class,
            options=tuple(sorted(options.items())),
        )
        return _create_tracker(spec)

    boxmot.create_tracker = _compat_create_tracker
except Exception:
    # Non-BoxMOT workers must remain importable even if BoxMOT itself is absent.
    pass
