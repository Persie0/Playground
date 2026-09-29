package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class i21 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43378a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j21 f43379b;

    public /* synthetic */ i21(j21 j21Var, int i) {
        this.f43378a = i;
        this.f43379b = j21Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f43378a) {
            case 1:
                super.onAnimationEnd(animator);
                j21 j21Var = this.f43379b;
                j21Var.mo278a();
                AbstractC3689vl abstractC3689vl = j21Var.f44937j;
                if (abstractC3689vl != null) {
                    abstractC3689vl.mo23406a((o34) j21Var.f67808a);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f43378a) {
            case 0:
                super.onAnimationRepeat(animator);
                j21 j21Var = this.f43379b;
                j21Var.f44934g = (j21Var.f44934g + 4) % j21Var.f44933f.f67948e.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
