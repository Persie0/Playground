package bd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: bd.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1361e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1363g f8220a;

    public C1361e(C1363g c1363g) {
        this.f8220a = c1363g;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        C1363g c1363g = this.f8220a;
        c1363g.f8231h = (c1363g.f8231h + 4) % c1363g.f8230g.f8212c.length;
    }
}
