package p199jd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: renamed from: jd.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6458c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f37028a;

    public C6458c(BaseTransientBottomBar baseTransientBottomBar, int i10) {
        this.f37028a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f37028a.m8835c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f37028a;
        InterfaceC6463h interfaceC6463h = baseTransientBottomBar.f15554j;
        int i10 = baseTransientBottomBar.f15546b;
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) interfaceC6463h;
        snackbarContentLayout.f15584a.setAlpha(1.0f);
        long j10 = i10;
        ViewPropertyAnimator duration = snackbarContentLayout.f15584a.animate().alpha(0.0f).setDuration(j10);
        TimeInterpolator timeInterpolator = snackbarContentLayout.f15586c;
        long j11 = 0;
        duration.setInterpolator(timeInterpolator).setStartDelay(j11).start();
        if (snackbarContentLayout.f15585b.getVisibility() == 0) {
            snackbarContentLayout.f15585b.setAlpha(1.0f);
            snackbarContentLayout.f15585b.animate().alpha(0.0f).setDuration(j10).setInterpolator(timeInterpolator).setStartDelay(j11).start();
        }
    }
}
