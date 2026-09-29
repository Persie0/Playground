package p322pd;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: pd.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8222c implements InterfaceC8236q {

    /* JADX INFO: renamed from: a */
    public float f44480a = 1.0f;

    /* JADX INFO: renamed from: c */
    public static ValueAnimator m16364c(View view, float f3, float f10, float f11, float f12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C8220a(view, f3, f10, f11));
        valueAnimatorOfFloat.addListener(new C8221b(view, f12));
        return valueAnimatorOfFloat;
    }

    @Override // p322pd.InterfaceC8236q
    /* JADX INFO: renamed from: a */
    public final Animator mo16365a(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m16364c(view, 0.0f, alpha, this.f44480a, alpha);
    }

    @Override // p322pd.InterfaceC8236q
    /* JADX INFO: renamed from: b */
    public final Animator mo16366b(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m16364c(view, alpha, 0.0f, 1.0f, alpha);
    }
}
