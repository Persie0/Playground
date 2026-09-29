package com.google.android.material.snackbar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.ViewParent;
import p199jd.C6457b;
import p199jd.C6462g;

/* JADX INFO: renamed from: com.google.android.material.snackbar.f */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3067f implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f15593a;

    public RunnableC3067f(BaseTransientBottomBar baseTransientBottomBar) {
        this.f15593a = baseTransientBottomBar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        BaseTransientBottomBar baseTransientBottomBar = this.f15593a;
        BaseTransientBottomBar.C3061e c3061e = baseTransientBottomBar.f15553i;
        if (c3061e == null) {
            return;
        }
        ViewParent parent = c3061e.getParent();
        BaseTransientBottomBar.C3061e c3061e2 = baseTransientBottomBar.f15553i;
        if (parent != null) {
            c3061e2.setVisibility(0);
        }
        if (c3061e2.getAnimationMode() == 1) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(baseTransientBottomBar.f15548d);
            valueAnimatorOfFloat.addUpdateListener(new C3062a(baseTransientBottomBar));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
            valueAnimatorOfFloat2.setInterpolator(baseTransientBottomBar.f15550f);
            valueAnimatorOfFloat2.addUpdateListener(new C3063b(baseTransientBottomBar));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
            animatorSet.setDuration(baseTransientBottomBar.f15545a);
            animatorSet.addListener(new C6462g(baseTransientBottomBar));
            animatorSet.start();
            return;
        }
        int height = c3061e2.getHeight();
        ViewGroup.LayoutParams layoutParams = c3061e2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        c3061e2.setTranslationY(height);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(height, 0);
        valueAnimator.setInterpolator(baseTransientBottomBar.f15549e);
        valueAnimator.setDuration(baseTransientBottomBar.f15547c);
        valueAnimator.addListener(new C6457b(baseTransientBottomBar));
        valueAnimator.addUpdateListener(new C3064c(baseTransientBottomBar, height));
        valueAnimator.start();
    }
}
