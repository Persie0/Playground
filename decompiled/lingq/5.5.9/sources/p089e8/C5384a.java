package p089e8;

import dm.C5207g;

/* JADX INFO: renamed from: e8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5384a {

    /* JADX INFO: renamed from: a */
    public final String f33802a;

    /* JADX INFO: renamed from: b */
    public final boolean f33803b;

    public C5384a(String str, boolean z10) {
        C5207g.m11111f(str, "name");
        this.f33802a = str;
        this.f33803b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5384a)) {
            return false;
        }
        C5384a c5384a = (C5384a) obj;
        return C5207g.m11106a(this.f33802a, c5384a.f33802a) && this.f33803b == c5384a.f33803b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f33802a.hashCode() * 31;
        boolean z10 = this.f33803b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final String toString() {
        return "GateKeeper(name=" + this.f33802a + ", value=" + this.f33803b + ')';
    }
}
