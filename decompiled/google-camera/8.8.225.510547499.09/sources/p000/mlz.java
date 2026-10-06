package p000;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mlz implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ View f41004a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f41005b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ LinearLayout f41006c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f41007d;

    public mlz(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
        this.f41007d = i;
        this.f41005b = baseBehavior;
        this.f41004a = coordinatorLayout;
        this.f41006c = appBarLayout;
    }

    public mlz(mma mmaVar, View view, View view2, int i) {
        this.f41007d = i;
        this.f41006c = mmaVar;
        this.f41004a = view;
        this.f41005b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41007d) {
            case 0:
                LinearLayout linearLayout = this.f41006c;
                mma mmaVar = (mma) linearLayout;
                mmaVar.m16614c(this.f41004a, (View) this.f41005b, valueAnimator.getAnimatedFraction());
                break;
            default:
                Object obj = this.f41005b;
                mgi mgiVar = (mgi) obj;
                mgiVar.m16352E((CoordinatorLayout) this.f41004a, this.f41006c, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
