package p000;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* JADX INFO: renamed from: ma */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0815ma {

    /* JADX INFO: renamed from: a */
    public RecyclerView f39692a;

    /* JADX INFO: renamed from: b */
    private Scroller f39693b;

    /* JADX INFO: renamed from: c */
    private final C0167es f39694c = new C0837mw(this);

    /* JADX INFO: renamed from: a */
    public abstract int mo11871a(AbstractC0812ly abstractC0812ly, int i, int i2);

    /* JADX INFO: renamed from: b */
    public abstract View mo2046b(AbstractC0812ly abstractC0812ly);

    /* JADX INFO: renamed from: c */
    public abstract int[] mo11872c(AbstractC0812ly abstractC0812ly, View view);

    /* JADX INFO: renamed from: d */
    public C0825mk mo11873d(AbstractC0812ly abstractC0812ly) {
        if (abstractC0812ly instanceof InterfaceC0824mj) {
            return new C0838mx(this, this.f39692a.getContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public void mo11874e(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f39692a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.m1249ay(this.f39694c);
            this.f39692a.f1070H = null;
        }
        this.f39692a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.f1070H != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            recyclerView.m1247aw(this.f39694c);
            RecyclerView recyclerView3 = this.f39692a;
            recyclerView3.f1070H = this;
            this.f39693b = new Scroller(recyclerView3.getContext(), new DecelerateInterpolator());
            m16269f();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m16269f() {
        AbstractC0812ly abstractC0812ly;
        View viewMo2046b;
        RecyclerView recyclerView = this.f39692a;
        if (recyclerView == null || (abstractC0812ly = recyclerView.f1124n) == null || (viewMo2046b = mo2046b(abstractC0812ly)) == null) {
            return;
        }
        int[] iArrMo11872c = mo11872c(abstractC0812ly, viewMo2046b);
        int i = 0;
        int i2 = iArrMo11872c[0];
        if (i2 != 0) {
            i = i2;
        } else if (iArrMo11872c[1] == 0) {
            return;
        }
        this.f39692a.m1230ac(i, iArrMo11872c[1]);
    }

    /* JADX INFO: renamed from: g */
    public int[] mo11875g(int i, int i2) {
        this.f39693b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f39693b.getFinalX(), this.f39693b.getFinalY()};
    }
}
