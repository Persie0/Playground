package p379s4;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: renamed from: s4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C8962g extends Animation {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46960a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f46961b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SwipeRefreshLayout f46962c;

    public C8962g(SwipeRefreshLayout swipeRefreshLayout, int i10, int i11) {
        this.f46962c = swipeRefreshLayout;
        this.f46960a = i10;
        this.f46961b = i11;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f3, Transformation transformation) {
        C8959d c8959d = this.f46962c.f7604T;
        int i10 = this.f46960a;
        c8959d.setAlpha((int) (((this.f46961b - i10) * f3) + i10));
    }
}
