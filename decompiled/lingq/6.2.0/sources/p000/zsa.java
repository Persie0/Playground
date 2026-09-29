package p000;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zsa {
    /* JADX INFO: renamed from: a */
    public static CharSequence m25770a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m25771b(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m25772c(View view) {
        return view.isScreenReaderFocusable();
    }

    /* JADX INFO: renamed from: d */
    public static void m25773d(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    /* JADX INFO: renamed from: e */
    public static void m25774e(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* JADX INFO: renamed from: f */
    public static void m25775f(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
