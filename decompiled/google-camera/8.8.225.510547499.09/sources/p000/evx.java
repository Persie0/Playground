package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class evx extends igg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ebv f20486a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ eby f20487b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ fmy f20488c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ mrm f20489d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ ewa f20490e;

    public evx(ewa ewaVar, ebv ebvVar, eby ebyVar, fmy fmyVar, mrm mrmVar) {
        this.f20490e = ewaVar;
        this.f20486a = ebvVar;
        this.f20487b = ebyVar;
        this.f20488c = fmyVar;
        this.f20489d = mrmVar;
    }

    @Override // p000.igg, p000.igf
    public final void onShutterButtonClick() {
        fmd fmdVar = this.f20490e.f20517T;
        if (fmdVar == null) {
            ((nbe) ((nbe) ewa.f20497b.m17251b()).mo17276G((char) 1986)).mo17290o("Not taking picture because there's no active camera.");
            return;
        }
        mca mcaVarMo8575i = fmdVar.mo8575i();
        if (this.f20486a.f13306h && ((Boolean) this.f20487b.f13316b.mo3831be()).booleanValue() && ((Boolean) ((jwf) mcaVarMo8575i.f39921i).f34942d).booleanValue()) {
            this.f20488c.mo8591d(mcaVarMo8575i);
            if (this.f20489d.mo16813g()) {
                ((cld) this.f20489d.mo16809c()).mo3897a();
                return;
            }
            return;
        }
        this.f20490e.f20511N.m10431f();
        ewa ewaVar = this.f20490e;
        if (ewaVar.f20566x.m10798g()) {
            return;
        }
        int i = ((gzp) ewaVar.f20567y.mo3831be()).f26960g;
        if (i > 0) {
            ewaVar.m7936x(i);
        } else {
            ewaVar.mo3783r();
        }
    }

    @Override // p000.igg, p000.igf
    public final void onShutterButtonPressedStateChanged(boolean z) {
        fmd fmdVar;
        if (z || !((Boolean) this.f20487b.f13316b.mo3831be()).booleanValue() || (fmdVar = this.f20490e.f20517T) == null) {
            return;
        }
        ((Boolean) ((jwf) fmdVar.mo8575i().f39921i).f34942d).booleanValue();
    }

    @Override // p000.igg, p000.igf
    public final void onShutterTouchStart() {
        this.f20490e.f20511N.m10430e();
    }
}
