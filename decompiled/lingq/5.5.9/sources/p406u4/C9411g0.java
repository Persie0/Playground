package p406u4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p326q.C8446b;

/* JADX INFO: renamed from: u4.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9411g0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8446b f48309a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC9409f0 f48310b;

    public C9411g0(AbstractC9409f0 abstractC9409f0, C8446b c8446b) {
        this.f48310b = abstractC9409f0;
        this.f48309a = c8446b;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f48309a.remove(animator);
        this.f48310b.f48282M.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f48310b.f48282M.add(animator);
    }
}
