package p000;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gkn implements gbi {

    /* JADX INFO: renamed from: a */
    public static final nbh f25324a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/commands/PckSingleImageCaptureCommand");

    /* JADX INFO: renamed from: b */
    public final kgg f25325b;

    /* JADX INFO: renamed from: c */
    public final fzu f25326c;

    /* JADX INFO: renamed from: d */
    private final kfk f25327d;

    /* JADX INFO: renamed from: e */
    private final fxi f25328e;

    /* JADX INFO: renamed from: f */
    private final kho f25329f;

    public gkn(kfk kfkVar, kgg kggVar, kho khoVar, fzu fzuVar, fxi fxiVar) {
        this.f25327d = kfkVar;
        this.f25325b = kggVar;
        this.f25329f = khoVar;
        this.f25326c = fzuVar;
        this.f25328e = fxiVar;
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: a */
    public final jwn mo7626a() {
        return jwr.m13637g(true);
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: b */
    public final jwn mo7627b() {
        return jwr.m13637g(this.f25328e);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [gav, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [gyh, java.lang.Object] */
    @Override // p000.gbi
    /* JADX INFO: renamed from: c */
    public final void mo7628c(gbh gbhVar, glk glkVar) {
        kfk kfkVar = this.f25327d;
        kho khoVar = this.f25329f;
        int i = 0;
        while (kfkVar != null && khoVar != null) {
            int i2 = i + 1;
            if (i >= 3) {
                break;
            }
            key keyVarMo14130q = kfkVar.mo14130q(khoVar);
            nqf nqfVarM17621g = nqf.m17621g();
            keyVarMo14130q.mo7050k(new gkm(this, keyVarMo14130q, glkVar, nqfVarM17621g, null, null));
            try {
                if (((Boolean) nqfVarM17621g.get()).booleanValue()) {
                    gbhVar.close();
                }
                i = i2;
            } catch (InterruptedException | ExecutionException e) {
                ((nbe) ((nbe) ((nbe) f25324a.m17251b()).mo17283h(e)).mo17276G((char) 2856)).mo17290o("Error acquiring image.");
                nbh nbhVar = f25324a;
                ((nbe) ((nbe) nbhVar.m17252c()).mo17276G(2853)).mo17291p("Couldn't capture image after %s attempts.", 3);
                ((nbe) ((nbe) nbhVar.m17252c()).mo17276G((char) 2852)).mo17290o("Aborting shot.");
                glkVar.f25501b.mo9013f();
                glkVar.f25502c.mo9870B(ihd.f30944a, new dos("Image capture failed. Aborting capture!"));
            }
        }
        nbh nbhVar2 = f25324a;
        ((nbe) ((nbe) nbhVar2.m17252c()).mo17276G(2853)).mo17291p("Couldn't capture image after %s attempts.", 3);
        ((nbe) ((nbe) nbhVar2.m17252c()).mo17276G((char) 2852)).mo17290o("Aborting shot.");
        glkVar.f25501b.mo9013f();
        glkVar.f25502c.mo9870B(ihd.f30944a, new dos("Image capture failed. Aborting capture!"));
        gbhVar.close();
    }
}
