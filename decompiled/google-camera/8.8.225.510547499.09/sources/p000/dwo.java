package p000;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dwo implements dwn {

    /* JADX INFO: renamed from: a */
    private final ShapeDrawable f12790a;

    /* JADX INFO: renamed from: b */
    private float f12791b;

    public dwo(ShapeDrawable shapeDrawable) {
        this.f12790a = shapeDrawable;
    }

    @Override // p000.dwn
    /* JADX INFO: renamed from: a */
    public final void mo6824a(Canvas canvas) {
        float f = this.f12791b;
        if (f > 0.0f) {
            dxu.m6865a(canvas, this.f12790a, true, f, 0.0f, -1);
        }
    }

    @Override // p000.dwn
    /* JADX INFO: renamed from: b */
    public final void mo6825b(int i, int i2) {
        this.f12790a.setBounds(0, 0, i, i2);
    }

    @Override // p000.dwn
    /* JADX INFO: renamed from: c */
    public final void mo6826c(float f) {
        lku.m15669w(f > 0.0f);
        this.f12791b = f;
    }

    @Override // p000.dwn
    /* JADX INFO: renamed from: d */
    public final void mo6827d(float f) {
        this.f12790a.setAlpha((int) (f * 255.0f));
    }
}
