package p221kc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: renamed from: kc.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6656c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BottomAppBar f37727a;

    public C6656c(BottomAppBar bottomAppBar) {
        this.f37727a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        BottomAppBar bottomAppBar = this.f37727a;
        bottomAppBar.getClass();
        bottomAppBar.f14801u0 = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f37727a.getClass();
    }
}
