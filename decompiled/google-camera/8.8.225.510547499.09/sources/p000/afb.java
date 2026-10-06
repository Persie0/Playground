package p000;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class afb {
    /* JADX INFO: renamed from: a */
    public static int m420a(View view) {
        return view.getImportantForAccessibility();
    }

    /* JADX INFO: renamed from: b */
    public static int m421b(View view) {
        return view.getMinimumHeight();
    }

    /* JADX INFO: renamed from: c */
    public static int m422c(View view) {
        return view.getMinimumWidth();
    }

    /* JADX INFO: renamed from: d */
    public static int m423d(View view) {
        return view.getWindowSystemUiVisibility();
    }

    /* JADX INFO: renamed from: e */
    static ViewParent m424e(View view) {
        return view.getParentForAccessibility();
    }

    /* JADX INFO: renamed from: f */
    static AccessibilityNodeProvider m425f(View view) {
        return view.getAccessibilityNodeProvider();
    }

    /* JADX INFO: renamed from: g */
    public static void m426g(View view) {
        view.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: h */
    static void m427h(View view, int i, int i2, int i3, int i4) {
        view.postInvalidateOnAnimation(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: i */
    public static void m428i(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* JADX INFO: renamed from: j */
    public static void m429j(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    /* JADX INFO: renamed from: k */
    static void m430k(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* JADX INFO: renamed from: l */
    static void m431l(View view) {
        view.requestFitSystemWindows();
    }

    /* JADX INFO: renamed from: m */
    public static void m432m(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* JADX INFO: renamed from: n */
    public static void m433n(View view, boolean z) {
        view.setHasTransientState(z);
    }

    /* JADX INFO: renamed from: o */
    public static void m434o(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m435p(View view) {
        return view.getFitsSystemWindows();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m436q(View view) {
        return view.hasOverlappingRendering();
    }

    /* JADX INFO: renamed from: r */
    public static boolean m437r(View view) {
        return view.hasTransientState();
    }

    /* JADX INFO: renamed from: s */
    static boolean m438s(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    /* JADX INFO: renamed from: t */
    public static final void m439t(HashMap map, oni oniVar) {
        map.getClass();
        oniVar.getClass();
        HashMap map2 = new HashMap(999);
        int i = 0;
        for (Object obj : map.keySet()) {
            obj.getClass();
            map2.put(obj, map.get(obj));
            i++;
            if (i == 999) {
                oniVar.mo1803a(map2);
                map2.clear();
                i = 0;
            }
        }
        if (i > 0) {
            oniVar.mo1803a(map2);
        }
    }
}
