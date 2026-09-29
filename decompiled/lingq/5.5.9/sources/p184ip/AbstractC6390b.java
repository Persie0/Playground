package p184ip;

import org.joda.convert.ToString;
import org.joda.time.format.C8145g;
import p163hp.AbstractC6094a;
import p163hp.InterfaceC6098e;

/* JADX INFO: renamed from: ip.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6390b implements InterfaceC6098e {
    @Override // java.lang.Comparable
    public final int compareTo(InterfaceC6098e interfaceC6098e) {
        InterfaceC6098e interfaceC6098e2 = interfaceC6098e;
        if (this == interfaceC6098e2) {
            return 0;
        }
        long jMo12597k = interfaceC6098e2.mo12597k();
        long jMo12597k2 = mo12597k();
        if (jMo12597k2 == jMo12597k) {
            return 0;
        }
        return jMo12597k2 < jMo12597k ? -1 : 1;
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC6098e)) {
            return false;
        }
        InterfaceC6098e interfaceC6098e = (InterfaceC6098e) obj;
        if (mo12597k() == interfaceC6098e.mo12597k()) {
            AbstractC6094a abstractC6094aMo12598n = mo12598n();
            AbstractC6094a abstractC6094aMo12598n2 = interfaceC6098e.mo12598n();
            if (abstractC6094aMo12598n == abstractC6094aMo12598n2) {
                zEquals = true;
            } else {
                zEquals = (abstractC6094aMo12598n == null || abstractC6094aMo12598n2 == null) ? false : abstractC6094aMo12598n.equals(abstractC6094aMo12598n2);
            }
            if (zEquals) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return mo12598n().hashCode() + ((int) (mo12597k() ^ (mo12597k() >>> 32)));
    }

    @ToString
    public String toString() {
        return C8145g.f44188E.m16116b(this);
    }
}
