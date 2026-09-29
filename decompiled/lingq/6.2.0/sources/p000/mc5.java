package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class mc5 {

    /* JADX INFO: renamed from: a */
    public final long f51074a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f51075b;

    public mc5(long j, ArrayList arrayList) {
        this.f51074a = j;
        this.f51075b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc5)) {
            return false;
        }
        mc5 mc5Var = (mc5) obj;
        return aa1.m199c(this.f51074a, mc5Var.f51074a) && this.f51075b.equals(mc5Var.f51075b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(0) * 31;
        int i = aa1.f413l;
        return (this.f51075b.hashCode() + ux5.m22981d(this.f51074a, iHashCode, 31)) * 31;
    }

    public final String toString() {
        return "LineGraphItem(title=0, color=" + aa1.m205i(this.f51074a) + ", coordinates=" + this.f51075b + ", valueForTitle=)";
    }
}
