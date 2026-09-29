package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: u0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3631u0 implements Comparable {
    /* JADX INFO: renamed from: a */
    public abstract s11 mo18365a();

    /* JADX INFO: renamed from: b */
    public abstract long mo18366b();

    /* JADX INFO: renamed from: c */
    public final boolean m22364c(AbstractC3631u0 abstractC3631u0) {
        AtomicReference atomicReference = t22.f61763a;
        return mo18366b() < (abstractC3631u0 == null ? System.currentTimeMillis() : abstractC3631u0.mo18366b());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        AbstractC3631u0 abstractC3631u0 = (AbstractC3631u0) obj;
        if (this == abstractC3631u0) {
            return 0;
        }
        long jMo18366b = abstractC3631u0.mo18366b();
        long jMo18366b2 = mo18366b();
        if (jMo18366b2 == jMo18366b) {
            return 0;
        }
        return jMo18366b2 < jMo18366b ? -1 : 1;
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj instanceof AbstractC3631u0) {
                AbstractC3631u0 abstractC3631u0 = (AbstractC3631u0) obj;
                if (mo18366b() == abstractC3631u0.mo18366b()) {
                    s11 s11VarMo18365a = mo18365a();
                    s11 s11VarMo18365a2 = abstractC3631u0.mo18365a();
                    if (s11VarMo18365a == s11VarMo18365a2) {
                        zEquals = true;
                    } else {
                        zEquals = (s11VarMo18365a == null || s11VarMo18365a2 == null) ? false : s11VarMo18365a.equals(s11VarMo18365a2);
                    }
                    if (zEquals) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return mo18365a().hashCode() + ((int) (mo18366b() ^ (mo18366b() >>> 32)));
    }

    public String toString() {
        return hy3.f43148E.m14766a(this);
    }
}
