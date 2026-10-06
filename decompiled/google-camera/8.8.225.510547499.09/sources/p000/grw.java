package p000;

import android.os.SystemClock;
import com.google.android.apps.camera.processing.imagebackend.ImgUtilNative;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class grw extends grv {

    /* JADX INFO: renamed from: a */
    private final grn f26191a;

    /* JADX INFO: renamed from: b */
    private final fct f26192b;

    /* JADX INFO: renamed from: i */
    private final kbz f26193i;

    /* JADX INFO: renamed from: j */
    private final gro f26194j;

    public grw(grm grmVar, Executor executor, grk grkVar, grn grnVar, gyh gyhVar, gro groVar, fct fctVar, kbz kbzVar) {
        super(grmVar, executor, grkVar, 1, gyhVar);
        this.f26191a = grnVar;
        this.f26194j = groVar;
        this.f26192b = fctVar;
        this.f26193i = kbzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26193i.mo13961e("LuckyShot");
        nxl nxlVarM18137O = nkj.f43213d.m18137O();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nkj nkjVar = (nkj) nxlVarM18137O.f44974b;
        nkjVar.f43215a |= 1;
        nkjVar.f43216b = jElapsedRealtimeNanos;
        gro groVar = this.f26194j;
        grm grmVar = this.f26188f;
        long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
        groVar.f26170b.mo13961e("LuckyShotScore");
        kpw kpwVar = grmVar.f26152a;
        kpv kpvVar = (kpv) kpwVar.mo7251g().get(0);
        double dMeasureSharpnessOnEdgeGivenCropNative = ImgUtilNative.measureSharpnessOnEdgeGivenCropNative(kpwVar.mo7247c(), kpwVar.mo7246b(), kpvVar.getBuffer(), kpvVar.getPixelStride(), kpvVar.getRowStride(), grmVar.f26156e.left, grmVar.f26156e.top, grmVar.f26156e.right, grmVar.f26156e.bottom);
        groVar.f26170b.mo13962f();
        if (dMeasureSharpnessOnEdgeGivenCropNative <= 0.0d) {
            ((nbe) ((nbe) gro.f26169a.m17252c()).mo17276G((char) 3216)).mo17290o("invalid metric value from LS metric calculation.");
        }
        mrm mrmVarM16829i = mrm.m16829i(new fcr(fcs.LUCKY_SHOT_DEFAULT_METRIC, (float) dMeasureSharpnessOnEdgeGivenCropNative, SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos2));
        long jElapsedRealtimeNanos3 = SystemClock.elapsedRealtimeNanos();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nkj nkjVar2 = (nkj) nxlVarM18137O.f44974b;
        nkjVar2.f43215a |= 2;
        nkjVar2.f43217c = jElapsedRealtimeNanos3;
        fct fctVar = this.f26192b;
        nkj nkjVar3 = (nkj) nxlVarM18137O.mo18103l();
        synchronized (fctVar.f21282a) {
            if (fctVar.f21287f == null) {
                fctVar.f21287f = new ArrayList();
            }
            fctVar.f21287f.add(nkjVar3);
        }
        grm grmVarM9675d = this.f26191a.m9675d(this.f26188f, dMeasureSharpnessOnEdgeGivenCropNative);
        fct fctVar2 = this.f26192b;
        fcr fcrVar = (fcr) ((mrq) mrmVarM16829i).f41482a;
        nxl nxlVarM18137O2 = nkh.f43200g.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O2.f44974b;
        nkh nkhVar = (nkh) nxqVar;
        nkhVar.f43202a |= 1;
        nkhVar.f43203b = -1;
        float f = fcrVar.f21275b;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O2.f44974b;
        nkh nkhVar2 = (nkh) nxqVar2;
        nkhVar2.f43202a |= 2;
        nkhVar2.f43204c = f;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O2.f44974b;
        nkh nkhVar3 = (nkh) nxqVar3;
        nkhVar3.f43202a |= 4;
        nkhVar3.f43205d = 0.0f;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar4 = nxlVarM18137O2.f44974b;
        nkh nkhVar4 = (nkh) nxqVar4;
        nkhVar4.f43202a |= 8;
        nkhVar4.f43206e = 0.0f;
        long j = fcrVar.f21276c;
        if (!nxqVar4.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nkh nkhVar5 = (nkh) nxlVarM18137O2.f44974b;
        nkhVar5.f43202a |= 16;
        nkhVar5.f43207f = j;
        nkh nkhVar6 = (nkh) nxlVarM18137O2.mo18103l();
        fcs fcsVar = fcrVar.f21274a;
        synchronized (fctVar2.f21282a) {
            fctVar2.f21283b.add(nkhVar6);
            fctVar2.f21284c.add(fcsVar);
        }
        if (grmVarM9675d != null) {
            this.f26185c.mo9662b(grmVarM9675d.f26152a, this.f26186d);
        }
        this.f26193i.mo13962f();
    }
}
