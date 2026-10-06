package com.google.android.apps.camera.moments;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.ShotMetadata;
import java.util.concurrent.Executor;
import p000.ckp;
import p000.enc;
import p000.fnx;
import p000.fqe;
import p000.fsy;
import p000.fsz;
import p000.fta;
import p000.gva;
import p000.jfz;
import p000.kbc;
import p000.kbo;
import p000.key;
import p000.kpw;
import p000.lku;
import p000.nsz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FastMomentsHdrImpl implements fsz {

    /* JADX INFO: renamed from: a */
    public final kbo f6815a;

    /* JADX INFO: renamed from: b */
    public final long f6816b;

    /* JADX INFO: renamed from: c */
    public final Gcam f6817c;

    /* JADX INFO: renamed from: d */
    public final nsz f6818d;

    /* JADX INFO: renamed from: e */
    private final Executor f6819e;

    /* JADX INFO: renamed from: f */
    private final ckp f6820f;

    public FastMomentsHdrImpl(kbo kboVar, Gcam gcam, Executor executor, nsz nszVar, ckp ckpVar) {
        this.f6815a = kboVar.mo6314a("FastMomentsHdr");
        this.f6817c = gcam;
        this.f6819e = executor;
        this.f6818d = nszVar;
        this.f6820f = ckpVar;
        enc.m7546b();
        this.f6816b = createImpl();
    }

    private static native long createImpl();

    private static native void releaseImpl(long j);

    @Override // p000.fsz
    /* JADX INFO: renamed from: a */
    public final void mo4206a() {
        this.f6819e.execute(this.f6820f.m3841a(new fnx(this, 8)));
    }

    @Override // p000.fsz
    /* JADX INFO: renamed from: b */
    public final void mo4207b(kpw kpwVar, fta ftaVar, jfz jfzVar, fsy fsyVar) {
        lku.m15608C(kpwVar.mo7245a() == 37, "Wrong format for input ImageProxy. Got %s, expected RAW10 (%s)", kpwVar.mo7245a(), 37);
        HardwareBuffer hardwareBufferMo7250f = kpwVar.mo7250f();
        hardwareBufferMo7250f.getClass();
        lku.m15670x(((kbc) jfzVar.f33932d).f35517a % 4 == 0, "Only multiple of 4 widths are supported!");
        lku.m15670x(((kbc) jfzVar.f33932d).f35518b % 2 == 0, "Only multiple of 2 heights are supported!");
        this.f6819e.execute(new fqe(this, kpwVar, ftaVar, ((AeShotParams) ftaVar.f23537c).m4884a(), (ShotMetadata) ftaVar.f23536b, jfzVar, hardwareBufferMo7250f, fsyVar, 0, null));
    }

    @Override // p000.fsz
    /* JADX INFO: renamed from: c */
    public final boolean mo4208c(key keyVar, gva gvaVar) {
        kpw kpwVarM9496e = gvaVar.m9784a(keyVar).m9496e();
        try {
            if (kpwVarM9496e == null) {
                this.f6815a.mo13942d("No RAW10 image found in frame. Can't use FastMomentsHdr");
                return false;
            }
            HardwareBuffer hardwareBufferMo7250f = kpwVarM9496e.mo7250f();
            boolean z = hardwareBufferMo7250f != null;
            if (hardwareBufferMo7250f != null) {
                hardwareBufferMo7250f.close();
            }
            kpwVarM9496e.close();
            return z;
        } catch (Throwable th) {
            if (kpwVarM9496e != null) {
                try {
                    kpwVarM9496e.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception e) {
                    }
                }
            }
            throw th;
        }
    }

    public final void finalize() {
        long j = this.f6816b;
        if (j != 0) {
            releaseImpl(j);
        }
    }

    public native void initializeProcessingQueueNative(long j, long j2);

    public native HardwareBuffer processRaw10ToRgbaHardwareBufferNative(long j, long j2, int i, long j3, HardwareBuffer hardwareBuffer, long j4, long j5, long j6, int i2, int i3, long j7, int i4);

    public native HardwareBuffer processRaw10ToYuvHardwareBufferNative(long j, long j2, int i, long j3, HardwareBuffer hardwareBuffer, long j4, long j5, long j6, int i2, int i3, long j7, int i4);

    public native long processRaw10ToYuvImageNative(long j, long j2, int i, HardwareBuffer hardwareBuffer, long j3, long j4, long j5, int i2, int i3, long j6, int i4);
}
