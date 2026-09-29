package p024b3;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: b3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1303j {
    /* JADX INFO: renamed from: a */
    public static boolean m4822a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    /* JADX INFO: renamed from: b */
    public static int m4823b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    /* JADX INFO: renamed from: c */
    public static void m4824c(PopupWindow popupWindow, boolean z10) {
        popupWindow.setOverlapAnchor(z10);
    }

    /* JADX INFO: renamed from: d */
    public static void m4825d(PopupWindow popupWindow, int i10) {
        popupWindow.setWindowLayoutType(i10);
    }
}
