package p221kc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: renamed from: kc.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6657d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public boolean f37728a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ActionMenuView f37729b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f37730c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f37731d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ BottomAppBar f37732e;

    public C6657d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i10, boolean z10) {
        this.f37732e = bottomAppBar;
        this.f37729b = actionMenuView;
        this.f37730c = i10;
        this.f37731d = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f37728a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f37728a) {
            BottomAppBar bottomAppBar = this.f37732e;
            int i10 = bottomAppBar.f14796B0;
            boolean z10 = i10 != 0;
            if (i10 != 0) {
                bottomAppBar.f14796B0 = 0;
                bottomAppBar.getMenu().clear();
                bottomAppBar.mo1059k(i10);
            }
            bottomAppBar.m8597D(this.f37729b, this.f37730c, this.f37731d, z10);
        }
    }
}
