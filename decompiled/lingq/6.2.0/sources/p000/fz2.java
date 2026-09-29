package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class fz2 implements iwa {

    /* JADX INFO: renamed from: a */
    public float f39951a;

    @Override // p000.iwa
    /* JADX INFO: renamed from: a */
    public final Animator mo11002a(View view, ViewGroup viewGroup) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new dz2(view, alpha, 0.0f, 1.0f));
        valueAnimatorOfFloat.addListener(new ez2(view, alpha, 0));
        return valueAnimatorOfFloat;
    }

    @Override // p000.iwa
    /* JADX INFO: renamed from: b */
    public final Animator mo11003b(View view, ViewGroup viewGroup) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        float f = this.f39951a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new dz2(view, 0.0f, alpha, f));
        valueAnimatorOfFloat.addListener(new ez2(view, alpha, 0));
        return valueAnimatorOfFloat;
    }
}
