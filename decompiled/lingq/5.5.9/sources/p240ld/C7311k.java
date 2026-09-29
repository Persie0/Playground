package p240ld;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: ld.k */
/* JADX INFO: loaded from: classes.dex */
public final class C7311k extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7312l f40936a;

    public C7311k(C7312l c7312l) {
        this.f40936a = c7312l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C7312l c7312l = this.f40936a;
        c7312l.m14716q();
        c7312l.f40950r.start();
    }
}
