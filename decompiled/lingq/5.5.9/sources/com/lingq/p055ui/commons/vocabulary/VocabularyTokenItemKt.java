package com.lingq.p055ui.commons.vocabulary;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0438a;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.layout.C0520a;
import androidx.compose.p017ui.node.ComposeUiNode;
import androidx.compose.p017ui.platform.C0661s0;
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
import com.lingq.p055ui.commons.status.StatusActionButtonKt;
import com.lingq.p055ui.commons.status.StatusPopupMenuKt;
import com.lingq.p055ui.commons.status.StatusWordButtonsKt;
import com.lingq.p055ui.theme.SpacingKt;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.WordStatus;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.util.C4924a;
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
import p159hi.C6054e;
import p159hi.InterfaceC6053d;
import p260m8.C7499b;
import p284o0.C7886b;
import p284o0.InterfaceC7885a;
import p338qd.C8573r0;
import p443w.C9788s;
import p443w.InterfaceC9786q;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class VocabularyTokenItemKt {
    /* JADX WARN: Code duplicated, block: B:33:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:36:0x027b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0282  */
    /* JADX WARN: Code duplicated, block: B:39:0x0286  */
    /* JADX WARN: Code duplicated, block: B:42:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:44:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:48:0x0339  */
    /* JADX WARN: Code duplicated, block: B:50:0x0340  */
    /* JADX WARN: Code duplicated, block: B:51:0x0344  */
    /* JADX WARN: Code duplicated, block: B:54:0x03db  */
    /* JADX WARN: Code duplicated, block: B:57:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:61:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:63:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:64:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:68:0x050d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0526  */
    /* JADX WARN: Code duplicated, block: B:72:0x052c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0531  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m9754a(final InterfaceC6053d interfaceC6053d, final boolean z10, final InterfaceC2052l<? super InterfaceC6053d, C9072e> interfaceC2052l, final InterfaceC2056p<? super String, ? super String, C9072e> interfaceC2056p, final InterfaceC2052l<? super String, C9072e> interfaceC2052l2, final InterfaceC2056p<? super String, ? super Integer, C9072e> interfaceC2056p2, final InterfaceC2052l<? super String, C9072e> interfaceC2052l3, InterfaceC0476a interfaceC0476a, final int i10) {
        InterfaceC0476a.a.C10586a c10586a;
        boolean zMo1665y;
        Object objM1619a0;
        InterfaceC2052l<C0661s0, C9072e> interfaceC2052l4;
        InterfaceC5652p interfaceC5652pM1499d;
        InterfaceC10015c interfaceC10015c;
        LayoutDirection layoutDirection;
        InterfaceC0647n1 interfaceC0647n1;
        ComposableLambdaImpl composableLambdaImplM2036a;
        InterfaceC5652p interfaceC5652pM1500a;
        InterfaceC10015c interfaceC10015c2;
        LayoutDirection layoutDirection2;
        InterfaceC0647n1 interfaceC0647n2;
        ComposableLambdaImpl composableLambdaImplM2036a2;
        InterfaceC5652p interfaceC5652pM1503a;
        InterfaceC10015c interfaceC10015c3;
        LayoutDirection layoutDirection3;
        InterfaceC0647n1 interfaceC0647n3;
        ComposableLambdaImpl composableLambdaImplM2036a3;
        C5332q0 c5332q0M1612T;
        C6054e c6054e;
        boolean zMo1665y2;
        Object objM1619a1;
        C5207g.m11111f(interfaceC6053d, "token");
        C5207g.m11111f(interfaceC2052l, "onTokenClicked");
        C5207g.m11111f(interfaceC2056p, "onTokenMoveKnownIgnored");
        C5207g.m11111f(interfaceC2052l2, "onTokenAdded");
        C5207g.m11111f(interfaceC2056p2, "onTokenStatusClicked");
        C5207g.m11111f(interfaceC2052l3, "onTtsClicked");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(-2023731533);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        String strMo12498c = interfaceC6053d.mo12498c();
        List<String> listMo12499d = interfaceC6053d.mo12499d();
        if (listMo12499d.isEmpty()) {
            listMo12499d = interfaceC6053d.mo12497b();
        }
        final String strM10452c = C4924a.m10452c(listMo12499d, strMo12498c);
        TokenMeaning tokenMeaning = (TokenMeaning) C6752c.m13425S(interfaceC6053d.mo12496a());
        if (tokenMeaning == null) {
            tokenMeaning = new TokenMeaning(0, null, "", 0, false, null, false, 0, 251, null);
        }
        composerImplMo1636j.mo1622c(-492369756);
        Object objM1619a2 = composerImplMo1636j.m1619a0();
        InterfaceC0476a.a.C10586a c10586a2 = InterfaceC0476a.a.f3122a;
        if (objM1619a2 == c10586a2) {
            objM1619a2 = C8573r0.m16684L0(Boolean.FALSE);
            composerImplMo1636j.m1597F0(objM1619a2);
        }
        composerImplMo1636j.m1609Q(false);
        final InterfaceC5312g0 interfaceC5312g0 = (InterfaceC5312g0) objM1619a2;
        InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
        InterfaceC0500b interfaceC0500bM1410d = ClickableKt.m1410d(SizeKt.m1507d(), new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.commons.vocabulary.VocabularyTokenItemKt$VocabularyTokenItem$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9072e mo807E() {
                interfaceC2052l.mo528n(interfaceC6053d);
                return C9072e.f47360a;
            }
        });
        C7886b.b bVar = InterfaceC7885a.a.f42994f;
        composerImplMo1636j.mo1622c(693286680);
        C0438a.f fVar = C0438a.f2429a;
        InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(fVar, bVar, composerImplMo1636j);
        composerImplMo1636j.mo1622c(-1323940314);
        C5304d1 c5304d1 = CompositionLocalsKt.f4137e;
        InterfaceC10015c interfaceC10015c4 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d1);
        TokenMeaning tokenMeaning2 = tokenMeaning;
        C5304d1 c5304d2 = CompositionLocalsKt.f4143k;
        LayoutDirection layoutDirection4 = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d2);
        C5304d1 c5304d3 = CompositionLocalsKt.f4148p;
        InterfaceC0647n1 interfaceC0647n4 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(c5304d3);
        ComposeUiNode.f3726n.getClass();
        InterfaceC2041a<ComposeUiNode> interfaceC2041a = ComposeUiNode.Companion.f3728b;
        ComposableLambdaImpl composableLambdaImplM2036a4 = C0520a.m2036a(interfaceC0500bM1410d);
        InterfaceC5299c<?> interfaceC5299c = composerImplMo1636j.f2910a;
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
        InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
        C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1503a2, interfaceC2056p3);
        InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c4, interfaceC2056p4);
        InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
        C8573r0.m16714a1(composerImplMo1636j, layoutDirection4, interfaceC2056p5);
        InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n4, interfaceC2056p6);
        composerImplMo1636j.mo1626e();
        composableLambdaImplM2036a4.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
        composerImplMo1636j.mo1622c(2058660585);
        InterfaceC0500b interfaceC0500bM1513j = SizeKt.m1513j(aVar, null, 3);
        composerImplMo1636j.mo1622c(733328855);
        InterfaceC5652p interfaceC5652pM1499d2 = BoxKt.m1499d(InterfaceC7885a.a.f42989a, false, composerImplMo1636j);
        composerImplMo1636j.mo1622c(-1323940314);
        InterfaceC10015c interfaceC10015c5 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d1);
        LayoutDirection layoutDirection5 = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d2);
        InterfaceC0647n1 interfaceC0647n5 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(c5304d3);
        ComposableLambdaImpl composableLambdaImplM2036a5 = C0520a.m2036a(interfaceC0500bM1513j);
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
        C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d2, interfaceC2056p3);
        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c5, interfaceC2056p4);
        C8573r0.m16714a1(composerImplMo1636j, layoutDirection5, interfaceC2056p5);
        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n5, interfaceC2056p6);
        composerImplMo1636j.mo1626e();
        composableLambdaImplM2036a5.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
        composerImplMo1636j.mo1622c(2058660585);
        StatusActionButtonKt.m9750a(interfaceC6053d, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.commons.vocabulary.VocabularyTokenItemKt$VocabularyTokenItem$2$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9072e mo807E() {
                InterfaceC6053d interfaceC6053d2 = interfaceC6053d;
                if ((interfaceC6053d2 instanceof C6054e) && C5207g.m11106a(((C6054e) interfaceC6053d2).f35748f, WordStatus.New.getValue())) {
                    interfaceC2052l2.mo528n(strM10452c);
                } else {
                    interfaceC5312g0.setValue(Boolean.TRUE);
                }
                return C9072e.f47360a;
            }
        }, composerImplMo1636j, 8);
        boolean zBooleanValue = ((Boolean) interfaceC5312g0.getValue()).booleanValue();
        composerImplMo1636j.mo1622c(1157296644);
        boolean zMo1665y3 = composerImplMo1636j.mo1665y(interfaceC5312g0);
        Object objM1619a3 = composerImplMo1636j.m1619a0();
        if (!zMo1665y3) {
            c10586a = c10586a2;
            if (objM1619a3 == c10586a) {
            }
            composerImplMo1636j.m1609Q(false);
            InterfaceC2052l interfaceC2052l5 = (InterfaceC2052l) objM1619a3;
            composerImplMo1636j.mo1622c(1618982084);
            zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC2056p2) | composerImplMo1636j.mo1665y(strM10452c);
            objM1619a0 = composerImplMo1636j.m1619a0();
            if (zMo1665y || objM1619a0 == c10586a) {
                objM1619a0 = new InterfaceC2052l<CardStatus, C9072e>() { // from class: com.lingq.ui.commons.vocabulary.VocabularyTokenItemKt$VocabularyTokenItem$2$1$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(CardStatus cardStatus) {
                        CardStatus cardStatus2 = cardStatus;
                        C5207g.m11111f(cardStatus2, "it");
                        interfaceC5312g0.setValue(Boolean.FALSE);
                        interfaceC2056p2.mo1337m0(strM10452c, Integer.valueOf(cardStatus2.getValue()));
                        return C9072e.f47360a;
                    }
                };
                composerImplMo1636j.m1597F0(objM1619a0);
            }
            composerImplMo1636j.m1609Q(false);
            StatusPopupMenuKt.m9752a(zBooleanValue, interfaceC2052l5, (InterfaceC2052l) objM1619a0, composerImplMo1636j, 0);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(true);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(false);
            InterfaceC0500b interfaceC0500bM18282a = InterfaceC9786q.m18282a(C5212l.m11156c0(aVar, SpacingKt.m10360a(composerImplMo1636j).f33955e));
            C5207g.m11111f(interfaceC0500bM18282a, "<this>");
            interfaceC2052l4 = InspectableValueKt.f4184a;
            InterfaceC0500b interfaceC0500bMo1929K = interfaceC0500bM18282a.mo1929K(new C9788s(interfaceC2052l4));
            C7886b c7886b = InterfaceC7885a.a.f42990b;
            composerImplMo1636j.mo1622c(733328855);
            interfaceC5652pM1499d = BoxKt.m1499d(c7886b, false, composerImplMo1636j);
            composerImplMo1636j.mo1622c(-1323940314);
            interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d1);
            InterfaceC0476a.a.C10586a c10586a3 = c10586a;
            layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d2);
            interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(c5304d3);
            composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bMo1929K);
            if (interfaceC5299c instanceof InterfaceC5299c) {
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
            C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, interfaceC2056p3);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, interfaceC2056p4);
            C8573r0.m16714a1(composerImplMo1636j, layoutDirection, interfaceC2056p5);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, interfaceC2056p6);
            composerImplMo1636j.mo1626e();
            composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
            composerImplMo1636j.mo1622c(2058660585);
            composerImplMo1636j.mo1622c(-483455358);
            C0438a.f fVar2 = C0438a.f2429a;
            interfaceC5652pM1500a = ColumnKt.m1500a(composerImplMo1636j);
            composerImplMo1636j.mo1622c(-1323940314);
            interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d1);
            layoutDirection2 = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d2);
            interfaceC0647n2 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(c5304d3);
            composableLambdaImplM2036a2 = C0520a.m2036a(aVar);
            if (interfaceC5299c instanceof InterfaceC5299c) {
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
            C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1500a, interfaceC2056p3);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, interfaceC2056p4);
            C8573r0.m16714a1(composerImplMo1636j, layoutDirection2, interfaceC2056p5);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n2, interfaceC2056p6);
            composerImplMo1636j.mo1626e();
            composableLambdaImplM2036a2.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
            composerImplMo1636j.mo1622c(2058660585);
            composerImplMo1636j.mo1622c(693286680);
            interfaceC5652pM1503a = RowKt.m1503a(fVar, InterfaceC7885a.a.f42993e, composerImplMo1636j);
            composerImplMo1636j.mo1622c(-1323940314);
            interfaceC10015c3 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d1);
            layoutDirection3 = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d2);
            interfaceC0647n3 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(c5304d3);
            composableLambdaImplM2036a3 = C0520a.m2036a(aVar);
            if (interfaceC5299c instanceof InterfaceC5299c) {
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
            C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1503a, interfaceC2056p3);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c3, interfaceC2056p4);
            C8573r0.m16714a1(composerImplMo1636j, layoutDirection3, interfaceC2056p5);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n3, interfaceC2056p6);
            composerImplMo1636j.mo1626e();
            composableLambdaImplM2036a3.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
            composerImplMo1636j.mo1622c(2058660585);
            TextKt.m1576c(strM10452c, C5212l.m11159f0(SizeKt.m1513j(aVar, null, 3), 0.0f, SpacingKt.m10360a(composerImplMo1636j).f33954d, 0.0f, SpacingKt.m10360a(composerImplMo1636j).f33954d, 5), C7499b.m14898D(composerImplMo1636j).m5354m(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(composerImplMo1636j).f9267d, composerImplMo1636j, 0, 0, 32760);
            composerImplMo1636j.mo1622c(-966925284);
            if (z10) {
                composerImplMo1636j.mo1622c(511388516);
                zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC2052l3) | composerImplMo1636j.mo1665y(strM10452c);
                objM1619a1 = composerImplMo1636j.m1619a0();
                if (zMo1665y2 || objM1619a1 == c10586a3) {
                    objM1619a1 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.commons.vocabulary.VocabularyTokenItemKt$VocabularyTokenItem$2$2$1$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C9072e mo807E() {
                            interfaceC2052l3.mo528n(strM10452c);
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a1);
                }
                composerImplMo1636j.m1609Q(false);
                InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(composerImplMo1636j).f33954d, 0.0f, 0.0f, 0.0f, 14);
                C5207g.m11111f(interfaceC0500bM11159f0, "<this>");
                IconButtonKt.m1565a((InterfaceC2041a) objM1619a1, SizeKt.m1510g(C5212l.m11156c0(interfaceC0500bM11159f0.mo1929K(new C9788s(interfaceC2052l4)), SpacingKt.m10360a(composerImplMo1636j).f33954d), 16), false, null, null, ComposableSingletons$VocabularyTokenItemKt.f22467a, composerImplMo1636j, 196608, 28);
            }
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(true);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(false);
            TextKt.m1576c(tokenMeaning2.f22090c, SizeKt.m1513j(aVar, null, 3), C7499b.m14898D(composerImplMo1636j).m5354m(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(composerImplMo1636j).f9274k, composerImplMo1636j, 48, 0, 32760);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(true);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(true);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.mo1622c(-360925183);
            if (interfaceC6053d instanceof C6054e) {
                c6054e = (C6054e) interfaceC6053d;
                if (C5207g.m11106a(c6054e.f35748f, WordStatus.New.getValue())) {
                    StatusWordButtonsKt.m9753a(c6054e, interfaceC2056p, composerImplMo1636j, ((i10 >> 6) & 112) | 8);
                }
            }
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(true);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(false);
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.commons.vocabulary.VocabularyTokenItemKt$VocabularyTokenItem$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    VocabularyTokenItemKt.m9754a(interfaceC6053d, z10, interfaceC2052l, interfaceC2056p, interfaceC2052l2, interfaceC2056p2, interfaceC2052l3, interfaceC0476a2, C8573r0.m16737l1(i10 | 1));
                    return C9072e.f47360a;
                }
            };
        }
        c10586a = c10586a2;
        objM1619a3 = new InterfaceC2052l<Boolean, C9072e>() { // from class: com.lingq.ui.commons.vocabulary.VocabularyTokenItemKt$VocabularyTokenItem$2$1$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(Boolean bool) {
                interfaceC5312g0.setValue(Boolean.valueOf(bool.booleanValue()));
                return C9072e.f47360a;
            }
        };
        composerImplMo1636j.m1597F0(objM1619a3);
        composerImplMo1636j.m1609Q(false);
        InterfaceC2052l interfaceC2052l6 = (InterfaceC2052l) objM1619a3;
        composerImplMo1636j.mo1622c(1618982084);
        zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC2056p2) | composerImplMo1636j.mo1665y(strM10452c);
        objM1619a0 = composerImplMo1636j.m1619a0();
        if (zMo1665y) {
            objM1619a0 = new InterfaceC2052l<CardStatus, C9072e>() { // from class: com.lingq.ui.commons.vocabulary.VocabularyTokenItemKt$VocabularyTokenItem$2$1$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(CardStatus cardStatus) {
                    CardStatus cardStatus2 = cardStatus;
                    C5207g.m11111f(cardStatus2, "it");
                    interfaceC5312g0.setValue(Boolean.FALSE);
                    interfaceC2056p2.mo1337m0(strM10452c, Integer.valueOf(cardStatus2.getValue()));
                    return C9072e.f47360a;
                }
            };
            composerImplMo1636j.m1597F0(objM1619a0);
        } else {
            objM1619a0 = new InterfaceC2052l<CardStatus, C9072e>() { // from class: com.lingq.ui.commons.vocabulary.VocabularyTokenItemKt$VocabularyTokenItem$2$1$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(CardStatus cardStatus) {
                    CardStatus cardStatus2 = cardStatus;
                    C5207g.m11111f(cardStatus2, "it");
                    interfaceC5312g0.setValue(Boolean.FALSE);
                    interfaceC2056p2.mo1337m0(strM10452c, Integer.valueOf(cardStatus2.getValue()));
                    return C9072e.f47360a;
                }
            };
            composerImplMo1636j.m1597F0(objM1619a0);
        }
        composerImplMo1636j.m1609Q(false);
        StatusPopupMenuKt.m9752a(zBooleanValue, interfaceC2052l6, (InterfaceC2052l) objM1619a0, composerImplMo1636j, 0);
        composerImplMo1636j.m1609Q(false);
        composerImplMo1636j.m1609Q(true);
        composerImplMo1636j.m1609Q(false);
        composerImplMo1636j.m1609Q(false);
        InterfaceC0500b interfaceC0500bM18282a2 = InterfaceC9786q.m18282a(C5212l.m11156c0(aVar, SpacingKt.m10360a(composerImplMo1636j).f33955e));
        C5207g.m11111f(interfaceC0500bM18282a2, "<this>");
        interfaceC2052l4 = InspectableValueKt.f4184a;
        InterfaceC0500b interfaceC0500bMo1929K2 = interfaceC0500bM18282a2.mo1929K(new C9788s(interfaceC2052l4));
        C7886b c7886b2 = InterfaceC7885a.a.f42990b;
        composerImplMo1636j.mo1622c(733328855);
        interfaceC5652pM1499d = BoxKt.m1499d(c7886b2, false, composerImplMo1636j);
        composerImplMo1636j.mo1622c(-1323940314);
        interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d1);
        InterfaceC0476a.a.C10586a c10586a4 = c10586a;
        layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d2);
        interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(c5304d3);
        composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bMo1929K2);
        if (interfaceC5299c instanceof InterfaceC5299c) {
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
        C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, interfaceC2056p3);
        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, interfaceC2056p4);
        C8573r0.m16714a1(composerImplMo1636j, layoutDirection, interfaceC2056p5);
        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, interfaceC2056p6);
        composerImplMo1636j.mo1626e();
        composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
        composerImplMo1636j.mo1622c(2058660585);
        composerImplMo1636j.mo1622c(-483455358);
        C0438a.f fVar3 = C0438a.f2429a;
        interfaceC5652pM1500a = ColumnKt.m1500a(composerImplMo1636j);
        composerImplMo1636j.mo1622c(-1323940314);
        interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d1);
        layoutDirection2 = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d2);
        interfaceC0647n2 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(c5304d3);
        composableLambdaImplM2036a2 = C0520a.m2036a(aVar);
        if (interfaceC5299c instanceof InterfaceC5299c) {
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
        C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1500a, interfaceC2056p3);
        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, interfaceC2056p4);
        C8573r0.m16714a1(composerImplMo1636j, layoutDirection2, interfaceC2056p5);
        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n2, interfaceC2056p6);
        composerImplMo1636j.mo1626e();
        composableLambdaImplM2036a2.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
        composerImplMo1636j.mo1622c(2058660585);
        composerImplMo1636j.mo1622c(693286680);
        interfaceC5652pM1503a = RowKt.m1503a(fVar, InterfaceC7885a.a.f42993e, composerImplMo1636j);
        composerImplMo1636j.mo1622c(-1323940314);
        interfaceC10015c3 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d1);
        layoutDirection3 = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d2);
        interfaceC0647n3 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(c5304d3);
        composableLambdaImplM2036a3 = C0520a.m2036a(aVar);
        if (interfaceC5299c instanceof InterfaceC5299c) {
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
        C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1503a, interfaceC2056p3);
        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c3, interfaceC2056p4);
        C8573r0.m16714a1(composerImplMo1636j, layoutDirection3, interfaceC2056p5);
        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n3, interfaceC2056p6);
        composerImplMo1636j.mo1626e();
        composableLambdaImplM2036a3.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
        composerImplMo1636j.mo1622c(2058660585);
        TextKt.m1576c(strM10452c, C5212l.m11159f0(SizeKt.m1513j(aVar, null, 3), 0.0f, SpacingKt.m10360a(composerImplMo1636j).f33954d, 0.0f, SpacingKt.m10360a(composerImplMo1636j).f33954d, 5), C7499b.m14898D(composerImplMo1636j).m5354m(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(composerImplMo1636j).f9267d, composerImplMo1636j, 0, 0, 32760);
        composerImplMo1636j.mo1622c(-966925284);
        if (z10) {
            composerImplMo1636j.mo1622c(511388516);
            zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC2052l3) | composerImplMo1636j.mo1665y(strM10452c);
            objM1619a1 = composerImplMo1636j.m1619a0();
            if (zMo1665y2) {
                objM1619a1 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.commons.vocabulary.VocabularyTokenItemKt$VocabularyTokenItem$2$2$1$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C9072e mo807E() {
                        interfaceC2052l3.mo528n(strM10452c);
                        return C9072e.f47360a;
                    }
                };
                composerImplMo1636j.m1597F0(objM1619a1);
            } else {
                objM1619a1 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.commons.vocabulary.VocabularyTokenItemKt$VocabularyTokenItem$2$2$1$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C9072e mo807E() {
                        interfaceC2052l3.mo528n(strM10452c);
                        return C9072e.f47360a;
                    }
                };
                composerImplMo1636j.m1597F0(objM1619a1);
            }
            composerImplMo1636j.m1609Q(false);
            InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, SpacingKt.m10360a(composerImplMo1636j).f33954d, 0.0f, 0.0f, 0.0f, 14);
            C5207g.m11111f(interfaceC0500bM11159f1, "<this>");
            IconButtonKt.m1565a((InterfaceC2041a) objM1619a1, SizeKt.m1510g(C5212l.m11156c0(interfaceC0500bM11159f1.mo1929K(new C9788s(interfaceC2052l4)), SpacingKt.m10360a(composerImplMo1636j).f33954d), 16), false, null, null, ComposableSingletons$VocabularyTokenItemKt.f22467a, composerImplMo1636j, 196608, 28);
        }
        composerImplMo1636j.m1609Q(false);
        composerImplMo1636j.m1609Q(false);
        composerImplMo1636j.m1609Q(true);
        composerImplMo1636j.m1609Q(false);
        composerImplMo1636j.m1609Q(false);
        TextKt.m1576c(tokenMeaning2.f22090c, SizeKt.m1513j(aVar, null, 3), C7499b.m14898D(composerImplMo1636j).m5354m(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(composerImplMo1636j).f9274k, composerImplMo1636j, 48, 0, 32760);
        composerImplMo1636j.m1609Q(false);
        composerImplMo1636j.m1609Q(true);
        composerImplMo1636j.m1609Q(false);
        composerImplMo1636j.m1609Q(false);
        composerImplMo1636j.m1609Q(false);
        composerImplMo1636j.m1609Q(true);
        composerImplMo1636j.m1609Q(false);
        composerImplMo1636j.m1609Q(false);
        composerImplMo1636j.mo1622c(-360925183);
        if (interfaceC6053d instanceof C6054e) {
            c6054e = (C6054e) interfaceC6053d;
            if (C5207g.m11106a(c6054e.f35748f, WordStatus.New.getValue())) {
                StatusWordButtonsKt.m9753a(c6054e, interfaceC2056p, composerImplMo1636j, ((i10 >> 6) & 112) | 8);
            }
        }
        composerImplMo1636j.m1609Q(false);
        composerImplMo1636j.m1609Q(false);
        composerImplMo1636j.m1609Q(true);
        composerImplMo1636j.m1609Q(false);
        composerImplMo1636j.m1609Q(false);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
        c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.commons.vocabulary.VocabularyTokenItemKt$VocabularyTokenItem$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                VocabularyTokenItemKt.m9754a(interfaceC6053d, z10, interfaceC2052l, interfaceC2056p, interfaceC2052l2, interfaceC2056p2, interfaceC2052l3, interfaceC0476a2, C8573r0.m16737l1(i10 | 1));
                return C9072e.f47360a;
            }
        };
    }
}
