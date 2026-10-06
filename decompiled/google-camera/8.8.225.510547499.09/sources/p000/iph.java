package p000;

import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import com.google.android.apps.camera.jni.surface.SurfaceNative;
import com.google.android.libraries.oliveoil.p018gl.EGLImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iph implements ipp {

    /* JADX INFO: renamed from: b */
    private final Set f31723b;

    /* JADX INFO: renamed from: d */
    private final ipo f31725d;

    /* JADX INFO: renamed from: e */
    private final kbz f31726e;

    /* JADX INFO: renamed from: f */
    private Surface f31727f;

    /* JADX INFO: renamed from: a */
    public final List f31722a = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final Map f31724c = new HashMap();

    /* JADX INFO: renamed from: g */
    private boolean f31728g = false;

    public iph(Set set, ipo ipoVar, kbz kbzVar) {
        this.f31723b = set;
        this.f31725d = ipoVar;
        this.f31726e = kbzVar;
    }

    @Override // p000.ipp
    /* JADX INFO: renamed from: a */
    public final void mo11590a(kfc kfcVar, kgg kggVar) {
        this.f31725d.mo11585e(kfcVar, kggVar);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m11591b() {
        ipk ipkVarMo3626a;
        if (this.f31728g) {
            return;
        }
        ipo ipoVar = this.f31725d;
        ArrayList arrayList = new ArrayList(this.f31723b);
        Collections.sort(arrayList, amx.f749m);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ipn ipnVar = (ipn) arrayList.get(i);
            if (((Boolean) ipnVar.f31752b.mo3831be()).booleanValue()) {
                if (this.f31724c.get(ipnVar) == null) {
                    ipkVarMo3626a = ipnVar.f31751a.mo3626a(this.f31725d);
                    this.f31724c.put(ipnVar, ipkVarMo3626a);
                } else {
                    ipkVarMo3626a = (ipk) this.f31724c.get(ipnVar);
                }
                arrayList2.add(ipkVarMo3626a);
            }
        }
        ipoVar.mo11588h(arrayList2);
    }

    @Override // p000.ipp
    /* JADX INFO: renamed from: c */
    public final synchronized void mo11592c(Surface surface, int i, Size size) {
        lku.m15614I(surface.isValid(), "Surface is invalid: ignoring set filter output");
        Surface surface2 = this.f31727f;
        if (surface == surface2) {
            return;
        }
        this.f31726e.mo13961e("setSurfaceGeometry");
        int surfaceGeometry = SurfaceNative.setSurfaceGeometry(surface, size.getWidth(), size.getHeight(), i);
        if (surfaceGeometry != 0) {
            ((nbe) ((nbe) ipi.f31729a.m17251b()).mo17276G(4369)).mo17291p("Failed to setSurfaceGeometry: %d", surfaceGeometry);
        }
        this.f31726e.mo13962f();
        this.f31727f = surface;
        this.f31725d.mo11587g(surface, size);
        if (surface2 != null) {
            surface2.release();
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        lku.m15614I(!this.f31728g, "ViewfinderFilter is closed already");
        this.f31728g = true;
        try {
            Iterator it = this.f31722a.iterator();
            while (it.hasNext()) {
                ((kba) it.next()).close();
            }
            this.f31725d.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000.ipj
    /* JADX INFO: renamed from: d */
    public final mrm mo11584d(int i, int i2) {
        mrm mrmVarM16829i;
        ipo ipoVar = this.f31725d;
        synchronized (ipoVar) {
            if (((ipg) ipoVar).f31708l) {
                ((nbe) ((nbe) ipg.f31697a.m17252c()).mo17276G(4358)).mo17290o("cannot take screenshot after viewfinder effects pipeline is closed");
                mrmVarM16829i = mqu.f41450a;
            } else {
                key keyVar = ((ipg) ipoVar).f31705i;
                if (keyVar == null) {
                    ((nbe) ((nbe) ipg.f31697a.m17252c()).mo17276G(4357)).mo17290o("no frame found to save as screenshot");
                    mrmVarM16829i = mqu.f41450a;
                } else {
                    kpw kpwVarMo7043d = keyVar.mo7043d(((ipg) ipoVar).f31704h);
                    try {
                        if (kpwVarMo7043d == null) {
                            ((nbe) ((nbe) ipg.f31697a.m17252c()).mo17276G(4356)).mo17290o("can't save screenshot as frame has no associated YUV image");
                            mrmVarM16829i = mqu.f41450a;
                        } else {
                            HardwareBuffer hardwareBufferMo7250f = kpwVarMo7043d.mo7250f();
                            try {
                                if (hardwareBufferMo7250f == null) {
                                    ((nbe) ((nbe) ipg.f31697a.m17252c()).mo17276G(4355)).mo17290o("can't save screenshot as YUV image has no associated HardwareBuffer");
                                    mrmVarM16829i = mqu.f41450a;
                                    kpwVarMo7043d.close();
                                } else {
                                    boolean z = true;
                                    if (((ipg) ipoVar).f31703g != kmq.f36557a && !((Boolean) ((ipg) ipoVar).f31700d.mo3831be()).booleanValue()) {
                                        z = false;
                                    }
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                                    EGLImage eGLImage = new EGLImage(hardwareBufferMo7250f);
                                    try {
                                        lcy lcyVarM15192b = lcy.m15192b(((ipg) ipoVar).f31699c, eGLImage);
                                        try {
                                            lfw lfwVarM15293a = lfy.m15293a(bitmapCreateBitmap);
                                            ldx ldxVarM15224n = ldx.m15224n(((ipg) ipoVar).mo11583b(), ((lfx) lfwVarM15293a).f38168a);
                                            try {
                                                lea leaVarM15230a = lea.m15230a(((ipg) ipoVar).mo11583b());
                                                try {
                                                    int iM11582a = ((ipg) ipoVar).m11582a();
                                                    if (z) {
                                                        iM11582a = (360 - iM11582a) % 360;
                                                    }
                                                    float[] fArr = new float[16];
                                                    Matrix.setIdentityM(fArr, 0);
                                                    Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
                                                    Matrix.rotateM(fArr, 0, -iM11582a, 0.0f, 0.0f, 1.0f);
                                                    if (z) {
                                                        if (iM11582a % 180 == 0) {
                                                            Matrix.rotateM(fArr, 0, 180.0f, 0.0f, 1.0f, 0.0f);
                                                        } else {
                                                            Matrix.rotateM(fArr, 0, 180.0f, 1.0f, 0.0f, 0.0f);
                                                        }
                                                    }
                                                    Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
                                                    for (int i3 = 0; i3 < 16; i3++) {
                                                        fArr[i3] = Math.round(fArr[i3]);
                                                    }
                                                    leaVarM15230a.m15236f(lcyVarM15192b, ldxVarM15224n, fArr);
                                                    ldxVarM15224n.m15226i(lfwVarM15293a);
                                                    lzd.m16234m(((ipg) ipoVar).f31699c);
                                                    leaVarM15230a.close();
                                                    ldxVarM15224n.close();
                                                    lcyVarM15192b.close();
                                                    eGLImage.close();
                                                    mrmVarM16829i = mrm.m16829i(bitmapCreateBitmap);
                                                    hardwareBufferMo7250f.close();
                                                    kpwVarMo7043d.close();
                                                } catch (Throwable th) {
                                                    try {
                                                        leaVarM15230a.close();
                                                        throw th;
                                                    } catch (Throwable th2) {
                                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                                        throw th;
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                try {
                                                    ldxVarM15224n.close();
                                                    throw th3;
                                                } catch (Throwable th4) {
                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                                    throw th3;
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            try {
                                                lcyVarM15192b.close();
                                                throw th5;
                                            } catch (Throwable th6) {
                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
                                                throw th5;
                                            }
                                        }
                                    } catch (Throwable th7) {
                                        try {
                                            eGLImage.close();
                                            throw th7;
                                        } catch (Throwable th8) {
                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th7, th8);
                                            throw th7;
                                        }
                                    }
                                }
                            } catch (Throwable th9) {
                                if (hardwareBufferMo7250f == null) {
                                    throw th9;
                                }
                                try {
                                    hardwareBufferMo7250f.close();
                                    throw th9;
                                } catch (Throwable th10) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th9, th10);
                                    throw th9;
                                }
                            }
                        }
                    } catch (Throwable th11) {
                        if (kpwVarMo7043d == null) {
                            throw th11;
                        }
                        try {
                            kpwVarMo7043d.close();
                            throw th11;
                        } catch (Throwable th12) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th11, th12);
                            throw th11;
                        }
                    }
                }
            }
        }
        return mrmVarM16829i;
    }
}
