package p225kk;

import android.animation.Animator;
import cm.InterfaceC2041a;
import dm.C5207g;
import sl.C9072e;

/* JADX INFO: renamed from: kk.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C6712i implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2041a<C9072e> f37933a;

    public C6712i(InterfaceC2041a<C9072e> interfaceC2041a) {
        this.f37933a = interfaceC2041a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C5207g.m11111f(animator, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C5207g.m11111f(animator, "animation");
        this.f37933a.mo807E();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        C5207g.m11111f(animator, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C5207g.m11111f(animator, "animation");
    }
}
