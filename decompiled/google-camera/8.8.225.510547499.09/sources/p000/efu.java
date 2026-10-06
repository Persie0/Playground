package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class efu implements efx {

    /* JADX INFO: renamed from: a */
    public static final nbh f13876a = nbh.m17259h("com/google/android/apps/camera/hdrplus/deblurfusion/PostProcessingFusionImageSaverImpl");

    /* JADX INFO: renamed from: b */
    public final ohb f13877b;

    /* JADX INFO: renamed from: c */
    public final dzr f13878c;

    /* JADX INFO: renamed from: d */
    public final Executor f13879d;

    /* JADX INFO: renamed from: e */
    public final dhv f13880e;

    /* JADX INFO: renamed from: f */
    public final kbz f13881f;

    /* JADX INFO: renamed from: g */
    public final kbc f13882g;

    /* JADX INFO: renamed from: k */
    public final inm f13886k;

    /* JADX INFO: renamed from: l */
    public final jwn f13887l;

    /* JADX INFO: renamed from: m */
    public final fvu f13888m;

    /* JADX INFO: renamed from: n */
    private final mrm f13889n;

    /* JADX INFO: renamed from: o */
    private final mrm f13890o;

    /* JADX INFO: renamed from: p */
    private final gkz f13891p;

    /* JADX INFO: renamed from: h */
    public final AtomicLong f13883h = new AtomicLong(0);

    /* JADX INFO: renamed from: j */
    public final fxs f13885j = new fxs(1);

    /* JADX INFO: renamed from: i */
    public final Map f13884i = new HashMap();

    public efu(mrm mrmVar, mrm mrmVar2, fvu fvuVar, gkz gkzVar, ohb ohbVar, dzr dzrVar, Executor executor, dhv dhvVar, kbz kbzVar, gdz gdzVar, inm inmVar, jwn jwnVar, byte[] bArr, byte[] bArr2) {
        this.f13889n = mrmVar;
        this.f13890o = mrmVar2;
        this.f13888m = fvuVar;
        this.f13891p = gkzVar;
        this.f13877b = ohbVar;
        this.f13878c = dzrVar;
        this.f13879d = executor;
        this.f13880e = dhvVar;
        this.f13881f = kbzVar;
        this.f13882g = gdzVar.f24348b;
        this.f13886k = inmVar;
        this.f13887l = jwnVar;
    }

    @Override // p000.fzu
    /* JADX INFO: renamed from: a */
    public final fzt mo3603a(glk glkVar) {
        throw new IllegalStateException("Method not supported");
    }

    @Override // p000.fzu
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final edy mo3604b(glk glkVar) {
        throw new IllegalStateException("Method not supported");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [gyh, java.lang.Object] */
    @Override // p000.edw
    /* JADX INFO: renamed from: d */
    public final edy mo7185d(glk glkVar, egl eglVar) {
        egk egkVar;
        ebn ebnVarM9396a = this.f13891p.m9396a();
        String strMo9913s = glkVar.f25502c.mo9913s();
        eft eftVar = (eft) this.f13884i.get(strMo9913s);
        if (eftVar != null) {
            return eftVar;
        }
        if (eglVar == egl.DEBLUR) {
            lku.m15613H(this.f13889n.mo16813g());
            egkVar = (egk) this.f13889n.mo16809c();
        } else {
            if (eglVar != egl.ZOOM) {
                throw new IllegalArgumentException("Unsupported fusion mode: " + String.valueOf(eglVar) + " for session " + String.valueOf(glkVar.f25502c.mo9902h()));
            }
            lku.m15613H(this.f13890o.mo16813g());
            egkVar = (egk) this.f13890o.mo16809c();
        }
        eft eftVar2 = new eft(this, glkVar, ebnVarM9396a, egkVar, null, null);
        this.f13884i.put(strMo9913s, eftVar2);
        return eftVar2;
    }
}
