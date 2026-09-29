package p387t0;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import dm.C5207g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: t0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C9167s {

    /* JADX INFO: renamed from: a */
    public static Method f47695a;

    /* JADX INFO: renamed from: b */
    public static Method f47696b;

    /* JADX INFO: renamed from: c */
    public static boolean f47697c;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: a */
    public static void m17493a(Canvas canvas, boolean z10) {
        Method method;
        C5207g.m11111f(canvas, "canvas");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            C9168t.f47698a.m17494a(canvas, z10);
            return;
        }
        if (!f47697c) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f47695a = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f47696b = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f47695a = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f47696b = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = f47695a;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f47696b;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f47697c = true;
        }
        if (z10) {
            try {
                Method method4 = f47695a;
                if (method4 != null) {
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z10 || (method = f47696b) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }
}
