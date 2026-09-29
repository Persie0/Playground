package p543do;

import fo.C5602h;
import p372rm.InterfaceC8834e;
import pn.C8413d;

/* JADX INFO: renamed from: do.g */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5231g implements InterfaceC5240k0 {

    /* JADX INFO: renamed from: a */
    public int f33324a;

    /* JADX INFO: renamed from: c */
    public abstract boolean mo11230c(InterfaceC8834e interfaceC8834e);

    public final boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC5240k0) || obj.hashCode() != hashCode()) {
            return false;
        }
        InterfaceC5240k0 interfaceC5240k0 = (InterfaceC5240k0) obj;
        if (interfaceC5240k0.mo11260r().size() != mo11260r().size()) {
            return false;
        }
        InterfaceC8834e interfaceC8834eMo11235q = mo11235q();
        InterfaceC8834e interfaceC8834eMo11235q2 = interfaceC5240k0.mo11235q();
        if (interfaceC8834eMo11235q2 == null) {
            return false;
        }
        if ((C5602h.m11915f(interfaceC8834eMo11235q) || C8413d.m16456o(interfaceC8834eMo11235q)) ? false : true) {
            if (C5602h.m11915f(interfaceC8834eMo11235q2) || C8413d.m16456o(interfaceC8834eMo11235q2)) {
                z10 = false;
            }
            if (z10) {
                return mo11230c(interfaceC8834eMo11235q2);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f33324a;
        if (i10 != 0) {
            return i10;
        }
        InterfaceC8834e interfaceC8834eMo11235q = mo11235q();
        int iHashCode = !C5602h.m11915f(interfaceC8834eMo11235q) && !C8413d.m16456o(interfaceC8834eMo11235q) ? C8413d.m16448g(interfaceC8834eMo11235q).hashCode() : System.identityHashCode(this);
        this.f33324a = iHashCode;
        return iHashCode;
    }
}
