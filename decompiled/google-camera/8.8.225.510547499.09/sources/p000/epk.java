package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class epk implements gbi {

    /* JADX INFO: renamed from: a */
    public static final nbh f14980a = nbh.m17259h("com/google/android/apps/camera/lasagna/MotionBlurCaptureCommand");

    /* JADX INFO: renamed from: b */
    private final gof f14981b;

    /* JADX INFO: renamed from: c */
    private final gbi f14982c;

    /* JADX INFO: renamed from: d */
    private final jwn f14983d;

    /* JADX INFO: renamed from: e */
    private final eqw f14984e;

    /* JADX INFO: renamed from: f */
    private final jvb f14985f;

    public epk(gof gofVar, jwn jwnVar, jvb jvbVar, mrm mrmVar, epf epfVar, jwn jwnVar2, jwn jwnVar3, oju ojuVar, ecj ecjVar, gbi gbiVar) {
        lku.m15669w(true);
        this.f14981b = gofVar;
        this.f14982c = gbiVar;
        this.f14984e = (eqw) ((mrq) mrmVar).f41482a;
        this.f14985f = jvbVar;
        kfc kfcVarMo9308f = gofVar.mo9308f();
        int iIntValue = ecjVar.mo6051a().intValue() + 9;
        jwn jwnVarMo9523b = ((gmo) ojuVar.get()).mo9523b();
        jwf jwfVar = new jwf(false);
        kfcVarMo9308f.mo9411k(new ffc(new AtomicInteger(Integer.MAX_VALUE), kfcVarMo9308f, jwfVar, 1));
        jvbVar.m13537d(jwnVar.mo3830a(new dsu(jwfVar, 7), not.INSTANCE));
        jwn jwnVarM13640j = jwr.m13640j(jwnVar3, new ich(iIntValue, 1));
        cjz cjzVar = new cjz(jwnVarMo9523b, jwr.m13640j(jwnVarM13640j, ddu.f10597n), jwnVarM13640j);
        jvbVar.m13537d(cjzVar.mo3830a(new dsu(jwnVarMo9523b, 8), not.INSTANCE));
        this.f14983d = jwr.m13634d(jwr.m13634d(cjzVar, jwfVar), jwnVar2);
        kfcVarMo9308f.mo9411k(epfVar);
        jvbVar.m13537d(new eip(kfcVarMo9308f, epfVar, 6));
        jvbVar.m13537d(epfVar);
    }

    /* JADX INFO: renamed from: d */
    private final void m7625d(gyu gyuVar, goe goeVar) {
        goeVar.mo9302a();
        this.f14984e.mo7111d(gyuVar);
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: a */
    public final jwn mo7626a() {
        return this.f14983d;
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: b */
    public final jwn mo7627b() {
        return this.f14982c.mo7627b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gav, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [gyh, java.lang.Object] */
    @Override // p000.gbi
    /* JADX INFO: renamed from: c */
    public final void mo7628c(gbh gbhVar, glk glkVar) {
        glkVar.f25501b.mo9009b();
        goe goeVarMo9303a = this.f14981b.mo9303a();
        try {
            try {
                Future futureMo7687n = this.f14984e.mo7687n(glkVar);
                this.f14985f.m13537d(new eds(futureMo7687n, 7));
                glkVar.f25502c.mo9915u(new epj(futureMo7687n));
                this.f14982c.mo7628c(gkh.f25275b, glkVar);
                futureMo7687n.get();
                goeVarMo9303a.mo9302a();
                gbhVar.close();
            } catch (CancellationException e) {
                m7625d(glkVar.f25502c.mo9902h(), goeVarMo9303a);
                throw new InterruptedException("Error executing capture command.");
            } catch (ExecutionException e2) {
                m7625d(glkVar.f25502c.mo9902h(), goeVarMo9303a);
                throw new InterruptedException("Error executing capture command.");
            } catch (Exception e3) {
                m7625d(glkVar.f25502c.mo9902h(), goeVarMo9303a);
                throw e3;
            }
        } catch (Throwable th) {
            goeVarMo9303a.mo9302a();
            gbhVar.close();
            throw th;
        }
    }
}
