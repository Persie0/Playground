package p000;

import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.SurfaceHolder;
import java.nio.Buffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ldo implements ldi {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ldn f37994a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ SurfaceHolder f37995b;

    /* JADX INFO: renamed from: c */
    private final ldi f37996c;

    public ldo(ldi ldiVar, ldn ldnVar, SurfaceHolder surfaceHolder) {
        this.f37994a = ldnVar;
        this.f37995b = surfaceHolder;
        this.f37996c = ldiVar;
    }

    @Override // p000.kyx
    /* JADX INFO: renamed from: a */
    public final laa mo15079a() {
        m15203b();
        return this.f37996c.mo15079a();
    }

    /* JADX INFO: renamed from: b */
    protected final void m15203b() {
        this.f37994a.f37992c = false;
        this.f37995b.removeCallback(this.f37994a);
    }

    @Override // p000.kyx, p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m15203b();
        this.f37996c.close();
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: d */
    public final EGLConfig mo15181d() {
        return this.f37996c.mo15181d();
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: e */
    public final EGLContext mo15182e() {
        return this.f37996c.mo15182e();
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: f */
    public final EGLDisplay mo15183f() {
        return this.f37996c.mo15183f();
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: g */
    public final EGLSurface mo15184g() {
        return this.f37996c.mo15184g();
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: h */
    public final leb mo15185h() {
        return this.f37996c.mo15185h();
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: i */
    public final void mo15186i() {
        this.f37996c.mo15186i();
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: k */
    public final void mo15188k() {
        this.f37996c.mo15188k();
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: l */
    public final void mo15189l(Buffer buffer) {
        this.f37996c.mo15189l(buffer);
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: m */
    public final void mo15190m() {
        this.f37996c.mo15190m();
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: n */
    public final lbl mo15191n() {
        return this.f37996c.mo15191n();
    }
}
