package androidx.compose.p002ui.node;

import p000.bk1;
import p000.ct5;
import p000.i63;
import p000.l87;

/* JADX INFO: renamed from: androidx.compose.ui.node.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0363m implements ct5 {

    /* JADX INFO: renamed from: a */
    public final ct5 f4457a;

    /* JADX INFO: renamed from: b */
    public final NodeMeasuringIntrinsics$IntrinsicMinMax f4458b;

    /* JADX INFO: renamed from: c */
    public final NodeMeasuringIntrinsics$IntrinsicWidthHeight f4459c;

    public C0363m(ct5 ct5Var, NodeMeasuringIntrinsics$IntrinsicMinMax nodeMeasuringIntrinsics$IntrinsicMinMax, NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight) {
        this.f4457a = ct5Var;
        this.f4458b = nodeMeasuringIntrinsics$IntrinsicMinMax;
        this.f4459c = nodeMeasuringIntrinsics$IntrinsicWidthHeight;
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: A */
    public final Object mo1509A() {
        return this.f4457a.mo1509A();
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: U */
    public final int mo1510U(int i) {
        return this.f4457a.mo1510U(i);
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: c */
    public final int mo1511c(int i) {
        return this.f4457a.mo1511c(i);
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: l */
    public final int mo1512l(int i) {
        return this.f4457a.mo1512l(i);
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: p */
    public final int mo1513p(int i) {
        return this.f4457a.mo1513p(i);
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: r */
    public final l87 mo1514r(long j) {
        NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight = NodeMeasuringIntrinsics$IntrinsicWidthHeight.Width;
        ct5 ct5Var = this.f4457a;
        NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight2 = this.f4459c;
        NodeMeasuringIntrinsics$IntrinsicMinMax nodeMeasuringIntrinsics$IntrinsicMinMax = this.f4458b;
        if (nodeMeasuringIntrinsics$IntrinsicWidthHeight2 == nodeMeasuringIntrinsics$IntrinsicWidthHeight) {
            return new i63(nodeMeasuringIntrinsics$IntrinsicMinMax == NodeMeasuringIntrinsics$IntrinsicMinMax.Max ? ct5Var.mo1513p(bk1.m3800h(j)) : ct5Var.mo1512l(bk1.m3800h(j)), bk1.m3796d(j) ? bk1.m3800h(j) : 32767, 2);
        }
        return new i63(bk1.m3797e(j) ? bk1.m3801i(j) : 32767, nodeMeasuringIntrinsics$IntrinsicMinMax == NodeMeasuringIntrinsics$IntrinsicMinMax.Max ? ct5Var.mo1511c(bk1.m3801i(j)) : ct5Var.mo1510U(bk1.m3801i(j)), 2);
    }
}
