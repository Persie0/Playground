package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eun extends igg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ eby f20123a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ebv f20124b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ fmo f20125c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ fek f20126d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ fdl f20127e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ eus f20128f;

    public eun(eus eusVar, eby ebyVar, ebv ebvVar, fmo fmoVar, fek fekVar, fdl fdlVar) {
        this.f20128f = eusVar;
        this.f20123a = ebyVar;
        this.f20124b = ebvVar;
        this.f20125c = fmoVar;
        this.f20126d = fekVar;
        this.f20127e = fdlVar;
    }

    @Override // p000.igg, p000.igf
    public final void onShutterButtonClick() {
        if (this.f20128f.f20156R == null) {
            return;
        }
        boolean z = true;
        if (!this.f20123a.m7101l() && !this.f20124b.f13306h) {
            z = false;
        }
        fmd fmdVar = this.f20128f.f20156R;
        fmdVar.getClass();
        mca mcaVarMo8575i = fmdVar.mo8575i();
        if (((Boolean) ((jwf) mcaVarMo8575i.f39921i).f34942d).booleanValue() && z) {
            this.f20125c.mo8591d(mcaVarMo8575i);
            if (this.f20123a.m7102m()) {
                this.f20126d.mo8294bN();
                return;
            } else {
                this.f20126d.mo8286a();
                return;
            }
        }
        this.f20127e.m11104f();
        this.f20128f.f20151M.m10431f();
        eus eusVar = this.f20128f;
        if (eusVar.m7911D()) {
            return;
        }
        int i = ((gzp) eusVar.f20197o.mo3831be()).f26960g;
        if (i > 0) {
            eusVar.m7908A(i);
        } else {
            eusVar.mo3783r();
        }
    }

    @Override // p000.igg, p000.igf
    public final void onShutterTouchStart() {
        this.f20128f.f20151M.m10430e();
    }
}
