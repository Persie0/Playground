package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class da9 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f35304a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f35305b;

    public da9(View view, float f) {
        this.f35304a = view;
        this.f35305b = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f35304a.setTranslationY(this.f35305b);
    }
}
