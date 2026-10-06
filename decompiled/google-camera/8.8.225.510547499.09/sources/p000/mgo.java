package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mgo extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ HideBottomViewOnScrollBehavior f40449a;

    public mgo(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.f40449a = hideBottomViewOnScrollBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f40449a.f8060a = null;
    }
}
