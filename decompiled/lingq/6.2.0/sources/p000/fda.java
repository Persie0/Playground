package p000;

/* JADX INFO: loaded from: classes.dex */
public final class fda implements dn2 {

    /* JADX INFO: renamed from: a */
    public final int f38914a;

    /* JADX INFO: renamed from: b */
    public final int f38915b;

    /* JADX INFO: renamed from: c */
    public final go2 f38916c;

    public fda(int i, go2 go2Var, int i2) {
        this(i, 0, (i2 & 4) != 0 ? io2.f44349a : go2Var);
    }

    @Override // p000.InterfaceC0025an
    /* JADX INFO: renamed from: a */
    public final voa mo589a(jda jdaVar) {
        return new sq6(this.f38914a, this.f38915b, this.f38916c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fda) {
            fda fdaVar = (fda) obj;
            if (fdaVar.f38914a == this.f38914a && fdaVar.f38915b == this.f38915b && fa4.m11650l(fdaVar.f38916c, this.f38916c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f38916c.hashCode() + (this.f38914a * 31)) * 31) + this.f38915b;
    }

    public fda(int i, int i2, go2 go2Var) {
        this.f38914a = i;
        this.f38915b = i2;
        this.f38916c = go2Var;
    }

    @Override // p000.dn2, p000.InterfaceC0025an
    /* JADX INFO: renamed from: a */
    public final xoa mo589a(jda jdaVar) {
        return new sq6(this.f38914a, this.f38915b, this.f38916c);
    }
}
