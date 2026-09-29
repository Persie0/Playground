package p431v7;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p173i8.C6205a;

/* JADX INFO: renamed from: v7.j */
/* JADX INFO: loaded from: classes.dex */
public final class C9666j {

    /* JADX INFO: renamed from: g */
    public static C9666j f49498g;

    /* JADX INFO: renamed from: h */
    public static final AtomicBoolean f49499h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public final Class<?> f49500a;

    /* JADX INFO: renamed from: b */
    public final Class<?> f49501b;

    /* JADX INFO: renamed from: c */
    public final Method f49502c;

    /* JADX INFO: renamed from: d */
    public final Method f49503d;

    /* JADX INFO: renamed from: e */
    public final Method f49504e;

    /* JADX INFO: renamed from: f */
    public final Method f49505f;

    public C9666j(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.f49500a = cls;
        this.f49501b = cls2;
        this.f49502c = method;
        this.f49503d = method2;
        this.f49504e = method3;
        this.f49505f = method4;
    }

    /* JADX INFO: renamed from: a */
    public final Object m18151a(ArrayList arrayList) {
        Object objM18155d;
        Object objM18155d2;
        Class<?> cls = this.f49501b;
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            int i10 = C9667k.f49506a;
            Object objM18155d3 = C9667k.m18155d(this.f49500a, null, this.f49502c, new Object[0]);
            if (objM18155d3 != null && (objM18155d = C9667k.m18155d(cls, objM18155d3, this.f49503d, "inapp")) != null && (objM18155d2 = C9667k.m18155d(cls, objM18155d, this.f49504e, arrayList)) != null) {
                return C9667k.m18155d(cls, objM18155d2, this.f49505f, new Object[0]);
            }
            return null;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }
}
