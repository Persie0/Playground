package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3034c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f15255a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3035d.g f15256b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3035d f15257c;

    public C3034c(C3035d c3035d, boolean z10, C3032a c3032a) {
        this.f15257c = c3035d;
        this.f15255a = z10;
        this.f15256b = c3032a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C3035d c3035d = this.f15257c;
        c3035d.f15281m = 0;
        c3035d.f15275g = null;
        C3035d.g gVar = this.f15256b;
        if (gVar != null) {
            ((C3032a) gVar).f15249a.mo8774b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C3035d c3035d = this.f15257c;
        c3035d.f15285q.m19367b(0, this.f15255a);
        c3035d.f15281m = 2;
        c3035d.f15275g = animator;
    }
}
