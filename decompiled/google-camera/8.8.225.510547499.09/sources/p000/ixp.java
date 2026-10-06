package p000;

import android.graphics.Canvas;
import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ixp implements ixq {

    /* JADX INFO: renamed from: a */
    private final float f32599a;

    /* JADX INFO: renamed from: b */
    private final float f32600b;

    public ixp(float f, float f2) {
        this.f32599a = f;
        this.f32600b = f2;
    }

    /* JADX INFO: renamed from: c */
    private final float m11866c(Rect rect) {
        return (Math.min(rect.width() / 2, rect.height() / 2) - this.f32600b) - (this.f32599a / 2.0f);
    }

    @Override // p000.ixq
    /* JADX INFO: renamed from: a */
    public final void mo11864a(Rect rect, Canvas canvas, int i, float f) {
        float fM11866c = m11866c(rect);
        canvas.translate(rect.width() / 2.0f, rect.height() / 2.0f);
        canvas.rotate(-((i - f) * 6.6f));
        canvas.translate(0.0f, fM11866c);
    }

    @Override // p000.ixq
    /* JADX INFO: renamed from: b */
    public final void mo11865b(Rect rect, Canvas canvas) {
        float fM11866c = m11866c(rect);
        canvas.translate(0.0f, -fM11866c);
        canvas.rotate(-6.6f);
        canvas.translate(0.0f, fM11866c);
    }
}
