package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.h0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1155h0 extends RecyclerView.AbstractC1123p {

    /* JADX INFO: renamed from: a */
    public RecyclerView f7293a;

    /* JADX INFO: renamed from: b */
    public final a f7294b = new a();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.h0$a */
    public class a extends RecyclerView.AbstractC1125r {

        /* JADX INFO: renamed from: a */
        public boolean f7295a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1125r
        /* JADX INFO: renamed from: a */
        public final void mo4339a(int i10, RecyclerView recyclerView) {
            if (i10 == 0 && this.f7295a) {
                this.f7295a = false;
                AbstractC1155h0.this.m4487d();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1125r
        /* JADX INFO: renamed from: b */
        public final void mo4340b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f7295a = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4486a(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f7293a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        a aVar = this.f7294b;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f6969F0;
            if (arrayList != null) {
                arrayList.remove(aVar);
            }
            this.f7293a.setOnFlingListener(null);
        }
        this.f7293a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f7293a.m4203i(aVar);
            this.f7293a.setOnFlingListener(this);
            new Scroller(this.f7293a.getContext(), new DecelerateInterpolator());
            m4487d();
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract int[] mo4432b(RecyclerView.AbstractC1120m abstractC1120m, View view);

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: c */
    public abstract View mo4433c(RecyclerView.AbstractC1120m abstractC1120m);

    /* JADX INFO: renamed from: d */
    public final void m4487d() {
        RecyclerView.AbstractC1120m layoutManager;
        View viewMo4433c;
        RecyclerView recyclerView = this.f7293a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewMo4433c = mo4433c(layoutManager)) == null) {
            return;
        }
        int[] iArrMo4432b = mo4432b(layoutManager, viewMo4433c);
        int i10 = iArrMo4432b[0];
        if (i10 == 0 && iArrMo4432b[1] == 0) {
            return;
        }
        this.f7293a.m4206j0(i10, iArrMo4432b[1], false);
    }
}
