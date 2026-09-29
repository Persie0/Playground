package p322pd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: pd.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8221b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f44478a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f44479b;

    public C8221b(View view, float f3) {
        this.f44478a = view;
        this.f44479b = f3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f44478a.setAlpha(this.f44479b);
    }
}
