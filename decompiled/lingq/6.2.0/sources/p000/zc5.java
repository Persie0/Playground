package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class zc5 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71362a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ad5 f71363b;

    public /* synthetic */ zc5(ad5 ad5Var, int i) {
        this.f71362a = i;
        this.f71363b = ad5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f71362a) {
            case 1:
                super.onAnimationEnd(animator);
                ad5 ad5Var = this.f71363b;
                ad5Var.mo278a();
                AbstractC3689vl abstractC3689vl = ad5Var.f521j;
                if (abstractC3689vl != null) {
                    abstractC3689vl.mo23406a((o34) ad5Var.f67808a);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f71362a) {
            case 0:
                super.onAnimationRepeat(animator);
                ad5 ad5Var = this.f71363b;
                ad5Var.f518g = (ad5Var.f518g + 1) % ad5Var.f517f.f67948e.length;
                ad5Var.f519h = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
