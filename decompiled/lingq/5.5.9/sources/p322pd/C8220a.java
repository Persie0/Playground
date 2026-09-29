package p322pd;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.activity.result.C0204c;

/* JADX INFO: renamed from: pd.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8220a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f44473a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f44474b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f44475c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f44476d = 0.0f;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f44477e;

    public C8220a(View view, float f3, float f10, float f11) {
        this.f44473a = view;
        this.f44474b = f3;
        this.f44475c = f10;
        this.f44477e = f11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i10 = C8235p.f44502a;
        float f3 = this.f44476d;
        float fM845d = this.f44474b;
        if (fFloatValue >= f3) {
            float f10 = this.f44477e;
            float f11 = this.f44475c;
            fM845d = fFloatValue > f10 ? f11 : C0204c.m845d(f11, fM845d, (fFloatValue - f3) / (f10 - f3), fM845d);
        }
        this.f44473a.setAlpha(fM845d);
    }
}
