package bd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: bd.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1372p extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1373q f8265a;

    public C1372p(C1373q c1373q) {
        this.f8265a = c1373q;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        C1373q c1373q = this.f8265a;
        c1373q.f8270g = (c1373q.f8270g + 1) % c1373q.f8269f.f8212c.length;
        c1373q.f8271h = true;
    }
}
