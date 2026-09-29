package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class k21 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46576a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l21 f46577b;

    public /* synthetic */ k21(l21 l21Var, int i) {
        this.f46576a = i;
        this.f46577b = l21Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f46576a) {
            case 1:
                super.onAnimationEnd(animator);
                l21 l21Var = this.f46577b;
                l21Var.mo278a();
                AbstractC3689vl abstractC3689vl = l21Var.f48931j;
                if (abstractC3689vl != null) {
                    abstractC3689vl.mo23406a((o34) l21Var.f67808a);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f46576a) {
            case 0:
                super.onAnimationRepeat(animator);
                l21 l21Var = this.f46577b;
                l21Var.f48928g = (l21Var.f48928g + l21.f48920l.length) % l21Var.f48927f.f67948e.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
