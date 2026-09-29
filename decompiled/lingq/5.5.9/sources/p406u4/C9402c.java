package p406u4;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: u4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9402c {

    /* JADX INFO: renamed from: a */
    public static Method f48220a;

    /* JADX INFO: renamed from: b */
    public static Method f48221b;

    /* JADX INFO: renamed from: c */
    public static boolean f48222c;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: a */
    public static void m17759a(Canvas canvas, boolean z10) {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            if (z10) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (i10 == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!f48222c) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f48220a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                f48221b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f48222c = true;
        }
        if (z10) {
            try {
                Method method2 = f48220a;
                if (method2 != null) {
                    method2.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
        if (!z10 && (method = f48221b) != null) {
            method.invoke(canvas, new Object[0]);
        }
    }
}
