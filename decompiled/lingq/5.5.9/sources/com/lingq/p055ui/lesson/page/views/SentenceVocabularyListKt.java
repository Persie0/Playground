package com.lingq.p055ui.lesson.page.views;

import ae.C0062b;
import androidx.compose.foundation.layout.C0438a;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.DividerKt;
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
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.lingq.p055ui.commons.vocabulary.VocabularyTokenItemKt;
import dm.C5207g;
import java.util.Iterator;
import java.util.List;
import p036c0.C1648d;
import p081e0.C5332q0;
import p081e0.C5340u0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p127g1.InterfaceC5652p;
import p159hi.InterfaceC6053d;
import p338qd.C8573r0;
import p387t0.C9144f0;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class SentenceVocabularyListKt {
    /* JADX INFO: renamed from: a */
    public static final void m10208a(final List<? extends InterfaceC6053d> list, final boolean z10, final InterfaceC2052l<? super InterfaceC6053d, C9072e> interfaceC2052l, final InterfaceC2056p<? super String, ? super String, C9072e> interfaceC2056p, final InterfaceC2052l<? super String, C9072e> interfaceC2052l2, final InterfaceC2056p<? super String, ? super Integer, C9072e> interfaceC2056p2, final InterfaceC2052l<? super String, C9072e> interfaceC2052l3, InterfaceC0476a interfaceC0476a, final int i10) {
        C5207g.m11111f(list, "tokens");
        C5207g.m11111f(interfaceC2052l, "onTokenClicked");
        C5207g.m11111f(interfaceC2056p, "onTokenMoveKnownIgnored");
        C5207g.m11111f(interfaceC2052l2, "onTokenAdded");
        C5207g.m11111f(interfaceC2056p2, "onTokenStatusClicked");
        C5207g.m11111f(interfaceC2052l3, "onTtsClicked");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(335191312);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
        InterfaceC0500b interfaceC0500bM309T = C0062b.m309T(SizeKt.m1512i(SizeKt.m1508e(aVar)), ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5342a(), C9144f0.f47650a);
        composerImplMo1636j.mo1622c(-483455358);
        C0438a.f fVar = C0438a.f2429a;
        InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(composerImplMo1636j);
        composerImplMo1636j.mo1622c(-1323940314);
        InterfaceC10015c interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
        LayoutDirection layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
        InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
        ComposeUiNode.f3726n.getClass();
        InterfaceC2041a<ComposeUiNode> interfaceC2041a = ComposeUiNode.Companion.f3728b;
        ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM309T);
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
        C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1500a, ComposeUiNode.Companion.f3731e);
        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
        C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
        composerImplMo1636j.mo1626e();
        composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
        composerImplMo1636j.mo1622c(2058660585);
        float f3 = 1;
        DividerKt.m1564a(SizeKt.m1508e(aVar), f3, 0L, composerImplMo1636j, 54, 4);
        composerImplMo1636j.mo1622c(-1491286264);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            VocabularyTokenItemKt.m9754a((InterfaceC6053d) it.next(), z10, interfaceC2052l, interfaceC2056p, interfaceC2052l2, interfaceC2056p2, interfaceC2052l3, composerImplMo1636j, (i10 & 112) | 8 | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10));
            DividerKt.m1564a(SizeKt.m1508e(aVar), f3, 0L, composerImplMo1636j, 54, 4);
        }
        composerImplMo1636j.m1609Q(false);
        composerImplMo1636j.m1609Q(false);
        composerImplMo1636j.m1609Q(true);
        composerImplMo1636j.m1609Q(false);
        composerImplMo1636j.m1609Q(false);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.lesson.page.views.SentenceVocabularyListKt$SentenceVocabularyList$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                SentenceVocabularyListKt.m10208a(list, z10, interfaceC2052l, interfaceC2056p, interfaceC2052l2, interfaceC2056p2, interfaceC2052l3, interfaceC0476a2, C8573r0.m16737l1(i10 | 1));
                return C9072e.f47360a;
            }
        };
    }
}
