package p240ld;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: ld.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7302b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7304d f40916a;

    public C7302b(C7304d c7304d) {
        this.f40916a = c7304d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f40916a.f40952b.m8913g(true);
    }
}
