package p000;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class gz2 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f41542a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f41543b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f41544c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f41545d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f41546e;

    public gz2(View view, float f, float f2, float f3, float f4) {
        this.f41542a = view;
        this.f41543b = f;
        this.f41544c = f2;
        this.f41545d = f3;
        this.f41546e = f4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = vaa.f65153a;
        float f = this.f41545d;
        float fM17726a = this.f41543b;
        if (fFloatValue >= f) {
            float f2 = this.f41546e;
            float f3 = this.f41544c;
            fM17726a = fFloatValue > f2 ? f3 : AbstractC3393o1.m17726a(f3, fM17726a, (fFloatValue - f) / (f2 - f), fM17726a);
        }
        this.f41542a.setAlpha(fM17726a);
    }
}
