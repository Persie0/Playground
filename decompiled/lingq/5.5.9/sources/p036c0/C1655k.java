package p036c0;

import dm.C5207g;
import p494y.AbstractC10270a;

/* JADX INFO: renamed from: c0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1655k {

    /* JADX INFO: renamed from: a */
    public final AbstractC10270a f9259a;

    /* JADX INFO: renamed from: b */
    public final AbstractC10270a f9260b;

    /* JADX INFO: renamed from: c */
    public final AbstractC10270a f9261c;

    /* JADX INFO: renamed from: d */
    public final AbstractC10270a f9262d;

    /* JADX INFO: renamed from: e */
    public final AbstractC10270a f9263e;

    public C1655k() {
        this(0);
    }

    public C1655k(int i10) {
        this(C1654j.f9254a, C1654j.f9255b, C1654j.f9256c, C1654j.f9257d, C1654j.f9258e);
    }

    public C1655k(AbstractC10270a abstractC10270a, AbstractC10270a abstractC10270a2, AbstractC10270a abstractC10270a3, AbstractC10270a abstractC10270a4, AbstractC10270a abstractC10270a5) {
        C5207g.m11111f(abstractC10270a, "extraSmall");
        C5207g.m11111f(abstractC10270a2, "small");
        C5207g.m11111f(abstractC10270a3, "medium");
        C5207g.m11111f(abstractC10270a4, "large");
        C5207g.m11111f(abstractC10270a5, "extraLarge");
        this.f9259a = abstractC10270a;
        this.f9260b = abstractC10270a2;
        this.f9261c = abstractC10270a3;
        this.f9262d = abstractC10270a4;
        this.f9263e = abstractC10270a5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1655k)) {
            return false;
        }
        C1655k c1655k = (C1655k) obj;
        return C5207g.m11106a(this.f9259a, c1655k.f9259a) && C5207g.m11106a(this.f9260b, c1655k.f9260b) && C5207g.m11106a(this.f9261c, c1655k.f9261c) && C5207g.m11106a(this.f9262d, c1655k.f9262d) && C5207g.m11106a(this.f9263e, c1655k.f9263e);
    }

    public final int hashCode() {
        return this.f9263e.hashCode() + ((this.f9262d.hashCode() + ((this.f9261c.hashCode() + ((this.f9260b.hashCode() + (this.f9259a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f9259a + ", small=" + this.f9260b + ", medium=" + this.f9261c + ", large=" + this.f9262d + ", extraLarge=" + this.f9263e + ')';
    }
}
