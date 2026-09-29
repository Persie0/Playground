package p000;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;

/* JADX INFO: loaded from: classes.dex */
public abstract class s93 {

    /* JADX INFO: renamed from: a */
    public static final int[] f60554a = new int[2];

    /* JADX INFO: renamed from: b */
    public static final Rect f60555b = new Rect();

    /* JADX INFO: renamed from: a */
    public static final e28 m21165a(View view, View view2) {
        int[] iArr = f60554a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i2 - iArr[1];
        Rect rect = f60555b;
        view.getFocusedRect(rect);
        float f2 = (i - i3) + rect.left;
        return new e28(f2, rect.top + f, rect.width() + f2, f + rect.top + rect.height());
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m21166b(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof ViewTreeObserverOnGlobalLayoutListenerC0391c) {
            return ((ViewTreeObserverOnGlobalLayoutListenerC0391c) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    /* JADX INFO: renamed from: c */
    public static final Integer m21167c(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        return i == 2 ? 1 : null;
    }

    /* JADX INFO: renamed from: d */
    public static final o93 m21168d(int i) {
        if (i == 1) {
            return new o93(2);
        }
        if (i == 2) {
            return new o93(1);
        }
        if (i == 17) {
            return new o93(3);
        }
        if (i == 33) {
            return new o93(5);
        }
        if (i == 66) {
            return new o93(4);
        }
        if (i != 130) {
            return null;
        }
        return new o93(6);
    }
}
