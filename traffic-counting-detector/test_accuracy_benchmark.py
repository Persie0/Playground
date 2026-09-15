from accuracy_benchmark import EvalBox, box_iou, match_boxes, recommend_model, transform_box


def test_box_iou_and_matching_are_one_to_one():
    gt = [
        EvalBox(0, 0, 10, 10),
        EvalBox(20, 20, 10, 10),
    ]
    predictions = [
        EvalBox(0, 0, 10, 10, score=0.9),
        EvalBox(1, 1, 10, 10, score=0.8),
        EvalBox(20, 20, 10, 10, score=0.7),
    ]

    assert box_iou(gt[0], gt[0]) == 1.0
    tp, fp, fn, iou_sum = match_boxes(predictions, gt, iou_threshold=0.5)

    assert (tp, fp, fn) == (2, 1, 0)
    assert iou_sum == 2.0


def test_transform_box_applies_letterbox_scale_and_padding():
    box = EvalBox(100, 50, 40, 20)
    transformed = transform_box(box, scale_x=0.5, scale_y=0.5, pad_x=10, pad_y=20)

    assert transformed.x == 60
    assert transformed.y == 45
    assert transformed.width == 20
    assert transformed.height == 10


def test_recommendation_uses_accuracy_with_twenty_percent_speed_budget():
    results = {
        "fast": {
            "average_detection_ms": 10.0,
            "macro_f1": 0.60,
            "macro_recall": 0.70,
        },
        "accurate_and_fast_enough": {
            "average_detection_ms": 11.9,
            "macro_f1": 0.72,
            "macro_recall": 0.75,
        },
        "too_slow": {
            "average_detection_ms": 13.0,
            "macro_f1": 0.90,
            "macro_recall": 0.90,
        },
    }

    assert recommend_model(results) == "accurate_and_fast_enough"
