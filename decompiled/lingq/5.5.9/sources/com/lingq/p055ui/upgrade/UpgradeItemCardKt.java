package com.lingq.p055ui.upgrade;

import ae.C0062b;
import android.content.Context;
import androidx.compose.foundation.layout.C0438a;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.C0463b;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.DividerKt;
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
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.kochava.tracker.BuildConfig;
import com.lingq.p055ui.theme.CustomColorSchemeKt;
import com.lingq.p055ui.theme.SpacingKt;
import com.linguist.R;
import dm.C5207g;
import dm.C5212l;
import java.util.Locale;
import p036c0.C1648d;
import p081e0.C5304d1;
import p081e0.C5332q0;
import p081e0.C5340u0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p127g1.InterfaceC5652p;
import p187j1.C6401a;
import p230l0.C7204a;
import p231l1.C7218l;
import p260m8.C7499b;
import p284o0.C7886b;
import p284o0.InterfaceC7885a;
import p338qd.C8573r0;
import p387t0.C9144f0;
import p387t0.C9152j0;
import p387t0.C9169u;
import p443w.InterfaceC9771b;
import p470x1.InterfaceC10015c;
import p494y.AbstractC10270a;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class UpgradeItemCardKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0152  */
    /* JADX WARN: Code duplicated, block: B:102:0x0162  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x00af  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x0103  */
    /* JADX WARN: Code duplicated, block: B:85:0x0107  */
    /* JADX WARN: Code duplicated, block: B:86:0x010a  */
    /* JADX WARN: Code duplicated, block: B:88:0x010e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0111  */
    /* JADX WARN: Code duplicated, block: B:92:0x0116  */
    /* JADX WARN: Code duplicated, block: B:93:0x0119  */
    /* JADX WARN: Code duplicated, block: B:95:0x011d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0120  */
    /* JADX WARN: Code duplicated, block: B:98:0x0124  */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2, kotlin.jvm.internal.Lambda] */
    /* JADX INFO: renamed from: a */
    public static final void m10411a(final String str, final String str2, String str3, String str4, boolean z10, boolean z11, InterfaceC2041a<C9072e> interfaceC2041a, InterfaceC0476a interfaceC0476a, final int i10, final int i11) {
        int i12;
        String str5;
        int i13;
        String str6;
        int i14;
        int i15;
        boolean z12;
        int i16;
        int i17;
        boolean z13;
        int i18;
        int i19;
        InterfaceC2041a<C9072e> interfaceC2041a2;
        int i20;
        final int i21;
        String str7;
        String str8;
        boolean z14;
        boolean z15;
        C0463b c0463bM11185y;
        final String str9;
        ComposerImpl composerImpl;
        final String str10;
        final boolean z16;
        final boolean z17;
        final InterfaceC2041a<C9072e> interfaceC2041a3;
        C5332q0 c5332q0M1612T;
        C5207g.m11111f(str, "upgradeTitle");
        C5207g.m11111f(str2, "price");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(-1943356584);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerImplMo1636j.mo1665y(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerImplMo1636j.mo1665y(str2) ? 32 : 16;
        }
        int i22 = i11 & 4;
        if (i22 == 0) {
            if ((i10 & 896) == 0) {
                str5 = str3;
                i12 |= composerImplMo1636j.mo1665y(str5) ? 256 : BuildConfig.SDK_TRUNCATE_LENGTH;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    str6 = str4;
                    if (composerImplMo1636j.mo1665y(str6)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((57344 & i10) == 0) {
                        z12 = z10;
                        if (composerImplMo1636j.m1598G(z12)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 32;
                    if (i17 != 0) {
                        if ((458752 & i10) == 0) {
                            z13 = z11;
                            if (composerImplMo1636j.m1598G(z13)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                        i19 = i11 & 64;
                        if (i19 != 0) {
                            i12 |= 1572864;
                            interfaceC2041a2 = interfaceC2041a;
                        } else {
                            interfaceC2041a2 = interfaceC2041a;
                            if ((i10 & 3670016) == 0) {
                                if (composerImplMo1636j.m1600H(interfaceC2041a2)) {
                                    i20 = 1048576;
                                } else {
                                    i20 = 524288;
                                }
                                i12 |= i20;
                            }
                        }
                        i21 = i12;
                        if ((i21 & 2995931) == 599186 || !composerImplMo1636j.mo1642m()) {
                            if (i22 != 0) {
                                str7 = "";
                            } else {
                                str7 = str5;
                            }
                            if (i13 != 0) {
                                str8 = "";
                            } else {
                                str8 = str6;
                            }
                            if (i15 != 0) {
                                z14 = false;
                            } else {
                                z14 = z12;
                            }
                            if (i17 != 0) {
                                z15 = false;
                            } else {
                                z15 = z13;
                            }
                            if (i19 != 0) {
                                interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                                    @Override // cm.InterfaceC2041a
                                    /* JADX INFO: renamed from: E */
                                    public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                        return C9072e.f47360a;
                                    }
                                };
                            }
                            InterfaceC2041a<C9072e> interfaceC2041a4 = interfaceC2041a2;
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                            final Context context = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                            InterfaceC0500b interfaceC0500bM11157d0 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                            AbstractC10270a abstractC10270a = C7499b.m14916N(composerImplMo1636j).f9262d;
                            if (z14) {
                                composerImplMo1636j.mo1622c(1853269473);
                                c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                                composerImplMo1636j.m1609Q(false);
                            } else {
                                composerImplMo1636j.mo1622c(1853269535);
                                c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                                composerImplMo1636j.m1609Q(false);
                            }
                            str9 = str8;
                            final String str11 = str7;
                            final boolean z18 = z14;
                            final boolean z19 = z15;
                            composerImpl = composerImplMo1636j;
                            CardKt.m1558b(interfaceC2041a4, interfaceC0500bM11157d0, false, abstractC10270a, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // cm.InterfaceC2057q
                                /* JADX INFO: renamed from: M */
                                public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                                    long jM5363v;
                                    Context context2;
                                    InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                                    InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                                    C5304d1 c5304d1;
                                    InterfaceC0476a interfaceC0476a3;
                                    InterfaceC2041a<ComposeUiNode> interfaceC2041a5;
                                    C7218l c7218lM14543a;
                                    long jM11581a;
                                    InterfaceC0476a interfaceC0476a4;
                                    String str12;
                                    InterfaceC0476a interfaceC0476a5;
                                    long jM5347f;
                                    InterfaceC0476a interfaceC0476a6;
                                    long jM11582b;
                                    InterfaceC0476a interfaceC0476a7;
                                    long jM5347f2;
                                    InterfaceC0500b interfaceC0500bM11156c0;
                                    InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                                    int iIntValue = num.intValue();
                                    C5207g.m11111f(interfaceC9771b, "$this$Card");
                                    if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                                        interfaceC0476a8.mo1650q();
                                    } else {
                                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                                        InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                        boolean z20 = z19;
                                        boolean z21 = z18;
                                        if (z21) {
                                            interfaceC0476a8.mo1622c(1155538318);
                                            jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                            interfaceC0476a8.mo1661w();
                                        } else if (z20) {
                                            interfaceC0476a8.mo1622c(1155538428);
                                            jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                            interfaceC0476a8.mo1661w();
                                        } else {
                                            interfaceC0476a8.mo1622c(1155538516);
                                            jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                            interfaceC0476a8.mo1661w();
                                        }
                                        InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                                        String str13 = str;
                                        String str14 = str2;
                                        interfaceC0476a8.mo1622c(-483455358);
                                        C0438a.f fVar = C0438a.f2429a;
                                        InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                                        interfaceC0476a8.mo1622c(-1323940314);
                                        C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                                        InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                                        C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                                        LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                                        C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                                        InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                                        ComposeUiNode.f3726n.getClass();
                                        InterfaceC2041a<ComposeUiNode> interfaceC2041a6 = ComposeUiNode.Companion.f3728b;
                                        ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                                        if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                            C8573r0.m16771y0();
                                            throw null;
                                        }
                                        interfaceC0476a8.mo1640l();
                                        if (interfaceC0476a8.mo1632h()) {
                                            interfaceC0476a8.mo1634i(interfaceC2041a6);
                                        } else {
                                            interfaceC0476a8.mo1653s();
                                        }
                                        interfaceC0476a8.mo1644n();
                                        InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                                        C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                                        InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                                        C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                                        InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                                        C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                                        InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                                        C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                                        interfaceC0476a8.mo1626e();
                                        composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                                        interfaceC0476a8.mo1622c(2058660585);
                                        interfaceC0476a8.mo1622c(724544551);
                                        Context context3 = context;
                                        if (z20) {
                                            String string = context3.getString(R.string.upgrade_special_offer);
                                            C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                            String upperCase = string.toUpperCase(Locale.ROOT);
                                            context2 = context3;
                                            C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                            interfaceC2056p2 = interfaceC2056p6;
                                            c5304d1 = c5304d4;
                                            interfaceC2056p = interfaceC2056p4;
                                            interfaceC0476a3 = interfaceC0476a8;
                                            TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                                        } else {
                                            context2 = context3;
                                            interfaceC2056p = interfaceC2056p4;
                                            interfaceC2056p2 = interfaceC2056p6;
                                            c5304d1 = c5304d4;
                                            interfaceC0476a3 = interfaceC0476a8;
                                        }
                                        interfaceC0476a3.mo1661w();
                                        InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                                        C0438a.d dVar = C0438a.f2432d;
                                        C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                        InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                                        interfaceC0476a9.mo1622c(693286680);
                                        InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                                        interfaceC0476a9.mo1622c(-1323940314);
                                        InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                                        LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                                        C5304d1 c5304d5 = c5304d1;
                                        InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                                        ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                                        if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                            C8573r0.m16771y0();
                                            throw null;
                                        }
                                        interfaceC0476a9.mo1640l();
                                        if (interfaceC0476a9.mo1632h()) {
                                            interfaceC2041a5 = interfaceC2041a6;
                                            interfaceC0476a9.mo1634i(interfaceC2041a5);
                                        } else {
                                            interfaceC2041a5 = interfaceC2041a6;
                                            interfaceC0476a9.mo1653s();
                                        }
                                        interfaceC0476a9.mo1644n();
                                        C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                                        InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                                        C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                                        C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                                        InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                                        C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                                        interfaceC0476a9.mo1626e();
                                        composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                        interfaceC0476a9.mo1622c(2058660585);
                                        C6401a c6401a = C6401a.f36861a;
                                        if (z20 != 0) {
                                            interfaceC0476a9.mo1622c(-59272409);
                                            c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                            interfaceC0476a9.mo1661w();
                                        } else {
                                            interfaceC0476a9.mo1622c(-59272023);
                                            c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                            interfaceC0476a9.mo1661w();
                                        }
                                        C7218l c7218l = c7218lM14543a;
                                        if (r16 != 0 || z20) {
                                            interfaceC0476a9.mo1622c(-59271884);
                                            jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                            interfaceC0476a9.mo1661w();
                                        } else {
                                            interfaceC0476a9.mo1622c(-59271795);
                                            jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                            interfaceC0476a9.mo1661w();
                                        }
                                        InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                                        InterfaceC2041a<ComposeUiNode> interfaceC2041a7 = interfaceC2041a5;
                                        int i23 = i21;
                                        TextKt.m1576c(str13, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                                        interfaceC0476a9.mo1622c(724546263);
                                        String str15 = str9;
                                        if (str15.length() > 0) {
                                            String upperCase2 = str15.toUpperCase(Locale.ROOT);
                                            C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                            C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                            long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                            if (z20 != 0) {
                                                interfaceC0476a9.mo1622c(-59270956);
                                                interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                                interfaceC0476a9.mo1661w();
                                            } else {
                                                interfaceC0476a9.mo1622c(-59270264);
                                                interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                                interfaceC0476a9.mo1661w();
                                            }
                                            interfaceC0476a4 = interfaceC0476a9;
                                            str12 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                            TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                                        } else {
                                            interfaceC0476a4 = interfaceC0476a9;
                                            str12 = r7;
                                        }
                                        interfaceC0476a4.mo1661w();
                                        interfaceC0476a4.mo1661w();
                                        interfaceC0476a4.mo1663x();
                                        interfaceC0476a4.mo1661w();
                                        interfaceC0476a4.mo1661w();
                                        InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                                        if (r16 != 0) {
                                            interfaceC0476a5 = interfaceC0476a4;
                                            interfaceC0476a5.mo1622c(724548425);
                                            jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                            interfaceC0476a5.mo1661w();
                                        } else {
                                            interfaceC0476a5 = interfaceC0476a4;
                                            if (z20 != 0) {
                                                interfaceC0476a5.mo1622c(724548519);
                                                jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                                interfaceC0476a5.mo1661w();
                                            } else {
                                                interfaceC0476a5.mo1622c(724548598);
                                                jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                                interfaceC0476a5.mo1661w();
                                            }
                                        }
                                        DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                                        interfaceC0476a5.mo1622c(724548705);
                                        if (r16 != 0) {
                                            String string2 = context2.getString(R.string.upgrade_most_popular);
                                            C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                            String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                            C5207g.m11110e(upperCase3, str12);
                                            interfaceC0476a6 = interfaceC0476a5;
                                            TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                                        } else {
                                            interfaceC0476a6 = interfaceC0476a5;
                                        }
                                        interfaceC0476a6.mo1661w();
                                        InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                                        InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                                        interfaceC0476a10.mo1622c(693286680);
                                        InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                                        interfaceC0476a10.mo1622c(-1323940314);
                                        InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                                        LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                                        InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                                        ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                                        if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                            C8573r0.m16771y0();
                                            throw null;
                                        }
                                        interfaceC0476a10.mo1640l();
                                        if (interfaceC0476a10.mo1632h()) {
                                            interfaceC0476a10.mo1634i(interfaceC2041a7);
                                        } else {
                                            interfaceC0476a10.mo1653s();
                                        }
                                        interfaceC0476a10.mo1644n();
                                        C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                                        C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                                        C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                                        C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                                        interfaceC0476a10.mo1626e();
                                        composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                                        interfaceC0476a10.mo1622c(2058660585);
                                        C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                                        if (z20 != 0) {
                                            interfaceC0476a10.mo1622c(-59268257);
                                            jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                            interfaceC0476a10.mo1661w();
                                        } else {
                                            interfaceC0476a10.mo1622c(-59268159);
                                            jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                            interfaceC0476a10.mo1661w();
                                        }
                                        TextKt.m1576c(str14, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                                        interfaceC0476a10.mo1622c(724549877);
                                        String str16 = str11;
                                        if (str16.length() > 0) {
                                            C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                            if (z21) {
                                                interfaceC0476a10.mo1622c(-59267725);
                                                jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                                interfaceC0476a10.mo1661w();
                                            } else if (z20 != 0) {
                                                interfaceC0476a10.mo1622c(-59267615);
                                                jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                                interfaceC0476a10.mo1661w();
                                            } else {
                                                interfaceC0476a10.mo1622c(-59267510);
                                                jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                                interfaceC0476a10.mo1661w();
                                            }
                                            long j10 = jM5347f2;
                                            InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                            interfaceC0476a7 = interfaceC0476a10;
                                            TextKt.m1576c(str16, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                                        } else {
                                            interfaceC0476a7 = interfaceC0476a10;
                                        }
                                        interfaceC0476a7.mo1661w();
                                        interfaceC0476a7.mo1661w();
                                        interfaceC0476a7.mo1663x();
                                        interfaceC0476a7.mo1661w();
                                        interfaceC0476a7.mo1661w();
                                        interfaceC0476a7.mo1661w();
                                        interfaceC0476a7.mo1663x();
                                        interfaceC0476a7.mo1661w();
                                        interfaceC0476a7.mo1661w();
                                    }
                                    return C9072e.f47360a;
                                }
                            }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                            str10 = str7;
                            z16 = z14;
                            z17 = z15;
                            interfaceC2041a3 = interfaceC2041a4;
                        } else {
                            composerImplMo1636j.mo1650q();
                            interfaceC2041a3 = interfaceC2041a2;
                            str10 = str5;
                            str9 = str6;
                            z16 = z12;
                            z17 = z13;
                            composerImpl = composerImplMo1636j;
                        }
                        c5332q0M1612T = composerImpl.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                num.intValue();
                                UpgradeItemCardKt.m10411a(str, str2, str10, str9, z16, z17, interfaceC2041a3, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i12 |= 196608;
                    z13 = z11;
                    i19 = i11 & 64;
                    if (i19 != 0) {
                        i12 |= 1572864;
                        interfaceC2041a2 = interfaceC2041a;
                    } else {
                        interfaceC2041a2 = interfaceC2041a;
                        if ((i10 & 3670016) == 0) {
                            if (composerImplMo1636j.m1600H(interfaceC2041a2)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i12 |= i20;
                        }
                    }
                    i21 = i12;
                    if ((i21 & 2995931) == 599186) {
                        if (i22 != 0) {
                            str7 = "";
                        } else {
                            str7 = str5;
                        }
                        if (i13 != 0) {
                            str8 = "";
                        } else {
                            str8 = str6;
                        }
                        if (i15 != 0) {
                            z14 = false;
                        } else {
                            z14 = z12;
                        }
                        if (i17 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i19 != 0) {
                            interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                    return C9072e.f47360a;
                                }
                            };
                        }
                        InterfaceC2041a<C9072e> interfaceC2041a5 = interfaceC2041a2;
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                        final Context context2 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                        InterfaceC0500b interfaceC0500bM11157d1 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                        AbstractC10270a abstractC10270a2 = C7499b.m14916N(composerImplMo1636j).f9262d;
                        if (z14) {
                            composerImplMo1636j.mo1622c(1853269473);
                            c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                            composerImplMo1636j.m1609Q(false);
                        } else {
                            composerImplMo1636j.mo1622c(1853269535);
                            c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                            composerImplMo1636j.m1609Q(false);
                        }
                        str9 = str8;
                        final String str12 = str7;
                        final boolean z110 = z14;
                        final boolean z111 = z15;
                        composerImpl = composerImplMo1636j;
                        CardKt.m1558b(interfaceC2041a5, interfaceC0500bM11157d1, false, abstractC10270a2, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // cm.InterfaceC2057q
                            /* JADX INFO: renamed from: M */
                            public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                                long jM5363v;
                                Context context3;
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                                C5304d1 c5304d1;
                                InterfaceC0476a interfaceC0476a3;
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a6;
                                C7218l c7218lM14543a;
                                long jM11581a;
                                InterfaceC0476a interfaceC0476a4;
                                String str13;
                                InterfaceC0476a interfaceC0476a5;
                                long jM5347f;
                                InterfaceC0476a interfaceC0476a6;
                                long jM11582b;
                                InterfaceC0476a interfaceC0476a7;
                                long jM5347f2;
                                InterfaceC0500b interfaceC0500bM11156c0;
                                InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                                int iIntValue = num.intValue();
                                C5207g.m11111f(interfaceC9771b, "$this$Card");
                                if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                                    interfaceC0476a8.mo1650q();
                                } else {
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                                    InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                    boolean z20 = z111;
                                    boolean z21 = z110;
                                    if (z21) {
                                        interfaceC0476a8.mo1622c(1155538318);
                                        jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                        interfaceC0476a8.mo1661w();
                                    } else if (z20) {
                                        interfaceC0476a8.mo1622c(1155538428);
                                        jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                        interfaceC0476a8.mo1661w();
                                    } else {
                                        interfaceC0476a8.mo1622c(1155538516);
                                        jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                        interfaceC0476a8.mo1661w();
                                    }
                                    InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                                    String str14 = str;
                                    String str15 = str2;
                                    interfaceC0476a8.mo1622c(-483455358);
                                    C0438a.f fVar = C0438a.f2429a;
                                    InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                                    interfaceC0476a8.mo1622c(-1323940314);
                                    C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                                    InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                                    C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                                    LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                                    C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                                    InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                                    ComposeUiNode.f3726n.getClass();
                                    InterfaceC2041a<ComposeUiNode> interfaceC2041a7 = ComposeUiNode.Companion.f3728b;
                                    ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                                    if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a8.mo1640l();
                                    if (interfaceC0476a8.mo1632h()) {
                                        interfaceC0476a8.mo1634i(interfaceC2041a7);
                                    } else {
                                        interfaceC0476a8.mo1653s();
                                    }
                                    interfaceC0476a8.mo1644n();
                                    InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                                    InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                                    C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                                    interfaceC0476a8.mo1626e();
                                    composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                                    interfaceC0476a8.mo1622c(2058660585);
                                    interfaceC0476a8.mo1622c(724544551);
                                    Context context4 = context2;
                                    if (z20) {
                                        String string = context4.getString(R.string.upgrade_special_offer);
                                        C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                        String upperCase = string.toUpperCase(Locale.ROOT);
                                        context3 = context4;
                                        C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                        interfaceC2056p2 = interfaceC2056p6;
                                        c5304d1 = c5304d4;
                                        interfaceC2056p = interfaceC2056p4;
                                        interfaceC0476a3 = interfaceC0476a8;
                                        TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                                    } else {
                                        context3 = context4;
                                        interfaceC2056p = interfaceC2056p4;
                                        interfaceC2056p2 = interfaceC2056p6;
                                        c5304d1 = c5304d4;
                                        interfaceC0476a3 = interfaceC0476a8;
                                    }
                                    interfaceC0476a3.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                                    C0438a.d dVar = C0438a.f2432d;
                                    C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                    InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                                    interfaceC0476a9.mo1622c(693286680);
                                    InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                                    interfaceC0476a9.mo1622c(-1323940314);
                                    InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                                    LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                                    C5304d1 c5304d5 = c5304d1;
                                    InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                                    ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                                    if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a9.mo1640l();
                                    if (interfaceC0476a9.mo1632h()) {
                                        interfaceC2041a6 = interfaceC2041a7;
                                        interfaceC0476a9.mo1634i(interfaceC2041a6);
                                    } else {
                                        interfaceC2041a6 = interfaceC2041a7;
                                        interfaceC0476a9.mo1653s();
                                    }
                                    interfaceC0476a9.mo1644n();
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                                    C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                                    interfaceC0476a9.mo1626e();
                                    composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                    interfaceC0476a9.mo1622c(2058660585);
                                    C6401a c6401a = C6401a.f36861a;
                                    if (z20 != 0) {
                                        interfaceC0476a9.mo1622c(-59272409);
                                        c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59272023);
                                        c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                        interfaceC0476a9.mo1661w();
                                    }
                                    C7218l c7218l = c7218lM14543a;
                                    if (r16 != 0 || z20) {
                                        interfaceC0476a9.mo1622c(-59271884);
                                        jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59271795);
                                        jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                        interfaceC0476a9.mo1661w();
                                    }
                                    InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                                    InterfaceC2041a<ComposeUiNode> interfaceC2041a8 = interfaceC2041a6;
                                    int i23 = i21;
                                    TextKt.m1576c(str14, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                                    interfaceC0476a9.mo1622c(724546263);
                                    String str16 = str9;
                                    if (str16.length() > 0) {
                                        String upperCase2 = str16.toUpperCase(Locale.ROOT);
                                        C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                        C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                        long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                        if (z20 != 0) {
                                            interfaceC0476a9.mo1622c(-59270956);
                                            interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                            interfaceC0476a9.mo1661w();
                                        } else {
                                            interfaceC0476a9.mo1622c(-59270264);
                                            interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                            interfaceC0476a9.mo1661w();
                                        }
                                        interfaceC0476a4 = interfaceC0476a9;
                                        str13 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                        TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                                    } else {
                                        interfaceC0476a4 = interfaceC0476a9;
                                        str13 = r7;
                                    }
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1663x();
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                                    if (r16 != 0) {
                                        interfaceC0476a5 = interfaceC0476a4;
                                        interfaceC0476a5.mo1622c(724548425);
                                        jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                        interfaceC0476a5.mo1661w();
                                    } else {
                                        interfaceC0476a5 = interfaceC0476a4;
                                        if (z20 != 0) {
                                            interfaceC0476a5.mo1622c(724548519);
                                            jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                            interfaceC0476a5.mo1661w();
                                        } else {
                                            interfaceC0476a5.mo1622c(724548598);
                                            jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                            interfaceC0476a5.mo1661w();
                                        }
                                    }
                                    DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                                    interfaceC0476a5.mo1622c(724548705);
                                    if (r16 != 0) {
                                        String string2 = context3.getString(R.string.upgrade_most_popular);
                                        C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                        String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                        C5207g.m11110e(upperCase3, str13);
                                        interfaceC0476a6 = interfaceC0476a5;
                                        TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                                    } else {
                                        interfaceC0476a6 = interfaceC0476a5;
                                    }
                                    interfaceC0476a6.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                                    InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                                    interfaceC0476a10.mo1622c(693286680);
                                    InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                                    interfaceC0476a10.mo1622c(-1323940314);
                                    InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                                    LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                                    InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                                    ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                                    if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a10.mo1640l();
                                    if (interfaceC0476a10.mo1632h()) {
                                        interfaceC0476a10.mo1634i(interfaceC2041a8);
                                    } else {
                                        interfaceC0476a10.mo1653s();
                                    }
                                    interfaceC0476a10.mo1644n();
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                                    C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                                    interfaceC0476a10.mo1626e();
                                    composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                                    interfaceC0476a10.mo1622c(2058660585);
                                    C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                                    if (z20 != 0) {
                                        interfaceC0476a10.mo1622c(-59268257);
                                        jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                        interfaceC0476a10.mo1661w();
                                    } else {
                                        interfaceC0476a10.mo1622c(-59268159);
                                        jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                        interfaceC0476a10.mo1661w();
                                    }
                                    TextKt.m1576c(str15, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                                    interfaceC0476a10.mo1622c(724549877);
                                    String str17 = str12;
                                    if (str17.length() > 0) {
                                        C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                        if (z21) {
                                            interfaceC0476a10.mo1622c(-59267725);
                                            jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                            interfaceC0476a10.mo1661w();
                                        } else if (z20 != 0) {
                                            interfaceC0476a10.mo1622c(-59267615);
                                            jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                            interfaceC0476a10.mo1661w();
                                        } else {
                                            interfaceC0476a10.mo1622c(-59267510);
                                            jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                            interfaceC0476a10.mo1661w();
                                        }
                                        long j10 = jM5347f2;
                                        InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                        interfaceC0476a7 = interfaceC0476a10;
                                        TextKt.m1576c(str17, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                                    } else {
                                        interfaceC0476a7 = interfaceC0476a10;
                                    }
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1663x();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1663x();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                }
                                return C9072e.f47360a;
                            }
                        }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                        str10 = str7;
                        z16 = z14;
                        z17 = z15;
                        interfaceC2041a3 = interfaceC2041a5;
                    } else {
                        if (i22 != 0) {
                            str7 = "";
                        } else {
                            str7 = str5;
                        }
                        if (i13 != 0) {
                            str8 = "";
                        } else {
                            str8 = str6;
                        }
                        if (i15 != 0) {
                            z14 = false;
                        } else {
                            z14 = z12;
                        }
                        if (i17 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i19 != 0) {
                            interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                    return C9072e.f47360a;
                                }
                            };
                        }
                        InterfaceC2041a<C9072e> interfaceC2041a6 = interfaceC2041a2;
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                        final Context context3 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                        InterfaceC0500b interfaceC0500bM11157d2 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                        AbstractC10270a abstractC10270a3 = C7499b.m14916N(composerImplMo1636j).f9262d;
                        if (z14) {
                            composerImplMo1636j.mo1622c(1853269473);
                            c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                            composerImplMo1636j.m1609Q(false);
                        } else {
                            composerImplMo1636j.mo1622c(1853269535);
                            c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                            composerImplMo1636j.m1609Q(false);
                        }
                        str9 = str8;
                        final String str13 = str7;
                        final boolean z112 = z14;
                        final boolean z113 = z15;
                        composerImpl = composerImplMo1636j;
                        CardKt.m1558b(interfaceC2041a6, interfaceC0500bM11157d2, false, abstractC10270a3, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // cm.InterfaceC2057q
                            /* JADX INFO: renamed from: M */
                            public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                                long jM5363v;
                                Context context4;
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                                C5304d1 c5304d1;
                                InterfaceC0476a interfaceC0476a3;
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a7;
                                C7218l c7218lM14543a;
                                long jM11581a;
                                InterfaceC0476a interfaceC0476a4;
                                String str14;
                                InterfaceC0476a interfaceC0476a5;
                                long jM5347f;
                                InterfaceC0476a interfaceC0476a6;
                                long jM11582b;
                                InterfaceC0476a interfaceC0476a7;
                                long jM5347f2;
                                InterfaceC0500b interfaceC0500bM11156c0;
                                InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                                int iIntValue = num.intValue();
                                C5207g.m11111f(interfaceC9771b, "$this$Card");
                                if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                                    interfaceC0476a8.mo1650q();
                                } else {
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                                    InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                    boolean z20 = z113;
                                    boolean z21 = z112;
                                    if (z21) {
                                        interfaceC0476a8.mo1622c(1155538318);
                                        jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                        interfaceC0476a8.mo1661w();
                                    } else if (z20) {
                                        interfaceC0476a8.mo1622c(1155538428);
                                        jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                        interfaceC0476a8.mo1661w();
                                    } else {
                                        interfaceC0476a8.mo1622c(1155538516);
                                        jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                        interfaceC0476a8.mo1661w();
                                    }
                                    InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                                    String str15 = str;
                                    String str16 = str2;
                                    interfaceC0476a8.mo1622c(-483455358);
                                    C0438a.f fVar = C0438a.f2429a;
                                    InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                                    interfaceC0476a8.mo1622c(-1323940314);
                                    C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                                    InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                                    C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                                    LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                                    C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                                    InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                                    ComposeUiNode.f3726n.getClass();
                                    InterfaceC2041a<ComposeUiNode> interfaceC2041a8 = ComposeUiNode.Companion.f3728b;
                                    ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                                    if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a8.mo1640l();
                                    if (interfaceC0476a8.mo1632h()) {
                                        interfaceC0476a8.mo1634i(interfaceC2041a8);
                                    } else {
                                        interfaceC0476a8.mo1653s();
                                    }
                                    interfaceC0476a8.mo1644n();
                                    InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                                    InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                                    C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                                    interfaceC0476a8.mo1626e();
                                    composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                                    interfaceC0476a8.mo1622c(2058660585);
                                    interfaceC0476a8.mo1622c(724544551);
                                    Context context5 = context3;
                                    if (z20) {
                                        String string = context5.getString(R.string.upgrade_special_offer);
                                        C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                        String upperCase = string.toUpperCase(Locale.ROOT);
                                        context4 = context5;
                                        C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                        interfaceC2056p2 = interfaceC2056p6;
                                        c5304d1 = c5304d4;
                                        interfaceC2056p = interfaceC2056p4;
                                        interfaceC0476a3 = interfaceC0476a8;
                                        TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                                    } else {
                                        context4 = context5;
                                        interfaceC2056p = interfaceC2056p4;
                                        interfaceC2056p2 = interfaceC2056p6;
                                        c5304d1 = c5304d4;
                                        interfaceC0476a3 = interfaceC0476a8;
                                    }
                                    interfaceC0476a3.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                                    C0438a.d dVar = C0438a.f2432d;
                                    C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                    InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                                    interfaceC0476a9.mo1622c(693286680);
                                    InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                                    interfaceC0476a9.mo1622c(-1323940314);
                                    InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                                    LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                                    C5304d1 c5304d5 = c5304d1;
                                    InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                                    ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                                    if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a9.mo1640l();
                                    if (interfaceC0476a9.mo1632h()) {
                                        interfaceC2041a7 = interfaceC2041a8;
                                        interfaceC0476a9.mo1634i(interfaceC2041a7);
                                    } else {
                                        interfaceC2041a7 = interfaceC2041a8;
                                        interfaceC0476a9.mo1653s();
                                    }
                                    interfaceC0476a9.mo1644n();
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                                    C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                                    interfaceC0476a9.mo1626e();
                                    composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                    interfaceC0476a9.mo1622c(2058660585);
                                    C6401a c6401a = C6401a.f36861a;
                                    if (z20 != 0) {
                                        interfaceC0476a9.mo1622c(-59272409);
                                        c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59272023);
                                        c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                        interfaceC0476a9.mo1661w();
                                    }
                                    C7218l c7218l = c7218lM14543a;
                                    if (r16 != 0 || z20) {
                                        interfaceC0476a9.mo1622c(-59271884);
                                        jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59271795);
                                        jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                        interfaceC0476a9.mo1661w();
                                    }
                                    InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                                    InterfaceC2041a<ComposeUiNode> interfaceC2041a9 = interfaceC2041a7;
                                    int i23 = i21;
                                    TextKt.m1576c(str15, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                                    interfaceC0476a9.mo1622c(724546263);
                                    String str17 = str9;
                                    if (str17.length() > 0) {
                                        String upperCase2 = str17.toUpperCase(Locale.ROOT);
                                        C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                        C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                        long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                        if (z20 != 0) {
                                            interfaceC0476a9.mo1622c(-59270956);
                                            interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                            interfaceC0476a9.mo1661w();
                                        } else {
                                            interfaceC0476a9.mo1622c(-59270264);
                                            interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                            interfaceC0476a9.mo1661w();
                                        }
                                        interfaceC0476a4 = interfaceC0476a9;
                                        str14 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                        TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                                    } else {
                                        interfaceC0476a4 = interfaceC0476a9;
                                        str14 = r7;
                                    }
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1663x();
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                                    if (r16 != 0) {
                                        interfaceC0476a5 = interfaceC0476a4;
                                        interfaceC0476a5.mo1622c(724548425);
                                        jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                        interfaceC0476a5.mo1661w();
                                    } else {
                                        interfaceC0476a5 = interfaceC0476a4;
                                        if (z20 != 0) {
                                            interfaceC0476a5.mo1622c(724548519);
                                            jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                            interfaceC0476a5.mo1661w();
                                        } else {
                                            interfaceC0476a5.mo1622c(724548598);
                                            jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                            interfaceC0476a5.mo1661w();
                                        }
                                    }
                                    DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                                    interfaceC0476a5.mo1622c(724548705);
                                    if (r16 != 0) {
                                        String string2 = context4.getString(R.string.upgrade_most_popular);
                                        C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                        String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                        C5207g.m11110e(upperCase3, str14);
                                        interfaceC0476a6 = interfaceC0476a5;
                                        TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                                    } else {
                                        interfaceC0476a6 = interfaceC0476a5;
                                    }
                                    interfaceC0476a6.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                                    InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                                    interfaceC0476a10.mo1622c(693286680);
                                    InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                                    interfaceC0476a10.mo1622c(-1323940314);
                                    InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                                    LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                                    InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                                    ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                                    if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a10.mo1640l();
                                    if (interfaceC0476a10.mo1632h()) {
                                        interfaceC0476a10.mo1634i(interfaceC2041a9);
                                    } else {
                                        interfaceC0476a10.mo1653s();
                                    }
                                    interfaceC0476a10.mo1644n();
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                                    C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                                    interfaceC0476a10.mo1626e();
                                    composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                                    interfaceC0476a10.mo1622c(2058660585);
                                    C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                                    if (z20 != 0) {
                                        interfaceC0476a10.mo1622c(-59268257);
                                        jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                        interfaceC0476a10.mo1661w();
                                    } else {
                                        interfaceC0476a10.mo1622c(-59268159);
                                        jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                        interfaceC0476a10.mo1661w();
                                    }
                                    TextKt.m1576c(str16, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                                    interfaceC0476a10.mo1622c(724549877);
                                    String str18 = str13;
                                    if (str18.length() > 0) {
                                        C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                        if (z21) {
                                            interfaceC0476a10.mo1622c(-59267725);
                                            jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                            interfaceC0476a10.mo1661w();
                                        } else if (z20 != 0) {
                                            interfaceC0476a10.mo1622c(-59267615);
                                            jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                            interfaceC0476a10.mo1661w();
                                        } else {
                                            interfaceC0476a10.mo1622c(-59267510);
                                            jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                            interfaceC0476a10.mo1661w();
                                        }
                                        long j10 = jM5347f2;
                                        InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                        interfaceC0476a7 = interfaceC0476a10;
                                        TextKt.m1576c(str18, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                                    } else {
                                        interfaceC0476a7 = interfaceC0476a10;
                                    }
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1663x();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1663x();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                }
                                return C9072e.f47360a;
                            }
                        }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                        str10 = str7;
                        z16 = z14;
                        z17 = z15;
                        interfaceC2041a3 = interfaceC2041a6;
                    }
                    c5332q0M1612T = composerImpl.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            UpgradeItemCardKt.m10411a(str, str2, str10, str9, z16, z17, interfaceC2041a3, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i12 |= 24576;
                z12 = z10;
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((458752 & i10) == 0) {
                        z13 = z11;
                        if (composerImplMo1636j.m1598G(z13)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 64;
                    if (i19 != 0) {
                        i12 |= 1572864;
                        interfaceC2041a2 = interfaceC2041a;
                    } else {
                        interfaceC2041a2 = interfaceC2041a;
                        if ((i10 & 3670016) == 0) {
                            if (composerImplMo1636j.m1600H(interfaceC2041a2)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i12 |= i20;
                        }
                    }
                    i21 = i12;
                    if ((i21 & 2995931) == 599186) {
                        if (i22 != 0) {
                            str7 = "";
                        } else {
                            str7 = str5;
                        }
                        if (i13 != 0) {
                            str8 = "";
                        } else {
                            str8 = str6;
                        }
                        if (i15 != 0) {
                            z14 = false;
                        } else {
                            z14 = z12;
                        }
                        if (i17 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i19 != 0) {
                            interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                    return C9072e.f47360a;
                                }
                            };
                        }
                        InterfaceC2041a<C9072e> interfaceC2041a7 = interfaceC2041a2;
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                        final Context context4 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                        InterfaceC0500b interfaceC0500bM11157d3 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                        AbstractC10270a abstractC10270a4 = C7499b.m14916N(composerImplMo1636j).f9262d;
                        if (z14) {
                            composerImplMo1636j.mo1622c(1853269473);
                            c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                            composerImplMo1636j.m1609Q(false);
                        } else {
                            composerImplMo1636j.mo1622c(1853269535);
                            c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                            composerImplMo1636j.m1609Q(false);
                        }
                        str9 = str8;
                        final String str14 = str7;
                        final boolean z114 = z14;
                        final boolean z115 = z15;
                        composerImpl = composerImplMo1636j;
                        CardKt.m1558b(interfaceC2041a7, interfaceC0500bM11157d3, false, abstractC10270a4, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // cm.InterfaceC2057q
                            /* JADX INFO: renamed from: M */
                            public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                                long jM5363v;
                                Context context5;
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                                C5304d1 c5304d1;
                                InterfaceC0476a interfaceC0476a3;
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a8;
                                C7218l c7218lM14543a;
                                long jM11581a;
                                InterfaceC0476a interfaceC0476a4;
                                String str15;
                                InterfaceC0476a interfaceC0476a5;
                                long jM5347f;
                                InterfaceC0476a interfaceC0476a6;
                                long jM11582b;
                                InterfaceC0476a interfaceC0476a7;
                                long jM5347f2;
                                InterfaceC0500b interfaceC0500bM11156c0;
                                InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                                int iIntValue = num.intValue();
                                C5207g.m11111f(interfaceC9771b, "$this$Card");
                                if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                                    interfaceC0476a8.mo1650q();
                                } else {
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                                    InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                    boolean z20 = z115;
                                    boolean z21 = z114;
                                    if (z21) {
                                        interfaceC0476a8.mo1622c(1155538318);
                                        jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                        interfaceC0476a8.mo1661w();
                                    } else if (z20) {
                                        interfaceC0476a8.mo1622c(1155538428);
                                        jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                        interfaceC0476a8.mo1661w();
                                    } else {
                                        interfaceC0476a8.mo1622c(1155538516);
                                        jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                        interfaceC0476a8.mo1661w();
                                    }
                                    InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                                    String str16 = str;
                                    String str17 = str2;
                                    interfaceC0476a8.mo1622c(-483455358);
                                    C0438a.f fVar = C0438a.f2429a;
                                    InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                                    interfaceC0476a8.mo1622c(-1323940314);
                                    C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                                    InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                                    C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                                    LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                                    C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                                    InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                                    ComposeUiNode.f3726n.getClass();
                                    InterfaceC2041a<ComposeUiNode> interfaceC2041a9 = ComposeUiNode.Companion.f3728b;
                                    ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                                    if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a8.mo1640l();
                                    if (interfaceC0476a8.mo1632h()) {
                                        interfaceC0476a8.mo1634i(interfaceC2041a9);
                                    } else {
                                        interfaceC0476a8.mo1653s();
                                    }
                                    interfaceC0476a8.mo1644n();
                                    InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                                    InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                                    C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                                    interfaceC0476a8.mo1626e();
                                    composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                                    interfaceC0476a8.mo1622c(2058660585);
                                    interfaceC0476a8.mo1622c(724544551);
                                    Context context6 = context4;
                                    if (z20) {
                                        String string = context6.getString(R.string.upgrade_special_offer);
                                        C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                        String upperCase = string.toUpperCase(Locale.ROOT);
                                        context5 = context6;
                                        C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                        interfaceC2056p2 = interfaceC2056p6;
                                        c5304d1 = c5304d4;
                                        interfaceC2056p = interfaceC2056p4;
                                        interfaceC0476a3 = interfaceC0476a8;
                                        TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                                    } else {
                                        context5 = context6;
                                        interfaceC2056p = interfaceC2056p4;
                                        interfaceC2056p2 = interfaceC2056p6;
                                        c5304d1 = c5304d4;
                                        interfaceC0476a3 = interfaceC0476a8;
                                    }
                                    interfaceC0476a3.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                                    C0438a.d dVar = C0438a.f2432d;
                                    C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                    InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                                    interfaceC0476a9.mo1622c(693286680);
                                    InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                                    interfaceC0476a9.mo1622c(-1323940314);
                                    InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                                    LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                                    C5304d1 c5304d5 = c5304d1;
                                    InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                                    ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                                    if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a9.mo1640l();
                                    if (interfaceC0476a9.mo1632h()) {
                                        interfaceC2041a8 = interfaceC2041a9;
                                        interfaceC0476a9.mo1634i(interfaceC2041a8);
                                    } else {
                                        interfaceC2041a8 = interfaceC2041a9;
                                        interfaceC0476a9.mo1653s();
                                    }
                                    interfaceC0476a9.mo1644n();
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                                    C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                                    interfaceC0476a9.mo1626e();
                                    composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                    interfaceC0476a9.mo1622c(2058660585);
                                    C6401a c6401a = C6401a.f36861a;
                                    if (z20 != 0) {
                                        interfaceC0476a9.mo1622c(-59272409);
                                        c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59272023);
                                        c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                        interfaceC0476a9.mo1661w();
                                    }
                                    C7218l c7218l = c7218lM14543a;
                                    if (r16 != 0 || z20) {
                                        interfaceC0476a9.mo1622c(-59271884);
                                        jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59271795);
                                        jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                        interfaceC0476a9.mo1661w();
                                    }
                                    InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                                    InterfaceC2041a<ComposeUiNode> interfaceC2041a10 = interfaceC2041a8;
                                    int i23 = i21;
                                    TextKt.m1576c(str16, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                                    interfaceC0476a9.mo1622c(724546263);
                                    String str18 = str9;
                                    if (str18.length() > 0) {
                                        String upperCase2 = str18.toUpperCase(Locale.ROOT);
                                        C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                        C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                        long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                        if (z20 != 0) {
                                            interfaceC0476a9.mo1622c(-59270956);
                                            interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                            interfaceC0476a9.mo1661w();
                                        } else {
                                            interfaceC0476a9.mo1622c(-59270264);
                                            interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                            interfaceC0476a9.mo1661w();
                                        }
                                        interfaceC0476a4 = interfaceC0476a9;
                                        str15 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                        TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                                    } else {
                                        interfaceC0476a4 = interfaceC0476a9;
                                        str15 = r7;
                                    }
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1663x();
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                                    if (r16 != 0) {
                                        interfaceC0476a5 = interfaceC0476a4;
                                        interfaceC0476a5.mo1622c(724548425);
                                        jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                        interfaceC0476a5.mo1661w();
                                    } else {
                                        interfaceC0476a5 = interfaceC0476a4;
                                        if (z20 != 0) {
                                            interfaceC0476a5.mo1622c(724548519);
                                            jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                            interfaceC0476a5.mo1661w();
                                        } else {
                                            interfaceC0476a5.mo1622c(724548598);
                                            jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                            interfaceC0476a5.mo1661w();
                                        }
                                    }
                                    DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                                    interfaceC0476a5.mo1622c(724548705);
                                    if (r16 != 0) {
                                        String string2 = context5.getString(R.string.upgrade_most_popular);
                                        C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                        String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                        C5207g.m11110e(upperCase3, str15);
                                        interfaceC0476a6 = interfaceC0476a5;
                                        TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                                    } else {
                                        interfaceC0476a6 = interfaceC0476a5;
                                    }
                                    interfaceC0476a6.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                                    InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                                    interfaceC0476a10.mo1622c(693286680);
                                    InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                                    interfaceC0476a10.mo1622c(-1323940314);
                                    InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                                    LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                                    InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                                    ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                                    if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a10.mo1640l();
                                    if (interfaceC0476a10.mo1632h()) {
                                        interfaceC0476a10.mo1634i(interfaceC2041a10);
                                    } else {
                                        interfaceC0476a10.mo1653s();
                                    }
                                    interfaceC0476a10.mo1644n();
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                                    C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                                    interfaceC0476a10.mo1626e();
                                    composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                                    interfaceC0476a10.mo1622c(2058660585);
                                    C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                                    if (z20 != 0) {
                                        interfaceC0476a10.mo1622c(-59268257);
                                        jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                        interfaceC0476a10.mo1661w();
                                    } else {
                                        interfaceC0476a10.mo1622c(-59268159);
                                        jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                        interfaceC0476a10.mo1661w();
                                    }
                                    TextKt.m1576c(str17, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                                    interfaceC0476a10.mo1622c(724549877);
                                    String str19 = str14;
                                    if (str19.length() > 0) {
                                        C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                        if (z21) {
                                            interfaceC0476a10.mo1622c(-59267725);
                                            jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                            interfaceC0476a10.mo1661w();
                                        } else if (z20 != 0) {
                                            interfaceC0476a10.mo1622c(-59267615);
                                            jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                            interfaceC0476a10.mo1661w();
                                        } else {
                                            interfaceC0476a10.mo1622c(-59267510);
                                            jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                            interfaceC0476a10.mo1661w();
                                        }
                                        long j10 = jM5347f2;
                                        InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                        interfaceC0476a7 = interfaceC0476a10;
                                        TextKt.m1576c(str19, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                                    } else {
                                        interfaceC0476a7 = interfaceC0476a10;
                                    }
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1663x();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1663x();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                }
                                return C9072e.f47360a;
                            }
                        }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                        str10 = str7;
                        z16 = z14;
                        z17 = z15;
                        interfaceC2041a3 = interfaceC2041a7;
                    } else {
                        if (i22 != 0) {
                            str7 = "";
                        } else {
                            str7 = str5;
                        }
                        if (i13 != 0) {
                            str8 = "";
                        } else {
                            str8 = str6;
                        }
                        if (i15 != 0) {
                            z14 = false;
                        } else {
                            z14 = z12;
                        }
                        if (i17 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i19 != 0) {
                            interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                    return C9072e.f47360a;
                                }
                            };
                        }
                        InterfaceC2041a<C9072e> interfaceC2041a8 = interfaceC2041a2;
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                        final Context context5 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                        InterfaceC0500b interfaceC0500bM11157d4 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                        AbstractC10270a abstractC10270a5 = C7499b.m14916N(composerImplMo1636j).f9262d;
                        if (z14) {
                            composerImplMo1636j.mo1622c(1853269473);
                            c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                            composerImplMo1636j.m1609Q(false);
                        } else {
                            composerImplMo1636j.mo1622c(1853269535);
                            c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                            composerImplMo1636j.m1609Q(false);
                        }
                        str9 = str8;
                        final String str15 = str7;
                        final boolean z116 = z14;
                        final boolean z117 = z15;
                        composerImpl = composerImplMo1636j;
                        CardKt.m1558b(interfaceC2041a8, interfaceC0500bM11157d4, false, abstractC10270a5, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // cm.InterfaceC2057q
                            /* JADX INFO: renamed from: M */
                            public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                                long jM5363v;
                                Context context6;
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                                C5304d1 c5304d1;
                                InterfaceC0476a interfaceC0476a3;
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a9;
                                C7218l c7218lM14543a;
                                long jM11581a;
                                InterfaceC0476a interfaceC0476a4;
                                String str16;
                                InterfaceC0476a interfaceC0476a5;
                                long jM5347f;
                                InterfaceC0476a interfaceC0476a6;
                                long jM11582b;
                                InterfaceC0476a interfaceC0476a7;
                                long jM5347f2;
                                InterfaceC0500b interfaceC0500bM11156c0;
                                InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                                int iIntValue = num.intValue();
                                C5207g.m11111f(interfaceC9771b, "$this$Card");
                                if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                                    interfaceC0476a8.mo1650q();
                                } else {
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                                    InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                    boolean z20 = z117;
                                    boolean z21 = z116;
                                    if (z21) {
                                        interfaceC0476a8.mo1622c(1155538318);
                                        jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                        interfaceC0476a8.mo1661w();
                                    } else if (z20) {
                                        interfaceC0476a8.mo1622c(1155538428);
                                        jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                        interfaceC0476a8.mo1661w();
                                    } else {
                                        interfaceC0476a8.mo1622c(1155538516);
                                        jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                        interfaceC0476a8.mo1661w();
                                    }
                                    InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                                    String str17 = str;
                                    String str18 = str2;
                                    interfaceC0476a8.mo1622c(-483455358);
                                    C0438a.f fVar = C0438a.f2429a;
                                    InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                                    interfaceC0476a8.mo1622c(-1323940314);
                                    C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                                    InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                                    C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                                    LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                                    C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                                    InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                                    ComposeUiNode.f3726n.getClass();
                                    InterfaceC2041a<ComposeUiNode> interfaceC2041a10 = ComposeUiNode.Companion.f3728b;
                                    ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                                    if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a8.mo1640l();
                                    if (interfaceC0476a8.mo1632h()) {
                                        interfaceC0476a8.mo1634i(interfaceC2041a10);
                                    } else {
                                        interfaceC0476a8.mo1653s();
                                    }
                                    interfaceC0476a8.mo1644n();
                                    InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                                    InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                                    C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                                    interfaceC0476a8.mo1626e();
                                    composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                                    interfaceC0476a8.mo1622c(2058660585);
                                    interfaceC0476a8.mo1622c(724544551);
                                    Context context7 = context5;
                                    if (z20) {
                                        String string = context7.getString(R.string.upgrade_special_offer);
                                        C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                        String upperCase = string.toUpperCase(Locale.ROOT);
                                        context6 = context7;
                                        C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                        interfaceC2056p2 = interfaceC2056p6;
                                        c5304d1 = c5304d4;
                                        interfaceC2056p = interfaceC2056p4;
                                        interfaceC0476a3 = interfaceC0476a8;
                                        TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                                    } else {
                                        context6 = context7;
                                        interfaceC2056p = interfaceC2056p4;
                                        interfaceC2056p2 = interfaceC2056p6;
                                        c5304d1 = c5304d4;
                                        interfaceC0476a3 = interfaceC0476a8;
                                    }
                                    interfaceC0476a3.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                                    C0438a.d dVar = C0438a.f2432d;
                                    C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                    InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                                    interfaceC0476a9.mo1622c(693286680);
                                    InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                                    interfaceC0476a9.mo1622c(-1323940314);
                                    InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                                    LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                                    C5304d1 c5304d5 = c5304d1;
                                    InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                                    ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                                    if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a9.mo1640l();
                                    if (interfaceC0476a9.mo1632h()) {
                                        interfaceC2041a9 = interfaceC2041a10;
                                        interfaceC0476a9.mo1634i(interfaceC2041a9);
                                    } else {
                                        interfaceC2041a9 = interfaceC2041a10;
                                        interfaceC0476a9.mo1653s();
                                    }
                                    interfaceC0476a9.mo1644n();
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                                    C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                                    interfaceC0476a9.mo1626e();
                                    composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                    interfaceC0476a9.mo1622c(2058660585);
                                    C6401a c6401a = C6401a.f36861a;
                                    if (z20 != 0) {
                                        interfaceC0476a9.mo1622c(-59272409);
                                        c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59272023);
                                        c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                        interfaceC0476a9.mo1661w();
                                    }
                                    C7218l c7218l = c7218lM14543a;
                                    if (r16 != 0 || z20) {
                                        interfaceC0476a9.mo1622c(-59271884);
                                        jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59271795);
                                        jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                        interfaceC0476a9.mo1661w();
                                    }
                                    InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                                    InterfaceC2041a<ComposeUiNode> interfaceC2041a11 = interfaceC2041a9;
                                    int i23 = i21;
                                    TextKt.m1576c(str17, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                                    interfaceC0476a9.mo1622c(724546263);
                                    String str19 = str9;
                                    if (str19.length() > 0) {
                                        String upperCase2 = str19.toUpperCase(Locale.ROOT);
                                        C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                        C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                        long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                        if (z20 != 0) {
                                            interfaceC0476a9.mo1622c(-59270956);
                                            interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                            interfaceC0476a9.mo1661w();
                                        } else {
                                            interfaceC0476a9.mo1622c(-59270264);
                                            interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                            interfaceC0476a9.mo1661w();
                                        }
                                        interfaceC0476a4 = interfaceC0476a9;
                                        str16 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                        TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                                    } else {
                                        interfaceC0476a4 = interfaceC0476a9;
                                        str16 = r7;
                                    }
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1663x();
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                                    if (r16 != 0) {
                                        interfaceC0476a5 = interfaceC0476a4;
                                        interfaceC0476a5.mo1622c(724548425);
                                        jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                        interfaceC0476a5.mo1661w();
                                    } else {
                                        interfaceC0476a5 = interfaceC0476a4;
                                        if (z20 != 0) {
                                            interfaceC0476a5.mo1622c(724548519);
                                            jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                            interfaceC0476a5.mo1661w();
                                        } else {
                                            interfaceC0476a5.mo1622c(724548598);
                                            jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                            interfaceC0476a5.mo1661w();
                                        }
                                    }
                                    DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                                    interfaceC0476a5.mo1622c(724548705);
                                    if (r16 != 0) {
                                        String string2 = context6.getString(R.string.upgrade_most_popular);
                                        C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                        String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                        C5207g.m11110e(upperCase3, str16);
                                        interfaceC0476a6 = interfaceC0476a5;
                                        TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                                    } else {
                                        interfaceC0476a6 = interfaceC0476a5;
                                    }
                                    interfaceC0476a6.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                                    InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                                    interfaceC0476a10.mo1622c(693286680);
                                    InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                                    interfaceC0476a10.mo1622c(-1323940314);
                                    InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                                    LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                                    InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                                    ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                                    if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a10.mo1640l();
                                    if (interfaceC0476a10.mo1632h()) {
                                        interfaceC0476a10.mo1634i(interfaceC2041a11);
                                    } else {
                                        interfaceC0476a10.mo1653s();
                                    }
                                    interfaceC0476a10.mo1644n();
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                                    C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                                    interfaceC0476a10.mo1626e();
                                    composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                                    interfaceC0476a10.mo1622c(2058660585);
                                    C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                                    if (z20 != 0) {
                                        interfaceC0476a10.mo1622c(-59268257);
                                        jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                        interfaceC0476a10.mo1661w();
                                    } else {
                                        interfaceC0476a10.mo1622c(-59268159);
                                        jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                        interfaceC0476a10.mo1661w();
                                    }
                                    TextKt.m1576c(str18, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                                    interfaceC0476a10.mo1622c(724549877);
                                    String str110 = str15;
                                    if (str110.length() > 0) {
                                        C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                        if (z21) {
                                            interfaceC0476a10.mo1622c(-59267725);
                                            jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                            interfaceC0476a10.mo1661w();
                                        } else if (z20 != 0) {
                                            interfaceC0476a10.mo1622c(-59267615);
                                            jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                            interfaceC0476a10.mo1661w();
                                        } else {
                                            interfaceC0476a10.mo1622c(-59267510);
                                            jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                            interfaceC0476a10.mo1661w();
                                        }
                                        long j10 = jM5347f2;
                                        InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                        interfaceC0476a7 = interfaceC0476a10;
                                        TextKt.m1576c(str110, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                                    } else {
                                        interfaceC0476a7 = interfaceC0476a10;
                                    }
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1663x();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1663x();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                }
                                return C9072e.f47360a;
                            }
                        }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                        str10 = str7;
                        z16 = z14;
                        z17 = z15;
                        interfaceC2041a3 = interfaceC2041a8;
                    }
                    c5332q0M1612T = composerImpl.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            UpgradeItemCardKt.m10411a(str, str2, str10, str9, z16, z17, interfaceC2041a3, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i12 |= 196608;
                z13 = z11;
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                    interfaceC2041a2 = interfaceC2041a;
                } else {
                    interfaceC2041a2 = interfaceC2041a;
                    if ((i10 & 3670016) == 0) {
                        if (composerImplMo1636j.m1600H(interfaceC2041a2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                }
                i21 = i12;
                if ((i21 & 2995931) == 599186) {
                    if (i22 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i13 != 0) {
                        str8 = "";
                    } else {
                        str8 = str6;
                    }
                    if (i15 != 0) {
                        z14 = false;
                    } else {
                        z14 = z12;
                    }
                    if (i17 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i19 != 0) {
                        interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        };
                    }
                    InterfaceC2041a<C9072e> interfaceC2041a9 = interfaceC2041a2;
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                    final Context context6 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                    InterfaceC0500b interfaceC0500bM11157d5 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                    AbstractC10270a abstractC10270a6 = C7499b.m14916N(composerImplMo1636j).f9262d;
                    if (z14) {
                        composerImplMo1636j.mo1622c(1853269473);
                        c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    } else {
                        composerImplMo1636j.mo1622c(1853269535);
                        c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    }
                    str9 = str8;
                    final String str16 = str7;
                    final boolean z118 = z14;
                    final boolean z119 = z15;
                    composerImpl = composerImplMo1636j;
                    CardKt.m1558b(interfaceC2041a9, interfaceC0500bM11157d5, false, abstractC10270a6, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // cm.InterfaceC2057q
                        /* JADX INFO: renamed from: M */
                        public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                            long jM5363v;
                            Context context7;
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                            C5304d1 c5304d1;
                            InterfaceC0476a interfaceC0476a3;
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a10;
                            C7218l c7218lM14543a;
                            long jM11581a;
                            InterfaceC0476a interfaceC0476a4;
                            String str17;
                            InterfaceC0476a interfaceC0476a5;
                            long jM5347f;
                            InterfaceC0476a interfaceC0476a6;
                            long jM11582b;
                            InterfaceC0476a interfaceC0476a7;
                            long jM5347f2;
                            InterfaceC0500b interfaceC0500bM11156c0;
                            InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                            int iIntValue = num.intValue();
                            C5207g.m11111f(interfaceC9771b, "$this$Card");
                            if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                                interfaceC0476a8.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                                InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                boolean z20 = z119;
                                boolean z21 = z118;
                                if (z21) {
                                    interfaceC0476a8.mo1622c(1155538318);
                                    jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                    interfaceC0476a8.mo1661w();
                                } else if (z20) {
                                    interfaceC0476a8.mo1622c(1155538428);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                    interfaceC0476a8.mo1661w();
                                } else {
                                    interfaceC0476a8.mo1622c(1155538516);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                    interfaceC0476a8.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                                String str18 = str;
                                String str19 = str2;
                                interfaceC0476a8.mo1622c(-483455358);
                                C0438a.f fVar = C0438a.f2429a;
                                InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                                interfaceC0476a8.mo1622c(-1323940314);
                                C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                                InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                                C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                                LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                                C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                                InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                                ComposeUiNode.f3726n.getClass();
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a11 = ComposeUiNode.Companion.f3728b;
                                ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                                if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a8.mo1640l();
                                if (interfaceC0476a8.mo1632h()) {
                                    interfaceC0476a8.mo1634i(interfaceC2041a11);
                                } else {
                                    interfaceC0476a8.mo1653s();
                                }
                                interfaceC0476a8.mo1644n();
                                InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                                InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                                C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                                interfaceC0476a8.mo1626e();
                                composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                                interfaceC0476a8.mo1622c(2058660585);
                                interfaceC0476a8.mo1622c(724544551);
                                Context context8 = context6;
                                if (z20) {
                                    String string = context8.getString(R.string.upgrade_special_offer);
                                    C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                    String upperCase = string.toUpperCase(Locale.ROOT);
                                    context7 = context8;
                                    C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                    TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                                } else {
                                    context7 = context8;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                }
                                interfaceC0476a3.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                                C0438a.d dVar = C0438a.f2432d;
                                C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                                interfaceC0476a9.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                                interfaceC0476a9.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                                LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                                C5304d1 c5304d5 = c5304d1;
                                InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                                if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a9.mo1640l();
                                if (interfaceC0476a9.mo1632h()) {
                                    interfaceC2041a10 = interfaceC2041a11;
                                    interfaceC0476a9.mo1634i(interfaceC2041a10);
                                } else {
                                    interfaceC2041a10 = interfaceC2041a11;
                                    interfaceC0476a9.mo1653s();
                                }
                                interfaceC0476a9.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                                interfaceC0476a9.mo1626e();
                                composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                interfaceC0476a9.mo1622c(2058660585);
                                C6401a c6401a = C6401a.f36861a;
                                if (z20 != 0) {
                                    interfaceC0476a9.mo1622c(-59272409);
                                    c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59272023);
                                    c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                    interfaceC0476a9.mo1661w();
                                }
                                C7218l c7218l = c7218lM14543a;
                                if (r16 != 0 || z20) {
                                    interfaceC0476a9.mo1622c(-59271884);
                                    jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59271795);
                                    jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                    interfaceC0476a9.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a12 = interfaceC2041a10;
                                int i23 = i21;
                                TextKt.m1576c(str18, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                                interfaceC0476a9.mo1622c(724546263);
                                String str110 = str9;
                                if (str110.length() > 0) {
                                    String upperCase2 = str110.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    if (z20 != 0) {
                                        interfaceC0476a9.mo1622c(-59270956);
                                        interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59270264);
                                        interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                        interfaceC0476a9.mo1661w();
                                    }
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str17 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                    TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                                } else {
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str17 = r7;
                                }
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1663x();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                                if (r16 != 0) {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    interfaceC0476a5.mo1622c(724548425);
                                    jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                    interfaceC0476a5.mo1661w();
                                } else {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    if (z20 != 0) {
                                        interfaceC0476a5.mo1622c(724548519);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                        interfaceC0476a5.mo1661w();
                                    } else {
                                        interfaceC0476a5.mo1622c(724548598);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                        interfaceC0476a5.mo1661w();
                                    }
                                }
                                DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                                interfaceC0476a5.mo1622c(724548705);
                                if (r16 != 0) {
                                    String string2 = context7.getString(R.string.upgrade_most_popular);
                                    C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                    String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase3, str17);
                                    interfaceC0476a6 = interfaceC0476a5;
                                    TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                                } else {
                                    interfaceC0476a6 = interfaceC0476a5;
                                }
                                interfaceC0476a6.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                                InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                                interfaceC0476a10.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                                interfaceC0476a10.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                                LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                                InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                                if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a10.mo1640l();
                                if (interfaceC0476a10.mo1632h()) {
                                    interfaceC0476a10.mo1634i(interfaceC2041a12);
                                } else {
                                    interfaceC0476a10.mo1653s();
                                }
                                interfaceC0476a10.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                                interfaceC0476a10.mo1626e();
                                composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                                interfaceC0476a10.mo1622c(2058660585);
                                C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                                if (z20 != 0) {
                                    interfaceC0476a10.mo1622c(-59268257);
                                    jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                    interfaceC0476a10.mo1661w();
                                } else {
                                    interfaceC0476a10.mo1622c(-59268159);
                                    jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                    interfaceC0476a10.mo1661w();
                                }
                                TextKt.m1576c(str19, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                                interfaceC0476a10.mo1622c(724549877);
                                String str111 = str16;
                                if (str111.length() > 0) {
                                    C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                    if (z21) {
                                        interfaceC0476a10.mo1622c(-59267725);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                        interfaceC0476a10.mo1661w();
                                    } else if (z20 != 0) {
                                        interfaceC0476a10.mo1622c(-59267615);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                        interfaceC0476a10.mo1661w();
                                    } else {
                                        interfaceC0476a10.mo1622c(-59267510);
                                        jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                        interfaceC0476a10.mo1661w();
                                    }
                                    long j10 = jM5347f2;
                                    InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                    interfaceC0476a7 = interfaceC0476a10;
                                    TextKt.m1576c(str111, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                                } else {
                                    interfaceC0476a7 = interfaceC0476a10;
                                }
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                    str10 = str7;
                    z16 = z14;
                    z17 = z15;
                    interfaceC2041a3 = interfaceC2041a9;
                } else {
                    if (i22 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i13 != 0) {
                        str8 = "";
                    } else {
                        str8 = str6;
                    }
                    if (i15 != 0) {
                        z14 = false;
                    } else {
                        z14 = z12;
                    }
                    if (i17 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i19 != 0) {
                        interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        };
                    }
                    InterfaceC2041a<C9072e> interfaceC2041a10 = interfaceC2041a2;
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                    final Context context7 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                    InterfaceC0500b interfaceC0500bM11157d6 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                    AbstractC10270a abstractC10270a7 = C7499b.m14916N(composerImplMo1636j).f9262d;
                    if (z14) {
                        composerImplMo1636j.mo1622c(1853269473);
                        c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    } else {
                        composerImplMo1636j.mo1622c(1853269535);
                        c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    }
                    str9 = str8;
                    final String str17 = str7;
                    final boolean z1110 = z14;
                    final boolean z1111 = z15;
                    composerImpl = composerImplMo1636j;
                    CardKt.m1558b(interfaceC2041a10, interfaceC0500bM11157d6, false, abstractC10270a7, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // cm.InterfaceC2057q
                        /* JADX INFO: renamed from: M */
                        public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                            long jM5363v;
                            Context context8;
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                            C5304d1 c5304d1;
                            InterfaceC0476a interfaceC0476a3;
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a11;
                            C7218l c7218lM14543a;
                            long jM11581a;
                            InterfaceC0476a interfaceC0476a4;
                            String str18;
                            InterfaceC0476a interfaceC0476a5;
                            long jM5347f;
                            InterfaceC0476a interfaceC0476a6;
                            long jM11582b;
                            InterfaceC0476a interfaceC0476a7;
                            long jM5347f2;
                            InterfaceC0500b interfaceC0500bM11156c0;
                            InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                            int iIntValue = num.intValue();
                            C5207g.m11111f(interfaceC9771b, "$this$Card");
                            if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                                interfaceC0476a8.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                                InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                boolean z20 = z1111;
                                boolean z21 = z1110;
                                if (z21) {
                                    interfaceC0476a8.mo1622c(1155538318);
                                    jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                    interfaceC0476a8.mo1661w();
                                } else if (z20) {
                                    interfaceC0476a8.mo1622c(1155538428);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                    interfaceC0476a8.mo1661w();
                                } else {
                                    interfaceC0476a8.mo1622c(1155538516);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                    interfaceC0476a8.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                                String str19 = str;
                                String str110 = str2;
                                interfaceC0476a8.mo1622c(-483455358);
                                C0438a.f fVar = C0438a.f2429a;
                                InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                                interfaceC0476a8.mo1622c(-1323940314);
                                C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                                InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                                C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                                LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                                C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                                InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                                ComposeUiNode.f3726n.getClass();
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a12 = ComposeUiNode.Companion.f3728b;
                                ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                                if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a8.mo1640l();
                                if (interfaceC0476a8.mo1632h()) {
                                    interfaceC0476a8.mo1634i(interfaceC2041a12);
                                } else {
                                    interfaceC0476a8.mo1653s();
                                }
                                interfaceC0476a8.mo1644n();
                                InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                                InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                                C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                                interfaceC0476a8.mo1626e();
                                composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                                interfaceC0476a8.mo1622c(2058660585);
                                interfaceC0476a8.mo1622c(724544551);
                                Context context9 = context7;
                                if (z20) {
                                    String string = context9.getString(R.string.upgrade_special_offer);
                                    C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                    String upperCase = string.toUpperCase(Locale.ROOT);
                                    context8 = context9;
                                    C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                    TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                                } else {
                                    context8 = context9;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                }
                                interfaceC0476a3.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                                C0438a.d dVar = C0438a.f2432d;
                                C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                                interfaceC0476a9.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                                interfaceC0476a9.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                                LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                                C5304d1 c5304d5 = c5304d1;
                                InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                                if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a9.mo1640l();
                                if (interfaceC0476a9.mo1632h()) {
                                    interfaceC2041a11 = interfaceC2041a12;
                                    interfaceC0476a9.mo1634i(interfaceC2041a11);
                                } else {
                                    interfaceC2041a11 = interfaceC2041a12;
                                    interfaceC0476a9.mo1653s();
                                }
                                interfaceC0476a9.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                                interfaceC0476a9.mo1626e();
                                composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                interfaceC0476a9.mo1622c(2058660585);
                                C6401a c6401a = C6401a.f36861a;
                                if (z20 != 0) {
                                    interfaceC0476a9.mo1622c(-59272409);
                                    c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59272023);
                                    c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                    interfaceC0476a9.mo1661w();
                                }
                                C7218l c7218l = c7218lM14543a;
                                if (r16 != 0 || z20) {
                                    interfaceC0476a9.mo1622c(-59271884);
                                    jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59271795);
                                    jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                    interfaceC0476a9.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a13 = interfaceC2041a11;
                                int i23 = i21;
                                TextKt.m1576c(str19, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                                interfaceC0476a9.mo1622c(724546263);
                                String str111 = str9;
                                if (str111.length() > 0) {
                                    String upperCase2 = str111.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    if (z20 != 0) {
                                        interfaceC0476a9.mo1622c(-59270956);
                                        interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59270264);
                                        interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                        interfaceC0476a9.mo1661w();
                                    }
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str18 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                    TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                                } else {
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str18 = r7;
                                }
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1663x();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                                if (r16 != 0) {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    interfaceC0476a5.mo1622c(724548425);
                                    jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                    interfaceC0476a5.mo1661w();
                                } else {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    if (z20 != 0) {
                                        interfaceC0476a5.mo1622c(724548519);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                        interfaceC0476a5.mo1661w();
                                    } else {
                                        interfaceC0476a5.mo1622c(724548598);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                        interfaceC0476a5.mo1661w();
                                    }
                                }
                                DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                                interfaceC0476a5.mo1622c(724548705);
                                if (r16 != 0) {
                                    String string2 = context8.getString(R.string.upgrade_most_popular);
                                    C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                    String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase3, str18);
                                    interfaceC0476a6 = interfaceC0476a5;
                                    TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                                } else {
                                    interfaceC0476a6 = interfaceC0476a5;
                                }
                                interfaceC0476a6.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                                InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                                interfaceC0476a10.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                                interfaceC0476a10.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                                LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                                InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                                if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a10.mo1640l();
                                if (interfaceC0476a10.mo1632h()) {
                                    interfaceC0476a10.mo1634i(interfaceC2041a13);
                                } else {
                                    interfaceC0476a10.mo1653s();
                                }
                                interfaceC0476a10.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                                interfaceC0476a10.mo1626e();
                                composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                                interfaceC0476a10.mo1622c(2058660585);
                                C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                                if (z20 != 0) {
                                    interfaceC0476a10.mo1622c(-59268257);
                                    jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                    interfaceC0476a10.mo1661w();
                                } else {
                                    interfaceC0476a10.mo1622c(-59268159);
                                    jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                    interfaceC0476a10.mo1661w();
                                }
                                TextKt.m1576c(str110, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                                interfaceC0476a10.mo1622c(724549877);
                                String str112 = str17;
                                if (str112.length() > 0) {
                                    C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                    if (z21) {
                                        interfaceC0476a10.mo1622c(-59267725);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                        interfaceC0476a10.mo1661w();
                                    } else if (z20 != 0) {
                                        interfaceC0476a10.mo1622c(-59267615);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                        interfaceC0476a10.mo1661w();
                                    } else {
                                        interfaceC0476a10.mo1622c(-59267510);
                                        jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                        interfaceC0476a10.mo1661w();
                                    }
                                    long j10 = jM5347f2;
                                    InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                    interfaceC0476a7 = interfaceC0476a10;
                                    TextKt.m1576c(str112, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                                } else {
                                    interfaceC0476a7 = interfaceC0476a10;
                                }
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                    str10 = str7;
                    z16 = z14;
                    z17 = z15;
                    interfaceC2041a3 = interfaceC2041a10;
                }
                c5332q0M1612T = composerImpl.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        UpgradeItemCardKt.m10411a(str, str2, str10, str9, z16, z17, interfaceC2041a3, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 3072;
            str6 = str4;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    z12 = z10;
                    if (composerImplMo1636j.m1598G(z12)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((458752 & i10) == 0) {
                        z13 = z11;
                        if (composerImplMo1636j.m1598G(z13)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 64;
                    if (i19 != 0) {
                        i12 |= 1572864;
                        interfaceC2041a2 = interfaceC2041a;
                    } else {
                        interfaceC2041a2 = interfaceC2041a;
                        if ((i10 & 3670016) == 0) {
                            if (composerImplMo1636j.m1600H(interfaceC2041a2)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i12 |= i20;
                        }
                    }
                    i21 = i12;
                    if ((i21 & 2995931) == 599186) {
                        if (i22 != 0) {
                            str7 = "";
                        } else {
                            str7 = str5;
                        }
                        if (i13 != 0) {
                            str8 = "";
                        } else {
                            str8 = str6;
                        }
                        if (i15 != 0) {
                            z14 = false;
                        } else {
                            z14 = z12;
                        }
                        if (i17 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i19 != 0) {
                            interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                    return C9072e.f47360a;
                                }
                            };
                        }
                        InterfaceC2041a<C9072e> interfaceC2041a11 = interfaceC2041a2;
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                        final Context context8 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                        InterfaceC0500b interfaceC0500bM11157d7 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                        AbstractC10270a abstractC10270a8 = C7499b.m14916N(composerImplMo1636j).f9262d;
                        if (z14) {
                            composerImplMo1636j.mo1622c(1853269473);
                            c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                            composerImplMo1636j.m1609Q(false);
                        } else {
                            composerImplMo1636j.mo1622c(1853269535);
                            c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                            composerImplMo1636j.m1609Q(false);
                        }
                        str9 = str8;
                        final String str18 = str7;
                        final boolean z1112 = z14;
                        final boolean z1113 = z15;
                        composerImpl = composerImplMo1636j;
                        CardKt.m1558b(interfaceC2041a11, interfaceC0500bM11157d7, false, abstractC10270a8, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // cm.InterfaceC2057q
                            /* JADX INFO: renamed from: M */
                            public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                                long jM5363v;
                                Context context9;
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                                C5304d1 c5304d1;
                                InterfaceC0476a interfaceC0476a3;
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a12;
                                C7218l c7218lM14543a;
                                long jM11581a;
                                InterfaceC0476a interfaceC0476a4;
                                String str19;
                                InterfaceC0476a interfaceC0476a5;
                                long jM5347f;
                                InterfaceC0476a interfaceC0476a6;
                                long jM11582b;
                                InterfaceC0476a interfaceC0476a7;
                                long jM5347f2;
                                InterfaceC0500b interfaceC0500bM11156c0;
                                InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                                int iIntValue = num.intValue();
                                C5207g.m11111f(interfaceC9771b, "$this$Card");
                                if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                                    interfaceC0476a8.mo1650q();
                                } else {
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q9 = ComposerKt.f3003a;
                                    InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                    boolean z20 = z1113;
                                    boolean z21 = z1112;
                                    if (z21) {
                                        interfaceC0476a8.mo1622c(1155538318);
                                        jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                        interfaceC0476a8.mo1661w();
                                    } else if (z20) {
                                        interfaceC0476a8.mo1622c(1155538428);
                                        jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                        interfaceC0476a8.mo1661w();
                                    } else {
                                        interfaceC0476a8.mo1622c(1155538516);
                                        jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                        interfaceC0476a8.mo1661w();
                                    }
                                    InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                                    String str110 = str;
                                    String str111 = str2;
                                    interfaceC0476a8.mo1622c(-483455358);
                                    C0438a.f fVar = C0438a.f2429a;
                                    InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                                    interfaceC0476a8.mo1622c(-1323940314);
                                    C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                                    InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                                    C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                                    LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                                    C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                                    InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                                    ComposeUiNode.f3726n.getClass();
                                    InterfaceC2041a<ComposeUiNode> interfaceC2041a13 = ComposeUiNode.Companion.f3728b;
                                    ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                                    if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a8.mo1640l();
                                    if (interfaceC0476a8.mo1632h()) {
                                        interfaceC0476a8.mo1634i(interfaceC2041a13);
                                    } else {
                                        interfaceC0476a8.mo1653s();
                                    }
                                    interfaceC0476a8.mo1644n();
                                    InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                                    InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                                    C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                                    interfaceC0476a8.mo1626e();
                                    composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                                    interfaceC0476a8.mo1622c(2058660585);
                                    interfaceC0476a8.mo1622c(724544551);
                                    Context context10 = context8;
                                    if (z20) {
                                        String string = context10.getString(R.string.upgrade_special_offer);
                                        C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                        String upperCase = string.toUpperCase(Locale.ROOT);
                                        context9 = context10;
                                        C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                        interfaceC2056p2 = interfaceC2056p6;
                                        c5304d1 = c5304d4;
                                        interfaceC2056p = interfaceC2056p4;
                                        interfaceC0476a3 = interfaceC0476a8;
                                        TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                                    } else {
                                        context9 = context10;
                                        interfaceC2056p = interfaceC2056p4;
                                        interfaceC2056p2 = interfaceC2056p6;
                                        c5304d1 = c5304d4;
                                        interfaceC0476a3 = interfaceC0476a8;
                                    }
                                    interfaceC0476a3.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                                    C0438a.d dVar = C0438a.f2432d;
                                    C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                    InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                                    interfaceC0476a9.mo1622c(693286680);
                                    InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                                    interfaceC0476a9.mo1622c(-1323940314);
                                    InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                                    LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                                    C5304d1 c5304d5 = c5304d1;
                                    InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                                    ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                                    if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a9.mo1640l();
                                    if (interfaceC0476a9.mo1632h()) {
                                        interfaceC2041a12 = interfaceC2041a13;
                                        interfaceC0476a9.mo1634i(interfaceC2041a12);
                                    } else {
                                        interfaceC2041a12 = interfaceC2041a13;
                                        interfaceC0476a9.mo1653s();
                                    }
                                    interfaceC0476a9.mo1644n();
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                                    C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                                    interfaceC0476a9.mo1626e();
                                    composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                    interfaceC0476a9.mo1622c(2058660585);
                                    C6401a c6401a = C6401a.f36861a;
                                    if (z20 != 0) {
                                        interfaceC0476a9.mo1622c(-59272409);
                                        c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59272023);
                                        c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                        interfaceC0476a9.mo1661w();
                                    }
                                    C7218l c7218l = c7218lM14543a;
                                    if (r16 != 0 || z20) {
                                        interfaceC0476a9.mo1622c(-59271884);
                                        jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59271795);
                                        jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                        interfaceC0476a9.mo1661w();
                                    }
                                    InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                                    InterfaceC2041a<ComposeUiNode> interfaceC2041a14 = interfaceC2041a12;
                                    int i23 = i21;
                                    TextKt.m1576c(str110, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                                    interfaceC0476a9.mo1622c(724546263);
                                    String str112 = str9;
                                    if (str112.length() > 0) {
                                        String upperCase2 = str112.toUpperCase(Locale.ROOT);
                                        C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                        C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                        long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                        if (z20 != 0) {
                                            interfaceC0476a9.mo1622c(-59270956);
                                            interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                            interfaceC0476a9.mo1661w();
                                        } else {
                                            interfaceC0476a9.mo1622c(-59270264);
                                            interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                            interfaceC0476a9.mo1661w();
                                        }
                                        interfaceC0476a4 = interfaceC0476a9;
                                        str19 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                        TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                                    } else {
                                        interfaceC0476a4 = interfaceC0476a9;
                                        str19 = r7;
                                    }
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1663x();
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                                    if (r16 != 0) {
                                        interfaceC0476a5 = interfaceC0476a4;
                                        interfaceC0476a5.mo1622c(724548425);
                                        jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                        interfaceC0476a5.mo1661w();
                                    } else {
                                        interfaceC0476a5 = interfaceC0476a4;
                                        if (z20 != 0) {
                                            interfaceC0476a5.mo1622c(724548519);
                                            jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                            interfaceC0476a5.mo1661w();
                                        } else {
                                            interfaceC0476a5.mo1622c(724548598);
                                            jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                            interfaceC0476a5.mo1661w();
                                        }
                                    }
                                    DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                                    interfaceC0476a5.mo1622c(724548705);
                                    if (r16 != 0) {
                                        String string2 = context9.getString(R.string.upgrade_most_popular);
                                        C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                        String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                        C5207g.m11110e(upperCase3, str19);
                                        interfaceC0476a6 = interfaceC0476a5;
                                        TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                                    } else {
                                        interfaceC0476a6 = interfaceC0476a5;
                                    }
                                    interfaceC0476a6.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                                    InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                                    interfaceC0476a10.mo1622c(693286680);
                                    InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                                    interfaceC0476a10.mo1622c(-1323940314);
                                    InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                                    LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                                    InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                                    ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                                    if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a10.mo1640l();
                                    if (interfaceC0476a10.mo1632h()) {
                                        interfaceC0476a10.mo1634i(interfaceC2041a14);
                                    } else {
                                        interfaceC0476a10.mo1653s();
                                    }
                                    interfaceC0476a10.mo1644n();
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                                    C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                                    interfaceC0476a10.mo1626e();
                                    composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                                    interfaceC0476a10.mo1622c(2058660585);
                                    C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                                    if (z20 != 0) {
                                        interfaceC0476a10.mo1622c(-59268257);
                                        jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                        interfaceC0476a10.mo1661w();
                                    } else {
                                        interfaceC0476a10.mo1622c(-59268159);
                                        jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                        interfaceC0476a10.mo1661w();
                                    }
                                    TextKt.m1576c(str111, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                                    interfaceC0476a10.mo1622c(724549877);
                                    String str113 = str18;
                                    if (str113.length() > 0) {
                                        C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                        if (z21) {
                                            interfaceC0476a10.mo1622c(-59267725);
                                            jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                            interfaceC0476a10.mo1661w();
                                        } else if (z20 != 0) {
                                            interfaceC0476a10.mo1622c(-59267615);
                                            jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                            interfaceC0476a10.mo1661w();
                                        } else {
                                            interfaceC0476a10.mo1622c(-59267510);
                                            jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                            interfaceC0476a10.mo1661w();
                                        }
                                        long j10 = jM5347f2;
                                        InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                        interfaceC0476a7 = interfaceC0476a10;
                                        TextKt.m1576c(str113, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                                    } else {
                                        interfaceC0476a7 = interfaceC0476a10;
                                    }
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1663x();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1663x();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                }
                                return C9072e.f47360a;
                            }
                        }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                        str10 = str7;
                        z16 = z14;
                        z17 = z15;
                        interfaceC2041a3 = interfaceC2041a11;
                    } else {
                        if (i22 != 0) {
                            str7 = "";
                        } else {
                            str7 = str5;
                        }
                        if (i13 != 0) {
                            str8 = "";
                        } else {
                            str8 = str6;
                        }
                        if (i15 != 0) {
                            z14 = false;
                        } else {
                            z14 = z12;
                        }
                        if (i17 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i19 != 0) {
                            interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                    return C9072e.f47360a;
                                }
                            };
                        }
                        InterfaceC2041a<C9072e> interfaceC2041a12 = interfaceC2041a2;
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q9 = ComposerKt.f3003a;
                        final Context context9 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                        InterfaceC0500b interfaceC0500bM11157d8 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                        AbstractC10270a abstractC10270a9 = C7499b.m14916N(composerImplMo1636j).f9262d;
                        if (z14) {
                            composerImplMo1636j.mo1622c(1853269473);
                            c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                            composerImplMo1636j.m1609Q(false);
                        } else {
                            composerImplMo1636j.mo1622c(1853269535);
                            c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                            composerImplMo1636j.m1609Q(false);
                        }
                        str9 = str8;
                        final String str19 = str7;
                        final boolean z1114 = z14;
                        final boolean z1115 = z15;
                        composerImpl = composerImplMo1636j;
                        CardKt.m1558b(interfaceC2041a12, interfaceC0500bM11157d8, false, abstractC10270a9, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // cm.InterfaceC2057q
                            /* JADX INFO: renamed from: M */
                            public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                                long jM5363v;
                                Context context10;
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                                C5304d1 c5304d1;
                                InterfaceC0476a interfaceC0476a3;
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a13;
                                C7218l c7218lM14543a;
                                long jM11581a;
                                InterfaceC0476a interfaceC0476a4;
                                String str110;
                                InterfaceC0476a interfaceC0476a5;
                                long jM5347f;
                                InterfaceC0476a interfaceC0476a6;
                                long jM11582b;
                                InterfaceC0476a interfaceC0476a7;
                                long jM5347f2;
                                InterfaceC0500b interfaceC0500bM11156c0;
                                InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                                int iIntValue = num.intValue();
                                C5207g.m11111f(interfaceC9771b, "$this$Card");
                                if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                                    interfaceC0476a8.mo1650q();
                                } else {
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q10 = ComposerKt.f3003a;
                                    InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                    boolean z20 = z1115;
                                    boolean z21 = z1114;
                                    if (z21) {
                                        interfaceC0476a8.mo1622c(1155538318);
                                        jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                        interfaceC0476a8.mo1661w();
                                    } else if (z20) {
                                        interfaceC0476a8.mo1622c(1155538428);
                                        jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                        interfaceC0476a8.mo1661w();
                                    } else {
                                        interfaceC0476a8.mo1622c(1155538516);
                                        jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                        interfaceC0476a8.mo1661w();
                                    }
                                    InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                                    String str111 = str;
                                    String str112 = str2;
                                    interfaceC0476a8.mo1622c(-483455358);
                                    C0438a.f fVar = C0438a.f2429a;
                                    InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                                    interfaceC0476a8.mo1622c(-1323940314);
                                    C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                                    InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                                    C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                                    LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                                    C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                                    InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                                    ComposeUiNode.f3726n.getClass();
                                    InterfaceC2041a<ComposeUiNode> interfaceC2041a14 = ComposeUiNode.Companion.f3728b;
                                    ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                                    if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a8.mo1640l();
                                    if (interfaceC0476a8.mo1632h()) {
                                        interfaceC0476a8.mo1634i(interfaceC2041a14);
                                    } else {
                                        interfaceC0476a8.mo1653s();
                                    }
                                    interfaceC0476a8.mo1644n();
                                    InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                                    InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                                    C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                                    interfaceC0476a8.mo1626e();
                                    composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                                    interfaceC0476a8.mo1622c(2058660585);
                                    interfaceC0476a8.mo1622c(724544551);
                                    Context context11 = context9;
                                    if (z20) {
                                        String string = context11.getString(R.string.upgrade_special_offer);
                                        C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                        String upperCase = string.toUpperCase(Locale.ROOT);
                                        context10 = context11;
                                        C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                        interfaceC2056p2 = interfaceC2056p6;
                                        c5304d1 = c5304d4;
                                        interfaceC2056p = interfaceC2056p4;
                                        interfaceC0476a3 = interfaceC0476a8;
                                        TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                                    } else {
                                        context10 = context11;
                                        interfaceC2056p = interfaceC2056p4;
                                        interfaceC2056p2 = interfaceC2056p6;
                                        c5304d1 = c5304d4;
                                        interfaceC0476a3 = interfaceC0476a8;
                                    }
                                    interfaceC0476a3.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                                    C0438a.d dVar = C0438a.f2432d;
                                    C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                    InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                                    interfaceC0476a9.mo1622c(693286680);
                                    InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                                    interfaceC0476a9.mo1622c(-1323940314);
                                    InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                                    LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                                    C5304d1 c5304d5 = c5304d1;
                                    InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                                    ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                                    if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a9.mo1640l();
                                    if (interfaceC0476a9.mo1632h()) {
                                        interfaceC2041a13 = interfaceC2041a14;
                                        interfaceC0476a9.mo1634i(interfaceC2041a13);
                                    } else {
                                        interfaceC2041a13 = interfaceC2041a14;
                                        interfaceC0476a9.mo1653s();
                                    }
                                    interfaceC0476a9.mo1644n();
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                                    C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                                    interfaceC0476a9.mo1626e();
                                    composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                    interfaceC0476a9.mo1622c(2058660585);
                                    C6401a c6401a = C6401a.f36861a;
                                    if (z20 != 0) {
                                        interfaceC0476a9.mo1622c(-59272409);
                                        c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59272023);
                                        c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                        interfaceC0476a9.mo1661w();
                                    }
                                    C7218l c7218l = c7218lM14543a;
                                    if (r16 != 0 || z20) {
                                        interfaceC0476a9.mo1622c(-59271884);
                                        jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59271795);
                                        jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                        interfaceC0476a9.mo1661w();
                                    }
                                    InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                                    InterfaceC2041a<ComposeUiNode> interfaceC2041a15 = interfaceC2041a13;
                                    int i23 = i21;
                                    TextKt.m1576c(str111, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                                    interfaceC0476a9.mo1622c(724546263);
                                    String str113 = str9;
                                    if (str113.length() > 0) {
                                        String upperCase2 = str113.toUpperCase(Locale.ROOT);
                                        C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                        C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                        long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                        if (z20 != 0) {
                                            interfaceC0476a9.mo1622c(-59270956);
                                            interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                            interfaceC0476a9.mo1661w();
                                        } else {
                                            interfaceC0476a9.mo1622c(-59270264);
                                            interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                            interfaceC0476a9.mo1661w();
                                        }
                                        interfaceC0476a4 = interfaceC0476a9;
                                        str110 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                        TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                                    } else {
                                        interfaceC0476a4 = interfaceC0476a9;
                                        str110 = r7;
                                    }
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1663x();
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                                    if (r16 != 0) {
                                        interfaceC0476a5 = interfaceC0476a4;
                                        interfaceC0476a5.mo1622c(724548425);
                                        jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                        interfaceC0476a5.mo1661w();
                                    } else {
                                        interfaceC0476a5 = interfaceC0476a4;
                                        if (z20 != 0) {
                                            interfaceC0476a5.mo1622c(724548519);
                                            jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                            interfaceC0476a5.mo1661w();
                                        } else {
                                            interfaceC0476a5.mo1622c(724548598);
                                            jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                            interfaceC0476a5.mo1661w();
                                        }
                                    }
                                    DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                                    interfaceC0476a5.mo1622c(724548705);
                                    if (r16 != 0) {
                                        String string2 = context10.getString(R.string.upgrade_most_popular);
                                        C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                        String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                        C5207g.m11110e(upperCase3, str110);
                                        interfaceC0476a6 = interfaceC0476a5;
                                        TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                                    } else {
                                        interfaceC0476a6 = interfaceC0476a5;
                                    }
                                    interfaceC0476a6.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                                    InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                                    interfaceC0476a10.mo1622c(693286680);
                                    InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                                    interfaceC0476a10.mo1622c(-1323940314);
                                    InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                                    LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                                    InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                                    ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                                    if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a10.mo1640l();
                                    if (interfaceC0476a10.mo1632h()) {
                                        interfaceC0476a10.mo1634i(interfaceC2041a15);
                                    } else {
                                        interfaceC0476a10.mo1653s();
                                    }
                                    interfaceC0476a10.mo1644n();
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                                    C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                                    interfaceC0476a10.mo1626e();
                                    composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                                    interfaceC0476a10.mo1622c(2058660585);
                                    C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                                    if (z20 != 0) {
                                        interfaceC0476a10.mo1622c(-59268257);
                                        jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                        interfaceC0476a10.mo1661w();
                                    } else {
                                        interfaceC0476a10.mo1622c(-59268159);
                                        jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                        interfaceC0476a10.mo1661w();
                                    }
                                    TextKt.m1576c(str112, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                                    interfaceC0476a10.mo1622c(724549877);
                                    String str114 = str19;
                                    if (str114.length() > 0) {
                                        C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                        if (z21) {
                                            interfaceC0476a10.mo1622c(-59267725);
                                            jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                            interfaceC0476a10.mo1661w();
                                        } else if (z20 != 0) {
                                            interfaceC0476a10.mo1622c(-59267615);
                                            jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                            interfaceC0476a10.mo1661w();
                                        } else {
                                            interfaceC0476a10.mo1622c(-59267510);
                                            jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                            interfaceC0476a10.mo1661w();
                                        }
                                        long j10 = jM5347f2;
                                        InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                        interfaceC0476a7 = interfaceC0476a10;
                                        TextKt.m1576c(str114, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                                    } else {
                                        interfaceC0476a7 = interfaceC0476a10;
                                    }
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1663x();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1663x();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                }
                                return C9072e.f47360a;
                            }
                        }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                        str10 = str7;
                        z16 = z14;
                        z17 = z15;
                        interfaceC2041a3 = interfaceC2041a12;
                    }
                    c5332q0M1612T = composerImpl.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            UpgradeItemCardKt.m10411a(str, str2, str10, str9, z16, z17, interfaceC2041a3, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i12 |= 196608;
                z13 = z11;
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                    interfaceC2041a2 = interfaceC2041a;
                } else {
                    interfaceC2041a2 = interfaceC2041a;
                    if ((i10 & 3670016) == 0) {
                        if (composerImplMo1636j.m1600H(interfaceC2041a2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                }
                i21 = i12;
                if ((i21 & 2995931) == 599186) {
                    if (i22 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i13 != 0) {
                        str8 = "";
                    } else {
                        str8 = str6;
                    }
                    if (i15 != 0) {
                        z14 = false;
                    } else {
                        z14 = z12;
                    }
                    if (i17 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i19 != 0) {
                        interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        };
                    }
                    InterfaceC2041a<C9072e> interfaceC2041a13 = interfaceC2041a2;
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q10 = ComposerKt.f3003a;
                    final Context context10 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                    InterfaceC0500b interfaceC0500bM11157d9 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                    AbstractC10270a abstractC10270a10 = C7499b.m14916N(composerImplMo1636j).f9262d;
                    if (z14) {
                        composerImplMo1636j.mo1622c(1853269473);
                        c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    } else {
                        composerImplMo1636j.mo1622c(1853269535);
                        c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    }
                    str9 = str8;
                    final String str110 = str7;
                    final boolean z1116 = z14;
                    final boolean z1117 = z15;
                    composerImpl = composerImplMo1636j;
                    CardKt.m1558b(interfaceC2041a13, interfaceC0500bM11157d9, false, abstractC10270a10, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // cm.InterfaceC2057q
                        /* JADX INFO: renamed from: M */
                        public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                            long jM5363v;
                            Context context11;
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                            C5304d1 c5304d1;
                            InterfaceC0476a interfaceC0476a3;
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a14;
                            C7218l c7218lM14543a;
                            long jM11581a;
                            InterfaceC0476a interfaceC0476a4;
                            String str111;
                            InterfaceC0476a interfaceC0476a5;
                            long jM5347f;
                            InterfaceC0476a interfaceC0476a6;
                            long jM11582b;
                            InterfaceC0476a interfaceC0476a7;
                            long jM5347f2;
                            InterfaceC0500b interfaceC0500bM11156c0;
                            InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                            int iIntValue = num.intValue();
                            C5207g.m11111f(interfaceC9771b, "$this$Card");
                            if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                                interfaceC0476a8.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11 = ComposerKt.f3003a;
                                InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                boolean z20 = z1117;
                                boolean z21 = z1116;
                                if (z21) {
                                    interfaceC0476a8.mo1622c(1155538318);
                                    jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                    interfaceC0476a8.mo1661w();
                                } else if (z20) {
                                    interfaceC0476a8.mo1622c(1155538428);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                    interfaceC0476a8.mo1661w();
                                } else {
                                    interfaceC0476a8.mo1622c(1155538516);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                    interfaceC0476a8.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                                String str112 = str;
                                String str113 = str2;
                                interfaceC0476a8.mo1622c(-483455358);
                                C0438a.f fVar = C0438a.f2429a;
                                InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                                interfaceC0476a8.mo1622c(-1323940314);
                                C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                                InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                                C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                                LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                                C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                                InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                                ComposeUiNode.f3726n.getClass();
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a15 = ComposeUiNode.Companion.f3728b;
                                ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                                if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a8.mo1640l();
                                if (interfaceC0476a8.mo1632h()) {
                                    interfaceC0476a8.mo1634i(interfaceC2041a15);
                                } else {
                                    interfaceC0476a8.mo1653s();
                                }
                                interfaceC0476a8.mo1644n();
                                InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                                InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                                C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                                interfaceC0476a8.mo1626e();
                                composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                                interfaceC0476a8.mo1622c(2058660585);
                                interfaceC0476a8.mo1622c(724544551);
                                Context context12 = context10;
                                if (z20) {
                                    String string = context12.getString(R.string.upgrade_special_offer);
                                    C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                    String upperCase = string.toUpperCase(Locale.ROOT);
                                    context11 = context12;
                                    C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                    TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                                } else {
                                    context11 = context12;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                }
                                interfaceC0476a3.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                                C0438a.d dVar = C0438a.f2432d;
                                C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                                interfaceC0476a9.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                                interfaceC0476a9.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                                LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                                C5304d1 c5304d5 = c5304d1;
                                InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                                if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a9.mo1640l();
                                if (interfaceC0476a9.mo1632h()) {
                                    interfaceC2041a14 = interfaceC2041a15;
                                    interfaceC0476a9.mo1634i(interfaceC2041a14);
                                } else {
                                    interfaceC2041a14 = interfaceC2041a15;
                                    interfaceC0476a9.mo1653s();
                                }
                                interfaceC0476a9.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                                interfaceC0476a9.mo1626e();
                                composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                interfaceC0476a9.mo1622c(2058660585);
                                C6401a c6401a = C6401a.f36861a;
                                if (z20 != 0) {
                                    interfaceC0476a9.mo1622c(-59272409);
                                    c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59272023);
                                    c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                    interfaceC0476a9.mo1661w();
                                }
                                C7218l c7218l = c7218lM14543a;
                                if (r16 != 0 || z20) {
                                    interfaceC0476a9.mo1622c(-59271884);
                                    jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59271795);
                                    jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                    interfaceC0476a9.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a16 = interfaceC2041a14;
                                int i23 = i21;
                                TextKt.m1576c(str112, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                                interfaceC0476a9.mo1622c(724546263);
                                String str114 = str9;
                                if (str114.length() > 0) {
                                    String upperCase2 = str114.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    if (z20 != 0) {
                                        interfaceC0476a9.mo1622c(-59270956);
                                        interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59270264);
                                        interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                        interfaceC0476a9.mo1661w();
                                    }
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str111 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                    TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                                } else {
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str111 = r7;
                                }
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1663x();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                                if (r16 != 0) {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    interfaceC0476a5.mo1622c(724548425);
                                    jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                    interfaceC0476a5.mo1661w();
                                } else {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    if (z20 != 0) {
                                        interfaceC0476a5.mo1622c(724548519);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                        interfaceC0476a5.mo1661w();
                                    } else {
                                        interfaceC0476a5.mo1622c(724548598);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                        interfaceC0476a5.mo1661w();
                                    }
                                }
                                DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                                interfaceC0476a5.mo1622c(724548705);
                                if (r16 != 0) {
                                    String string2 = context11.getString(R.string.upgrade_most_popular);
                                    C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                    String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase3, str111);
                                    interfaceC0476a6 = interfaceC0476a5;
                                    TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                                } else {
                                    interfaceC0476a6 = interfaceC0476a5;
                                }
                                interfaceC0476a6.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                                InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                                interfaceC0476a10.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                                interfaceC0476a10.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                                LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                                InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                                if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a10.mo1640l();
                                if (interfaceC0476a10.mo1632h()) {
                                    interfaceC0476a10.mo1634i(interfaceC2041a16);
                                } else {
                                    interfaceC0476a10.mo1653s();
                                }
                                interfaceC0476a10.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                                interfaceC0476a10.mo1626e();
                                composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                                interfaceC0476a10.mo1622c(2058660585);
                                C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                                if (z20 != 0) {
                                    interfaceC0476a10.mo1622c(-59268257);
                                    jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                    interfaceC0476a10.mo1661w();
                                } else {
                                    interfaceC0476a10.mo1622c(-59268159);
                                    jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                    interfaceC0476a10.mo1661w();
                                }
                                TextKt.m1576c(str113, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                                interfaceC0476a10.mo1622c(724549877);
                                String str115 = str110;
                                if (str115.length() > 0) {
                                    C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                    if (z21) {
                                        interfaceC0476a10.mo1622c(-59267725);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                        interfaceC0476a10.mo1661w();
                                    } else if (z20 != 0) {
                                        interfaceC0476a10.mo1622c(-59267615);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                        interfaceC0476a10.mo1661w();
                                    } else {
                                        interfaceC0476a10.mo1622c(-59267510);
                                        jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                        interfaceC0476a10.mo1661w();
                                    }
                                    long j10 = jM5347f2;
                                    InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                    interfaceC0476a7 = interfaceC0476a10;
                                    TextKt.m1576c(str115, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                                } else {
                                    interfaceC0476a7 = interfaceC0476a10;
                                }
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                    str10 = str7;
                    z16 = z14;
                    z17 = z15;
                    interfaceC2041a3 = interfaceC2041a13;
                } else {
                    if (i22 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i13 != 0) {
                        str8 = "";
                    } else {
                        str8 = str6;
                    }
                    if (i15 != 0) {
                        z14 = false;
                    } else {
                        z14 = z12;
                    }
                    if (i17 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i19 != 0) {
                        interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        };
                    }
                    InterfaceC2041a<C9072e> interfaceC2041a14 = interfaceC2041a2;
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11 = ComposerKt.f3003a;
                    final Context context11 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                    InterfaceC0500b interfaceC0500bM11157d10 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                    AbstractC10270a abstractC10270a11 = C7499b.m14916N(composerImplMo1636j).f9262d;
                    if (z14) {
                        composerImplMo1636j.mo1622c(1853269473);
                        c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    } else {
                        composerImplMo1636j.mo1622c(1853269535);
                        c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    }
                    str9 = str8;
                    final String str111 = str7;
                    final boolean z1118 = z14;
                    final boolean z1119 = z15;
                    composerImpl = composerImplMo1636j;
                    CardKt.m1558b(interfaceC2041a14, interfaceC0500bM11157d10, false, abstractC10270a11, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // cm.InterfaceC2057q
                        /* JADX INFO: renamed from: M */
                        public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                            long jM5363v;
                            Context context12;
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                            C5304d1 c5304d1;
                            InterfaceC0476a interfaceC0476a3;
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a15;
                            C7218l c7218lM14543a;
                            long jM11581a;
                            InterfaceC0476a interfaceC0476a4;
                            String str112;
                            InterfaceC0476a interfaceC0476a5;
                            long jM5347f;
                            InterfaceC0476a interfaceC0476a6;
                            long jM11582b;
                            InterfaceC0476a interfaceC0476a7;
                            long jM5347f2;
                            InterfaceC0500b interfaceC0500bM11156c0;
                            InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                            int iIntValue = num.intValue();
                            C5207g.m11111f(interfaceC9771b, "$this$Card");
                            if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                                interfaceC0476a8.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q12 = ComposerKt.f3003a;
                                InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                boolean z20 = z1119;
                                boolean z21 = z1118;
                                if (z21) {
                                    interfaceC0476a8.mo1622c(1155538318);
                                    jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                    interfaceC0476a8.mo1661w();
                                } else if (z20) {
                                    interfaceC0476a8.mo1622c(1155538428);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                    interfaceC0476a8.mo1661w();
                                } else {
                                    interfaceC0476a8.mo1622c(1155538516);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                    interfaceC0476a8.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                                String str113 = str;
                                String str114 = str2;
                                interfaceC0476a8.mo1622c(-483455358);
                                C0438a.f fVar = C0438a.f2429a;
                                InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                                interfaceC0476a8.mo1622c(-1323940314);
                                C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                                InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                                C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                                LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                                C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                                InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                                ComposeUiNode.f3726n.getClass();
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a16 = ComposeUiNode.Companion.f3728b;
                                ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                                if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a8.mo1640l();
                                if (interfaceC0476a8.mo1632h()) {
                                    interfaceC0476a8.mo1634i(interfaceC2041a16);
                                } else {
                                    interfaceC0476a8.mo1653s();
                                }
                                interfaceC0476a8.mo1644n();
                                InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                                InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                                C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                                interfaceC0476a8.mo1626e();
                                composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                                interfaceC0476a8.mo1622c(2058660585);
                                interfaceC0476a8.mo1622c(724544551);
                                Context context13 = context11;
                                if (z20) {
                                    String string = context13.getString(R.string.upgrade_special_offer);
                                    C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                    String upperCase = string.toUpperCase(Locale.ROOT);
                                    context12 = context13;
                                    C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                    TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                                } else {
                                    context12 = context13;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                }
                                interfaceC0476a3.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                                C0438a.d dVar = C0438a.f2432d;
                                C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                                interfaceC0476a9.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                                interfaceC0476a9.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                                LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                                C5304d1 c5304d5 = c5304d1;
                                InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                                if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a9.mo1640l();
                                if (interfaceC0476a9.mo1632h()) {
                                    interfaceC2041a15 = interfaceC2041a16;
                                    interfaceC0476a9.mo1634i(interfaceC2041a15);
                                } else {
                                    interfaceC2041a15 = interfaceC2041a16;
                                    interfaceC0476a9.mo1653s();
                                }
                                interfaceC0476a9.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                                interfaceC0476a9.mo1626e();
                                composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                interfaceC0476a9.mo1622c(2058660585);
                                C6401a c6401a = C6401a.f36861a;
                                if (z20 != 0) {
                                    interfaceC0476a9.mo1622c(-59272409);
                                    c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59272023);
                                    c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                    interfaceC0476a9.mo1661w();
                                }
                                C7218l c7218l = c7218lM14543a;
                                if (r16 != 0 || z20) {
                                    interfaceC0476a9.mo1622c(-59271884);
                                    jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59271795);
                                    jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                    interfaceC0476a9.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a17 = interfaceC2041a15;
                                int i23 = i21;
                                TextKt.m1576c(str113, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                                interfaceC0476a9.mo1622c(724546263);
                                String str115 = str9;
                                if (str115.length() > 0) {
                                    String upperCase2 = str115.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    if (z20 != 0) {
                                        interfaceC0476a9.mo1622c(-59270956);
                                        interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59270264);
                                        interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                        interfaceC0476a9.mo1661w();
                                    }
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str112 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                    TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                                } else {
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str112 = r7;
                                }
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1663x();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                                if (r16 != 0) {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    interfaceC0476a5.mo1622c(724548425);
                                    jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                    interfaceC0476a5.mo1661w();
                                } else {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    if (z20 != 0) {
                                        interfaceC0476a5.mo1622c(724548519);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                        interfaceC0476a5.mo1661w();
                                    } else {
                                        interfaceC0476a5.mo1622c(724548598);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                        interfaceC0476a5.mo1661w();
                                    }
                                }
                                DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                                interfaceC0476a5.mo1622c(724548705);
                                if (r16 != 0) {
                                    String string2 = context12.getString(R.string.upgrade_most_popular);
                                    C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                    String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase3, str112);
                                    interfaceC0476a6 = interfaceC0476a5;
                                    TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                                } else {
                                    interfaceC0476a6 = interfaceC0476a5;
                                }
                                interfaceC0476a6.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                                InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                                interfaceC0476a10.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                                interfaceC0476a10.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                                LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                                InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                                if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a10.mo1640l();
                                if (interfaceC0476a10.mo1632h()) {
                                    interfaceC0476a10.mo1634i(interfaceC2041a17);
                                } else {
                                    interfaceC0476a10.mo1653s();
                                }
                                interfaceC0476a10.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                                interfaceC0476a10.mo1626e();
                                composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                                interfaceC0476a10.mo1622c(2058660585);
                                C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                                if (z20 != 0) {
                                    interfaceC0476a10.mo1622c(-59268257);
                                    jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                    interfaceC0476a10.mo1661w();
                                } else {
                                    interfaceC0476a10.mo1622c(-59268159);
                                    jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                    interfaceC0476a10.mo1661w();
                                }
                                TextKt.m1576c(str114, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                                interfaceC0476a10.mo1622c(724549877);
                                String str116 = str111;
                                if (str116.length() > 0) {
                                    C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                    if (z21) {
                                        interfaceC0476a10.mo1622c(-59267725);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                        interfaceC0476a10.mo1661w();
                                    } else if (z20 != 0) {
                                        interfaceC0476a10.mo1622c(-59267615);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                        interfaceC0476a10.mo1661w();
                                    } else {
                                        interfaceC0476a10.mo1622c(-59267510);
                                        jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                        interfaceC0476a10.mo1661w();
                                    }
                                    long j10 = jM5347f2;
                                    InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                    interfaceC0476a7 = interfaceC0476a10;
                                    TextKt.m1576c(str116, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                                } else {
                                    interfaceC0476a7 = interfaceC0476a10;
                                }
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                    str10 = str7;
                    z16 = z14;
                    z17 = z15;
                    interfaceC2041a3 = interfaceC2041a14;
                }
                c5332q0M1612T = composerImpl.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        UpgradeItemCardKt.m10411a(str, str2, str10, str9, z16, z17, interfaceC2041a3, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 24576;
            z12 = z10;
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((458752 & i10) == 0) {
                    z13 = z11;
                    if (composerImplMo1636j.m1598G(z13)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                    interfaceC2041a2 = interfaceC2041a;
                } else {
                    interfaceC2041a2 = interfaceC2041a;
                    if ((i10 & 3670016) == 0) {
                        if (composerImplMo1636j.m1600H(interfaceC2041a2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                }
                i21 = i12;
                if ((i21 & 2995931) == 599186) {
                    if (i22 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i13 != 0) {
                        str8 = "";
                    } else {
                        str8 = str6;
                    }
                    if (i15 != 0) {
                        z14 = false;
                    } else {
                        z14 = z12;
                    }
                    if (i17 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i19 != 0) {
                        interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        };
                    }
                    InterfaceC2041a<C9072e> interfaceC2041a15 = interfaceC2041a2;
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q12 = ComposerKt.f3003a;
                    final Context context12 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                    InterfaceC0500b interfaceC0500bM11157d11 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                    AbstractC10270a abstractC10270a12 = C7499b.m14916N(composerImplMo1636j).f9262d;
                    if (z14) {
                        composerImplMo1636j.mo1622c(1853269473);
                        c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    } else {
                        composerImplMo1636j.mo1622c(1853269535);
                        c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    }
                    str9 = str8;
                    final String str112 = str7;
                    final boolean z11110 = z14;
                    final boolean z11111 = z15;
                    composerImpl = composerImplMo1636j;
                    CardKt.m1558b(interfaceC2041a15, interfaceC0500bM11157d11, false, abstractC10270a12, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // cm.InterfaceC2057q
                        /* JADX INFO: renamed from: M */
                        public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                            long jM5363v;
                            Context context13;
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                            C5304d1 c5304d1;
                            InterfaceC0476a interfaceC0476a3;
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a16;
                            C7218l c7218lM14543a;
                            long jM11581a;
                            InterfaceC0476a interfaceC0476a4;
                            String str113;
                            InterfaceC0476a interfaceC0476a5;
                            long jM5347f;
                            InterfaceC0476a interfaceC0476a6;
                            long jM11582b;
                            InterfaceC0476a interfaceC0476a7;
                            long jM5347f2;
                            InterfaceC0500b interfaceC0500bM11156c0;
                            InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                            int iIntValue = num.intValue();
                            C5207g.m11111f(interfaceC9771b, "$this$Card");
                            if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                                interfaceC0476a8.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q13 = ComposerKt.f3003a;
                                InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                boolean z20 = z11111;
                                boolean z21 = z11110;
                                if (z21) {
                                    interfaceC0476a8.mo1622c(1155538318);
                                    jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                    interfaceC0476a8.mo1661w();
                                } else if (z20) {
                                    interfaceC0476a8.mo1622c(1155538428);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                    interfaceC0476a8.mo1661w();
                                } else {
                                    interfaceC0476a8.mo1622c(1155538516);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                    interfaceC0476a8.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                                String str114 = str;
                                String str115 = str2;
                                interfaceC0476a8.mo1622c(-483455358);
                                C0438a.f fVar = C0438a.f2429a;
                                InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                                interfaceC0476a8.mo1622c(-1323940314);
                                C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                                InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                                C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                                LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                                C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                                InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                                ComposeUiNode.f3726n.getClass();
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a17 = ComposeUiNode.Companion.f3728b;
                                ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                                if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a8.mo1640l();
                                if (interfaceC0476a8.mo1632h()) {
                                    interfaceC0476a8.mo1634i(interfaceC2041a17);
                                } else {
                                    interfaceC0476a8.mo1653s();
                                }
                                interfaceC0476a8.mo1644n();
                                InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                                InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                                C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                                interfaceC0476a8.mo1626e();
                                composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                                interfaceC0476a8.mo1622c(2058660585);
                                interfaceC0476a8.mo1622c(724544551);
                                Context context14 = context12;
                                if (z20) {
                                    String string = context14.getString(R.string.upgrade_special_offer);
                                    C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                    String upperCase = string.toUpperCase(Locale.ROOT);
                                    context13 = context14;
                                    C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                    TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                                } else {
                                    context13 = context14;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                }
                                interfaceC0476a3.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                                C0438a.d dVar = C0438a.f2432d;
                                C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                                interfaceC0476a9.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                                interfaceC0476a9.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                                LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                                C5304d1 c5304d5 = c5304d1;
                                InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                                if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a9.mo1640l();
                                if (interfaceC0476a9.mo1632h()) {
                                    interfaceC2041a16 = interfaceC2041a17;
                                    interfaceC0476a9.mo1634i(interfaceC2041a16);
                                } else {
                                    interfaceC2041a16 = interfaceC2041a17;
                                    interfaceC0476a9.mo1653s();
                                }
                                interfaceC0476a9.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                                interfaceC0476a9.mo1626e();
                                composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                interfaceC0476a9.mo1622c(2058660585);
                                C6401a c6401a = C6401a.f36861a;
                                if (z20 != 0) {
                                    interfaceC0476a9.mo1622c(-59272409);
                                    c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59272023);
                                    c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                    interfaceC0476a9.mo1661w();
                                }
                                C7218l c7218l = c7218lM14543a;
                                if (r16 != 0 || z20) {
                                    interfaceC0476a9.mo1622c(-59271884);
                                    jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59271795);
                                    jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                    interfaceC0476a9.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a18 = interfaceC2041a16;
                                int i23 = i21;
                                TextKt.m1576c(str114, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                                interfaceC0476a9.mo1622c(724546263);
                                String str116 = str9;
                                if (str116.length() > 0) {
                                    String upperCase2 = str116.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    if (z20 != 0) {
                                        interfaceC0476a9.mo1622c(-59270956);
                                        interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59270264);
                                        interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                        interfaceC0476a9.mo1661w();
                                    }
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str113 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                    TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                                } else {
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str113 = r7;
                                }
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1663x();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                                if (r16 != 0) {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    interfaceC0476a5.mo1622c(724548425);
                                    jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                    interfaceC0476a5.mo1661w();
                                } else {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    if (z20 != 0) {
                                        interfaceC0476a5.mo1622c(724548519);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                        interfaceC0476a5.mo1661w();
                                    } else {
                                        interfaceC0476a5.mo1622c(724548598);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                        interfaceC0476a5.mo1661w();
                                    }
                                }
                                DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                                interfaceC0476a5.mo1622c(724548705);
                                if (r16 != 0) {
                                    String string2 = context13.getString(R.string.upgrade_most_popular);
                                    C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                    String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase3, str113);
                                    interfaceC0476a6 = interfaceC0476a5;
                                    TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                                } else {
                                    interfaceC0476a6 = interfaceC0476a5;
                                }
                                interfaceC0476a6.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                                InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                                interfaceC0476a10.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                                interfaceC0476a10.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                                LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                                InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                                if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a10.mo1640l();
                                if (interfaceC0476a10.mo1632h()) {
                                    interfaceC0476a10.mo1634i(interfaceC2041a18);
                                } else {
                                    interfaceC0476a10.mo1653s();
                                }
                                interfaceC0476a10.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                                interfaceC0476a10.mo1626e();
                                composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                                interfaceC0476a10.mo1622c(2058660585);
                                C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                                if (z20 != 0) {
                                    interfaceC0476a10.mo1622c(-59268257);
                                    jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                    interfaceC0476a10.mo1661w();
                                } else {
                                    interfaceC0476a10.mo1622c(-59268159);
                                    jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                    interfaceC0476a10.mo1661w();
                                }
                                TextKt.m1576c(str115, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                                interfaceC0476a10.mo1622c(724549877);
                                String str117 = str112;
                                if (str117.length() > 0) {
                                    C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                    if (z21) {
                                        interfaceC0476a10.mo1622c(-59267725);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                        interfaceC0476a10.mo1661w();
                                    } else if (z20 != 0) {
                                        interfaceC0476a10.mo1622c(-59267615);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                        interfaceC0476a10.mo1661w();
                                    } else {
                                        interfaceC0476a10.mo1622c(-59267510);
                                        jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                        interfaceC0476a10.mo1661w();
                                    }
                                    long j10 = jM5347f2;
                                    InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                    interfaceC0476a7 = interfaceC0476a10;
                                    TextKt.m1576c(str117, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                                } else {
                                    interfaceC0476a7 = interfaceC0476a10;
                                }
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                    str10 = str7;
                    z16 = z14;
                    z17 = z15;
                    interfaceC2041a3 = interfaceC2041a15;
                } else {
                    if (i22 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i13 != 0) {
                        str8 = "";
                    } else {
                        str8 = str6;
                    }
                    if (i15 != 0) {
                        z14 = false;
                    } else {
                        z14 = z12;
                    }
                    if (i17 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i19 != 0) {
                        interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        };
                    }
                    InterfaceC2041a<C9072e> interfaceC2041a16 = interfaceC2041a2;
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q13 = ComposerKt.f3003a;
                    final Context context13 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                    InterfaceC0500b interfaceC0500bM11157d12 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                    AbstractC10270a abstractC10270a13 = C7499b.m14916N(composerImplMo1636j).f9262d;
                    if (z14) {
                        composerImplMo1636j.mo1622c(1853269473);
                        c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    } else {
                        composerImplMo1636j.mo1622c(1853269535);
                        c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    }
                    str9 = str8;
                    final String str113 = str7;
                    final boolean z11112 = z14;
                    final boolean z11113 = z15;
                    composerImpl = composerImplMo1636j;
                    CardKt.m1558b(interfaceC2041a16, interfaceC0500bM11157d12, false, abstractC10270a13, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // cm.InterfaceC2057q
                        /* JADX INFO: renamed from: M */
                        public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                            long jM5363v;
                            Context context14;
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                            C5304d1 c5304d1;
                            InterfaceC0476a interfaceC0476a3;
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a17;
                            C7218l c7218lM14543a;
                            long jM11581a;
                            InterfaceC0476a interfaceC0476a4;
                            String str114;
                            InterfaceC0476a interfaceC0476a5;
                            long jM5347f;
                            InterfaceC0476a interfaceC0476a6;
                            long jM11582b;
                            InterfaceC0476a interfaceC0476a7;
                            long jM5347f2;
                            InterfaceC0500b interfaceC0500bM11156c0;
                            InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                            int iIntValue = num.intValue();
                            C5207g.m11111f(interfaceC9771b, "$this$Card");
                            if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                                interfaceC0476a8.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q14 = ComposerKt.f3003a;
                                InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                boolean z20 = z11113;
                                boolean z21 = z11112;
                                if (z21) {
                                    interfaceC0476a8.mo1622c(1155538318);
                                    jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                    interfaceC0476a8.mo1661w();
                                } else if (z20) {
                                    interfaceC0476a8.mo1622c(1155538428);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                    interfaceC0476a8.mo1661w();
                                } else {
                                    interfaceC0476a8.mo1622c(1155538516);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                    interfaceC0476a8.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                                String str115 = str;
                                String str116 = str2;
                                interfaceC0476a8.mo1622c(-483455358);
                                C0438a.f fVar = C0438a.f2429a;
                                InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                                interfaceC0476a8.mo1622c(-1323940314);
                                C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                                InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                                C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                                LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                                C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                                InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                                ComposeUiNode.f3726n.getClass();
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a18 = ComposeUiNode.Companion.f3728b;
                                ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                                if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a8.mo1640l();
                                if (interfaceC0476a8.mo1632h()) {
                                    interfaceC0476a8.mo1634i(interfaceC2041a18);
                                } else {
                                    interfaceC0476a8.mo1653s();
                                }
                                interfaceC0476a8.mo1644n();
                                InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                                InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                                C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                                interfaceC0476a8.mo1626e();
                                composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                                interfaceC0476a8.mo1622c(2058660585);
                                interfaceC0476a8.mo1622c(724544551);
                                Context context15 = context13;
                                if (z20) {
                                    String string = context15.getString(R.string.upgrade_special_offer);
                                    C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                    String upperCase = string.toUpperCase(Locale.ROOT);
                                    context14 = context15;
                                    C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                    TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                                } else {
                                    context14 = context15;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                }
                                interfaceC0476a3.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                                C0438a.d dVar = C0438a.f2432d;
                                C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                                interfaceC0476a9.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                                interfaceC0476a9.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                                LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                                C5304d1 c5304d5 = c5304d1;
                                InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                                if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a9.mo1640l();
                                if (interfaceC0476a9.mo1632h()) {
                                    interfaceC2041a17 = interfaceC2041a18;
                                    interfaceC0476a9.mo1634i(interfaceC2041a17);
                                } else {
                                    interfaceC2041a17 = interfaceC2041a18;
                                    interfaceC0476a9.mo1653s();
                                }
                                interfaceC0476a9.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                                interfaceC0476a9.mo1626e();
                                composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                interfaceC0476a9.mo1622c(2058660585);
                                C6401a c6401a = C6401a.f36861a;
                                if (z20 != 0) {
                                    interfaceC0476a9.mo1622c(-59272409);
                                    c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59272023);
                                    c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                    interfaceC0476a9.mo1661w();
                                }
                                C7218l c7218l = c7218lM14543a;
                                if (r16 != 0 || z20) {
                                    interfaceC0476a9.mo1622c(-59271884);
                                    jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59271795);
                                    jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                    interfaceC0476a9.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a19 = interfaceC2041a17;
                                int i23 = i21;
                                TextKt.m1576c(str115, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                                interfaceC0476a9.mo1622c(724546263);
                                String str117 = str9;
                                if (str117.length() > 0) {
                                    String upperCase2 = str117.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    if (z20 != 0) {
                                        interfaceC0476a9.mo1622c(-59270956);
                                        interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59270264);
                                        interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                        interfaceC0476a9.mo1661w();
                                    }
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str114 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                    TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                                } else {
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str114 = r7;
                                }
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1663x();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                                if (r16 != 0) {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    interfaceC0476a5.mo1622c(724548425);
                                    jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                    interfaceC0476a5.mo1661w();
                                } else {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    if (z20 != 0) {
                                        interfaceC0476a5.mo1622c(724548519);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                        interfaceC0476a5.mo1661w();
                                    } else {
                                        interfaceC0476a5.mo1622c(724548598);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                        interfaceC0476a5.mo1661w();
                                    }
                                }
                                DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                                interfaceC0476a5.mo1622c(724548705);
                                if (r16 != 0) {
                                    String string2 = context14.getString(R.string.upgrade_most_popular);
                                    C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                    String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase3, str114);
                                    interfaceC0476a6 = interfaceC0476a5;
                                    TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                                } else {
                                    interfaceC0476a6 = interfaceC0476a5;
                                }
                                interfaceC0476a6.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                                InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                                interfaceC0476a10.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                                interfaceC0476a10.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                                LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                                InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                                if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a10.mo1640l();
                                if (interfaceC0476a10.mo1632h()) {
                                    interfaceC0476a10.mo1634i(interfaceC2041a19);
                                } else {
                                    interfaceC0476a10.mo1653s();
                                }
                                interfaceC0476a10.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                                interfaceC0476a10.mo1626e();
                                composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                                interfaceC0476a10.mo1622c(2058660585);
                                C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                                if (z20 != 0) {
                                    interfaceC0476a10.mo1622c(-59268257);
                                    jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                    interfaceC0476a10.mo1661w();
                                } else {
                                    interfaceC0476a10.mo1622c(-59268159);
                                    jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                    interfaceC0476a10.mo1661w();
                                }
                                TextKt.m1576c(str116, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                                interfaceC0476a10.mo1622c(724549877);
                                String str118 = str113;
                                if (str118.length() > 0) {
                                    C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                    if (z21) {
                                        interfaceC0476a10.mo1622c(-59267725);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                        interfaceC0476a10.mo1661w();
                                    } else if (z20 != 0) {
                                        interfaceC0476a10.mo1622c(-59267615);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                        interfaceC0476a10.mo1661w();
                                    } else {
                                        interfaceC0476a10.mo1622c(-59267510);
                                        jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                        interfaceC0476a10.mo1661w();
                                    }
                                    long j10 = jM5347f2;
                                    InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                    interfaceC0476a7 = interfaceC0476a10;
                                    TextKt.m1576c(str118, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                                } else {
                                    interfaceC0476a7 = interfaceC0476a10;
                                }
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                    str10 = str7;
                    z16 = z14;
                    z17 = z15;
                    interfaceC2041a3 = interfaceC2041a16;
                }
                c5332q0M1612T = composerImpl.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        UpgradeItemCardKt.m10411a(str, str2, str10, str9, z16, z17, interfaceC2041a3, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 196608;
            z13 = z11;
            i19 = i11 & 64;
            if (i19 != 0) {
                i12 |= 1572864;
                interfaceC2041a2 = interfaceC2041a;
            } else {
                interfaceC2041a2 = interfaceC2041a;
                if ((i10 & 3670016) == 0) {
                    if (composerImplMo1636j.m1600H(interfaceC2041a2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
            }
            i21 = i12;
            if ((i21 & 2995931) == 599186) {
                if (i22 != 0) {
                    str7 = "";
                } else {
                    str7 = str5;
                }
                if (i13 != 0) {
                    str8 = "";
                } else {
                    str8 = str6;
                }
                if (i15 != 0) {
                    z14 = false;
                } else {
                    z14 = z12;
                }
                if (i17 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i19 != 0) {
                    interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final /* bridge */ /* synthetic */ C9072e mo807E() {
                            return C9072e.f47360a;
                        }
                    };
                }
                InterfaceC2041a<C9072e> interfaceC2041a17 = interfaceC2041a2;
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q14 = ComposerKt.f3003a;
                final Context context14 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                InterfaceC0500b interfaceC0500bM11157d13 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                AbstractC10270a abstractC10270a14 = C7499b.m14916N(composerImplMo1636j).f9262d;
                if (z14) {
                    composerImplMo1636j.mo1622c(1853269473);
                    c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                    composerImplMo1636j.m1609Q(false);
                } else {
                    composerImplMo1636j.mo1622c(1853269535);
                    c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                    composerImplMo1636j.m1609Q(false);
                }
                str9 = str8;
                final String str114 = str7;
                final boolean z11114 = z14;
                final boolean z11115 = z15;
                composerImpl = composerImplMo1636j;
                CardKt.m1558b(interfaceC2041a17, interfaceC0500bM11157d13, false, abstractC10270a14, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // cm.InterfaceC2057q
                    /* JADX INFO: renamed from: M */
                    public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                        long jM5363v;
                        Context context15;
                        InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                        InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                        C5304d1 c5304d1;
                        InterfaceC0476a interfaceC0476a3;
                        InterfaceC2041a<ComposeUiNode> interfaceC2041a18;
                        C7218l c7218lM14543a;
                        long jM11581a;
                        InterfaceC0476a interfaceC0476a4;
                        String str115;
                        InterfaceC0476a interfaceC0476a5;
                        long jM5347f;
                        InterfaceC0476a interfaceC0476a6;
                        long jM11582b;
                        InterfaceC0476a interfaceC0476a7;
                        long jM5347f2;
                        InterfaceC0500b interfaceC0500bM11156c0;
                        InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                        int iIntValue = num.intValue();
                        C5207g.m11111f(interfaceC9771b, "$this$Card");
                        if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                            interfaceC0476a8.mo1650q();
                        } else {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q15 = ComposerKt.f3003a;
                            InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                            boolean z20 = z11115;
                            boolean z21 = z11114;
                            if (z21) {
                                interfaceC0476a8.mo1622c(1155538318);
                                jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                interfaceC0476a8.mo1661w();
                            } else if (z20) {
                                interfaceC0476a8.mo1622c(1155538428);
                                jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                interfaceC0476a8.mo1661w();
                            } else {
                                interfaceC0476a8.mo1622c(1155538516);
                                jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                interfaceC0476a8.mo1661w();
                            }
                            InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                            String str116 = str;
                            String str117 = str2;
                            interfaceC0476a8.mo1622c(-483455358);
                            C0438a.f fVar = C0438a.f2429a;
                            InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                            interfaceC0476a8.mo1622c(-1323940314);
                            C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                            InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                            C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                            LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                            C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                            InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                            ComposeUiNode.f3726n.getClass();
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a19 = ComposeUiNode.Companion.f3728b;
                            ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                            if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a8.mo1640l();
                            if (interfaceC0476a8.mo1632h()) {
                                interfaceC0476a8.mo1634i(interfaceC2041a19);
                            } else {
                                interfaceC0476a8.mo1653s();
                            }
                            interfaceC0476a8.mo1644n();
                            InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                            InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                            C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                            interfaceC0476a8.mo1626e();
                            composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                            interfaceC0476a8.mo1622c(2058660585);
                            interfaceC0476a8.mo1622c(724544551);
                            Context context16 = context14;
                            if (z20) {
                                String string = context16.getString(R.string.upgrade_special_offer);
                                C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                String upperCase = string.toUpperCase(Locale.ROOT);
                                context15 = context16;
                                C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                interfaceC2056p2 = interfaceC2056p6;
                                c5304d1 = c5304d4;
                                interfaceC2056p = interfaceC2056p4;
                                interfaceC0476a3 = interfaceC0476a8;
                                TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                            } else {
                                context15 = context16;
                                interfaceC2056p = interfaceC2056p4;
                                interfaceC2056p2 = interfaceC2056p6;
                                c5304d1 = c5304d4;
                                interfaceC0476a3 = interfaceC0476a8;
                            }
                            interfaceC0476a3.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                            C0438a.d dVar = C0438a.f2432d;
                            C7886b.b bVar = InterfaceC7885a.a.f42994f;
                            InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                            interfaceC0476a9.mo1622c(693286680);
                            InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                            interfaceC0476a9.mo1622c(-1323940314);
                            InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                            LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                            C5304d1 c5304d5 = c5304d1;
                            InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                            ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                            if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a9.mo1640l();
                            if (interfaceC0476a9.mo1632h()) {
                                interfaceC2041a18 = interfaceC2041a19;
                                interfaceC0476a9.mo1634i(interfaceC2041a18);
                            } else {
                                interfaceC2041a18 = interfaceC2041a19;
                                interfaceC0476a9.mo1653s();
                            }
                            interfaceC0476a9.mo1644n();
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                            C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                            interfaceC0476a9.mo1626e();
                            composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                            interfaceC0476a9.mo1622c(2058660585);
                            C6401a c6401a = C6401a.f36861a;
                            if (z20 != 0) {
                                interfaceC0476a9.mo1622c(-59272409);
                                c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                interfaceC0476a9.mo1661w();
                            } else {
                                interfaceC0476a9.mo1622c(-59272023);
                                c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                interfaceC0476a9.mo1661w();
                            }
                            C7218l c7218l = c7218lM14543a;
                            if (r16 != 0 || z20) {
                                interfaceC0476a9.mo1622c(-59271884);
                                jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                interfaceC0476a9.mo1661w();
                            } else {
                                interfaceC0476a9.mo1622c(-59271795);
                                jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                interfaceC0476a9.mo1661w();
                            }
                            InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a110 = interfaceC2041a18;
                            int i23 = i21;
                            TextKt.m1576c(str116, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                            interfaceC0476a9.mo1622c(724546263);
                            String str118 = str9;
                            if (str118.length() > 0) {
                                String upperCase2 = str118.toUpperCase(Locale.ROOT);
                                C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                if (z20 != 0) {
                                    interfaceC0476a9.mo1622c(-59270956);
                                    interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59270264);
                                    interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                    interfaceC0476a9.mo1661w();
                                }
                                interfaceC0476a4 = interfaceC0476a9;
                                str115 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                            } else {
                                interfaceC0476a4 = interfaceC0476a9;
                                str115 = r7;
                            }
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1663x();
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                            if (r16 != 0) {
                                interfaceC0476a5 = interfaceC0476a4;
                                interfaceC0476a5.mo1622c(724548425);
                                jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                interfaceC0476a5.mo1661w();
                            } else {
                                interfaceC0476a5 = interfaceC0476a4;
                                if (z20 != 0) {
                                    interfaceC0476a5.mo1622c(724548519);
                                    jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                    interfaceC0476a5.mo1661w();
                                } else {
                                    interfaceC0476a5.mo1622c(724548598);
                                    jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                    interfaceC0476a5.mo1661w();
                                }
                            }
                            DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                            interfaceC0476a5.mo1622c(724548705);
                            if (r16 != 0) {
                                String string2 = context15.getString(R.string.upgrade_most_popular);
                                C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                C5207g.m11110e(upperCase3, str115);
                                interfaceC0476a6 = interfaceC0476a5;
                                TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                            } else {
                                interfaceC0476a6 = interfaceC0476a5;
                            }
                            interfaceC0476a6.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                            InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                            interfaceC0476a10.mo1622c(693286680);
                            InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                            interfaceC0476a10.mo1622c(-1323940314);
                            InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                            LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                            InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                            ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                            if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a10.mo1640l();
                            if (interfaceC0476a10.mo1632h()) {
                                interfaceC0476a10.mo1634i(interfaceC2041a110);
                            } else {
                                interfaceC0476a10.mo1653s();
                            }
                            interfaceC0476a10.mo1644n();
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                            C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                            interfaceC0476a10.mo1626e();
                            composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                            interfaceC0476a10.mo1622c(2058660585);
                            C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                            if (z20 != 0) {
                                interfaceC0476a10.mo1622c(-59268257);
                                jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                interfaceC0476a10.mo1661w();
                            } else {
                                interfaceC0476a10.mo1622c(-59268159);
                                jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                interfaceC0476a10.mo1661w();
                            }
                            TextKt.m1576c(str117, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                            interfaceC0476a10.mo1622c(724549877);
                            String str119 = str114;
                            if (str119.length() > 0) {
                                C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                if (z21) {
                                    interfaceC0476a10.mo1622c(-59267725);
                                    jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                    interfaceC0476a10.mo1661w();
                                } else if (z20 != 0) {
                                    interfaceC0476a10.mo1622c(-59267615);
                                    jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                    interfaceC0476a10.mo1661w();
                                } else {
                                    interfaceC0476a10.mo1622c(-59267510);
                                    jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                    interfaceC0476a10.mo1661w();
                                }
                                long j10 = jM5347f2;
                                InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                interfaceC0476a7 = interfaceC0476a10;
                                TextKt.m1576c(str119, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                            } else {
                                interfaceC0476a7 = interfaceC0476a10;
                            }
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1663x();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1663x();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                        }
                        return C9072e.f47360a;
                    }
                }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                str10 = str7;
                z16 = z14;
                z17 = z15;
                interfaceC2041a3 = interfaceC2041a17;
            } else {
                if (i22 != 0) {
                    str7 = "";
                } else {
                    str7 = str5;
                }
                if (i13 != 0) {
                    str8 = "";
                } else {
                    str8 = str6;
                }
                if (i15 != 0) {
                    z14 = false;
                } else {
                    z14 = z12;
                }
                if (i17 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i19 != 0) {
                    interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final /* bridge */ /* synthetic */ C9072e mo807E() {
                            return C9072e.f47360a;
                        }
                    };
                }
                InterfaceC2041a<C9072e> interfaceC2041a18 = interfaceC2041a2;
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q15 = ComposerKt.f3003a;
                final Context context15 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                InterfaceC0500b interfaceC0500bM11157d14 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                AbstractC10270a abstractC10270a15 = C7499b.m14916N(composerImplMo1636j).f9262d;
                if (z14) {
                    composerImplMo1636j.mo1622c(1853269473);
                    c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                    composerImplMo1636j.m1609Q(false);
                } else {
                    composerImplMo1636j.mo1622c(1853269535);
                    c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                    composerImplMo1636j.m1609Q(false);
                }
                str9 = str8;
                final String str115 = str7;
                final boolean z11116 = z14;
                final boolean z11117 = z15;
                composerImpl = composerImplMo1636j;
                CardKt.m1558b(interfaceC2041a18, interfaceC0500bM11157d14, false, abstractC10270a15, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // cm.InterfaceC2057q
                    /* JADX INFO: renamed from: M */
                    public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                        long jM5363v;
                        Context context16;
                        InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                        InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                        C5304d1 c5304d1;
                        InterfaceC0476a interfaceC0476a3;
                        InterfaceC2041a<ComposeUiNode> interfaceC2041a19;
                        C7218l c7218lM14543a;
                        long jM11581a;
                        InterfaceC0476a interfaceC0476a4;
                        String str116;
                        InterfaceC0476a interfaceC0476a5;
                        long jM5347f;
                        InterfaceC0476a interfaceC0476a6;
                        long jM11582b;
                        InterfaceC0476a interfaceC0476a7;
                        long jM5347f2;
                        InterfaceC0500b interfaceC0500bM11156c0;
                        InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                        int iIntValue = num.intValue();
                        C5207g.m11111f(interfaceC9771b, "$this$Card");
                        if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                            interfaceC0476a8.mo1650q();
                        } else {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q16 = ComposerKt.f3003a;
                            InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                            boolean z20 = z11117;
                            boolean z21 = z11116;
                            if (z21) {
                                interfaceC0476a8.mo1622c(1155538318);
                                jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                interfaceC0476a8.mo1661w();
                            } else if (z20) {
                                interfaceC0476a8.mo1622c(1155538428);
                                jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                interfaceC0476a8.mo1661w();
                            } else {
                                interfaceC0476a8.mo1622c(1155538516);
                                jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                interfaceC0476a8.mo1661w();
                            }
                            InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                            String str117 = str;
                            String str118 = str2;
                            interfaceC0476a8.mo1622c(-483455358);
                            C0438a.f fVar = C0438a.f2429a;
                            InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                            interfaceC0476a8.mo1622c(-1323940314);
                            C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                            InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                            C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                            LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                            C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                            InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                            ComposeUiNode.f3726n.getClass();
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a110 = ComposeUiNode.Companion.f3728b;
                            ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                            if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a8.mo1640l();
                            if (interfaceC0476a8.mo1632h()) {
                                interfaceC0476a8.mo1634i(interfaceC2041a110);
                            } else {
                                interfaceC0476a8.mo1653s();
                            }
                            interfaceC0476a8.mo1644n();
                            InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                            InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                            C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                            interfaceC0476a8.mo1626e();
                            composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                            interfaceC0476a8.mo1622c(2058660585);
                            interfaceC0476a8.mo1622c(724544551);
                            Context context17 = context15;
                            if (z20) {
                                String string = context17.getString(R.string.upgrade_special_offer);
                                C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                String upperCase = string.toUpperCase(Locale.ROOT);
                                context16 = context17;
                                C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                interfaceC2056p2 = interfaceC2056p6;
                                c5304d1 = c5304d4;
                                interfaceC2056p = interfaceC2056p4;
                                interfaceC0476a3 = interfaceC0476a8;
                                TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                            } else {
                                context16 = context17;
                                interfaceC2056p = interfaceC2056p4;
                                interfaceC2056p2 = interfaceC2056p6;
                                c5304d1 = c5304d4;
                                interfaceC0476a3 = interfaceC0476a8;
                            }
                            interfaceC0476a3.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                            C0438a.d dVar = C0438a.f2432d;
                            C7886b.b bVar = InterfaceC7885a.a.f42994f;
                            InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                            interfaceC0476a9.mo1622c(693286680);
                            InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                            interfaceC0476a9.mo1622c(-1323940314);
                            InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                            LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                            C5304d1 c5304d5 = c5304d1;
                            InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                            ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                            if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a9.mo1640l();
                            if (interfaceC0476a9.mo1632h()) {
                                interfaceC2041a19 = interfaceC2041a110;
                                interfaceC0476a9.mo1634i(interfaceC2041a19);
                            } else {
                                interfaceC2041a19 = interfaceC2041a110;
                                interfaceC0476a9.mo1653s();
                            }
                            interfaceC0476a9.mo1644n();
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                            C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                            interfaceC0476a9.mo1626e();
                            composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                            interfaceC0476a9.mo1622c(2058660585);
                            C6401a c6401a = C6401a.f36861a;
                            if (z20 != 0) {
                                interfaceC0476a9.mo1622c(-59272409);
                                c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                interfaceC0476a9.mo1661w();
                            } else {
                                interfaceC0476a9.mo1622c(-59272023);
                                c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                interfaceC0476a9.mo1661w();
                            }
                            C7218l c7218l = c7218lM14543a;
                            if (r16 != 0 || z20) {
                                interfaceC0476a9.mo1622c(-59271884);
                                jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                interfaceC0476a9.mo1661w();
                            } else {
                                interfaceC0476a9.mo1622c(-59271795);
                                jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                interfaceC0476a9.mo1661w();
                            }
                            InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a111 = interfaceC2041a19;
                            int i23 = i21;
                            TextKt.m1576c(str117, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                            interfaceC0476a9.mo1622c(724546263);
                            String str119 = str9;
                            if (str119.length() > 0) {
                                String upperCase2 = str119.toUpperCase(Locale.ROOT);
                                C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                if (z20 != 0) {
                                    interfaceC0476a9.mo1622c(-59270956);
                                    interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59270264);
                                    interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                    interfaceC0476a9.mo1661w();
                                }
                                interfaceC0476a4 = interfaceC0476a9;
                                str116 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                            } else {
                                interfaceC0476a4 = interfaceC0476a9;
                                str116 = r7;
                            }
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1663x();
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                            if (r16 != 0) {
                                interfaceC0476a5 = interfaceC0476a4;
                                interfaceC0476a5.mo1622c(724548425);
                                jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                interfaceC0476a5.mo1661w();
                            } else {
                                interfaceC0476a5 = interfaceC0476a4;
                                if (z20 != 0) {
                                    interfaceC0476a5.mo1622c(724548519);
                                    jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                    interfaceC0476a5.mo1661w();
                                } else {
                                    interfaceC0476a5.mo1622c(724548598);
                                    jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                    interfaceC0476a5.mo1661w();
                                }
                            }
                            DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                            interfaceC0476a5.mo1622c(724548705);
                            if (r16 != 0) {
                                String string2 = context16.getString(R.string.upgrade_most_popular);
                                C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                C5207g.m11110e(upperCase3, str116);
                                interfaceC0476a6 = interfaceC0476a5;
                                TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                            } else {
                                interfaceC0476a6 = interfaceC0476a5;
                            }
                            interfaceC0476a6.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                            InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                            interfaceC0476a10.mo1622c(693286680);
                            InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                            interfaceC0476a10.mo1622c(-1323940314);
                            InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                            LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                            InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                            ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                            if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a10.mo1640l();
                            if (interfaceC0476a10.mo1632h()) {
                                interfaceC0476a10.mo1634i(interfaceC2041a111);
                            } else {
                                interfaceC0476a10.mo1653s();
                            }
                            interfaceC0476a10.mo1644n();
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                            C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                            interfaceC0476a10.mo1626e();
                            composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                            interfaceC0476a10.mo1622c(2058660585);
                            C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                            if (z20 != 0) {
                                interfaceC0476a10.mo1622c(-59268257);
                                jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                interfaceC0476a10.mo1661w();
                            } else {
                                interfaceC0476a10.mo1622c(-59268159);
                                jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                interfaceC0476a10.mo1661w();
                            }
                            TextKt.m1576c(str118, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                            interfaceC0476a10.mo1622c(724549877);
                            String str1110 = str115;
                            if (str1110.length() > 0) {
                                C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                if (z21) {
                                    interfaceC0476a10.mo1622c(-59267725);
                                    jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                    interfaceC0476a10.mo1661w();
                                } else if (z20 != 0) {
                                    interfaceC0476a10.mo1622c(-59267615);
                                    jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                    interfaceC0476a10.mo1661w();
                                } else {
                                    interfaceC0476a10.mo1622c(-59267510);
                                    jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                    interfaceC0476a10.mo1661w();
                                }
                                long j10 = jM5347f2;
                                InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                interfaceC0476a7 = interfaceC0476a10;
                                TextKt.m1576c(str1110, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                            } else {
                                interfaceC0476a7 = interfaceC0476a10;
                            }
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1663x();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1663x();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                        }
                        return C9072e.f47360a;
                    }
                }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                str10 = str7;
                z16 = z14;
                z17 = z15;
                interfaceC2041a3 = interfaceC2041a18;
            }
            c5332q0M1612T = composerImpl.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    UpgradeItemCardKt.m10411a(str, str2, str10, str9, z16, z17, interfaceC2041a3, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 384;
        str5 = str3;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                str6 = str4;
                if (composerImplMo1636j.mo1665y(str6)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    z12 = z10;
                    if (composerImplMo1636j.m1598G(z12)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((458752 & i10) == 0) {
                        z13 = z11;
                        if (composerImplMo1636j.m1598G(z13)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 64;
                    if (i19 != 0) {
                        i12 |= 1572864;
                        interfaceC2041a2 = interfaceC2041a;
                    } else {
                        interfaceC2041a2 = interfaceC2041a;
                        if ((i10 & 3670016) == 0) {
                            if (composerImplMo1636j.m1600H(interfaceC2041a2)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i12 |= i20;
                        }
                    }
                    i21 = i12;
                    if ((i21 & 2995931) == 599186) {
                        if (i22 != 0) {
                            str7 = "";
                        } else {
                            str7 = str5;
                        }
                        if (i13 != 0) {
                            str8 = "";
                        } else {
                            str8 = str6;
                        }
                        if (i15 != 0) {
                            z14 = false;
                        } else {
                            z14 = z12;
                        }
                        if (i17 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i19 != 0) {
                            interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                    return C9072e.f47360a;
                                }
                            };
                        }
                        InterfaceC2041a<C9072e> interfaceC2041a19 = interfaceC2041a2;
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q16 = ComposerKt.f3003a;
                        final Context context16 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                        InterfaceC0500b interfaceC0500bM11157d15 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                        AbstractC10270a abstractC10270a16 = C7499b.m14916N(composerImplMo1636j).f9262d;
                        if (z14) {
                            composerImplMo1636j.mo1622c(1853269473);
                            c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                            composerImplMo1636j.m1609Q(false);
                        } else {
                            composerImplMo1636j.mo1622c(1853269535);
                            c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                            composerImplMo1636j.m1609Q(false);
                        }
                        str9 = str8;
                        final String str116 = str7;
                        final boolean z11118 = z14;
                        final boolean z11119 = z15;
                        composerImpl = composerImplMo1636j;
                        CardKt.m1558b(interfaceC2041a19, interfaceC0500bM11157d15, false, abstractC10270a16, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // cm.InterfaceC2057q
                            /* JADX INFO: renamed from: M */
                            public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                                long jM5363v;
                                Context context17;
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                                C5304d1 c5304d1;
                                InterfaceC0476a interfaceC0476a3;
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a110;
                                C7218l c7218lM14543a;
                                long jM11581a;
                                InterfaceC0476a interfaceC0476a4;
                                String str117;
                                InterfaceC0476a interfaceC0476a5;
                                long jM5347f;
                                InterfaceC0476a interfaceC0476a6;
                                long jM11582b;
                                InterfaceC0476a interfaceC0476a7;
                                long jM5347f2;
                                InterfaceC0500b interfaceC0500bM11156c0;
                                InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                                int iIntValue = num.intValue();
                                C5207g.m11111f(interfaceC9771b, "$this$Card");
                                if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                                    interfaceC0476a8.mo1650q();
                                } else {
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q17 = ComposerKt.f3003a;
                                    InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                    boolean z20 = z11119;
                                    boolean z21 = z11118;
                                    if (z21) {
                                        interfaceC0476a8.mo1622c(1155538318);
                                        jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                        interfaceC0476a8.mo1661w();
                                    } else if (z20) {
                                        interfaceC0476a8.mo1622c(1155538428);
                                        jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                        interfaceC0476a8.mo1661w();
                                    } else {
                                        interfaceC0476a8.mo1622c(1155538516);
                                        jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                        interfaceC0476a8.mo1661w();
                                    }
                                    InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                                    String str118 = str;
                                    String str119 = str2;
                                    interfaceC0476a8.mo1622c(-483455358);
                                    C0438a.f fVar = C0438a.f2429a;
                                    InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                                    interfaceC0476a8.mo1622c(-1323940314);
                                    C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                                    InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                                    C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                                    LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                                    C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                                    InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                                    ComposeUiNode.f3726n.getClass();
                                    InterfaceC2041a<ComposeUiNode> interfaceC2041a111 = ComposeUiNode.Companion.f3728b;
                                    ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                                    if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a8.mo1640l();
                                    if (interfaceC0476a8.mo1632h()) {
                                        interfaceC0476a8.mo1634i(interfaceC2041a111);
                                    } else {
                                        interfaceC0476a8.mo1653s();
                                    }
                                    interfaceC0476a8.mo1644n();
                                    InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                                    InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                                    C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                                    interfaceC0476a8.mo1626e();
                                    composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                                    interfaceC0476a8.mo1622c(2058660585);
                                    interfaceC0476a8.mo1622c(724544551);
                                    Context context18 = context16;
                                    if (z20) {
                                        String string = context18.getString(R.string.upgrade_special_offer);
                                        C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                        String upperCase = string.toUpperCase(Locale.ROOT);
                                        context17 = context18;
                                        C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                        interfaceC2056p2 = interfaceC2056p6;
                                        c5304d1 = c5304d4;
                                        interfaceC2056p = interfaceC2056p4;
                                        interfaceC0476a3 = interfaceC0476a8;
                                        TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                                    } else {
                                        context17 = context18;
                                        interfaceC2056p = interfaceC2056p4;
                                        interfaceC2056p2 = interfaceC2056p6;
                                        c5304d1 = c5304d4;
                                        interfaceC0476a3 = interfaceC0476a8;
                                    }
                                    interfaceC0476a3.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                                    C0438a.d dVar = C0438a.f2432d;
                                    C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                    InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                                    interfaceC0476a9.mo1622c(693286680);
                                    InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                                    interfaceC0476a9.mo1622c(-1323940314);
                                    InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                                    LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                                    C5304d1 c5304d5 = c5304d1;
                                    InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                                    ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                                    if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a9.mo1640l();
                                    if (interfaceC0476a9.mo1632h()) {
                                        interfaceC2041a110 = interfaceC2041a111;
                                        interfaceC0476a9.mo1634i(interfaceC2041a110);
                                    } else {
                                        interfaceC2041a110 = interfaceC2041a111;
                                        interfaceC0476a9.mo1653s();
                                    }
                                    interfaceC0476a9.mo1644n();
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                                    C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                                    interfaceC0476a9.mo1626e();
                                    composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                    interfaceC0476a9.mo1622c(2058660585);
                                    C6401a c6401a = C6401a.f36861a;
                                    if (z20 != 0) {
                                        interfaceC0476a9.mo1622c(-59272409);
                                        c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59272023);
                                        c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                        interfaceC0476a9.mo1661w();
                                    }
                                    C7218l c7218l = c7218lM14543a;
                                    if (r16 != 0 || z20) {
                                        interfaceC0476a9.mo1622c(-59271884);
                                        jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59271795);
                                        jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                        interfaceC0476a9.mo1661w();
                                    }
                                    InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                                    InterfaceC2041a<ComposeUiNode> interfaceC2041a112 = interfaceC2041a110;
                                    int i23 = i21;
                                    TextKt.m1576c(str118, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                                    interfaceC0476a9.mo1622c(724546263);
                                    String str1110 = str9;
                                    if (str1110.length() > 0) {
                                        String upperCase2 = str1110.toUpperCase(Locale.ROOT);
                                        C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                        C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                        long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                        if (z20 != 0) {
                                            interfaceC0476a9.mo1622c(-59270956);
                                            interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                            interfaceC0476a9.mo1661w();
                                        } else {
                                            interfaceC0476a9.mo1622c(-59270264);
                                            interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                            interfaceC0476a9.mo1661w();
                                        }
                                        interfaceC0476a4 = interfaceC0476a9;
                                        str117 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                        TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                                    } else {
                                        interfaceC0476a4 = interfaceC0476a9;
                                        str117 = r7;
                                    }
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1663x();
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                                    if (r16 != 0) {
                                        interfaceC0476a5 = interfaceC0476a4;
                                        interfaceC0476a5.mo1622c(724548425);
                                        jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                        interfaceC0476a5.mo1661w();
                                    } else {
                                        interfaceC0476a5 = interfaceC0476a4;
                                        if (z20 != 0) {
                                            interfaceC0476a5.mo1622c(724548519);
                                            jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                            interfaceC0476a5.mo1661w();
                                        } else {
                                            interfaceC0476a5.mo1622c(724548598);
                                            jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                            interfaceC0476a5.mo1661w();
                                        }
                                    }
                                    DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                                    interfaceC0476a5.mo1622c(724548705);
                                    if (r16 != 0) {
                                        String string2 = context17.getString(R.string.upgrade_most_popular);
                                        C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                        String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                        C5207g.m11110e(upperCase3, str117);
                                        interfaceC0476a6 = interfaceC0476a5;
                                        TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                                    } else {
                                        interfaceC0476a6 = interfaceC0476a5;
                                    }
                                    interfaceC0476a6.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                                    InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                                    interfaceC0476a10.mo1622c(693286680);
                                    InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                                    interfaceC0476a10.mo1622c(-1323940314);
                                    InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                                    LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                                    InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                                    ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                                    if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a10.mo1640l();
                                    if (interfaceC0476a10.mo1632h()) {
                                        interfaceC0476a10.mo1634i(interfaceC2041a112);
                                    } else {
                                        interfaceC0476a10.mo1653s();
                                    }
                                    interfaceC0476a10.mo1644n();
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                                    C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                                    interfaceC0476a10.mo1626e();
                                    composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                                    interfaceC0476a10.mo1622c(2058660585);
                                    C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                                    if (z20 != 0) {
                                        interfaceC0476a10.mo1622c(-59268257);
                                        jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                        interfaceC0476a10.mo1661w();
                                    } else {
                                        interfaceC0476a10.mo1622c(-59268159);
                                        jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                        interfaceC0476a10.mo1661w();
                                    }
                                    TextKt.m1576c(str119, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                                    interfaceC0476a10.mo1622c(724549877);
                                    String str1111 = str116;
                                    if (str1111.length() > 0) {
                                        C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                        if (z21) {
                                            interfaceC0476a10.mo1622c(-59267725);
                                            jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                            interfaceC0476a10.mo1661w();
                                        } else if (z20 != 0) {
                                            interfaceC0476a10.mo1622c(-59267615);
                                            jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                            interfaceC0476a10.mo1661w();
                                        } else {
                                            interfaceC0476a10.mo1622c(-59267510);
                                            jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                            interfaceC0476a10.mo1661w();
                                        }
                                        long j10 = jM5347f2;
                                        InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                        interfaceC0476a7 = interfaceC0476a10;
                                        TextKt.m1576c(str1111, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                                    } else {
                                        interfaceC0476a7 = interfaceC0476a10;
                                    }
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1663x();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1663x();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                }
                                return C9072e.f47360a;
                            }
                        }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                        str10 = str7;
                        z16 = z14;
                        z17 = z15;
                        interfaceC2041a3 = interfaceC2041a19;
                    } else {
                        if (i22 != 0) {
                            str7 = "";
                        } else {
                            str7 = str5;
                        }
                        if (i13 != 0) {
                            str8 = "";
                        } else {
                            str8 = str6;
                        }
                        if (i15 != 0) {
                            z14 = false;
                        } else {
                            z14 = z12;
                        }
                        if (i17 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i19 != 0) {
                            interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                    return C9072e.f47360a;
                                }
                            };
                        }
                        InterfaceC2041a<C9072e> interfaceC2041a110 = interfaceC2041a2;
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q17 = ComposerKt.f3003a;
                        final Context context17 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                        InterfaceC0500b interfaceC0500bM11157d16 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                        AbstractC10270a abstractC10270a17 = C7499b.m14916N(composerImplMo1636j).f9262d;
                        if (z14) {
                            composerImplMo1636j.mo1622c(1853269473);
                            c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                            composerImplMo1636j.m1609Q(false);
                        } else {
                            composerImplMo1636j.mo1622c(1853269535);
                            c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                            composerImplMo1636j.m1609Q(false);
                        }
                        str9 = str8;
                        final String str117 = str7;
                        final boolean z111110 = z14;
                        final boolean z111111 = z15;
                        composerImpl = composerImplMo1636j;
                        CardKt.m1558b(interfaceC2041a110, interfaceC0500bM11157d16, false, abstractC10270a17, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // cm.InterfaceC2057q
                            /* JADX INFO: renamed from: M */
                            public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                                long jM5363v;
                                Context context18;
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                                C5304d1 c5304d1;
                                InterfaceC0476a interfaceC0476a3;
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a111;
                                C7218l c7218lM14543a;
                                long jM11581a;
                                InterfaceC0476a interfaceC0476a4;
                                String str118;
                                InterfaceC0476a interfaceC0476a5;
                                long jM5347f;
                                InterfaceC0476a interfaceC0476a6;
                                long jM11582b;
                                InterfaceC0476a interfaceC0476a7;
                                long jM5347f2;
                                InterfaceC0500b interfaceC0500bM11156c0;
                                InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                                int iIntValue = num.intValue();
                                C5207g.m11111f(interfaceC9771b, "$this$Card");
                                if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                                    interfaceC0476a8.mo1650q();
                                } else {
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q18 = ComposerKt.f3003a;
                                    InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                    boolean z20 = z111111;
                                    boolean z21 = z111110;
                                    if (z21) {
                                        interfaceC0476a8.mo1622c(1155538318);
                                        jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                        interfaceC0476a8.mo1661w();
                                    } else if (z20) {
                                        interfaceC0476a8.mo1622c(1155538428);
                                        jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                        interfaceC0476a8.mo1661w();
                                    } else {
                                        interfaceC0476a8.mo1622c(1155538516);
                                        jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                        interfaceC0476a8.mo1661w();
                                    }
                                    InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                                    String str119 = str;
                                    String str1110 = str2;
                                    interfaceC0476a8.mo1622c(-483455358);
                                    C0438a.f fVar = C0438a.f2429a;
                                    InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                                    interfaceC0476a8.mo1622c(-1323940314);
                                    C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                                    InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                                    C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                                    LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                                    C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                                    InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                                    ComposeUiNode.f3726n.getClass();
                                    InterfaceC2041a<ComposeUiNode> interfaceC2041a112 = ComposeUiNode.Companion.f3728b;
                                    ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                                    if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a8.mo1640l();
                                    if (interfaceC0476a8.mo1632h()) {
                                        interfaceC0476a8.mo1634i(interfaceC2041a112);
                                    } else {
                                        interfaceC0476a8.mo1653s();
                                    }
                                    interfaceC0476a8.mo1644n();
                                    InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                                    InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                                    C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                                    C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                                    interfaceC0476a8.mo1626e();
                                    composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                                    interfaceC0476a8.mo1622c(2058660585);
                                    interfaceC0476a8.mo1622c(724544551);
                                    Context context19 = context17;
                                    if (z20) {
                                        String string = context19.getString(R.string.upgrade_special_offer);
                                        C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                        String upperCase = string.toUpperCase(Locale.ROOT);
                                        context18 = context19;
                                        C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                        interfaceC2056p2 = interfaceC2056p6;
                                        c5304d1 = c5304d4;
                                        interfaceC2056p = interfaceC2056p4;
                                        interfaceC0476a3 = interfaceC0476a8;
                                        TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                                    } else {
                                        context18 = context19;
                                        interfaceC2056p = interfaceC2056p4;
                                        interfaceC2056p2 = interfaceC2056p6;
                                        c5304d1 = c5304d4;
                                        interfaceC0476a3 = interfaceC0476a8;
                                    }
                                    interfaceC0476a3.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                                    C0438a.d dVar = C0438a.f2432d;
                                    C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                    InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                                    interfaceC0476a9.mo1622c(693286680);
                                    InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                                    interfaceC0476a9.mo1622c(-1323940314);
                                    InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                                    LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                                    C5304d1 c5304d5 = c5304d1;
                                    InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                                    ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                                    if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a9.mo1640l();
                                    if (interfaceC0476a9.mo1632h()) {
                                        interfaceC2041a111 = interfaceC2041a112;
                                        interfaceC0476a9.mo1634i(interfaceC2041a111);
                                    } else {
                                        interfaceC2041a111 = interfaceC2041a112;
                                        interfaceC0476a9.mo1653s();
                                    }
                                    interfaceC0476a9.mo1644n();
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                                    C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                                    InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                                    interfaceC0476a9.mo1626e();
                                    composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                    interfaceC0476a9.mo1622c(2058660585);
                                    C6401a c6401a = C6401a.f36861a;
                                    if (z20 != 0) {
                                        interfaceC0476a9.mo1622c(-59272409);
                                        c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59272023);
                                        c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                        interfaceC0476a9.mo1661w();
                                    }
                                    C7218l c7218l = c7218lM14543a;
                                    if (r16 != 0 || z20) {
                                        interfaceC0476a9.mo1622c(-59271884);
                                        jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59271795);
                                        jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                        interfaceC0476a9.mo1661w();
                                    }
                                    InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                                    InterfaceC2041a<ComposeUiNode> interfaceC2041a113 = interfaceC2041a111;
                                    int i23 = i21;
                                    TextKt.m1576c(str119, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                                    interfaceC0476a9.mo1622c(724546263);
                                    String str1111 = str9;
                                    if (str1111.length() > 0) {
                                        String upperCase2 = str1111.toUpperCase(Locale.ROOT);
                                        C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                        C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                        long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                        if (z20 != 0) {
                                            interfaceC0476a9.mo1622c(-59270956);
                                            interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                            interfaceC0476a9.mo1661w();
                                        } else {
                                            interfaceC0476a9.mo1622c(-59270264);
                                            interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                            interfaceC0476a9.mo1661w();
                                        }
                                        interfaceC0476a4 = interfaceC0476a9;
                                        str118 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                        TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                                    } else {
                                        interfaceC0476a4 = interfaceC0476a9;
                                        str118 = r7;
                                    }
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1663x();
                                    interfaceC0476a4.mo1661w();
                                    interfaceC0476a4.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                                    if (r16 != 0) {
                                        interfaceC0476a5 = interfaceC0476a4;
                                        interfaceC0476a5.mo1622c(724548425);
                                        jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                        interfaceC0476a5.mo1661w();
                                    } else {
                                        interfaceC0476a5 = interfaceC0476a4;
                                        if (z20 != 0) {
                                            interfaceC0476a5.mo1622c(724548519);
                                            jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                            interfaceC0476a5.mo1661w();
                                        } else {
                                            interfaceC0476a5.mo1622c(724548598);
                                            jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                            interfaceC0476a5.mo1661w();
                                        }
                                    }
                                    DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                                    interfaceC0476a5.mo1622c(724548705);
                                    if (r16 != 0) {
                                        String string2 = context18.getString(R.string.upgrade_most_popular);
                                        C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                        String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                        C5207g.m11110e(upperCase3, str118);
                                        interfaceC0476a6 = interfaceC0476a5;
                                        TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                                    } else {
                                        interfaceC0476a6 = interfaceC0476a5;
                                    }
                                    interfaceC0476a6.mo1661w();
                                    InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                                    InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                                    interfaceC0476a10.mo1622c(693286680);
                                    InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                                    interfaceC0476a10.mo1622c(-1323940314);
                                    InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                                    LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                                    InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                                    ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                                    if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a10.mo1640l();
                                    if (interfaceC0476a10.mo1632h()) {
                                        interfaceC0476a10.mo1634i(interfaceC2041a113);
                                    } else {
                                        interfaceC0476a10.mo1653s();
                                    }
                                    interfaceC0476a10.mo1644n();
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                                    C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                                    C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                                    interfaceC0476a10.mo1626e();
                                    composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                                    interfaceC0476a10.mo1622c(2058660585);
                                    C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                                    if (z20 != 0) {
                                        interfaceC0476a10.mo1622c(-59268257);
                                        jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                        interfaceC0476a10.mo1661w();
                                    } else {
                                        interfaceC0476a10.mo1622c(-59268159);
                                        jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                        interfaceC0476a10.mo1661w();
                                    }
                                    TextKt.m1576c(str1110, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                                    interfaceC0476a10.mo1622c(724549877);
                                    String str1112 = str117;
                                    if (str1112.length() > 0) {
                                        C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                        if (z21) {
                                            interfaceC0476a10.mo1622c(-59267725);
                                            jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                            interfaceC0476a10.mo1661w();
                                        } else if (z20 != 0) {
                                            interfaceC0476a10.mo1622c(-59267615);
                                            jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                            interfaceC0476a10.mo1661w();
                                        } else {
                                            interfaceC0476a10.mo1622c(-59267510);
                                            jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                            interfaceC0476a10.mo1661w();
                                        }
                                        long j10 = jM5347f2;
                                        InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                        interfaceC0476a7 = interfaceC0476a10;
                                        TextKt.m1576c(str1112, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                                    } else {
                                        interfaceC0476a7 = interfaceC0476a10;
                                    }
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1663x();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1663x();
                                    interfaceC0476a7.mo1661w();
                                    interfaceC0476a7.mo1661w();
                                }
                                return C9072e.f47360a;
                            }
                        }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                        str10 = str7;
                        z16 = z14;
                        z17 = z15;
                        interfaceC2041a3 = interfaceC2041a110;
                    }
                    c5332q0M1612T = composerImpl.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            UpgradeItemCardKt.m10411a(str, str2, str10, str9, z16, z17, interfaceC2041a3, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i12 |= 196608;
                z13 = z11;
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                    interfaceC2041a2 = interfaceC2041a;
                } else {
                    interfaceC2041a2 = interfaceC2041a;
                    if ((i10 & 3670016) == 0) {
                        if (composerImplMo1636j.m1600H(interfaceC2041a2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                }
                i21 = i12;
                if ((i21 & 2995931) == 599186) {
                    if (i22 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i13 != 0) {
                        str8 = "";
                    } else {
                        str8 = str6;
                    }
                    if (i15 != 0) {
                        z14 = false;
                    } else {
                        z14 = z12;
                    }
                    if (i17 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i19 != 0) {
                        interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        };
                    }
                    InterfaceC2041a<C9072e> interfaceC2041a111 = interfaceC2041a2;
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q18 = ComposerKt.f3003a;
                    final Context context18 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                    InterfaceC0500b interfaceC0500bM11157d17 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                    AbstractC10270a abstractC10270a18 = C7499b.m14916N(composerImplMo1636j).f9262d;
                    if (z14) {
                        composerImplMo1636j.mo1622c(1853269473);
                        c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    } else {
                        composerImplMo1636j.mo1622c(1853269535);
                        c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    }
                    str9 = str8;
                    final String str118 = str7;
                    final boolean z111112 = z14;
                    final boolean z111113 = z15;
                    composerImpl = composerImplMo1636j;
                    CardKt.m1558b(interfaceC2041a111, interfaceC0500bM11157d17, false, abstractC10270a18, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // cm.InterfaceC2057q
                        /* JADX INFO: renamed from: M */
                        public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                            long jM5363v;
                            Context context19;
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                            C5304d1 c5304d1;
                            InterfaceC0476a interfaceC0476a3;
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a112;
                            C7218l c7218lM14543a;
                            long jM11581a;
                            InterfaceC0476a interfaceC0476a4;
                            String str119;
                            InterfaceC0476a interfaceC0476a5;
                            long jM5347f;
                            InterfaceC0476a interfaceC0476a6;
                            long jM11582b;
                            InterfaceC0476a interfaceC0476a7;
                            long jM5347f2;
                            InterfaceC0500b interfaceC0500bM11156c0;
                            InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                            int iIntValue = num.intValue();
                            C5207g.m11111f(interfaceC9771b, "$this$Card");
                            if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                                interfaceC0476a8.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q19 = ComposerKt.f3003a;
                                InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                boolean z20 = z111113;
                                boolean z21 = z111112;
                                if (z21) {
                                    interfaceC0476a8.mo1622c(1155538318);
                                    jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                    interfaceC0476a8.mo1661w();
                                } else if (z20) {
                                    interfaceC0476a8.mo1622c(1155538428);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                    interfaceC0476a8.mo1661w();
                                } else {
                                    interfaceC0476a8.mo1622c(1155538516);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                    interfaceC0476a8.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                                String str1110 = str;
                                String str1111 = str2;
                                interfaceC0476a8.mo1622c(-483455358);
                                C0438a.f fVar = C0438a.f2429a;
                                InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                                interfaceC0476a8.mo1622c(-1323940314);
                                C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                                InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                                C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                                LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                                C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                                InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                                ComposeUiNode.f3726n.getClass();
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a113 = ComposeUiNode.Companion.f3728b;
                                ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                                if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a8.mo1640l();
                                if (interfaceC0476a8.mo1632h()) {
                                    interfaceC0476a8.mo1634i(interfaceC2041a113);
                                } else {
                                    interfaceC0476a8.mo1653s();
                                }
                                interfaceC0476a8.mo1644n();
                                InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                                InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                                C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                                interfaceC0476a8.mo1626e();
                                composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                                interfaceC0476a8.mo1622c(2058660585);
                                interfaceC0476a8.mo1622c(724544551);
                                Context context110 = context18;
                                if (z20) {
                                    String string = context110.getString(R.string.upgrade_special_offer);
                                    C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                    String upperCase = string.toUpperCase(Locale.ROOT);
                                    context19 = context110;
                                    C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                    TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                                } else {
                                    context19 = context110;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                }
                                interfaceC0476a3.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                                C0438a.d dVar = C0438a.f2432d;
                                C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                                interfaceC0476a9.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                                interfaceC0476a9.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                                LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                                C5304d1 c5304d5 = c5304d1;
                                InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                                if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a9.mo1640l();
                                if (interfaceC0476a9.mo1632h()) {
                                    interfaceC2041a112 = interfaceC2041a113;
                                    interfaceC0476a9.mo1634i(interfaceC2041a112);
                                } else {
                                    interfaceC2041a112 = interfaceC2041a113;
                                    interfaceC0476a9.mo1653s();
                                }
                                interfaceC0476a9.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                                interfaceC0476a9.mo1626e();
                                composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                interfaceC0476a9.mo1622c(2058660585);
                                C6401a c6401a = C6401a.f36861a;
                                if (z20 != 0) {
                                    interfaceC0476a9.mo1622c(-59272409);
                                    c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59272023);
                                    c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                    interfaceC0476a9.mo1661w();
                                }
                                C7218l c7218l = c7218lM14543a;
                                if (r16 != 0 || z20) {
                                    interfaceC0476a9.mo1622c(-59271884);
                                    jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59271795);
                                    jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                    interfaceC0476a9.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a114 = interfaceC2041a112;
                                int i23 = i21;
                                TextKt.m1576c(str1110, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                                interfaceC0476a9.mo1622c(724546263);
                                String str1112 = str9;
                                if (str1112.length() > 0) {
                                    String upperCase2 = str1112.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    if (z20 != 0) {
                                        interfaceC0476a9.mo1622c(-59270956);
                                        interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59270264);
                                        interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                        interfaceC0476a9.mo1661w();
                                    }
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str119 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                    TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                                } else {
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str119 = r7;
                                }
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1663x();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                                if (r16 != 0) {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    interfaceC0476a5.mo1622c(724548425);
                                    jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                    interfaceC0476a5.mo1661w();
                                } else {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    if (z20 != 0) {
                                        interfaceC0476a5.mo1622c(724548519);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                        interfaceC0476a5.mo1661w();
                                    } else {
                                        interfaceC0476a5.mo1622c(724548598);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                        interfaceC0476a5.mo1661w();
                                    }
                                }
                                DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                                interfaceC0476a5.mo1622c(724548705);
                                if (r16 != 0) {
                                    String string2 = context19.getString(R.string.upgrade_most_popular);
                                    C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                    String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase3, str119);
                                    interfaceC0476a6 = interfaceC0476a5;
                                    TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                                } else {
                                    interfaceC0476a6 = interfaceC0476a5;
                                }
                                interfaceC0476a6.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                                InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                                interfaceC0476a10.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                                interfaceC0476a10.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                                LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                                InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                                if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a10.mo1640l();
                                if (interfaceC0476a10.mo1632h()) {
                                    interfaceC0476a10.mo1634i(interfaceC2041a114);
                                } else {
                                    interfaceC0476a10.mo1653s();
                                }
                                interfaceC0476a10.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                                interfaceC0476a10.mo1626e();
                                composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                                interfaceC0476a10.mo1622c(2058660585);
                                C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                                if (z20 != 0) {
                                    interfaceC0476a10.mo1622c(-59268257);
                                    jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                    interfaceC0476a10.mo1661w();
                                } else {
                                    interfaceC0476a10.mo1622c(-59268159);
                                    jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                    interfaceC0476a10.mo1661w();
                                }
                                TextKt.m1576c(str1111, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                                interfaceC0476a10.mo1622c(724549877);
                                String str1113 = str118;
                                if (str1113.length() > 0) {
                                    C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                    if (z21) {
                                        interfaceC0476a10.mo1622c(-59267725);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                        interfaceC0476a10.mo1661w();
                                    } else if (z20 != 0) {
                                        interfaceC0476a10.mo1622c(-59267615);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                        interfaceC0476a10.mo1661w();
                                    } else {
                                        interfaceC0476a10.mo1622c(-59267510);
                                        jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                        interfaceC0476a10.mo1661w();
                                    }
                                    long j10 = jM5347f2;
                                    InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                    interfaceC0476a7 = interfaceC0476a10;
                                    TextKt.m1576c(str1113, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                                } else {
                                    interfaceC0476a7 = interfaceC0476a10;
                                }
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                    str10 = str7;
                    z16 = z14;
                    z17 = z15;
                    interfaceC2041a3 = interfaceC2041a111;
                } else {
                    if (i22 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i13 != 0) {
                        str8 = "";
                    } else {
                        str8 = str6;
                    }
                    if (i15 != 0) {
                        z14 = false;
                    } else {
                        z14 = z12;
                    }
                    if (i17 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i19 != 0) {
                        interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        };
                    }
                    InterfaceC2041a<C9072e> interfaceC2041a112 = interfaceC2041a2;
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q19 = ComposerKt.f3003a;
                    final Context context19 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                    InterfaceC0500b interfaceC0500bM11157d18 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                    AbstractC10270a abstractC10270a19 = C7499b.m14916N(composerImplMo1636j).f9262d;
                    if (z14) {
                        composerImplMo1636j.mo1622c(1853269473);
                        c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    } else {
                        composerImplMo1636j.mo1622c(1853269535);
                        c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    }
                    str9 = str8;
                    final String str119 = str7;
                    final boolean z111114 = z14;
                    final boolean z111115 = z15;
                    composerImpl = composerImplMo1636j;
                    CardKt.m1558b(interfaceC2041a112, interfaceC0500bM11157d18, false, abstractC10270a19, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // cm.InterfaceC2057q
                        /* JADX INFO: renamed from: M */
                        public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                            long jM5363v;
                            Context context110;
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                            C5304d1 c5304d1;
                            InterfaceC0476a interfaceC0476a3;
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a113;
                            C7218l c7218lM14543a;
                            long jM11581a;
                            InterfaceC0476a interfaceC0476a4;
                            String str1110;
                            InterfaceC0476a interfaceC0476a5;
                            long jM5347f;
                            InterfaceC0476a interfaceC0476a6;
                            long jM11582b;
                            InterfaceC0476a interfaceC0476a7;
                            long jM5347f2;
                            InterfaceC0500b interfaceC0500bM11156c0;
                            InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                            int iIntValue = num.intValue();
                            C5207g.m11111f(interfaceC9771b, "$this$Card");
                            if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                                interfaceC0476a8.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q110 = ComposerKt.f3003a;
                                InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                boolean z20 = z111115;
                                boolean z21 = z111114;
                                if (z21) {
                                    interfaceC0476a8.mo1622c(1155538318);
                                    jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                    interfaceC0476a8.mo1661w();
                                } else if (z20) {
                                    interfaceC0476a8.mo1622c(1155538428);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                    interfaceC0476a8.mo1661w();
                                } else {
                                    interfaceC0476a8.mo1622c(1155538516);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                    interfaceC0476a8.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                                String str1111 = str;
                                String str1112 = str2;
                                interfaceC0476a8.mo1622c(-483455358);
                                C0438a.f fVar = C0438a.f2429a;
                                InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                                interfaceC0476a8.mo1622c(-1323940314);
                                C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                                InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                                C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                                LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                                C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                                InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                                ComposeUiNode.f3726n.getClass();
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a114 = ComposeUiNode.Companion.f3728b;
                                ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                                if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a8.mo1640l();
                                if (interfaceC0476a8.mo1632h()) {
                                    interfaceC0476a8.mo1634i(interfaceC2041a114);
                                } else {
                                    interfaceC0476a8.mo1653s();
                                }
                                interfaceC0476a8.mo1644n();
                                InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                                InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                                C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                                interfaceC0476a8.mo1626e();
                                composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                                interfaceC0476a8.mo1622c(2058660585);
                                interfaceC0476a8.mo1622c(724544551);
                                Context context111 = context19;
                                if (z20) {
                                    String string = context111.getString(R.string.upgrade_special_offer);
                                    C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                    String upperCase = string.toUpperCase(Locale.ROOT);
                                    context110 = context111;
                                    C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                    TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                                } else {
                                    context110 = context111;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                }
                                interfaceC0476a3.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                                C0438a.d dVar = C0438a.f2432d;
                                C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                                interfaceC0476a9.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                                interfaceC0476a9.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                                LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                                C5304d1 c5304d5 = c5304d1;
                                InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                                if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a9.mo1640l();
                                if (interfaceC0476a9.mo1632h()) {
                                    interfaceC2041a113 = interfaceC2041a114;
                                    interfaceC0476a9.mo1634i(interfaceC2041a113);
                                } else {
                                    interfaceC2041a113 = interfaceC2041a114;
                                    interfaceC0476a9.mo1653s();
                                }
                                interfaceC0476a9.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                                interfaceC0476a9.mo1626e();
                                composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                interfaceC0476a9.mo1622c(2058660585);
                                C6401a c6401a = C6401a.f36861a;
                                if (z20 != 0) {
                                    interfaceC0476a9.mo1622c(-59272409);
                                    c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59272023);
                                    c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                    interfaceC0476a9.mo1661w();
                                }
                                C7218l c7218l = c7218lM14543a;
                                if (r16 != 0 || z20) {
                                    interfaceC0476a9.mo1622c(-59271884);
                                    jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59271795);
                                    jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                    interfaceC0476a9.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a115 = interfaceC2041a113;
                                int i23 = i21;
                                TextKt.m1576c(str1111, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                                interfaceC0476a9.mo1622c(724546263);
                                String str1113 = str9;
                                if (str1113.length() > 0) {
                                    String upperCase2 = str1113.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    if (z20 != 0) {
                                        interfaceC0476a9.mo1622c(-59270956);
                                        interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59270264);
                                        interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                        interfaceC0476a9.mo1661w();
                                    }
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str1110 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                    TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                                } else {
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str1110 = r7;
                                }
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1663x();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                                if (r16 != 0) {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    interfaceC0476a5.mo1622c(724548425);
                                    jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                    interfaceC0476a5.mo1661w();
                                } else {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    if (z20 != 0) {
                                        interfaceC0476a5.mo1622c(724548519);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                        interfaceC0476a5.mo1661w();
                                    } else {
                                        interfaceC0476a5.mo1622c(724548598);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                        interfaceC0476a5.mo1661w();
                                    }
                                }
                                DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                                interfaceC0476a5.mo1622c(724548705);
                                if (r16 != 0) {
                                    String string2 = context110.getString(R.string.upgrade_most_popular);
                                    C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                    String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase3, str1110);
                                    interfaceC0476a6 = interfaceC0476a5;
                                    TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                                } else {
                                    interfaceC0476a6 = interfaceC0476a5;
                                }
                                interfaceC0476a6.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                                InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                                interfaceC0476a10.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                                interfaceC0476a10.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                                LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                                InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                                if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a10.mo1640l();
                                if (interfaceC0476a10.mo1632h()) {
                                    interfaceC0476a10.mo1634i(interfaceC2041a115);
                                } else {
                                    interfaceC0476a10.mo1653s();
                                }
                                interfaceC0476a10.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                                interfaceC0476a10.mo1626e();
                                composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                                interfaceC0476a10.mo1622c(2058660585);
                                C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                                if (z20 != 0) {
                                    interfaceC0476a10.mo1622c(-59268257);
                                    jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                    interfaceC0476a10.mo1661w();
                                } else {
                                    interfaceC0476a10.mo1622c(-59268159);
                                    jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                    interfaceC0476a10.mo1661w();
                                }
                                TextKt.m1576c(str1112, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                                interfaceC0476a10.mo1622c(724549877);
                                String str1114 = str119;
                                if (str1114.length() > 0) {
                                    C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                    if (z21) {
                                        interfaceC0476a10.mo1622c(-59267725);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                        interfaceC0476a10.mo1661w();
                                    } else if (z20 != 0) {
                                        interfaceC0476a10.mo1622c(-59267615);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                        interfaceC0476a10.mo1661w();
                                    } else {
                                        interfaceC0476a10.mo1622c(-59267510);
                                        jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                        interfaceC0476a10.mo1661w();
                                    }
                                    long j10 = jM5347f2;
                                    InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                    interfaceC0476a7 = interfaceC0476a10;
                                    TextKt.m1576c(str1114, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                                } else {
                                    interfaceC0476a7 = interfaceC0476a10;
                                }
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                    str10 = str7;
                    z16 = z14;
                    z17 = z15;
                    interfaceC2041a3 = interfaceC2041a112;
                }
                c5332q0M1612T = composerImpl.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        UpgradeItemCardKt.m10411a(str, str2, str10, str9, z16, z17, interfaceC2041a3, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 24576;
            z12 = z10;
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((458752 & i10) == 0) {
                    z13 = z11;
                    if (composerImplMo1636j.m1598G(z13)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                    interfaceC2041a2 = interfaceC2041a;
                } else {
                    interfaceC2041a2 = interfaceC2041a;
                    if ((i10 & 3670016) == 0) {
                        if (composerImplMo1636j.m1600H(interfaceC2041a2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                }
                i21 = i12;
                if ((i21 & 2995931) == 599186) {
                    if (i22 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i13 != 0) {
                        str8 = "";
                    } else {
                        str8 = str6;
                    }
                    if (i15 != 0) {
                        z14 = false;
                    } else {
                        z14 = z12;
                    }
                    if (i17 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i19 != 0) {
                        interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        };
                    }
                    InterfaceC2041a<C9072e> interfaceC2041a113 = interfaceC2041a2;
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q110 = ComposerKt.f3003a;
                    final Context context110 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                    InterfaceC0500b interfaceC0500bM11157d19 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                    AbstractC10270a abstractC10270a110 = C7499b.m14916N(composerImplMo1636j).f9262d;
                    if (z14) {
                        composerImplMo1636j.mo1622c(1853269473);
                        c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    } else {
                        composerImplMo1636j.mo1622c(1853269535);
                        c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    }
                    str9 = str8;
                    final String str1110 = str7;
                    final boolean z111116 = z14;
                    final boolean z111117 = z15;
                    composerImpl = composerImplMo1636j;
                    CardKt.m1558b(interfaceC2041a113, interfaceC0500bM11157d19, false, abstractC10270a110, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // cm.InterfaceC2057q
                        /* JADX INFO: renamed from: M */
                        public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                            long jM5363v;
                            Context context111;
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                            C5304d1 c5304d1;
                            InterfaceC0476a interfaceC0476a3;
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a114;
                            C7218l c7218lM14543a;
                            long jM11581a;
                            InterfaceC0476a interfaceC0476a4;
                            String str1111;
                            InterfaceC0476a interfaceC0476a5;
                            long jM5347f;
                            InterfaceC0476a interfaceC0476a6;
                            long jM11582b;
                            InterfaceC0476a interfaceC0476a7;
                            long jM5347f2;
                            InterfaceC0500b interfaceC0500bM11156c0;
                            InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                            int iIntValue = num.intValue();
                            C5207g.m11111f(interfaceC9771b, "$this$Card");
                            if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                                interfaceC0476a8.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111 = ComposerKt.f3003a;
                                InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                boolean z20 = z111117;
                                boolean z21 = z111116;
                                if (z21) {
                                    interfaceC0476a8.mo1622c(1155538318);
                                    jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                    interfaceC0476a8.mo1661w();
                                } else if (z20) {
                                    interfaceC0476a8.mo1622c(1155538428);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                    interfaceC0476a8.mo1661w();
                                } else {
                                    interfaceC0476a8.mo1622c(1155538516);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                    interfaceC0476a8.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                                String str1112 = str;
                                String str1113 = str2;
                                interfaceC0476a8.mo1622c(-483455358);
                                C0438a.f fVar = C0438a.f2429a;
                                InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                                interfaceC0476a8.mo1622c(-1323940314);
                                C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                                InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                                C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                                LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                                C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                                InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                                ComposeUiNode.f3726n.getClass();
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a115 = ComposeUiNode.Companion.f3728b;
                                ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                                if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a8.mo1640l();
                                if (interfaceC0476a8.mo1632h()) {
                                    interfaceC0476a8.mo1634i(interfaceC2041a115);
                                } else {
                                    interfaceC0476a8.mo1653s();
                                }
                                interfaceC0476a8.mo1644n();
                                InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                                InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                                C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                                interfaceC0476a8.mo1626e();
                                composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                                interfaceC0476a8.mo1622c(2058660585);
                                interfaceC0476a8.mo1622c(724544551);
                                Context context112 = context110;
                                if (z20) {
                                    String string = context112.getString(R.string.upgrade_special_offer);
                                    C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                    String upperCase = string.toUpperCase(Locale.ROOT);
                                    context111 = context112;
                                    C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                    TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                                } else {
                                    context111 = context112;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                }
                                interfaceC0476a3.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                                C0438a.d dVar = C0438a.f2432d;
                                C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                                interfaceC0476a9.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                                interfaceC0476a9.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                                LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                                C5304d1 c5304d5 = c5304d1;
                                InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                                if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a9.mo1640l();
                                if (interfaceC0476a9.mo1632h()) {
                                    interfaceC2041a114 = interfaceC2041a115;
                                    interfaceC0476a9.mo1634i(interfaceC2041a114);
                                } else {
                                    interfaceC2041a114 = interfaceC2041a115;
                                    interfaceC0476a9.mo1653s();
                                }
                                interfaceC0476a9.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                                interfaceC0476a9.mo1626e();
                                composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                interfaceC0476a9.mo1622c(2058660585);
                                C6401a c6401a = C6401a.f36861a;
                                if (z20 != 0) {
                                    interfaceC0476a9.mo1622c(-59272409);
                                    c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59272023);
                                    c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                    interfaceC0476a9.mo1661w();
                                }
                                C7218l c7218l = c7218lM14543a;
                                if (r16 != 0 || z20) {
                                    interfaceC0476a9.mo1622c(-59271884);
                                    jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59271795);
                                    jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                    interfaceC0476a9.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a116 = interfaceC2041a114;
                                int i23 = i21;
                                TextKt.m1576c(str1112, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                                interfaceC0476a9.mo1622c(724546263);
                                String str1114 = str9;
                                if (str1114.length() > 0) {
                                    String upperCase2 = str1114.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    if (z20 != 0) {
                                        interfaceC0476a9.mo1622c(-59270956);
                                        interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59270264);
                                        interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                        interfaceC0476a9.mo1661w();
                                    }
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str1111 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                    TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                                } else {
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str1111 = r7;
                                }
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1663x();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                                if (r16 != 0) {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    interfaceC0476a5.mo1622c(724548425);
                                    jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                    interfaceC0476a5.mo1661w();
                                } else {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    if (z20 != 0) {
                                        interfaceC0476a5.mo1622c(724548519);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                        interfaceC0476a5.mo1661w();
                                    } else {
                                        interfaceC0476a5.mo1622c(724548598);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                        interfaceC0476a5.mo1661w();
                                    }
                                }
                                DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                                interfaceC0476a5.mo1622c(724548705);
                                if (r16 != 0) {
                                    String string2 = context111.getString(R.string.upgrade_most_popular);
                                    C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                    String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase3, str1111);
                                    interfaceC0476a6 = interfaceC0476a5;
                                    TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                                } else {
                                    interfaceC0476a6 = interfaceC0476a5;
                                }
                                interfaceC0476a6.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                                InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                                interfaceC0476a10.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                                interfaceC0476a10.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                                LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                                InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                                if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a10.mo1640l();
                                if (interfaceC0476a10.mo1632h()) {
                                    interfaceC0476a10.mo1634i(interfaceC2041a116);
                                } else {
                                    interfaceC0476a10.mo1653s();
                                }
                                interfaceC0476a10.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                                interfaceC0476a10.mo1626e();
                                composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                                interfaceC0476a10.mo1622c(2058660585);
                                C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                                if (z20 != 0) {
                                    interfaceC0476a10.mo1622c(-59268257);
                                    jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                    interfaceC0476a10.mo1661w();
                                } else {
                                    interfaceC0476a10.mo1622c(-59268159);
                                    jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                    interfaceC0476a10.mo1661w();
                                }
                                TextKt.m1576c(str1113, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                                interfaceC0476a10.mo1622c(724549877);
                                String str1115 = str1110;
                                if (str1115.length() > 0) {
                                    C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                    if (z21) {
                                        interfaceC0476a10.mo1622c(-59267725);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                        interfaceC0476a10.mo1661w();
                                    } else if (z20 != 0) {
                                        interfaceC0476a10.mo1622c(-59267615);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                        interfaceC0476a10.mo1661w();
                                    } else {
                                        interfaceC0476a10.mo1622c(-59267510);
                                        jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                        interfaceC0476a10.mo1661w();
                                    }
                                    long j10 = jM5347f2;
                                    InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                    interfaceC0476a7 = interfaceC0476a10;
                                    TextKt.m1576c(str1115, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                                } else {
                                    interfaceC0476a7 = interfaceC0476a10;
                                }
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                    str10 = str7;
                    z16 = z14;
                    z17 = z15;
                    interfaceC2041a3 = interfaceC2041a113;
                } else {
                    if (i22 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i13 != 0) {
                        str8 = "";
                    } else {
                        str8 = str6;
                    }
                    if (i15 != 0) {
                        z14 = false;
                    } else {
                        z14 = z12;
                    }
                    if (i17 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i19 != 0) {
                        interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        };
                    }
                    InterfaceC2041a<C9072e> interfaceC2041a114 = interfaceC2041a2;
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111 = ComposerKt.f3003a;
                    final Context context111 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                    InterfaceC0500b interfaceC0500bM11157d110 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                    AbstractC10270a abstractC10270a111 = C7499b.m14916N(composerImplMo1636j).f9262d;
                    if (z14) {
                        composerImplMo1636j.mo1622c(1853269473);
                        c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    } else {
                        composerImplMo1636j.mo1622c(1853269535);
                        c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    }
                    str9 = str8;
                    final String str1111 = str7;
                    final boolean z111118 = z14;
                    final boolean z111119 = z15;
                    composerImpl = composerImplMo1636j;
                    CardKt.m1558b(interfaceC2041a114, interfaceC0500bM11157d110, false, abstractC10270a111, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // cm.InterfaceC2057q
                        /* JADX INFO: renamed from: M */
                        public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                            long jM5363v;
                            Context context112;
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                            C5304d1 c5304d1;
                            InterfaceC0476a interfaceC0476a3;
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a115;
                            C7218l c7218lM14543a;
                            long jM11581a;
                            InterfaceC0476a interfaceC0476a4;
                            String str1112;
                            InterfaceC0476a interfaceC0476a5;
                            long jM5347f;
                            InterfaceC0476a interfaceC0476a6;
                            long jM11582b;
                            InterfaceC0476a interfaceC0476a7;
                            long jM5347f2;
                            InterfaceC0500b interfaceC0500bM11156c0;
                            InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                            int iIntValue = num.intValue();
                            C5207g.m11111f(interfaceC9771b, "$this$Card");
                            if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                                interfaceC0476a8.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q112 = ComposerKt.f3003a;
                                InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                boolean z20 = z111119;
                                boolean z21 = z111118;
                                if (z21) {
                                    interfaceC0476a8.mo1622c(1155538318);
                                    jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                    interfaceC0476a8.mo1661w();
                                } else if (z20) {
                                    interfaceC0476a8.mo1622c(1155538428);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                    interfaceC0476a8.mo1661w();
                                } else {
                                    interfaceC0476a8.mo1622c(1155538516);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                    interfaceC0476a8.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                                String str1113 = str;
                                String str1114 = str2;
                                interfaceC0476a8.mo1622c(-483455358);
                                C0438a.f fVar = C0438a.f2429a;
                                InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                                interfaceC0476a8.mo1622c(-1323940314);
                                C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                                InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                                C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                                LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                                C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                                InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                                ComposeUiNode.f3726n.getClass();
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a116 = ComposeUiNode.Companion.f3728b;
                                ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                                if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a8.mo1640l();
                                if (interfaceC0476a8.mo1632h()) {
                                    interfaceC0476a8.mo1634i(interfaceC2041a116);
                                } else {
                                    interfaceC0476a8.mo1653s();
                                }
                                interfaceC0476a8.mo1644n();
                                InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                                InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                                C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                                interfaceC0476a8.mo1626e();
                                composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                                interfaceC0476a8.mo1622c(2058660585);
                                interfaceC0476a8.mo1622c(724544551);
                                Context context113 = context111;
                                if (z20) {
                                    String string = context113.getString(R.string.upgrade_special_offer);
                                    C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                    String upperCase = string.toUpperCase(Locale.ROOT);
                                    context112 = context113;
                                    C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                    TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                                } else {
                                    context112 = context113;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                }
                                interfaceC0476a3.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                                C0438a.d dVar = C0438a.f2432d;
                                C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                                interfaceC0476a9.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                                interfaceC0476a9.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                                LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                                C5304d1 c5304d5 = c5304d1;
                                InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                                if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a9.mo1640l();
                                if (interfaceC0476a9.mo1632h()) {
                                    interfaceC2041a115 = interfaceC2041a116;
                                    interfaceC0476a9.mo1634i(interfaceC2041a115);
                                } else {
                                    interfaceC2041a115 = interfaceC2041a116;
                                    interfaceC0476a9.mo1653s();
                                }
                                interfaceC0476a9.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                                interfaceC0476a9.mo1626e();
                                composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                interfaceC0476a9.mo1622c(2058660585);
                                C6401a c6401a = C6401a.f36861a;
                                if (z20 != 0) {
                                    interfaceC0476a9.mo1622c(-59272409);
                                    c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59272023);
                                    c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                    interfaceC0476a9.mo1661w();
                                }
                                C7218l c7218l = c7218lM14543a;
                                if (r16 != 0 || z20) {
                                    interfaceC0476a9.mo1622c(-59271884);
                                    jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59271795);
                                    jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                    interfaceC0476a9.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a117 = interfaceC2041a115;
                                int i23 = i21;
                                TextKt.m1576c(str1113, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                                interfaceC0476a9.mo1622c(724546263);
                                String str1115 = str9;
                                if (str1115.length() > 0) {
                                    String upperCase2 = str1115.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    if (z20 != 0) {
                                        interfaceC0476a9.mo1622c(-59270956);
                                        interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59270264);
                                        interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                        interfaceC0476a9.mo1661w();
                                    }
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str1112 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                    TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                                } else {
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str1112 = r7;
                                }
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1663x();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                                if (r16 != 0) {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    interfaceC0476a5.mo1622c(724548425);
                                    jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                    interfaceC0476a5.mo1661w();
                                } else {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    if (z20 != 0) {
                                        interfaceC0476a5.mo1622c(724548519);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                        interfaceC0476a5.mo1661w();
                                    } else {
                                        interfaceC0476a5.mo1622c(724548598);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                        interfaceC0476a5.mo1661w();
                                    }
                                }
                                DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                                interfaceC0476a5.mo1622c(724548705);
                                if (r16 != 0) {
                                    String string2 = context112.getString(R.string.upgrade_most_popular);
                                    C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                    String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase3, str1112);
                                    interfaceC0476a6 = interfaceC0476a5;
                                    TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                                } else {
                                    interfaceC0476a6 = interfaceC0476a5;
                                }
                                interfaceC0476a6.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                                InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                                interfaceC0476a10.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                                interfaceC0476a10.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                                LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                                InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                                if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a10.mo1640l();
                                if (interfaceC0476a10.mo1632h()) {
                                    interfaceC0476a10.mo1634i(interfaceC2041a117);
                                } else {
                                    interfaceC0476a10.mo1653s();
                                }
                                interfaceC0476a10.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                                interfaceC0476a10.mo1626e();
                                composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                                interfaceC0476a10.mo1622c(2058660585);
                                C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                                if (z20 != 0) {
                                    interfaceC0476a10.mo1622c(-59268257);
                                    jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                    interfaceC0476a10.mo1661w();
                                } else {
                                    interfaceC0476a10.mo1622c(-59268159);
                                    jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                    interfaceC0476a10.mo1661w();
                                }
                                TextKt.m1576c(str1114, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                                interfaceC0476a10.mo1622c(724549877);
                                String str1116 = str1111;
                                if (str1116.length() > 0) {
                                    C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                    if (z21) {
                                        interfaceC0476a10.mo1622c(-59267725);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                        interfaceC0476a10.mo1661w();
                                    } else if (z20 != 0) {
                                        interfaceC0476a10.mo1622c(-59267615);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                        interfaceC0476a10.mo1661w();
                                    } else {
                                        interfaceC0476a10.mo1622c(-59267510);
                                        jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                        interfaceC0476a10.mo1661w();
                                    }
                                    long j10 = jM5347f2;
                                    InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                    interfaceC0476a7 = interfaceC0476a10;
                                    TextKt.m1576c(str1116, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                                } else {
                                    interfaceC0476a7 = interfaceC0476a10;
                                }
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                    str10 = str7;
                    z16 = z14;
                    z17 = z15;
                    interfaceC2041a3 = interfaceC2041a114;
                }
                c5332q0M1612T = composerImpl.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        UpgradeItemCardKt.m10411a(str, str2, str10, str9, z16, z17, interfaceC2041a3, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 196608;
            z13 = z11;
            i19 = i11 & 64;
            if (i19 != 0) {
                i12 |= 1572864;
                interfaceC2041a2 = interfaceC2041a;
            } else {
                interfaceC2041a2 = interfaceC2041a;
                if ((i10 & 3670016) == 0) {
                    if (composerImplMo1636j.m1600H(interfaceC2041a2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
            }
            i21 = i12;
            if ((i21 & 2995931) == 599186) {
                if (i22 != 0) {
                    str7 = "";
                } else {
                    str7 = str5;
                }
                if (i13 != 0) {
                    str8 = "";
                } else {
                    str8 = str6;
                }
                if (i15 != 0) {
                    z14 = false;
                } else {
                    z14 = z12;
                }
                if (i17 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i19 != 0) {
                    interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final /* bridge */ /* synthetic */ C9072e mo807E() {
                            return C9072e.f47360a;
                        }
                    };
                }
                InterfaceC2041a<C9072e> interfaceC2041a115 = interfaceC2041a2;
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q112 = ComposerKt.f3003a;
                final Context context112 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                InterfaceC0500b interfaceC0500bM11157d111 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                AbstractC10270a abstractC10270a112 = C7499b.m14916N(composerImplMo1636j).f9262d;
                if (z14) {
                    composerImplMo1636j.mo1622c(1853269473);
                    c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                    composerImplMo1636j.m1609Q(false);
                } else {
                    composerImplMo1636j.mo1622c(1853269535);
                    c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                    composerImplMo1636j.m1609Q(false);
                }
                str9 = str8;
                final String str1112 = str7;
                final boolean z1111110 = z14;
                final boolean z1111111 = z15;
                composerImpl = composerImplMo1636j;
                CardKt.m1558b(interfaceC2041a115, interfaceC0500bM11157d111, false, abstractC10270a112, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // cm.InterfaceC2057q
                    /* JADX INFO: renamed from: M */
                    public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                        long jM5363v;
                        Context context113;
                        InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                        InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                        C5304d1 c5304d1;
                        InterfaceC0476a interfaceC0476a3;
                        InterfaceC2041a<ComposeUiNode> interfaceC2041a116;
                        C7218l c7218lM14543a;
                        long jM11581a;
                        InterfaceC0476a interfaceC0476a4;
                        String str1113;
                        InterfaceC0476a interfaceC0476a5;
                        long jM5347f;
                        InterfaceC0476a interfaceC0476a6;
                        long jM11582b;
                        InterfaceC0476a interfaceC0476a7;
                        long jM5347f2;
                        InterfaceC0500b interfaceC0500bM11156c0;
                        InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                        int iIntValue = num.intValue();
                        C5207g.m11111f(interfaceC9771b, "$this$Card");
                        if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                            interfaceC0476a8.mo1650q();
                        } else {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q113 = ComposerKt.f3003a;
                            InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                            boolean z20 = z1111111;
                            boolean z21 = z1111110;
                            if (z21) {
                                interfaceC0476a8.mo1622c(1155538318);
                                jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                interfaceC0476a8.mo1661w();
                            } else if (z20) {
                                interfaceC0476a8.mo1622c(1155538428);
                                jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                interfaceC0476a8.mo1661w();
                            } else {
                                interfaceC0476a8.mo1622c(1155538516);
                                jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                interfaceC0476a8.mo1661w();
                            }
                            InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                            String str1114 = str;
                            String str1115 = str2;
                            interfaceC0476a8.mo1622c(-483455358);
                            C0438a.f fVar = C0438a.f2429a;
                            InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                            interfaceC0476a8.mo1622c(-1323940314);
                            C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                            InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                            C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                            LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                            C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                            InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                            ComposeUiNode.f3726n.getClass();
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a117 = ComposeUiNode.Companion.f3728b;
                            ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                            if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a8.mo1640l();
                            if (interfaceC0476a8.mo1632h()) {
                                interfaceC0476a8.mo1634i(interfaceC2041a117);
                            } else {
                                interfaceC0476a8.mo1653s();
                            }
                            interfaceC0476a8.mo1644n();
                            InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                            InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                            C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                            interfaceC0476a8.mo1626e();
                            composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                            interfaceC0476a8.mo1622c(2058660585);
                            interfaceC0476a8.mo1622c(724544551);
                            Context context114 = context112;
                            if (z20) {
                                String string = context114.getString(R.string.upgrade_special_offer);
                                C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                String upperCase = string.toUpperCase(Locale.ROOT);
                                context113 = context114;
                                C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                interfaceC2056p2 = interfaceC2056p6;
                                c5304d1 = c5304d4;
                                interfaceC2056p = interfaceC2056p4;
                                interfaceC0476a3 = interfaceC0476a8;
                                TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                            } else {
                                context113 = context114;
                                interfaceC2056p = interfaceC2056p4;
                                interfaceC2056p2 = interfaceC2056p6;
                                c5304d1 = c5304d4;
                                interfaceC0476a3 = interfaceC0476a8;
                            }
                            interfaceC0476a3.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                            C0438a.d dVar = C0438a.f2432d;
                            C7886b.b bVar = InterfaceC7885a.a.f42994f;
                            InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                            interfaceC0476a9.mo1622c(693286680);
                            InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                            interfaceC0476a9.mo1622c(-1323940314);
                            InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                            LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                            C5304d1 c5304d5 = c5304d1;
                            InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                            ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                            if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a9.mo1640l();
                            if (interfaceC0476a9.mo1632h()) {
                                interfaceC2041a116 = interfaceC2041a117;
                                interfaceC0476a9.mo1634i(interfaceC2041a116);
                            } else {
                                interfaceC2041a116 = interfaceC2041a117;
                                interfaceC0476a9.mo1653s();
                            }
                            interfaceC0476a9.mo1644n();
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                            C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                            interfaceC0476a9.mo1626e();
                            composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                            interfaceC0476a9.mo1622c(2058660585);
                            C6401a c6401a = C6401a.f36861a;
                            if (z20 != 0) {
                                interfaceC0476a9.mo1622c(-59272409);
                                c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                interfaceC0476a9.mo1661w();
                            } else {
                                interfaceC0476a9.mo1622c(-59272023);
                                c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                interfaceC0476a9.mo1661w();
                            }
                            C7218l c7218l = c7218lM14543a;
                            if (r16 != 0 || z20) {
                                interfaceC0476a9.mo1622c(-59271884);
                                jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                interfaceC0476a9.mo1661w();
                            } else {
                                interfaceC0476a9.mo1622c(-59271795);
                                jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                interfaceC0476a9.mo1661w();
                            }
                            InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a118 = interfaceC2041a116;
                            int i23 = i21;
                            TextKt.m1576c(str1114, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                            interfaceC0476a9.mo1622c(724546263);
                            String str1116 = str9;
                            if (str1116.length() > 0) {
                                String upperCase2 = str1116.toUpperCase(Locale.ROOT);
                                C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                if (z20 != 0) {
                                    interfaceC0476a9.mo1622c(-59270956);
                                    interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59270264);
                                    interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                    interfaceC0476a9.mo1661w();
                                }
                                interfaceC0476a4 = interfaceC0476a9;
                                str1113 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                            } else {
                                interfaceC0476a4 = interfaceC0476a9;
                                str1113 = r7;
                            }
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1663x();
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                            if (r16 != 0) {
                                interfaceC0476a5 = interfaceC0476a4;
                                interfaceC0476a5.mo1622c(724548425);
                                jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                interfaceC0476a5.mo1661w();
                            } else {
                                interfaceC0476a5 = interfaceC0476a4;
                                if (z20 != 0) {
                                    interfaceC0476a5.mo1622c(724548519);
                                    jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                    interfaceC0476a5.mo1661w();
                                } else {
                                    interfaceC0476a5.mo1622c(724548598);
                                    jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                    interfaceC0476a5.mo1661w();
                                }
                            }
                            DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                            interfaceC0476a5.mo1622c(724548705);
                            if (r16 != 0) {
                                String string2 = context113.getString(R.string.upgrade_most_popular);
                                C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                C5207g.m11110e(upperCase3, str1113);
                                interfaceC0476a6 = interfaceC0476a5;
                                TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                            } else {
                                interfaceC0476a6 = interfaceC0476a5;
                            }
                            interfaceC0476a6.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                            InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                            interfaceC0476a10.mo1622c(693286680);
                            InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                            interfaceC0476a10.mo1622c(-1323940314);
                            InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                            LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                            InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                            ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                            if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a10.mo1640l();
                            if (interfaceC0476a10.mo1632h()) {
                                interfaceC0476a10.mo1634i(interfaceC2041a118);
                            } else {
                                interfaceC0476a10.mo1653s();
                            }
                            interfaceC0476a10.mo1644n();
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                            C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                            interfaceC0476a10.mo1626e();
                            composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                            interfaceC0476a10.mo1622c(2058660585);
                            C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                            if (z20 != 0) {
                                interfaceC0476a10.mo1622c(-59268257);
                                jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                interfaceC0476a10.mo1661w();
                            } else {
                                interfaceC0476a10.mo1622c(-59268159);
                                jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                interfaceC0476a10.mo1661w();
                            }
                            TextKt.m1576c(str1115, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                            interfaceC0476a10.mo1622c(724549877);
                            String str1117 = str1112;
                            if (str1117.length() > 0) {
                                C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                if (z21) {
                                    interfaceC0476a10.mo1622c(-59267725);
                                    jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                    interfaceC0476a10.mo1661w();
                                } else if (z20 != 0) {
                                    interfaceC0476a10.mo1622c(-59267615);
                                    jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                    interfaceC0476a10.mo1661w();
                                } else {
                                    interfaceC0476a10.mo1622c(-59267510);
                                    jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                    interfaceC0476a10.mo1661w();
                                }
                                long j10 = jM5347f2;
                                InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                interfaceC0476a7 = interfaceC0476a10;
                                TextKt.m1576c(str1117, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                            } else {
                                interfaceC0476a7 = interfaceC0476a10;
                            }
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1663x();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1663x();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                        }
                        return C9072e.f47360a;
                    }
                }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                str10 = str7;
                z16 = z14;
                z17 = z15;
                interfaceC2041a3 = interfaceC2041a115;
            } else {
                if (i22 != 0) {
                    str7 = "";
                } else {
                    str7 = str5;
                }
                if (i13 != 0) {
                    str8 = "";
                } else {
                    str8 = str6;
                }
                if (i15 != 0) {
                    z14 = false;
                } else {
                    z14 = z12;
                }
                if (i17 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i19 != 0) {
                    interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final /* bridge */ /* synthetic */ C9072e mo807E() {
                            return C9072e.f47360a;
                        }
                    };
                }
                InterfaceC2041a<C9072e> interfaceC2041a116 = interfaceC2041a2;
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q113 = ComposerKt.f3003a;
                final Context context113 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                InterfaceC0500b interfaceC0500bM11157d112 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                AbstractC10270a abstractC10270a113 = C7499b.m14916N(composerImplMo1636j).f9262d;
                if (z14) {
                    composerImplMo1636j.mo1622c(1853269473);
                    c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                    composerImplMo1636j.m1609Q(false);
                } else {
                    composerImplMo1636j.mo1622c(1853269535);
                    c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                    composerImplMo1636j.m1609Q(false);
                }
                str9 = str8;
                final String str1113 = str7;
                final boolean z1111112 = z14;
                final boolean z1111113 = z15;
                composerImpl = composerImplMo1636j;
                CardKt.m1558b(interfaceC2041a116, interfaceC0500bM11157d112, false, abstractC10270a113, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // cm.InterfaceC2057q
                    /* JADX INFO: renamed from: M */
                    public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                        long jM5363v;
                        Context context114;
                        InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                        InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                        C5304d1 c5304d1;
                        InterfaceC0476a interfaceC0476a3;
                        InterfaceC2041a<ComposeUiNode> interfaceC2041a117;
                        C7218l c7218lM14543a;
                        long jM11581a;
                        InterfaceC0476a interfaceC0476a4;
                        String str1114;
                        InterfaceC0476a interfaceC0476a5;
                        long jM5347f;
                        InterfaceC0476a interfaceC0476a6;
                        long jM11582b;
                        InterfaceC0476a interfaceC0476a7;
                        long jM5347f2;
                        InterfaceC0500b interfaceC0500bM11156c0;
                        InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                        int iIntValue = num.intValue();
                        C5207g.m11111f(interfaceC9771b, "$this$Card");
                        if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                            interfaceC0476a8.mo1650q();
                        } else {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q114 = ComposerKt.f3003a;
                            InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                            boolean z20 = z1111113;
                            boolean z21 = z1111112;
                            if (z21) {
                                interfaceC0476a8.mo1622c(1155538318);
                                jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                interfaceC0476a8.mo1661w();
                            } else if (z20) {
                                interfaceC0476a8.mo1622c(1155538428);
                                jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                interfaceC0476a8.mo1661w();
                            } else {
                                interfaceC0476a8.mo1622c(1155538516);
                                jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                interfaceC0476a8.mo1661w();
                            }
                            InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                            String str1115 = str;
                            String str1116 = str2;
                            interfaceC0476a8.mo1622c(-483455358);
                            C0438a.f fVar = C0438a.f2429a;
                            InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                            interfaceC0476a8.mo1622c(-1323940314);
                            C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                            InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                            C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                            LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                            C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                            InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                            ComposeUiNode.f3726n.getClass();
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a118 = ComposeUiNode.Companion.f3728b;
                            ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                            if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a8.mo1640l();
                            if (interfaceC0476a8.mo1632h()) {
                                interfaceC0476a8.mo1634i(interfaceC2041a118);
                            } else {
                                interfaceC0476a8.mo1653s();
                            }
                            interfaceC0476a8.mo1644n();
                            InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                            InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                            C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                            interfaceC0476a8.mo1626e();
                            composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                            interfaceC0476a8.mo1622c(2058660585);
                            interfaceC0476a8.mo1622c(724544551);
                            Context context115 = context113;
                            if (z20) {
                                String string = context115.getString(R.string.upgrade_special_offer);
                                C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                String upperCase = string.toUpperCase(Locale.ROOT);
                                context114 = context115;
                                C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                interfaceC2056p2 = interfaceC2056p6;
                                c5304d1 = c5304d4;
                                interfaceC2056p = interfaceC2056p4;
                                interfaceC0476a3 = interfaceC0476a8;
                                TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                            } else {
                                context114 = context115;
                                interfaceC2056p = interfaceC2056p4;
                                interfaceC2056p2 = interfaceC2056p6;
                                c5304d1 = c5304d4;
                                interfaceC0476a3 = interfaceC0476a8;
                            }
                            interfaceC0476a3.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                            C0438a.d dVar = C0438a.f2432d;
                            C7886b.b bVar = InterfaceC7885a.a.f42994f;
                            InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                            interfaceC0476a9.mo1622c(693286680);
                            InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                            interfaceC0476a9.mo1622c(-1323940314);
                            InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                            LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                            C5304d1 c5304d5 = c5304d1;
                            InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                            ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                            if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a9.mo1640l();
                            if (interfaceC0476a9.mo1632h()) {
                                interfaceC2041a117 = interfaceC2041a118;
                                interfaceC0476a9.mo1634i(interfaceC2041a117);
                            } else {
                                interfaceC2041a117 = interfaceC2041a118;
                                interfaceC0476a9.mo1653s();
                            }
                            interfaceC0476a9.mo1644n();
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                            C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                            interfaceC0476a9.mo1626e();
                            composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                            interfaceC0476a9.mo1622c(2058660585);
                            C6401a c6401a = C6401a.f36861a;
                            if (z20 != 0) {
                                interfaceC0476a9.mo1622c(-59272409);
                                c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                interfaceC0476a9.mo1661w();
                            } else {
                                interfaceC0476a9.mo1622c(-59272023);
                                c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                interfaceC0476a9.mo1661w();
                            }
                            C7218l c7218l = c7218lM14543a;
                            if (r16 != 0 || z20) {
                                interfaceC0476a9.mo1622c(-59271884);
                                jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                interfaceC0476a9.mo1661w();
                            } else {
                                interfaceC0476a9.mo1622c(-59271795);
                                jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                interfaceC0476a9.mo1661w();
                            }
                            InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a119 = interfaceC2041a117;
                            int i23 = i21;
                            TextKt.m1576c(str1115, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                            interfaceC0476a9.mo1622c(724546263);
                            String str1117 = str9;
                            if (str1117.length() > 0) {
                                String upperCase2 = str1117.toUpperCase(Locale.ROOT);
                                C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                if (z20 != 0) {
                                    interfaceC0476a9.mo1622c(-59270956);
                                    interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59270264);
                                    interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                    interfaceC0476a9.mo1661w();
                                }
                                interfaceC0476a4 = interfaceC0476a9;
                                str1114 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                            } else {
                                interfaceC0476a4 = interfaceC0476a9;
                                str1114 = r7;
                            }
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1663x();
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                            if (r16 != 0) {
                                interfaceC0476a5 = interfaceC0476a4;
                                interfaceC0476a5.mo1622c(724548425);
                                jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                interfaceC0476a5.mo1661w();
                            } else {
                                interfaceC0476a5 = interfaceC0476a4;
                                if (z20 != 0) {
                                    interfaceC0476a5.mo1622c(724548519);
                                    jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                    interfaceC0476a5.mo1661w();
                                } else {
                                    interfaceC0476a5.mo1622c(724548598);
                                    jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                    interfaceC0476a5.mo1661w();
                                }
                            }
                            DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                            interfaceC0476a5.mo1622c(724548705);
                            if (r16 != 0) {
                                String string2 = context114.getString(R.string.upgrade_most_popular);
                                C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                C5207g.m11110e(upperCase3, str1114);
                                interfaceC0476a6 = interfaceC0476a5;
                                TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                            } else {
                                interfaceC0476a6 = interfaceC0476a5;
                            }
                            interfaceC0476a6.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                            InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                            interfaceC0476a10.mo1622c(693286680);
                            InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                            interfaceC0476a10.mo1622c(-1323940314);
                            InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                            LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                            InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                            ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                            if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a10.mo1640l();
                            if (interfaceC0476a10.mo1632h()) {
                                interfaceC0476a10.mo1634i(interfaceC2041a119);
                            } else {
                                interfaceC0476a10.mo1653s();
                            }
                            interfaceC0476a10.mo1644n();
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                            C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                            interfaceC0476a10.mo1626e();
                            composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                            interfaceC0476a10.mo1622c(2058660585);
                            C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                            if (z20 != 0) {
                                interfaceC0476a10.mo1622c(-59268257);
                                jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                interfaceC0476a10.mo1661w();
                            } else {
                                interfaceC0476a10.mo1622c(-59268159);
                                jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                interfaceC0476a10.mo1661w();
                            }
                            TextKt.m1576c(str1116, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                            interfaceC0476a10.mo1622c(724549877);
                            String str1118 = str1113;
                            if (str1118.length() > 0) {
                                C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                if (z21) {
                                    interfaceC0476a10.mo1622c(-59267725);
                                    jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                    interfaceC0476a10.mo1661w();
                                } else if (z20 != 0) {
                                    interfaceC0476a10.mo1622c(-59267615);
                                    jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                    interfaceC0476a10.mo1661w();
                                } else {
                                    interfaceC0476a10.mo1622c(-59267510);
                                    jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                    interfaceC0476a10.mo1661w();
                                }
                                long j10 = jM5347f2;
                                InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                interfaceC0476a7 = interfaceC0476a10;
                                TextKt.m1576c(str1118, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                            } else {
                                interfaceC0476a7 = interfaceC0476a10;
                            }
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1663x();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1663x();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                        }
                        return C9072e.f47360a;
                    }
                }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                str10 = str7;
                z16 = z14;
                z17 = z15;
                interfaceC2041a3 = interfaceC2041a116;
            }
            c5332q0M1612T = composerImpl.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    UpgradeItemCardKt.m10411a(str, str2, str10, str9, z16, z17, interfaceC2041a3, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 3072;
        str6 = str4;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((57344 & i10) == 0) {
                z12 = z10;
                if (composerImplMo1636j.m1598G(z12)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((458752 & i10) == 0) {
                    z13 = z11;
                    if (composerImplMo1636j.m1598G(z13)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                    interfaceC2041a2 = interfaceC2041a;
                } else {
                    interfaceC2041a2 = interfaceC2041a;
                    if ((i10 & 3670016) == 0) {
                        if (composerImplMo1636j.m1600H(interfaceC2041a2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                }
                i21 = i12;
                if ((i21 & 2995931) == 599186) {
                    if (i22 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i13 != 0) {
                        str8 = "";
                    } else {
                        str8 = str6;
                    }
                    if (i15 != 0) {
                        z14 = false;
                    } else {
                        z14 = z12;
                    }
                    if (i17 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i19 != 0) {
                        interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        };
                    }
                    InterfaceC2041a<C9072e> interfaceC2041a117 = interfaceC2041a2;
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q114 = ComposerKt.f3003a;
                    final Context context114 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                    InterfaceC0500b interfaceC0500bM11157d113 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                    AbstractC10270a abstractC10270a114 = C7499b.m14916N(composerImplMo1636j).f9262d;
                    if (z14) {
                        composerImplMo1636j.mo1622c(1853269473);
                        c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    } else {
                        composerImplMo1636j.mo1622c(1853269535);
                        c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    }
                    str9 = str8;
                    final String str1114 = str7;
                    final boolean z1111114 = z14;
                    final boolean z1111115 = z15;
                    composerImpl = composerImplMo1636j;
                    CardKt.m1558b(interfaceC2041a117, interfaceC0500bM11157d113, false, abstractC10270a114, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // cm.InterfaceC2057q
                        /* JADX INFO: renamed from: M */
                        public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                            long jM5363v;
                            Context context115;
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                            C5304d1 c5304d1;
                            InterfaceC0476a interfaceC0476a3;
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a118;
                            C7218l c7218lM14543a;
                            long jM11581a;
                            InterfaceC0476a interfaceC0476a4;
                            String str1115;
                            InterfaceC0476a interfaceC0476a5;
                            long jM5347f;
                            InterfaceC0476a interfaceC0476a6;
                            long jM11582b;
                            InterfaceC0476a interfaceC0476a7;
                            long jM5347f2;
                            InterfaceC0500b interfaceC0500bM11156c0;
                            InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                            int iIntValue = num.intValue();
                            C5207g.m11111f(interfaceC9771b, "$this$Card");
                            if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                                interfaceC0476a8.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q115 = ComposerKt.f3003a;
                                InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                boolean z20 = z1111115;
                                boolean z21 = z1111114;
                                if (z21) {
                                    interfaceC0476a8.mo1622c(1155538318);
                                    jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                    interfaceC0476a8.mo1661w();
                                } else if (z20) {
                                    interfaceC0476a8.mo1622c(1155538428);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                    interfaceC0476a8.mo1661w();
                                } else {
                                    interfaceC0476a8.mo1622c(1155538516);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                    interfaceC0476a8.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                                String str1116 = str;
                                String str1117 = str2;
                                interfaceC0476a8.mo1622c(-483455358);
                                C0438a.f fVar = C0438a.f2429a;
                                InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                                interfaceC0476a8.mo1622c(-1323940314);
                                C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                                InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                                C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                                LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                                C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                                InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                                ComposeUiNode.f3726n.getClass();
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a119 = ComposeUiNode.Companion.f3728b;
                                ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                                if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a8.mo1640l();
                                if (interfaceC0476a8.mo1632h()) {
                                    interfaceC0476a8.mo1634i(interfaceC2041a119);
                                } else {
                                    interfaceC0476a8.mo1653s();
                                }
                                interfaceC0476a8.mo1644n();
                                InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                                InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                                C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                                interfaceC0476a8.mo1626e();
                                composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                                interfaceC0476a8.mo1622c(2058660585);
                                interfaceC0476a8.mo1622c(724544551);
                                Context context116 = context114;
                                if (z20) {
                                    String string = context116.getString(R.string.upgrade_special_offer);
                                    C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                    String upperCase = string.toUpperCase(Locale.ROOT);
                                    context115 = context116;
                                    C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                    TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                                } else {
                                    context115 = context116;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                }
                                interfaceC0476a3.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                                C0438a.d dVar = C0438a.f2432d;
                                C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                                interfaceC0476a9.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                                interfaceC0476a9.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                                LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                                C5304d1 c5304d5 = c5304d1;
                                InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                                if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a9.mo1640l();
                                if (interfaceC0476a9.mo1632h()) {
                                    interfaceC2041a118 = interfaceC2041a119;
                                    interfaceC0476a9.mo1634i(interfaceC2041a118);
                                } else {
                                    interfaceC2041a118 = interfaceC2041a119;
                                    interfaceC0476a9.mo1653s();
                                }
                                interfaceC0476a9.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                                interfaceC0476a9.mo1626e();
                                composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                interfaceC0476a9.mo1622c(2058660585);
                                C6401a c6401a = C6401a.f36861a;
                                if (z20 != 0) {
                                    interfaceC0476a9.mo1622c(-59272409);
                                    c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59272023);
                                    c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                    interfaceC0476a9.mo1661w();
                                }
                                C7218l c7218l = c7218lM14543a;
                                if (r16 != 0 || z20) {
                                    interfaceC0476a9.mo1622c(-59271884);
                                    jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59271795);
                                    jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                    interfaceC0476a9.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a1110 = interfaceC2041a118;
                                int i23 = i21;
                                TextKt.m1576c(str1116, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                                interfaceC0476a9.mo1622c(724546263);
                                String str1118 = str9;
                                if (str1118.length() > 0) {
                                    String upperCase2 = str1118.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    if (z20 != 0) {
                                        interfaceC0476a9.mo1622c(-59270956);
                                        interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59270264);
                                        interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                        interfaceC0476a9.mo1661w();
                                    }
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str1115 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                    TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                                } else {
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str1115 = r7;
                                }
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1663x();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                                if (r16 != 0) {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    interfaceC0476a5.mo1622c(724548425);
                                    jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                    interfaceC0476a5.mo1661w();
                                } else {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    if (z20 != 0) {
                                        interfaceC0476a5.mo1622c(724548519);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                        interfaceC0476a5.mo1661w();
                                    } else {
                                        interfaceC0476a5.mo1622c(724548598);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                        interfaceC0476a5.mo1661w();
                                    }
                                }
                                DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                                interfaceC0476a5.mo1622c(724548705);
                                if (r16 != 0) {
                                    String string2 = context115.getString(R.string.upgrade_most_popular);
                                    C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                    String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase3, str1115);
                                    interfaceC0476a6 = interfaceC0476a5;
                                    TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                                } else {
                                    interfaceC0476a6 = interfaceC0476a5;
                                }
                                interfaceC0476a6.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                                InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                                interfaceC0476a10.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                                interfaceC0476a10.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                                LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                                InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                                if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a10.mo1640l();
                                if (interfaceC0476a10.mo1632h()) {
                                    interfaceC0476a10.mo1634i(interfaceC2041a1110);
                                } else {
                                    interfaceC0476a10.mo1653s();
                                }
                                interfaceC0476a10.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                                interfaceC0476a10.mo1626e();
                                composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                                interfaceC0476a10.mo1622c(2058660585);
                                C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                                if (z20 != 0) {
                                    interfaceC0476a10.mo1622c(-59268257);
                                    jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                    interfaceC0476a10.mo1661w();
                                } else {
                                    interfaceC0476a10.mo1622c(-59268159);
                                    jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                    interfaceC0476a10.mo1661w();
                                }
                                TextKt.m1576c(str1117, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                                interfaceC0476a10.mo1622c(724549877);
                                String str1119 = str1114;
                                if (str1119.length() > 0) {
                                    C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                    if (z21) {
                                        interfaceC0476a10.mo1622c(-59267725);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                        interfaceC0476a10.mo1661w();
                                    } else if (z20 != 0) {
                                        interfaceC0476a10.mo1622c(-59267615);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                        interfaceC0476a10.mo1661w();
                                    } else {
                                        interfaceC0476a10.mo1622c(-59267510);
                                        jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                        interfaceC0476a10.mo1661w();
                                    }
                                    long j10 = jM5347f2;
                                    InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                    interfaceC0476a7 = interfaceC0476a10;
                                    TextKt.m1576c(str1119, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                                } else {
                                    interfaceC0476a7 = interfaceC0476a10;
                                }
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                    str10 = str7;
                    z16 = z14;
                    z17 = z15;
                    interfaceC2041a3 = interfaceC2041a117;
                } else {
                    if (i22 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i13 != 0) {
                        str8 = "";
                    } else {
                        str8 = str6;
                    }
                    if (i15 != 0) {
                        z14 = false;
                    } else {
                        z14 = z12;
                    }
                    if (i17 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i19 != 0) {
                        interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        };
                    }
                    InterfaceC2041a<C9072e> interfaceC2041a118 = interfaceC2041a2;
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q115 = ComposerKt.f3003a;
                    final Context context115 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                    InterfaceC0500b interfaceC0500bM11157d114 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                    AbstractC10270a abstractC10270a115 = C7499b.m14916N(composerImplMo1636j).f9262d;
                    if (z14) {
                        composerImplMo1636j.mo1622c(1853269473);
                        c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    } else {
                        composerImplMo1636j.mo1622c(1853269535);
                        c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                        composerImplMo1636j.m1609Q(false);
                    }
                    str9 = str8;
                    final String str1115 = str7;
                    final boolean z1111116 = z14;
                    final boolean z1111117 = z15;
                    composerImpl = composerImplMo1636j;
                    CardKt.m1558b(interfaceC2041a118, interfaceC0500bM11157d114, false, abstractC10270a115, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // cm.InterfaceC2057q
                        /* JADX INFO: renamed from: M */
                        public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                            long jM5363v;
                            Context context116;
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                            C5304d1 c5304d1;
                            InterfaceC0476a interfaceC0476a3;
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a119;
                            C7218l c7218lM14543a;
                            long jM11581a;
                            InterfaceC0476a interfaceC0476a4;
                            String str1116;
                            InterfaceC0476a interfaceC0476a5;
                            long jM5347f;
                            InterfaceC0476a interfaceC0476a6;
                            long jM11582b;
                            InterfaceC0476a interfaceC0476a7;
                            long jM5347f2;
                            InterfaceC0500b interfaceC0500bM11156c0;
                            InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                            int iIntValue = num.intValue();
                            C5207g.m11111f(interfaceC9771b, "$this$Card");
                            if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                                interfaceC0476a8.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q116 = ComposerKt.f3003a;
                                InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                boolean z20 = z1111117;
                                boolean z21 = z1111116;
                                if (z21) {
                                    interfaceC0476a8.mo1622c(1155538318);
                                    jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                    interfaceC0476a8.mo1661w();
                                } else if (z20) {
                                    interfaceC0476a8.mo1622c(1155538428);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                    interfaceC0476a8.mo1661w();
                                } else {
                                    interfaceC0476a8.mo1622c(1155538516);
                                    jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                    interfaceC0476a8.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                                String str1117 = str;
                                String str1118 = str2;
                                interfaceC0476a8.mo1622c(-483455358);
                                C0438a.f fVar = C0438a.f2429a;
                                InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                                interfaceC0476a8.mo1622c(-1323940314);
                                C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                                InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                                C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                                LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                                C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                                InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                                ComposeUiNode.f3726n.getClass();
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a1110 = ComposeUiNode.Companion.f3728b;
                                ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                                if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a8.mo1640l();
                                if (interfaceC0476a8.mo1632h()) {
                                    interfaceC0476a8.mo1634i(interfaceC2041a1110);
                                } else {
                                    interfaceC0476a8.mo1653s();
                                }
                                interfaceC0476a8.mo1644n();
                                InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                                InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                                C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                                C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                                interfaceC0476a8.mo1626e();
                                composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                                interfaceC0476a8.mo1622c(2058660585);
                                interfaceC0476a8.mo1622c(724544551);
                                Context context117 = context115;
                                if (z20) {
                                    String string = context117.getString(R.string.upgrade_special_offer);
                                    C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                    String upperCase = string.toUpperCase(Locale.ROOT);
                                    context116 = context117;
                                    C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                    TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                                } else {
                                    context116 = context117;
                                    interfaceC2056p = interfaceC2056p4;
                                    interfaceC2056p2 = interfaceC2056p6;
                                    c5304d1 = c5304d4;
                                    interfaceC0476a3 = interfaceC0476a8;
                                }
                                interfaceC0476a3.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                                C0438a.d dVar = C0438a.f2432d;
                                C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                                interfaceC0476a9.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                                interfaceC0476a9.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                                LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                                C5304d1 c5304d5 = c5304d1;
                                InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                                if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a9.mo1640l();
                                if (interfaceC0476a9.mo1632h()) {
                                    interfaceC2041a119 = interfaceC2041a1110;
                                    interfaceC0476a9.mo1634i(interfaceC2041a119);
                                } else {
                                    interfaceC2041a119 = interfaceC2041a1110;
                                    interfaceC0476a9.mo1653s();
                                }
                                interfaceC0476a9.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                                C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                                interfaceC0476a9.mo1626e();
                                composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                interfaceC0476a9.mo1622c(2058660585);
                                C6401a c6401a = C6401a.f36861a;
                                if (z20 != 0) {
                                    interfaceC0476a9.mo1622c(-59272409);
                                    c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59272023);
                                    c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                    interfaceC0476a9.mo1661w();
                                }
                                C7218l c7218l = c7218lM14543a;
                                if (r16 != 0 || z20) {
                                    interfaceC0476a9.mo1622c(-59271884);
                                    jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59271795);
                                    jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                    interfaceC0476a9.mo1661w();
                                }
                                InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a1111 = interfaceC2041a119;
                                int i23 = i21;
                                TextKt.m1576c(str1117, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                                interfaceC0476a9.mo1622c(724546263);
                                String str1119 = str9;
                                if (str1119.length() > 0) {
                                    String upperCase2 = str1119.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                    long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                    if (z20 != 0) {
                                        interfaceC0476a9.mo1622c(-59270956);
                                        interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                        interfaceC0476a9.mo1661w();
                                    } else {
                                        interfaceC0476a9.mo1622c(-59270264);
                                        interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                        interfaceC0476a9.mo1661w();
                                    }
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str1116 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                    TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                                } else {
                                    interfaceC0476a4 = interfaceC0476a9;
                                    str1116 = r7;
                                }
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1663x();
                                interfaceC0476a4.mo1661w();
                                interfaceC0476a4.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                                if (r16 != 0) {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    interfaceC0476a5.mo1622c(724548425);
                                    jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                    interfaceC0476a5.mo1661w();
                                } else {
                                    interfaceC0476a5 = interfaceC0476a4;
                                    if (z20 != 0) {
                                        interfaceC0476a5.mo1622c(724548519);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                        interfaceC0476a5.mo1661w();
                                    } else {
                                        interfaceC0476a5.mo1622c(724548598);
                                        jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                        interfaceC0476a5.mo1661w();
                                    }
                                }
                                DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                                interfaceC0476a5.mo1622c(724548705);
                                if (r16 != 0) {
                                    String string2 = context116.getString(R.string.upgrade_most_popular);
                                    C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                    String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                    C5207g.m11110e(upperCase3, str1116);
                                    interfaceC0476a6 = interfaceC0476a5;
                                    TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                                } else {
                                    interfaceC0476a6 = interfaceC0476a5;
                                }
                                interfaceC0476a6.mo1661w();
                                InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                                InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                                interfaceC0476a10.mo1622c(693286680);
                                InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                                interfaceC0476a10.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                                LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                                InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                                ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                                if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a10.mo1640l();
                                if (interfaceC0476a10.mo1632h()) {
                                    interfaceC0476a10.mo1634i(interfaceC2041a1111);
                                } else {
                                    interfaceC0476a10.mo1653s();
                                }
                                interfaceC0476a10.mo1644n();
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                                C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                                C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                                interfaceC0476a10.mo1626e();
                                composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                                interfaceC0476a10.mo1622c(2058660585);
                                C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                                if (z20 != 0) {
                                    interfaceC0476a10.mo1622c(-59268257);
                                    jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                    interfaceC0476a10.mo1661w();
                                } else {
                                    interfaceC0476a10.mo1622c(-59268159);
                                    jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                    interfaceC0476a10.mo1661w();
                                }
                                TextKt.m1576c(str1118, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                                interfaceC0476a10.mo1622c(724549877);
                                String str11110 = str1115;
                                if (str11110.length() > 0) {
                                    C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                    if (z21) {
                                        interfaceC0476a10.mo1622c(-59267725);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                        interfaceC0476a10.mo1661w();
                                    } else if (z20 != 0) {
                                        interfaceC0476a10.mo1622c(-59267615);
                                        jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                        interfaceC0476a10.mo1661w();
                                    } else {
                                        interfaceC0476a10.mo1622c(-59267510);
                                        jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                        interfaceC0476a10.mo1661w();
                                    }
                                    long j10 = jM5347f2;
                                    InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                    interfaceC0476a7 = interfaceC0476a10;
                                    TextKt.m1576c(str11110, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                                } else {
                                    interfaceC0476a7 = interfaceC0476a10;
                                }
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1663x();
                                interfaceC0476a7.mo1661w();
                                interfaceC0476a7.mo1661w();
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                    str10 = str7;
                    z16 = z14;
                    z17 = z15;
                    interfaceC2041a3 = interfaceC2041a118;
                }
                c5332q0M1612T = composerImpl.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        UpgradeItemCardKt.m10411a(str, str2, str10, str9, z16, z17, interfaceC2041a3, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 196608;
            z13 = z11;
            i19 = i11 & 64;
            if (i19 != 0) {
                i12 |= 1572864;
                interfaceC2041a2 = interfaceC2041a;
            } else {
                interfaceC2041a2 = interfaceC2041a;
                if ((i10 & 3670016) == 0) {
                    if (composerImplMo1636j.m1600H(interfaceC2041a2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
            }
            i21 = i12;
            if ((i21 & 2995931) == 599186) {
                if (i22 != 0) {
                    str7 = "";
                } else {
                    str7 = str5;
                }
                if (i13 != 0) {
                    str8 = "";
                } else {
                    str8 = str6;
                }
                if (i15 != 0) {
                    z14 = false;
                } else {
                    z14 = z12;
                }
                if (i17 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i19 != 0) {
                    interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final /* bridge */ /* synthetic */ C9072e mo807E() {
                            return C9072e.f47360a;
                        }
                    };
                }
                InterfaceC2041a<C9072e> interfaceC2041a119 = interfaceC2041a2;
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q116 = ComposerKt.f3003a;
                final Context context116 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                InterfaceC0500b interfaceC0500bM11157d115 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                AbstractC10270a abstractC10270a116 = C7499b.m14916N(composerImplMo1636j).f9262d;
                if (z14) {
                    composerImplMo1636j.mo1622c(1853269473);
                    c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                    composerImplMo1636j.m1609Q(false);
                } else {
                    composerImplMo1636j.mo1622c(1853269535);
                    c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                    composerImplMo1636j.m1609Q(false);
                }
                str9 = str8;
                final String str1116 = str7;
                final boolean z1111118 = z14;
                final boolean z1111119 = z15;
                composerImpl = composerImplMo1636j;
                CardKt.m1558b(interfaceC2041a119, interfaceC0500bM11157d115, false, abstractC10270a116, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // cm.InterfaceC2057q
                    /* JADX INFO: renamed from: M */
                    public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                        long jM5363v;
                        Context context117;
                        InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                        InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                        C5304d1 c5304d1;
                        InterfaceC0476a interfaceC0476a3;
                        InterfaceC2041a<ComposeUiNode> interfaceC2041a1110;
                        C7218l c7218lM14543a;
                        long jM11581a;
                        InterfaceC0476a interfaceC0476a4;
                        String str1117;
                        InterfaceC0476a interfaceC0476a5;
                        long jM5347f;
                        InterfaceC0476a interfaceC0476a6;
                        long jM11582b;
                        InterfaceC0476a interfaceC0476a7;
                        long jM5347f2;
                        InterfaceC0500b interfaceC0500bM11156c0;
                        InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                        int iIntValue = num.intValue();
                        C5207g.m11111f(interfaceC9771b, "$this$Card");
                        if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                            interfaceC0476a8.mo1650q();
                        } else {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q117 = ComposerKt.f3003a;
                            InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                            boolean z20 = z1111119;
                            boolean z21 = z1111118;
                            if (z21) {
                                interfaceC0476a8.mo1622c(1155538318);
                                jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                interfaceC0476a8.mo1661w();
                            } else if (z20) {
                                interfaceC0476a8.mo1622c(1155538428);
                                jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                interfaceC0476a8.mo1661w();
                            } else {
                                interfaceC0476a8.mo1622c(1155538516);
                                jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                interfaceC0476a8.mo1661w();
                            }
                            InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                            String str1118 = str;
                            String str1119 = str2;
                            interfaceC0476a8.mo1622c(-483455358);
                            C0438a.f fVar = C0438a.f2429a;
                            InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                            interfaceC0476a8.mo1622c(-1323940314);
                            C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                            InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                            C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                            LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                            C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                            InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                            ComposeUiNode.f3726n.getClass();
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a1111 = ComposeUiNode.Companion.f3728b;
                            ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                            if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a8.mo1640l();
                            if (interfaceC0476a8.mo1632h()) {
                                interfaceC0476a8.mo1634i(interfaceC2041a1111);
                            } else {
                                interfaceC0476a8.mo1653s();
                            }
                            interfaceC0476a8.mo1644n();
                            InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                            InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                            C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                            interfaceC0476a8.mo1626e();
                            composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                            interfaceC0476a8.mo1622c(2058660585);
                            interfaceC0476a8.mo1622c(724544551);
                            Context context118 = context116;
                            if (z20) {
                                String string = context118.getString(R.string.upgrade_special_offer);
                                C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                String upperCase = string.toUpperCase(Locale.ROOT);
                                context117 = context118;
                                C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                interfaceC2056p2 = interfaceC2056p6;
                                c5304d1 = c5304d4;
                                interfaceC2056p = interfaceC2056p4;
                                interfaceC0476a3 = interfaceC0476a8;
                                TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                            } else {
                                context117 = context118;
                                interfaceC2056p = interfaceC2056p4;
                                interfaceC2056p2 = interfaceC2056p6;
                                c5304d1 = c5304d4;
                                interfaceC0476a3 = interfaceC0476a8;
                            }
                            interfaceC0476a3.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                            C0438a.d dVar = C0438a.f2432d;
                            C7886b.b bVar = InterfaceC7885a.a.f42994f;
                            InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                            interfaceC0476a9.mo1622c(693286680);
                            InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                            interfaceC0476a9.mo1622c(-1323940314);
                            InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                            LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                            C5304d1 c5304d5 = c5304d1;
                            InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                            ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                            if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a9.mo1640l();
                            if (interfaceC0476a9.mo1632h()) {
                                interfaceC2041a1110 = interfaceC2041a1111;
                                interfaceC0476a9.mo1634i(interfaceC2041a1110);
                            } else {
                                interfaceC2041a1110 = interfaceC2041a1111;
                                interfaceC0476a9.mo1653s();
                            }
                            interfaceC0476a9.mo1644n();
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                            C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                            interfaceC0476a9.mo1626e();
                            composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                            interfaceC0476a9.mo1622c(2058660585);
                            C6401a c6401a = C6401a.f36861a;
                            if (z20 != 0) {
                                interfaceC0476a9.mo1622c(-59272409);
                                c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                interfaceC0476a9.mo1661w();
                            } else {
                                interfaceC0476a9.mo1622c(-59272023);
                                c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                interfaceC0476a9.mo1661w();
                            }
                            C7218l c7218l = c7218lM14543a;
                            if (r16 != 0 || z20) {
                                interfaceC0476a9.mo1622c(-59271884);
                                jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                interfaceC0476a9.mo1661w();
                            } else {
                                interfaceC0476a9.mo1622c(-59271795);
                                jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                interfaceC0476a9.mo1661w();
                            }
                            InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a1112 = interfaceC2041a1110;
                            int i23 = i21;
                            TextKt.m1576c(str1118, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                            interfaceC0476a9.mo1622c(724546263);
                            String str11110 = str9;
                            if (str11110.length() > 0) {
                                String upperCase2 = str11110.toUpperCase(Locale.ROOT);
                                C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                if (z20 != 0) {
                                    interfaceC0476a9.mo1622c(-59270956);
                                    interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59270264);
                                    interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                    interfaceC0476a9.mo1661w();
                                }
                                interfaceC0476a4 = interfaceC0476a9;
                                str1117 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                            } else {
                                interfaceC0476a4 = interfaceC0476a9;
                                str1117 = r7;
                            }
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1663x();
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                            if (r16 != 0) {
                                interfaceC0476a5 = interfaceC0476a4;
                                interfaceC0476a5.mo1622c(724548425);
                                jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                interfaceC0476a5.mo1661w();
                            } else {
                                interfaceC0476a5 = interfaceC0476a4;
                                if (z20 != 0) {
                                    interfaceC0476a5.mo1622c(724548519);
                                    jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                    interfaceC0476a5.mo1661w();
                                } else {
                                    interfaceC0476a5.mo1622c(724548598);
                                    jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                    interfaceC0476a5.mo1661w();
                                }
                            }
                            DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                            interfaceC0476a5.mo1622c(724548705);
                            if (r16 != 0) {
                                String string2 = context117.getString(R.string.upgrade_most_popular);
                                C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                C5207g.m11110e(upperCase3, str1117);
                                interfaceC0476a6 = interfaceC0476a5;
                                TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                            } else {
                                interfaceC0476a6 = interfaceC0476a5;
                            }
                            interfaceC0476a6.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                            InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                            interfaceC0476a10.mo1622c(693286680);
                            InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                            interfaceC0476a10.mo1622c(-1323940314);
                            InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                            LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                            InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                            ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                            if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a10.mo1640l();
                            if (interfaceC0476a10.mo1632h()) {
                                interfaceC0476a10.mo1634i(interfaceC2041a1112);
                            } else {
                                interfaceC0476a10.mo1653s();
                            }
                            interfaceC0476a10.mo1644n();
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                            C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                            interfaceC0476a10.mo1626e();
                            composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                            interfaceC0476a10.mo1622c(2058660585);
                            C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                            if (z20 != 0) {
                                interfaceC0476a10.mo1622c(-59268257);
                                jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                interfaceC0476a10.mo1661w();
                            } else {
                                interfaceC0476a10.mo1622c(-59268159);
                                jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                interfaceC0476a10.mo1661w();
                            }
                            TextKt.m1576c(str1119, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                            interfaceC0476a10.mo1622c(724549877);
                            String str11111 = str1116;
                            if (str11111.length() > 0) {
                                C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                if (z21) {
                                    interfaceC0476a10.mo1622c(-59267725);
                                    jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                    interfaceC0476a10.mo1661w();
                                } else if (z20 != 0) {
                                    interfaceC0476a10.mo1622c(-59267615);
                                    jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                    interfaceC0476a10.mo1661w();
                                } else {
                                    interfaceC0476a10.mo1622c(-59267510);
                                    jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                    interfaceC0476a10.mo1661w();
                                }
                                long j10 = jM5347f2;
                                InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                interfaceC0476a7 = interfaceC0476a10;
                                TextKt.m1576c(str11111, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                            } else {
                                interfaceC0476a7 = interfaceC0476a10;
                            }
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1663x();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1663x();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                        }
                        return C9072e.f47360a;
                    }
                }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                str10 = str7;
                z16 = z14;
                z17 = z15;
                interfaceC2041a3 = interfaceC2041a119;
            } else {
                if (i22 != 0) {
                    str7 = "";
                } else {
                    str7 = str5;
                }
                if (i13 != 0) {
                    str8 = "";
                } else {
                    str8 = str6;
                }
                if (i15 != 0) {
                    z14 = false;
                } else {
                    z14 = z12;
                }
                if (i17 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i19 != 0) {
                    interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final /* bridge */ /* synthetic */ C9072e mo807E() {
                            return C9072e.f47360a;
                        }
                    };
                }
                InterfaceC2041a<C9072e> interfaceC2041a1110 = interfaceC2041a2;
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q117 = ComposerKt.f3003a;
                final Context context117 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                InterfaceC0500b interfaceC0500bM11157d116 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                AbstractC10270a abstractC10270a117 = C7499b.m14916N(composerImplMo1636j).f9262d;
                if (z14) {
                    composerImplMo1636j.mo1622c(1853269473);
                    c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                    composerImplMo1636j.m1609Q(false);
                } else {
                    composerImplMo1636j.mo1622c(1853269535);
                    c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                    composerImplMo1636j.m1609Q(false);
                }
                str9 = str8;
                final String str1117 = str7;
                final boolean z11111110 = z14;
                final boolean z11111111 = z15;
                composerImpl = composerImplMo1636j;
                CardKt.m1558b(interfaceC2041a1110, interfaceC0500bM11157d116, false, abstractC10270a117, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // cm.InterfaceC2057q
                    /* JADX INFO: renamed from: M */
                    public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                        long jM5363v;
                        Context context118;
                        InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                        InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                        C5304d1 c5304d1;
                        InterfaceC0476a interfaceC0476a3;
                        InterfaceC2041a<ComposeUiNode> interfaceC2041a1111;
                        C7218l c7218lM14543a;
                        long jM11581a;
                        InterfaceC0476a interfaceC0476a4;
                        String str1118;
                        InterfaceC0476a interfaceC0476a5;
                        long jM5347f;
                        InterfaceC0476a interfaceC0476a6;
                        long jM11582b;
                        InterfaceC0476a interfaceC0476a7;
                        long jM5347f2;
                        InterfaceC0500b interfaceC0500bM11156c0;
                        InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                        int iIntValue = num.intValue();
                        C5207g.m11111f(interfaceC9771b, "$this$Card");
                        if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                            interfaceC0476a8.mo1650q();
                        } else {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q118 = ComposerKt.f3003a;
                            InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                            boolean z20 = z11111111;
                            boolean z21 = z11111110;
                            if (z21) {
                                interfaceC0476a8.mo1622c(1155538318);
                                jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                interfaceC0476a8.mo1661w();
                            } else if (z20) {
                                interfaceC0476a8.mo1622c(1155538428);
                                jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                interfaceC0476a8.mo1661w();
                            } else {
                                interfaceC0476a8.mo1622c(1155538516);
                                jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                interfaceC0476a8.mo1661w();
                            }
                            InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                            String str1119 = str;
                            String str11110 = str2;
                            interfaceC0476a8.mo1622c(-483455358);
                            C0438a.f fVar = C0438a.f2429a;
                            InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                            interfaceC0476a8.mo1622c(-1323940314);
                            C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                            InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                            C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                            LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                            C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                            InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                            ComposeUiNode.f3726n.getClass();
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a1112 = ComposeUiNode.Companion.f3728b;
                            ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                            if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a8.mo1640l();
                            if (interfaceC0476a8.mo1632h()) {
                                interfaceC0476a8.mo1634i(interfaceC2041a1112);
                            } else {
                                interfaceC0476a8.mo1653s();
                            }
                            interfaceC0476a8.mo1644n();
                            InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                            InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                            C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                            interfaceC0476a8.mo1626e();
                            composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                            interfaceC0476a8.mo1622c(2058660585);
                            interfaceC0476a8.mo1622c(724544551);
                            Context context119 = context117;
                            if (z20) {
                                String string = context119.getString(R.string.upgrade_special_offer);
                                C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                String upperCase = string.toUpperCase(Locale.ROOT);
                                context118 = context119;
                                C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                interfaceC2056p2 = interfaceC2056p6;
                                c5304d1 = c5304d4;
                                interfaceC2056p = interfaceC2056p4;
                                interfaceC0476a3 = interfaceC0476a8;
                                TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                            } else {
                                context118 = context119;
                                interfaceC2056p = interfaceC2056p4;
                                interfaceC2056p2 = interfaceC2056p6;
                                c5304d1 = c5304d4;
                                interfaceC0476a3 = interfaceC0476a8;
                            }
                            interfaceC0476a3.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                            C0438a.d dVar = C0438a.f2432d;
                            C7886b.b bVar = InterfaceC7885a.a.f42994f;
                            InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                            interfaceC0476a9.mo1622c(693286680);
                            InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                            interfaceC0476a9.mo1622c(-1323940314);
                            InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                            LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                            C5304d1 c5304d5 = c5304d1;
                            InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                            ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                            if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a9.mo1640l();
                            if (interfaceC0476a9.mo1632h()) {
                                interfaceC2041a1111 = interfaceC2041a1112;
                                interfaceC0476a9.mo1634i(interfaceC2041a1111);
                            } else {
                                interfaceC2041a1111 = interfaceC2041a1112;
                                interfaceC0476a9.mo1653s();
                            }
                            interfaceC0476a9.mo1644n();
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                            C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                            interfaceC0476a9.mo1626e();
                            composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                            interfaceC0476a9.mo1622c(2058660585);
                            C6401a c6401a = C6401a.f36861a;
                            if (z20 != 0) {
                                interfaceC0476a9.mo1622c(-59272409);
                                c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                interfaceC0476a9.mo1661w();
                            } else {
                                interfaceC0476a9.mo1622c(-59272023);
                                c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                interfaceC0476a9.mo1661w();
                            }
                            C7218l c7218l = c7218lM14543a;
                            if (r16 != 0 || z20) {
                                interfaceC0476a9.mo1622c(-59271884);
                                jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                interfaceC0476a9.mo1661w();
                            } else {
                                interfaceC0476a9.mo1622c(-59271795);
                                jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                interfaceC0476a9.mo1661w();
                            }
                            InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a1113 = interfaceC2041a1111;
                            int i23 = i21;
                            TextKt.m1576c(str1119, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                            interfaceC0476a9.mo1622c(724546263);
                            String str11111 = str9;
                            if (str11111.length() > 0) {
                                String upperCase2 = str11111.toUpperCase(Locale.ROOT);
                                C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                if (z20 != 0) {
                                    interfaceC0476a9.mo1622c(-59270956);
                                    interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59270264);
                                    interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                    interfaceC0476a9.mo1661w();
                                }
                                interfaceC0476a4 = interfaceC0476a9;
                                str1118 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                            } else {
                                interfaceC0476a4 = interfaceC0476a9;
                                str1118 = r7;
                            }
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1663x();
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                            if (r16 != 0) {
                                interfaceC0476a5 = interfaceC0476a4;
                                interfaceC0476a5.mo1622c(724548425);
                                jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                interfaceC0476a5.mo1661w();
                            } else {
                                interfaceC0476a5 = interfaceC0476a4;
                                if (z20 != 0) {
                                    interfaceC0476a5.mo1622c(724548519);
                                    jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                    interfaceC0476a5.mo1661w();
                                } else {
                                    interfaceC0476a5.mo1622c(724548598);
                                    jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                    interfaceC0476a5.mo1661w();
                                }
                            }
                            DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                            interfaceC0476a5.mo1622c(724548705);
                            if (r16 != 0) {
                                String string2 = context118.getString(R.string.upgrade_most_popular);
                                C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                C5207g.m11110e(upperCase3, str1118);
                                interfaceC0476a6 = interfaceC0476a5;
                                TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                            } else {
                                interfaceC0476a6 = interfaceC0476a5;
                            }
                            interfaceC0476a6.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                            InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                            interfaceC0476a10.mo1622c(693286680);
                            InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                            interfaceC0476a10.mo1622c(-1323940314);
                            InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                            LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                            InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                            ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                            if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a10.mo1640l();
                            if (interfaceC0476a10.mo1632h()) {
                                interfaceC0476a10.mo1634i(interfaceC2041a1113);
                            } else {
                                interfaceC0476a10.mo1653s();
                            }
                            interfaceC0476a10.mo1644n();
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                            C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                            interfaceC0476a10.mo1626e();
                            composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                            interfaceC0476a10.mo1622c(2058660585);
                            C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                            if (z20 != 0) {
                                interfaceC0476a10.mo1622c(-59268257);
                                jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                interfaceC0476a10.mo1661w();
                            } else {
                                interfaceC0476a10.mo1622c(-59268159);
                                jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                interfaceC0476a10.mo1661w();
                            }
                            TextKt.m1576c(str11110, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                            interfaceC0476a10.mo1622c(724549877);
                            String str11112 = str1117;
                            if (str11112.length() > 0) {
                                C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                if (z21) {
                                    interfaceC0476a10.mo1622c(-59267725);
                                    jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                    interfaceC0476a10.mo1661w();
                                } else if (z20 != 0) {
                                    interfaceC0476a10.mo1622c(-59267615);
                                    jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                    interfaceC0476a10.mo1661w();
                                } else {
                                    interfaceC0476a10.mo1622c(-59267510);
                                    jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                    interfaceC0476a10.mo1661w();
                                }
                                long j10 = jM5347f2;
                                InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                interfaceC0476a7 = interfaceC0476a10;
                                TextKt.m1576c(str11112, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                            } else {
                                interfaceC0476a7 = interfaceC0476a10;
                            }
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1663x();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1663x();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                        }
                        return C9072e.f47360a;
                    }
                }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                str10 = str7;
                z16 = z14;
                z17 = z15;
                interfaceC2041a3 = interfaceC2041a1110;
            }
            c5332q0M1612T = composerImpl.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    UpgradeItemCardKt.m10411a(str, str2, str10, str9, z16, z17, interfaceC2041a3, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 24576;
        z12 = z10;
        i17 = i11 & 32;
        if (i17 != 0) {
            if ((458752 & i10) == 0) {
                z13 = z11;
                if (composerImplMo1636j.m1598G(z13)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
            i19 = i11 & 64;
            if (i19 != 0) {
                i12 |= 1572864;
                interfaceC2041a2 = interfaceC2041a;
            } else {
                interfaceC2041a2 = interfaceC2041a;
                if ((i10 & 3670016) == 0) {
                    if (composerImplMo1636j.m1600H(interfaceC2041a2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
            }
            i21 = i12;
            if ((i21 & 2995931) == 599186) {
                if (i22 != 0) {
                    str7 = "";
                } else {
                    str7 = str5;
                }
                if (i13 != 0) {
                    str8 = "";
                } else {
                    str8 = str6;
                }
                if (i15 != 0) {
                    z14 = false;
                } else {
                    z14 = z12;
                }
                if (i17 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i19 != 0) {
                    interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final /* bridge */ /* synthetic */ C9072e mo807E() {
                            return C9072e.f47360a;
                        }
                    };
                }
                InterfaceC2041a<C9072e> interfaceC2041a1111 = interfaceC2041a2;
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q118 = ComposerKt.f3003a;
                final Context context118 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                InterfaceC0500b interfaceC0500bM11157d117 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                AbstractC10270a abstractC10270a118 = C7499b.m14916N(composerImplMo1636j).f9262d;
                if (z14) {
                    composerImplMo1636j.mo1622c(1853269473);
                    c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                    composerImplMo1636j.m1609Q(false);
                } else {
                    composerImplMo1636j.mo1622c(1853269535);
                    c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                    composerImplMo1636j.m1609Q(false);
                }
                str9 = str8;
                final String str1118 = str7;
                final boolean z11111112 = z14;
                final boolean z11111113 = z15;
                composerImpl = composerImplMo1636j;
                CardKt.m1558b(interfaceC2041a1111, interfaceC0500bM11157d117, false, abstractC10270a118, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // cm.InterfaceC2057q
                    /* JADX INFO: renamed from: M */
                    public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                        long jM5363v;
                        Context context119;
                        InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                        InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                        C5304d1 c5304d1;
                        InterfaceC0476a interfaceC0476a3;
                        InterfaceC2041a<ComposeUiNode> interfaceC2041a1112;
                        C7218l c7218lM14543a;
                        long jM11581a;
                        InterfaceC0476a interfaceC0476a4;
                        String str1119;
                        InterfaceC0476a interfaceC0476a5;
                        long jM5347f;
                        InterfaceC0476a interfaceC0476a6;
                        long jM11582b;
                        InterfaceC0476a interfaceC0476a7;
                        long jM5347f2;
                        InterfaceC0500b interfaceC0500bM11156c0;
                        InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                        int iIntValue = num.intValue();
                        C5207g.m11111f(interfaceC9771b, "$this$Card");
                        if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                            interfaceC0476a8.mo1650q();
                        } else {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q119 = ComposerKt.f3003a;
                            InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                            boolean z20 = z11111113;
                            boolean z21 = z11111112;
                            if (z21) {
                                interfaceC0476a8.mo1622c(1155538318);
                                jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                interfaceC0476a8.mo1661w();
                            } else if (z20) {
                                interfaceC0476a8.mo1622c(1155538428);
                                jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                interfaceC0476a8.mo1661w();
                            } else {
                                interfaceC0476a8.mo1622c(1155538516);
                                jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                interfaceC0476a8.mo1661w();
                            }
                            InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                            String str11110 = str;
                            String str11111 = str2;
                            interfaceC0476a8.mo1622c(-483455358);
                            C0438a.f fVar = C0438a.f2429a;
                            InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                            interfaceC0476a8.mo1622c(-1323940314);
                            C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                            InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                            C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                            LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                            C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                            InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                            ComposeUiNode.f3726n.getClass();
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a1113 = ComposeUiNode.Companion.f3728b;
                            ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                            if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a8.mo1640l();
                            if (interfaceC0476a8.mo1632h()) {
                                interfaceC0476a8.mo1634i(interfaceC2041a1113);
                            } else {
                                interfaceC0476a8.mo1653s();
                            }
                            interfaceC0476a8.mo1644n();
                            InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                            InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                            C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                            interfaceC0476a8.mo1626e();
                            composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                            interfaceC0476a8.mo1622c(2058660585);
                            interfaceC0476a8.mo1622c(724544551);
                            Context context1110 = context118;
                            if (z20) {
                                String string = context1110.getString(R.string.upgrade_special_offer);
                                C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                String upperCase = string.toUpperCase(Locale.ROOT);
                                context119 = context1110;
                                C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                interfaceC2056p2 = interfaceC2056p6;
                                c5304d1 = c5304d4;
                                interfaceC2056p = interfaceC2056p4;
                                interfaceC0476a3 = interfaceC0476a8;
                                TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                            } else {
                                context119 = context1110;
                                interfaceC2056p = interfaceC2056p4;
                                interfaceC2056p2 = interfaceC2056p6;
                                c5304d1 = c5304d4;
                                interfaceC0476a3 = interfaceC0476a8;
                            }
                            interfaceC0476a3.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                            C0438a.d dVar = C0438a.f2432d;
                            C7886b.b bVar = InterfaceC7885a.a.f42994f;
                            InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                            interfaceC0476a9.mo1622c(693286680);
                            InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                            interfaceC0476a9.mo1622c(-1323940314);
                            InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                            LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                            C5304d1 c5304d5 = c5304d1;
                            InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                            ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                            if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a9.mo1640l();
                            if (interfaceC0476a9.mo1632h()) {
                                interfaceC2041a1112 = interfaceC2041a1113;
                                interfaceC0476a9.mo1634i(interfaceC2041a1112);
                            } else {
                                interfaceC2041a1112 = interfaceC2041a1113;
                                interfaceC0476a9.mo1653s();
                            }
                            interfaceC0476a9.mo1644n();
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                            C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                            interfaceC0476a9.mo1626e();
                            composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                            interfaceC0476a9.mo1622c(2058660585);
                            C6401a c6401a = C6401a.f36861a;
                            if (z20 != 0) {
                                interfaceC0476a9.mo1622c(-59272409);
                                c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                interfaceC0476a9.mo1661w();
                            } else {
                                interfaceC0476a9.mo1622c(-59272023);
                                c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                interfaceC0476a9.mo1661w();
                            }
                            C7218l c7218l = c7218lM14543a;
                            if (r16 != 0 || z20) {
                                interfaceC0476a9.mo1622c(-59271884);
                                jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                interfaceC0476a9.mo1661w();
                            } else {
                                interfaceC0476a9.mo1622c(-59271795);
                                jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                interfaceC0476a9.mo1661w();
                            }
                            InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a1114 = interfaceC2041a1112;
                            int i23 = i21;
                            TextKt.m1576c(str11110, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                            interfaceC0476a9.mo1622c(724546263);
                            String str11112 = str9;
                            if (str11112.length() > 0) {
                                String upperCase2 = str11112.toUpperCase(Locale.ROOT);
                                C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                if (z20 != 0) {
                                    interfaceC0476a9.mo1622c(-59270956);
                                    interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59270264);
                                    interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                    interfaceC0476a9.mo1661w();
                                }
                                interfaceC0476a4 = interfaceC0476a9;
                                str1119 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                            } else {
                                interfaceC0476a4 = interfaceC0476a9;
                                str1119 = r7;
                            }
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1663x();
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                            if (r16 != 0) {
                                interfaceC0476a5 = interfaceC0476a4;
                                interfaceC0476a5.mo1622c(724548425);
                                jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                interfaceC0476a5.mo1661w();
                            } else {
                                interfaceC0476a5 = interfaceC0476a4;
                                if (z20 != 0) {
                                    interfaceC0476a5.mo1622c(724548519);
                                    jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                    interfaceC0476a5.mo1661w();
                                } else {
                                    interfaceC0476a5.mo1622c(724548598);
                                    jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                    interfaceC0476a5.mo1661w();
                                }
                            }
                            DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                            interfaceC0476a5.mo1622c(724548705);
                            if (r16 != 0) {
                                String string2 = context119.getString(R.string.upgrade_most_popular);
                                C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                C5207g.m11110e(upperCase3, str1119);
                                interfaceC0476a6 = interfaceC0476a5;
                                TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                            } else {
                                interfaceC0476a6 = interfaceC0476a5;
                            }
                            interfaceC0476a6.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                            InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                            interfaceC0476a10.mo1622c(693286680);
                            InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                            interfaceC0476a10.mo1622c(-1323940314);
                            InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                            LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                            InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                            ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                            if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a10.mo1640l();
                            if (interfaceC0476a10.mo1632h()) {
                                interfaceC0476a10.mo1634i(interfaceC2041a1114);
                            } else {
                                interfaceC0476a10.mo1653s();
                            }
                            interfaceC0476a10.mo1644n();
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                            C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                            interfaceC0476a10.mo1626e();
                            composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                            interfaceC0476a10.mo1622c(2058660585);
                            C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                            if (z20 != 0) {
                                interfaceC0476a10.mo1622c(-59268257);
                                jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                interfaceC0476a10.mo1661w();
                            } else {
                                interfaceC0476a10.mo1622c(-59268159);
                                jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                interfaceC0476a10.mo1661w();
                            }
                            TextKt.m1576c(str11111, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                            interfaceC0476a10.mo1622c(724549877);
                            String str11113 = str1118;
                            if (str11113.length() > 0) {
                                C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                if (z21) {
                                    interfaceC0476a10.mo1622c(-59267725);
                                    jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                    interfaceC0476a10.mo1661w();
                                } else if (z20 != 0) {
                                    interfaceC0476a10.mo1622c(-59267615);
                                    jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                    interfaceC0476a10.mo1661w();
                                } else {
                                    interfaceC0476a10.mo1622c(-59267510);
                                    jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                    interfaceC0476a10.mo1661w();
                                }
                                long j10 = jM5347f2;
                                InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                interfaceC0476a7 = interfaceC0476a10;
                                TextKt.m1576c(str11113, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                            } else {
                                interfaceC0476a7 = interfaceC0476a10;
                            }
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1663x();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1663x();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                        }
                        return C9072e.f47360a;
                    }
                }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                str10 = str7;
                z16 = z14;
                z17 = z15;
                interfaceC2041a3 = interfaceC2041a1111;
            } else {
                if (i22 != 0) {
                    str7 = "";
                } else {
                    str7 = str5;
                }
                if (i13 != 0) {
                    str8 = "";
                } else {
                    str8 = str6;
                }
                if (i15 != 0) {
                    z14 = false;
                } else {
                    z14 = z12;
                }
                if (i17 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i19 != 0) {
                    interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final /* bridge */ /* synthetic */ C9072e mo807E() {
                            return C9072e.f47360a;
                        }
                    };
                }
                InterfaceC2041a<C9072e> interfaceC2041a1112 = interfaceC2041a2;
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q119 = ComposerKt.f3003a;
                final Context context119 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                InterfaceC0500b interfaceC0500bM11157d118 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
                AbstractC10270a abstractC10270a119 = C7499b.m14916N(composerImplMo1636j).f9262d;
                if (z14) {
                    composerImplMo1636j.mo1622c(1853269473);
                    c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                    composerImplMo1636j.m1609Q(false);
                } else {
                    composerImplMo1636j.mo1622c(1853269535);
                    c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                    composerImplMo1636j.m1609Q(false);
                }
                str9 = str8;
                final String str1119 = str7;
                final boolean z11111114 = z14;
                final boolean z11111115 = z15;
                composerImpl = composerImplMo1636j;
                CardKt.m1558b(interfaceC2041a1112, interfaceC0500bM11157d118, false, abstractC10270a119, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // cm.InterfaceC2057q
                    /* JADX INFO: renamed from: M */
                    public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                        long jM5363v;
                        Context context1110;
                        InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                        InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                        C5304d1 c5304d1;
                        InterfaceC0476a interfaceC0476a3;
                        InterfaceC2041a<ComposeUiNode> interfaceC2041a1113;
                        C7218l c7218lM14543a;
                        long jM11581a;
                        InterfaceC0476a interfaceC0476a4;
                        String str11110;
                        InterfaceC0476a interfaceC0476a5;
                        long jM5347f;
                        InterfaceC0476a interfaceC0476a6;
                        long jM11582b;
                        InterfaceC0476a interfaceC0476a7;
                        long jM5347f2;
                        InterfaceC0500b interfaceC0500bM11156c0;
                        InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                        int iIntValue = num.intValue();
                        C5207g.m11111f(interfaceC9771b, "$this$Card");
                        if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                            interfaceC0476a8.mo1650q();
                        } else {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1110 = ComposerKt.f3003a;
                            InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                            boolean z20 = z11111115;
                            boolean z21 = z11111114;
                            if (z21) {
                                interfaceC0476a8.mo1622c(1155538318);
                                jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                                interfaceC0476a8.mo1661w();
                            } else if (z20) {
                                interfaceC0476a8.mo1622c(1155538428);
                                jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                                interfaceC0476a8.mo1661w();
                            } else {
                                interfaceC0476a8.mo1622c(1155538516);
                                jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                                interfaceC0476a8.mo1661w();
                            }
                            InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                            String str11111 = str;
                            String str11112 = str2;
                            interfaceC0476a8.mo1622c(-483455358);
                            C0438a.f fVar = C0438a.f2429a;
                            InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                            interfaceC0476a8.mo1622c(-1323940314);
                            C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                            InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                            C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                            LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                            C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                            InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                            ComposeUiNode.f3726n.getClass();
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a1114 = ComposeUiNode.Companion.f3728b;
                            ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                            if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a8.mo1640l();
                            if (interfaceC0476a8.mo1632h()) {
                                interfaceC0476a8.mo1634i(interfaceC2041a1114);
                            } else {
                                interfaceC0476a8.mo1653s();
                            }
                            interfaceC0476a8.mo1644n();
                            InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                            InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                            C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                            C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                            interfaceC0476a8.mo1626e();
                            composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                            interfaceC0476a8.mo1622c(2058660585);
                            interfaceC0476a8.mo1622c(724544551);
                            Context context1111 = context119;
                            if (z20) {
                                String string = context1111.getString(R.string.upgrade_special_offer);
                                C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                                String upperCase = string.toUpperCase(Locale.ROOT);
                                context1110 = context1111;
                                C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                interfaceC2056p2 = interfaceC2056p6;
                                c5304d1 = c5304d4;
                                interfaceC2056p = interfaceC2056p4;
                                interfaceC0476a3 = interfaceC0476a8;
                                TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                            } else {
                                context1110 = context1111;
                                interfaceC2056p = interfaceC2056p4;
                                interfaceC2056p2 = interfaceC2056p6;
                                c5304d1 = c5304d4;
                                interfaceC0476a3 = interfaceC0476a8;
                            }
                            interfaceC0476a3.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                            C0438a.d dVar = C0438a.f2432d;
                            C7886b.b bVar = InterfaceC7885a.a.f42994f;
                            InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                            interfaceC0476a9.mo1622c(693286680);
                            InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                            interfaceC0476a9.mo1622c(-1323940314);
                            InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                            LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                            C5304d1 c5304d5 = c5304d1;
                            InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                            ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                            if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a9.mo1640l();
                            if (interfaceC0476a9.mo1632h()) {
                                interfaceC2041a1113 = interfaceC2041a1114;
                                interfaceC0476a9.mo1634i(interfaceC2041a1113);
                            } else {
                                interfaceC2041a1113 = interfaceC2041a1114;
                                interfaceC0476a9.mo1653s();
                            }
                            interfaceC0476a9.mo1644n();
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                            C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                            C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                            interfaceC0476a9.mo1626e();
                            composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                            interfaceC0476a9.mo1622c(2058660585);
                            C6401a c6401a = C6401a.f36861a;
                            if (z20 != 0) {
                                interfaceC0476a9.mo1622c(-59272409);
                                c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                interfaceC0476a9.mo1661w();
                            } else {
                                interfaceC0476a9.mo1622c(-59272023);
                                c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                                interfaceC0476a9.mo1661w();
                            }
                            C7218l c7218l = c7218lM14543a;
                            if (r16 != 0 || z20) {
                                interfaceC0476a9.mo1622c(-59271884);
                                jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                interfaceC0476a9.mo1661w();
                            } else {
                                interfaceC0476a9.mo1622c(-59271795);
                                jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                                interfaceC0476a9.mo1661w();
                            }
                            InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a1115 = interfaceC2041a1113;
                            int i23 = i21;
                            TextKt.m1576c(str11111, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                            interfaceC0476a9.mo1622c(724546263);
                            String str11113 = str9;
                            if (str11113.length() > 0) {
                                String upperCase2 = str11113.toUpperCase(Locale.ROOT);
                                C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                                long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                                if (z20 != 0) {
                                    interfaceC0476a9.mo1622c(-59270956);
                                    interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                    interfaceC0476a9.mo1661w();
                                } else {
                                    interfaceC0476a9.mo1622c(-59270264);
                                    interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                    interfaceC0476a9.mo1661w();
                                }
                                interfaceC0476a4 = interfaceC0476a9;
                                str11110 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                                TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                            } else {
                                interfaceC0476a4 = interfaceC0476a9;
                                str11110 = r7;
                            }
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1663x();
                            interfaceC0476a4.mo1661w();
                            interfaceC0476a4.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                            if (r16 != 0) {
                                interfaceC0476a5 = interfaceC0476a4;
                                interfaceC0476a5.mo1622c(724548425);
                                jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                                interfaceC0476a5.mo1661w();
                            } else {
                                interfaceC0476a5 = interfaceC0476a4;
                                if (z20 != 0) {
                                    interfaceC0476a5.mo1622c(724548519);
                                    jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                    interfaceC0476a5.mo1661w();
                                } else {
                                    interfaceC0476a5.mo1622c(724548598);
                                    jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                    interfaceC0476a5.mo1661w();
                                }
                            }
                            DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                            interfaceC0476a5.mo1622c(724548705);
                            if (r16 != 0) {
                                String string2 = context1110.getString(R.string.upgrade_most_popular);
                                C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                                String upperCase3 = string2.toUpperCase(Locale.ROOT);
                                C5207g.m11110e(upperCase3, str11110);
                                interfaceC0476a6 = interfaceC0476a5;
                                TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                            } else {
                                interfaceC0476a6 = interfaceC0476a5;
                            }
                            interfaceC0476a6.mo1661w();
                            InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                            InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                            interfaceC0476a10.mo1622c(693286680);
                            InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                            interfaceC0476a10.mo1622c(-1323940314);
                            InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                            LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                            InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                            ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                            if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a10.mo1640l();
                            if (interfaceC0476a10.mo1632h()) {
                                interfaceC0476a10.mo1634i(interfaceC2041a1115);
                            } else {
                                interfaceC0476a10.mo1653s();
                            }
                            interfaceC0476a10.mo1644n();
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                            C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                            C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                            interfaceC0476a10.mo1626e();
                            composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                            interfaceC0476a10.mo1622c(2058660585);
                            C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                            if (z20 != 0) {
                                interfaceC0476a10.mo1622c(-59268257);
                                jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                interfaceC0476a10.mo1661w();
                            } else {
                                interfaceC0476a10.mo1622c(-59268159);
                                jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                                interfaceC0476a10.mo1661w();
                            }
                            TextKt.m1576c(str11112, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                            interfaceC0476a10.mo1622c(724549877);
                            String str11114 = str1119;
                            if (str11114.length() > 0) {
                                C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                if (z21) {
                                    interfaceC0476a10.mo1622c(-59267725);
                                    jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                    interfaceC0476a10.mo1661w();
                                } else if (z20 != 0) {
                                    interfaceC0476a10.mo1622c(-59267615);
                                    jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                    interfaceC0476a10.mo1661w();
                                } else {
                                    interfaceC0476a10.mo1622c(-59267510);
                                    jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                    interfaceC0476a10.mo1661w();
                                }
                                long j10 = jM5347f2;
                                InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                                interfaceC0476a7 = interfaceC0476a10;
                                TextKt.m1576c(str11114, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                            } else {
                                interfaceC0476a7 = interfaceC0476a10;
                            }
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1663x();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1663x();
                            interfaceC0476a7.mo1661w();
                            interfaceC0476a7.mo1661w();
                        }
                        return C9072e.f47360a;
                    }
                }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
                str10 = str7;
                z16 = z14;
                z17 = z15;
                interfaceC2041a3 = interfaceC2041a1112;
            }
            c5332q0M1612T = composerImpl.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    UpgradeItemCardKt.m10411a(str, str2, str10, str9, z16, z17, interfaceC2041a3, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 196608;
        z13 = z11;
        i19 = i11 & 64;
        if (i19 != 0) {
            i12 |= 1572864;
            interfaceC2041a2 = interfaceC2041a;
        } else {
            interfaceC2041a2 = interfaceC2041a;
            if ((i10 & 3670016) == 0) {
                if (composerImplMo1636j.m1600H(interfaceC2041a2)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
        }
        i21 = i12;
        if ((i21 & 2995931) == 599186) {
            if (i22 != 0) {
                str7 = "";
            } else {
                str7 = str5;
            }
            if (i13 != 0) {
                str8 = "";
            } else {
                str8 = str6;
            }
            if (i15 != 0) {
                z14 = false;
            } else {
                z14 = z12;
            }
            if (i17 != 0) {
                z15 = false;
            } else {
                z15 = z13;
            }
            if (i19 != 0) {
                interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final /* bridge */ /* synthetic */ C9072e mo807E() {
                        return C9072e.f47360a;
                    }
                };
            }
            InterfaceC2041a<C9072e> interfaceC2041a1113 = interfaceC2041a2;
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1110 = ComposerKt.f3003a;
            final Context context1110 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
            InterfaceC0500b interfaceC0500bM11157d119 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
            AbstractC10270a abstractC10270a1110 = C7499b.m14916N(composerImplMo1636j).f9262d;
            if (z14) {
                composerImplMo1636j.mo1622c(1853269473);
                c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                composerImplMo1636j.m1609Q(false);
            } else {
                composerImplMo1636j.mo1622c(1853269535);
                c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                composerImplMo1636j.m1609Q(false);
            }
            str9 = str8;
            final String str11110 = str7;
            final boolean z11111116 = z14;
            final boolean z11111117 = z15;
            composerImpl = composerImplMo1636j;
            CardKt.m1558b(interfaceC2041a1113, interfaceC0500bM11157d119, false, abstractC10270a1110, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                    long jM5363v;
                    Context context1111;
                    InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                    InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                    C5304d1 c5304d1;
                    InterfaceC0476a interfaceC0476a3;
                    InterfaceC2041a<ComposeUiNode> interfaceC2041a1114;
                    C7218l c7218lM14543a;
                    long jM11581a;
                    InterfaceC0476a interfaceC0476a4;
                    String str11111;
                    InterfaceC0476a interfaceC0476a5;
                    long jM5347f;
                    InterfaceC0476a interfaceC0476a6;
                    long jM11582b;
                    InterfaceC0476a interfaceC0476a7;
                    long jM5347f2;
                    InterfaceC0500b interfaceC0500bM11156c0;
                    InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                    int iIntValue = num.intValue();
                    C5207g.m11111f(interfaceC9771b, "$this$Card");
                    if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                        interfaceC0476a8.mo1650q();
                    } else {
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111 = ComposerKt.f3003a;
                        InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                        boolean z20 = z11111117;
                        boolean z21 = z11111116;
                        if (z21) {
                            interfaceC0476a8.mo1622c(1155538318);
                            jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                            interfaceC0476a8.mo1661w();
                        } else if (z20) {
                            interfaceC0476a8.mo1622c(1155538428);
                            jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                            interfaceC0476a8.mo1661w();
                        } else {
                            interfaceC0476a8.mo1622c(1155538516);
                            jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                            interfaceC0476a8.mo1661w();
                        }
                        InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                        String str11112 = str;
                        String str11113 = str2;
                        interfaceC0476a8.mo1622c(-483455358);
                        C0438a.f fVar = C0438a.f2429a;
                        InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                        interfaceC0476a8.mo1622c(-1323940314);
                        C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                        InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                        C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                        LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                        C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                        InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                        ComposeUiNode.f3726n.getClass();
                        InterfaceC2041a<ComposeUiNode> interfaceC2041a1115 = ComposeUiNode.Companion.f3728b;
                        ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                        if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        interfaceC0476a8.mo1640l();
                        if (interfaceC0476a8.mo1632h()) {
                            interfaceC0476a8.mo1634i(interfaceC2041a1115);
                        } else {
                            interfaceC0476a8.mo1653s();
                        }
                        interfaceC0476a8.mo1644n();
                        InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                        C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                        InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                        C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                        InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                        C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                        InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                        C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                        interfaceC0476a8.mo1626e();
                        composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                        interfaceC0476a8.mo1622c(2058660585);
                        interfaceC0476a8.mo1622c(724544551);
                        Context context1112 = context1110;
                        if (z20) {
                            String string = context1112.getString(R.string.upgrade_special_offer);
                            C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                            String upperCase = string.toUpperCase(Locale.ROOT);
                            context1111 = context1112;
                            C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                            interfaceC2056p2 = interfaceC2056p6;
                            c5304d1 = c5304d4;
                            interfaceC2056p = interfaceC2056p4;
                            interfaceC0476a3 = interfaceC0476a8;
                            TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                        } else {
                            context1111 = context1112;
                            interfaceC2056p = interfaceC2056p4;
                            interfaceC2056p2 = interfaceC2056p6;
                            c5304d1 = c5304d4;
                            interfaceC0476a3 = interfaceC0476a8;
                        }
                        interfaceC0476a3.mo1661w();
                        InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                        C0438a.d dVar = C0438a.f2432d;
                        C7886b.b bVar = InterfaceC7885a.a.f42994f;
                        InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                        interfaceC0476a9.mo1622c(693286680);
                        InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                        interfaceC0476a9.mo1622c(-1323940314);
                        InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                        LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                        C5304d1 c5304d5 = c5304d1;
                        InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                        ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                        if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        interfaceC0476a9.mo1640l();
                        if (interfaceC0476a9.mo1632h()) {
                            interfaceC2041a1114 = interfaceC2041a1115;
                            interfaceC0476a9.mo1634i(interfaceC2041a1114);
                        } else {
                            interfaceC2041a1114 = interfaceC2041a1115;
                            interfaceC0476a9.mo1653s();
                        }
                        interfaceC0476a9.mo1644n();
                        C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                        InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                        C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                        C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                        InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                        C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                        interfaceC0476a9.mo1626e();
                        composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                        interfaceC0476a9.mo1622c(2058660585);
                        C6401a c6401a = C6401a.f36861a;
                        if (z20 != 0) {
                            interfaceC0476a9.mo1622c(-59272409);
                            c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                            interfaceC0476a9.mo1661w();
                        } else {
                            interfaceC0476a9.mo1622c(-59272023);
                            c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                            interfaceC0476a9.mo1661w();
                        }
                        C7218l c7218l = c7218lM14543a;
                        if (r16 != 0 || z20) {
                            interfaceC0476a9.mo1622c(-59271884);
                            jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                            interfaceC0476a9.mo1661w();
                        } else {
                            interfaceC0476a9.mo1622c(-59271795);
                            jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                            interfaceC0476a9.mo1661w();
                        }
                        InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                        InterfaceC2041a<ComposeUiNode> interfaceC2041a1116 = interfaceC2041a1114;
                        int i23 = i21;
                        TextKt.m1576c(str11112, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                        interfaceC0476a9.mo1622c(724546263);
                        String str11114 = str9;
                        if (str11114.length() > 0) {
                            String upperCase2 = str11114.toUpperCase(Locale.ROOT);
                            C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                            C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                            long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                            if (z20 != 0) {
                                interfaceC0476a9.mo1622c(-59270956);
                                interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                interfaceC0476a9.mo1661w();
                            } else {
                                interfaceC0476a9.mo1622c(-59270264);
                                interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                interfaceC0476a9.mo1661w();
                            }
                            interfaceC0476a4 = interfaceC0476a9;
                            str11111 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                            TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                        } else {
                            interfaceC0476a4 = interfaceC0476a9;
                            str11111 = r7;
                        }
                        interfaceC0476a4.mo1661w();
                        interfaceC0476a4.mo1661w();
                        interfaceC0476a4.mo1663x();
                        interfaceC0476a4.mo1661w();
                        interfaceC0476a4.mo1661w();
                        InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                        if (r16 != 0) {
                            interfaceC0476a5 = interfaceC0476a4;
                            interfaceC0476a5.mo1622c(724548425);
                            jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                            interfaceC0476a5.mo1661w();
                        } else {
                            interfaceC0476a5 = interfaceC0476a4;
                            if (z20 != 0) {
                                interfaceC0476a5.mo1622c(724548519);
                                jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                interfaceC0476a5.mo1661w();
                            } else {
                                interfaceC0476a5.mo1622c(724548598);
                                jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                interfaceC0476a5.mo1661w();
                            }
                        }
                        DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                        interfaceC0476a5.mo1622c(724548705);
                        if (r16 != 0) {
                            String string2 = context1111.getString(R.string.upgrade_most_popular);
                            C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                            String upperCase3 = string2.toUpperCase(Locale.ROOT);
                            C5207g.m11110e(upperCase3, str11111);
                            interfaceC0476a6 = interfaceC0476a5;
                            TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                        } else {
                            interfaceC0476a6 = interfaceC0476a5;
                        }
                        interfaceC0476a6.mo1661w();
                        InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                        InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                        interfaceC0476a10.mo1622c(693286680);
                        InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                        interfaceC0476a10.mo1622c(-1323940314);
                        InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                        LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                        InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                        ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                        if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        interfaceC0476a10.mo1640l();
                        if (interfaceC0476a10.mo1632h()) {
                            interfaceC0476a10.mo1634i(interfaceC2041a1116);
                        } else {
                            interfaceC0476a10.mo1653s();
                        }
                        interfaceC0476a10.mo1644n();
                        C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                        C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                        C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                        C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                        interfaceC0476a10.mo1626e();
                        composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                        interfaceC0476a10.mo1622c(2058660585);
                        C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                        if (z20 != 0) {
                            interfaceC0476a10.mo1622c(-59268257);
                            jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                            interfaceC0476a10.mo1661w();
                        } else {
                            interfaceC0476a10.mo1622c(-59268159);
                            jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                            interfaceC0476a10.mo1661w();
                        }
                        TextKt.m1576c(str11113, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                        interfaceC0476a10.mo1622c(724549877);
                        String str11115 = str11110;
                        if (str11115.length() > 0) {
                            C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                            if (z21) {
                                interfaceC0476a10.mo1622c(-59267725);
                                jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                interfaceC0476a10.mo1661w();
                            } else if (z20 != 0) {
                                interfaceC0476a10.mo1622c(-59267615);
                                jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                interfaceC0476a10.mo1661w();
                            } else {
                                interfaceC0476a10.mo1622c(-59267510);
                                jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                interfaceC0476a10.mo1661w();
                            }
                            long j10 = jM5347f2;
                            InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                            interfaceC0476a7 = interfaceC0476a10;
                            TextKt.m1576c(str11115, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                        } else {
                            interfaceC0476a7 = interfaceC0476a10;
                        }
                        interfaceC0476a7.mo1661w();
                        interfaceC0476a7.mo1661w();
                        interfaceC0476a7.mo1663x();
                        interfaceC0476a7.mo1661w();
                        interfaceC0476a7.mo1661w();
                        interfaceC0476a7.mo1661w();
                        interfaceC0476a7.mo1663x();
                        interfaceC0476a7.mo1661w();
                        interfaceC0476a7.mo1661w();
                    }
                    return C9072e.f47360a;
                }
            }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
            str10 = str7;
            z16 = z14;
            z17 = z15;
            interfaceC2041a3 = interfaceC2041a1113;
        } else {
            if (i22 != 0) {
                str7 = "";
            } else {
                str7 = str5;
            }
            if (i13 != 0) {
                str8 = "";
            } else {
                str8 = str6;
            }
            if (i15 != 0) {
                z14 = false;
            } else {
                z14 = z12;
            }
            if (i17 != 0) {
                z15 = false;
            } else {
                z15 = z13;
            }
            if (i19 != 0) {
                interfaceC2041a2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$1
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final /* bridge */ /* synthetic */ C9072e mo807E() {
                        return C9072e.f47360a;
                    }
                };
            }
            InterfaceC2041a<C9072e> interfaceC2041a1114 = interfaceC2041a2;
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111 = ComposerKt.f3003a;
            final Context context1111 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
            InterfaceC0500b interfaceC0500bM11157d1110 = C5212l.m11157d0(SizeKt.m1508e(InterfaceC0500b.a.f3325a), SpacingKt.m10360a(composerImplMo1636j).f33956f, 0.0f, 2);
            AbstractC10270a abstractC10270a1111 = C7499b.m14916N(composerImplMo1636j).f9262d;
            if (z14) {
                composerImplMo1636j.mo1622c(1853269473);
                c0463bM11185y = C5212l.m11185y(4, composerImplMo1636j, 62);
                composerImplMo1636j.m1609Q(false);
            } else {
                composerImplMo1636j.mo1622c(1853269535);
                c0463bM11185y = C5212l.m11185y((float) 0.5d, composerImplMo1636j, 62);
                composerImplMo1636j.m1609Q(false);
            }
            str9 = str8;
            final String str11111 = str7;
            final boolean z11111118 = z14;
            final boolean z11111119 = z15;
            composerImpl = composerImplMo1636j;
            CardKt.m1558b(interfaceC2041a1114, interfaceC0500bM11157d1110, false, abstractC10270a1111, null, c0463bM11185y, null, null, C7204a.m14522b(composerImplMo1636j, -723660403, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a2, Integer num) {
                    long jM5363v;
                    Context context1112;
                    InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p;
                    InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p2;
                    C5304d1 c5304d1;
                    InterfaceC0476a interfaceC0476a3;
                    InterfaceC2041a<ComposeUiNode> interfaceC2041a1115;
                    C7218l c7218lM14543a;
                    long jM11581a;
                    InterfaceC0476a interfaceC0476a4;
                    String str11112;
                    InterfaceC0476a interfaceC0476a5;
                    long jM5347f;
                    InterfaceC0476a interfaceC0476a6;
                    long jM11582b;
                    InterfaceC0476a interfaceC0476a7;
                    long jM5347f2;
                    InterfaceC0500b interfaceC0500bM11156c0;
                    InterfaceC0476a interfaceC0476a8 = interfaceC0476a2;
                    int iIntValue = num.intValue();
                    C5207g.m11111f(interfaceC9771b, "$this$Card");
                    if ((iIntValue & 81) == 16 && interfaceC0476a8.mo1642m()) {
                        interfaceC0476a8.mo1650q();
                    } else {
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1112 = ComposerKt.f3003a;
                        InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                        boolean z20 = z11111119;
                        boolean z21 = z11111118;
                        if (z21) {
                            interfaceC0476a8.mo1622c(1155538318);
                            jM5363v = CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b();
                            interfaceC0476a8.mo1661w();
                        } else if (z20) {
                            interfaceC0476a8.mo1622c(1155538428);
                            jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5366y();
                            interfaceC0476a8.mo1661w();
                        } else {
                            interfaceC0476a8.mo1622c(1155538516);
                            jM5363v = ((C1648d) interfaceC0476a8.mo1648p(ColorSchemeKt.f2735a)).m5363v();
                            interfaceC0476a8.mo1661w();
                        }
                        InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(C0062b.m309T(aVar, jM5363v, C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a8).f33955e);
                        String str11113 = str;
                        String str11114 = str2;
                        interfaceC0476a8.mo1622c(-483455358);
                        C0438a.f fVar = C0438a.f2429a;
                        InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a8);
                        interfaceC0476a8.mo1622c(-1323940314);
                        C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                        InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a8.mo1648p(c5304d2);
                        C5304d1 c5304d3 = CompositionLocalsKt.f4143k;
                        LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a8.mo1648p(c5304d3);
                        C5304d1 c5304d4 = CompositionLocalsKt.f4148p;
                        InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a8.mo1648p(c5304d4);
                        ComposeUiNode.f3726n.getClass();
                        InterfaceC2041a<ComposeUiNode> interfaceC2041a1116 = ComposeUiNode.Companion.f3728b;
                        ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c1);
                        if (!(interfaceC0476a8.mo1646o() instanceof InterfaceC5299c)) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        interfaceC0476a8.mo1640l();
                        if (interfaceC0476a8.mo1632h()) {
                            interfaceC0476a8.mo1634i(interfaceC2041a1116);
                        } else {
                            interfaceC0476a8.mo1653s();
                        }
                        interfaceC0476a8.mo1644n();
                        InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3731e;
                        C8573r0.m16714a1(interfaceC0476a8, interfaceC5652pM1500a, interfaceC2056p3);
                        InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3730d;
                        C8573r0.m16714a1(interfaceC0476a8, interfaceC10015c, interfaceC2056p4);
                        InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p5 = ComposeUiNode.Companion.f3732f;
                        C8573r0.m16714a1(interfaceC0476a8, layoutDirection, interfaceC2056p5);
                        InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p6 = ComposeUiNode.Companion.f3733g;
                        C8573r0.m16714a1(interfaceC0476a8, interfaceC0647n1, interfaceC2056p6);
                        interfaceC0476a8.mo1626e();
                        composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a8), interfaceC0476a8, 0);
                        interfaceC0476a8.mo1622c(2058660585);
                        interfaceC0476a8.mo1622c(724544551);
                        Context context1113 = context1111;
                        if (z20) {
                            String string = context1113.getString(R.string.upgrade_special_offer);
                            C5207g.m11110e(string, "context.getString(R.string.upgrade_special_offer)");
                            String upperCase = string.toUpperCase(Locale.ROOT);
                            context1112 = context1113;
                            C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                            interfaceC2056p2 = interfaceC2056p6;
                            c5304d1 = c5304d4;
                            interfaceC2056p = interfaceC2056p4;
                            interfaceC0476a3 = interfaceC0476a8;
                            TextKt.m1576c(upperCase, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a8).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a8).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a8).m11582b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a8).f9269f, interfaceC0476a3, 0, 0, 32760);
                        } else {
                            context1112 = context1113;
                            interfaceC2056p = interfaceC2056p4;
                            interfaceC2056p2 = interfaceC2056p6;
                            c5304d1 = c5304d4;
                            interfaceC0476a3 = interfaceC0476a8;
                        }
                        interfaceC0476a3.mo1661w();
                        InterfaceC0500b interfaceC0500bM1508e = SizeKt.m1508e(aVar);
                        C0438a.d dVar = C0438a.f2432d;
                        C7886b.b bVar = InterfaceC7885a.a.f42994f;
                        InterfaceC0476a interfaceC0476a9 = interfaceC0476a3;
                        interfaceC0476a9.mo1622c(693286680);
                        InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(dVar, bVar, interfaceC0476a9);
                        interfaceC0476a9.mo1622c(-1323940314);
                        InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d2);
                        LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d3);
                        C5304d1 c5304d5 = c5304d1;
                        InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d5);
                        ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1508e);
                        if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        interfaceC0476a9.mo1640l();
                        if (interfaceC0476a9.mo1632h()) {
                            interfaceC2041a1115 = interfaceC2041a1116;
                            interfaceC0476a9.mo1634i(interfaceC2041a1115);
                        } else {
                            interfaceC2041a1115 = interfaceC2041a1116;
                            interfaceC0476a9.mo1653s();
                        }
                        interfaceC0476a9.mo1644n();
                        C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p3);
                        InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p7 = interfaceC2056p;
                        C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c2, interfaceC2056p7);
                        C8573r0.m16714a1(interfaceC0476a9, layoutDirection2, interfaceC2056p5);
                        InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p8 = interfaceC2056p2;
                        C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n2, interfaceC2056p8);
                        interfaceC0476a9.mo1626e();
                        composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                        interfaceC0476a9.mo1622c(2058660585);
                        C6401a c6401a = C6401a.f36861a;
                        if (z20 != 0) {
                            interfaceC0476a9.mo1622c(-59272409);
                            c7218lM14543a = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9270g, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                            interfaceC0476a9.mo1661w();
                        } else {
                            interfaceC0476a9.mo1622c(-59272023);
                            c7218lM14543a = C7499b.m14918P(interfaceC0476a9).f9270g;
                            interfaceC0476a9.mo1661w();
                        }
                        C7218l c7218l = c7218lM14543a;
                        if (r16 != 0 || z20) {
                            interfaceC0476a9.mo1622c(-59271884);
                            jM11581a = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                            interfaceC0476a9.mo1661w();
                        } else {
                            interfaceC0476a9.mo1622c(-59271795);
                            jM11581a = C7499b.m14898D(interfaceC0476a9).m5347f();
                            interfaceC0476a9.mo1661w();
                        }
                        InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 0.0f, 0.0f, 14);
                        InterfaceC2041a<ComposeUiNode> interfaceC2041a1117 = interfaceC2041a1115;
                        int i23 = i21;
                        TextKt.m1576c(str11113, interfaceC0500bM11159f0, jM11581a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l, interfaceC0476a9, i23 & 14, 0, 32760);
                        interfaceC0476a9.mo1622c(724546263);
                        String str11115 = str9;
                        if (str11115.length() > 0) {
                            String upperCase2 = str11115.toUpperCase(Locale.ROOT);
                            C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                            C7218l c7218lM14543a2 = C7218l.m14543a(C7499b.m14918P(interfaceC0476a9).f9277n, 0L, new C9152j0(c6401a.m13027a((Context) interfaceC0476a9.mo1648p(AndroidCompositionLocals_androidKt.f4084b), R.color.fade_bg), C7499b.m14932c(1.0f, 3.0f), 5.0f), 4186111);
                            long jM11581a2 = CustomColorSchemeKt.m10359a(interfaceC0476a9).m11581a();
                            if (z20 != 0) {
                                interfaceC0476a9.mo1622c(-59270956);
                                interfaceC0500bM11156c0 = C5212l.m11158e0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), CustomColorSchemeKt.m10359a(interfaceC0476a9).m11582b(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d, SpacingKt.m10360a(interfaceC0476a9).f33951a, SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                interfaceC0476a9.mo1661w();
                            } else {
                                interfaceC0476a9.mo1622c(-59270264);
                                interfaceC0500bM11156c0 = C5212l.m11156c0(C0062b.m309T(C8573r0.m16701U(C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a9).f33951a, 0.0f, 11), C7499b.m14916N(interfaceC0476a9).f9263e), C7499b.m14898D(interfaceC0476a9).m5366y(), C9144f0.f47650a), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                interfaceC0476a9.mo1661w();
                            }
                            interfaceC0476a4 = interfaceC0476a9;
                            str11112 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
                            TextKt.m1576c(upperCase2, interfaceC0500bM11156c0, jM11581a2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218lM14543a2, interfaceC0476a4, 0, 0, 32760);
                        } else {
                            interfaceC0476a4 = interfaceC0476a9;
                            str11112 = r7;
                        }
                        interfaceC0476a4.mo1661w();
                        interfaceC0476a4.mo1661w();
                        interfaceC0476a4.mo1663x();
                        interfaceC0476a4.mo1661w();
                        interfaceC0476a4.mo1661w();
                        InterfaceC0500b interfaceC0500bM1508e2 = SizeKt.m1508e(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e, SpacingKt.m10360a(interfaceC0476a4).f33951a, SpacingKt.m10360a(interfaceC0476a4).f33955e));
                        if (r16 != 0) {
                            interfaceC0476a5 = interfaceC0476a4;
                            interfaceC0476a5.mo1622c(724548425);
                            jM5347f = CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a();
                            interfaceC0476a5.mo1661w();
                        } else {
                            interfaceC0476a5 = interfaceC0476a4;
                            if (z20 != 0) {
                                interfaceC0476a5.mo1622c(724548519);
                                jM5347f = C7499b.m14898D(interfaceC0476a5).m5358q();
                                interfaceC0476a5.mo1661w();
                            } else {
                                interfaceC0476a5.mo1622c(724548598);
                                jM5347f = C7499b.m14898D(interfaceC0476a5).m5347f();
                                interfaceC0476a5.mo1661w();
                            }
                        }
                        DividerKt.m1564a(interfaceC0500bM1508e2, 0.0f, jM5347f, interfaceC0476a5, 0, 2);
                        interfaceC0476a5.mo1622c(724548705);
                        if (r16 != 0) {
                            String string2 = context1112.getString(R.string.upgrade_most_popular);
                            C5207g.m11110e(string2, "context.getString(R.string.upgrade_most_popular)");
                            String upperCase3 = string2.toUpperCase(Locale.ROOT);
                            C5207g.m11110e(upperCase3, str11112);
                            interfaceC0476a6 = interfaceC0476a5;
                            TextKt.m1576c(upperCase3, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a5).f33951a, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a5).f33951a, 6), CustomColorSchemeKt.m10359a(interfaceC0476a5).m11581a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C7499b.m14918P(interfaceC0476a5).f9278o, interfaceC0476a6, 0, 0, 32760);
                        } else {
                            interfaceC0476a6 = interfaceC0476a5;
                        }
                        interfaceC0476a6.mo1661w();
                        InterfaceC0500b interfaceC0500bM1508e3 = SizeKt.m1508e(aVar);
                        InterfaceC0476a interfaceC0476a10 = interfaceC0476a6;
                        interfaceC0476a10.mo1622c(693286680);
                        InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(dVar, InterfaceC7885a.a.f42993e, interfaceC0476a10);
                        interfaceC0476a10.mo1622c(-1323940314);
                        InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a10.mo1648p(c5304d2);
                        LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a10.mo1648p(c5304d3);
                        InterfaceC0647n1 interfaceC0647n3 = (InterfaceC0647n1) interfaceC0476a10.mo1648p(c5304d5);
                        ComposableLambdaImpl composableLambdaImplM2036a3 = C0520a.m2036a(interfaceC0500bM1508e3);
                        if (!(interfaceC0476a10.mo1646o() instanceof InterfaceC5299c)) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        interfaceC0476a10.mo1640l();
                        if (interfaceC0476a10.mo1632h()) {
                            interfaceC0476a10.mo1634i(interfaceC2041a1117);
                        } else {
                            interfaceC0476a10.mo1653s();
                        }
                        interfaceC0476a10.mo1644n();
                        C8573r0.m16714a1(interfaceC0476a10, interfaceC5652pM1503a2, interfaceC2056p3);
                        C8573r0.m16714a1(interfaceC0476a10, interfaceC10015c3, interfaceC2056p7);
                        C8573r0.m16714a1(interfaceC0476a10, layoutDirection3, interfaceC2056p5);
                        C8573r0.m16714a1(interfaceC0476a10, interfaceC0647n3, interfaceC2056p8);
                        interfaceC0476a10.mo1626e();
                        composableLambdaImplM2036a3.mo1343M(new C5340u0(interfaceC0476a10), interfaceC0476a10, 0);
                        interfaceC0476a10.mo1622c(2058660585);
                        C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9267d;
                        if (z20 != 0) {
                            interfaceC0476a10.mo1622c(-59268257);
                            jM11582b = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                            interfaceC0476a10.mo1661w();
                        } else {
                            interfaceC0476a10.mo1622c(-59268159);
                            jM11582b = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33940b.getValue()).f47705a;
                            interfaceC0476a10.mo1661w();
                        }
                        TextKt.m1576c(str11114, C5212l.m11159f0(aVar, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 0.0f, 14), jM11582b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, (i23 >> 3) & 14, 0, 32760);
                        interfaceC0476a10.mo1622c(724549877);
                        String str11116 = str11111;
                        if (str11116.length() > 0) {
                            C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                            if (z21) {
                                interfaceC0476a10.mo1622c(-59267725);
                                jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11581a();
                                interfaceC0476a10.mo1661w();
                            } else if (z20 != 0) {
                                interfaceC0476a10.mo1622c(-59267615);
                                jM5347f2 = CustomColorSchemeKt.m10359a(interfaceC0476a10).m11582b();
                                interfaceC0476a10.mo1661w();
                            } else {
                                interfaceC0476a10.mo1622c(-59267510);
                                jM5347f2 = C7499b.m14898D(interfaceC0476a10).m5347f();
                                interfaceC0476a10.mo1661w();
                            }
                            long j10 = jM5347f2;
                            InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(aVar, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 11);
                            interfaceC0476a7 = interfaceC0476a10;
                            TextKt.m1576c(str11116, interfaceC0500bM11159f1, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c7218l3, interfaceC0476a7, (i23 >> 6) & 14, 0, 32760);
                        } else {
                            interfaceC0476a7 = interfaceC0476a10;
                        }
                        interfaceC0476a7.mo1661w();
                        interfaceC0476a7.mo1661w();
                        interfaceC0476a7.mo1663x();
                        interfaceC0476a7.mo1661w();
                        interfaceC0476a7.mo1661w();
                        interfaceC0476a7.mo1661w();
                        interfaceC0476a7.mo1663x();
                        interfaceC0476a7.mo1661w();
                        interfaceC0476a7.mo1661w();
                    }
                    return C9072e.f47360a;
                }
            }), composerImpl, ((i21 >> 18) & 14) | 100663296, 212);
            str10 = str7;
            z16 = z14;
            z17 = z15;
            interfaceC2041a3 = interfaceC2041a1114;
        }
        c5332q0M1612T = composerImpl.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeItemCardKt$UpgradeItemCard$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                UpgradeItemCardKt.m10411a(str, str2, str10, str9, z16, z17, interfaceC2041a3, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                return C9072e.f47360a;
            }
        };
    }
}
