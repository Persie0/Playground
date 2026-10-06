package p000;

import android.app.admin.DevicePolicyManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.util.Log;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kcz implements kcv {

    /* JADX INFO: renamed from: a */
    public final String f35607a;

    /* JADX INFO: renamed from: b */
    public final CameraManager f35608b;

    /* JADX INFO: renamed from: c */
    public final kdc f35609c;

    /* JADX INFO: renamed from: d */
    public final Executor f35610d;

    /* JADX INFO: renamed from: e */
    public final Handler f35611e;

    /* JADX INFO: renamed from: f */
    public final kbz f35612f;

    /* JADX INFO: renamed from: k */
    public final DevicePolicyManager f35617k;

    /* JADX INFO: renamed from: l */
    public boolean f35618l = false;

    /* JADX INFO: renamed from: m */
    public boolean f35619m = false;

    /* JADX INFO: renamed from: n */
    private Throwable f35620n = null;

    /* JADX INFO: renamed from: i */
    public final kdl f35615i = new kdl();

    /* JADX INFO: renamed from: g */
    public final Object f35613g = new Object();

    /* JADX INFO: renamed from: h */
    public final Object f35614h = new Object();

    /* JADX INFO: renamed from: j */
    public final CountDownLatch f35616j = new CountDownLatch(1);

    public kcz(Handler handler, Executor executor, DevicePolicyManager devicePolicyManager, CameraManager cameraManager, kdc kdcVar, kbz kbzVar, String str) {
        this.f35607a = str;
        this.f35608b = cameraManager;
        this.f35617k = devicePolicyManager;
        this.f35612f = kbzVar;
        this.f35609c = kdcVar;
        this.f35611e = handler;
        this.f35610d = executor;
    }

    /* JADX INFO: renamed from: c */
    private final void m13989c(String str, Exception exc, boolean z, kcl kclVar, String str2) {
        Log.w("CAM_CameraDeviceOpener", str, exc);
        synchronized (this.f35613g) {
            if (z) {
                this.f35609c.mo10420aE(3, kclVar, str2, 3);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m13990a(boolean z, kcl kclVar, String str) {
        synchronized (this.f35613g) {
            if (this.f35620n != null) {
                Log.e("CAM_CameraDeviceOpener", "Failed to open Camera device " + this.f35607a + " after timeout.", this.f35620n);
            } else {
                Log.e("CAM_CameraDeviceOpener", "Failed to open Camera device " + this.f35607a + " after timeout.");
            }
            if (z) {
                this.f35609c.mo10420aE(2, kclVar, str, 3);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final lqq m13991b(kdl kdlVar, boolean z, long j, long j2, boolean z2) {
        lqq lqqVar;
        kbz kbzVar;
        lqq lqqVar2;
        kbz kbzVar2;
        kcy kcyVar = new kcy(this.f35612f, z2);
        kdlVar.m13998e(kcyVar);
        this.f35612f.mo13961e("CameraDeviceOpenerImpl#open");
        try {
            try {
                try {
                    try {
                        this.f35608b.openCamera(this.f35607a, new kci(kdlVar, this.f35607a), this.f35611e);
                        lqqVar2 = kcyVar.m13988e((5000 + j) - j2);
                        kbzVar2 = this.f35612f;
                    } catch (InterruptedException e) {
                        lqqVar2 = new lqq(5);
                        kbzVar2 = this.f35612f;
                    }
                    kbzVar2.mo13962f();
                    return lqqVar2;
                } catch (CameraAccessException e2) {
                    kcl kclVarM13979a = kcl.m13979a(e2.getReason());
                    switch (e2.getReason()) {
                        case 1:
                            if (!z2) {
                                m13989c("Failed to open camera device " + this.f35607a + " The camera device in use due to a higher priority process. Retrying ...", e2, true, kclVarM13979a, e2.getMessage());
                                lqqVar = new lqq(2, kclVarM13979a, e2.getMessage());
                                kbzVar = this.f35612f;
                            } else if (!z) {
                                lqqVar = new lqq(3, kclVarM13979a, e2.getMessage());
                                kbzVar = this.f35612f;
                            } else {
                                m13989c("Failed to open camera device " + this.f35607a + " after retry. The camera device is disabled.", e2, true, kclVarM13979a, e2.getMessage());
                                kdlVar.mo13973c(kclVarM13979a);
                                lqqVar = new lqq(4, kclVarM13979a, e2.getMessage());
                                kbzVar = this.f35612f;
                            }
                            break;
                        case 2:
                            lqqVar = new lqq(2, kclVarM13979a, e2.getMessage());
                            kbzVar = this.f35612f;
                            break;
                        case 3:
                            lqqVar = new lqq(2, kclVarM13979a, e2.getMessage());
                            kbzVar = this.f35612f;
                            break;
                        case 4:
                            m13989c("Failed to open camera device " + this.f35607a + " The camera device in use due to a higher priority process. Retrying ...", e2, true, kclVarM13979a, e2.getMessage());
                            lqqVar = new lqq(2, kclVarM13979a, e2.getMessage());
                            kbzVar = this.f35612f;
                            break;
                        case 5:
                            m13989c("Failed to open camera device " + this.f35607a + BcwGDRhrTsnlj.LrCYMlN, e2, z, kclVarM13979a, e2.getMessage());
                            kdlVar.mo13973c(kclVarM13979a);
                            lqqVar = new lqq(4, kclVarM13979a, e2.getMessage());
                            kbzVar = this.f35612f;
                            break;
                        default:
                            String str = this.f35607a;
                            m13989c("Failed to open camera device " + str + ". An unknown exception was thrown with error code " + e2.getReason() + ".", e2, z, kclVarM13979a, e2.getMessage());
                            kdlVar.mo13973c(kclVarM13979a);
                            lqqVar = new lqq(4, kclVarM13979a, e2.getMessage());
                            kbzVar = this.f35612f;
                            break;
                    }
                    kbzVar.mo13962f();
                    return lqqVar;
                }
            } catch (IllegalArgumentException e3) {
                synchronized (this.f35613g) {
                    this.f35620n = e3;
                    lqqVar = new lqq(2, kcl.CAMERA_ID_NOT_VALID, e3.getMessage());
                    kbzVar = this.f35612f;
                    kbzVar.mo13962f();
                    return lqqVar;
                }
            } catch (SecurityException e4) {
                synchronized (this.f35613g) {
                    this.f35620n = e4;
                    if (z) {
                        m13989c("Failed to open camera device " + this.f35607a + ". A SecurityException was thrown while attempting to open the camera.", e4, true, kcl.CAMERA_SECURITY_EXCEPTION, e4.getMessage());
                        kdlVar.mo13973c(kcl.CAMERA_SECURITY_EXCEPTION);
                        lqqVar = new lqq(4, kcl.CAMERA_SECURITY_EXCEPTION, e4.getMessage());
                        kbzVar = this.f35612f;
                    } else {
                        lqqVar = new lqq(3, kcl.CAMERA_SECURITY_EXCEPTION, e4.getMessage());
                        kbzVar = this.f35612f;
                    }
                    kbzVar.mo13962f();
                    return lqqVar;
                }
            }
        } catch (Throwable th) {
            this.f35612f.mo13962f();
            throw th;
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f35613g) {
            this.f35619m = true;
        }
        synchronized (this.f35614h) {
            this.f35614h.notify();
        }
    }
}
