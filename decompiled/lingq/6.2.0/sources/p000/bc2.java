package p000;

/* JADX INFO: loaded from: classes.dex */
final class bc2 extends i16 {

    /* JADX INFO: renamed from: b */
    public final e5b f8313b;

    /* JADX INFO: renamed from: c */
    public final vi3 f8314c;

    public bc2(e5b e5bVar, vi3 vi3Var) {
        this.f8313b = e5bVar;
        this.f8314c = vi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bc2) {
            return fa4.m11650l(this.f8313b, ((bc2) obj).f8313b);
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        uk9 uk9Var = pvc.f56878i;
        cc2 cc2Var = new cc2();
        cc2Var.f9877L = this.f8313b;
        cc2Var.f9878M = uk9Var;
        cc2Var.f9879N = bna.f8739l;
        return cc2Var;
    }

    public final int hashCode() {
        return pvc.f56878i.hashCode() + (this.f8313b.hashCode() * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        this.f8314c.invoke(y64Var);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        cc2 cc2Var = (cc2) d16Var;
        uk9 uk9Var = pvc.f56878i;
        e5b e5bVar = cc2Var.f9877L;
        e5b e5bVar2 = this.f8313b;
        if (fa4.m11650l(e5bVar, e5bVar2) && uk9Var == cc2Var.f9878M) {
            return;
        }
        cc2Var.f9877L = e5bVar2;
        cc2Var.f9878M = uk9Var;
        cc2Var.f9879N = new tu2(e5bVar2, cc2Var.f53891J);
        d32.m10020R(cc2Var);
    }
}
