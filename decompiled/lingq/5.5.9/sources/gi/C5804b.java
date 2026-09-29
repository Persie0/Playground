package gi;

import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: gi.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5804b {

    /* JADX INFO: renamed from: a */
    public final String f35073a;

    /* JADX INFO: renamed from: b */
    public final int f35074b;

    /* JADX INFO: renamed from: c */
    public final boolean f35075c;

    /* JADX INFO: renamed from: d */
    public final double f35076d;

    public C5804b(String str, int i10, boolean z10, double d10) {
        C5207g.m11111f(str, "language");
        this.f35073a = str;
        this.f35074b = i10;
        this.f35075c = z10;
        this.f35076d = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5804b)) {
            return false;
        }
        C5804b c5804b = (C5804b) obj;
        if (C5207g.m11106a(this.f35073a, c5804b.f35073a) && this.f35074b == c5804b.f35074b && this.f35075c == c5804b.f35075c && Double.compare(this.f35076d, c5804b.f35076d) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f35074b, this.f35073a.hashCode() * 31, 31);
        boolean z10 = this.f35075c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return Double.hashCode(this.f35076d) + ((iM16d + r10) * 31);
    }

    public final String toString() {
        return "UserStreak(language=" + this.f35073a + ", latestStreakDays=" + this.f35074b + ", isStreakBroken=" + this.f35075c + ", coins=" + this.f35076d + ")";
    }
}
