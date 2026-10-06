package p000;

import android.animation.Animator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class gwk extends gwg {

    /* JADX INFO: renamed from: a */
    private Animator f26590a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ gwn f26591b;

    public gwk(gwn gwnVar) {
        this.f26591b = gwnVar;
    }

    @Override // p000.gwg
    /* JADX INFO: renamed from: a */
    public void mo9814a() {
    }

    @Override // p000.gwg
    /* JADX INFO: renamed from: c */
    public void mo9847c() {
    }

    @Override // p000.gwg
    /* JADX INFO: renamed from: d */
    public void mo9848d() {
    }

    @Override // p000.gwg, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f26591b.m9855i();
        Animator animatorMo9861c = ((gwq) this.f26591b.f26595b.get()).mo9861c(this.f26591b.m9857k());
        this.f26590a = animatorMo9861c;
        animatorMo9861c.addListener(new gwj(this));
        this.f26590a.start();
    }

    @Override // p000.gwg, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        if (this.f26590a.isRunning()) {
            this.f26590a.removeAllListeners();
            this.f26590a.cancel();
        }
        this.f26591b.m9856j();
    }
}
