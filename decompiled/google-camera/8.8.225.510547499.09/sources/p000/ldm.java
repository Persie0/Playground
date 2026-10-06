package p000;

import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ldm extends ldc {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ ldi f37987g;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ int f37988h;

    /* JADX INFO: renamed from: i */
    final /* synthetic */ lgb f37989i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ldm(leb lebVar, EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext, EGLConfig eGLConfig, int i, lbl lblVar, ldi ldiVar, int i2, lgb lgbVar) {
        super(lebVar, eGLDisplay, eGLSurface, eGLContext, eGLConfig, i, lblVar);
        this.f37987g = ldiVar;
        this.f37988h = i2;
        this.f37989i = lgbVar;
    }

    @Override // p000.kze
    /* JADX INFO: renamed from: b */
    public final laa mo15085b() {
        try {
            this.f37987g.mo15188k();
            ldp.m15209f(0);
            ldp.m15208e(this.f37988h);
            return this.f37989i.mo15079a();
        } catch (Throwable th) {
            return laa.m15114j(this.f37989i.mo15079a().mo15102a(not.INSTANCE, lqi.m15874s(th)));
        }
    }
}
