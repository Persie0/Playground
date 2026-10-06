package p000;

import android.graphics.Rect;
import android.view.View;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: nw */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0864nw {

    /* JADX INFO: renamed from: a */
    public static Method f44818a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f44818a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f44818a.setAccessible(true);
        } catch (NoSuchMethodException e) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m17748a(View view) {
        return afc.m442c(view) == 1;
    }
}
