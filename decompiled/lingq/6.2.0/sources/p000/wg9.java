package p000;

/* JADX INFO: loaded from: classes.dex */
public final class wg9 implements voa {

    /* JADX INFO: renamed from: a */
    public final voa f66799a;

    /* JADX INFO: renamed from: b */
    public final long f66800b;

    public wg9(voa voaVar, long j) {
        this.f66799a = voaVar;
        this.f66800b = j;
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: b */
    public final boolean mo17607b() {
        return this.f66799a.mo17607b();
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: d */
    public final long mo9842d(AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        return this.f66799a.mo9842d(abstractC3081hn, abstractC3081hn2, abstractC3081hn3) + this.f66800b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wg9)) {
            return false;
        }
        wg9 wg9Var = (wg9) obj;
        return wg9Var.f66800b == this.f66800b && fa4.m11650l(wg9Var.f66799a, this.f66799a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f66800b) + (this.f66799a.hashCode() * 31);
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: i */
    public final AbstractC3081hn mo4033i(long j, AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        long j2 = this.f66800b;
        return j < j2 ? abstractC3081hn3 : this.f66799a.mo4033i(j - j2, abstractC3081hn, abstractC3081hn2, abstractC3081hn3);
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: r */
    public final AbstractC3081hn mo4036r(long j, AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        long j2 = this.f66800b;
        return j < j2 ? abstractC3081hn : this.f66799a.mo4036r(j - j2, abstractC3081hn, abstractC3081hn2, abstractC3081hn3);
    }
}
