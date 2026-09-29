package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class k31 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46614a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l31 f46615b;

    public /* synthetic */ k31(l31 l31Var, int i) {
        this.f46614a = i;
        this.f46615b = l31Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f46614a) {
            case 1:
                this.f46615b.f46062b.m14121i(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f46614a) {
            case 0:
                this.f46615b.f46062b.m14121i(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
