package androidx.compose.p017ui.layout;

import dm.C5207g;
import p127g1.C5654r;
import p127g1.InterfaceC5644h;
import p127g1.InterfaceC5651o;
import p470x1.C10013a;

/* JADX INFO: renamed from: androidx.compose.ui.layout.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0525f implements InterfaceC5651o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5644h f3683a;

    /* JADX INFO: renamed from: b */
    public final MeasuringIntrinsics$IntrinsicMinMax f3684b;

    /* JADX INFO: renamed from: c */
    public final MeasuringIntrinsics$IntrinsicWidthHeight f3685c;

    public C0525f(InterfaceC5644h interfaceC5644h, MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax, MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight) {
        C5207g.m11111f(measuringIntrinsics$IntrinsicMinMax, "minMax");
        C5207g.m11111f(measuringIntrinsics$IntrinsicWidthHeight, "widthHeight");
        this.f3683a = interfaceC5644h;
        this.f3684b = measuringIntrinsics$IntrinsicMinMax;
        this.f3685c = measuringIntrinsics$IntrinsicWidthHeight;
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: R */
    public final int mo2044R(int i10) {
        return this.f3683a.mo2044R(i10);
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: a */
    public final int mo2045a(int i10) {
        return this.f3683a.mo2045a(i10);
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: s */
    public final int mo2046s(int i10) {
        return this.f3683a.mo2046s(i10);
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: u */
    public final int mo2047u(int i10) {
        return this.f3683a.mo2047u(i10);
    }

    @Override // p127g1.InterfaceC5651o
    /* JADX INFO: renamed from: w */
    public final AbstractC0526g mo2048w(long j10) {
        MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight = this.f3685c;
        MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight2 = MeasuringIntrinsics$IntrinsicWidthHeight.Width;
        MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax = this.f3684b;
        InterfaceC5644h interfaceC5644h = this.f3683a;
        if (measuringIntrinsics$IntrinsicWidthHeight == measuringIntrinsics$IntrinsicWidthHeight2) {
            return new C5654r(measuringIntrinsics$IntrinsicMinMax == MeasuringIntrinsics$IntrinsicMinMax.Max ? interfaceC5644h.mo2047u(C10013a.m18602g(j10)) : interfaceC5644h.mo2046s(C10013a.m18602g(j10)), C10013a.m18602g(j10));
        }
        return new C5654r(C10013a.m18603h(j10), measuringIntrinsics$IntrinsicMinMax == MeasuringIntrinsics$IntrinsicMinMax.Max ? interfaceC5644h.mo2045a(C10013a.m18603h(j10)) : interfaceC5644h.mo2044R(C10013a.m18603h(j10)));
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: y */
    public final Object mo2049y() {
        return this.f3683a.mo2049y();
    }
}
