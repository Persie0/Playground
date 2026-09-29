package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class tz2 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public boolean f63128a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uz2 f63129b;

    public tz2(uz2 uz2Var) {
        this.f63129b = uz2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f63128a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f63128a) {
            this.f63128a = false;
            return;
        }
        uz2 uz2Var = this.f63129b;
        if (((Float) uz2Var.f64589z.getAnimatedValue()).floatValue() == 0.0f) {
            uz2Var.f64562A = 0;
            uz2Var.m23019l(0);
        } else {
            uz2Var.f64562A = 2;
            uz2Var.f64582s.invalidate();
        }
    }
}
