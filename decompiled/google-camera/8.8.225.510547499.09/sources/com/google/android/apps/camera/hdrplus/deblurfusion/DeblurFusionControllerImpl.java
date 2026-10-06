package com.google.android.apps.camera.hdrplus.deblurfusion;

import android.content.Context;
import com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.RawReadView;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.dht;
import p000.dhv;
import p000.dzk;
import p000.dzr;
import p000.efd;
import p000.efg;
import p000.egj;
import p000.egk;
import p000.fjp;
import p000.fvu;
import p000.gpx;
import p000.gyh;
import p000.jwf;
import p000.kbc;
import p000.kbz;
import p000.mrm;
import p000.nbe;
import p000.nbh;
import p000.nbz;
import p000.nch;
import p000.not;
import p000.nps;
import p000.nqf;
import p000.nsk;
import p000.oju;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class DeblurFusionControllerImpl implements egk {

    /* JADX INFO: renamed from: a */
    public static final nbh f6722a = nbh.m17259h("com/google/android/apps/camera/hdrplus/deblurfusion/DeblurFusionControllerImpl");

    /* JADX INFO: renamed from: b */
    public final gpx f6723b;

    /* JADX INFO: renamed from: c */
    public final kbz f6724c;

    /* JADX INFO: renamed from: g */
    public final jwf f6728g;

    /* JADX INFO: renamed from: h */
    public final dhv f6729h;

    /* JADX INFO: renamed from: i */
    public final Context f6730i;

    /* JADX INFO: renamed from: j */
    private final Executor f6731j;

    /* JADX INFO: renamed from: k */
    private final oju f6732k;

    /* JADX INFO: renamed from: e */
    public final Object f6726e = new Object();

    /* JADX INFO: renamed from: d */
    public final nsk f6725d = new nsk();

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f6727f = new AtomicBoolean(false);

    public DeblurFusionControllerImpl(gpx gpxVar, Executor executor, jwf jwfVar, kbz kbzVar, oju ojuVar, dhv dhvVar, Context context) {
        this.f6723b = gpxVar;
        this.f6731j = executor;
        this.f6728g = jwfVar;
        this.f6724c = kbzVar;
        this.f6732k = ojuVar;
        this.f6729h = dhvVar;
        this.f6730i = context;
    }

    public static native long deblurFaceImpl(long j, long j2, long j3, long j4, long j5, long j6, long j7, InterleavedU8ClientAllocator interleavedU8ClientAllocator, InterleavedU8ClientAllocator interleavedU8ClientAllocator2, boolean z, boolean z2, boolean z3, boolean z4, boolean[] zArr, long[] jArr, long[] jArr2, long[] jArr3, long j8, String str, boolean z5, boolean z6, boolean z7, int i, int i2, FusionProgressCallback fusionProgressCallback);

    public static native boolean initialize(String str, String str2);

    public static native boolean loadModelIntoCache(int i, long j, long j2);

    public static native int retrieveFusionType(long j);

    public static native long retrieveReferenceDebugImage(long j);

    public static native long retrieveResultImage(long j);

    public static native int retrieveResultStatus(long j);

    public static native long retrieveSourceDebugImage(long j);

    public static native long retrieveWarpedReferenceDebugImage(long j);

    /* JADX INFO: renamed from: a */
    public final String m4169a() {
        mrm mrmVarM8495b = ((fjp) this.f6732k).m8495b();
        return mrmVarM8495b.mo16813g() ? ((File) mrmVarM8495b.mo16809c()).getAbsolutePath() : "";
    }

    @Override // p000.egk
    /* JADX INFO: renamed from: b */
    public final void mo4170b(dzr dzrVar, gyh gyhVar) {
        dzrVar.mo6974c(gyhVar.mo9900f().f26832a, dzk.DEBLUR_FUSION);
        gyhVar.mo9905k().mo10400b();
    }

    @Override // p000.egk
    /* JADX INFO: renamed from: c */
    public final void mo4171c() {
        this.f6731j.execute(new efd(this, 3));
    }

    /* JADX INFO: renamed from: d */
    public final void m4172d(long j, long j2, int i, FusionProgressCallback fusionProgressCallback, ShotMetadata shotMetadata, String str, boolean z, boolean z2) {
        this.f6724c.mo13961e("retrieveImage");
        if (j2 == -1) {
            this.f6724c.mo13962f();
            ((nbe) ((nbe) f6722a.m17252c().mo17282g(nch.f41987a, "FalconController")).mo17276G((char) 1372)).mo17293r("Does not save debug image due to fallback %s", str);
            return;
        }
        mrm mrmVarM17645a = this.f6725d.m17645a(j2);
        if (!mrmVarM17645a.mo16813g()) {
            this.f6724c.mo13962f();
            ((nbe) ((nbe) f6722a.m17252c().mo17282g(nch.f41987a, "FalconController")).mo17276G((char) 1371)).mo17293r("Error retrieving debug image %s", str);
            return;
        }
        if (i != 0 && !z2) {
            ((InterleavedImageU8) mrmVarM17645a.mo16809c()).m5007g();
        } else if (z) {
            this.f6724c.mo13963g("onOriginalImage");
            fusionProgressCallback.mo4180b(j, (InterleavedImageU8) mrmVarM17645a.mo16809c(), new ShotMetadata(shotMetadata));
        } else {
            this.f6724c.mo13963g("onDebugImage");
            fusionProgressCallback.mo4181c((InterleavedImageU8) mrmVarM17645a.mo16809c(), new ShotMetadata(shotMetadata), str);
        }
        this.f6724c.mo13962f();
    }

    @Override // p000.egk
    /* JADX INFO: renamed from: e */
    public final nps mo4173e(long j, fvu fvuVar, egj egjVar, egj egjVar2, FusionProgressCallback fusionProgressCallback, kbc kbcVar) {
        m4174f();
        if (egjVar.f13963a.isEmpty() || ((RawReadView) egjVar.f13963a.get()).m5091b()) {
            ((nbe) ((nbe) f6722a.m17251b().mo17282g(nch.f41987a, "FalconController")).mo17276G((char) 1363)).mo17290o("Empty primary raw image.");
        }
        if (egjVar2.f13963a.isEmpty() || ((RawReadView) egjVar2.f13963a.get()).m5091b()) {
            ((nbe) ((nbe) f6722a.m17251b().mo17282g(nch.f41987a, "FalconController")).mo17276G((char) 1364)).mo17290o("Empty secondary raw image.");
        }
        nbz nbzVar = nch.f41987a;
        nqf nqfVarM17621g = nqf.m17621g();
        this.f6731j.execute(new efg(this, j, egjVar, egjVar2, fvuVar, kbcVar, fusionProgressCallback, nqfVarM17621g));
        nqfVarM17621g.mo2282d(new efd(this, 4), not.INSTANCE);
        return nqfVarM17621g;
    }

    /* JADX INFO: renamed from: f */
    public final void m4174f() {
        dhv dhvVar = this.f6729h;
        String str = dht.f11173a;
        dhvVar.mo6177e();
    }

    @Override // p000.egk
    /* JADX INFO: renamed from: g */
    public final int mo4175g(int i) {
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 4;
            default:
                return 1;
        }
    }

    @Override // p000.egk
    /* JADX INFO: renamed from: h */
    public final int mo4176h(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 7;
            case 5:
                return 8;
            case 6:
                return 9;
            case 7:
                return 10;
            case 8:
                return 11;
            case 9:
                return 12;
            case 10:
                return 13;
            case 11:
                return 14;
            case 12:
                return 15;
            case 13:
                return 16;
            case 14:
                return 17;
            case 15:
                return 18;
            case 16:
                return 19;
            case 17:
                return 20;
            default:
                return 4;
        }
    }
}
