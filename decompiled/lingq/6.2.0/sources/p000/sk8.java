package p000;

import android.app.Activity;
import android.graphics.Rect;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sk8 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60957a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tk8 f60958b;

    public /* synthetic */ sk8(tk8 tk8Var, int i) {
        this.f60957a = i;
        this.f60958b = tk8Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006a  */
    /* JADX WARN: Code duplicated, block: B:25:0x009f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0116  */
    /* JADX WARN: Code duplicated, block: B:51:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e7  */
    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() throws NoSuchMethodException, ClassNotFoundException {
        boolean z;
        int i = this.f60957a;
        Class cls = Integer.TYPE;
        Class<?> cls2 = null;
        boolean z2 = false;
        tk8 tk8Var = this.f60958b;
        switch (i) {
            case 0:
                Class<?> clsLoadClass = ((ClassLoader) tk8Var.f62457c.f9881a).loadClass("androidx.window.extensions.WindowExtensions");
                clsLoadClass.getClass();
                Method method = clsLoadClass.getMethod("getWindowLayoutComponent", null);
                Class<?> clsLoadClass2 = tk8Var.f62455a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                clsLoadClass2.getClass();
                method.getClass();
                return Boolean.valueOf(Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(clsLoadClass2));
            case 1:
                Class<?> clsLoadClass3 = tk8Var.f62455a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                clsLoadClass3.getClass();
                Method method2 = clsLoadClass3.getMethod("getBounds", null);
                Method method3 = clsLoadClass3.getMethod("getType", null);
                Method method4 = clsLoadClass3.getMethod("getState", null);
                method2.getClass();
                Class cls3 = y38.m24933a(Rect.class).f70781a;
                cls3.getClass();
                if (method2.getReturnType().equals(cls3) && Modifier.isPublic(method2.getModifiers())) {
                    method3.getClass();
                    Class cls4 = y38.m24933a(cls).f70781a;
                    cls4.getClass();
                    if (method3.getReturnType().equals(cls4) && Modifier.isPublic(method3.getModifiers())) {
                        method4.getClass();
                        Class cls5 = y38.m24933a(cls).f70781a;
                        cls5.getClass();
                        z = method4.getReturnType().equals(cls5) && Modifier.isPublic(method4.getModifiers());
                    }
                }
                return Boolean.valueOf(z);
            case 2:
                ClassLoader classLoader = tk8Var.f62455a;
                Class<?> clsLoadClass4 = classLoader.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
                clsLoadClass4.getClass();
                Method method5 = clsLoadClass4.getMethod("getDisplayFoldFeatures", null);
                Type genericReturnType = method5.getGenericReturnType();
                genericReturnType.getClass();
                Type type = ((ParameterizedType) genericReturnType).getActualTypeArguments()[0];
                type.getClass();
                Class cls6 = (Class) type;
                if (Modifier.isPublic(method5.getModifiers()) && method5.getReturnType().equals(List.class)) {
                    Class<?> clsLoadClass5 = classLoader.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                    clsLoadClass5.getClass();
                    z = cls6.equals(clsLoadClass5);
                }
                return Boolean.valueOf(z);
            case 3:
                Class<?> clsLoadClass6 = tk8Var.f62455a.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                clsLoadClass6.getClass();
                Method method6 = clsLoadClass6.getMethod("getType", null);
                Method method7 = clsLoadClass6.getMethod("hasProperty", cls);
                Method method8 = clsLoadClass6.getMethod("hasProperties", int[].class);
                method6.getClass();
                if (Modifier.isPublic(method6.getModifiers())) {
                    cls.getClass();
                    if (method6.getReturnType().equals(cls)) {
                        method7.getClass();
                        if (Modifier.isPublic(method7.getModifiers())) {
                            Class cls7 = Boolean.TYPE;
                            cls7.getClass();
                            if (method7.getReturnType().equals(cls7)) {
                                method8.getClass();
                                z = Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(cls7);
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                ClassLoader classLoader2 = tk8Var.f62455a;
                Class<?> clsLoadClass7 = classLoader2.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                clsLoadClass7.getClass();
                Method method9 = clsLoadClass7.getMethod("getSupportedWindowFeatures", null);
                method9.getClass();
                if (Modifier.isPublic(method9.getModifiers())) {
                    Class<?> clsLoadClass8 = classLoader2.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
                    clsLoadClass8.getClass();
                    z = method9.getReturnType().equals(clsLoadClass8);
                }
                return Boolean.valueOf(z);
            case 5:
                try {
                    Class<?> clsLoadClass9 = ((ClassLoader) tk8Var.f62456b.f57974a).loadClass("java.util.function.Consumer");
                    clsLoadClass9.getClass();
                    cls2 = clsLoadClass9;
                } catch (ClassNotFoundException unused) {
                }
                if (cls2 != null) {
                    Class<?> clsLoadClass10 = tk8Var.f62455a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                    clsLoadClass10.getClass();
                    Method method10 = clsLoadClass10.getMethod("addWindowLayoutInfoListener", Activity.class, cls2);
                    Method method11 = clsLoadClass10.getMethod("removeWindowLayoutInfoListener", cls2);
                    method10.getClass();
                    if (Modifier.isPublic(method10.getModifiers())) {
                        method11.getClass();
                        z = Modifier.isPublic(method11.getModifiers());
                    }
                    z2 = z;
                }
                return Boolean.valueOf(z2);
            default:
                return Boolean.valueOf(tk8.m22188d(tk8Var));
        }
    }
}
