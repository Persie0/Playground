package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class lm8 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f49836a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f49837b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f49838c;

    public lm8(View view, float f, float f2) {
        this.f49836a = view;
        this.f49837b = f;
        this.f49838c = f2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f = this.f49837b;
        View view = this.f49836a;
        view.setScaleX(f);
        view.setScaleY(this.f49838c);
    }
}
