package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: com.google.android.material.snackbar.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3062a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f15588a;

    public C3062a(BaseTransientBottomBar baseTransientBottomBar) {
        this.f15588a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f15588a.f15553i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
