package p000;

import android.animation.Animator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ily implements ilw {

    /* JADX INFO: renamed from: b */
    private final Animator f31466b;

    public ily(Animator animator) {
        this.f31466b = animator;
    }

    @Override // p000.ilw
    /* JADX INFO: renamed from: a */
    public final ilv mo11452a() {
        nqf nqfVarM17621g = nqf.m17621g();
        this.f31466b.addListener(new ilx(nqfVarM17621g));
        this.f31466b.start();
        return new ima(this.f31466b, nqfVarM17621g);
    }

    @Override // p000.ilw
    /* JADX INFO: renamed from: b */
    public final void mo11453b(Animator.AnimatorListener animatorListener) {
        this.f31466b.addListener(animatorListener);
    }
}
