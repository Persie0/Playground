package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: androidx.appcompat.widget.h1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0318h1 {

    /* JADX INFO: renamed from: a */
    public static final Method f1215a;

    /* JADX INFO: renamed from: b */
    public static final boolean f1216b;

    static {
        f1216b = Build.VERSION.SDK_INT >= 27;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f1215a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1200a(View view) {
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        return C10029b0.e.m18686d(view) == 1;
    }
}
