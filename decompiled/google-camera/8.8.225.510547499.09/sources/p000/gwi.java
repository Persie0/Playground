package p000;

import android.animation.Animator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class gwi extends gwg {

    /* JADX INFO: renamed from: a */
    private Animator f26587a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ gwn f26588b;

    public gwi(gwn gwnVar) {
        this.f26588b = gwnVar;
    }

    @Override // p000.gwg
    /* JADX INFO: renamed from: a */
    public void mo9814a() {
    }

    @Override // p000.gwg
    /* JADX INFO: renamed from: b */
    public void mo9815b() {
    }

    @Override // p000.gwg, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        Animator animatorMo9860b = ((gwq) this.f26588b.f26595b.get()).mo9860b(this.f26588b.m9857k());
        this.f26587a = animatorMo9860b;
        animatorMo9860b.addListener(new gwh(this));
        this.f26587a.start();
    }

    @Override // p000.gwg, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        if (this.f26587a.isRunning()) {
            this.f26587a.removeAllListeners();
            this.f26587a.cancel();
        }
    }
}
