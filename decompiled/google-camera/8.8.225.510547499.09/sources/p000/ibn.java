package p000;

import android.animation.ValueAnimator;
import com.google.android.apps.camera.p014ui.views.CountdownSnapSlider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ibn implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30209a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f30210b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f30211c;

    public /* synthetic */ ibn(hxk hxkVar, int i, int i2) {
        this.f30211c = i2;
        this.f30210b = hxkVar;
        this.f30209a = i;
    }

    public /* synthetic */ ibn(ibq ibqVar, int i, int i2) {
        this.f30211c = i2;
        this.f30210b = ibqVar;
        this.f30209a = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30211c) {
            case 0:
                ((ibq) this.f30210b).f30223h.mo11100z(valueAnimator.getAnimatedFraction(), this.f30209a);
                break;
            default:
                Object obj = this.f30210b;
                int i = this.f30209a;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (i == 1) {
                    double currentPlayTime = valueAnimator.getCurrentPlayTime();
                    Double.isNaN(currentPlayTime);
                    double dMin = 1.0d - Math.min(currentPlayTime / 200.0d, 1.0d);
                    hxk hxkVar = (hxk) obj;
                    CountdownSnapSlider countdownSnapSlider = hxkVar.f29806d;
                    countdownSnapSlider.f7204e = dMin;
                    hxkVar.f29805c.m4355o(countdownSnapSlider.m4440a(fFloatValue), valueAnimator.getAnimatedFraction());
                } else {
                    hxk hxkVar2 = (hxk) obj;
                    hxkVar2.f29805c.m4354n(hxkVar2.f29806d.m4440a(fFloatValue));
                }
                ((hxk) obj).f29806d.m4444e(fFloatValue);
                break;
        }
    }
}
