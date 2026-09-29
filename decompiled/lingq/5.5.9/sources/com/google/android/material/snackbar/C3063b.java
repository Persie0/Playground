package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: com.google.android.material.snackbar.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3063b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f15589a;

    public C3063b(BaseTransientBottomBar baseTransientBottomBar) {
        this.f15589a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BaseTransientBottomBar baseTransientBottomBar = this.f15589a;
        baseTransientBottomBar.f15553i.setScaleX(fFloatValue);
        baseTransientBottomBar.f15553i.setScaleY(fFloatValue);
    }
}
