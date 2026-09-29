package p322pd;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.activity.result.C0204c;

/* JADX INFO: renamed from: pd.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8223d implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f44481a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f44482b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f44483c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f44484d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f44485e;

    public C8223d(View view, float f3, float f10, float f11, float f12) {
        this.f44481a = view;
        this.f44482b = f3;
        this.f44483c = f10;
        this.f44484d = f11;
        this.f44485e = f12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i10 = C8235p.f44502a;
        float f3 = this.f44484d;
        float fM845d = this.f44482b;
        if (fFloatValue >= f3) {
            float f10 = this.f44485e;
            float f11 = this.f44483c;
            fM845d = fFloatValue > f10 ? f11 : C0204c.m845d(f11, fM845d, (fFloatValue - f3) / (f10 - f3), fM845d);
        }
        this.f44481a.setAlpha(fM845d);
    }
}
