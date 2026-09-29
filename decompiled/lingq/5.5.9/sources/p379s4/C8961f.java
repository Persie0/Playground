package p379s4;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: renamed from: s4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C8961f extends Animation {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SwipeRefreshLayout f46959a;

    public C8961f(SwipeRefreshLayout swipeRefreshLayout) {
        this.f46959a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f3, Transformation transformation) {
        this.f46959a.setAnimationProgress(1.0f - f3);
    }
}
