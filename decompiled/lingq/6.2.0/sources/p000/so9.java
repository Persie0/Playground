package p000;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class so9 extends Animation {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61113a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f61114b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SwipeRefreshLayout f61115c;

    public so9(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.f61115c = swipeRefreshLayout;
        this.f61113a = i;
        this.f61114b = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        p21 p21Var = this.f61115c.f7086T;
        int i = this.f61113a;
        p21Var.setAlpha((int) (((this.f61114b - i) * f) + i));
    }
}
