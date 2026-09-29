package p321pc;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.C1169t;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.C2980b;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: pc.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8218b extends C1169t {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ CarouselLayoutManager f44472q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8218b(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.f44472q = carouselLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1130w
    /* JADX INFO: renamed from: a */
    public final PointF mo4358a(int i10) {
        CarouselLayoutManager carouselLayoutManager = this.f44472q;
        C2980b c2980b = carouselLayoutManager.f14952u;
        if (c2980b == null) {
            return null;
        }
        return new PointF(carouselLayoutManager.m8651P0(c2980b.f14977a, i10) - carouselLayoutManager.f14947p, 0.0f);
    }

    @Override // androidx.recyclerview.widget.C1169t
    /* JADX INFO: renamed from: f */
    public final int mo4527f(View view, int i10) {
        CarouselLayoutManager carouselLayoutManager = this.f44472q;
        return (int) (carouselLayoutManager.f14947p - carouselLayoutManager.m8651P0(carouselLayoutManager.f14952u.f14977a, RecyclerView.AbstractC1120m.m4286J(view)));
    }
}
