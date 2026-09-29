package p513yj;

import android.animation.Animator;
import com.google.android.material.card.MaterialCardView;
import dm.C5207g;

/* JADX INFO: renamed from: yj.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C10403e implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MaterialCardView f52205a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MaterialCardView f52206b;

    public C10403e(MaterialCardView materialCardView, MaterialCardView materialCardView2) {
        this.f52205a = materialCardView;
        this.f52206b = materialCardView2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C5207g.m11111f(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C5207g.m11111f(animator, "animator");
        this.f52205a.setEnabled(false);
        this.f52206b.setEnabled(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        C5207g.m11111f(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C5207g.m11111f(animator, "animator");
    }
}
