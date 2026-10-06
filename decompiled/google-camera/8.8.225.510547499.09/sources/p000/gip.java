package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gip implements fvw {

    /* JADX INFO: renamed from: a */
    private static final nbh f24904a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/advice/PckAdviceFrameRetrievalCommand");

    /* JADX INFO: renamed from: b */
    private final nps f24905b;

    /* JADX INFO: renamed from: c */
    private final kfk f24906c;

    /* JADX INFO: renamed from: d */
    private final mrm f24907d;

    /* JADX INFO: renamed from: e */
    private final mrm f24908e;

    /* JADX INFO: renamed from: f */
    private final cem f24909f;

    public gip(nps npsVar, kfk kfkVar, mrm mrmVar, mrm mrmVar2, cem cemVar) {
        this.f24905b = npsVar;
        this.f24906c = kfkVar;
        this.f24907d = mrmVar;
        this.f24908e = mrmVar2;
        this.f24909f = cemVar;
    }

    @Override // p000.fvw
    /* JADX INFO: renamed from: a */
    public final void mo8841a() {
        if (this.f24907d.mo16813g() && this.f24908e.mo16813g() && ((kho) this.f24907d.mo16809c()).f36067c.contains(this.f24908e.mo16809c())) {
            kho khoVar = (kho) this.f24907d.mo16809c();
            kgg kggVar = (kgg) this.f24908e.mo16809c();
            try {
                key keyVarMo14130q = this.f24906c.mo14130q(khoVar);
                try {
                    kfv.m14171t(keyVarMo14130q);
                    kpw kpwVarMo7043d = keyVarMo14130q.mo7043d(kggVar);
                    cet cetVar = (cet) jvh.m13560h(this.f24905b);
                    if (kpwVarMo7043d != null) {
                        if (cetVar != null) {
                            grl grlVarM9671a = grm.m9671a(kpwVarMo7043d);
                            kpp kppVarMo7042c = keyVarMo14130q.mo7042c();
                            grlVarM9671a.f26146d = kppVarMo7042c != null ? kxk.m14965K(kppVarMo7042c) : null;
                            grlVarM9671a.f26145c = kay.m13889b(((Integer) this.f24909f.m3565c().mo3831be()).intValue());
                            cetVar.mo3581g(grlVarM9671a.m9669a());
                        } else {
                            kpwVarMo7043d.close();
                        }
                    }
                    keyVarMo14130q.close();
                } catch (Throwable th) {
                    try {
                        keyVarMo14130q.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception e) {
                        }
                    }
                    throw th;
                }
            } catch (InterruptedException e2) {
                ((nbe) ((nbe) ((nbe) f24904a.m17252c()).mo17283h(e2)).mo17276G((char) 2682)).mo17290o("Unable to retrieve frame");
            }
        }
    }
}
