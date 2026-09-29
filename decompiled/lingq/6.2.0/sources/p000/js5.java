package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class js5 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f46074a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f46075b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ks5 f46076c;

    public js5(ks5 ks5Var, boolean z, int i) {
        this.f46076c = ks5Var;
        this.f46074a = z;
        this.f46075b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ks5 ks5Var = this.f46076c;
        ks5Var.f44455b.setTranslationX(0.0f);
        ks5Var.m15661a(0.0f, this.f46075b, this.f46074a);
    }
}
