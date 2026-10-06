package p000;

import android.widget.PopupWindow;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahp {
    /* JADX INFO: renamed from: a */
    static int m681a(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    /* JADX INFO: renamed from: b */
    public static void m682b(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    /* JADX INFO: renamed from: c */
    public static void m683c(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }

    /* JADX INFO: renamed from: d */
    static boolean m684d(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }
}
