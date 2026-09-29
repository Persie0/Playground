package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import p378s3.C8953b;

/* JADX INFO: renamed from: com.google.android.material.snackbar.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3064c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f15590a;

    public C3064c(BaseTransientBottomBar baseTransientBottomBar, int i10) {
        this.f15590a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C8953b c8953b = BaseTransientBottomBar.f15539u;
        this.f15590a.f15553i.setTranslationY(iIntValue);
    }
}
