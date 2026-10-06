package p000;

import android.content.Context;
import android.os.Trace;
import android.util.Log;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.android.libraries.vision.smartcapture.BurstCurator;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gtw implements dyp, kba {

    /* JADX INFO: renamed from: a */
    private static final nbh f26413a = nbh.m17259h("com/google/android/apps/camera/qualityscore/SmartCaptureFrameQualityScorer");

    /* JADX INFO: renamed from: b */
    private final nps f26414b;

    /* JADX INFO: renamed from: c */
    private final boolean f26415c;

    /* JADX INFO: renamed from: d */
    private final mrm f26416d;

    /* JADX INFO: renamed from: e */
    private final AtomicBoolean f26417e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    private mrm f26418f;

    /* JADX INFO: renamed from: g */
    private boolean f26419g;

    private gtw(nps npsVar, boolean z, boolean z2, mrm mrmVar) {
        mqu mquVar = mqu.f41450a;
        this.f26418f = mquVar;
        this.f26419g = false;
        this.f26414b = npsVar;
        this.f26415c = z;
        if (z2) {
            this.f26416d = mrm.m16829i(gtr.m9767b());
        } else {
            this.f26416d = mquVar;
        }
        this.f26418f = mrmVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX INFO: renamed from: a */
    public static gtw m9769a(final Context context, dhv dhvVar, kmd kmdVar, Executor executor, final kbz kbzVar, boolean z, mrm mrmVar, mrm mrmVar2) {
        final boolean z2;
        boolean z3;
        final boolean z4;
        final boolean z5;
        final int i;
        final boolean zMo6184l = dhvVar.mo6184l(dhs.f11166d);
        if (z) {
            z2 = !mrmVar.mo16813g();
        } else {
            dhvVar.mo6177e();
            z2 = false;
        }
        dhvVar.mo6177e();
        boolean z6 = kmdVar.mo14558k() == kmq.f36557a;
        if (z6) {
            if (dhvVar.mo6184l(dij.f11578b)) {
                dhvVar.mo6177e();
                z3 = true;
            } else {
                z3 = false;
            }
        } else if (dhvVar.mo6184l(dij.f11579c)) {
            dhvVar.mo6177e();
            z3 = true;
        } else {
            z3 = false;
        }
        if (dhvVar.mo6184l(dij.f11580d)) {
            dhvVar.mo6177e();
            z4 = true;
        } else {
            z4 = false;
        }
        boolean zMo6184l2 = dhvVar.mo6184l(dij.f11568R);
        final boolean zMo6184l3 = z6 ? dhvVar.mo6184l(dij.f11581e) : dhvVar.mo6184l(dij.f11582f);
        boolean zMo6184l4 = z6 ? dhvVar.mo6184l(dij.f11583g) : dhvVar.mo6184l(dij.f11584h);
        if (dhvVar.mo6184l(dij.f11586j)) {
            dhvVar.mo6177e();
            z5 = true;
        } else {
            z5 = false;
        }
        dhvVar.mo6177e();
        if (dhvVar.mo6184l(dij.f11588l)) {
            i = 3;
        } else {
            i = dhvVar.mo6184l(dij.f11587k) ? 2 : 1;
        }
        int i2 = true != dhvVar.mo6184l(dij.f11589m) ? 2 : 5;
        long millis = TimeUnit.DAYS.toMillis(180L);
        final long jLongValue = ((Long) dhvVar.mo6173a(dhs.f11163a).map(new gtu(millis, 0)).orElse(Long.valueOf(millis))).longValue();
        final boolean z7 = z3;
        final boolean z8 = zMo6184l4;
        boolean z9 = z3;
        final int i3 = i2;
        return new gtw(kxk.m14970P(new nol() { // from class: gtv
            @Override // p000.nol
            /* JADX INFO: renamed from: a */
            public final nps mo3988a() throws Throwable {
                kbz kbzVar2;
                Context context2 = context;
                kbz kbzVar3 = kbzVar;
                boolean z10 = zMo6184l;
                long j = jLongValue;
                boolean z11 = z5;
                boolean z12 = z2;
                boolean z13 = z7;
                int i4 = i;
                boolean z14 = z4;
                boolean z15 = zMo6184l3;
                boolean z16 = z8;
                int i5 = i3;
                lku.m15614I(!context2.isDeviceProtectedStorage(), "Must use credential protected storage");
                try {
                    kbzVar3.mo13961e("SmartCaptureFQS#curator");
                    String str = z10 ? "FaceFamiliarityProcessorVMImpl" : "";
                    nxl nxlVarM18137O = oed.f45705i.m18137O();
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nxq nxqVar = nxlVarM18137O.f44974b;
                    oed oedVar = (oed) nxqVar;
                    kbzVar2 = kbzVar3;
                    try {
                        oedVar.f45707a |= 4;
                        oedVar.f45709c = str;
                        if (!nxqVar.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        oed oedVar2 = (oed) nxlVarM18137O.f44974b;
                        oedVar2.f45707a |= 262144;
                        oedVar2.f45714h = j;
                        oed oedVar3 = (oed) nxlVarM18137O.mo18103l();
                        String str2 = z11 ? "SmartCaptureFaceAttributesV2Client" : gBCSQzBeB.OeWGlvpV;
                        nxn nxnVar = (nxn) oce.f45447c.m18137O();
                        if (!nxnVar.f44974b.m18142ac()) {
                            nxnVar.mo18106p();
                        }
                        oce oceVar = (oce) nxnVar.f44974b;
                        oceVar.f45449a |= 1;
                        oceVar.f45450b = str2;
                        oce oceVar2 = (oce) nxnVar.mo18103l();
                        nxl nxlVarM18137O2 = odq.f45654r.m18137O();
                        String absolutePath = context2.getFilesDir().getAbsolutePath();
                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        odq odqVar = (odq) nxlVarM18137O2.f44974b;
                        absolutePath.getClass();
                        odqVar.f45656a |= 4194304;
                        odqVar.f45667l = absolutePath;
                        String absolutePath2 = context2.getNoBackupFilesDir().getAbsolutePath();
                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        odq odqVar2 = (odq) nxlVarM18137O2.f44974b;
                        absolutePath2.getClass();
                        odqVar2.f45656a |= 8388608;
                        odqVar2.f45668m = absolutePath2;
                        String absolutePath3 = context2.getCacheDir().getAbsolutePath();
                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nxq nxqVar2 = nxlVarM18137O2.f44974b;
                        odq odqVar3 = (odq) nxqVar2;
                        absolutePath3.getClass();
                        odqVar3.f45656a |= 16777216;
                        odqVar3.f45669n = absolutePath3;
                        if (!nxqVar2.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nxq nxqVar3 = nxlVarM18137O2.f44974b;
                        odq odqVar4 = (odq) nxqVar3;
                        odqVar4.f45656a |= 64;
                        odqVar4.f45662g = 3;
                        if (!nxqVar3.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        odq odqVar5 = (odq) nxlVarM18137O2.f44974b;
                        oceVar2.getClass();
                        nxy nxyVar = odqVar5.f45657b;
                        if (!nxyVar.mo17770c()) {
                            odqVar5.f45657b = nxq.m18127U(nxyVar);
                        }
                        odqVar5.f45657b.add(oceVar2);
                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nxq nxqVar4 = nxlVarM18137O2.f44974b;
                        odq odqVar6 = (odq) nxqVar4;
                        odqVar6.f45661f = 3;
                        odqVar6.f45656a |= 32;
                        if (!nxqVar4.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nxq nxqVar5 = nxlVarM18137O2.f44974b;
                        odq odqVar7 = (odq) nxqVar5;
                        odqVar7.f45656a |= 33554432;
                        odqVar7.f45670o = z12;
                        if (!nxqVar5.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nxq nxqVar6 = nxlVarM18137O2.f44974b;
                        odq odqVar8 = (odq) nxqVar6;
                        oedVar3.getClass();
                        odqVar8.f45672q = oedVar3;
                        odqVar8.f45656a |= 134217728;
                        if (!nxqVar6.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nxq nxqVar7 = nxlVarM18137O2.f44974b;
                        odq odqVar9 = (odq) nxqVar7;
                        odqVar9.f45656a |= 512;
                        odqVar9.f45663h = z13;
                        if (!nxqVar7.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nxq nxqVar8 = nxlVarM18137O2.f44974b;
                        odq odqVar10 = (odq) nxqVar8;
                        odqVar10.f45656a |= 8192;
                        odqVar10.f45665j = false;
                        if (!nxqVar8.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nxq nxqVar9 = nxlVarM18137O2.f44974b;
                        odq odqVar11 = (odq) nxqVar9;
                        odqVar11.f45666k = i4 - 1;
                        odqVar11.f45656a |= 16384;
                        if (!nxqVar9.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nxq nxqVar10 = nxlVarM18137O2.f44974b;
                        odq odqVar12 = (odq) nxqVar10;
                        odqVar12.f45656a |= 4096;
                        odqVar12.f45664i = z14;
                        if (!nxqVar10.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nxq nxqVar11 = nxlVarM18137O2.f44974b;
                        odq odqVar13 = (odq) nxqVar11;
                        odqVar13.f45656a |= 2;
                        odqVar13.f45659d = z15;
                        if (!nxqVar11.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nxq nxqVar12 = nxlVarM18137O2.f44974b;
                        odq odqVar14 = (odq) nxqVar12;
                        odqVar14.f45656a |= 4;
                        odqVar14.f45660e = z16;
                        if (!nxqVar12.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        nxq nxqVar13 = nxlVarM18137O2.f44974b;
                        odq odqVar15 = (odq) nxqVar13;
                        odqVar15.f45658c = i5 - 1;
                        odqVar15.f45656a |= 1;
                        if (!nxqVar13.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        odq odqVar16 = (odq) nxlVarM18137O2.f44974b;
                        odqVar16.f45656a |= 67108864;
                        odqVar16.f45671p = true;
                        nps npsVarM14965K = kxk.m14965K(new BurstCurator(BurstCurator.nativeCreateFromOptions(((odq) nxlVarM18137O2.mo18103l()).mo17760J())));
                        kbzVar2.mo13962f();
                        return npsVarM14965K;
                    } catch (Throwable th) {
                        th = th;
                        kbzVar2.mo13962f();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    kbzVar2 = kbzVar3;
                }
            }
        }, executor), z9, zMo6184l2, mrmVar);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.f26419g) {
            this.f26419g = true;
            jvh.m13561i(this.f26414b, new gjd(this, 2));
        }
    }

    @Override // p000.dyp
    /* JADX INFO: renamed from: e */
    public final void mo6926e() {
        this.f26417e.set(true);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized mrm m9770b(kpw kpwVar, gsr gsrVar, boolean z) {
        odh odhVar;
        jzk jzkVarMo6934a;
        ocd ocdVarM6712b = null;
        BurstCurator burstCurator = this.f26419g ? null : (BurstCurator) jvh.m13560h(this.f26414b);
        if (burstCurator == null || kpwVar == null) {
            ((nbe) ((nbe) f26413a.m17251b()).mo17276G((char) 3243)).mo17290o("Input frame and metadata cannot be null.");
            return mqu.f41450a;
        }
        if (gsrVar.f26255o == null) {
            ((nbe) ((nbe) f26413a.m17251b()).mo17276G((char) 3248)).mo17290o("Sensor region cannot be null.");
            return mqu.f41450a;
        }
        gsu[] gsuVarArr = gsrVar.f26257q;
        if (gsuVarArr == null) {
            ((nbe) ((nbe) f26413a.m17251b()).mo17276G((char) 3247)).mo17290o("Faces array cannot be null.");
            return mqu.f41450a;
        }
        if (gsuVarArr.length == 0 && !this.f26415c) {
            return mqu.f41450a;
        }
        float fMo7247c = kpwVar.mo7247c();
        float fWidth = gsrVar.f26260t.width();
        float fMo7246b = kpwVar.mo7246b();
        float fHeight = gsrVar.f26260t.height();
        boolean andSet = !gsrVar.f26258r ? this.f26417e.getAndSet(false) : false;
        nxl nxlVarM18137O = odp.f45650c.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        odp odpVar = (odp) nxlVarM18137O.f44974b;
        odpVar.f45652a |= 1;
        odpVar.f45653b = andSet;
        odp odpVar2 = (odp) nxlVarM18137O.mo18103l();
        nxl nxlVarM18137O2 = odb.f45576k.m18137O();
        int i = 360 - gsrVar.f26259s;
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        float f = fMo7247c / fWidth;
        float f2 = fMo7246b / fHeight;
        odb odbVar = (odb) nxlVarM18137O2.f44974b;
        odbVar.f45578a |= 4;
        odbVar.f45580c = i % 360;
        odb odbVar2 = (odb) nxlVarM18137O2.mo18103l();
        if (this.f26418f.mo16813g() && (jzkVarMo6934a = ((dyl) this.f26418f.mo16809c()).mo6934a(gsrVar.f26243c)) != null) {
            ocdVarM6712b = dsy.m6713c(gsrVar, jzkVarMo6934a, f, f2);
        }
        if (ocdVarM6712b == null) {
            ocdVarM6712b = dsy.m6712b(gsrVar, f, f2);
        }
        nxl nxlVarM18137O3 = odh.f45607m.m18137O();
        long j = gsrVar.f26243c;
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O3.f44974b;
        odh odhVar2 = (odh) nxqVar;
        odhVar2.f45609a |= 2;
        odhVar2.f45611c = j;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O3.f44974b;
        odh odhVar3 = (odh) nxqVar2;
        ocdVarM6712b.getClass();
        odhVar3.f45613e = ocdVarM6712b;
        odhVar3.f45609a |= 64;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O3.f44974b;
        odh odhVar4 = (odh) nxqVar3;
        odbVar2.getClass();
        odhVar4.f45612d = odbVar2;
        odhVar4.f45609a |= 32;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nxq nxqVar4 = nxlVarM18137O3.f44974b;
        odh odhVar5 = (odh) nxqVar4;
        odpVar2.getClass();
        odhVar5.f45619k = odpVar2;
        odhVar5.f45609a |= 2097152;
        if (z) {
            boolean z2 = gsrVar.f26258r;
            if (!z2) {
                mrm mrmVar = this.f26416d;
                if (mrmVar.mo16813g()) {
                    z2 = !((gtr) mrmVar.mo16809c()).m9768a(gsrVar.f26243c);
                }
            }
            if (!nxlVarM18137O3.f44974b.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            odh odhVar6 = (odh) nxlVarM18137O3.f44974b;
            odhVar6.f45609a |= 512;
            odhVar6.f45614f = z2;
            if (z2) {
                odh odhVar7 = (odh) nxlVarM18137O3.mo18103l();
                lku.m15614I(!burstCurator.f7970c, "BurstCurator closed");
                Trace.beginSection("BurstCurator.toByteArray");
                byte[] bArrMo17760J = odhVar7.mo17760J();
                Trace.endSection();
                Trace.beginSection("BurstCurator.processYUVFrame");
                byte[] bArrNativeProcessMetadata = burstCurator.nativeProcessMetadata(burstCurator.f7969b, bArrMo17760J);
                Trace.endSection();
                Trace.beginSection("BurstCurator.parseFrom");
                try {
                    nxq nxqVarM18123Q = nxq.m18123Q(odh.f45607m, bArrNativeProcessMetadata, 0, bArrNativeProcessMetadata.length, burstCurator.f7968a);
                    nxq.m18132ae(nxqVarM18123Q);
                    odhVar7 = (odh) nxqVarM18123Q;
                } catch (nyb e) {
                    Log.e("BURST_CURATOR", "Proto serialization error.");
                }
                Trace.endSection();
                return mrm.m16829i(new gtt(odhVar7));
            }
            throw th;
        }
        if (!nxqVar4.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        odh odhVar8 = (odh) nxlVarM18137O3.f44974b;
        odhVar8.f45609a |= 512;
        odhVar8.f45614f = false;
        odh odhVar9 = (odh) nxlVarM18137O3.mo18103l();
        try {
            List listMo7251g = kpwVar.mo7251g();
            kpv kpvVar = (kpv) listMo7251g.get(0);
            kpv kpvVar2 = (kpv) listMo7251g.get(1);
            kpv kpvVar3 = (kpv) listMo7251g.get(2);
            ByteBuffer buffer = kpvVar.getBuffer();
            int pixelStride = kpvVar.getPixelStride();
            int rowStride = kpvVar.getRowStride();
            ByteBuffer buffer2 = kpvVar2.getBuffer();
            int pixelStride2 = kpvVar2.getPixelStride();
            int rowStride2 = kpvVar2.getRowStride();
            ByteBuffer buffer3 = kpvVar3.getBuffer();
            int pixelStride3 = kpvVar3.getPixelStride();
            int rowStride3 = kpvVar3.getRowStride();
            int iMo7247c = kpwVar.mo7247c();
            int iMo7246b = kpwVar.mo7246b();
            int iMo7245a = kpwVar.mo7245a();
            lku.m15614I(!burstCurator.f7970c, "BurstCurator closed");
            if (!buffer.isDirect() || !buffer2.isDirect() || !buffer3.isDirect()) {
                throw new IllegalArgumentException("Only direct buffers are currently supported");
            }
            Trace.beginSection("BurstCurator.toByteArray");
            byte[] bArrMo17760J2 = odhVar9.mo17760J();
            Trace.endSection();
            Trace.beginSection("BurstCurator.processYUVFrame");
            byte[] bArrNativeProcessYUV = burstCurator.nativeProcessYUV(burstCurator.f7969b, buffer, pixelStride, rowStride, buffer2, pixelStride2, rowStride2, buffer3, pixelStride3, rowStride3, iMo7247c, iMo7246b, bArrMo17760J2, iMo7245a);
            Trace.endSection();
            Trace.beginSection("BurstCurator.parseFrom");
            try {
                nxq nxqVarM18123Q2 = nxq.m18123Q(odh.f45607m, bArrNativeProcessYUV, 0, bArrNativeProcessYUV.length, burstCurator.f7968a);
                nxq.m18132ae(nxqVarM18123Q2);
                odhVar = (odh) nxqVarM18123Q2;
            } catch (nyb e2) {
                Log.e("BURST_CURATOR", "Proto serialization error.");
                odhVar = odhVar9;
            }
            Trace.endSection();
            return mrm.m16829i(new gtt(odhVar));
        } catch (IllegalStateException e3) {
            ((nbe) ((nbe) ((nbe) f26413a.m17251b()).mo17283h(e3)).mo17276G((char) 3246)).mo17290o("Couldn't get planes for analysis.");
            return mqu.f41450a;
        }
    }
}
