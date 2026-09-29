package com.clevertap.android.sdk.inapp;

import android.view.animation.Animation;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.i */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC2223i implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractViewOnTouchListenerC2224j.a f11203a;

    public AnimationAnimationListenerC2223i(AbstractViewOnTouchListenerC2224j.a aVar) {
        this.f11203a = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractViewOnTouchListenerC2224j.this.m6513n0(null);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
