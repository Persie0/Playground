package p000;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class csd extends kfv {

    /* JADX INFO: renamed from: i */
    private static final nbh f9216i = nbh.m17259h("com/google/android/apps/camera/camcorder/camera2/CamcorderGlobalFrameListener");

    /* JADX INFO: renamed from: a */
    public final ConcurrentLinkedQueue f9217a = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: b */
    public final cdm f9218b;

    /* JADX INFO: renamed from: c */
    public final boolean f9219c;

    /* JADX INFO: renamed from: d */
    public final dhv f9220d;

    /* JADX INFO: renamed from: e */
    public final dnf f9221e;

    /* JADX INFO: renamed from: f */
    public final Handler f9222f;

    /* JADX INFO: renamed from: g */
    public cbt f9223g;

    /* JADX INFO: renamed from: h */
    public final fup f9224h;

    /* JADX INFO: renamed from: j */
    private final csl f9225j;

    /* JADX INFO: renamed from: k */
    private final ccs f9226k;

    /* JADX INFO: renamed from: l */
    private final mrm f9227l;

    /* JADX INFO: renamed from: m */
    private final dlc f9228m;

    public csd(csm csmVar, ccs ccsVar, fup fupVar, cgb cgbVar, cdm cdmVar, boolean z, dlc dlcVar, dhv dhvVar, dnf dnfVar) {
        this.f9225j = csmVar.m5464a();
        this.f9226k = ccsVar;
        this.f9224h = fupVar;
        this.f9227l = cgbVar.f5557b.mo3592c() ? mrm.m16829i(cgbVar) : mqu.f41450a;
        this.f9218b = cdmVar;
        this.f9219c = z;
        this.f9228m = dlcVar;
        this.f9220d = dhvVar;
        this.f9221e = dnfVar;
        kfv kfvVar = dnfVar.f12086c;
        this.f9222f = jvh.m13557e(Looper.getMainLooper());
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6175c();
        dhvVar.mo6175c();
        dhvVar.mo6175c();
        dhvVar.mo6175c();
    }

    /* JADX INFO: renamed from: p */
    private final boolean m5453p() {
        csj csjVar = (csj) ((jwf) this.f9225j.f9277g).f34942d;
        return csjVar == csj.f9247c || csjVar == csj.RECORDING_SESSION_ACTIVE;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: aZ */
    public final void mo5454aZ(kgg kggVar, long j) {
        if (m5453p()) {
            Iterator it = this.f9217a.iterator();
            while (it.hasNext()) {
                ((kfv) it.next()).mo5454aZ(kggVar, j);
            }
        }
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: ba */
    public final void mo5455ba(kll kllVar) {
        if (m5453p()) {
            ((nbe) ((nbe) f9216i.m17251b()).mo17276G((char) 570)).mo17293r("onCaptureFailed %s", kllVar);
        }
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final void mo3408bu(kpp kppVar) {
        if (m5453p()) {
            this.f9226k.mo3408bu(kppVar);
            if (kppVar.mo9517d(CaptureResult.CONTROL_AF_MODE) != null) {
                this.f9223g.mo3408bu(kppVar);
            }
            mrm mrmVar = this.f9227l;
            if (mrmVar.mo16813g()) {
                ((cgb) mrmVar.mo16809c()).mo3594a(kppVar);
            }
            Rect rect = (Rect) kppVar.mo9517d(CaptureResult.SCALER_CROP_REGION);
            if (rect != null) {
                this.f9225j.f9273c.mo3415bf(rect);
            }
            Long l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
            Long l2 = (Long) kppVar.mo9517d(CaptureResult.SENSOR_FRAME_DURATION);
            if (l != null && l2 != null) {
                this.f9228m.mo6329b(l.longValue(), l2.longValue());
            }
            Iterator it = this.f9217a.iterator();
            while (it.hasNext()) {
                ((kfv) it.next()).mo3408bu(kppVar);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final kba m5456f(kfv kfvVar) {
        this.f9217a.add(kfvVar);
        return new cic(this, kfvVar, 5, null);
    }
}
