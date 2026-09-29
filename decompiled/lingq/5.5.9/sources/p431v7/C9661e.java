package p431v7;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p173i8.C6205a;
import p213k4.RunnableC6590j;
import p317p7.RunnableC8194a;

/* JADX INFO: renamed from: v7.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9661e {

    /* JADX INFO: renamed from: a */
    public static final C9661e f49457a = new C9661e();

    /* JADX INFO: renamed from: b */
    public static final void m18120b(Context context) {
        AtomicBoolean atomicBoolean;
        C9662f c9662fM18122a;
        if (C6205a.m12742b(C9661e.class)) {
            return;
        }
        try {
            if (C9667k.m18152a("com.android.billingclient.api.Purchase") == null) {
                return;
            }
            synchronized (C9662f.f49458s) {
                try {
                    AtomicBoolean atomicBoolean2 = null;
                    if (C6205a.m12742b(C9662f.class)) {
                        atomicBoolean = null;
                    } else {
                        try {
                            atomicBoolean = C9662f.f49459t;
                        } catch (Throwable th2) {
                            C6205a.m12741a(C9662f.class, th2);
                            atomicBoolean = null;
                        }
                    }
                    if (atomicBoolean.get()) {
                        c9662fM18122a = C9662f.m18122a();
                    } else {
                        C9662f.b.m18127a(context);
                        if (!C6205a.m12742b(C9662f.class)) {
                            try {
                                atomicBoolean2 = C9662f.f49459t;
                            } catch (Throwable th3) {
                                C6205a.m12741a(C9662f.class, th3);
                            }
                        }
                        atomicBoolean2.set(true);
                        c9662fM18122a = C9662f.m18122a();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            if (c9662fM18122a != null && C9662f.b.m18129c().get()) {
                if (!C9664h.m18143d()) {
                    c9662fM18122a.m18123b(new RunnableC9660d(0));
                    return;
                }
                RunnableC8194a runnableC8194a = new RunnableC8194a(2);
                if (C6205a.m12742b(c9662fM18122a)) {
                    return;
                }
                try {
                    c9662fM18122a.m18124c(new RunnableC6590j(c9662fM18122a, 7, runnableC8194a));
                } catch (Throwable th5) {
                    C6205a.m12741a(c9662fM18122a, th5);
                }
            }
        } catch (Throwable th6) {
            C6205a.m12741a(C9661e.class, th6);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18121a() {
        ConcurrentHashMap concurrentHashMap;
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            C9664h c9664h = C9664h.f49492a;
            C9662f.b bVar = C9662f.f49458s;
            ConcurrentHashMap concurrentHashMapM18128b = C9662f.b.m18128b();
            if (C6205a.m12742b(C9662f.class)) {
                concurrentHashMap = null;
            } else {
                try {
                    concurrentHashMap = C9662f.f49463x;
                } catch (Throwable th2) {
                    C6205a.m12741a(C9662f.class, th2);
                    concurrentHashMap = null;
                }
            }
            C9664h.m18144e(concurrentHashMapM18128b, concurrentHashMap);
            C9662f.b.m18128b().clear();
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
        }
    }
}
