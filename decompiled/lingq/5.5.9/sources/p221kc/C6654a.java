package p221kc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: renamed from: kc.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6654a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BottomAppBar f37723a;

    public C6654a(BottomAppBar bottomAppBar) {
        this.f37723a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        BottomAppBar bottomAppBar = this.f37723a;
        bottomAppBar.getClass();
        bottomAppBar.f14800t0 = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f37723a.getClass();
    }
}
