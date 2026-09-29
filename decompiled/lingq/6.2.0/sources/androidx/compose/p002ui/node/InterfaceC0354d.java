package androidx.compose.p002ui.node;

import p000.ct5;
import p000.dk1;
import p000.ea2;
import p000.ha4;
import p000.it5;
import p000.jt5;

/* JADX INFO: renamed from: androidx.compose.ui.node.d */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0354d extends ea2 {
    /* JADX INFO: renamed from: b */
    default int mo967b(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return mo575f(new ha4(abstractC0359i, abstractC0359i.getLayoutDirection()), new C0363m(ct5Var, NodeMeasuringIntrinsics$IntrinsicMinMax.Min, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Width), dk1.m10424b(0, 0, 0, i, 7)).mo10626d();
    }

    /* JADX INFO: renamed from: e */
    default int mo968e(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return mo575f(new ha4(abstractC0359i, abstractC0359i.getLayoutDirection()), new C0363m(ct5Var, NodeMeasuringIntrinsics$IntrinsicMinMax.Min, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Height), dk1.m10424b(0, i, 0, 0, 13)).mo10623a();
    }

    /* JADX INFO: renamed from: f */
    it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j);

    /* JADX INFO: renamed from: i */
    default int mo969i(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return mo575f(new ha4(abstractC0359i, abstractC0359i.getLayoutDirection()), new C0363m(ct5Var, NodeMeasuringIntrinsics$IntrinsicMinMax.Max, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Width), dk1.m10424b(0, 0, 0, i, 7)).mo10626d();
    }

    /* JADX INFO: renamed from: j */
    default int mo970j(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return mo575f(new ha4(abstractC0359i, abstractC0359i.getLayoutDirection()), new C0363m(ct5Var, NodeMeasuringIntrinsics$IntrinsicMinMax.Max, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Height), dk1.m10424b(0, i, 0, 0, 13)).mo10623a();
    }
}
