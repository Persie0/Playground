package p000;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gjn implements gys {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicBoolean f25024a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ nps f25025b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ gji f25026c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ gjp f25027d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ glk f25028e;

    public gjn(gjp gjpVar, AtomicBoolean atomicBoolean, nps npsVar, gji gjiVar, glk glkVar, byte[] bArr, byte[] bArr2) {
        this.f25027d = gjpVar;
        this.f25024a = atomicBoolean;
        this.f25025b = npsVar;
        this.f25026c = gjiVar;
        this.f25028e = glkVar;
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo6399a() {
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [gav, java.lang.Object] */
    @Override // p000.gys
    /* JADX INFO: renamed from: b */
    public final void mo6400b() {
        if (this.f25024a.get()) {
            this.f25025b.cancel(true);
        } else {
            gji gjiVar = this.f25026c;
            gjiVar.f24983c = true;
            nxl nxlVar = gjiVar.f24985e;
            if (nxlVar != null) {
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                if (!nxlVar.f44974b.m18142ac()) {
                    nxlVar.mo18106p();
                }
                nhd nhdVar = (nhd) nxlVar.f44974b;
                nhd nhdVar2 = nhd.f42290d;
                nhdVar.f42292a |= 2;
                nhdVar.f42294c = jElapsedRealtimeNanos;
            }
            try {
                kfo kfoVar = gjiVar.f24984d;
                if (kfoVar != null) {
                    ((khm) kfoVar).f36060a.m14312f();
                } else {
                    ((nbe) ((nbe) gji.f24981a.m17251b()).mo17276G(2738)).mo17290o("FrameServerSession not provided. Failed to abort capture.");
                }
            } catch (kec e) {
                ((nbe) ((nbe) ((nbe) gji.f24981a.m17251b()).mo17283h(e)).mo17276G((char) 2739)).mo17290o("Failed to abort capture.");
            }
        }
        Object obj = this.f25027d.f25041c.f1685a;
        if (obj != null) {
            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
            nxl nxlVar2 = (nxl) obj;
            if (!nxlVar2.f44974b.m18142ac()) {
                nxlVar2.mo18106p();
            }
            nku nkuVar = (nku) nxlVar2.f44974b;
            nku nkuVar2 = nku.f43324g;
            nkuVar.f43326a |= 4;
            nkuVar.f43329d = jElapsedRealtimeNanos2;
        }
        this.f25028e.f25501b.mo9013f();
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo6401c(fcu fcuVar) {
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo6402d(Bitmap bitmap) {
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void mo6403e() {
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void mo6404f(mrm mrmVar) {
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void mo6405g(int i, int i2, Throwable th) {
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void mo6406h(int i, int i2, Throwable th) {
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void mo6407i(int i, int i2) {
    }

    @Override // p000.gys
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo6408j(int i, int i2) {
    }
}
