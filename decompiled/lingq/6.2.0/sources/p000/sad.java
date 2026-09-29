package p000;

import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sad {
    /* JADX INFO: renamed from: a */
    public static float m21188a(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    /* JADX INFO: renamed from: b */
    public static float m21189b(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    /* JADX INFO: renamed from: c */
    public static final StackTraceElement m21190c(BaseContinuationImpl baseContinuationImpl) {
        int iIntValue;
        String strM4290c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        c32 c32Var = (c32) baseContinuationImpl.getClass().getAnnotation(c32.class);
        String str = null;
        if (c32Var == null || c32Var.m4294v() < 1) {
            return null;
        }
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? c32Var.m4292l()[iIntValue] : -1;
        sq5 sq5Var = pk9.f56360e;
        sq5 sq5Var2 = pk9.f56361f;
        if (sq5Var2 == null) {
            try {
                sq5 sq5Var3 = new sq5(Class.class.getDeclaredMethod("getModule", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 2);
                pk9.f56361f = sq5Var3;
                sq5Var2 = sq5Var3;
            } catch (Exception unused2) {
                pk9.f56361f = sq5Var;
                sq5Var2 = sq5Var;
            }
        }
        if (sq5Var2 != sq5Var && (method = (Method) sq5Var2.f61248b) != null && (objInvoke = method.invoke(baseContinuationImpl.getClass(), null)) != null && (method2 = (Method) sq5Var2.f61249c) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) sq5Var2.f61250d;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strM4290c = c32Var.m4290c();
        } else {
            strM4290c = str + '/' + c32Var.m4290c();
        }
        return new StackTraceElement(strM4290c, c32Var.m4293m(), c32Var.m4291f(), i);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m21191d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
