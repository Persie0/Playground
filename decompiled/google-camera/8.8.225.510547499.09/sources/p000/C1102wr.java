package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: wr */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1102wr extends Drawable {

    /* JADX INFO: renamed from: a */
    private static final double f47964a = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a */
    public static float m19531a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = f;
        double d2 = 1.0d - f47964a;
        double d3 = f2;
        Double.isNaN(d3);
        Double.isNaN(d);
        return (float) (d + (d2 * d3));
    }

    /* JADX INFO: renamed from: b */
    public static float m19532b(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        if (!z) {
            return f3;
        }
        double d = 1.0d - f47964a;
        double d2 = f2;
        double d3 = f3;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return (float) (d3 + (d * d2));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }
}
