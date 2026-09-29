package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h0b {

    /* JADX INFO: renamed from: a */
    public final List f41644a;

    /* JADX INFO: renamed from: b */
    public final vxa f41645b;

    public h0b(List list, vxa vxaVar) {
        list.getClass();
        this.f41644a = list;
        this.f41645b = vxaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0b)) {
            return false;
        }
        h0b h0bVar = (h0b) obj;
        return fa4.m11650l(this.f41644a, h0bVar.f41644a) && fa4.m11650l(this.f41645b, h0bVar.f41645b);
    }

    public final int hashCode() {
        int iHashCode = this.f41644a.hashCode() * 31;
        vxa vxaVar = this.f41645b;
        return iHashCode + (vxaVar == null ? 0 : vxaVar.hashCode());
    }

    public final String toString() {
        return "VocabularyListState(cards=" + this.f41644a + ", emptyState=" + this.f41645b + ")";
    }
}
