package p000;

import android.graphics.PointF;
import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gsv {
    /* JADX INFO: renamed from: a */
    public static final PointF m9713a(PointF pointF, Rect rect, Rect rect2) {
        return new PointF(m9716d(pointF.x, rect, rect2), m9717e(pointF.y, rect, rect2));
    }

    /* JADX INFO: renamed from: b */
    public static final Rect m9714b(Rect rect, Rect rect2, Rect rect3) {
        return new Rect(Math.round(m9716d(rect.left, rect2, rect3)), Math.round(m9717e(rect.top, rect2, rect3)), Math.round(m9716d(rect.right, rect2, rect3)), Math.round(m9717e(rect.bottom, rect2, rect3)));
    }

    /* JADX INFO: renamed from: d */
    private static final float m9716d(float f, Rect rect, Rect rect2) {
        return ((f - rect.left) * rect2.width()) / rect.width();
    }

    /* JADX INFO: renamed from: e */
    private static final float m9717e(float f, Rect rect, Rect rect2) {
        return ((f - rect.top) * rect2.height()) / rect.height();
    }
}
