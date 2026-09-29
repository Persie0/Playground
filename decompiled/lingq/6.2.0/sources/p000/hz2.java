package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class hz2 implements iwa {
    @Override // p000.iwa
    /* JADX INFO: renamed from: a */
    public final Animator mo11002a(View view, ViewGroup viewGroup) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new gz2(view, alpha, 0.0f, 0.0f, 0.35f));
        valueAnimatorOfFloat.addListener(new ez2(view, alpha, 1));
        return valueAnimatorOfFloat;
    }

    @Override // p000.iwa
    /* JADX INFO: renamed from: b */
    public final Animator mo11003b(View view, ViewGroup viewGroup) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new gz2(view, 0.0f, alpha, 0.35f, 1.0f));
        valueAnimatorOfFloat.addListener(new ez2(view, alpha, 1));
        return valueAnimatorOfFloat;
    }
}
