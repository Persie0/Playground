package p000;

import com.facebook.appevents.iap.InAppPurchaseUtils$IAPProductType;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class s24 implements o24 {

    /* JADX INFO: renamed from: m */
    public static s24 f60179m;

    /* JADX INFO: renamed from: a */
    public final Object f60184a;

    /* JADX INFO: renamed from: b */
    public final Class f60185b;

    /* JADX INFO: renamed from: c */
    public final Class f60186c;

    /* JADX INFO: renamed from: d */
    public final Class f60187d;

    /* JADX INFO: renamed from: e */
    public final Class f60188e;

    /* JADX INFO: renamed from: f */
    public final Class f60189f;

    /* JADX INFO: renamed from: g */
    public final Method f60190g;

    /* JADX INFO: renamed from: h */
    public final Method f60191h;

    /* JADX INFO: renamed from: i */
    public final Method f60192i;

    /* JADX INFO: renamed from: j */
    public final Method f60193j;

    /* JADX INFO: renamed from: k */
    public final a34 f60194k;

    /* JADX INFO: renamed from: l */
    public static final a3d f60178l = new a3d();

    /* JADX INFO: renamed from: n */
    public static final AtomicBoolean f60180n = new AtomicBoolean(false);

    /* JADX INFO: renamed from: o */
    public static final ConcurrentHashMap f60181o = new ConcurrentHashMap();

    /* JADX INFO: renamed from: p */
    public static final ConcurrentHashMap f60182p = new ConcurrentHashMap();

    /* JADX INFO: renamed from: q */
    public static final ConcurrentHashMap f60183q = new ConcurrentHashMap();

    public s24(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Method method, Method method2, Method method3, Method method4, a34 a34Var) {
        this.f60184a = obj;
        this.f60185b = cls;
        this.f60186c = cls2;
        this.f60187d = cls3;
        this.f60188e = cls4;
        this.f60189f = cls5;
        this.f60190g = method;
        this.f60191h = method2;
        this.f60192i = method3;
        this.f60193j = method4;
        this.f60194k = a34Var;
    }

    /* JADX INFO: renamed from: b */
    public static final String m21006b() {
        if (lp1.f49971a.contains(s24.class)) {
            return null;
        }
        return "s24";
    }

    @Override // p000.o24
    /* JADX INFO: renamed from: a */
    public final void mo17770a(InAppPurchaseUtils$IAPProductType inAppPurchaseUtils$IAPProductType, Runnable runnable) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            inAppPurchaseUtils$IAPProductType.getClass();
            m21007c(new RunnableC3725wk(this, inAppPurchaseUtils$IAPProductType, runnable, 11));
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m21007c(Runnable runnable) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            if (f60180n.get()) {
                runnable.run();
            } else {
                m21009e(runnable);
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m21008d() {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            return this.f60184a;
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m21009e(Runnable runnable) {
        Method methodM3249p;
        Class cls = this.f60185b;
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            Class clsM3246l = b34.m3246l("com.android.billingclient.api.BillingClientStateListener");
            if (clsM3246l == null || (methodM3249p = b34.m3249p(cls, "startConnection", clsM3246l)) == null) {
                return;
            }
            b34.m3252s(cls, m21008d(), methodM3249p, Proxy.newProxyInstance(clsM3246l.getClassLoader(), new Class[]{clsM3246l}, new p24(runnable)));
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }
}
