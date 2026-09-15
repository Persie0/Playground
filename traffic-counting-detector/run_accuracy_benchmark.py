from __future__ import annotations

import accuracy_benchmark as benchmark


def configure_official_coco_transport() -> None:
    """Use COCO's official HTTP endpoints when the HTTPS certificate is invalid on hosted runners."""
    if benchmark.COCO_ANNOTATIONS_URL.startswith("https://images.cocodataset.org/"):
        benchmark.COCO_ANNOTATIONS_URL = benchmark.COCO_ANNOTATIONS_URL.replace("https://", "http://", 1)
    if benchmark.COCO_IMAGE_BASE_URL.startswith("https://images.cocodataset.org/"):
        benchmark.COCO_IMAGE_BASE_URL = benchmark.COCO_IMAGE_BASE_URL.replace("https://", "http://", 1)


def main() -> None:
    configure_official_coco_transport()
    benchmark.main()


if __name__ == "__main__":
    main()
