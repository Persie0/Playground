package androidx.compose.p002ui.layout;

import p000.bk1;
import p000.ct5;
import p000.i63;
import p000.l87;

/* JADX INFO: renamed from: androidx.compose.ui.layout.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0340g implements ct5 {

    /* JADX INFO: renamed from: a */
    public final ct5 f4205a;

    /* JADX INFO: renamed from: b */
    public final MeasuringIntrinsics$IntrinsicMinMax f4206b;

    /* JADX INFO: renamed from: c */
    public final MeasuringIntrinsics$IntrinsicWidthHeight f4207c;

    public C0340g(ct5 ct5Var, MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax, MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight) {
        this.f4205a = ct5Var;
        this.f4206b = measuringIntrinsics$IntrinsicMinMax;
        this.f4207c = measuringIntrinsics$IntrinsicWidthHeight;
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: A */
    public final Object mo1509A() {
        return this.f4205a.mo1509A();
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: U */
    public final int mo1510U(int i) {
        return this.f4205a.mo1510U(i);
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: c */
    public final int mo1511c(int i) {
        return this.f4205a.mo1511c(i);
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: l */
    public final int mo1512l(int i) {
        return this.f4205a.mo1512l(i);
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: p */
    public final int mo1513p(int i) {
        return this.f4205a.mo1513p(i);
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: r */
    public final l87 mo1514r(long j) {
        MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight = MeasuringIntrinsics$IntrinsicWidthHeight.Width;
        ct5 ct5Var = this.f4205a;
        MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight2 = this.f4207c;
        MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax = this.f4206b;
        if (measuringIntrinsics$IntrinsicWidthHeight2 == measuringIntrinsics$IntrinsicWidthHeight) {
            return new i63(measuringIntrinsics$IntrinsicMinMax == MeasuringIntrinsics$IntrinsicMinMax.Max ? ct5Var.mo1513p(bk1.m3800h(j)) : ct5Var.mo1512l(bk1.m3800h(j)), bk1.m3796d(j) ? bk1.m3800h(j) : 32767, 1);
        }
        return new i63(bk1.m3797e(j) ? bk1.m3801i(j) : 32767, measuringIntrinsics$IntrinsicMinMax == MeasuringIntrinsics$IntrinsicMinMax.Max ? ct5Var.mo1511c(bk1.m3801i(j)) : ct5Var.mo1510U(bk1.m3801i(j)), 1);
    }
}
