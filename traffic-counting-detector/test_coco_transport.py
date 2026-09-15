import accuracy_benchmark as benchmark
from run_accuracy_benchmark import configure_official_coco_transport


def test_configure_official_coco_transport_switches_broken_https_host_to_official_http(monkeypatch):
    monkeypatch.setattr(
        benchmark,
        "COCO_ANNOTATIONS_URL",
        "https://images.cocodataset.org/annotations/annotations_trainval2017.zip",
    )
    monkeypatch.setattr(
        benchmark,
        "COCO_IMAGE_BASE_URL",
        "https://images.cocodataset.org/val2017",
    )

    configure_official_coco_transport()

    assert benchmark.COCO_ANNOTATIONS_URL.startswith("http://images.cocodataset.org/")
    assert benchmark.COCO_IMAGE_BASE_URL.startswith("http://images.cocodataset.org/")
