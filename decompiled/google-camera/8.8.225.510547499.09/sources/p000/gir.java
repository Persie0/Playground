package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gir {

    /* JADX INFO: renamed from: a */
    public static final nbh f24911a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/commands/AfDebugMetadataFetcherShutterAsap");

    /* JADX INFO: renamed from: b */
    public final kfk f24912b;

    /* JADX INFO: renamed from: c */
    public final kbz f24913c;

    /* JADX INFO: renamed from: d */
    private final boolean f24914d;

    /* JADX INFO: renamed from: e */
    private final Executor f24915e;

    /* JADX INFO: renamed from: f */
    private final dhv f24916f;

    public gir(kfk kfkVar, dhv dhvVar, kbz kbzVar, Executor executor) {
        this.f24912b = kfkVar;
        this.f24913c = kbzVar;
        this.f24915e = executor;
        this.f24916f = dhvVar;
        this.f24914d = ((Boolean) dhvVar.mo6173a(did.f11416a).map(egh.f13947m).orElse(false)).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static void m9292c(kfo kfoVar, gyh gyhVar) {
        int i = gyhVar.mo9902h().f26874a;
        kfoVar.mo14161j(mxk.m17136H(kgq.m14215e(ivt.f32353g, 2)), new giq(gyhVar));
    }

    /* JADX INFO: renamed from: d */
    private final boolean m9293d() {
        return this.f24914d && ivt.f32353g != null;
    }

    /* JADX INFO: renamed from: e */
    private final boolean m9294e() {
        return this.f24916f.mo6184l(dib.f11243aC) && ivy.f32453a != null;
    }

    /* JADX INFO: renamed from: a */
    public final void m9295a(kfo kfoVar, gyh gyhVar) {
        kbz kbzVar;
        gyhVar.mo9883O(false);
        if (!m9293d() || m9294e()) {
            return;
        }
        this.f24913c.mo13961e("AfDebugFetch#request");
        try {
            try {
                m9292c(kfoVar, gyhVar);
                kbzVar = this.f24913c;
            } catch (kec e) {
                ((nbe) ((nbe) ((nbe) f24911a.m17251b()).mo17283h(e)).mo17276G(2685)).mo17290o("Error submitting 3A debug metadata request.");
                kbzVar = this.f24913c;
            }
            kbzVar.mo13962f();
        } catch (Throwable th) {
            this.f24913c.mo13962f();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9296b(gyh gyhVar) {
        gyhVar.mo9883O(false);
        if (!m9293d() || m9294e()) {
            return;
        }
        this.f24915e.execute(new fro(this, gyhVar, 15));
    }
}
