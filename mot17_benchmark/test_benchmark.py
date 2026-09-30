from io import StringIO
from pathlib import Path

import numpy as np

from benchmark import mot_detections, write_mot_line


def test_mot_detections_filters_low_confidence(tmp_path: Path):
    p = tmp_path / "det.txt"
    p.write_text(
        "1,-1,10,20,30,40,0.90,-1,-1,-1\n"
        "1,-1,1,2,3,4,0.05,-1,-1,-1\n"
        "2,-1,5,6,0,9,0.80,-1,-1,-1\n"
    )
    out = mot_detections(p)
    assert list(out) == [1]
    box, conf, cls = out[1][0]
    np.testing.assert_allclose(box, [10, 20, 40, 60])
    assert conf == 0.90
    assert cls == 0


def test_write_mot_line_converts_xyxy_to_xywh():
    f = StringIO()
    write_mot_line(f, 7, 42, np.asarray([10, 20, 40, 60], dtype=np.float32))
    assert f.getvalue() == "7,42,10.000,20.000,30.000,40.000,1,-1,-1,-1\n"
