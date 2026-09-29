package va;

import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.card.MaterialCardView;
import com.lingq.commons.p053ui.views.StreakCircularProgressIndicator;
import dm.C5207g;
import p296oc.C8034b;

/* JADX INFO: renamed from: va.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9700n implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49635a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f49636b;

    public /* synthetic */ C9700n(int i10, Object obj) {
        this.f49635a = i10;
        this.f49636b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f49635a;
        Object obj = this.f49636b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C9701o c9701o = (C9701o) obj;
                c9701o.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = c9701o.f49641b;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup = c9701o.f49642c;
                if (viewGroup != null) {
                    viewGroup.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup2 = c9701o.f49644e;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(fFloatValue);
                }
                break;
            case 1:
                C8034b c8034b = (C8034b) obj;
                ColorDrawable colorDrawable = C8034b.f43664z;
                c8034b.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c8034b.f43674j.setAlpha((int) (255.0f * fFloatValue2));
                c8034b.f43688x = fFloatValue2;
                break;
            case 2:
                StreakCircularProgressIndicator streakCircularProgressIndicator = (StreakCircularProgressIndicator) obj;
                int i11 = StreakCircularProgressIndicator.f16817l;
                C5207g.m11111f(streakCircularProgressIndicator, "this$0");
                C5207g.m11111f(valueAnimator, "value");
                Object animatedValue = valueAnimator.getAnimatedValue();
                C5207g.m11109d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue3 = ((Float) animatedValue).floatValue();
                streakCircularProgressIndicator.f16827j = (int) fFloatValue3;
                streakCircularProgressIndicator.f16822e = (fFloatValue3 / streakCircularProgressIndicator.f16826i) * 360;
                streakCircularProgressIndicator.invalidate();
                break;
            default:
                MaterialCardView materialCardView = (MaterialCardView) obj;
                C5207g.m11111f(materialCardView, "$this_strokeAnimation");
                C5207g.m11111f(valueAnimator, "it");
                materialCardView.invalidate();
                break;
        }
    }
}
