package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ez2 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38101a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f38102b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f38103c;

    public /* synthetic */ ez2(View view, float f, int i) {
        this.f38101a = i;
        this.f38102b = view;
        this.f38103c = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38101a) {
            case 0:
                this.f38102b.setAlpha(this.f38103c);
                break;
            case 1:
                this.f38102b.setAlpha(this.f38103c);
                break;
            default:
                this.f38102b.setTranslationX(this.f38103c);
                break;
        }
    }
}
