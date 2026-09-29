package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import p363rc.InterfaceC8768d;

/* JADX INFO: renamed from: com.google.android.material.transformation.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3108b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC8768d f15883a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Drawable f15884b;

    public C3108b(InterfaceC8768d interfaceC8768d, Drawable drawable) {
        this.f15883a = interfaceC8768d;
        this.f15884b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f15883a.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f15883a.setCircularRevealOverlayDrawable(this.f15884b);
    }
}
