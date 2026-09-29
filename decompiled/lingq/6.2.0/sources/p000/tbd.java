package p000;

import android.os.Build;
import android.view.Window;
import android.widget.EdgeEffect;
import curtains.internal.WindowCallbackC2901b;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tbd {
    /* JADX INFO: renamed from: a */
    public static float m21943a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return jo2.m14568b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: b */
    public static C3329mb m21944b(Window window) {
        C3329mb c3329mb;
        synchronized (WindowCallbackC2901b.f34577f) {
            try {
                WeakHashMap weakHashMap = WindowCallbackC2901b.f34576e;
                WeakReference weakReference = (WeakReference) weakHashMap.get(window);
                WindowCallbackC2901b windowCallbackC2901b = weakReference != null ? (WindowCallbackC2901b) weakReference.get() : null;
                if (windowCallbackC2901b != null) {
                    return windowCallbackC2901b.f34579b;
                }
                Window.Callback callback = window.getCallback();
                if (callback == null) {
                    c3329mb = new C3329mb(17);
                } else {
                    WindowCallbackC2901b windowCallbackC2901b2 = new WindowCallbackC2901b(callback);
                    window.setCallback(windowCallbackC2901b2);
                    weakHashMap.put(window, new WeakReference(windowCallbackC2901b2));
                    c3329mb = windowCallbackC2901b2.f34579b;
                }
                return c3329mb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static float m21945c(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return jo2.m14569c(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }
}
