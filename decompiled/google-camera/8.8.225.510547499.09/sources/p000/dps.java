package p000;

import android.animation.ObjectAnimator;
import android.widget.CheckBox;
import com.google.android.apps.camera.evcomp.EvCompView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dps extends dpj implements hjq {

    /* JADX INFO: renamed from: f */
    public final hjp f12237f;

    /* JADX INFO: renamed from: g */
    public final hjr f12238g;

    /* JADX INFO: renamed from: h */
    public final hjr f12239h;

    /* JADX INFO: renamed from: i */
    public final hjr f12240i;

    public dps(EvCompView evCompView, CheckBox checkBox, ObjectAnimator objectAnimator, dpo dpoVar, djm djmVar, dpo dpoVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(evCompView, checkBox, objectAnimator, dpoVar, djmVar, null, null, null);
        hjr hjrVar = new hjr(new dpp(this), new hjn[0]);
        this.f12238g = hjrVar;
        this.f12239h = new hjr(new dpq(this), new hjn[0]);
        this.f12240i = new hjr(new dpr(this), dpoVar2);
        hjp hjpVar = new hjp(hjrVar, false);
        this.f12237f = hjpVar;
        hjpVar.m10391f();
    }

    @Override // p000.dpe
    /* JADX INFO: renamed from: a */
    public final void mo6542a() {
        if (this.f12237f.m10386a() == null) {
            return;
        }
        ((dpe) this.f12237f.m10386a().f28059a).mo6542a();
    }

    @Override // p000.dpe
    /* JADX INFO: renamed from: b */
    public final void mo6543b(int i, int i2, float f) {
        if (this.f12237f.m10386a() == null) {
            return;
        }
        ((dpe) this.f12237f.m10386a().f28059a).mo6543b(i, i2, f);
    }

    @Override // p000.dpe
    /* JADX INFO: renamed from: c */
    public final void mo6544c(boolean z) {
        if (this.f12237f.m10386a() == null) {
            return;
        }
        ((dpe) this.f12237f.m10386a().f28059a).mo6544c(z);
    }

    @Override // p000.dpe
    /* JADX INFO: renamed from: d */
    public final void mo6545d(boolean z, boolean z2) {
        if (this.f12237f.m10386a() == null) {
            return;
        }
        ((dpe) this.f12237f.m10386a().f28059a).mo6545d(z, z2);
    }

    @Override // p000.hjq
    /* JADX INFO: renamed from: e */
    public final void mo5710e() {
        this.f12237f.m10387b();
        this.f12238g.mo5710e();
        this.f12239h.mo5710e();
        this.f12240i.mo5710e();
    }

    @Override // p000.dpe, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f12237f.m10388c();
    }

    @Override // p000.dpe, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        this.f12237f.m10389d();
    }

    @Override // p000.dpe, p000.hjn
    /* JADX INFO: renamed from: h */
    public final void mo5713h() {
        jbx.m12868m(this);
    }
}
