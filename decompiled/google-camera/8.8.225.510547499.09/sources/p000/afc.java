package p000;

import android.graphics.Paint;
import android.view.Display;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class afc {
    /* JADX INFO: renamed from: a */
    public static int m440a() {
        return View.generateViewId();
    }

    /* JADX INFO: renamed from: b */
    static int m441b(View view) {
        return view.getLabelFor();
    }

    /* JADX INFO: renamed from: c */
    public static int m442c(View view) {
        return view.getLayoutDirection();
    }

    /* JADX INFO: renamed from: d */
    public static int m443d(View view) {
        return view.getPaddingEnd();
    }

    /* JADX INFO: renamed from: e */
    public static int m444e(View view) {
        return view.getPaddingStart();
    }

    /* JADX INFO: renamed from: f */
    public static Display m445f(View view) {
        return view.getDisplay();
    }

    /* JADX INFO: renamed from: g */
    static void m446g(View view, int i) {
        view.setLabelFor(i);
    }

    /* JADX INFO: renamed from: h */
    static void m447h(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    /* JADX INFO: renamed from: i */
    static void m448i(View view, int i) {
        view.setLayoutDirection(i);
    }

    /* JADX INFO: renamed from: j */
    public static void m449j(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m450k(View view) {
        return view.isPaddingRelative();
    }

    /* JADX INFO: renamed from: l */
    public static final StringBuilder m451l() {
        return new StringBuilder();
    }

    /* JADX INFO: renamed from: m */
    public static final void m452m(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }
}
