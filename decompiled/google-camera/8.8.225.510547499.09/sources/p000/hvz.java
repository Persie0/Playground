package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hvz extends huy implements hjq {

    /* JADX INFO: renamed from: l */
    public final hjp f29697l;

    /* JADX INFO: renamed from: m */
    public final hjr f29698m;

    /* JADX INFO: renamed from: n */
    public final hjr f29699n;

    public hvz(jww jwwVar, BottomBarController bottomBarController, igb igbVar, hxp hxpVar, icf icfVar, gfa gfaVar, bkn bknVar, jww jwwVar2, iuj iujVar, hsk hskVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(jwwVar, bottomBarController, igbVar, hxpVar, icfVar, gfaVar, bknVar, jwwVar2, iujVar, hskVar, null, null, null);
        this.f29698m = new hjr(new hvx(this), new hjn[0]);
        hjr hjrVar = new hjr(new hvy(this), new hjn[0]);
        this.f29699n = hjrVar;
        hjp hjpVar = new hjp(hjrVar, false);
        this.f29697l = hjpVar;
        hjpVar.m10391f();
    }

    @Override // p000.huv
    /* JADX INFO: renamed from: a */
    public final void mo10779a() {
        if (this.f29697l.m10386a() == null) {
            return;
        }
        ((huv) this.f29697l.m10386a().f28059a).mo10779a();
    }

    @Override // p000.huv
    /* JADX INFO: renamed from: b */
    public final void mo10780b() {
        if (this.f29697l.m10386a() == null) {
            return;
        }
        ((huv) this.f29697l.m10386a().f28059a).mo10780b();
    }

    @Override // p000.hjq
    /* JADX INFO: renamed from: e */
    public final void mo5710e() {
        this.f29697l.m10387b();
        this.f29698m.mo5710e();
        this.f29699n.mo5710e();
    }

    @Override // p000.huv, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f29697l.m10388c();
    }

    @Override // p000.huv, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        this.f29697l.m10389d();
    }

    @Override // p000.huv, p000.hjn
    /* JADX INFO: renamed from: h */
    public final void mo5713h() {
        jbx.m12868m(this);
    }
}
