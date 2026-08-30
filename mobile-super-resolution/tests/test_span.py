import pytest

torch = pytest.importorskip("torch")

from mobile_sr import SPAN, SpanConfig


@pytest.mark.parametrize(("scale", "channels", "blocks"), [(2, 32, 4), (4, 48, 6)])
def test_span_output_shape(scale: int, channels: int, blocks: int) -> None:
    model = SPAN(SpanConfig(scale=scale, channels=channels, blocks=blocks)).eval()
    with torch.inference_mode():
        output = model(torch.rand(1, 3, 16, 16))
    assert output.shape == (1, 3, 16 * scale, 16 * scale)
    assert output.min() >= 0
    assert output.max() <= 1

