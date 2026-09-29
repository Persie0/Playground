package p443w;

import dm.C5207g;

/* JADX INFO: renamed from: w.p */
/* JADX INFO: loaded from: classes.dex */
public final class C9785p {

    /* JADX INFO: renamed from: a */
    public float f49883a;

    /* JADX INFO: renamed from: b */
    public boolean f49884b;

    /* JADX INFO: renamed from: c */
    public AbstractC9773d f49885c;

    public C9785p() {
        this(0);
    }

    public C9785p(int i10) {
        this.f49883a = 0.0f;
        this.f49884b = true;
        this.f49885c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9785p)) {
            return false;
        }
        C9785p c9785p = (C9785p) obj;
        return Float.compare(this.f49883a, c9785p.f49883a) == 0 && this.f49884b == c9785p.f49884b && C5207g.m11106a(this.f49885c, c9785p.f49885c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f49883a) * 31;
        boolean z10 = this.f49884b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        AbstractC9773d abstractC9773d = this.f49885c;
        return i10 + (abstractC9773d == null ? 0 : abstractC9773d.hashCode());
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f49883a + ", fill=" + this.f49884b + ", crossAxisAlignment=" + this.f49885c + ')';
    }
}
