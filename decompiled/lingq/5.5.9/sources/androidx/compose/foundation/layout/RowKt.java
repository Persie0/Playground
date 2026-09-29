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
public final class RowKt {

    /* JADX INFO: renamed from: a */
    public static final RowColumnImplKt$rowColumnMeasurePolicy$1 f2387a;

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        C0438a.f fVar = C0438a.f2429a;
        int i10 = AbstractC9773d.f49853a;
        AbstractC9773d.e eVar = new AbstractC9773d.e(InterfaceC7885a.a.f42993e);
        f2387a = C8584v.m16779A(layoutOrientation, new InterfaceC2059s<Integer, int[], LayoutDirection, InterfaceC10015c, int[], C9072e>() { // from class: androidx.compose.foundation.layout.RowKt$DefaultRowMeasurePolicy$1
            @Override // cm.InterfaceC2059s
            /* JADX INFO: renamed from: o0 */
            public final C9072e mo1501o0(Integer num, int[] iArr, LayoutDirection layoutDirection, InterfaceC10015c interfaceC10015c, int[] iArr2) {
                int iIntValue = num.intValue();
                int[] iArr3 = iArr;
                LayoutDirection layoutDirection2 = layoutDirection;
                InterfaceC10015c interfaceC10015c2 = interfaceC10015c;
                int[] iArr4 = iArr2;
                C5207g.m11111f(iArr3, "size");
                C5207g.m11111f(layoutDirection2, "layoutDirection");
                C5207g.m11111f(interfaceC10015c2, "density");
                C5207g.m11111f(iArr4, "outPosition");
                C0438a.f2429a.mo1524c(iIntValue, interfaceC10015c2, layoutDirection2, iArr3, iArr4);
                return C9072e.f47360a;
            }
        }, 0, SizeMode.Wrap, eVar);
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC5652p m1503a(final C0438a.b bVar, C7886b.b bVar2, InterfaceC0476a interfaceC0476a) {
        InterfaceC5652p interfaceC5652p;
        C5207g.m11111f(bVar, "horizontalArrangement");
        interfaceC0476a.mo1622c(-837807694);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        if (C5207g.m11106a(bVar, C0438a.f2429a) && C5207g.m11106a(bVar2, InterfaceC7885a.a.f42993e)) {
            interfaceC5652p = f2387a;
        } else {
            interfaceC0476a.mo1622c(511388516);
            boolean zMo1665y = interfaceC0476a.mo1665y(bVar) | interfaceC0476a.mo1665y(bVar2);
            Object objMo1624d = interfaceC0476a.mo1624d();
            if (zMo1665y || objMo1624d == InterfaceC0476a.a.f3122a) {
                LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
                float fMo1522a = bVar.mo1522a();
                int i10 = AbstractC9773d.f49853a;
                AbstractC9773d.e eVar = new AbstractC9773d.e(bVar2);
                objMo1624d = C8584v.m16779A(layoutOrientation, new InterfaceC2059s<Integer, int[], LayoutDirection, InterfaceC10015c, int[], C9072e>() { // from class: androidx.compose.foundation.layout.RowKt$rowMeasurePolicy$1$1
                    {
                        super(5);
                    }

                    @Override // cm.InterfaceC2059s
                    /* JADX INFO: renamed from: o0 */
                    public final C9072e mo1501o0(Integer num, int[] iArr, LayoutDirection layoutDirection, InterfaceC10015c interfaceC10015c, int[] iArr2) {
                        int iIntValue = num.intValue();
                        int[] iArr3 = iArr;
                        LayoutDirection layoutDirection2 = layoutDirection;
                        InterfaceC10015c interfaceC10015c2 = interfaceC10015c;
                        int[] iArr4 = iArr2;
                        C5207g.m11111f(iArr3, "size");
                        C5207g.m11111f(layoutDirection2, "layoutDirection");
                        C5207g.m11111f(interfaceC10015c2, "density");
                        C5207g.m11111f(iArr4, "outPosition");
                        bVar.mo1524c(iIntValue, interfaceC10015c2, layoutDirection2, iArr3, iArr4);
                        return C9072e.f47360a;
                    }
                }, fMo1522a, SizeMode.Wrap, eVar);
                interfaceC0476a.mo1655t(objMo1624d);
            }
            interfaceC0476a.mo1661w();
            interfaceC5652p = (InterfaceC5652p) objMo1624d;
        }
        interfaceC0476a.mo1661w();
        return interfaceC5652p;
    }
}
