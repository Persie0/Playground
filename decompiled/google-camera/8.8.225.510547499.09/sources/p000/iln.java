package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iln extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    private final View f31452a;

    /* JADX INFO: renamed from: b */
    private final int f31453b;

    /* JADX INFO: renamed from: c */
    private int f31454c = 0;

    public iln(View view, int i) {
        this.f31452a = view;
        this.f31453b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f31452a.setVisibility(this.f31454c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f31453b;
        if (i != 0) {
            this.f31452a.setVisibility(i);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f31454c = this.f31452a.getVisibility();
        if (this.f31453b == 0) {
            this.f31452a.setVisibility(0);
        }
    }
}
