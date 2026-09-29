package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.node.AbstractC0359i;
import p000.c16;
import p000.ct5;
import p000.dk1;
import p000.ha4;
import p000.it5;
import p000.jt5;

/* JADX INFO: renamed from: androidx.compose.ui.layout.e */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0338e extends c16 {
    /* JADX INFO: renamed from: b */
    default int m1489b(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return mo1491f(new ha4(abstractC0359i, abstractC0359i.getLayoutDirection()), new C0340g(ct5Var, MeasuringIntrinsics$IntrinsicMinMax.Min, MeasuringIntrinsics$IntrinsicWidthHeight.Width), dk1.m10424b(0, 0, 0, i, 7)).mo10626d();
    }

    /* JADX INFO: renamed from: e */
    default int m1490e(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return mo1491f(new ha4(abstractC0359i, abstractC0359i.getLayoutDirection()), new C0340g(ct5Var, MeasuringIntrinsics$IntrinsicMinMax.Min, MeasuringIntrinsics$IntrinsicWidthHeight.Height), dk1.m10424b(0, i, 0, 0, 13)).mo10623a();
    }

    /* JADX INFO: renamed from: f */
    it5 mo1491f(jt5 jt5Var, ct5 ct5Var, long j);

    /* JADX INFO: renamed from: i */
    default int m1492i(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return mo1491f(new ha4(abstractC0359i, abstractC0359i.getLayoutDirection()), new C0340g(ct5Var, MeasuringIntrinsics$IntrinsicMinMax.Max, MeasuringIntrinsics$IntrinsicWidthHeight.Width), dk1.m10424b(0, 0, 0, i, 7)).mo10626d();
    }

    /* JADX INFO: renamed from: j */
    default int m1493j(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return mo1491f(new ha4(abstractC0359i, abstractC0359i.getLayoutDirection()), new C0340g(ct5Var, MeasuringIntrinsics$IntrinsicMinMax.Max, MeasuringIntrinsics$IntrinsicWidthHeight.Height), dk1.m10424b(0, i, 0, 0, 13)).mo10623a();
    }
}
