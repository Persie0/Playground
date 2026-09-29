package p127g1;

import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.IntrinsicMinMax;
import androidx.compose.p017ui.layout.IntrinsicWidthHeight;
import dm.C5207g;
import p470x1.C10013a;

/* JADX INFO: renamed from: g1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5640d implements InterfaceC5651o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5644h f34487a;

    /* JADX INFO: renamed from: b */
    public final IntrinsicMinMax f34488b;

    /* JADX INFO: renamed from: c */
    public final IntrinsicWidthHeight f34489c;

    public C5640d(InterfaceC5644h interfaceC5644h, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
        C5207g.m11111f(interfaceC5644h, "measurable");
        C5207g.m11111f(intrinsicMinMax, "minMax");
        C5207g.m11111f(intrinsicWidthHeight, "widthHeight");
        this.f34487a = interfaceC5644h;
        this.f34488b = intrinsicMinMax;
        this.f34489c = intrinsicWidthHeight;
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: R */
    public final int mo2044R(int i10) {
        return this.f34487a.mo2044R(i10);
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: a */
    public final int mo2045a(int i10) {
        return this.f34487a.mo2045a(i10);
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: s */
    public final int mo2046s(int i10) {
        return this.f34487a.mo2046s(i10);
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: u */
    public final int mo2047u(int i10) {
        return this.f34487a.mo2047u(i10);
    }

    @Override // p127g1.InterfaceC5651o
    /* JADX INFO: renamed from: w */
    public final AbstractC0526g mo2048w(long j10) {
        IntrinsicWidthHeight intrinsicWidthHeight = this.f34489c;
        IntrinsicWidthHeight intrinsicWidthHeight2 = IntrinsicWidthHeight.Width;
        IntrinsicMinMax intrinsicMinMax = this.f34488b;
        InterfaceC5644h interfaceC5644h = this.f34487a;
        if (intrinsicWidthHeight == intrinsicWidthHeight2) {
            return new C5641e(intrinsicMinMax == IntrinsicMinMax.Max ? interfaceC5644h.mo2047u(C10013a.m18602g(j10)) : interfaceC5644h.mo2046s(C10013a.m18602g(j10)), C10013a.m18602g(j10));
        }
        return new C5641e(C10013a.m18603h(j10), intrinsicMinMax == IntrinsicMinMax.Max ? interfaceC5644h.mo2045a(C10013a.m18603h(j10)) : interfaceC5644h.mo2044R(C10013a.m18603h(j10)));
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: y */
    public final Object mo2049y() {
        return this.f34487a.mo2049y();
    }
}
