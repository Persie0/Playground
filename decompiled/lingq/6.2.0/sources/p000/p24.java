package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class p24 implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final Runnable f55481a;

    public p24(Runnable runnable) {
        this.f55481a = runnable;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AtomicBoolean atomicBoolean;
        Method methodM3249p;
        AtomicBoolean atomicBoolean2;
        Set set = lp1.f49971a;
        if (!set.contains(this)) {
            try {
                obj.getClass();
                method.getClass();
                if (fa4.m11650l(method.getName(), "onBillingSetupFinished")) {
                    Object objM20842j0 = objArr != null ? AbstractC3550rv.m20842j0(objArr, 0) : null;
                    Class clsM3246l = b34.m3246l("com.android.billingclient.api.BillingResult");
                    if (clsM3246l != null && (methodM3249p = b34.m3249p(clsM3246l, "getResponseCode", new Class[0])) != null && fa4.m11650l(b34.m3252s(clsM3246l, objM20842j0, methodM3249p, new Object[0]), 0)) {
                        a3d a3dVar = s24.f60178l;
                        if (set.contains(s24.class)) {
                            atomicBoolean2 = null;
                        } else {
                            try {
                                atomicBoolean2 = s24.f60180n;
                            } catch (Throwable th) {
                                lp1.m16420a(s24.class, th);
                                atomicBoolean2 = null;
                            }
                        }
                        atomicBoolean2.set(true);
                        this.f55481a.run();
                    }
                } else {
                    String name = method.getName();
                    name.getClass();
                    if (cl9.m4833P(name, "onBillingServiceDisconnected", false)) {
                        a3d a3dVar2 = s24.f60178l;
                        if (set.contains(s24.class)) {
                            atomicBoolean = null;
                        } else {
                            try {
                                atomicBoolean = s24.f60180n;
                            } catch (Throwable th2) {
                                lp1.m16420a(s24.class, th2);
                                atomicBoolean = null;
                            }
                        }
                        atomicBoolean.set(false);
                    }
                }
            } catch (Throwable th3) {
                lp1.m16420a(this, th3);
                return null;
            }
        }
        return null;
    }
}
