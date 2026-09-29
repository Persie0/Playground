package p264mi;

import dm.C5207g;

/* JADX INFO: renamed from: mi.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7561a {

    /* JADX INFO: renamed from: a */
    public final String f41674a;

    /* JADX INFO: renamed from: b */
    public final boolean f41675b;

    public C7561a(String str, boolean z10) {
        C5207g.m11111f(str, "text");
        this.f41674a = str;
        this.f41675b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7561a)) {
            return false;
        }
        C7561a c7561a = (C7561a) obj;
        return C5207g.m11106a(this.f41674a, c7561a.f41674a) && this.f41675b == c7561a.f41675b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f41674a.hashCode() * 31;
        boolean z10 = this.f41675b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final String toString() {
        return "ClozeFragment(text=" + this.f41674a + ", isOccurrence=" + this.f41675b + ")";
    }
}
