package bd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p428v4.AbstractC9640c;

/* JADX INFO: renamed from: bd.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1375s extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1376t f8274a;

    public C1375s(C1376t c1376t) {
        this.f8274a = c1376t;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        C1376t c1376t = this.f8274a;
        c1376t.mo4945c();
        AbstractC9640c abstractC9640c = c1376t.f8285k;
        if (abstractC9640c != null) {
            abstractC9640c.mo4937a((C1370n) c1376t.f36836a);
        }
    }
}
