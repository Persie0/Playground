package p000;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cgj implements kfb {

    /* JADX INFO: renamed from: a */
    public static final nbh f5608a = nbh.m17259h("com/google/android/apps/camera/aizoom/AiZoomBufferListener");

    /* JADX INFO: renamed from: b */
    public final cgu f5609b;

    /* JADX INFO: renamed from: c */
    public final Executor f5610c;

    /* JADX INFO: renamed from: d */
    public final String f5611d;

    /* JADX INFO: renamed from: e */
    public final gva f5612e;

    /* JADX INFO: renamed from: f */
    private final Map f5613f;

    /* JADX INFO: renamed from: g */
    private final glk f5614g;

    /* JADX INFO: renamed from: h */
    private final boolean f5615h;

    /* JADX INFO: renamed from: i */
    private kfc f5616i;

    public cgj(mwx mwxVar, glk glkVar, cgu cguVar, gva gvaVar, Executor executor, dhv dhvVar, mrm mrmVar, byte[] bArr) {
        this.f5613f = mwxVar;
        this.f5614g = glkVar;
        this.f5609b = cguVar;
        this.f5612e = gvaVar;
        this.f5610c = executor;
        this.f5615h = dhvVar.mo6183k(dib.f11319bZ);
        this.f5611d = mrmVar.mo16813g() ? ((kgg) mrmVar.mo16809c()).mo14193c().f36540a : "";
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, oju] */
    /* JADX INFO: renamed from: a */
    public final synchronized void m3623a() {
        if (this.f5613f.isEmpty()) {
            ((nbe) ((nbe) f5608a.m17252c().mo17282g(nch.f41987a, "BobaBufferListener")).mo17276G('Q')).mo17290o("No preview streams available!");
            return;
        }
        glk glkVar = this.f5614g;
        Map map = this.f5613f;
        kfk kfkVar = (kfk) glkVar.f25500a.get();
        kfkVar.getClass();
        jwn jwnVar = (jwn) glkVar.f25501b.get();
        jwnVar.getClass();
        jvb jvbVar = (jvb) glkVar.f25502c.get();
        jvbVar.getClass();
        Executor executor = (Executor) glkVar.f25503d.get();
        executor.getClass();
        map.getClass();
        this.f5616i = new glj(kfkVar, jwnVar, jvbVar, executor, map, 2, null);
        if (!this.f5615h) {
            ((nbe) ((nbe) f5608a.m17252c().mo17282g(nch.f41987a, "BobaBufferListener")).mo17276G('O')).mo17290o("Rendering is disabled!!");
            return;
        }
        nbz nbzVar = nch.f41987a;
        kfc kfcVar = this.f5616i;
        kfcVar.getClass();
        kfcVar.mo9411k(this);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m3624b() {
        if (this.f5616i == null) {
            nbz nbzVar = nch.f41987a;
            return;
        }
        nbz nbzVar2 = nch.f41987a;
        kfc kfcVar = this.f5616i;
        kfcVar.getClass();
        kfcVar.mo9412l(this);
        kfc kfcVar2 = this.f5616i;
        kfcVar2.getClass();
        kfcVar2.close();
    }

    @Override // p000.kfb
    /* JADX INFO: renamed from: c */
    public final void mo3625c(kiq kiqVar) {
        kfd kfdVarM14358b = kiqVar.m14358b();
        if (kfdVarM14358b == null || kfdVarM14358b.f35812c % 2 == 0) {
            return;
        }
        kfv.m14174w(kiqVar, new clf(this, 1));
    }
}
