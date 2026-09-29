package p000;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: bo */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0818bo {
    /* JADX INFO: renamed from: a */
    public static EdgeEffect m3990a(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* JADX INFO: renamed from: b */
    public static float m3991b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: c */
    public static float m3992c(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}
