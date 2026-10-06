package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.PointF;
import android.graphics.RectF;
import android.hardware.HardwareBuffer;
import com.google.android.apps.camera.jni.gxp.GxpUtils;
import com.google.android.apps.camera.jni.tracking.RoiTrackerNative;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hrq implements hrz {

    /* JADX INFO: renamed from: a */
    private static final nbh f29337a = nbh.m17259h("com/google/android/apps/camera/tracking/RoiTrackerImpl");

    /* JADX INFO: renamed from: b */
    private boolean f29338b;

    /* JADX INFO: renamed from: c */
    private final long f29339c;

    /* JADX INFO: renamed from: d */
    private AssetFileDescriptor f29340d;

    /* JADX INFO: renamed from: e */
    private AssetFileDescriptor f29341e;

    /* JADX INFO: renamed from: f */
    private volatile long f29342f;

    /* JADX INFO: renamed from: g */
    private volatile int f29343g;

    /* JADX INFO: renamed from: h */
    private final mrm f29344h;

    /* JADX INFO: renamed from: i */
    private final mrm f29345i;

    /* JADX INFO: renamed from: j */
    private final jwn f29346j;

    public hrq() {
        throw null;
    }

    @Override // p000.hrz
    /* JADX INFO: renamed from: a */
    public final synchronized void mo10664a() {
        if (this.f29338b) {
            return;
        }
        RoiTrackerNative.stopTracking(this.f29339c);
        mrm mrmVar = this.f29344h;
        if (mrmVar.mo16813g()) {
            ((hse) mrmVar.mo16809c()).m10683a();
        }
    }

    @Override // p000.hrz
    /* JADX INFO: renamed from: b */
    public final synchronized hsg mo10665b(kpw kpwVar, PointF pointF) {
        if (this.f29338b) {
            ((nbe) ((nbe) f29337a.m17252c()).mo17276G((char) 3920)).mo17290o("Cannot start tracking: tracker is closed");
            return hsg.m10693b();
        }
        this.f29342f = kpwVar.mo7248d();
        this.f29343g = 0;
        mrm mrmVar = this.f29345i;
        hsa hsaVar = mrmVar.mo16813g() ? (hsa) mrmVar.mo16809c() : hsa.OPTICAL_FLOW;
        mrm mrmVar2 = this.f29344h;
        if (mrmVar2.mo16813g()) {
            if (!((hse) mrmVar2.mo16809c()).m10684b(new kbc(kpwVar.mo7247c(), kpwVar.mo7246b()), kpwVar.mo7248d())) {
                ((nbe) ((nbe) f29337a.m17252c()).mo17276G((char) 3919)).mo17290o("Cannot start motion estimator for tracking");
            }
            gsr gsrVarM6886b = ((hse) this.f29344h.mo16809c()).f29393a.m6886b();
            if (gsrVarM6886b != null && gsrVarM6886b.f26244d > 50000000 && gsrVarM6886b.f26246f > 350) {
                hsaVar = hsa.GYRO;
            }
        }
        kpv kpvVar = (kpv) kpwVar.mo7251g().get(0);
        kpv kpvVar2 = (kpv) kpwVar.mo7251g().get(1);
        kpv kpvVar3 = (kpv) kpwVar.mo7251g().get(2);
        int iMo7247c = kpwVar.mo7247c();
        int iMo7246b = kpwVar.mo7246b();
        float f = iMo7247c;
        float f2 = iMo7246b;
        float[] fArr = {(pointF.x * f) - 5.0f, (pointF.y * f2) - 5.0f, 11.0f, 11.0f};
        HardwareBuffer hardwareBufferMo7250f = kpwVar.mo7250f();
        try {
            int iStartTracking = RoiTrackerNative.startTracking(this.f29339c, true, hsaVar.ordinal(), 0, 1.0f, iMo7247c, iMo7246b, kpvVar.getBuffer(), kpvVar.getPixelStride(), kpvVar.getRowStride(), kpvVar2.getBuffer(), kpvVar2.getPixelStride(), kpvVar2.getRowStride(), kpvVar3.getBuffer(), kpvVar3.getPixelStride(), kpvVar3.getRowStride(), hardwareBufferMo7250f, fArr, ((Boolean) this.f29346j.mo3831be()).booleanValue(), kpwVar.mo7245a());
            if (hardwareBufferMo7250f != null) {
                hardwareBufferMo7250f.close();
            }
            float f3 = fArr[0];
            float f4 = f3 / f;
            float f5 = fArr[1];
            float f6 = f5 / f2;
            float f7 = f3 + fArr[2];
            float f8 = f5 + fArr[3];
            this.f29343g += RoiTrackerNative.getIsRefresherCalled(this.f29339c) ? 1 : 0;
            hsf hsfVarM10692a = hsg.m10692a();
            hsfVarM10692a.m10689d(new RectF(f4, f6, (f7 - 1.0f) / f, (f8 - 1.0f) / f2));
            hsfVarM10692a.m10687b(1.0f);
            hsfVarM10692a.f29396a = hsj.m10695a(iStartTracking);
            hsfVarM10692a.m10691f(hsa.m10682a(RoiTrackerNative.getCurrentTrackerIndex(this.f29339c)));
            hsfVarM10692a.m10688c(this.f29343g);
            hsfVarM10692a.m10690e(0L);
            return hsfVarM10692a.m10686a();
        } catch (Throwable th) {
            if (hardwareBufferMo7250f == null) {
                throw th;
            }
            try {
                hardwareBufferMo7250f.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    @Override // p000.hrz
    /* JADX INFO: renamed from: c */
    public final synchronized hsg mo10666c(kpw kpwVar) {
        if (this.f29338b) {
            return hsg.m10693b();
        }
        kpv kpvVar = (kpv) kpwVar.mo7251g().get(0);
        kpv kpvVar2 = (kpv) kpwVar.mo7251g().get(1);
        kpv kpvVar3 = (kpv) kpwVar.mo7251g().get(2);
        int iMo7247c = kpwVar.mo7247c();
        int iMo7246b = kpwVar.mo7246b();
        float[] fArr = new float[5];
        mrm mrmVar = this.f29344h;
        float[] fArrM10685c = mrmVar.mo16813g() ? ((hse) mrmVar.mo16809c()).m10685c(kpwVar.mo7248d()) : new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        HardwareBuffer hardwareBufferMo7250f = kpwVar.mo7250f();
        try {
            int iUpdateRoi = RoiTrackerNative.updateRoi(this.f29339c, 0, 1.0f, iMo7247c, iMo7246b, kpvVar.getBuffer(), kpvVar.getPixelStride(), kpvVar.getRowStride(), kpvVar2.getBuffer(), kpvVar2.getPixelStride(), kpvVar2.getRowStride(), kpvVar3.getBuffer(), kpvVar3.getPixelStride(), kpvVar3.getRowStride(), fArrM10685c, hardwareBufferMo7250f, fArr, ((Boolean) this.f29346j.mo3831be()).booleanValue(), kpwVar.mo7245a());
            if (hardwareBufferMo7250f != null) {
                hardwareBufferMo7250f.close();
            }
            float f = fArr[0];
            float f2 = iMo7247c;
            float f3 = f / f2;
            float f4 = fArr[1];
            float f5 = iMo7246b;
            float f6 = f4 / f5;
            float f7 = f + fArr[2];
            float f8 = f4 + fArr[3];
            float f9 = fArr[4];
            this.f29343g += RoiTrackerNative.getIsRefresherCalled(this.f29339c) ? 1 : 0;
            hsf hsfVarM10692a = hsg.m10692a();
            hsfVarM10692a.m10689d(new RectF(f3, f6, (f7 - 1.0f) / f2, (f8 - 1.0f) / f5));
            hsfVarM10692a.m10687b(f9);
            hsfVarM10692a.f29396a = hsj.m10695a(iUpdateRoi);
            hsfVarM10692a.m10691f(hsa.m10682a(RoiTrackerNative.getCurrentTrackerIndex(this.f29339c)));
            hsfVarM10692a.m10688c(this.f29343g);
            hsfVarM10692a.m10690e((kpwVar.mo7248d() - this.f29342f) / 1000000);
            return hsfVarM10692a.m10686a();
        } catch (Throwable th) {
            if (hardwareBufferMo7250f == null) {
                throw th;
            }
            try {
                hardwareBufferMo7250f.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    @Override // p000.hrz, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f29338b) {
            return;
        }
        try {
            AssetFileDescriptor assetFileDescriptor = this.f29340d;
            if (assetFileDescriptor != null) {
                assetFileDescriptor.close();
            }
            AssetFileDescriptor assetFileDescriptor2 = this.f29341e;
            if (assetFileDescriptor2 != null) {
                assetFileDescriptor2.close();
            }
        } catch (IOException e) {
            ((nbe) ((nbe) ((nbe) f29337a.m17251b()).mo17283h(e)).mo17276G((char) 3923)).mo17290o("Unable to close asset fd.");
        }
        mo10664a();
        mrm mrmVar = this.f29344h;
        if (mrmVar.mo16813g()) {
            ((hse) mrmVar.mo16809c()).close();
        }
        RoiTrackerNative.releaseHandle(this.f29339c);
        this.f29338b = true;
    }

    public hrq(mrm mrmVar, mrm mrmVar2, boolean z, String str, String str2, boolean z2, Context context, jwn jwnVar) {
        boolean z3;
        int i;
        long j;
        long j2;
        int i2;
        long j3;
        long length;
        int fd;
        long startOffset;
        long length2;
        int fd2;
        long startOffset2;
        this.f29344h = mrmVar;
        this.f29345i = mrmVar2;
        this.f29346j = jwnVar;
        hsa hsaVar = mrmVar2.mo16813g() ? (hsa) mrmVar2.mo16809c() : hsa.OPTICAL_FLOW;
        String absolutePath = context != null ? context.getCacheDir().getAbsolutePath() : "";
        boolean zM4186a = z2 ? GxpUtils.m4186a() : false;
        if (z) {
            if (mro.m16832b(str) || mro.m16832b(str2)) {
                z3 = false;
            } else if (context == null) {
                z3 = false;
                i = 0;
                j = 0;
                j2 = 0;
                i2 = 0;
                j3 = 0;
                length = 0;
            } else {
                try {
                    this.f29340d = context.getAssets().openFd(str);
                    this.f29341e = context.getAssets().openFd(str2);
                    fd = this.f29340d.getParcelFileDescriptor().getFd();
                    try {
                        startOffset = this.f29340d.getStartOffset();
                        try {
                            length2 = this.f29340d.getLength();
                            try {
                                fd2 = this.f29341e.getParcelFileDescriptor().getFd();
                                try {
                                    startOffset2 = this.f29341e.getStartOffset();
                                    try {
                                        length = this.f29341e.getLength();
                                        j3 = startOffset2;
                                        i2 = fd2;
                                        j2 = length2;
                                        j = startOffset;
                                        z3 = z;
                                        i = fd;
                                    } catch (IOException e) {
                                        e = e;
                                        ((nbe) ((nbe) ((nbe) f29337a.m17251b()).mo17283h(e)).mo17276G((char) 3922)).mo17290o("Unable to load model from path.");
                                        j3 = startOffset2;
                                        length = 0;
                                        i2 = fd2;
                                        j2 = length2;
                                        j = startOffset;
                                        z3 = false;
                                        i = fd;
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                    startOffset2 = 0;
                                    ((nbe) ((nbe) ((nbe) f29337a.m17251b()).mo17283h(e)).mo17276G((char) 3922)).mo17290o("Unable to load model from path.");
                                    j3 = startOffset2;
                                    length = 0;
                                    i2 = fd2;
                                    j2 = length2;
                                    j = startOffset;
                                    z3 = false;
                                    i = fd;
                                    this.f29339c = RoiTrackerNative.createHandle(context, absolutePath, hsaVar.ordinal(), z3, i, j, j2, i2, j3, length, zM4186a);
                                    this.f29342f = 0L;
                                    this.f29343g = 0;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                fd2 = 0;
                                startOffset2 = 0;
                                ((nbe) ((nbe) ((nbe) f29337a.m17251b()).mo17283h(e)).mo17276G((char) 3922)).mo17290o("Unable to load model from path.");
                                j3 = startOffset2;
                                length = 0;
                                i2 = fd2;
                                j2 = length2;
                                j = startOffset;
                                z3 = false;
                                i = fd;
                                this.f29339c = RoiTrackerNative.createHandle(context, absolutePath, hsaVar.ordinal(), z3, i, j, j2, i2, j3, length, zM4186a);
                                this.f29342f = 0L;
                                this.f29343g = 0;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            length2 = 0;
                            fd2 = 0;
                            startOffset2 = 0;
                            ((nbe) ((nbe) ((nbe) f29337a.m17251b()).mo17283h(e)).mo17276G((char) 3922)).mo17290o("Unable to load model from path.");
                            j3 = startOffset2;
                            length = 0;
                            i2 = fd2;
                            j2 = length2;
                            j = startOffset;
                            z3 = false;
                            i = fd;
                            this.f29339c = RoiTrackerNative.createHandle(context, absolutePath, hsaVar.ordinal(), z3, i, j, j2, i2, j3, length, zM4186a);
                            this.f29342f = 0L;
                            this.f29343g = 0;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        startOffset = 0;
                    }
                } catch (IOException e6) {
                    e = e6;
                    fd = 0;
                    startOffset = 0;
                    length2 = 0;
                    fd2 = 0;
                    startOffset2 = 0;
                }
            }
            this.f29339c = RoiTrackerNative.createHandle(context, absolutePath, hsaVar.ordinal(), z3, i, j, j2, i2, j3, length, zM4186a);
            this.f29342f = 0L;
            this.f29343g = 0;
        }
        z3 = z;
        i = 0;
        j = 0;
        j2 = 0;
        i2 = 0;
        j3 = 0;
        length = 0;
        this.f29339c = RoiTrackerNative.createHandle(context, absolutePath, hsaVar.ordinal(), z3, i, j, j2, i2, j3, length, zM4186a);
        this.f29342f = 0L;
        this.f29343g = 0;
    }
}
