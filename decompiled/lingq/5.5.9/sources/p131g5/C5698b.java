package p131g5;

/* JADX INFO: renamed from: g5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5698b {

    /* JADX INFO: renamed from: a */
    public final boolean f34708a;

    /* JADX INFO: renamed from: b */
    public final boolean f34709b;

    /* JADX INFO: renamed from: c */
    public final boolean f34710c;

    /* JADX INFO: renamed from: d */
    public final boolean f34711d;

    public C5698b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f34708a = z10;
        this.f34709b = z11;
        this.f34710c = z12;
        this.f34711d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5698b)) {
            return false;
        }
        C5698b c5698b = (C5698b) obj;
        return this.f34708a == c5698b.f34708a && this.f34709b == c5698b.f34709b && this.f34710c == c5698b.f34710c && this.f34711d == c5698b.f34711d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final int hashCode() {
        ?? r10 = 1;
        boolean z10 = this.f34708a;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i10 = r11 * 31;
        boolean z11 = this.f34709b;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        int i11 = (i10 + r12) * 31;
        boolean z12 = this.f34710c;
        ?? r13 = z12;
        if (z12) {
            r13 = 1;
        }
        int i12 = (i11 + r13) * 31;
        boolean z13 = this.f34711d;
        if (!z13) {
            r10 = z13;
        }
        return i12 + r10;
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f34708a + ", isValidated=" + this.f34709b + ", isMetered=" + this.f34710c + ", isNotRoaming=" + this.f34711d + ')';
    }
}
