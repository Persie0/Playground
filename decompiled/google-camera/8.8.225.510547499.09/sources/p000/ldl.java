package p000;

import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ldl extends ldc {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ ldi f37984g;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ int f37985h;

    /* JADX INFO: renamed from: i */
    final /* synthetic */ int f37986i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ldl(leb lebVar, EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext, EGLConfig eGLConfig, int i, lbm lbmVar, ldi ldiVar, int i2, int i3) {
        super(lebVar, eGLDisplay, eGLSurface, eGLContext, eGLConfig, i, lbmVar);
        this.f37984g = ldiVar;
        this.f37985h = i2;
        this.f37986i = i3;
    }

    @Override // p000.kze
    /* JADX INFO: renamed from: b */
    public final laa mo15085b() {
        this.f37984g.mo15188k();
        ldp.m15209f(this.f37985h);
        ldp.m15208e(this.f37986i);
        return kzz.f37797a;
    }
}
