package p000;

import android.app.admin.DevicePolicyManager;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import androidx.wear.ambient.AmbientDelegate;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kdw implements kcu {

    /* JADX INFO: renamed from: b */
    public kdt f35692b;

    /* JADX INFO: renamed from: d */
    private final kdp f35694d;

    /* JADX INFO: renamed from: e */
    private final kea f35695e;

    /* JADX INFO: renamed from: f */
    private final Executor f35696f;

    /* JADX INFO: renamed from: g */
    private final kbz f35697g;

    /* JADX INFO: renamed from: h */
    private final kbo f35698h;

    /* JADX INFO: renamed from: i */
    private final kdq f35699i;

    /* JADX INFO: renamed from: j */
    private final kcj f35700j;

    /* JADX INFO: renamed from: k */
    private final kqj f35701k;

    /* JADX INFO: renamed from: l */
    private final AmbientDelegate f35702l;

    /* JADX INFO: renamed from: a */
    public final Object f35691a = new Object();

    /* JADX INFO: renamed from: c */
    public final List f35693c = new ArrayList();

    public kdw(kqj kqjVar, AmbientDelegate ambientDelegate, kdp kdpVar, Executor executor, kea keaVar, kcj kcjVar, kbz kbzVar, kbo kboVar, kdq kdqVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f35701k = kqjVar;
        this.f35702l = ambientDelegate;
        this.f35694d = kdpVar;
        this.f35695e = keaVar;
        this.f35696f = executor;
        this.f35700j = kcjVar;
        this.f35697g = kbzVar;
        this.f35698h = kboVar.mo6314a("VirtualCameraMgr");
        this.f35699i = kdqVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, oju] */
    /* JADX INFO: renamed from: f */
    private final void m14007f(kmg kmgVar, kct kctVar) {
        boolean zMo8995b;
        synchronized (this.f35691a) {
            kdt kdtVar = this.f35692b;
            if (kdtVar != null) {
                if (kdtVar.f35672a.equals(kmgVar)) {
                    if (kctVar != null) {
                        this.f35698h.mo13940b("Attaching listener to existing CameraSession: " + kdtVar.toString());
                        kdtVar.m14004e(kctVar);
                    } else {
                        this.f35698h.mo13940b("Has existing CameraSession. Noop Open: " + kdtVar.toString());
                    }
                    return;
                }
                this.f35693c.add(kdtVar);
                kdtVar.m14005f();
                this.f35692b = null;
            }
            kdp kdpVar = this.f35694d;
            synchronized (kdpVar.f35661b) {
                zMo8995b = kdpVar.f35663d.mo8995b();
            }
            if (zMo8995b) {
                if (kctVar != null) {
                    this.f35696f.execute(new jzq(kctVar, 3));
                }
                this.f35698h.mo13940b("WakeLock is yet to be acquired. Cannot open.");
                return;
            }
            kqj kqjVar = this.f35701k;
            String str = kmgVar.f36540a;
            Handler handler = (Handler) kqjVar.f36861b.get();
            handler.getClass();
            Executor executor = (Executor) kqjVar.f36860a.get();
            executor.getClass();
            DevicePolicyManager devicePolicyManager = ((emo) kqjVar.f36864e).get();
            CameraManager cameraManager = ((emn) kqjVar.f36863d).get();
            kdc kdcVar = (kdc) kqjVar.f36862c.get();
            kdcVar.getClass();
            kbz kbzVar = (kbz) kqjVar.f36865f.get();
            kbzVar.getClass();
            str.getClass();
            kdt kdtVar2 = new kdt(kmgVar, this, new kcz(handler, executor, devicePolicyManager, cameraManager, kdcVar, kbzVar, str), this.f35695e, this.f35696f, this.f35700j, this.f35698h, this.f35697g, this.f35699i, this.f35694d.m14001a());
            synchronized (kdtVar2) {
                if (!kdtVar2.f35678g && !kdtVar2.f35676e && !kdtVar2.f35677f) {
                    kdtVar2.f35678g = true;
                    kdtVar2.f35675d.mo13940b(kdtVar2.toString().concat(" Opening"));
                    kdtVar2.f35673b.m13998e(kdtVar2);
                    kcv kcvVar = kdtVar2.f35674c;
                    synchronized (((kcz) kcvVar).f35613g) {
                        if (!((kcz) kcvVar).f35618l && !((kcz) kcvVar).f35619m) {
                            ((kcz) kcvVar).f35618l = true;
                            Executor executor2 = ((kcz) kcvVar).f35610d;
                            final kcz kczVar = (kcz) kcvVar;
                            executor2.execute(new Runnable() { // from class: kcw
                                /* JADX WARN: Code duplicated, block: B:63:0x0137 A[Catch: all -> 0x01d1, TRY_LEAVE, TryCatch #1 {all -> 0x01d1, blocks: (B:5:0x0035, B:6:0x0037, B:15:0x0050, B:17:0x0054, B:20:0x0069, B:30:0x00a4, B:32:0x00a8, B:33:0x00ae, B:42:0x00cf, B:43:0x00db, B:51:0x00e8, B:53:0x00f7, B:55:0x010f, B:57:0x011a, B:59:0x0125, B:62:0x0131, B:63:0x0137, B:66:0x0142, B:71:0x0179, B:81:0x0189, B:82:0x018e, B:90:0x019c, B:94:0x01b4, B:77:0x0180, B:78:0x0185, B:80:0x0187, B:97:0x01b7, B:106:0x01d0, B:83:0x018f, B:85:0x0193, B:86:0x0196, B:89:0x019b, B:44:0x00dc, B:46:0x00e0, B:47:0x00e3, B:50:0x00e7, B:7:0x0038, B:9:0x003c, B:10:0x003f, B:13:0x0047, B:67:0x0149, B:68:0x014b, B:75:0x017e), top: B:120:0x0035, inners: #2, #5, #8, #10 }] */
                                /* JADX WARN: Code restructure failed: missing block: B:90:0x019c, code lost:
                                
                                    r18 = android.os.SystemClock.elapsedRealtime();
                                    r1.mo13971a();
                                    r9 = new p000.kdl();
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:91:0x01a8, code lost:
                                
                                    r17 = r2;
                                    r0 = r3;
                                    r2 = r4;
                                    r7 = true;
                                    r13 = 2;
                                 */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void run() {
                                    kdl kdlVar;
                                    CameraManager cameraManager2;
                                    kbz kbzVar2;
                                    kcz kczVar2 = kczVar;
                                    kczVar2.f35612f.mo13961e("OpenCamera#".concat(kczVar2.f35607a));
                                    try {
                                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                                        Object obj = kcl.CAMERA_ERROR_CODE_UNKNOWN;
                                        int i = 2;
                                        lqq lqqVar = new lqq(2);
                                        kdl kdlVar2 = new kdl();
                                        kcx kcxVar = null;
                                        boolean cameraDisabled = kczVar2.f35617k.getCameraDisabled(null);
                                        try {
                                            kcx kcxVar2 = new kcx(kczVar2);
                                            kczVar2.f35608b.registerAvailabilityCallback(kcxVar2, kczVar2.f35611e);
                                            try {
                                                synchronized (kczVar2.f35613g) {
                                                    if (kczVar2.f35619m) {
                                                        kdlVar2.mo13971a();
                                                        kczVar2.f35608b.unregisterAvailabilityCallback(kcxVar2);
                                                    } else {
                                                        kdl kdlVar3 = kdlVar2;
                                                        Object objM13983c = null;
                                                        long jElapsedRealtime2 = jElapsedRealtime;
                                                        boolean z = false;
                                                        while (true) {
                                                            if (lqqVar.f39001a == i) {
                                                                boolean z2 = z;
                                                                kdlVar = kdlVar3;
                                                                lqqVar = kczVar2.m13991b(kdlVar3, z, jElapsedRealtime, jElapsedRealtime2, cameraDisabled);
                                                                int i2 = lqqVar.f39001a;
                                                                if (i2 == 1) {
                                                                    if (z2) {
                                                                        Log.w("CAM_CameraDeviceOpener", KMNlNMe.pUopjeAJAEqqr + kczVar2.f35607a + " was opened successfully after a retry.");
                                                                        kczVar2.f35609c.mo10420aE(1, (kcl) obj, (String) objM13983c, 3);
                                                                    }
                                                                    cameraManager2 = kczVar2.f35608b;
                                                                } else if (i2 == 4) {
                                                                    cameraManager2 = kczVar2.f35608b;
                                                                } else if (i2 == 5) {
                                                                    if (!z2) {
                                                                        obj = kcl.CAMERA_OPEN_TIMEOUT;
                                                                    }
                                                                    if (!z2) {
                                                                        objM13983c = kcl.CAMERA_OPEN_TIMEOUT.m13983c();
                                                                    }
                                                                    kczVar2.m13990a(z2, (kcl) obj, (String) objM13983c);
                                                                    kdlVar.mo13973c((kcl) obj);
                                                                    cameraManager2 = kczVar2.f35608b;
                                                                } else {
                                                                    if (i2 != 2) {
                                                                        if (i2 != 3 || z2) {
                                                                            kdlVar3 = kdlVar;
                                                                            z = z2;
                                                                            i = 2;
                                                                        } else {
                                                                            z2 = false;
                                                                        }
                                                                    }
                                                                    Object obj2 = lqqVar.f39002b;
                                                                    Object obj3 = lqqVar.f39003c;
                                                                    lqq lqqVar2 = new lqq(2);
                                                                    synchronized (kczVar2.f35613g) {
                                                                        if (kczVar2.f35619m) {
                                                                            kdlVar.mo13971a();
                                                                            cameraManager2 = kczVar2.f35608b;
                                                                        } else if (SystemClock.elapsedRealtime() + 200 > jElapsedRealtime + 5000) {
                                                                            kczVar2.m13990a(z2, (kcl) obj2, (String) obj3);
                                                                            kdl kdlVar4 = new kdl();
                                                                            if (((kcl) obj2).equals(kcl.CAMERA_ACCESS_CAMERA_IN_USE)) {
                                                                                kdlVar4.mo13972b();
                                                                            } else {
                                                                                if (((kcl) obj2).equals(kcl.CAMERA_ACCESS_MAX_CAMERAS_IN_USE)) {
                                                                                    kdlVar4.mo13972b();
                                                                                } else {
                                                                                    if (((kcl) obj2).equals(kcl.CAMERA_DEVICE_ERROR_CAMERA_IN_USE)) {
                                                                                        kdlVar4.mo13972b();
                                                                                    } else {
                                                                                        if (((kcl) obj2).equals(kcl.CAMERA_DEVICE_ERROR_MAX_CAMERAS_IN_USE)) {
                                                                                            kdlVar4.mo13972b();
                                                                                        } else {
                                                                                            kdlVar4.mo13973c((kcl) obj2);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            kczVar2.f35608b.unregisterAvailabilityCallback(kcxVar2);
                                                                            kdlVar2 = kdlVar4;
                                                                        } else {
                                                                            kczVar2.f35612f.mo13961e("interruptableTimeout#wait");
                                                                            try {
                                                                                synchronized (kczVar2.f35614h) {
                                                                                    try {
                                                                                        Log.w("CAM_CameraDeviceOpener", "Failed to open camera device " + kczVar2.f35607a + ". Attempting retry in 200 milliseconds.");
                                                                                        kczVar2.f35614h.wait(200L);
                                                                                    } catch (Throwable th) {
                                                                                        throw th;
                                                                                    }
                                                                                }
                                                                                kbzVar2 = kczVar2.f35612f;
                                                                            } catch (InterruptedException e) {
                                                                                kbzVar2 = kczVar2.f35612f;
                                                                            } catch (Throwable th2) {
                                                                                kczVar2.f35612f.mo13962f();
                                                                                throw th2;
                                                                            }
                                                                            kbzVar2.mo13962f();
                                                                            synchronized (kczVar2.f35613g) {
                                                                                if (kczVar2.f35619m) {
                                                                                    kdlVar.mo13971a();
                                                                                }
                                                                            }
                                                                            cameraManager2 = kczVar2.f35608b;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                kdlVar = kdlVar3;
                                                                cameraManager2 = kczVar2.f35608b;
                                                            }
                                                            cameraManager2.unregisterAvailabilityCallback(kcxVar2);
                                                            kdlVar2 = kdlVar;
                                                        }
                                                    }
                                                }
                                                kdlVar2.m13998e(kczVar2.f35615i);
                                                kczVar2.f35616j.countDown();
                                                kczVar2.f35612f.mo13962f();
                                            } catch (Throwable th3) {
                                                th = th3;
                                                kcxVar = kcxVar2;
                                                if (kcxVar != null) {
                                                    kczVar2.f35608b.unregisterAvailabilityCallback(kcxVar);
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    } catch (Throwable th5) {
                                        try {
                                            kczVar2.f35615i.mo13971a();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            kczVar2.f35616j.countDown();
                                            throw th6;
                                        }
                                    }
                                }
                            });
                        }
                    }
                }
            }
            if (kctVar != null) {
                kdtVar2.m14004e(kctVar);
            }
            this.f35692b = kdtVar2;
            this.f35702l.m1587R(kmgVar);
        }
    }

    @Override // p000.kcu
    /* JADX INFO: renamed from: a */
    public final void mo13984a() {
        synchronized (this.f35691a) {
            kdt kdtVar = this.f35692b;
            if (kdtVar != null) {
                this.f35693c.add(kdtVar);
                this.f35692b = null;
            }
            Iterator it = this.f35693c.iterator();
            while (it.hasNext()) {
                ((kdt) it.next()).m14005f();
            }
        }
    }

    @Override // p000.kcu
    /* JADX INFO: renamed from: b */
    public final void mo13985b() {
        mws mwsVarM17095j;
        synchronized (this.f35691a) {
            kdt kdtVar = this.f35692b;
            if (kdtVar != null) {
                this.f35693c.add(kdtVar);
                this.f35692b = null;
            }
        }
        do {
            synchronized (this.f35691a) {
                mwsVarM17095j = mws.m17095j(this.f35693c);
            }
            int size = mwsVarM17095j.size();
            for (int i = 0; i < size; i++) {
                kdt kdtVar2 = (kdt) mwsVarM17095j.get(i);
                try {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    kdtVar2.m14005f();
                    kcv kcvVar = kdtVar2.f35674c;
                    synchronized (((kcz) kcvVar).f35613g) {
                        try {
                            if (((kcz) kcvVar).f35618l) {
                                ((kcz) kcvVar).f35616j.await(1500L, timeUnit);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    kdtVar2.f35673b.f35649b.await(1500L, timeUnit);
                } catch (InterruptedException e) {
                    this.f35698h.mo13948j("Warning: Failed to synchronously close " + String.valueOf(kdtVar2) + ".", e);
                }
            }
        } while (!mwsVarM17095j.isEmpty());
    }

    @Override // p000.kcu
    /* JADX INFO: renamed from: c */
    public final void mo13986c(kmg kmgVar, kct kctVar) {
        m14007f(kmgVar, kctVar);
    }

    @Override // p000.kcu
    /* JADX INFO: renamed from: d */
    public final void mo13987d(kmg kmgVar) {
        m14007f(kmgVar, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m14008e(kdt kdtVar) {
        synchronized (this.f35691a) {
            if (this.f35692b == kdtVar) {
                this.f35692b = null;
            }
            if (!this.f35693c.contains(kdtVar)) {
                this.f35693c.add(kdtVar);
            }
        }
    }
}
