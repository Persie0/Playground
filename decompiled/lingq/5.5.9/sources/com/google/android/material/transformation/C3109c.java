package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p363rc.InterfaceC8768d;

/* JADX INFO: renamed from: com.google.android.material.transformation.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3109c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC8768d f15885a;

    public C3109c(InterfaceC8768d interfaceC8768d) {
        this.f15885a = interfaceC8768d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        InterfaceC8768d interfaceC8768d = this.f15885a;
        InterfaceC8768d.d revealInfo = interfaceC8768d.getRevealInfo();
        revealInfo.f46487c = Float.MAX_VALUE;
        interfaceC8768d.setRevealInfo(revealInfo);
    }
}
