package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: com.google.android.material.appbar.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1046a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CoordinatorLayout f12607a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppBarLayout f12608b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AppBarLayout.BaseBehavior f12609c;

    public C1046a(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f12609c = baseBehavior;
        this.f12607a = coordinatorLayout;
        this.f12608b = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f12609c.m16469A(this.f12607a, this.f12608b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
