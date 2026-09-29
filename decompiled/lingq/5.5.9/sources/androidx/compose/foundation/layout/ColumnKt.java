package androidx.compose.foundation.layout;

import androidx.compose.p017ui.unit.LayoutDirection;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2057q;
import cm.InterfaceC2059s;
import dm.C5207g;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p127g1.InterfaceC5652p;
import p284o0.C7886b;
import p284o0.InterfaceC7885a;
import p338qd.C8584v;
import p443w.AbstractC9773d;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class ColumnKt {

    /* JADX INFO: renamed from: a */
    public static final RowColumnImplKt$rowColumnMeasurePolicy$1 f2328a;

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
        C0438a.f fVar = C0438a.f2429a;
        int i10 = AbstractC9773d.f49853a;
        AbstractC9773d.c cVar = new AbstractC9773d.c(InterfaceC7885a.a.f42995g);
        f2328a = C8584v.m16779A(layoutOrientation, new InterfaceC2059s<Integer, int[], LayoutDirection, InterfaceC10015c, int[], C9072e>() { // from class: androidx.compose.foundation.layout.ColumnKt$DefaultColumnMeasurePolicy$1
            @Override // cm.InterfaceC2059s
            /* JADX INFO: renamed from: o0 */
            public final C9072e mo1501o0(Integer num, int[] iArr, LayoutDirection layoutDirection, InterfaceC10015c interfaceC10015c, int[] iArr2) {
                int iIntValue = num.intValue();
                int[] iArr3 = iArr;
                InterfaceC10015c interfaceC10015c2 = interfaceC10015c;
                int[] iArr4 = iArr2;
                C5207g.m11111f(iArr3, "size");
                C5207g.m11111f(layoutDirection, "<anonymous parameter 2>");
                C5207g.m11111f(interfaceC10015c2, "density");
                C5207g.m11111f(iArr4, "outPosition");
                C0438a.f2430b.mo1523b(interfaceC10015c2, iIntValue, iArr3, iArr4);
                return C9072e.f47360a;
            }
        }, 0, SizeMode.Wrap, cVar);
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC5652p m1500a(InterfaceC0476a interfaceC0476a) {
        InterfaceC5652p interfaceC5652p;
        Object obj = C0438a.f2430b;
        C7886b.a aVar = InterfaceC7885a.a.f42995g;
        interfaceC0476a.mo1622c(1089876336);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        if (C5207g.m11106a(obj, obj) && C5207g.m11106a(aVar, aVar)) {
            interfaceC5652p = f2328a;
        } else {
            interfaceC0476a.mo1622c(511388516);
            boolean zMo1665y = interfaceC0476a.mo1665y(obj) | interfaceC0476a.mo1665y(aVar);
            Object objMo1624d = interfaceC0476a.mo1624d();
            if (zMo1665y || objMo1624d == InterfaceC0476a.a.f3122a) {
                int i10 = AbstractC9773d.f49853a;
                AbstractC9773d.c cVar = new AbstractC9773d.c(aVar);
                objMo1624d = C8584v.m16779A(LayoutOrientation.Vertical, new InterfaceC2059s<Integer, int[], LayoutDirection, InterfaceC10015c, int[], C9072e>() { // from class: androidx.compose.foundation.layout.ColumnKt$columnMeasurePolicy$1$1

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C0438a.h f2330b = C0438a.f2430b;

                    @Override // cm.InterfaceC2059s
                    /* JADX INFO: renamed from: o0 */
                    public final C9072e mo1501o0(Integer num, int[] iArr, LayoutDirection layoutDirection, InterfaceC10015c interfaceC10015c, int[] iArr2) {
                        int iIntValue = num.intValue();
                        int[] iArr3 = iArr;
                        InterfaceC10015c interfaceC10015c2 = interfaceC10015c;
                        int[] iArr4 = iArr2;
                        C5207g.m11111f(iArr3, "size");
                        C5207g.m11111f(layoutDirection, "<anonymous parameter 2>");
                        C5207g.m11111f(interfaceC10015c2, "density");
                        C5207g.m11111f(iArr4, "outPosition");
                        this.f2330b.mo1523b(interfaceC10015c2, iIntValue, iArr3, iArr4);
                        return C9072e.f47360a;
                    }
                }, 0, SizeMode.Wrap, cVar);
                interfaceC0476a.mo1655t(objMo1624d);
            }
            interfaceC0476a.mo1661w();
            interfaceC5652p = (InterfaceC5652p) objMo1624d;
        }
        interfaceC0476a.mo1661w();
        return interfaceC5652p;
    }
}
