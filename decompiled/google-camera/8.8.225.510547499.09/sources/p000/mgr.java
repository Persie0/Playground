package p000;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mgr implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f40453a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f40454b;

    public mgr(CollapsingToolbarLayout collapsingToolbarLayout, int i) {
        this.f40454b = i;
        this.f40453a = collapsingToolbarLayout;
    }

    public mgr(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f40454b = i;
        this.f40453a = bottomSheetBehavior;
    }

    public mgr(TabLayout tabLayout, int i) {
        this.f40454b = i;
        this.f40453a = tabLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40454b) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mkx mkxVar = ((BottomSheetBehavior) this.f40453a).f8108d;
                if (mkxVar != null) {
                    mkxVar.m16580j(fFloatValue);
                }
                break;
            case 1:
                ((CollapsingToolbarLayout) this.f40453a).m4786e(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                ((TabLayout) this.f40453a).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
        }
    }
}
