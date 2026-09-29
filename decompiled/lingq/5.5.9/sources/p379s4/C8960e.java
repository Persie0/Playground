package p379s4;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: renamed from: s4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8960e extends Animation {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SwipeRefreshLayout f46958a;

    public C8960e(SwipeRefreshLayout swipeRefreshLayout) {
        this.f46958a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f3, Transformation transformation) {
        this.f46958a.setAnimationProgress(f3);
    }
}
