package p040c4;

import dm.C5207g;

/* JADX INFO: renamed from: c4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1683h {

    /* JADX INFO: renamed from: a */
    public final AbstractC1692q<Object> f9407a;

    /* JADX INFO: renamed from: b */
    public final boolean f9408b;

    /* JADX INFO: renamed from: c */
    public final boolean f9409c;

    /* JADX INFO: renamed from: d */
    public final Object f9410d;

    public C1683h(AbstractC1692q<Object> abstractC1692q, boolean z10, Object obj, boolean z11) {
        if (!(abstractC1692q.f9453a || !z10)) {
            throw new IllegalArgumentException((abstractC1692q.mo5420b() + " does not allow nullable values").toString());
        }
        if (!((!z10 && z11 && obj == null) ? false : true)) {
            throw new IllegalArgumentException(("Argument with type " + abstractC1692q.mo5420b() + " has null value but is not nullable.").toString());
        }
        this.f9407a = abstractC1692q;
        this.f9408b = z10;
        this.f9410d = obj;
        this.f9409c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C5207g.m11106a(C1683h.class, obj.getClass())) {
            return false;
        }
        C1683h c1683h = (C1683h) obj;
        if (this.f9408b == c1683h.f9408b && this.f9409c == c1683h.f9409c && C5207g.m11106a(this.f9407a, c1683h.f9407a)) {
            Object obj2 = c1683h.f9410d;
            Object obj3 = this.f9410d;
            if (obj3 != null) {
                return C5207g.m11106a(obj3, obj2);
            }
            return obj2 == null;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f9407a.hashCode() * 31) + (this.f9408b ? 1 : 0)) * 31) + (this.f9409c ? 1 : 0)) * 31;
        Object obj = this.f9410d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C1683h.class.getSimpleName());
        sb2.append(" Type: " + this.f9407a);
        sb2.append(" Nullable: " + this.f9408b);
        if (this.f9409c) {
            sb2.append(" DefaultValue: " + this.f9410d);
        }
        String string = sb2.toString();
        C5207g.m11110e(string, "sb.toString()");
        return string;
    }
}
