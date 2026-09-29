package com.lingq.p055ui.upgrade;

import ae.C0062b;
import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0438a;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.layout.C0520a;
import androidx.compose.p017ui.node.ComposeUiNode;
import androidx.compose.p017ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p017ui.platform.CompositionLocalsKt;
import androidx.compose.p017ui.platform.InspectableValueKt;
import androidx.compose.p017ui.platform.InterfaceC0647n1;
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
import com.lingq.p055ui.theme.CustomColorSchemeKt;
import com.lingq.p055ui.theme.SpacingKt;
import com.linguist.R;
import dm.C5207g;
import dm.C5212l;
import java.util.List;
import kotlin.collections.C6752c;
import p081e0.C5304d1;
import p081e0.C5332q0;
import p081e0.C5340u0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5336s0;
import p127g1.InterfaceC5652p;
import p205jk.C6514j;
import p231l1.C7218l;
import p260m8.C7499b;
import p284o0.InterfaceC7885a;
import p338qd.C8573r0;
import p387t0.C9169u;
import p443w.C9774e;
import p443w.C9775f;
import p470x1.InterfaceC10015c;
import p494y.C10275f;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class UpgradeItemsListKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m10413a(final List<C6514j> list, boolean z10, InterfaceC2052l<? super C6514j, C9072e> interfaceC2052l, InterfaceC0476a interfaceC0476a, final int i10, final int i11) {
        boolean z11;
        InterfaceC0476a.a.C10586a c10586a;
        final InterfaceC2052l<? super C6514j, C9072e> interfaceC2052l2;
        InterfaceC0476a.a.C10586a c10586a2;
        C5207g.m11111f(list, "items");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(-377568209);
        boolean z12 = (i11 & 2) != 0 ? false : z10;
        InterfaceC2052l<? super C6514j, C9072e> interfaceC2052l3 = (i11 & 4) != 0 ? new InterfaceC2052l<C6514j, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemsListKt$UpgradeItemsList$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6514j c6514j) {
                C5207g.m11111f(c6514j, "it");
                return C9072e.f47360a;
            }
        } : interfaceC2052l;
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        Context context = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
        composerImplMo1636j.mo1622c(-492369756);
        Object objM1619a0 = composerImplMo1636j.m1619a0();
        InterfaceC0476a.a.C10586a c10586a3 = InterfaceC0476a.a.f3122a;
        if (objM1619a0 == c10586a3) {
            objM1619a0 = C8573r0.m16684L0(Boolean.valueOf(z12));
            composerImplMo1636j.m1597F0(objM1619a0);
        }
        composerImplMo1636j.m1609Q(false);
        InterfaceC5312g0 interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
        InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
        InterfaceC0500b interfaceC0500bM18272a = C9775f.m18272a(IntrinsicSize.Min);
        composerImplMo1636j.mo1622c(733328855);
        InterfaceC5652p interfaceC5652pM1499d = BoxKt.m1499d(InterfaceC7885a.a.f42989a, false, composerImplMo1636j);
        composerImplMo1636j.mo1622c(-1323940314);
        C5304d1 c5304d1 = CompositionLocalsKt.f4137e;
        InterfaceC10015c interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d1);
        C5304d1 c5304d2 = CompositionLocalsKt.f4143k;
        LayoutDirection layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d2);
        C5304d1 c5304d3 = CompositionLocalsKt.f4148p;
        InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(c5304d3);
        ComposeUiNode.f3726n.getClass();
        InterfaceC2041a<ComposeUiNode> interfaceC2041a = ComposeUiNode.Companion.f3728b;
        ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM18272a);
        InterfaceC0476a.a.C10586a c10586a4 = c10586a3;
        InterfaceC5299c<?> interfaceC5299c = composerImplMo1636j.f2910a;
        InterfaceC2052l<? super C6514j, C9072e> interfaceC2052l4 = interfaceC2052l3;
        if (!(interfaceC5299c instanceof InterfaceC5299c)) {
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
        InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p = ComposeUiNode.Companion.f3731e;
        C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, interfaceC2056p);
        InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p2 = ComposeUiNode.Companion.f3730d;
        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, interfaceC2056p2);
        InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3732f;
        C8573r0.m16714a1(composerImplMo1636j, layoutDirection, interfaceC2056p3);
        InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3733g;
        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, interfaceC2056p4);
        composerImplMo1636j.mo1626e();
        composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
        composerImplMo1636j.mo1622c(2058660585);
        BoxKt.m1496a(C8573r0.m16701U(SizeKt.m1507d(), C10275f.f51719a), composerImplMo1636j, 0);
        InterfaceC0500b interfaceC0500bM1512i = SizeKt.m1512i(SizeKt.m1508e(aVar));
        composerImplMo1636j.mo1622c(-483455358);
        C0438a.f fVar = C0438a.f2429a;
        InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(composerImplMo1636j);
        composerImplMo1636j.mo1622c(-1323940314);
        InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d1);
        LayoutDirection layoutDirection2 = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d2);
        InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(c5304d3);
        ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1512i);
        if (!(interfaceC5299c instanceof InterfaceC5299c)) {
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
        C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1500a, interfaceC2056p);
        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, interfaceC2056p2);
        C8573r0.m16714a1(composerImplMo1636j, layoutDirection2, interfaceC2056p3);
        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n2, interfaceC2056p4);
        composerImplMo1636j.mo1626e();
        composableLambdaImplM2036a2.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
        composerImplMo1636j.mo1622c(2058660585);
        C0062b.m376o(SizeKt.m1509f(aVar, SpacingKt.m10360a(composerImplMo1636j).f33961k), composerImplMo1636j);
        composerImplMo1636j.mo1622c(525989394);
        for (final C6514j c6514j : C6752c.m13448p0(list, ((Boolean) interfaceC5312g0.getValue()).booleanValue() ? list.size() : 2)) {
            if (z12) {
                composerImplMo1636j.mo1622c(-1378215327);
                String str = c6514j.f37143b;
                String str2 = c6514j.f37144c;
                String str3 = c6514j.f37145d;
                String str4 = c6514j.f37146e;
                boolean z13 = c6514j.f37147f;
                boolean z14 = c6514j.f37148g;
                composerImplMo1636j.mo1622c(511388516);
                interfaceC2052l2 = interfaceC2052l4;
                boolean zMo1665y = composerImplMo1636j.mo1665y(interfaceC2052l2) | composerImplMo1636j.mo1665y(c6514j);
                Object objM1619a1 = composerImplMo1636j.m1619a0();
                if (zMo1665y) {
                    c10586a2 = c10586a4;
                } else {
                    c10586a2 = c10586a4;
                    if (objM1619a1 == c10586a2) {
                    }
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC2041a interfaceC2041a2 = (InterfaceC2041a) objM1619a1;
                    c10586a = c10586a2;
                    UpgradeItemCardTestKt.m10412a(str, str2, str3, str4, z13, z14, interfaceC2041a2, composerImplMo1636j, 0, 0);
                    composerImplMo1636j.m1609Q(false);
                }
                objM1619a1 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemsListKt$UpgradeItemsList$2$1$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C9072e mo807E() {
                        interfaceC2052l2.mo528n(c6514j);
                        return C9072e.f47360a;
                    }
                };
                composerImplMo1636j.m1597F0(objM1619a1);
                composerImplMo1636j.m1609Q(false);
                InterfaceC2041a interfaceC2041a3 = (InterfaceC2041a) objM1619a1;
                c10586a = c10586a2;
                UpgradeItemCardTestKt.m10412a(str, str2, str3, str4, z13, z14, interfaceC2041a3, composerImplMo1636j, 0, 0);
                composerImplMo1636j.m1609Q(false);
            } else {
                c10586a = c10586a4;
                interfaceC2052l2 = interfaceC2052l4;
                composerImplMo1636j.mo1622c(-1378214863);
                String str5 = c6514j.f37143b;
                String str6 = c6514j.f37144c;
                String str7 = c6514j.f37145d;
                String str8 = c6514j.f37146e;
                boolean z15 = c6514j.f37147f;
                boolean z16 = c6514j.f37148g;
                composerImplMo1636j.mo1622c(511388516);
                boolean zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC2052l2) | composerImplMo1636j.mo1665y(c6514j);
                Object objM1619a2 = composerImplMo1636j.m1619a0();
                if (zMo1665y2 || objM1619a2 == c10586a) {
                    objM1619a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemsListKt$UpgradeItemsList$2$1$1$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C9072e mo807E() {
                            interfaceC2052l2.mo528n(c6514j);
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                }
                composerImplMo1636j.m1609Q(false);
                UpgradeItemCardKt.m10411a(str5, str6, str7, str8, z15, z16, (InterfaceC2041a) objM1619a2, composerImplMo1636j, 0, 0);
                composerImplMo1636j.m1609Q(false);
            }
            C0062b.m376o(SizeKt.m1509f(aVar, SpacingKt.m10360a(composerImplMo1636j).f33961k), composerImplMo1636j);
            interfaceC5312g0 = interfaceC5312g0;
            aVar = aVar;
            c10586a4 = c10586a;
            interfaceC2052l4 = interfaceC2052l2;
        }
        InterfaceC0500b.a aVar2 = aVar;
        final InterfaceC5312g0 interfaceC5312g1 = interfaceC5312g0;
        InterfaceC0476a.a.C10586a c10586a5 = c10586a4;
        final InterfaceC2052l<? super C6514j, C9072e> interfaceC2052l5 = interfaceC2052l4;
        composerImplMo1636j.m1609Q(false);
        composerImplMo1636j.mo1622c(-1781175116);
        if (((Boolean) interfaceC5312g1.getValue()).booleanValue()) {
            z11 = false;
        } else {
            String string = context.getString(R.string.feed_view_all);
            composerImplMo1636j.mo1622c(1157296644);
            boolean zMo1665y3 = composerImplMo1636j.mo1665y(interfaceC5312g1);
            Object objM1619a3 = composerImplMo1636j.m1619a0();
            if (zMo1665y3 || objM1619a3 == c10586a5) {
                objM1619a3 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemsListKt$UpgradeItemsList$2$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C9072e mo807E() {
                        interfaceC5312g1.setValue(Boolean.TRUE);
                        return C9072e.f47360a;
                    }
                };
                composerImplMo1636j.m1597F0(objM1619a3);
            }
            z11 = false;
            composerImplMo1636j.m1609Q(false);
            InterfaceC0500b interfaceC0500bM1513j = SizeKt.m1513j(ClickableKt.m1410d(aVar2, (InterfaceC2041a) objM1619a3), null, 3);
            C5207g.m11111f(interfaceC0500bM1513j, "<this>");
            InterfaceC0500b interfaceC0500bM11156c0 = C5212l.m11156c0(interfaceC0500bM1513j.mo1929K(new C9774e(InspectableValueKt.f4184a)), SpacingKt.m10360a(composerImplMo1636j).f33951a);
            C7218l c7218l = C7499b.m14918P(composerImplMo1636j).f9274k;
            long j10 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33944f.getValue()).f47705a;
            C5207g.m11110e(string, "getString(R.string.feed_view_all)");
            TextKt.m1576c(string, interfaceC0500bM11156c0, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, composerImplMo1636j, 0, 0, 32760);
        }
        composerImplMo1636j.m1609Q(z11);
        composerImplMo1636j.m1609Q(z11);
        composerImplMo1636j.m1609Q(true);
        composerImplMo1636j.m1609Q(z11);
        composerImplMo1636j.m1609Q(z11);
        composerImplMo1636j.m1609Q(z11);
        composerImplMo1636j.m1609Q(true);
        composerImplMo1636j.m1609Q(z11);
        composerImplMo1636j.m1609Q(z11);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        final boolean z17 = z12;
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemsListKt$UpgradeItemsList$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                UpgradeItemsListKt.m10413a(list, z17, interfaceC2052l5, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                return C9072e.f47360a;
            }
        };
    }
}
