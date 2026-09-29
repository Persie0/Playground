package p000;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class ro9 extends Animation {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59654a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SwipeRefreshLayout f59655b;

    public /* synthetic */ ro9(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.f59654a = i;
        this.f59655b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.f59654a;
        SwipeRefreshLayout swipeRefreshLayout = this.f59655b;
        switch (i) {
            case 0:
                swipeRefreshLayout.setAnimationProgress(f);
                break;
            case 1:
                swipeRefreshLayout.setAnimationProgress(1.0f - f);
                break;
            case 2:
                int iAbs = swipeRefreshLayout.f7084R - Math.abs(swipeRefreshLayout.f7083Q);
                int i2 = swipeRefreshLayout.f7082P;
                swipeRefreshLayout.setTargetOffsetTopAndBottom((i2 + ((int) ((iAbs - i2) * f))) - swipeRefreshLayout.f7080N.getTop());
                p21 p21Var = swipeRefreshLayout.f7086T;
                float f2 = 1.0f - f;
                o21 o21Var = p21Var.f55474a;
                if (f2 != o21Var.f53642p) {
                    o21Var.f53642p = f2;
                }
                p21Var.invalidateSelf();
                break;
            default:
                swipeRefreshLayout.m2885k(f);
                break;
        }
    }
}
