package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hvb extends htv implements hjq {

    /* JADX INFO: renamed from: k */
    public final hjp f29635k;

    /* JADX INFO: renamed from: l */
    public final hjr f29636l;

    /* JADX INFO: renamed from: m */
    public final hjr f29637m;

    public hvb(clo cloVar, BottomBarController bottomBarController, igb igbVar, hxp hxpVar, icf icfVar, gfa gfaVar, bkn bknVar, iuj iujVar, hsk hskVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(cloVar, bottomBarController, igbVar, hxpVar, icfVar, gfaVar, bknVar, iujVar, hskVar, null, null, null);
        this.f29636l = new hjr(new huz(this), new hjn[0]);
        hjr hjrVar = new hjr(new hva(this), new hjn[0]);
        this.f29637m = hjrVar;
        hjp hjpVar = new hjp(hjrVar, false);
        this.f29635k = hjpVar;
        hjpVar.m10391f();
    }

    @Override // p000.hts
    /* JADX INFO: renamed from: a */
    public final void mo10750a() {
        if (this.f29635k.m10386a() == null) {
            return;
        }
        ((hts) this.f29635k.m10386a().f28059a).mo10750a();
    }

    @Override // p000.hts
    /* JADX INFO: renamed from: b */
    public final void mo10751b() {
        if (this.f29635k.m10386a() == null) {
            return;
        }
        ((hts) this.f29635k.m10386a().f28059a).mo10751b();
    }

    @Override // p000.hjq
    /* JADX INFO: renamed from: e */
    public final void mo5710e() {
        this.f29635k.m10387b();
        this.f29636l.mo5710e();
        this.f29637m.mo5710e();
    }

    @Override // p000.hts, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f29635k.m10388c();
    }

    @Override // p000.hts, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        this.f29635k.m10389d();
    }

    @Override // p000.hts, p000.hjn
    /* JADX INFO: renamed from: h */
    public final void mo5713h() {
        jbx.m12868m(this);
    }
}
