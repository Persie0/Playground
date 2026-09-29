package androidx.compose.p017ui.layout;

import androidx.compose.p017ui.InterfaceC0500b;
import dm.C5207g;
import p127g1.C5646j;
import p127g1.InterfaceC5644h;
import p127g1.InterfaceC5645i;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5653q;
import p470x1.C10014b;

/* JADX INFO: renamed from: androidx.compose.ui.layout.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0521b extends InterfaceC0500b.b {
    /* JADX INFO: renamed from: a */
    default int mo1422a(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        return mo1352e(new C5646j(interfaceC5645i, interfaceC5645i.getLayoutDirection()), new C0525f(interfaceC5644h, MeasuringIntrinsics$IntrinsicMinMax.Max, MeasuringIntrinsics$IntrinsicWidthHeight.Height), C10014b.m18612b(i10, 0, 13)).mo2038a();
    }

    /* JADX INFO: renamed from: b */
    default int mo1423b(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        return mo1352e(new C5646j(interfaceC5645i, interfaceC5645i.getLayoutDirection()), new C0525f(interfaceC5644h, MeasuringIntrinsics$IntrinsicMinMax.Min, MeasuringIntrinsics$IntrinsicWidthHeight.Height), C10014b.m18612b(i10, 0, 13)).mo2038a();
    }

    /* JADX INFO: renamed from: e */
    InterfaceC5653q mo1352e(InterfaceC0524e interfaceC0524e, InterfaceC5651o interfaceC5651o, long j10);

    /* JADX INFO: renamed from: f */
    default int mo1424f(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        return mo1352e(new C5646j(interfaceC5645i, interfaceC5645i.getLayoutDirection()), new C0525f(interfaceC5644h, MeasuringIntrinsics$IntrinsicMinMax.Max, MeasuringIntrinsics$IntrinsicWidthHeight.Width), C10014b.m18612b(0, i10, 7)).mo2039b();
    }

    /* JADX INFO: renamed from: g */
    default int mo1425g(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        return mo1352e(new C5646j(interfaceC5645i, interfaceC5645i.getLayoutDirection()), new C0525f(interfaceC5644h, MeasuringIntrinsics$IntrinsicMinMax.Min, MeasuringIntrinsics$IntrinsicWidthHeight.Width), C10014b.m18612b(0, i10, 7)).mo2039b();
    }
}
