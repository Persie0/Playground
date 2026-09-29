package p000;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public final class fo0 extends fd5 {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int f39357q = 1;

    public /* synthetic */ fo0(Context context) {
        super(context);
    }

    @Override // p000.fd5
    /* JADX INFO: renamed from: b */
    public int mo11774b(View view, int i) {
        switch (this.f39357q) {
            case 0:
                return 0;
            default:
                return super.mo11774b(view, i);
        }
    }

    @Override // p000.fd5
    /* JADX INFO: renamed from: c */
    public int mo11775c(View view, int i) {
        switch (this.f39357q) {
            case 0:
                return 0;
            default:
                return super.mo11775c(view, i);
        }
    }

    @Override // p000.fd5
    /* JADX INFO: renamed from: d */
    public float mo11776d(DisplayMetrics displayMetrics) {
        switch (this.f39357q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.mo11776d(displayMetrics);
        }
    }

    @Override // p000.fd5
    /* JADX INFO: renamed from: f */
    public PointF mo11778f(int i) {
        switch (this.f39357q) {
            case 0:
                return null;
            default:
                return super.mo11778f(i);
        }
    }

    public fo0(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
