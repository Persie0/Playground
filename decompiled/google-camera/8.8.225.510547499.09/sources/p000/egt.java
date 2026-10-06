package p000;

import android.content.Context;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.GrayImageS16;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class egt implements egk {

    /* JADX INFO: renamed from: a */
    public static final nbh f13998a = nbh.m17259h("com/google/android/apps/camera/hdrplus/fusion/zoom/FusionZoomController");

    /* JADX INFO: renamed from: b */
    public final jwf f13999b;

    /* JADX INFO: renamed from: d */
    public final kbz f14001d;

    /* JADX INFO: renamed from: e */
    public final dhv f14002e;

    /* JADX INFO: renamed from: f */
    public final gpx f14003f;

    /* JADX INFO: renamed from: h */
    public final Context f14005h;

    /* JADX INFO: renamed from: k */
    private final mrm f14008k;

    /* JADX INFO: renamed from: l */
    private final Executor f14009l;

    /* JADX INFO: renamed from: g */
    public final Object f14004g = new Object();

    /* JADX INFO: renamed from: c */
    public final nsk f14000c = new nsk();

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f14006i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j */
    public boolean f14007j = false;

    public egt(gpx gpxVar, Executor executor, jwf jwfVar, kbz kbzVar, mrm mrmVar, dhv dhvVar, Context context) {
        this.f14003f = gpxVar;
        this.f14009l = executor;
        this.f13999b = jwfVar;
        this.f14001d = kbzVar;
        this.f14008k = mrmVar;
        this.f14002e = dhvVar;
        this.f14005h = context;
    }

    /* JADX INFO: renamed from: a */
    public final String m7310a() {
        mrm mrmVar = this.f14008k;
        return mrmVar.mo16813g() ? ((File) mrmVar.mo16809c()).getAbsolutePath() : gBCSQzBeB.RnGuRNWF;
    }

    @Override // p000.egk
    /* JADX INFO: renamed from: b */
    public final void mo4170b(dzr dzrVar, gyh gyhVar) {
    }

    @Override // p000.egk
    /* JADX INFO: renamed from: c */
    public final void mo4171c() {
        this.f14009l.execute(new efd(this, 7));
    }

    /* JADX INFO: renamed from: d */
    public final void m7311d(long j, long j2, FusionProgressCallback fusionProgressCallback, ShotMetadata shotMetadata, String str) {
        this.f14001d.mo13961e("retrieveImage");
        if (j2 == -1) {
            this.f14001d.mo13962f();
            ((nbe) ((nbe) f13998a.m17252c()).mo17276G(1449)).mo17300y(HRLmc.DFgPxkk, str, j);
            return;
        }
        mrm mrmVarM17645a = this.f14000c.m17645a(j2);
        if (mrmVarM17645a.mo16813g()) {
            fusionProgressCallback.mo4181c((InterleavedImageU8) mrmVarM17645a.mo16809c(), new ShotMetadata(shotMetadata), str);
            this.f14001d.mo13962f();
        } else {
            this.f14001d.mo13962f();
            ((nbe) ((nbe) f13998a.m17252c()).mo17276G(1448)).mo17300y("Error retrieving debug image %s for shot %s", str, j);
        }
    }

    @Override // p000.egk
    /* JADX INFO: renamed from: e */
    public final nps mo4173e(long j, fvu fvuVar, egj egjVar, egj egjVar2, FusionProgressCallback fusionProgressCallback, kbc kbcVar) {
        mrm mrmVar = (mrm) egjVar.f13964b.map(egh.f13938d).orElse(mqu.f41450a);
        if (!mrmVar.mo16813g() || ((InterleavedImageU8) mrmVar.mo16809c()).m5008h()) {
            ((nbe) ((nbe) f13998a.m17251b()).mo17276G((char) 1442)).mo17290o("Missing primary image, releasing secondary images.");
            egjVar2.f13964b.ifPresent(cpf.f8557i);
            egjVar2.f13963a.ifPresent(cpf.f8558j);
            egjVar2.f13965c.ifPresent(cpf.f8559k);
            return kxk.m14964J(new UnsupportedOperationException("Primary image unavailable."));
        }
        if ((egjVar2.f13964b.isEmpty() || ((InterleavedImageU8) egjVar2.f13964b.get()).m5008h()) && (egjVar2.f13965c.isEmpty() || GcamModuleJNI.GrayImageS16_empty(0L, (GrayImageS16) egjVar2.f13965c.get()))) {
            ((nbe) ((nbe) f13998a.m17252c()).mo17276G((char) 1443)).mo17290o("Missing secondary image, effect not applied.");
            fusionProgressCallback.mo4182d(j, ihk.m11330i((InterleavedImageU8) mrmVar.mo16809c()), egjVar.f13966d);
            return kxk.m14965K(true);
        }
        nqf nqfVarM17621g = nqf.m17621g();
        this.f14009l.execute(new egs(this, j, mrmVar, fusionProgressCallback, egjVar, egjVar2, nqfVarM17621g));
        return nqfVarM17621g;
    }

    @Override // p000.egk
    /* JADX INFO: renamed from: g */
    public final int mo4175g(int i) {
        if (i == 0) {
            return 3;
        }
        ((nbe) ((nbe) f13998a.m17252c()).mo17276G(1440)).mo17291p("Unexpected fusion type for Fusion Zoom : %d", i);
        return 3;
    }

    @Override // p000.egk
    /* JADX INFO: renamed from: h */
    public final int mo4176h(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 201;
            case 2:
                return 202;
            case 3:
                return 203;
            case 4:
                return 204;
            case 5:
                return 205;
            case 6:
                return 206;
            case 7:
                return 207;
            case 8:
                return 208;
            case 9:
                return 209;
            case 10:
                return 210;
            default:
                return 4;
        }
    }
}
