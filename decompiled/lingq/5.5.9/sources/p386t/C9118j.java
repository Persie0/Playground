package p386t;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import dm.C5207g;

/* JADX INFO: renamed from: t.j */
/* JADX INFO: loaded from: classes.dex */
public final class C9118j {
    /* JADX INFO: renamed from: a */
    public static EdgeEffect m17360a(Context context) {
        C5207g.m11111f(context, "context");
        return Build.VERSION.SDK_INT >= 31 ? C9109a.f47596a.m17356a(context, null) : new C9124p(context);
    }

    /* JADX INFO: renamed from: b */
    public static float m17361b(EdgeEffect edgeEffect) {
        C5207g.m11111f(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return C9109a.f47596a.m17357b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public static void m17362c(EdgeEffect edgeEffect, float f3) {
        C5207g.m11111f(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            C9109a.f47596a.m17358c(edgeEffect, f3, 0.0f);
        } else {
            edgeEffect.onPull(f3, 0.0f);
        }
    }
}
