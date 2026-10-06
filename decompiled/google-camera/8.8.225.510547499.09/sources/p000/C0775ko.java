package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: ko */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0775ko extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0776kp f36670a;

    /* JADX INFO: renamed from: b */
    private boolean f36671b = false;

    public C0775ko(C0776kp c0776kp) {
        this.f36670a = c0776kp;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f36671b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f36671b) {
            this.f36671b = false;
            return;
        }
        if (((Float) this.f36670a.f36748p.getAnimatedValue()).floatValue() == 0.0f) {
            C0776kp c0776kp = this.f36670a;
            c0776kp.f36749q = 0;
            c0776kp.m14655u(0);
        } else {
            C0776kp c0776kp2 = this.f36670a;
            c0776kp2.f36749q = 2;
            c0776kp2.m14654t();
        }
    }
}
