package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.C0522c;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import cm.InterfaceC2052l;
import cm.InterfaceC2057q;
import dm.C5207g;
import kotlin.collections.C6753d;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5653q;
import p386t.C9115g;
import p470x1.C10013a;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidOverscrollKt {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0500b f1699a;

    static {
        InterfaceC0500b interfaceC0500bM2037a;
        if (Build.VERSION.SDK_INT >= 31) {
            int i10 = InterfaceC0500b.f3324m;
            interfaceC0500bM2037a = C0522c.m2037a(C0522c.m2037a(InterfaceC0500b.a.f3325a, new InterfaceC2057q<InterfaceC0524e, InterfaceC5651o, C10013a, InterfaceC5653q>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1
                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final InterfaceC5653q mo1343M(InterfaceC0524e interfaceC0524e, InterfaceC5651o interfaceC5651o, C10013a c10013a) {
                    InterfaceC0524e interfaceC0524e2 = interfaceC0524e;
                    InterfaceC5651o interfaceC5651o2 = interfaceC5651o;
                    long j10 = c10013a.f50963a;
                    C5207g.m11111f(interfaceC0524e2, "$this$layout");
                    C5207g.m11111f(interfaceC5651o2, "measurable");
                    final AbstractC0526g abstractC0526gMo2048w = interfaceC5651o2.mo2048w(j10);
                    final int iMo1464s0 = interfaceC0524e2.mo1464s0(C9115g.f47615a * 2);
                    return interfaceC0524e2.m2043P(abstractC0526gMo2048w.mo2055e0() - iMo1464s0, abstractC0526gMo2048w.mo2054X() - iMo1464s0, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(AbstractC0526g.a aVar) {
                            AbstractC0526g.a aVar2 = aVar;
                            C5207g.m11111f(aVar2, "$this$layout");
                            int i11 = (-iMo1464s0) / 2;
                            AbstractC0526g abstractC0526g = abstractC0526gMo2048w;
                            AbstractC0526g.a.m2061g(aVar2, abstractC0526g, i11 - ((abstractC0526g.f3686a - abstractC0526g.mo2055e0()) / 2), i11 - ((abstractC0526g.f3687b - abstractC0526g.mo2054X()) / 2), null, 12);
                            return C9072e.f47360a;
                        }
                    });
                }
            }), new InterfaceC2057q<InterfaceC0524e, InterfaceC5651o, C10013a, InterfaceC5653q>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2
                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final InterfaceC5653q mo1343M(InterfaceC0524e interfaceC0524e, InterfaceC5651o interfaceC5651o, C10013a c10013a) {
                    InterfaceC0524e interfaceC0524e2 = interfaceC0524e;
                    InterfaceC5651o interfaceC5651o2 = interfaceC5651o;
                    long j10 = c10013a.f50963a;
                    C5207g.m11111f(interfaceC0524e2, "$this$layout");
                    C5207g.m11111f(interfaceC5651o2, "measurable");
                    final AbstractC0526g abstractC0526gMo2048w = interfaceC5651o2.mo2048w(j10);
                    final int iMo1464s0 = interfaceC0524e2.mo1464s0(C9115g.f47615a * 2);
                    return interfaceC0524e2.m2043P(abstractC0526gMo2048w.f3686a + iMo1464s0, abstractC0526gMo2048w.f3687b + iMo1464s0, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(AbstractC0526g.a aVar) {
                            AbstractC0526g.a aVar2 = aVar;
                            C5207g.m11111f(aVar2, "$this$layout");
                            int i11 = iMo1464s0 / 2;
                            AbstractC0526g.a.m2057c(aVar2, abstractC0526gMo2048w, i11, i11);
                            return C9072e.f47360a;
                        }
                    });
                }
            });
        } else {
            int i11 = InterfaceC0500b.f3324m;
            interfaceC0500bM2037a = InterfaceC0500b.a.f3325a;
        }
        f1699a = interfaceC0500bM2037a;
    }
}
