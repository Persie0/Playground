package p373rn;

import dm.C5207g;
import p372rm.InterfaceC8863u;
import p543do.AbstractC5257t;

/* JADX INFO: renamed from: rn.g */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8875g<T> {

    /* JADX INFO: renamed from: a */
    public final T f46772a;

    public AbstractC8875g(T t10) {
        this.f46772a = t10;
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC5257t mo17121a(InterfaceC8863u interfaceC8863u);

    /* JADX INFO: renamed from: b */
    public T mo17122b() {
        return this.f46772a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            T tMo17122b = mo17122b();
            Object objMo17122b = null;
            AbstractC8875g abstractC8875g = obj instanceof AbstractC8875g ? (AbstractC8875g) obj : null;
            if (abstractC8875g != null) {
                objMo17122b = abstractC8875g.mo17122b();
            }
            if (!C5207g.m11106a(tMo17122b, objMo17122b)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        T tMo17122b = mo17122b();
        if (tMo17122b != null) {
            return tMo17122b.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(mo17122b());
    }
}
