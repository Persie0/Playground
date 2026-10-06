package p000;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.hardware.camera2.CaptureResult;
import com.google.android.apps.camera.jni.faceobfuscation.GpuRedactorNative;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p021j$.time.Instant;
import p021j$.util.Collection$EL;
import p021j$.util.stream.Collectors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dru implements dsq {

    /* JADX INFO: renamed from: c */
    private static final nbh f12439c = nbh.m17259h("com/google/android/apps/camera/faceobfuscation/FaceObfuscationEffectImpl");

    /* JADX INFO: renamed from: d */
    private final dsr f12442d;

    /* JADX INFO: renamed from: g */
    private float f12445g;

    /* JADX INFO: renamed from: h */
    private volatile boolean f12446h;

    /* JADX INFO: renamed from: a */
    public final Object f12440a = new Object();

    /* JADX INFO: renamed from: b */
    public long f12441b = 0;

    /* JADX INFO: renamed from: e */
    private int f12443e = 0;

    /* JADX INFO: renamed from: f */
    private List f12444f = new ArrayList();

    public dru(Executor executor, dsr dsrVar) {
        this.f12442d = dsrVar;
        executor.execute(new drs(this, 3));
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: a */
    public final ipl mo3652a() {
        return ipl.FACE_OBFUSCATION;
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lby mo3653b() {
        return null;
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String mo3654c() {
        return kbd.m13925n(this);
    }

    @Override // p000.dsq
    /* JADX INFO: renamed from: d */
    public final void mo6644d(boolean z) {
        this.f12446h = z;
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: k */
    public final boolean mo3662k() {
        return !this.f12446h;
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: l */
    public final int mo3663l(kpw kpwVar, kpw kpwVar2) {
        int i = this.f12443e;
        if (this.f12444f.isEmpty() || i > 3) {
            return 2;
        }
        synchronized (this.f12440a) {
            if (this.f12441b != 0 && !this.f12446h) {
                HardwareBuffer hardwareBufferMo7250f = kpwVar.mo7250f();
                try {
                    long j = this.f12441b;
                    hardwareBufferMo7250f.getClass();
                    int i2 = true == GpuRedactorNative.process(j, hardwareBufferMo7250f, true, hardwareBufferMo7250f, true, kpwVar.mo7247c(), kpwVar.mo7246b(), this.f12444f.toArray(), this.f12445g) ? 1 : 2;
                    hardwareBufferMo7250f.close();
                    return i2;
                } catch (Throwable th) {
                    if (hardwareBufferMo7250f != null) {
                        try {
                            hardwareBufferMo7250f.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                    }
                    throw th;
                }
            }
            return 2;
        }
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: m */
    public final int mo3664m(key keyVar, kgg kggVar, key keyVar2) throws IllegalAccessException, InvocationTargetException {
        kpw kpwVarMo7043d = keyVar.mo7043d(kggVar);
        try {
            kpw kpwVarMo7043d2 = keyVar2.mo7043d(kggVar);
            try {
                kpwVarMo7043d.getClass();
                Instant instantM17519a = nne.m17519a(kpwVarMo7043d.mo7248d());
                kpp kppVarMo7042c = keyVar.mo7042c();
                if (kppVarMo7042c == null) {
                    this.f12443e++;
                    ((nbe) ((nbe) f12439c.m17252c()).mo17276G(1109)).mo17291p("Using previous faceMetadata: metadata missed for %d consecutive frames.", this.f12443e);
                } else {
                    this.f12443e = 0;
                    Rect rect = (Rect) kppVarMo7042c.mo9517d(CaptureResult.SCALER_CROP_REGION);
                    if (rect == null) {
                        this.f12444f.clear();
                    } else {
                        this.f12445g = rect.width() / rect.height();
                        this.f12444f = (List) Collection$EL.stream(ebr.m7079e(kppVarMo7042c, this.f12442d, instantM17519a)).map(new cwp(rect, 7)).collect(Collectors.toCollection(drv.f12448b));
                    }
                }
                kpwVarMo7043d2.getClass();
                int iMo3663l = mo3663l(kpwVarMo7043d, kpwVarMo7043d2);
                kpwVarMo7043d2.close();
                kpwVarMo7043d.close();
                return iMo3663l;
            } catch (Throwable th) {
                if (kpwVarMo7043d2 != null) {
                    try {
                        kpwVarMo7043d2.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (kpwVarMo7043d != null) {
                try {
                    kpwVarMo7043d.close();
                } catch (Throwable th4) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                }
            }
            throw th3;
        }
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int mo3665n(lcy lcyVar, ldx ldxVar) {
        return kbd.m13928q();
    }

    @Override // p000.ipk, p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f12440a) {
            long j = this.f12441b;
            if (j == 0) {
                return;
            }
            GpuRedactorNative.releaseRedactor(j);
            this.f12441b = 0L;
        }
    }
}
