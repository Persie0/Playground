package p000;

import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ldk extends ldc {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ ldi f37982g;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ lgb f37983h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ldk(leb lebVar, EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext, EGLConfig eGLConfig, lbl lblVar, ldi ldiVar, lgb lgbVar) {
        super(lebVar, eGLDisplay, eGLSurface, eGLContext, eGLConfig, 0, lblVar);
        this.f37982g = ldiVar;
        this.f37983h = lgbVar;
    }

    @Override // p000.kze
    /* JADX INFO: renamed from: b */
    public final laa mo15085b() {
        try {
            this.f37982g.mo15188k();
            return this.f37983h.mo15079a();
        } catch (Throwable th) {
            return laa.m15114j(this.f37983h.mo15079a().mo15102a(not.INSTANCE, lqi.m15874s(th)));
        }
    }
}
