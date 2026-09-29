package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3033b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public boolean f15251a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f15252b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3035d.g f15253c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C3035d f15254d;

    public C3033b(C3035d c3035d, boolean z10, C3032a c3032a) {
        this.f15254d = c3035d;
        this.f15252b = z10;
        this.f15253c = c3032a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f15251a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C3035d c3035d = this.f15254d;
        c3035d.f15281m = 0;
        c3035d.f15275g = null;
        if (!this.f15251a) {
            boolean z10 = this.f15252b;
            c3035d.f15285q.m19367b(z10 ? 8 : 4, z10);
            C3035d.g gVar = this.f15253c;
            if (gVar != null) {
                C3032a c3032a = (C3032a) gVar;
                c3032a.f15249a.mo8773a(c3032a.f15250b);
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C3035d c3035d = this.f15254d;
        c3035d.f15285q.m19367b(0, this.f15252b);
        c3035d.f15281m = 1;
        c3035d.f15275g = animator;
        this.f15251a = false;
    }
}
