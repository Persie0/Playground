package p322pd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: pd.k */
/* JADX INFO: loaded from: classes.dex */
public final class C8230k extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f44491a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f44492b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f44493c;

    public C8230k(View view, float f3, float f10) {
        this.f44491a = view;
        this.f44492b = f3;
        this.f44493c = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f3 = this.f44492b;
        View view = this.f44491a;
        view.setScaleX(f3);
        view.setScaleY(this.f44493c);
    }
}
