package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ilg extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    private final View f31430a;

    /* JADX INFO: renamed from: b */
    private final int f31431b;

    public ilg(View view) {
        this.f31430a = view;
        this.f31431b = view.getLayerType();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f31430a.setLayerType(this.f31431b, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f31430a.setLayerType(this.f31431b, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f31430a.setLayerType(2, null);
    }
}
