package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nla {

    /* JADX INFO: renamed from: a */
    public final List f52933a;

    /* JADX INFO: renamed from: b */
    public final boolean f52934b;

    /* JADX INFO: renamed from: c */
    public final boolean f52935c;

    public nla(List list, boolean z, boolean z2) {
        list.getClass();
        this.f52933a = list;
        this.f52934b = z;
        this.f52935c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nla)) {
            return false;
        }
        nla nlaVar = (nla) obj;
        return fa4.m11650l(this.f52933a, nlaVar.f52933a) && this.f52934b == nlaVar.f52934b && this.f52935c == nlaVar.f52935c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f52935c) + g9a.m12428e(this.f52933a.hashCode() * 31, 31, this.f52934b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserImportSelectionScreenState(selectionItems=");
        sb.append(this.f52933a);
        sb.append(", isLoading=");
        sb.append(this.f52934b);
        sb.append(", showAdd=");
        return AbstractC3393o1.m17740o(sb, this.f52935c, ")");
    }
}
