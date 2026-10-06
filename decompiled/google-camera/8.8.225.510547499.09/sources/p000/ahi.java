package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahi {
    /* JADX INFO: renamed from: a */
    public static float m670a(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable th) {
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: b */
    public static float m671b(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable th) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: c */
    public static EdgeEffect m672c(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable th) {
            return new EdgeEffect(context);
        }
    }
}
