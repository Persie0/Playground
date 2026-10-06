package p000;

import android.animation.Animator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ima implements ilv {

    /* JADX INFO: renamed from: b */
    public final nps f31472b;

    /* JADX INFO: renamed from: c */
    private final Animator f31473c;

    public ima(Animator animator, nps npsVar) {
        this.f31473c = animator;
        this.f31472b = npsVar;
    }

    @Override // p000.ilv
    /* JADX INFO: renamed from: a */
    public final nps mo11449a() {
        return this.f31472b;
    }

    @Override // p000.ilv
    /* JADX INFO: renamed from: b */
    public final void mo11450b(ilu iluVar) {
        kxk.m14975U(this.f31472b, new jwq(iluVar, 1), not.INSTANCE);
    }

    @Override // p000.ilv
    /* JADX INFO: renamed from: c */
    public final void mo11451c() {
        this.f31473c.cancel();
    }
}
