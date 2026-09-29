package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$dimen;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class go0 extends w28 {

    /* JADX INFO: renamed from: a */
    public final Paint f41061a;

    /* JADX INFO: renamed from: b */
    public final List f41062b;

    public go0() {
        Paint paint = new Paint();
        this.f41061a = paint;
        this.f41062b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // p000.w28
    /* JADX INFO: renamed from: h */
    public final void mo12779h(Canvas canvas, RecyclerView recyclerView, k38 k38Var) {
        Canvas canvas2;
        float dimension = recyclerView.getResources().getDimension(R$dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f41061a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f41062b.iterator();
        while (it.hasNext()) {
            ((rj4) it.next()).getClass();
            paint.setColor(ya1.m25010c(-65281, 0.0f, -16776961));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m6092K0()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f12824q.mo3756j(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f12824q.mo3752e(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f12824q.mo3753f(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f12824q.mo3754g(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
