package com.lingq.p055ui.commons.status;

import ae.C0062b;
import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0438a;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.layout.C0520a;
import androidx.compose.p017ui.node.ComposeUiNode;
import androidx.compose.p017ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p017ui.platform.CompositionLocalsKt;
import androidx.compose.p017ui.platform.InterfaceC0647n1;
import androidx.compose.p017ui.unit.LayoutDirection;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.kochava.tracker.BuildConfig;
import com.lingq.p055ui.theme.SpacingKt;
import com.lingq.shared.uimodel.CardExtendedStatus;
import com.lingq.shared.uimodel.CardStatus;
import com.linguist.R;
import dm.C5207g;
import dm.C5212l;
import p081e0.C5332q0;
import p081e0.C5340u0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p127g1.InterfaceC5652p;
import p230l0.C7204a;
import p260m8.C7499b;
import p284o0.InterfaceC7885a;
import p323pi.C8394a;
import p338qd.C8573r0;
import p443w.C9775f;
import p443w.InterfaceC9771b;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class StatusPopupMenuKt {
    /* JADX WARN: Type inference failed for: r7v0, types: [com.lingq.ui.commons.status.StatusPopupMenuKt$StatusPopupMenu$2, kotlin.jvm.internal.Lambda] */
    /* JADX INFO: renamed from: a */
    public static final void m9752a(final boolean z10, final InterfaceC2052l<? super Boolean, C9072e> interfaceC2052l, final InterfaceC2052l<? super CardStatus, C9072e> interfaceC2052l2, InterfaceC0476a interfaceC0476a, final int i10) {
        final int i11;
        C5207g.m11111f(interfaceC2052l, "onExpandedChange");
        C5207g.m11111f(interfaceC2052l2, "onClicked");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(-810359094);
        if ((i10 & 14) == 0) {
            i11 = (composerImplMo1636j.m1598G(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerImplMo1636j.m1600H(interfaceC2052l) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerImplMo1636j.m1600H(interfaceC2052l2) ? 256 : BuildConfig.SDK_TRUNCATE_LENGTH;
        }
        if ((i11 & 731) == 146 && composerImplMo1636j.mo1642m()) {
            composerImplMo1636j.mo1650q();
        } else {
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
            final Context context = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
            composerImplMo1636j.mo1622c(1157296644);
            boolean zMo1665y = composerImplMo1636j.mo1665y(interfaceC2052l);
            Object objM1619a0 = composerImplMo1636j.m1619a0();
            if (zMo1665y || objM1619a0 == InterfaceC0476a.a.f3122a) {
                objM1619a0 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.commons.status.StatusPopupMenuKt$StatusPopupMenu$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C9072e mo807E() {
                        interfaceC2052l.mo528n(Boolean.FALSE);
                        return C9072e.f47360a;
                    }
                };
                composerImplMo1636j.m1597F0(objM1619a0);
            }
            composerImplMo1636j.m1609Q(false);
            AndroidMenu_androidKt.m1554a(z10, (InterfaceC2041a) objM1619a0, C5212l.m11156c0(C9775f.m18273b(SizeKt.m1512i(InterfaceC0500b.a.f3325a), IntrinsicSize.Max), SpacingKt.m10360a(composerImplMo1636j).f33954d), 0L, null, C7204a.m14522b(composerImplMo1636j, -672700136, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>(interfaceC2052l2, i11, context) { // from class: com.lingq.ui.commons.status.StatusPopupMenuKt$StatusPopupMenu$2

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC2052l<CardStatus, C9072e> f22450b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Context f22451c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                    this.f22451c = context;
                }

                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                    String string;
                    InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                    int iIntValue = num.intValue();
                    C5207g.m11111f(interfaceC9771b, "$this$DropdownMenu");
                    if ((iIntValue & 81) == 16 && interfaceC0476a3.mo1642m()) {
                        interfaceC0476a3.mo1650q();
                    } else {
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                        CardStatus[] cardStatusArrValues = CardStatus.values();
                        int i12 = 0;
                        for (int length = cardStatusArrValues.length; i12 < length; length = length) {
                            final CardStatus cardStatus = cardStatusArrValues[i12];
                            InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                            InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(C5212l.m11156c0(aVar, SpacingKt.m10360a(interfaceC0476a3).f33954d));
                            interfaceC0476a3.mo1622c(511388516);
                            final InterfaceC2052l<CardStatus, C9072e> interfaceC2052l3 = this.f22450b;
                            boolean zMo1665y2 = interfaceC0476a3.mo1665y(interfaceC2052l3) | interfaceC0476a3.mo1665y(cardStatus);
                            Object objMo1624d = interfaceC0476a3.mo1624d();
                            InterfaceC0476a.a.C10586a c10586a = InterfaceC0476a.a.f3122a;
                            if (zMo1665y2 || objMo1624d == c10586a) {
                                objMo1624d = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.commons.status.StatusPopupMenuKt$StatusPopupMenu$2$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(0);
                                    }

                                    @Override // cm.InterfaceC2041a
                                    /* JADX INFO: renamed from: E */
                                    public final C9072e mo807E() {
                                        interfaceC2052l3.mo528n(cardStatus);
                                        return C9072e.f47360a;
                                    }
                                };
                                interfaceC0476a3.mo1655t(objMo1624d);
                            }
                            interfaceC0476a3.mo1661w();
                            InterfaceC0500b interfaceC0500bM1410d = ClickableKt.m1410d(interfaceC0500bM1508e, (InterfaceC2041a) objMo1624d);
                            interfaceC0476a3.mo1622c(693286680);
                            InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(C0438a.f2429a, InterfaceC7885a.a.f42993e, interfaceC0476a3);
                            interfaceC0476a3.mo1622c(-1323940314);
                            InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4137e);
                            LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4143k);
                            InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4148p);
                            ComposeUiNode.f3726n.getClass();
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a = ComposeUiNode.Companion.f3728b;
                            ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1410d);
                            CardStatus[] cardStatusArr = cardStatusArrValues;
                            if (!(interfaceC0476a3.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a3.mo1640l();
                            if (interfaceC0476a3.mo1632h()) {
                                interfaceC0476a3.mo1634i(interfaceC2041a);
                            } else {
                                interfaceC0476a3.mo1653s();
                            }
                            interfaceC0476a3.mo1644n();
                            C8573r0.m16714a1(interfaceC0476a3, interfaceC5652pM1503a, ComposeUiNode.Companion.f3731e);
                            C8573r0.m16714a1(interfaceC0476a3, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                            C8573r0.m16714a1(interfaceC0476a3, layoutDirection, ComposeUiNode.Companion.f3732f);
                            C8573r0.m16714a1(interfaceC0476a3, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                            interfaceC0476a3.mo1626e();
                            composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a3), interfaceC0476a3, 0);
                            interfaceC0476a3.mo1622c(2058660585);
                            InterfaceC0500b interfaceC0500bM1510g = SizeKt.m1510g(aVar, 32);
                            int value = cardStatus.getValue();
                            Integer numValueOf = cardStatus == CardStatus.Known ? Integer.valueOf(CardExtendedStatus.Known.getValue()) : null;
                            interfaceC0476a3.mo1622c(511388516);
                            boolean zMo1665y3 = interfaceC0476a3.mo1665y(interfaceC2052l3) | interfaceC0476a3.mo1665y(cardStatus);
                            Object objMo1624d2 = interfaceC0476a3.mo1624d();
                            if (zMo1665y3 || objMo1624d2 == c10586a) {
                                objMo1624d2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.commons.status.StatusPopupMenuKt$StatusPopupMenu$2$1$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(0);
                                    }

                                    @Override // cm.InterfaceC2041a
                                    /* JADX INFO: renamed from: E */
                                    public final C9072e mo807E() {
                                        interfaceC2052l3.mo528n(cardStatus);
                                        return C9072e.f47360a;
                                    }
                                };
                                interfaceC0476a3.mo1655t(objMo1624d2);
                            }
                            interfaceC0476a3.mo1661w();
                            StatusCardButtonKt.m9751a(interfaceC0500bM1510g, value, numValueOf, (InterfaceC2041a) objMo1624d2, interfaceC0476a3, 6, 0);
                            C0062b.m376o(SizeKt.m1511h(aVar, SpacingKt.m10360a(interfaceC0476a3).f33951a), interfaceC0476a3);
                            Context context2 = this.f22451c;
                            C5207g.m11111f(context2, "context");
                            switch (C8394a.f45513a[cardStatus.ordinal()]) {
                                case 1:
                                    string = context2.getString(R.string.card_ignore_this_word);
                                    C5207g.m11110e(string, "context.getString(R.string.card_ignore_this_word)");
                                    break;
                                case 2:
                                    string = context2.getString(R.string.card_status_new);
                                    C5207g.m11110e(string, "context.getString(R.string.card_status_new)");
                                    break;
                                case 3:
                                    string = context2.getString(R.string.card_status_recognized);
                                    C5207g.m11110e(string, "context.getString(R.string.card_status_recognized)");
                                    break;
                                case 4:
                                    string = context2.getString(R.string.card_status_familiar);
                                    C5207g.m11110e(string, "context.getString(R.string.card_status_familiar)");
                                    break;
                                case 5:
                                    string = context2.getString(R.string.card_status_learned);
                                    C5207g.m11110e(string, "context.getString(R.string.card_status_learned)");
                                    break;
                                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                    string = context2.getString(R.string.card_status_known);
                                    C5207g.m11110e(string, "context.getString(R.string.card_status_known)");
                                    break;
                                default:
                                    string = context2.getString(R.string.card_status_new);
                                    C5207g.m11110e(string, "context.getString(R.string.card_status_new)");
                                    break;
                            }
                            InterfaceC0476a interfaceC0476a4 = interfaceC0476a3;
                            TextKt.m1576c(string, C5212l.m11156c0(SizeKt.m1513j(aVar, null, 3), SpacingKt.m10360a(interfaceC0476a3).f33954d), C7499b.m14898D(interfaceC0476a3).m5354m(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a3).f9273j, interfaceC0476a4, 0, 0, 32760);
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1663x();
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1661w();
                            C0062b.m376o(SizeKt.m1509f(aVar, SpacingKt.m10360a(interfaceC0476a4).f33954d), interfaceC0476a4);
                            i12++;
                            cardStatusArrValues = cardStatusArr;
                            interfaceC0476a3 = interfaceC0476a4;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                    }
                    return C9072e.f47360a;
                }
            }), composerImplMo1636j, (i11 & 14) | 196608, 24);
        }
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.commons.status.StatusPopupMenuKt$StatusPopupMenu$3
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
                InterfaceC2052l<Boolean, C9072e> interfaceC2052l3 = interfaceC2052l;
                InterfaceC2052l<CardStatus, C9072e> interfaceC2052l4 = interfaceC2052l2;
                StatusPopupMenuKt.m9752a(z10, interfaceC2052l3, interfaceC2052l4, interfaceC0476a2, iM16737l1);
                return C9072e.f47360a;
            }
        };
    }
}
