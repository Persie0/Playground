package cc;

import p260m8.C7499b;
import p338qd.C8573r0;

/* JADX INFO: renamed from: cc.x2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1976x2 {

    /* JADX INFO: renamed from: g */
    public static final Object f10290g = new Object();

    /* JADX INFO: renamed from: a */
    public final String f10291a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1967w2 f10292b;

    /* JADX INFO: renamed from: c */
    public final Object f10293c;

    /* JADX INFO: renamed from: d */
    public final Object f10294d;

    /* JADX INFO: renamed from: e */
    public final Object f10295e = new Object();

    /* JADX INFO: renamed from: f */
    public volatile Object f10296f = null;

    public /* synthetic */ C1976x2(String str, Object obj, Object obj2, InterfaceC1967w2 interfaceC1967w2) {
        this.f10291a = str;
        this.f10293c = obj;
        this.f10294d = obj2;
        this.f10292b = interfaceC1967w2;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public final Object m5912a(Object obj) {
        synchronized (this.f10295e) {
        }
        if (obj != null) {
            return obj;
        }
        if (C7499b.f41429d == null) {
            return this.f10293c;
        }
        synchronized (f10290g) {
            if (C8573r0.m16748p1()) {
                return this.f10296f == null ? this.f10293c : this.f10296f;
            }
            try {
                for (C1976x2 c1976x2 : C1985y2.f10339a) {
                    if (C8573r0.m16748p1()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    Object objZza = null;
                    try {
                        InterfaceC1967w2 interfaceC1967w2 = c1976x2.f10292b;
                        if (interfaceC1967w2 != null) {
                            objZza = interfaceC1967w2.zza();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (f10290g) {
                        try {
                            c1976x2.f10296f = objZza;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (SecurityException unused2) {
            }
            InterfaceC1967w2 interfaceC1967w3 = this.f10292b;
            if (interfaceC1967w3 == null) {
                return this.f10293c;
            }
            try {
                return interfaceC1967w3.zza();
            } catch (IllegalStateException unused3) {
                return this.f10293c;
            } catch (SecurityException unused4) {
                return this.f10293c;
            }
        }
    }
}
