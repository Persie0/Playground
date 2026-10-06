package p000;

import android.opengl.EGL15;
import android.opengl.EGLDisplay;
import android.opengl.EGLSync;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lcz implements ldb {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ EGLDisplay f37962a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ EGLSync f37963b;

    public lcz(EGLDisplay eGLDisplay, EGLSync eGLSync) {
        this.f37962a = eGLDisplay;
        this.f37963b = eGLSync;
    }

    @Override // p000.ldb
    /* JADX INFO: renamed from: a */
    public final void mo15194a() {
        EGL15.eglClientWaitSync(this.f37962a, this.f37963b, 1, -1L);
    }

    @Override // p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        EGL15.eglDestroySync(this.f37962a, this.f37963b);
    }
}
