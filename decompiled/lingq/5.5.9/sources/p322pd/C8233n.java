package p322pd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: pd.n */
/* JADX INFO: loaded from: classes.dex */
public final class C8233n extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f44499a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f44500b;

    public C8233n(View view, float f3) {
        this.f44499a = view;
        this.f44500b = f3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f44499a.setTranslationY(this.f44500b);
    }
}
