package p000;

import android.hardware.camera2.CaptureResult;
import com.google.googlex.gcam.FrameMetadata;
import java.util.HashMap;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class epf implements kfb, equ {

    /* JADX INFO: renamed from: a */
    public static final nbh f14961a = nbh.m17259h("com/google/android/apps/camera/lasagna/MotionBlurBufferListener");

    /* JADX INFO: renamed from: b */
    public final eqv f14962b;

    /* JADX INFO: renamed from: c */
    public final nta f14963c;

    /* JADX INFO: renamed from: d */
    public final kbz f14964d;

    /* JADX INFO: renamed from: e */
    public final HashMap f14965e = new HashMap();

    /* JADX INFO: renamed from: f */
    public eqk f14966f = null;

    /* JADX INFO: renamed from: g */
    public boolean f14967g = false;

    /* JADX INFO: renamed from: h */
    public final gva f14968h;

    /* JADX INFO: renamed from: i */
    private final cwd f14969i;

    public epf(gva gvaVar, nta ntaVar, mrm mrmVar, jvb jvbVar, cwd cwdVar, kfc kfcVar, dhv dhvVar, kbz kbzVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f14968h = gvaVar;
        this.f14963c = ntaVar;
        lku.m15669w(mrmVar.mo16813g());
        eqv eqvVar = (eqv) mrmVar.mo16809c();
        this.f14962b = eqvVar;
        this.f14969i = cwdVar;
        eqvVar.mo7639h(this);
        dhx dhxVar = dik.f11603a;
        dhvVar.mo6178f();
        this.f14964d = kbzVar;
        jvbVar.m13537d(new eds(this, 6));
        kfcVar.mo9411k(new dtb(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, oju] */
    @Override // p000.equ
    /* JADX INFO: renamed from: a */
    public final synchronized nps mo7614a(int i) {
        if (this.f14967g) {
            ((nbe) ((nbe) f14961a.m17252c()).mo17276G(1696)).mo17291p("[shot-%s] Already closed, cannot start capture.", i);
            return kxk.m14964J(new kec("Already closed."));
        }
        eqk eqkVar = new eqk((drj) this.f14969i.f9866a.get(), i, null, null, null);
        this.f14966f = eqkVar;
        this.f14965e.put(Integer.valueOf(i), eqkVar);
        nps npsVarM7688a = eqkVar.m7688a();
        npsVarM7688a.mo2282d(new elu(this, 8), not.INSTANCE);
        return npsVarM7688a;
    }

    @Override // p000.equ
    /* JADX INFO: renamed from: b */
    public final synchronized void mo7615b(int i) {
        eqk eqkVar = (eqk) this.f14965e.remove(Integer.valueOf(i));
        if (eqkVar != null) {
            eqkVar.m7689b();
        } else {
            ((nbe) ((nbe) f14961a.m17252c()).mo17276G(1697)).mo17291p("[shot-%s] does not exist for Aborting PSL capture.", i);
        }
    }

    @Override // p000.kfb
    /* JADX INFO: renamed from: c */
    public final void mo3625c(kiq kiqVar) {
        if (this.f14967g) {
            ((nbe) ((nbe) f14961a.m17252c()).mo17276G((char) 1706)).mo17290o("Already closed, cannot process frame.");
            return;
        }
        synchronized (this) {
            if (this.f14966f != null) {
                m7618f(kiqVar, true);
            }
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f14967g) {
            ((nbe) ((nbe) f14961a.m17252c()).mo17276G((char) 1700)).mo17290o("Already closed!");
            return;
        }
        this.f14965e.size();
        this.f14967g = true;
        Collection$EL.removeIf(this.f14965e.entrySet(), cdy.f5388q);
    }

    @Override // p000.equ
    /* JADX INFO: renamed from: d */
    public final synchronized void mo7616d(int i, float f, float f2, long j) {
        eqk eqkVar = (eqk) this.f14965e.get(Integer.valueOf(i));
        if (eqkVar != null) {
            eqkVar.m7690c(f, f2, j);
        } else {
            ((nbe) ((nbe) f14961a.m17252c()).mo17276G(1701)).mo17291p("[shot-%s] does not exist for collecting PSL frames", i);
        }
    }

    @Override // p000.equ
    /* JADX INFO: renamed from: e */
    public final synchronized void mo7617e(int i, eqt eqtVar) {
        eqk eqkVar = (eqk) this.f14965e.get(Integer.valueOf(i));
        if (eqkVar != null) {
            eqkVar.m7691d(new epe(this, eqtVar, i));
        } else {
            eqtVar.mo7613d(false);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7618f(kiq kiqVar, final boolean z) {
        kfv.m14174w(kiqVar, new kfu() { // from class: epd
            /* JADX WARN: Code duplicated, block: B:10:0x0015 A[Catch: all -> 0x0058, TryCatch #0 {, blocks: (B:5:0x0007, B:7:0x000b, B:13:0x0053, B:8:0x000f, B:10:0x0015, B:12:0x003a), top: B:22:0x0007, outer: #1 }] */
            /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: all -> 0x0058, TryCatch #0 {, blocks: (B:5:0x0007, B:7:0x000b, B:13:0x0053, B:8:0x000f, B:10:0x0015, B:12:0x003a), top: B:22:0x0007, outer: #1 }] */
            /* JADX WARN: Code duplicated, block: B:8:0x000f A[Catch: all -> 0x0058, TryCatch #0 {, blocks: (B:5:0x0007, B:7:0x000b, B:13:0x0053, B:8:0x000f, B:10:0x0015, B:12:0x003a), top: B:22:0x0007, outer: #1 }] */
            @Override // p000.kfu
            /* JADX INFO: renamed from: a */
            public final void mo3915a(key keyVar) {
                kpp kppVarMo7042c;
                gmc gmcVarM9784a;
                String str;
                epf epfVar = this.f14956a;
                boolean z2 = z;
                try {
                    synchronized (epfVar) {
                        if (z2) {
                            eqk eqkVar = epfVar.f14966f;
                            if (eqkVar != null) {
                                eqkVar.m7692e(keyVar);
                            } else {
                                kppVarMo7042c = keyVar.mo7042c();
                                if (kppVarMo7042c != null) {
                                    epfVar.f14964d.mo13961e("MotionBlurVf#wrapFrame");
                                    gmcVarM9784a = epfVar.f14968h.m9784a(keyVar);
                                    epfVar.f14964d.mo13963g("MotionBlurVf#getGyroSampleVector");
                                    epfVar.f14964d.mo13963g("MotionBlurVf#convertToGcamFrameMetadata");
                                    str = (String) kppVarMo7042c.mo9517d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
                                    if (str != null) {
                                        FrameMetadata frameMetadataM17683j = epfVar.f14963c.m17683j(kppVarMo7042c, null, null, kmg.m14575b(str));
                                        epfVar.f14964d.mo13962f();
                                        epfVar.f14962b.mo7635d(gmcVarM9784a.m9498g(), frameMetadataM17683j);
                                    }
                                }
                            }
                        } else {
                            kppVarMo7042c = keyVar.mo7042c();
                            if (kppVarMo7042c != null) {
                                epfVar.f14964d.mo13961e("MotionBlurVf#wrapFrame");
                                gmcVarM9784a = epfVar.f14968h.m9784a(keyVar);
                                epfVar.f14964d.mo13963g("MotionBlurVf#getGyroSampleVector");
                                epfVar.f14964d.mo13963g("MotionBlurVf#convertToGcamFrameMetadata");
                                str = (String) kppVarMo7042c.mo9517d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
                                if (str != null) {
                                    FrameMetadata frameMetadataM17683j2 = epfVar.f14963c.m17683j(kppVarMo7042c, null, null, kmg.m14575b(str));
                                    epfVar.f14964d.mo13962f();
                                    epfVar.f14962b.mo7635d(gmcVarM9784a.m9498g(), frameMetadataM17683j2);
                                }
                            }
                        }
                        throw th;
                    }
                    keyVar.close();
                } catch (Throwable th) {
                    keyVar.close();
                    throw th;
                }
            }
        });
    }
}
