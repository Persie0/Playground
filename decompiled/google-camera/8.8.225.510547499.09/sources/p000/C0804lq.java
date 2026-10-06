package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: lq */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0804lq extends C0825mk {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0805lr f38947a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0804lq(C0805lr c0805lr, Context context) {
        super(context);
        this.f38947a = c0805lr;
    }

    @Override // p000.C0825mk
    /* JADX INFO: renamed from: a */
    protected final float mo11878a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // p000.C0825mk
    /* JADX INFO: renamed from: b */
    protected final int mo15850b(int i) {
        return Math.min(100, super.mo15850b(i));
    }

    @Override // p000.C0825mk
    /* JADX INFO: renamed from: c */
    protected final void mo11885c(View view, C0823mi c0823mi) {
        C0805lr c0805lr = this.f38947a;
        int[] iArrMo11872c = c0805lr.mo11872c(c0805lr.f39692a.f1124n, view);
        int i = iArrMo11872c[0];
        int i2 = iArrMo11872c[1];
        int iMo11886j = mo11886j(Math.max(Math.abs(i), Math.abs(i2)));
        if (iMo11886j > 0) {
            c0823mi.m16399b(i, i2, iMo11886j, this.f40804j);
        }
    }
}
