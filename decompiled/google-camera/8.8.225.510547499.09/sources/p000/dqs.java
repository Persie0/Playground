package p000;

import android.hardware.HardwareBuffer;
import com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify2;
import com.google.android.apps.camera.jni.facebeautification.GpuRetoucherNative;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dqs implements drc {

    /* JADX INFO: renamed from: a */
    public final Executor f12352a;

    /* JADX INFO: renamed from: b */
    private final dhv f12353b;

    /* JADX INFO: renamed from: c */
    private final kbo f12354c;

    /* JADX INFO: renamed from: d */
    private final lby f12355d;

    /* JADX INFO: renamed from: e */
    private long f12356e = 0;

    /* JADX INFO: renamed from: f */
    private final fxs f12357f;

    public dqs(fxs fxsVar, Executor executor, bko bkoVar, dhv dhvVar, kbo kboVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f12357f = fxsVar;
        this.f12352a = executor;
        this.f12353b = dhvVar;
        this.f12355d = bkoVar.m2626t("vesper");
        this.f12354c = kboVar.mo6314a("GpuFBCtrl");
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kpw] */
    @Override // p000.drc
    /* JADX INFO: renamed from: a */
    public final nps mo6564a(cvy cvyVar) {
        return !((gzl) cvyVar.f9845b).m10016b() ? kxk.m14965K(new dqp(cvyVar.f9846c)) : this.f12357f.m8939a(new dqr(this, cvyVar, 0, (byte[]) null, (byte[]) null));
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6602b() {
        long j = this.f12356e;
        if (j != 0) {
            GpuRetoucherNative.releaseRetoucher(j);
            this.f12356e = 0L;
        }
        this.f12355d.close();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kpp] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kpw] */
    /* JADX INFO: renamed from: c */
    public final synchronized drb m6603c(cvy cvyVar) {
        int i;
        long jCreateRetoucher = this.f12356e;
        if (jCreateRetoucher == 0) {
            Object obj = cvyVar.f9845b;
            dhv dhvVar = this.f12353b;
            dhx dhxVar = dhp.f11144a;
            dhvVar.mo6178f();
            gzl gzlVar = gzl.OFF;
            switch (((gzl) obj).ordinal()) {
                case 1:
                case 2:
                case 3:
                    i = 1;
                    break;
                default:
                    i = 0;
                    break;
            }
            jCreateRetoucher = GpuRetoucherNative.createRetoucher(true, i);
            this.f12356e = jCreateRetoucher;
        }
        lku.m15613H(jCreateRetoucher != 0);
        HardwareBuffer hardwareBufferMo7250f = cvyVar.f9846c.mo7250f();
        try {
            hardwareBufferMo7250f.getClass();
            boolean z = hardwareBufferMo7250f.getFormat() == 1;
            hardwareBufferMo7250f.close();
            mws mwsVarM6729c = dti.m6729c(cvyVar.f9847d);
            if (mwsVarM6729c.isEmpty()) {
                return new dqp(cvyVar.f9846c);
            }
            HardwareBuffer hardwareBufferMo7250f2 = cvyVar.f9846c.mo7250f();
            try {
                hardwareBufferMo7250f2.getClass();
                this.f12354c.mo13946h("Running GPU face retouch on an image of size " + cvyVar.f9846c.mo7247c() + " x " + cvyVar.f9846c.mo7246b());
                long j = this.f12356e;
                boolean z2 = z ^ true;
                int iMo7247c = cvyVar.f9846c.mo7247c();
                int iMo7246b = cvyVar.f9846c.mo7246b();
                FaceToBeautify2[] faceToBeautify2Arr = (FaceToBeautify2[]) mwsVarM6729c.toArray(new FaceToBeautify2[0]);
                Object obj2 = cvyVar.f9845b;
                obj2.getClass();
                GpuRetoucherNative.process(j, hardwareBufferMo7250f2, z2, hardwareBufferMo7250f2, z2, iMo7247c, iMo7246b, faceToBeautify2Arr, ((gzl) obj2).f26939f);
                hardwareBufferMo7250f2.close();
                return new dqo(cvyVar.f9846c, null, (gzl) cvyVar.f9845b);
            } catch (Throwable th) {
                if (hardwareBufferMo7250f2 == null) {
                    throw th;
                }
                try {
                    hardwareBufferMo7250f2.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            if (hardwareBufferMo7250f == null) {
                throw th3;
            }
            try {
                hardwareBufferMo7250f.close();
                throw th3;
            } catch (Throwable th4) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                throw th3;
            }
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f12352a.execute(new dgt(this, 18));
    }
}
