package p000;

import android.view.Window;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hwd extends hwo implements hjq {

    /* JADX INFO: renamed from: a */
    public final hjp f29704a;

    /* JADX INFO: renamed from: b */
    public final hjr f29705b;

    /* JADX INFO: renamed from: c */
    public final hjr f29706c;

    public hwd(jww jwwVar, BottomBarController bottomBarController, igb igbVar, iuj iujVar, Window window, hxp hxpVar, cwd cwdVar, gfa gfaVar, icf icfVar, huy huyVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(jwwVar, bottomBarController, igbVar, iujVar, window, hxpVar, cwdVar, gfaVar, icfVar, null, null, null);
        hjr hjrVar = new hjr(new hwb(this), huyVar);
        this.f29705b = hjrVar;
        this.f29706c = new hjr(new hwc(this), new hjn[0]);
        hjp hjpVar = new hjp(hjrVar, false);
        this.f29704a = hjpVar;
        hjpVar.m10391f();
    }

    @Override // p000.hwl
    /* JADX INFO: renamed from: a */
    public final void mo10781a() {
        if (this.f29704a.m10386a() == null) {
            return;
        }
        ((hwl) this.f29704a.m10386a().f28059a).mo10781a();
    }

    @Override // p000.hwl
    /* JADX INFO: renamed from: b */
    public final void mo10782b() {
        if (this.f29704a.m10386a() == null) {
            return;
        }
        ((hwl) this.f29704a.m10386a().f28059a).mo10782b();
    }

    @Override // p000.hjq
    /* JADX INFO: renamed from: e */
    public final void mo5710e() {
        this.f29704a.m10387b();
        this.f29705b.mo5710e();
        this.f29706c.mo5710e();
    }

    @Override // p000.hwo, p000.hwl, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        super.mo5711f();
        this.f29704a.m10388c();
    }

    @Override // p000.hwo, p000.hwl, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        super.mo5712g();
        this.f29704a.m10389d();
    }

    @Override // p000.hwl, p000.hjn
    /* JADX INFO: renamed from: h */
    public final void mo5713h() {
        jbx.m12868m(this);
    }
}
