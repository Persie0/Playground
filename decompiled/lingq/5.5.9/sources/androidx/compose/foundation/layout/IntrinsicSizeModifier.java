package androidx.compose.foundation.layout;

import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.InterfaceC0521b;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import androidx.compose.p017ui.unit.LayoutDirection;
import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.collections.C6753d;
import p127g1.InterfaceC5644h;
import p127g1.InterfaceC5645i;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5653q;
import p338qd.C8573r0;
import p470x1.C10014b;
import p470x1.C10020h;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public interface IntrinsicSizeModifier extends InterfaceC0521b {
    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: a */
    default int mo1422a(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        return interfaceC5644h.mo2045a(i10);
    }

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: b */
    default int mo1423b(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        return interfaceC5644h.mo2044R(i10);
    }

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: e */
    default InterfaceC5653q mo1352e(InterfaceC0524e interfaceC0524e, InterfaceC5651o interfaceC5651o, long j10) {
        C5207g.m11111f(interfaceC0524e, "$this$measure");
        final AbstractC0526g abstractC0526gMo2048w = interfaceC5651o.mo2048w(C10014b.m18614d(j10, mo1502e0(interfaceC0524e, interfaceC5651o, j10)));
        return interfaceC0524e.m2043P(abstractC0526gMo2048w.f3686a, abstractC0526gMo2048w.f3687b, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.foundation.layout.IntrinsicSizeModifier$measure$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(AbstractC0526g.a aVar) {
                AbstractC0526g.a aVar2 = aVar;
                C5207g.m11111f(aVar2, "$this$layout");
                long j11 = C10020h.f50973b;
                AbstractC0526g.a.C10587a c10587a = AbstractC0526g.a.f3690a;
                AbstractC0526g abstractC0526g = abstractC0526gMo2048w;
                C5207g.m11111f(abstractC0526g, "$this$placeRelative");
                if (aVar2.mo2063a() == LayoutDirection.Ltr || aVar2.mo2064b() == 0) {
                    long jM2053V = abstractC0526g.m2053V();
                    abstractC0526g.mo2056t0(C8573r0.m16752r(((int) (j11 >> 32)) + ((int) (jM2053V >> 32)), C10020h.m18625a(jM2053V) + C10020h.m18625a(j11)), 0.0f, null);
                } else {
                    long jM16752r = C8573r0.m16752r((aVar2.mo2064b() - abstractC0526g.f3686a) - ((int) (j11 >> 32)), C10020h.m18625a(j11));
                    long jM2053V2 = abstractC0526g.m2053V();
                    abstractC0526g.mo2056t0(C8573r0.m16752r(((int) (jM16752r >> 32)) + ((int) (jM2053V2 >> 32)), C10020h.m18625a(jM2053V2) + C10020h.m18625a(jM16752r)), 0.0f, null);
                }
                return C9072e.f47360a;
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    long mo1502e0(InterfaceC0524e interfaceC0524e, InterfaceC5651o interfaceC5651o, long j10);

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: f */
    default int mo1424f(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        return interfaceC5644h.mo2047u(i10);
    }

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: g */
    default int mo1425g(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        return interfaceC5644h.mo2046s(i10);
    }
}
