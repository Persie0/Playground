package p386t;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.activity.result.C0204c;
import androidx.compose.p017ui.platform.C0682z0;
import dm.C5207g;

/* JADX INFO: renamed from: t.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9109a {

    /* JADX INFO: renamed from: a */
    public static final C9109a f47596a = new C9109a();

    /* JADX INFO: renamed from: a */
    public final EdgeEffect m17356a(Context context, AttributeSet attributeSet) {
        C5207g.m11111f(context, "context");
        try {
            C0204c.m864x();
            return C0682z0.m2514j(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m17357b(EdgeEffect edgeEffect) {
        C5207g.m11111f(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: c */
    public final float m17358c(EdgeEffect edgeEffect, float f3, float f10) {
        C5207g.m11111f(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.onPullDistance(f3, f10);
        } catch (Throwable unused) {
            edgeEffect.onPull(f3, f10);
            return 0.0f;
        }
    }
}
