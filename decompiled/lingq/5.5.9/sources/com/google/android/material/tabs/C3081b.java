package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.tabs.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3081b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f15690a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f15691b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TabLayout.C3075f f15692c;

    public C3081b(TabLayout.C3075f c3075f, View view, View view2) {
        this.f15692c = c3075f;
        this.f15690a = view;
        this.f15691b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f15692c.m8870c(this.f15690a, this.f15691b, valueAnimator.getAnimatedFraction());
    }
}
