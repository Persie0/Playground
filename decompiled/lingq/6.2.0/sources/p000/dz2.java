package p000;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class dz2 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f36444a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f36445b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f36446c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f36447d;

    public dz2(View view, float f, float f2, float f3) {
        this.f36444a = view;
        this.f36445b = f;
        this.f36446c = f2;
        this.f36447d = f3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = vaa.f65153a;
        float fM17726a = this.f36445b;
        if (fFloatValue >= 0.0f) {
            float f = this.f36447d;
            float f2 = this.f36446c;
            fM17726a = fFloatValue > f ? f2 : AbstractC3393o1.m17726a(f2, fM17726a, (fFloatValue - 0.0f) / (f - 0.0f), fM17726a);
        }
        this.f36444a.setAlpha(fM17726a);
    }
}
