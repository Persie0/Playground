package bd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p428v4.AbstractC9640c;

/* JADX INFO: renamed from: bd.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1362f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1363g f8221a;

    public C1362f(C1363g c1363g) {
        this.f8221a = c1363g;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        C1363g c1363g = this.f8221a;
        c1363g.mo4945c();
        AbstractC9640c abstractC9640c = c1363g.f8234k;
        if (abstractC9640c != null) {
            abstractC9640c.mo4937a((C1370n) c1363g.f36836a);
        }
    }
}
