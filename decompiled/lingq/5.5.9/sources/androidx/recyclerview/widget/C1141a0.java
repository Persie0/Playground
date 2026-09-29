package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1141a0 extends C1169t {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C1143b0 f7217q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1141a0(C1143b0 c1143b0, Context context) {
        super(context);
        this.f7217q = c1143b0;
    }

    @Override // androidx.recyclerview.widget.C1169t, androidx.recyclerview.widget.RecyclerView.AbstractC1130w
    /* JADX INFO: renamed from: c */
    public final void mo4360c(View view, RecyclerView.AbstractC1130w.a aVar) {
        C1143b0 c1143b0 = this.f7217q;
        int[] iArrMo4432b = c1143b0.mo4432b(c1143b0.f7293a.getLayoutManager(), view);
        int i10 = iArrMo4432b[0];
        int i11 = iArrMo4432b[1];
        int iCeil = (int) Math.ceil(((double) mo4425h(Math.max(Math.abs(i10), Math.abs(i11)))) / 0.3356d);
        if (iCeil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f7464j;
            aVar.f7133a = i10;
            aVar.f7134b = i11;
            aVar.f7135c = iCeil;
            aVar.f7137e = decelerateInterpolator;
            aVar.f7138f = true;
        }
    }

    @Override // androidx.recyclerview.widget.C1169t
    /* JADX INFO: renamed from: g */
    public final float mo4424g(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.C1169t
    /* JADX INFO: renamed from: h */
    public final int mo4425h(int i10) {
        return Math.min(100, super.mo4425h(i10));
    }
}
