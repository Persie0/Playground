package androidx.compose.p017ui;

import androidx.compose.p017ui.platform.C0661s0;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import dm.C5207g;
import dm.C5213m;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class ComposedModifierKt {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0500b m1927a(InterfaceC0500b interfaceC0500b, InterfaceC2052l<? super C0661s0, C9072e> interfaceC2052l, InterfaceC2057q<? super InterfaceC0500b, ? super InterfaceC0476a, ? super Integer, ? extends InterfaceC0500b> interfaceC2057q) {
        C5207g.m11111f(interfaceC0500b, "<this>");
        C5207g.m11111f(interfaceC2052l, "inspectorInfo");
        C5207g.m11111f(interfaceC2057q, "factory");
        return interfaceC0500b.mo1929K(new C0499a(interfaceC2052l, interfaceC2057q));
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0500b m1928b(final InterfaceC0476a interfaceC0476a, InterfaceC0500b interfaceC0500b) {
        C5207g.m11111f(interfaceC0476a, "<this>");
        C5207g.m11111f(interfaceC0500b, "modifier");
        if (interfaceC0500b.mo1926t(new InterfaceC2052l<InterfaceC0500b.b, Boolean>() { // from class: androidx.compose.ui.ComposedModifierKt$materialize$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(InterfaceC0500b.b bVar) {
                InterfaceC0500b.b bVar2 = bVar;
                C5207g.m11111f(bVar2, "it");
                return Boolean.valueOf(!(bVar2 instanceof C0499a));
            }
        })) {
            return interfaceC0500b;
        }
        interfaceC0476a.mo1622c(1219399079);
        int i10 = InterfaceC0500b.f3324m;
        InterfaceC0500b interfaceC0500b2 = (InterfaceC0500b) interfaceC0500b.mo1925o(InterfaceC0500b.a.f3325a, new InterfaceC2056p<InterfaceC0500b, InterfaceC0500b.b, InterfaceC0500b>() { // from class: androidx.compose.ui.ComposedModifierKt$materialize$result$1
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final InterfaceC0500b mo1337m0(InterfaceC0500b interfaceC0500b3, InterfaceC0500b.b bVar) {
                InterfaceC0500b interfaceC0500b4 = interfaceC0500b3;
                InterfaceC0500b.b bVarM1928b = bVar;
                C5207g.m11111f(interfaceC0500b4, "acc");
                C5207g.m11111f(bVarM1928b, "element");
                if (bVarM1928b instanceof C0499a) {
                    InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b> interfaceC2057q = ((C0499a) bVarM1928b).f3323b;
                    C5207g.m11109d(interfaceC2057q, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                    C5213m.m11200e(3, interfaceC2057q);
                    InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                    InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                    bVarM1928b = ComposedModifierKt.m1928b(interfaceC0476a2, interfaceC2057q.mo1343M(aVar, interfaceC0476a2, 0));
                }
                return interfaceC0500b4.mo1929K(bVarM1928b);
            }
        });
        interfaceC0476a.mo1661w();
        return interfaceC0500b2;
    }
}
