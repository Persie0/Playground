package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: com.google.android.material.appbar.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2943a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CoordinatorLayout f14710a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppBarLayout f14711b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AppBarLayout.BaseBehavior f14712c;

    public C2943a(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f14712c = baseBehavior;
        this.f14710a = coordinatorLayout;
        this.f14711b = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f14712c.m13069A(this.f14710a, this.f14711b, iIntValue);
    }
}
