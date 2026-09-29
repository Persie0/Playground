package androidx.compose.foundation.layout;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.C0520a;
import androidx.compose.p017ui.node.ComposeUiNode;
import androidx.compose.p017ui.platform.CompositionLocalsKt;
import androidx.compose.p017ui.platform.InterfaceC0647n1;
import androidx.compose.p017ui.unit.LayoutDirection;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import dm.C5207g;
import p081e0.C5332q0;
import p081e0.C5340u0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5652p;
import p284o0.C7886b;
import p284o0.InterfaceC7885a;
import p338qd.C8573r0;
import p385sf.C9000b;
import p443w.C9770a;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class BoxKt {

    /* JADX INFO: renamed from: a */
    public static final BoxKt$boxMeasurePolicy$1 f2307a = new BoxKt$boxMeasurePolicy$1(InterfaceC7885a.a.f42989a, false);

    /* JADX INFO: renamed from: b */
    public static final BoxKt$EmptyBoxMeasurePolicy$1 f2308b = BoxKt$EmptyBoxMeasurePolicy$1.f2311a;

    /* JADX INFO: renamed from: a */
    public static final void m1496a(final InterfaceC0500b interfaceC0500b, InterfaceC0476a interfaceC0476a, final int i10) {
        int i11;
        C5207g.m11111f(interfaceC0500b, "modifier");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(-211209833);
        if ((i10 & 14) == 0) {
            i11 = (composerImplMo1636j.mo1665y(interfaceC0500b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerImplMo1636j.mo1642m()) {
            composerImplMo1636j.mo1650q();
        } else {
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
            composerImplMo1636j.mo1622c(-1323940314);
            InterfaceC10015c interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
            LayoutDirection layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
            InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
            ComposeUiNode.f3726n.getClass();
            InterfaceC2041a<ComposeUiNode> interfaceC2041a = ComposeUiNode.Companion.f3728b;
            ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500b);
            int i12 = (((((i11 << 3) & 112) | 384) << 9) & 7168) | 6;
            if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                C8573r0.m16771y0();
                throw null;
            }
            composerImplMo1636j.mo1640l();
            if (composerImplMo1636j.f2897L) {
                composerImplMo1636j.mo1634i(interfaceC2041a);
            } else {
                composerImplMo1636j.mo1653s();
            }
            composerImplMo1636j.f2933x = false;
            C8573r0.m16714a1(composerImplMo1636j, f2308b, ComposeUiNode.Companion.f3731e);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
            C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
            composerImplMo1636j.mo1626e();
            composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, Integer.valueOf((i12 >> 3) & 112));
            composerImplMo1636j.mo1622c(2058660585);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(true);
            composerImplMo1636j.m1609Q(false);
        }
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.layout.BoxKt$Box$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                int i13 = i10 | 1;
                BoxKt.m1496a(interfaceC0500b, interfaceC0476a2, i13);
                return C9072e.f47360a;
            }
        };
    }

    /* JADX INFO: renamed from: b */
    public static final void m1497b(AbstractC0526g.a aVar, AbstractC0526g abstractC0526g, InterfaceC5651o interfaceC5651o, LayoutDirection layoutDirection, int i10, int i11, InterfaceC7885a interfaceC7885a) {
        m1498c(interfaceC5651o);
        long jMo15655a = interfaceC7885a.mo15655a(C9000b.m17236a(abstractC0526g.f3686a, abstractC0526g.f3687b), C9000b.m17236a(i10, i11), layoutDirection);
        AbstractC0526g.a.C10587a c10587a = AbstractC0526g.a.f3690a;
        aVar.getClass();
        AbstractC0526g.a.m2058d(abstractC0526g, jMo15655a, 0.0f);
    }

    /* JADX INFO: renamed from: c */
    public static final C9770a m1498c(InterfaceC5651o interfaceC5651o) {
        Object objMo2049y = interfaceC5651o.mo2049y();
        if (objMo2049y instanceof C9770a) {
            return (C9770a) objMo2049y;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC5652p m1499d(C7886b c7886b, boolean z10, InterfaceC0476a interfaceC0476a) {
        InterfaceC5652p interfaceC5652p;
        interfaceC0476a.mo1622c(56522820);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        if (!C5207g.m11106a(c7886b, InterfaceC7885a.a.f42989a) || z10) {
            Boolean boolValueOf = Boolean.valueOf(z10);
            interfaceC0476a.mo1622c(511388516);
            boolean zMo1665y = interfaceC0476a.mo1665y(boolValueOf) | interfaceC0476a.mo1665y(c7886b);
            Object objMo1624d = interfaceC0476a.mo1624d();
            if (zMo1665y || objMo1624d == InterfaceC0476a.a.f3122a) {
                objMo1624d = new BoxKt$boxMeasurePolicy$1(c7886b, z10);
                interfaceC0476a.mo1655t(objMo1624d);
            }
            interfaceC0476a.mo1661w();
            interfaceC5652p = (InterfaceC5652p) objMo1624d;
        } else {
            interfaceC5652p = f2307a;
        }
        interfaceC0476a.mo1661w();
        return interfaceC5652p;
    }
}
