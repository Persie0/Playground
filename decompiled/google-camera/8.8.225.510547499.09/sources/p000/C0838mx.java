package p000;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: mx */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0838mx extends C0825mk {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AbstractC0815ma f41750a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0838mx(AbstractC0815ma abstractC0815ma, Context context) {
        super(context);
        this.f41750a = abstractC0815ma;
    }

    @Override // p000.C0825mk
    /* JADX INFO: renamed from: a */
    protected final float mo11878a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // p000.C0825mk
    /* JADX INFO: renamed from: c */
    protected final void mo11885c(View view, C0823mi c0823mi) {
        AbstractC0815ma abstractC0815ma = this.f41750a;
        RecyclerView recyclerView = abstractC0815ma.f39692a;
        if (recyclerView == null) {
            return;
        }
        int[] iArrMo11872c = abstractC0815ma.mo11872c(recyclerView.f1124n, view);
        int i = iArrMo11872c[0];
        int i2 = iArrMo11872c[1];
        int iMo11886j = mo11886j(Math.max(Math.abs(i), Math.abs(i2)));
        if (iMo11886j > 0) {
            c0823mi.m16399b(i, i2, iMo11886j, this.f40804j);
        }
    }
}
