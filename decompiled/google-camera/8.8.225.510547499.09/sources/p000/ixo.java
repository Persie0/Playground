package p000;

import android.graphics.Canvas;
import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ixo implements ixq {

    /* JADX INFO: renamed from: a */
    private final float f32596a;

    /* JADX INFO: renamed from: b */
    private final float f32597b;

    /* JADX INFO: renamed from: c */
    private final float f32598c;

    public ixo(float f, float f2, float f3) {
        this.f32596a = f2;
        this.f32597b = f;
        this.f32598c = f3;
    }

    @Override // p000.ixq
    /* JADX INFO: renamed from: a */
    public final void mo11864a(Rect rect, Canvas canvas, int i, float f) {
        canvas.translate((rect.width() / 2.0f) - ((f - i) * this.f32596a), (rect.height() - this.f32598c) - (this.f32597b / 2.0f));
    }

    @Override // p000.ixq
    /* JADX INFO: renamed from: b */
    public final void mo11865b(Rect rect, Canvas canvas) {
        canvas.translate(this.f32596a, 0.0f);
    }
}
