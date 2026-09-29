package p000;

import android.transition.Transition;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xw5 {
    /* JADX INFO: renamed from: a */
    public static void m24726a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    /* JADX INFO: renamed from: b */
    public static void m24727b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
