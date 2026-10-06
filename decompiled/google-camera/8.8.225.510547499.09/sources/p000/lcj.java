package p000;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES30;
import android.util.Log;
import androidx.wear.ambient.AmbientMode;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lcj implements Callable {

    /* JADX INFO: renamed from: a */
    private final leb f37922a;

    /* JADX INFO: renamed from: b */
    private final AmbientMode.AmbientController f37923b;

    public lcj(leb lebVar, AmbientMode.AmbientController ambientController, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f37922a = lebVar;
        this.f37923b = ambientController;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        leb lebVar = this.f37922a;
        AmbientMode.AmbientController ambientController = this.f37923b;
        kzh kzhVarM15087d = kzi.m15087d(1, 1);
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new lbq("EGL Error: Bad display: ".concat(String.valueOf(ldp.m15207d())));
        }
        synchronized (ldp.f37997a) {
            int[] iArr = ldp.f37997a;
            if (iArr[0] == 0 && !EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                throw new lbq("EGL Error: eglInitialize failed: " + ldp.m15207d());
            }
        }
        int[] iArr2 = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
            throw new IllegalArgumentException("EGL Error: eglChooseConfig failed!");
        }
        if (iArr2[0] == 0) {
            throw new IllegalArgumentException("Could not find suitable EGLConfig!");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, lebVar.f38017b, 12344}, 0);
        if (eGLContextEglCreateContext == null || eGLContextEglCreateContext == EGL14.EGL_NO_CONTEXT) {
            throw lbq.m15150a(lebVar);
        }
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{12375, kzhVarM15087d.m15089b(), 12374, kzhVarM15087d.m15088a(), 12344}, 0);
        if (eGLSurfaceEglCreatePbufferSurface == EGL14.EGL_NO_SURFACE) {
            throw new lbq("EGL Error: Bad surface: ".concat(String.valueOf(ldp.m15207d())));
        }
        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
        String strGlGetString = GLES30.glGetString(7938);
        String[] strArrSplit = strGlGetString.split("\\s");
        if (strArrSplit.length < 3 || !strArrSplit[0].equals("OpenGL") || !strArrSplit[1].equals("ES")) {
            throw new lbq("Unexpected GL version string '" + strGlGetString + "'!");
        }
        String str = strArrSplit[2];
        String[] strArrSplit2 = str.split("\\.");
        if (strArrSplit2.length == 1) {
            strArrSplit2 = new String[]{strArrSplit2[0], "0"};
        }
        int length = strArrSplit2.length;
        if (length != 2 && length != 3) {
            throw new lbq("Unexpected GL version format '" + str + yTyWiTtGtnBhy.IlpsMmsm);
        }
        try {
            ldj ldjVar = new ldj(new leb(Integer.parseInt(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1])), eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext, eGLConfig, lzd.m16236o((lbl) ambientController.f1697a, kzhVarM15087d), eGLDisplayEglGetDisplay);
            if (ldjVar.f37966c.compareTo(lebVar) >= 0) {
                return ldjVar;
            }
            Log.e("GLRootCanvasCore", "Wanted " + lebVar.toString() + " but got: " + ldjVar.f37966c.toString());
            ldjVar.close();
            throw lbq.m15150a(lebVar);
        } catch (NumberFormatException e) {
            throw new lbq("Unexpected numerical GL version format '" + str + "'!");
        }
    }
}
