package p322pd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: pd.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8224e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f44486a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f44487b;

    public C8224e(View view, float f3) {
        this.f44486a = view;
        this.f44487b = f3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f44486a.setAlpha(this.f44487b);
    }
}
