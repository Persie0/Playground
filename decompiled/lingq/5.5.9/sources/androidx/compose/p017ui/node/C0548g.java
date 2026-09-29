package androidx.compose.p017ui.node;

import androidx.compose.p017ui.layout.AbstractC0526g;
import dm.C5207g;
import p127g1.InterfaceC5644h;
import p127g1.InterfaceC5651o;
import p166i1.C6170y;
import p470x1.C10013a;

/* JADX INFO: renamed from: androidx.compose.ui.node.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0548g implements InterfaceC5651o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5644h f3923a;

    /* JADX INFO: renamed from: b */
    public final NodeMeasuringIntrinsics$IntrinsicMinMax f3924b;

    /* JADX INFO: renamed from: c */
    public final NodeMeasuringIntrinsics$IntrinsicWidthHeight f3925c;

    public C0548g(InterfaceC5644h interfaceC5644h, NodeMeasuringIntrinsics$IntrinsicMinMax nodeMeasuringIntrinsics$IntrinsicMinMax, NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight) {
        C5207g.m11111f(nodeMeasuringIntrinsics$IntrinsicMinMax, "minMax");
        C5207g.m11111f(nodeMeasuringIntrinsics$IntrinsicWidthHeight, "widthHeight");
        this.f3923a = interfaceC5644h;
        this.f3924b = nodeMeasuringIntrinsics$IntrinsicMinMax;
        this.f3925c = nodeMeasuringIntrinsics$IntrinsicWidthHeight;
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: R */
    public final int mo2044R(int i10) {
        return this.f3923a.mo2044R(i10);
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: a */
    public final int mo2045a(int i10) {
        return this.f3923a.mo2045a(i10);
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: s */
    public final int mo2046s(int i10) {
        return this.f3923a.mo2046s(i10);
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: u */
    public final int mo2047u(int i10) {
        return this.f3923a.mo2047u(i10);
    }

    @Override // p127g1.InterfaceC5651o
    /* JADX INFO: renamed from: w */
    public final AbstractC0526g mo2048w(long j10) {
        NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight = this.f3925c;
        NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight2 = NodeMeasuringIntrinsics$IntrinsicWidthHeight.Width;
        NodeMeasuringIntrinsics$IntrinsicMinMax nodeMeasuringIntrinsics$IntrinsicMinMax = this.f3924b;
        InterfaceC5644h interfaceC5644h = this.f3923a;
        if (nodeMeasuringIntrinsics$IntrinsicWidthHeight == nodeMeasuringIntrinsics$IntrinsicWidthHeight2) {
            return new C6170y(nodeMeasuringIntrinsics$IntrinsicMinMax == NodeMeasuringIntrinsics$IntrinsicMinMax.Max ? interfaceC5644h.mo2047u(C10013a.m18602g(j10)) : interfaceC5644h.mo2046s(C10013a.m18602g(j10)), C10013a.m18602g(j10));
        }
        return new C6170y(C10013a.m18603h(j10), nodeMeasuringIntrinsics$IntrinsicMinMax == NodeMeasuringIntrinsics$IntrinsicMinMax.Max ? interfaceC5644h.mo2045a(C10013a.m18603h(j10)) : interfaceC5644h.mo2044R(C10013a.m18603h(j10)));
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: y */
    public final Object mo2049y() {
        return this.f3923a.mo2049y();
    }
}
