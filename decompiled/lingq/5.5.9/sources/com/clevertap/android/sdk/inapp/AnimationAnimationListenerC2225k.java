package com.clevertap.android.sdk.inapp;

import android.view.animation.Animation;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.k */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC2225k implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractViewOnTouchListenerC2226l.a f11208a;

    public AnimationAnimationListenerC2225k(AbstractViewOnTouchListenerC2226l.a aVar) {
        this.f11208a = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractViewOnTouchListenerC2226l.this.m6513n0(null);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
