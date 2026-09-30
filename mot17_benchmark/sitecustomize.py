"""Compatibility shims for the MOT17 benchmark dependencies."""
from __future__ import annotations

# TrackEval still uses NumPy aliases removed in modern NumPy releases.
try:
    import numpy as np

    if not hasattr(np, "float"):
        np.float = float  # type: ignore[attr-defined]
    if not hasattr(np, "int"):
        np.int = int  # type: ignore[attr-defined]
except Exception:
    pass

# BoxMOT 25 exposes create_tracker through TrackerSpec rather than the older
# string + keyword API used by the existing benchmark adapter.
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
    pass
