package p000;

import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gxt extends gxl {

    /* JADX INFO: renamed from: c */
    public mrm f26755c;

    /* JADX INFO: renamed from: d */
    private final kbz f26756d;

    public gxt(gwx gwxVar, gqq gqqVar, kbz kbzVar, gyw gywVar, String str, cjr cjrVar, gyn gynVar, mrm mrmVar) {
        super(gwxVar.mo9867a(gywVar, str, cjrVar, gynVar, gqqVar, mrmVar));
        this.f26755c = mqu.f41450a;
        this.f26756d = kbzVar;
    }

    @Override // p000.gxl, p000.gyh
    /* JADX INFO: renamed from: A */
    public final void mo9869A() {
        if (m9933J().m2555D() || m9933J().m2554C()) {
            m9932I(VCYBIzY.DwU);
            return;
        }
        m9931H("finish");
        m9933J().m2559H(2, 3);
        m9936t().m9987g();
    }

    @Override // p000.gxl, p000.gyh
    /* JADX INFO: renamed from: E */
    public final void mo9873E() {
        m9931H("interruptSession");
        m9935o().mo6400b();
    }

    @Override // p000.gxl, p000.gyh
    /* JADX INFO: renamed from: S */
    public final void mo9887S(kbc kbcVar) {
        this.f26756d.mo13961e("MultiImageCaptureSession#startEmpty");
        super.mo9887S(kbcVar);
        super.mo9881M();
        m9930G();
        m9935o().mo6401c(fdh.m8262b(mo9903i(), null, null));
        this.f26756d.mo13962f();
    }
}
