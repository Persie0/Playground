package p322pd;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: pd.f */
/* JADX INFO: loaded from: classes.dex */
public final class C8225f implements InterfaceC8236q {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static ValueAnimator m16367c(View view, float f3, float f10, float f11, float f12, float f13) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C8223d(view, f3, f10, f11, f12));
        valueAnimatorOfFloat.addListener(new C8224e(view, f13));
        return valueAnimatorOfFloat;
    }

    @Override // p322pd.InterfaceC8236q
    /* JADX INFO: renamed from: a */
    public final Animator mo16365a(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m16367c(view, 0.0f, alpha, 0.35f, 1.0f, alpha);
    }

    @Override // p322pd.InterfaceC8236q
    /* JADX INFO: renamed from: b */
    public final Animator mo16366b(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m16367c(view, alpha, 0.0f, 0.0f, 0.35f, alpha);
    }
}
