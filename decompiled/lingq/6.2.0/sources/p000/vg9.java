package p000;

/* JADX INFO: loaded from: classes.dex */
public final class vg9 implements InterfaceC0025an {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0025an f65359a;

    /* JADX INFO: renamed from: b */
    public final long f65360b;

    public vg9(l43 l43Var, long j) {
        this.f65359a = l43Var;
        this.f65360b = j;
    }

    @Override // p000.InterfaceC0025an
    /* JADX INFO: renamed from: a */
    public final voa mo589a(jda jdaVar) {
        return new wg9(this.f65359a.mo589a(jdaVar), this.f65360b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vg9)) {
            return false;
        }
        vg9 vg9Var = (vg9) obj;
        return vg9Var.f65360b == this.f65360b && fa4.m11650l(vg9Var.f65359a, this.f65359a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f65360b) + (this.f65359a.hashCode() * 31);
    }
}
