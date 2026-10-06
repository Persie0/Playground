package p000;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class leg extends lga {

    /* JADX INFO: renamed from: a */
    private final EGLDisplay f38028a;

    public leg(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        super(eGLSurface);
        this.f38028a = eGLDisplay;
    }

    @Override // p000.lga
    /* JADX INFO: renamed from: b */
    protected final /* bridge */ /* synthetic */ void mo15247b(Object obj) {
        EGL14.eglDestroySurface(this.f38028a, (EGLSurface) obj);
    }
}
