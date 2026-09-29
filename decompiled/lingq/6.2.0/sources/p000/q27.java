package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class q27 extends fd5 {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ r27 f57166q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q27(r27 r27Var, Context context) {
        super(context);
        this.f57166q = r27Var;
    }

    @Override // p000.fd5
    /* JADX INFO: renamed from: d */
    public final float mo11776d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // p000.fd5
    /* JADX INFO: renamed from: e */
    public final int mo11777e(int i) {
        return Math.min(100, super.mo11777e(i));
    }

    @Override // p000.fd5
    /* JADX INFO: renamed from: l */
    public final void mo11784l(View view, i38 i38Var) {
        r27 r27Var = this.f57166q;
        int[] iArrM20256c = r27Var.m20256c(r27Var.f58533a.getLayoutManager(), view);
        int i = iArrM20256c[0];
        int i2 = iArrM20256c[1];
        int iCeil = (int) Math.ceil(((double) mo11777e(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (iCeil > 0) {
            i38Var.f43444a = i;
            i38Var.f43445b = i2;
            i38Var.f43446c = iCeil;
            i38Var.f43448e = this.f38898j;
            i38Var.f43449f = true;
        }
    }
}
