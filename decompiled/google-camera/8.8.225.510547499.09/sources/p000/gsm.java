package p000;

import android.graphics.drawable.AnimatedVectorDrawable;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gsm extends gsi implements hjq {

    /* JADX INFO: renamed from: a */
    public final ProgressOverlay f26223a;

    /* JADX INFO: renamed from: b */
    public boolean f26224b;

    /* JADX INFO: renamed from: c */
    public final AnimatedVectorDrawable f26225c;

    /* JADX INFO: renamed from: d */
    public final hjp f26226d;

    /* JADX INFO: renamed from: e */
    public final hjr f26227e;

    /* JADX INFO: renamed from: f */
    public final hjr f26228f;

    public gsm(ProgressOverlay progressOverlay) {
        jvd.m13538a();
        this.f26223a = progressOverlay;
        AnimatedVectorDrawable animatedVectorDrawable = progressOverlay.f6881a;
        this.f26225c = animatedVectorDrawable;
        animatedVectorDrawable.registerAnimationCallback(new gsj(this));
        this.f26224b = false;
        hjr hjrVar = new hjr(new gsd(this), new hjn[0]);
        this.f26227e = hjrVar;
        this.f26228f = new hjr(new gse(this), new hjn[0]);
        hjp hjpVar = new hjp(hjrVar, false);
        this.f26226d = hjpVar;
        hjpVar.m10391f();
    }

    @Override // p000.gsi
    /* JADX INFO: renamed from: a */
    public final void mo9699a() {
        if (this.f26226d.m10386a() == null) {
            return;
        }
        ((gsi) this.f26226d.m10386a().f28059a).mo9699a();
    }

    @Override // p000.gsi
    /* JADX INFO: renamed from: b */
    public final void mo9700b() {
        if (this.f26226d.m10386a() == null) {
            return;
        }
        ((gsi) this.f26226d.m10386a().f28059a).mo9700b();
    }

    @Override // p000.hjq
    /* JADX INFO: renamed from: e */
    public final void mo5710e() {
        this.f26226d.m10387b();
        this.f26227e.mo5710e();
        this.f26228f.mo5710e();
    }

    @Override // p000.gsi, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f26226d.m10388c();
    }

    @Override // p000.gsi, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        this.f26226d.m10389d();
    }

    @Override // p000.gsi, p000.hjn
    /* JADX INFO: renamed from: h */
    public final void mo5713h() {
        jbx.m12868m(this);
    }
}
