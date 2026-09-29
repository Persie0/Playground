package com.lingq.p055ui.commons.status;

import ae.C0062b;
import androidx.compose.foundation.layout.C0438a;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.p017ui.InterfaceC0500b;
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
import com.lingq.p055ui.theme.SpacingKt;
import com.lingq.shared.uimodel.WordStatus;
import dm.C5207g;
import dm.C5212l;
import p081e0.C5332q0;
import p081e0.C5340u0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p127g1.InterfaceC5652p;
import p159hi.C6054e;
import p260m8.C7499b;
import p284o0.C7886b;
import p284o0.InterfaceC7885a;
import p338qd.C8573r0;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class StatusWordButtonsKt {
    /* JADX INFO: renamed from: a */
    public static final void m9753a(final C6054e c6054e, final InterfaceC2056p<? super String, ? super String, C9072e> interfaceC2056p, InterfaceC0476a interfaceC0476a, final int i10) {
        C5207g.m11111f(c6054e, "token");
        C5207g.m11111f(interfaceC2056p, "onTokenMoveKnownIgnored");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(-968263019);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
        InterfaceC0500b interfaceC0500bM1513j = SizeKt.m1513j(C5212l.m11156c0(aVar, SpacingKt.m10360a(composerImplMo1636j).f33951a), InterfaceC7885a.a.f42991c, 2);
        C7886b.b bVar = InterfaceC7885a.a.f42994f;
        composerImplMo1636j.mo1622c(693286680);
        InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(C0438a.f2429a, bVar, composerImplMo1636j);
        composerImplMo1636j.mo1622c(-1323940314);
        InterfaceC10015c interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
        LayoutDirection layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
        InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
        ComposeUiNode.f3726n.getClass();
        InterfaceC2041a<ComposeUiNode> interfaceC2041a = ComposeUiNode.Companion.f3728b;
        ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1513j);
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
        C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1503a, ComposeUiNode.Companion.f3731e);
        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
        C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
        composerImplMo1636j.mo1626e();
        composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
        composerImplMo1636j.mo1622c(2058660585);
        float f3 = 16;
        IconButtonKt.m1565a(new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.commons.status.StatusWordButtonsKt$StatusWordButtons$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9072e mo807E() {
                interfaceC2056p.mo1337m0(c6054e.f35743a, WordStatus.Ignored.getValue());
                return C9072e.f47360a;
            }
        }, SizeKt.m1510g(aVar, f3), false, null, null, ComposableSingletons$StatusWordButtonsKt.f22424a, composerImplMo1636j, 196656, 28);
        C0062b.m376o(SizeKt.m1511h(aVar, SpacingKt.m10360a(composerImplMo1636j).f33951a), composerImplMo1636j);
        DividerKt.m1564a(SizeKt.m1511h(SizeKt.m1509f(aVar, 24), 1), 2, C7499b.m14898D(composerImplMo1636j).m5358q(), composerImplMo1636j, 54, 0);
        C0062b.m376o(SizeKt.m1511h(aVar, SpacingKt.m10360a(composerImplMo1636j).f33951a), composerImplMo1636j);
        IconButtonKt.m1565a(new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.commons.status.StatusWordButtonsKt$StatusWordButtons$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9072e mo807E() {
                interfaceC2056p.mo1337m0(c6054e.f35743a, WordStatus.Known.getValue());
                return C9072e.f47360a;
            }
        }, SizeKt.m1510g(aVar, f3), false, null, null, ComposableSingletons$StatusWordButtonsKt.f22425b, composerImplMo1636j, 196656, 28);
        composerImplMo1636j.m1609Q(false);
        composerImplMo1636j.m1609Q(true);
        composerImplMo1636j.m1609Q(false);
        composerImplMo1636j.m1609Q(false);
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.commons.status.StatusWordButtonsKt$StatusWordButtons$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                int iM16737l1 = C8573r0.m16737l1(i10 | 1);
                StatusWordButtonsKt.m9753a(c6054e, interfaceC2056p, interfaceC0476a2, iM16737l1);
                return C9072e.f47360a;
            }
        };
    }
}
