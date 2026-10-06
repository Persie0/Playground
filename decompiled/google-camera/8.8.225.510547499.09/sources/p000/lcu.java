package p000;

import android.opengl.EGL14;
import android.opengl.GLES30;
import android.opengl.GLU;
import android.opengl.GLUtils;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lcu implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f37951a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f37952b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f37953c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f37954d;

    public lcu(lav lavVar, kyz kyzVar, lav lavVar2, int i) {
        this.f37954d = i;
        this.f37951a = lavVar;
        this.f37953c = kyzVar;
        this.f37952b = lavVar2;
    }

    public lcu(lcv lcvVar, Runnable runnable, Throwable th, int i) {
        this.f37954d = i;
        this.f37953c = lcvVar;
        this.f37951a = runnable;
        this.f37952b = th;
    }

    public final String toString() {
        switch (this.f37954d) {
            case 0:
                return "checked [" + this.f37951a.toString() + "]";
            default:
                return this.f37951a.toString() + "then[" + String.valueOf(this.f37953c) + "]";
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kyz] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37954d) {
            case 0:
                int iIncrementAndGet = ((lcv) this.f37953c).f37955a.incrementAndGet();
                boolean z = ((lcv) this.f37953c).f37956b.get();
                this.f37951a.run();
                ?? r2 = this.f37951a;
                Object obj = this.f37952b;
                int iEglGetError = EGL14.eglGetError();
                String str = xRFdVyfdeve.lpkPKPE;
                if (iEglGetError != 12288) {
                    kua.m14881t(r2, iIncrementAndGet, iEglGetError, GLES30.glGetError(), z);
                    String eGLErrorString = GLUtils.getEGLErrorString(iEglGetError);
                    throw new RuntimeException("Executing EGL task '" + r2.toString() + "' caused error: " + eGLErrorString + str, (Throwable) obj);
                }
                ?? r3 = this.f37951a;
                Object obj2 = this.f37952b;
                int iGlGetError = GLES30.glGetError();
                if (iGlGetError == 0) {
                    return;
                }
                kua.m14881t(r3, iIncrementAndGet, EGL14.eglGetError(), iGlGetError, z);
                String strGluErrorString = GLU.gluErrorString(iGlGetError);
                throw new RuntimeException("Executing GL task '" + r3.toString() + "' caused error " + strGluErrorString + str, (Throwable) obj2);
            default:
                Object obj3 = ((lav) this.f37951a).f37856a;
                if (obj3 != null) {
                    lav.m15122k(obj3, this.f37953c, (lav) this.f37952b);
                    return;
                }
                ((lav) this.f37952b).m15131m(((lav) this.f37951a).f37857b);
                return;
        }
    }
}
