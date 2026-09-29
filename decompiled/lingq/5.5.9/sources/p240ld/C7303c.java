package p240ld;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: ld.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7303c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7304d f40917a;

    public C7303c(C7304d c7304d) {
        this.f40917a = c7304d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f40917a.f40952b.m8913g(false);
    }
}
