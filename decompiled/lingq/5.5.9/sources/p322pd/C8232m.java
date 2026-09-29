package p322pd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: pd.m */
/* JADX INFO: loaded from: classes.dex */
public final class C8232m extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f44497a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f44498b;

    public C8232m(View view, float f3) {
        this.f44497a = view;
        this.f44498b = f3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f44497a.setTranslationX(this.f44498b);
    }
}
