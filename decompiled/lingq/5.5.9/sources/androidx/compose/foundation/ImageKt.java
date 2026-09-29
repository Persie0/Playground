package androidx.compose.foundation;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.draw.C0502b;
import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.C0520a;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import androidx.compose.p017ui.node.ComposeUiNode;
import androidx.compose.p017ui.platform.CompositionLocalsKt;
import androidx.compose.p017ui.platform.InterfaceC0647n1;
import androidx.compose.p017ui.semantics.SemanticsProperties;
import androidx.compose.p017ui.unit.LayoutDirection;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import dm.C5207g;
import dm.C5212l;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.collections.C6753d;
import p081e0.C5332q0;
import p081e0.C5340u0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p127g1.InterfaceC5639c;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5652p;
import p127g1.InterfaceC5653q;
import p210k1.C6576n;
import p210k1.InterfaceC6577o;
import p284o0.InterfaceC7885a;
import p338qd.C8573r0;
import p385sf.C9000b;
import p387t0.C9170v;
import p444w0.AbstractC9790b;
import p470x1.C10013a;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class ImageKt {
    /* JADX INFO: renamed from: a */
    public static final void m1415a(final AbstractC9790b abstractC9790b, final String str, InterfaceC0500b interfaceC0500b, InterfaceC7885a interfaceC7885a, InterfaceC5639c interfaceC5639c, float f3, C9170v c9170v, InterfaceC0476a interfaceC0476a, final int i10, final int i11) {
        C5207g.m11111f(abstractC9790b, "painter");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(1142754848);
        int i12 = i11 & 4;
        InterfaceC0500b interfaceC0500bM11163j0 = InterfaceC0500b.a.f3325a;
        final InterfaceC0500b interfaceC0500b2 = i12 != 0 ? interfaceC0500bM11163j0 : interfaceC0500b;
        InterfaceC7885a interfaceC7885a2 = (i11 & 8) != 0 ? InterfaceC7885a.a.f42991c : interfaceC7885a;
        InterfaceC5639c interfaceC5639c2 = (i11 & 16) != 0 ? InterfaceC5639c.a.f34486a : interfaceC5639c;
        float f10 = (i11 & 32) != 0 ? 1.0f : f3;
        C9170v c9170v2 = (i11 & 64) != 0 ? null : c9170v;
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        composerImplMo1636j.mo1622c(-816794123);
        if (str != null) {
            composerImplMo1636j.mo1622c(1157296644);
            boolean zMo1665y = composerImplMo1636j.mo1665y(str);
            Object objM1619a0 = composerImplMo1636j.m1619a0();
            if (zMo1665y || objM1619a0 == InterfaceC0476a.a.f3122a) {
                objM1619a0 = new InterfaceC2052l<InterfaceC6577o, C9072e>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(InterfaceC6577o interfaceC6577o) {
                        InterfaceC6577o interfaceC6577o2 = interfaceC6577o;
                        C5207g.m11111f(interfaceC6577o2, "$this$semantics");
                        InterfaceC6727j<Object>[] interfaceC6727jArr = C6576n.f37397a;
                        String str2 = str;
                        C5207g.m11111f(str2, "value");
                        interfaceC6577o2.mo13162a(SemanticsProperties.f4408a, C9000b.m17251q(str2));
                        C6576n.m13167a(interfaceC6577o2, 5);
                        return C9072e.f47360a;
                    }
                };
                composerImplMo1636j.m1597F0(objM1619a0);
            }
            composerImplMo1636j.m1609Q(false);
            interfaceC0500bM11163j0 = C5212l.m11163j0(interfaceC0500bM11163j0, false, (InterfaceC2052l) objM1619a0);
        }
        composerImplMo1636j.m1609Q(false);
        InterfaceC0500b interfaceC0500bM1951a = C0502b.m1951a(C8573r0.m16703V(interfaceC0500b2.mo1929K(interfaceC0500bM11163j0)), abstractC9790b, interfaceC7885a2, interfaceC5639c2, f10, c9170v2);
        ImageKt$Image$2 imageKt$Image$2 = new InterfaceC5652p() { // from class: androidx.compose.foundation.ImageKt$Image$2
            @Override // p127g1.InterfaceC5652p
            /* JADX INFO: renamed from: a */
            public final InterfaceC5653q mo1328a(InterfaceC0524e interfaceC0524e, List<? extends InterfaceC5651o> list, long j10) {
                C5207g.m11111f(interfaceC0524e, "$this$Layout");
                return interfaceC0524e.m2043P(C10013a.m18605j(j10), C10013a.m18604i(j10), C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.foundation.ImageKt$Image$2$measure$1
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(AbstractC0526g.a aVar) {
                        C5207g.m11111f(aVar, "$this$layout");
                        return C9072e.f47360a;
                    }
                });
            }
        };
        composerImplMo1636j.mo1622c(-1323940314);
        InterfaceC10015c interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
        LayoutDirection layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
        InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
        ComposeUiNode.f3726n.getClass();
        InterfaceC2041a<ComposeUiNode> interfaceC2041a = ComposeUiNode.Companion.f3728b;
        ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1951a);
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
        C8573r0.m16714a1(composerImplMo1636j, imageKt$Image$2, ComposeUiNode.Companion.f3731e);
        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
        C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
        composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
        composerImplMo1636j.mo1622c(2058660585);
        composerImplMo1636j.m1609Q(false);
        composerImplMo1636j.m1609Q(true);
        composerImplMo1636j.m1609Q(false);
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        final InterfaceC7885a interfaceC7885a3 = interfaceC7885a2;
        final InterfaceC5639c interfaceC5639c3 = interfaceC5639c2;
        final float f11 = f10;
        final C9170v c9170v3 = c9170v2;
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.ImageKt$Image$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                ImageKt.m1415a(abstractC9790b, str, interfaceC0500b2, interfaceC7885a3, interfaceC5639c3, f11, c9170v3, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                return C9072e.f47360a;
            }
        };
    }
}
