package p000;

import android.animation.Animator;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes2.dex */
public final class n21 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52212a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f52213b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f52214c;

    public n21(MaterialCardView materialCardView, MaterialCardView materialCardView2) {
        this.f52213b = materialCardView;
        this.f52214c = materialCardView2;
    }

    /* JADX INFO: renamed from: a */
    private final void m17179a(Animator animator) {
    }

    /* JADX INFO: renamed from: b */
    private final void m17180b(Animator animator) {
    }

    /* JADX INFO: renamed from: c */
    private final void m17181c(Animator animator) {
    }

    /* JADX INFO: renamed from: d */
    private final void m17182d(Animator animator) {
    }

    /* JADX INFO: renamed from: e */
    private final void m17183e(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f52212a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52212a) {
            case 0:
                break;
            default:
                ((MaterialCardView) this.f52213b).setEnabled(false);
                ((MaterialCardView) this.f52214c).setEnabled(false);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f52212a) {
            case 0:
                p21 p21Var = (p21) this.f52214c;
                o21 o21Var = (o21) this.f52213b;
                p21Var.m18859a(1.0f, o21Var, true);
                o21Var.f53637k = o21Var.f53631e;
                o21Var.f53638l = o21Var.f53632f;
                o21Var.f53639m = o21Var.f53633g;
                o21Var.m17769a((o21Var.f53636j + 1) % o21Var.f53635i.length);
                if (!p21Var.f55479f) {
                    p21Var.f55478e += 1.0f;
                } else {
                    p21Var.f55479f = false;
                    animator.cancel();
                    animator.setDuration(1332L);
                    animator.start();
                    if (o21Var.f53640n) {
                        o21Var.f53640n = false;
                    }
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f52212a) {
            case 0:
                ((p21) this.f52214c).f55478e = 0.0f;
                break;
        }
    }

    public n21(p21 p21Var, o21 o21Var) {
        this.f52214c = p21Var;
        this.f52213b = o21Var;
    }
}
