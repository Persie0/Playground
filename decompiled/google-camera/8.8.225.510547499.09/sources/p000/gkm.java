package p000;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gkm extends kfv {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ gkn f25318a;

    /* JADX INFO: renamed from: b */
    private final key f25319b;

    /* JADX INFO: renamed from: c */
    private final gav f25320c;

    /* JADX INFO: renamed from: d */
    private final gau f25321d;

    /* JADX INFO: renamed from: e */
    private final nqf f25322e;

    /* JADX INFO: renamed from: f */
    private final glk f25323f;

    /* JADX WARN: Type inference failed for: r1v1, types: [gav, java.lang.Object] */
    public gkm(gkn gknVar, key keyVar, glk glkVar, nqf nqfVar, byte[] bArr, byte[] bArr2) {
        this.f25318a = gknVar;
        this.f25319b = keyVar;
        this.f25323f = glkVar;
        ?? r1 = glkVar.f25501b;
        this.f25320c = r1;
        r1.mo9015h();
        this.f25321d = r1.mo9010c();
        this.f25322e = nqfVar;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bb */
    public final void mo4006bb() {
        ((nbe) ((nbe) gkn.f25324a.m17251b()).mo17276G((char) 2846)).mo17290o("onAbort");
        this.f25322e.mo14894e(false);
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bc */
    public final void mo4007bc() {
        try {
            gkn gknVar = this.f25318a;
            key keyVar = this.f25319b;
            kgg kggVar = gknVar.f25325b;
            glk glkVar = this.f25323f;
            kpw kpwVarMo7043d = keyVar.mo7043d(kggVar);
            kpp kppVarMo7042c = keyVar.mo7042c();
            if (kppVarMo7042c == null) {
                kppVarMo7042c = new gmj();
            }
            keyVar.close();
            boolean z = false;
            if (kpwVarMo7043d == null) {
                ((nbe) ((nbe) gkn.f25324a.m17251b()).mo17276G((char) 2859)).mo17293r("Image available for %s but the image was null!", keyVar);
            } else {
                try {
                    fzt fztVarMo3603a = gknVar.f25326c.mo3603a(glkVar);
                    try {
                        fztVarMo3603a.mo3602a(kpwVarMo7043d, kxk.m14965K(kppVarMo7042c));
                        if (fztVarMo3603a != null) {
                            fztVarMo3603a.close();
                        }
                        z = true;
                    } catch (Throwable th) {
                        if (fztVarMo3603a != null) {
                            try {
                                fztVarMo3603a.close();
                            } catch (Throwable th2) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                } catch (Exception e) {
                                }
                            }
                        }
                        throw th;
                    }
                } catch (InterruptedException | kec e2) {
                    ((nbe) ((nbe) ((nbe) gkn.f25324a.m17251b()).mo17283h(e2)).mo17276G((char) 2858)).mo17290o("Error saving image.");
                    throw e2;
                }
            }
            this.f25322e.mo14894e(Boolean.valueOf(z));
        } catch (InterruptedException | kec e3) {
            this.f25322e.mo8566a(e3);
        }
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bi */
    public final void mo5510bi() {
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bo */
    public final void mo6748bo(kpp kppVar) {
        if (kppVar == null) {
            this.f25322e.mo14894e(false);
        } else {
            kppVar.mo9515b();
            kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
        }
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bx */
    public final void mo9369bx() {
        this.f25321d.mo9005h();
    }
}
