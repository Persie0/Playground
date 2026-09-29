package mc;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import gd.C5768g;

/* JADX INFO: renamed from: mc.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7535a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BottomSheetBehavior f41608a;

    public C7535a(BottomSheetBehavior bottomSheetBehavior) {
        this.f41608a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C5768g c5768g = this.f41608a.f14856i;
        if (c5768g != null) {
            c5768g.m12142n(fFloatValue);
        }
    }
}
