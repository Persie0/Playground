package p000;

import android.app.Activity;
import android.graphics.Rect;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: eu */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0169eu {
    /* JADX INFO: renamed from: a */
    static OnBackInvokedCallback m7871a(Object obj, LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd) {
        layoutInflaterFactory2C0179fd.getClass();
        C0853nl c0853nl = new C0853nl(layoutInflaterFactory2C0179fd, 1);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, c0853nl);
        return c0853nl;
    }

    /* JADX INFO: renamed from: b */
    static OnBackInvokedDispatcher m7872b(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: c */
    static void m7873c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: d */
    public static void m7874d(Rect rect, Rect rect2) {
        if (rect.isEmpty()) {
            return;
        }
        int iCenterX = rect.centerX();
        int iCenterY = rect.centerY();
        if (!rect.intersect(rect2)) {
            rect.setEmpty();
            return;
        }
        m7876f(rect, rect);
        int iCenterX2 = iCenterX - rect.centerX();
        int iCenterY2 = iCenterY - rect.centerY();
        rect.offset(iCenterX2, iCenterY2);
        if (rect2.contains(rect)) {
            return;
        }
        rect.offset(-iCenterX2, -iCenterY2);
    }

    /* JADX INFO: renamed from: e */
    public static void m7875e(Rect rect, Rect rect2) {
        rect.set(rect2.left, (rect2.top + rect2.bottom) / 2, rect2.right, rect2.bottom);
    }

    /* JADX INFO: renamed from: f */
    public static void m7876f(Rect rect, Rect rect2) {
        int iMin = Math.min(rect2.width(), rect2.height()) / 2;
        rect.set(rect2.centerX() - iMin, rect2.centerY() - iMin, rect2.centerX() + iMin, rect2.centerY() + iMin);
    }

    /* JADX INFO: renamed from: g */
    public static void m7877g(Rect rect, Rect rect2) {
        if (rect2.width() < rect2.height()) {
            rect.setEmpty();
        } else {
            rect.set(rect2.left, rect2.top, rect2.left + rect2.height(), rect2.bottom);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m7878h(Rect rect, Rect rect2) {
        if (rect2.width() < rect2.height()) {
            rect.set(rect2);
        } else {
            rect.set(rect2.left + rect2.height(), rect2.top, rect2.right, rect2.bottom);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m7879i(Rect rect, Rect rect2) {
        rect.set(rect2.left, rect2.top, rect2.right, (rect2.top + rect2.bottom) / 2);
    }

    /* JADX INFO: renamed from: j */
    public static void m7880j(Rect rect, Rect rect2, float f) {
        rect.set(rect2);
        float f2 = 0.5f - (f / 2.0f);
        rect.inset((int) (rect.width() * f2), (int) (rect.height() * f2));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m7881k(Rect rect) {
        float fWidth = rect.width();
        float fHeight = rect.height();
        return fWidth > fHeight + fHeight;
    }
}
