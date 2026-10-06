package p000;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES30;
import android.opengl.GLUtils;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ldp {

    /* JADX INFO: renamed from: a */
    public static final int[] f37997a = new int[2];

    /* JADX INFO: renamed from: a */
    public static int m15204a() {
        int[] iArr = new int[1];
        GLES30.glGenFramebuffers(1, iArr, 0);
        return iArr[0];
    }

    /* JADX INFO: renamed from: b */
    public static ldi m15205b(ldi ldiVar, lgb lgbVar, kzh kzhVar) {
        EGLDisplay eGLDisplayMo15183f = ldiVar.mo15183f();
        lgc lgcVar = new lgc(new leg(eGLDisplayMo15183f, EGL14.eglCreateWindowSurface(eGLDisplayMo15183f, ldiVar.mo15181d(), lgbVar.mo15294c(), new int[]{12344}, 0)), Arrays.asList(lgbVar));
        return new ldk(ldiVar.mo15185h(), ldiVar.mo15183f(), (EGLSurface) lgcVar.mo15294c(), ldiVar.mo15182e(), ldiVar.mo15181d(), lzd.m16236o(ldiVar.mo15191n(), kzhVar), ldiVar, lgcVar);
    }

    /* JADX INFO: renamed from: c */
    public static ldi m15206c(lgb lgbVar) {
        int iM15204a = m15204a();
        ldz ldzVar = (ldz) lgbVar.mo15294c();
        GLES30.glBindFramebuffer(36160, iM15204a);
        GLES30.glFramebufferTexture2D(36160, 36064, ((ldv) ldzVar.mo15164c()).f38000c, ((ldv) ldzVar.mo15164c()).f37998b, 0);
        ldi ldiVar = (ldi) ldzVar.f37915b.mo15157i().mo15164c();
        return new ldm(ldiVar.mo15185h(), ldiVar.mo15183f(), ldiVar.mo15184g(), ldiVar.mo15182e(), ldiVar.mo15181d(), iM15204a, ldzVar.m15229b(), ldiVar, iM15204a, lgbVar);
    }

    /* JADX INFO: renamed from: d */
    public static String m15207d() {
        return GLUtils.getEGLErrorString(EGL14.eglGetError());
    }

    /* JADX INFO: renamed from: e */
    public static void m15208e(int i) {
        GLES30.glDeleteFramebuffers(1, new int[]{i}, 0);
    }

    /* JADX INFO: renamed from: f */
    public static void m15209f(int i) {
        GLES30.glDeleteRenderbuffers(1, new int[]{i}, 0);
    }
}
