package p406u4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: u4.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9413h0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC9409f0 f48333a;

    public C9413h0(AbstractC9409f0 abstractC9409f0) {
        this.f48333a = abstractC9409f0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f48333a.m17802s();
        animator.removeListener(this);
    }
}
