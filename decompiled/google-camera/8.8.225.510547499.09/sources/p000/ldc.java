package p000;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES30;
import java.nio.Buffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class ldc extends kze implements ldi {

    /* JADX INFO: renamed from: c */
    public final leb f37966c;

    /* JADX INFO: renamed from: d */
    public final EGLDisplay f37967d;

    /* JADX INFO: renamed from: e */
    public final EGLSurface f37968e;

    /* JADX INFO: renamed from: f */
    public final EGLContext f37969f;

    /* JADX INFO: renamed from: g */
    private final EGLConfig f37970g;

    /* JADX INFO: renamed from: h */
    private final int f37971h;

    /* JADX INFO: renamed from: i */
    private final lbl f37972i;

    public ldc(leb lebVar, EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext, EGLConfig eGLConfig, int i, lbl lblVar) {
        this.f37966c = lebVar;
        this.f37967d = eGLDisplay;
        this.f37968e = eGLSurface;
        this.f37969f = eGLContext;
        this.f37970g = eGLConfig;
        this.f37971h = i;
        this.f37972i = lblVar;
    }

    @Override // p000.kze
    /* JADX INFO: renamed from: cn */
    public final void mo15086cn() {
        lqi.m15868m(mo15085b());
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: d */
    public final EGLConfig mo15181d() {
        return this.f37970g;
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: e */
    public final EGLContext mo15182e() {
        return this.f37969f;
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: f */
    public final EGLDisplay mo15183f() {
        return this.f37967d;
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: g */
    public final EGLSurface mo15184g() {
        return this.f37968e;
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: h */
    public final leb mo15185h() {
        return this.f37966c;
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: i */
    public final void mo15186i() {
        if (this.f37966c.m15238b(leb.f38016a)) {
            GLES30.glClearBufferfv(6144, 0, new float[]{0.0f, 0.0f, 0.0f, 1.0f}, 0);
        } else {
            GLES30.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES30.glClear(16384);
        }
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: k */
    public final void mo15188k() {
        EGLDisplay eGLDisplay = this.f37967d;
        EGLSurface eGLSurface = this.f37968e;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f37969f)) {
            GLES30.glBindFramebuffer(36160, this.f37971h);
            GLES30.glViewport(0, 0, this.f37972i.f37877a.m15089b(), this.f37972i.f37877a.m15088a());
        }
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: l */
    public final void mo15189l(Buffer buffer) {
        ldd.m15198a();
        if (this.f37966c.m15238b(leb.f38016a)) {
            GLES30.glReadBuffer(36064);
        }
        kzh kzhVar = this.f37972i.f37877a;
        GLES30.glReadPixels(0, 0, kzhVar.m15089b(), kzhVar.m15088a(), 6408, 5121, buffer);
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: m */
    public final void mo15190m() {
        if (this.f37971h == 0) {
            EGL14.eglSwapBuffers(this.f37967d, this.f37968e);
        }
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: n */
    public final lbl mo15191n() {
        return this.f37972i;
    }
}
