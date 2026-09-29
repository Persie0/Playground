package p199jd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: renamed from: jd.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6457b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f37027a;

    public C6457b(BaseTransientBottomBar baseTransientBottomBar) {
        this.f37027a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f37027a.m8836d();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f37027a;
        InterfaceC6463h interfaceC6463h = baseTransientBottomBar.f15554j;
        int i10 = baseTransientBottomBar.f15547c;
        int i11 = baseTransientBottomBar.f15545a;
        int i12 = i10 - i11;
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) interfaceC6463h;
        snackbarContentLayout.f15584a.setAlpha(0.0f);
        long j10 = i11;
        ViewPropertyAnimator duration = snackbarContentLayout.f15584a.animate().alpha(1.0f).setDuration(j10);
        TimeInterpolator timeInterpolator = snackbarContentLayout.f15586c;
        long j11 = i12;
        duration.setInterpolator(timeInterpolator).setStartDelay(j11).start();
        if (snackbarContentLayout.f15585b.getVisibility() == 0) {
            snackbarContentLayout.f15585b.setAlpha(0.0f);
            snackbarContentLayout.f15585b.animate().alpha(1.0f).setDuration(j10).setInterpolator(timeInterpolator).setStartDelay(j11).start();
        }
    }
}
