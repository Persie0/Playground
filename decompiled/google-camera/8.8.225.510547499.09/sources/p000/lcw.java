package p000;

import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import java.nio.Buffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lcw extends kze implements ldi {

    /* JADX INFO: renamed from: c */
    public final kzl f37959c = new kzl(null);

    /* JADX INFO: renamed from: d */
    private final lgb f37960d;

    public lcw(lgb lgbVar) {
        this.f37960d = lgbVar;
    }

    /* JADX INFO: renamed from: o */
    private final ldi m15180o() {
        ldi ldiVar = (ldi) this.f37959c.get();
        return ldiVar != null ? ldiVar : (ldi) ((lge) this.f37960d).f38202a;
    }

    @Override // p000.kze
    /* JADX INFO: renamed from: b */
    protected final laa mo15085b() {
        ldi ldiVar = (ldi) this.f37959c.getAndSet(null);
        if (ldiVar == null) {
            return kzz.f37797a;
        }
        laa laaVarA = ldiVar.mo15079a();
        laa laaVar = kzz.f37797a;
        return laa.m15115k(laaVarA.mo15105d(not.INSTANCE, new kzs(laaVar, 3), new lad(laaVar, 0)));
    }

    @Override // p000.kze
    /* JADX INFO: renamed from: cn */
    protected final void mo15086cn() {
        this.f37959c.m15091a(null);
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: d */
    public final EGLConfig mo15181d() {
        return m15180o().mo15181d();
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: e */
    public final EGLContext mo15182e() {
        return m15180o().mo15182e();
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: f */
    public final EGLDisplay mo15183f() {
        return m15180o().mo15183f();
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: g */
    public final EGLSurface mo15184g() {
        return m15180o().mo15184g();
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: h */
    public final leb mo15185h() {
        return m15180o().mo15185h();
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: i */
    public final void mo15186i() {
        m15180o().mo15186i();
    }

    /* JADX INFO: renamed from: j */
    public final void m15187j() {
        this.f37959c.m15091a(null);
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: k */
    public final void mo15188k() {
        m15180o().mo15188k();
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: l */
    public final void mo15189l(Buffer buffer) {
        m15180o().mo15189l(buffer);
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: m */
    public final void mo15190m() {
        m15180o().mo15190m();
    }

    @Override // p000.ldi
    /* JADX INFO: renamed from: n */
    public final lbl mo15191n() {
        return m15180o().mo15191n();
    }
}
