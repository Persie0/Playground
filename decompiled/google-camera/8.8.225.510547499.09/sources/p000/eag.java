package p000;

import android.opengl.EGL14;
import android.opengl.EGL15;
import android.opengl.EGLDisplay;
import android.opengl.EGLSync;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eag implements kba {

    /* JADX INFO: renamed from: a */
    public final AutoCloseable f13048a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ eah f13049b;

    public eag(eah eahVar, AutoCloseable autoCloseable) {
        this.f13049b = eahVar;
        this.f13048a = autoCloseable;
    }

    /* JADX INFO: renamed from: a */
    public final AutoCloseable m6996a() {
        AutoCloseable autoCloseable = this.f13048a;
        autoCloseable.getClass();
        return autoCloseable;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        if (this.f13048a == null) {
            return;
        }
        final nqf nqfVarM17621g = nqf.m17621g();
        final nqf nqfVarM17621g2 = nqf.m17621g();
        this.f13049b.f13052c.execute(new Runnable() { // from class: eae
            @Override // java.lang.Runnable
            public final void run() {
                nqf nqfVar = nqfVarM17621g2;
                nqf nqfVar2 = nqfVarM17621g;
                EGLDisplay eGLDisplayEglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
                nqfVar.mo14894e(eGLDisplayEglGetCurrentDisplay);
                EGLSync eGLSyncEglCreateSync = EGL15.eglCreateSync(eGLDisplayEglGetCurrentDisplay, 12537, new long[]{12344}, 0);
                boolean z = lbo.f37882a;
                nqfVar2.mo14894e(eGLSyncEglCreateSync);
            }
        });
        this.f13049b.f13053d.execute(new Runnable() { // from class: eaf
            @Override // java.lang.Runnable
            public final void run() {
                eag eagVar = this.f13045a;
                nqf nqfVar = nqfVarM17621g;
                nqf nqfVar2 = nqfVarM17621g2;
                EGLSync eGLSync = (EGLSync) kxk.m14974T(nqfVar);
                EGLDisplay eGLDisplay = (EGLDisplay) kxk.m14974T(nqfVar2);
                EGL15.eglClientWaitSync(eGLDisplay, eGLSync, 1, -1L);
                boolean z = lbo.f37882a;
                EGL15.eglDestroySync(eGLDisplay, eGLSync);
                try {
                    eagVar.f13048a.close();
                } catch (Exception e) {
                    ((nbe) ((nbe) ((nbe) eah.f13050a.m17251b()).mo17283h(e)).mo17276G(1229)).mo17301z("Error while closing resource %s: %s", eagVar.f13048a, e);
                }
            }
        });
    }

    public final String toString() {
        return NptsKnlVczSZ.sRjJs + String.valueOf(this.f13048a) + "]";
    }
}
