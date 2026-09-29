package p000;

import kotlinx.coroutines.C3213d;

/* JADX INFO: loaded from: classes.dex */
public final class pe4 extends be4 {

    /* JADX INFO: renamed from: h */
    public final C3213d f56000h;

    /* JADX INFO: renamed from: i */
    public final qe4 f56001i;

    /* JADX INFO: renamed from: j */
    public final r01 f56002j;

    /* JADX INFO: renamed from: k */
    public final Object f56003k;

    public pe4(C3213d c3213d, qe4 qe4Var, r01 r01Var, Object obj) {
        this.f56000h = c3213d;
        this.f56001i = qe4Var;
        this.f56002j = r01Var;
        this.f56003k = obj;
    }

    @Override // p000.be4
    /* JADX INFO: renamed from: r */
    public final boolean mo3669r() {
        return false;
    }

    @Override // p000.be4
    /* JADX INFO: renamed from: s */
    public final void mo3670s(Throwable th) {
        r01 r01Var = this.f56002j;
        r01 r01VarM15487b0 = C3213d.m15487b0(r01Var);
        C3213d c3213d = this.f56000h;
        qe4 qe4Var = this.f56001i;
        Object obj = this.f56003k;
        if (r01VarM15487b0 == null || !c3213d.m15516n0(qe4Var, r01VarM15487b0, obj)) {
            qe4Var.f57648a.m15574e(new ue5(2), 2);
            r01 r01VarM15487b1 = C3213d.m15487b0(r01Var);
            if (r01VarM15487b1 == null || !c3213d.m15516n0(qe4Var, r01VarM15487b1, obj)) {
                c3213d.mo4900t(c3213d.m15492H(qe4Var, obj));
            }
        }
    }
}
