package p471x2;

import android.view.ViewGroup;

/* JADX INFO: renamed from: x2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C10040h {
    /* JADX INFO: renamed from: a */
    public static int m18807a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getLayoutDirection();
    }

    /* JADX INFO: renamed from: b */
    public static int m18808b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    /* JADX INFO: renamed from: c */
    public static int m18809c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m18810d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    /* JADX INFO: renamed from: e */
    public static void m18811e(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.resolveLayoutDirection(i10);
    }

    /* JADX INFO: renamed from: f */
    public static void m18812f(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.setLayoutDirection(i10);
    }

    /* JADX INFO: renamed from: g */
    public static void m18813g(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.setMarginEnd(i10);
    }

    /* JADX INFO: renamed from: h */
    public static void m18814h(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.setMarginStart(i10);
    }
}
