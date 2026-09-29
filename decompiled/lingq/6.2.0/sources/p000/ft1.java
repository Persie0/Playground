package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ft1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f39609a;

    /* JADX INFO: renamed from: b */
    public final bu1 f39610b;

    public ft1(ArrayList arrayList, bu1 bu1Var) {
        this.f39609a = arrayList;
        this.f39610b = bu1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft1)) {
            return false;
        }
        ft1 ft1Var = (ft1) obj;
        return this.f39609a.equals(ft1Var.f39609a) && fa4.m11650l(this.f39610b, ft1Var.f39610b);
    }

    public final int hashCode() {
        int iHashCode = this.f39609a.hashCode() * 31;
        bu1 bu1Var = this.f39610b;
        return iHashCode + (bu1Var == null ? 0 : bu1Var.hashCode());
    }

    public final String toString() {
        return "CupContributors(results=" + this.f39609a + ", me=" + this.f39610b + ")";
    }
}
