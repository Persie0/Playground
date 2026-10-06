package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnm {

    /* JADX INFO: renamed from: c */
    private static final nbh f12103c = nbh.m17259h("com/google/android/apps/camera/device/CameraDeviceVerifier");

    /* JADX INFO: renamed from: a */
    public final Object f12104a = new Object();

    /* JADX INFO: renamed from: b */
    public nqf f12105b;

    /* JADX INFO: renamed from: d */
    private final CameraManager f12106d;

    /* JADX INFO: renamed from: e */
    private final ohb f12107e;

    /* JADX INFO: renamed from: f */
    private final Executor f12108f;

    /* JADX INFO: renamed from: g */
    private final kdq f12109g;

    public dnm(CameraManager cameraManager, ohb ohbVar, Executor executor, kdq kdqVar) {
        this.f12106d = cameraManager;
        this.f12107e = ohbVar;
        this.f12108f = executor;
        this.f12109g = kdqVar;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0146 A[Catch: all -> 0x0182, TryCatch #2 {all -> 0x0182, blocks: (B:53:0x0127, B:55:0x0146, B:60:0x015a, B:56:0x0153, B:58:0x0157), top: B:74:0x0127 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0153 A[Catch: all -> 0x0182, TryCatch #2 {all -> 0x0182, blocks: (B:53:0x0127, B:55:0x0146, B:60:0x015a, B:56:0x0153, B:58:0x0157), top: B:74:0x0127 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0157 A[Catch: all -> 0x0182, TryCatch #2 {all -> 0x0182, blocks: (B:53:0x0127, B:55:0x0146, B:60:0x015a, B:56:0x0153, B:58:0x0157), top: B:74:0x0127 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0171  */
    /* JADX WARN: Code duplicated, block: B:68:0x0185  */
    /* JADX INFO: renamed from: a */
    public final dnl m6435a(int i) {
        Exception timeoutException;
        kcl kclVar;
        kcl kclVarM13979a;
        ((nbe) ((nbe) f12103c.m17252c()).mo17276G(1024)).mo17294s("Attempting to reconnect to the camera service with a %dms timeout in %dms increments.", i, 200);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        dnk dnkVar = null;
        try {
            jvb jvbVar = new jvb();
            try {
                dnk dnkVar2 = new dnk(atomicBoolean);
                try {
                    this.f12106d.registerAvailabilityCallback(dnkVar2, jvh.m13558f(jvbVar, "PollUntilReconnect"));
                    int i2 = i / 200;
                    for (int i3 = 0; i3 < i2; i3++) {
                        try {
                            String[] cameraIdList = this.f12106d.getCameraIdList();
                            if (cameraIdList != null && cameraIdList.length > 0 && atomicBoolean.get()) {
                                ((nbe) ((nbe) f12103c.m17252c()).mo17276G(1027)).mo17291p("Camera Manager reconnect attempted and succeeded after ~%dms", (i3 + 1) * 200);
                                ((kdc) this.f12107e.get()).mo10420aE(1, kcl.CAMERAS_NOT_ENUMERATED, kcl.CAMERAS_NOT_ENUMERATED.m13983c(), 2);
                                this.f12109g.mo5935i();
                                dnl dnlVar = new dnl(true);
                                jvbVar.close();
                                this.f12106d.unregisterAvailabilityCallback(dnkVar2);
                                return dnlVar;
                            }
                            Thread.sleep(200L, 0);
                        } catch (CameraAccessException e) {
                            e = e;
                            timeoutException = e;
                            dnkVar = dnkVar2;
                            try {
                                ((nbe) ((nbe) ((nbe) f12103c.m17251b()).mo17283h(timeoutException)).mo17276G(1026)).mo17290o("Camera Manager reconnect failed, or there are no cameras on this device.");
                                kclVar = kcl.CAMERA_ERROR_CODE_UNKNOWN;
                                if (timeoutException instanceof CameraAccessException) {
                                    kclVarM13979a = kcl.m13979a(((CameraAccessException) timeoutException).getReason());
                                } else {
                                    if (timeoutException instanceof InterruptedException) {
                                        kclVar = kcl.CAMERAS_NOT_ENUMERATED;
                                    }
                                    kclVarM13979a = kclVar;
                                }
                                this.f12109g.mo5931e(kclVarM13979a);
                                ((kdc) this.f12107e.get()).mo10420aE(3, kclVarM13979a, timeoutException.getMessage(), 2);
                                if (dnkVar != null) {
                                    this.f12106d.unregisterAvailabilityCallback(dnkVar);
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (dnkVar != null) {
                                    this.f12106d.unregisterAvailabilityCallback(dnkVar);
                                }
                                throw th;
                            }
                        } catch (InterruptedException e2) {
                            e = e2;
                            timeoutException = e;
                            dnkVar = dnkVar2;
                            ((nbe) ((nbe) ((nbe) f12103c.m17251b()).mo17283h(timeoutException)).mo17276G(1026)).mo17290o("Camera Manager reconnect failed, or there are no cameras on this device.");
                            kclVar = kcl.CAMERA_ERROR_CODE_UNKNOWN;
                            if (timeoutException instanceof CameraAccessException) {
                                kclVarM13979a = kcl.m13979a(((CameraAccessException) timeoutException).getReason());
                            } else {
                                if (timeoutException instanceof InterruptedException) {
                                    kclVar = kcl.CAMERAS_NOT_ENUMERATED;
                                }
                                kclVarM13979a = kclVar;
                            }
                            this.f12109g.mo5931e(kclVarM13979a);
                            ((kdc) this.f12107e.get()).mo10420aE(3, kclVarM13979a, timeoutException.getMessage(), 2);
                            if (dnkVar != null) {
                                this.f12106d.unregisterAvailabilityCallback(dnkVar);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            dnkVar = dnkVar2;
                            if (dnkVar != null) {
                                this.f12106d.unregisterAvailabilityCallback(dnkVar);
                            }
                            throw th;
                        }
                    }
                    kclVarM13979a = kcl.CAMERAS_NOT_ENUMERATED;
                    timeoutException = new TimeoutException("Camera Manager reconnect timed out after " + i + "ms");
                    ((nbe) ((nbe) ((nbe) f12103c.m17251b()).mo17283h(timeoutException)).mo17276G(1025)).mo17290o("Camera Manager reconnect failed, or there are no cameras on this device.");
                    this.f12109g.mo5931e(kcl.CAMERAS_NOT_ENUMERATED);
                    kdc kdcVar = (kdc) this.f12107e.get();
                    kcl kclVar2 = kcl.CAMERAS_NOT_ENUMERATED;
                    kdcVar.mo10420aE(2, kclVar2, kclVar2.m13983c(), 2);
                    jvbVar.close();
                    this.f12106d.unregisterAvailabilityCallback(dnkVar2);
                } catch (Throwable th3) {
                    th = th3;
                    dnkVar = dnkVar2;
                    try {
                        jvbVar.close();
                    } catch (Throwable th4) {
                        try {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th4);
                            } catch (Exception e3) {
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            if (dnkVar != null) {
                                this.f12106d.unregisterAvailabilityCallback(dnkVar);
                            }
                            throw th;
                        }
                    }
                    try {
                        throw th;
                    } catch (CameraAccessException | InterruptedException e4) {
                        timeoutException = e4;
                        ((nbe) ((nbe) ((nbe) f12103c.m17251b()).mo17283h(timeoutException)).mo17276G(1026)).mo17290o("Camera Manager reconnect failed, or there are no cameras on this device.");
                        kclVar = kcl.CAMERA_ERROR_CODE_UNKNOWN;
                        if (timeoutException instanceof CameraAccessException) {
                            kclVarM13979a = kcl.m13979a(((CameraAccessException) timeoutException).getReason());
                        } else {
                            if (timeoutException instanceof InterruptedException) {
                                kclVar = kcl.CAMERAS_NOT_ENUMERATED;
                            }
                            kclVarM13979a = kclVar;
                        }
                        this.f12109g.mo5931e(kclVarM13979a);
                        ((kdc) this.f12107e.get()).mo10420aE(3, kclVarM13979a, timeoutException.getMessage(), 2);
                        if (dnkVar != null) {
                            this.f12106d.unregisterAvailabilityCallback(dnkVar);
                        }
                        dnl dnlVar2 = new dnl(false);
                        dnlVar2.f12101b = kclVarM13979a;
                        dnlVar2.f12102c = timeoutException;
                        return dnlVar2;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (CameraAccessException e5) {
            e = e5;
            timeoutException = e;
            ((nbe) ((nbe) ((nbe) f12103c.m17251b()).mo17283h(timeoutException)).mo17276G(1026)).mo17290o("Camera Manager reconnect failed, or there are no cameras on this device.");
            kclVar = kcl.CAMERA_ERROR_CODE_UNKNOWN;
            if (timeoutException instanceof CameraAccessException) {
                kclVarM13979a = kcl.m13979a(((CameraAccessException) timeoutException).getReason());
            } else {
                if (timeoutException instanceof InterruptedException) {
                    kclVar = kcl.CAMERAS_NOT_ENUMERATED;
                }
                kclVarM13979a = kclVar;
            }
            this.f12109g.mo5931e(kclVarM13979a);
            ((kdc) this.f12107e.get()).mo10420aE(3, kclVarM13979a, timeoutException.getMessage(), 2);
            if (dnkVar != null) {
                this.f12106d.unregisterAvailabilityCallback(dnkVar);
            }
            dnl dnlVar3 = new dnl(false);
            dnlVar3.f12101b = kclVarM13979a;
            dnlVar3.f12102c = timeoutException;
            return dnlVar3;
        } catch (InterruptedException e6) {
            e = e6;
            timeoutException = e;
            ((nbe) ((nbe) ((nbe) f12103c.m17251b()).mo17283h(timeoutException)).mo17276G(1026)).mo17290o("Camera Manager reconnect failed, or there are no cameras on this device.");
            kclVar = kcl.CAMERA_ERROR_CODE_UNKNOWN;
            if (timeoutException instanceof CameraAccessException) {
                kclVarM13979a = kcl.m13979a(((CameraAccessException) timeoutException).getReason());
            } else {
                if (timeoutException instanceof InterruptedException) {
                    kclVar = kcl.CAMERAS_NOT_ENUMERATED;
                }
                kclVarM13979a = kclVar;
            }
            this.f12109g.mo5931e(kclVarM13979a);
            ((kdc) this.f12107e.get()).mo10420aE(3, kclVarM13979a, timeoutException.getMessage(), 2);
            if (dnkVar != null) {
                this.f12106d.unregisterAvailabilityCallback(dnkVar);
            }
            dnl dnlVar4 = new dnl(false);
            dnlVar4.f12101b = kclVarM13979a;
            dnlVar4.f12102c = timeoutException;
            return dnlVar4;
        } catch (Throwable th7) {
            th = th7;
        }
        dnl dnlVar5 = new dnl(false);
        dnlVar5.f12101b = kclVarM13979a;
        dnlVar5.f12102c = timeoutException;
        return dnlVar5;
    }

    /* JADX INFO: renamed from: b */
    public final nps m6436b() {
        try {
            String[] cameraIdList = this.f12106d.getCameraIdList();
            if (cameraIdList != null && cameraIdList.length > 0) {
                this.f12109g.mo5935i();
                return kxk.m14965K(new dnl(true));
            }
        } catch (CameraAccessException e) {
        }
        return m6437c(7000);
    }

    /* JADX INFO: renamed from: c */
    public final nps m6437c(int i) {
        boolean z;
        nqf nqfVar;
        synchronized (this.f12104a) {
            if (this.f12105b == null) {
                this.f12105b = nqf.m17621g();
                z = true;
            } else {
                z = false;
            }
            nqfVar = this.f12105b;
        }
        if (z) {
            this.f12108f.execute(new bbt(this, i, 11));
        }
        return nqfVar;
    }
}
