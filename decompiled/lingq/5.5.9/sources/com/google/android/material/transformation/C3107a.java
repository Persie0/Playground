package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.transformation.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3107a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f15882a;

    public C3107a(View view) {
        this.f15882a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f15882a.invalidate();
    }
}
