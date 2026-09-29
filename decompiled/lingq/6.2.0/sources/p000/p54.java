package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class p54 {

    /* JADX INFO: renamed from: a */
    public final int f55595a;

    /* JADX INFO: renamed from: b */
    public final int f55596b;

    /* JADX INFO: renamed from: c */
    public final String f55597c;

    public p54(int i, String str, int i2) {
        this.f55595a = i;
        this.f55596b = i2;
        this.f55597c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p54)) {
            return false;
        }
        p54 p54Var = (p54) obj;
        return this.f55595a == p54Var.f55595a && this.f55596b == p54Var.f55596b && this.f55597c.equals(p54Var.f55597c);
    }

    public final int hashCode() {
        return this.f55597c.hashCode() + wq1.m24106b(this.f55596b, Integer.hashCode(this.f55595a) * 31, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m22994q(this.f55595a, this.f55596b, "InlineMarkdownRange(contentStart=", ", contentEnd=", ", tag="), this.f55597c, ")");
    }
}
