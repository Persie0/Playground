package p024b3;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.activity.result.C0204c;
import androidx.compose.p017ui.platform.C0682z0;

/* JADX INFO: renamed from: b3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1298e {

    /* JADX INFO: renamed from: b3.e$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m4811a(EdgeEffect edgeEffect, float f3, float f10) {
            edgeEffect.onPull(f3, f10);
        }
    }

    /* JADX INFO: renamed from: b3.e$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static EdgeEffect m4812a(Context context, AttributeSet attributeSet) {
            try {
                C0204c.m864x();
                return C0682z0.m2514j(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* JADX INFO: renamed from: b */
        public static float m4813b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* JADX INFO: renamed from: c */
        public static float m4814c(EdgeEffect edgeEffect, float f3, float f10) {
            try {
                return edgeEffect.onPullDistance(f3, f10);
            } catch (Throwable unused) {
                edgeEffect.onPull(f3, f10);
                return 0.0f;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static float m4809a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m4813b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: b */
    public static float m4810b(EdgeEffect edgeEffect, float f3, float f10) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m4814c(edgeEffect, f3, f10);
        }
        a.m4811a(edgeEffect, f3, f10);
        return f3;
    }
}
