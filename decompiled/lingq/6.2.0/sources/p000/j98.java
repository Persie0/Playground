package p000;

import kotlin.AbstractC3193b;

/* JADX INFO: loaded from: classes.dex */
public final class j98 extends be4 {

    /* JADX INFO: renamed from: h */
    public final oe4 f45239h;

    public j98(oe4 oe4Var) {
        this.f45239h = oe4Var;
    }

    @Override // p000.be4
    /* JADX INFO: renamed from: r */
    public final boolean mo3669r() {
        return false;
    }

    @Override // p000.be4
    /* JADX INFO: renamed from: s */
    public final void mo3670s(Throwable th) {
        Object objM15500Q = m3668q().m15500Q();
        boolean z = objM15500Q instanceof dc1;
        oe4 oe4Var = this.f45239h;
        if (z) {
            oe4Var.resumeWith(AbstractC3193b.m15358a(((dc1) objM15500Q).f35375a));
        } else {
            oe4Var.resumeWith(AbstractC3584sr.m21629h0(objM15500Q));
        }
    }
}
