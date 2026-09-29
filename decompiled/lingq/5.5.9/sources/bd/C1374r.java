package bd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: bd.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1374r extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1376t f8273a;

    public C1374r(C1376t c1376t) {
        this.f8273a = c1376t;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        C1376t c1376t = this.f8273a;
        c1376t.f8282h = (c1376t.f8282h + 1) % c1376t.f8281g.f8212c.length;
        c1376t.f8283i = true;
    }
}
