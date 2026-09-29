package p000;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yf5 {
    /* JADX INFO: renamed from: a */
    public static void m25114a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    /* JADX INFO: renamed from: b */
    public static void m25115b(PopupWindow popupWindow, boolean z) {
        popupWindow.setIsClippedToScreen(z);
    }
}
