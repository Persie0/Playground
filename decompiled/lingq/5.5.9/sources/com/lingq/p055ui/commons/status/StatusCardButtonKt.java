package com.lingq.p055ui.commons.status;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TypographyKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.kochava.tracker.BuildConfig;
import com.lingq.p055ui.theme.CustomColorSchemeKt;
import com.lingq.p055ui.theme.SpacingKt;
import com.lingq.shared.uimodel.CardStatus;
import com.linguist.R;
import dm.C5207g;
import p036c0.C1645a;
import p036c0.C1646b;
import p036c0.C1648d;
import p036c0.C1656l;
import p081e0.C5332q0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p096ei.C5408a;
import p187j1.C6403c;
import p230l0.C7204a;
import p231l1.C7218l;
import p260m8.C7499b;
import p338qd.C8573r0;
import p338qd.C8584v;
import p386t.C9112d;
import p387t0.C9137c;
import p387t0.C9156l0;
import p387t0.C9159n;
import p387t0.C9169u;
import p387t0.C9170v;
import p443w.C9782m;
import p443w.InterfaceC9786q;
import p444w0.AbstractC9790b;
import p445w1.C9797g;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class StatusCardButtonKt {
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:62:0x010f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0118  */
    /* JADX WARN: Code duplicated, block: B:67:0x0120  */
    /* JADX WARN: Code duplicated, block: B:70:0x0125  */
    /* JADX WARN: Code duplicated, block: B:71:0x013d  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.lingq.ui.commons.status.StatusCardButtonKt$StatusCardButton$1, kotlin.jvm.internal.Lambda] */
    /* JADX INFO: renamed from: a */
    public static final void m9751a(final InterfaceC0500b interfaceC0500b, final int i10, Integer num, final InterfaceC2041a<C9072e> interfaceC2041a, InterfaceC0476a interfaceC0476a, final int i11, final int i12) {
        int i13;
        Integer num2;
        int i14;
        final Integer num3;
        int iM11568a;
        boolean z10;
        long j10;
        final Integer num4;
        C5332q0 c5332q0M1612T;
        C5207g.m11111f(interfaceC0500b, "modifier");
        C5207g.m11111f(interfaceC2041a, "onClick");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(707984929);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (composerImplMo1636j.mo1665y(interfaceC0500b) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= composerImplMo1636j.m1594E(i10) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 == 0) {
            if ((i11 & 896) == 0) {
                num2 = num;
                i13 |= composerImplMo1636j.mo1665y(num2) ? 256 : BuildConfig.SDK_TRUNCATE_LENGTH;
            }
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 7168) == 0) {
                if (composerImplMo1636j.m1600H(interfaceC2041a)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i13 |= i14;
            }
            if ((i13 & 5851) == 1170 || !composerImplMo1636j.mo1642m()) {
                if (i15 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                C9782m c9782m = C1646b.f9206a;
                composerImplMo1636j.mo1622c(-2740744);
                iM11568a = C5408a.m11568a(i10, num3);
                if (iM11568a == CardStatus.New.getValue()) {
                    composerImplMo1636j.mo1622c(-659094905);
                    j10 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33941c.getValue()).f47705a;
                    composerImplMo1636j.m1609Q(false);
                } else if (iM11568a == CardStatus.Recognized.getValue()) {
                    composerImplMo1636j.mo1622c(-659094828);
                    j10 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33942d.getValue()).f47705a;
                    composerImplMo1636j.m1609Q(false);
                } else if (iM11568a == CardStatus.Familiar.getValue()) {
                    composerImplMo1636j.mo1622c(-659094743);
                    j10 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33943e.getValue()).f47705a;
                    composerImplMo1636j.m1609Q(false);
                } else {
                    if (iM11568a == CardStatus.Learned.getValue() && iM11568a != CardStatus.Known.getValue()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        composerImplMo1636j.mo1622c(-659094637);
                        j10 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33939a.getValue()).f47705a;
                        composerImplMo1636j.m1609Q(false);
                    } else {
                        composerImplMo1636j.mo1622c(-659094582);
                        j10 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33939a.getValue()).f47705a;
                        composerImplMo1636j.m1609Q(false);
                    }
                }
                composerImplMo1636j.m1609Q(false);
                C1645a c1645aM5339a = C1646b.m5339a(j10, composerImplMo1636j, 14);
                C9112d c9112d = new C9112d(1, new C9156l0(C7499b.m14898D(composerImplMo1636j).m5358q()));
                float f3 = SpacingKt.m10360a(composerImplMo1636j).f33954d;
                ButtonKt.m1555a(interfaceC2041a, interfaceC0500b, false, null, c1645aM5339a, null, c9112d, new C9782m(f3, f3, f3, f3), null, C7204a.m14522b(composerImplMo1636j, 375139857, new InterfaceC2057q<InterfaceC9786q, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.commons.status.StatusCardButtonKt$StatusCardButton$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
                    @Override // cm.InterfaceC2057q
                    /* JADX INFO: renamed from: M */
                    public final C9072e mo1343M(InterfaceC9786q interfaceC9786q, InterfaceC0476a interfaceC0476a2, Integer num5) {
                        String str;
                        InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                        int iIntValue = num5.intValue();
                        C5207g.m11111f(interfaceC9786q, "$this$Button");
                        if ((iIntValue & 81) == 16 && interfaceC0476a3.mo1642m()) {
                            interfaceC0476a3.mo1650q();
                        } else {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                            CardStatus cardStatus = CardStatus.Ignored;
                            int value = cardStatus.getValue() + 1;
                            CardStatus cardStatus2 = CardStatus.Known;
                            int value2 = cardStatus2.getValue();
                            int i16 = i10;
                            Integer num6 = num3;
                            int iM11568a2 = C5408a.m11568a(i16, num6);
                            if (value <= iM11568a2 && iM11568a2 < value2) {
                                interfaceC0476a3.mo1622c(882863472);
                                C7218l c7218l = ((C1656l) interfaceC0476a3.mo1648p(TypographyKt.f2857a)).f9273j;
                                int iM11568a3 = C5408a.m11568a(i16, num6);
                                if (iM11568a3 == CardStatus.New.getValue()) {
                                    str = "1";
                                } else if (iM11568a3 == CardStatus.Recognized.getValue()) {
                                    str = "2";
                                } else if (iM11568a3 == CardStatus.Familiar.getValue()) {
                                    str = "3";
                                } else if (iM11568a3 == CardStatus.Learned.getValue()) {
                                    str = "4";
                                } else {
                                    str = "1";
                                }
                                TextKt.m1576c(str, null, ((C1648d) interfaceC0476a3.mo1648p(ColorSchemeKt.f2735a)).m5355n(), 0L, null, null, null, 0L, null, new C9797g(4), 0L, 0, false, 0, null, c7218l, interfaceC0476a3, 0, 0, 32250);
                                interfaceC0476a3.mo1661w();
                            } else {
                                interfaceC0476a3.mo1622c(882863784);
                                int iM11568a4 = C5408a.m11568a(i16, num6);
                                int value3 = cardStatus2.getValue();
                                C9159n c9159n = C9159n.f47687a;
                                InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                if (iM11568a4 == value3) {
                                    interfaceC0476a3.mo1622c(882863931);
                                    AbstractC9790b abstractC9790bM13028a = C6403c.m13028a(R.drawable.ic_check_thick, interfaceC0476a3);
                                    long jM5355n = ((C1648d) interfaceC0476a3.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                                    ImageKt.m1415a(abstractC9790bM13028a, "LingQ is known", SizeKt.m1513j(aVar, null, 3), null, null, 0.0f, new C9170v(Build.VERSION.SDK_INT >= 29 ? c9159n.m17478a(jM5355n, 5) : new PorterDuffColorFilter(C8584v.m16780C(jM5355n), C9137c.m17404b(5))), interfaceC0476a3, 440, 56);
                                    interfaceC0476a3.mo1661w();
                                } else if (i16 == cardStatus.getValue()) {
                                    interfaceC0476a3.mo1622c(882864325);
                                    AbstractC9790b abstractC9790bM13028a2 = C6403c.m13028a(R.drawable.ic_trash, interfaceC0476a3);
                                    long jM5355n2 = ((C1648d) interfaceC0476a3.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                                    ImageKt.m1415a(abstractC9790bM13028a2, "LingQ is ignored", SizeKt.m1513j(aVar, null, 3), null, null, 0.0f, new C9170v(Build.VERSION.SDK_INT >= 29 ? c9159n.m17478a(jM5355n2, 5) : new PorterDuffColorFilter(C8584v.m16780C(jM5355n2), C9137c.m17404b(5))), interfaceC0476a3, 440, 56);
                                    interfaceC0476a3.mo1661w();
                                } else {
                                    interfaceC0476a3.mo1622c(882864669);
                                    interfaceC0476a3.mo1661w();
                                }
                                interfaceC0476a3.mo1661w();
                            }
                        }
                        return C9072e.f47360a;
                    }
                }), composerImplMo1636j, (14 & (i13 >> 9)) | 805306368 | ((i13 << 3) & 112), 300);
                num4 = num3;
            } else {
                composerImplMo1636j.mo1650q();
                num4 = num2;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.commons.status.StatusCardButtonKt$StatusCardButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num5) {
                    num5.intValue();
                    StatusCardButtonKt.m9751a(interfaceC0500b, i10, num4, interfaceC2041a, interfaceC0476a2, C8573r0.m16737l1(i11 | 1), i12);
                    return C9072e.f47360a;
                }
            };
        }
        i13 |= 384;
        num2 = num;
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (composerImplMo1636j.m1600H(interfaceC2041a)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i13 |= i14;
        }
        if ((i13 & 5851) == 1170) {
            if (i15 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
            C9782m c9782m2 = C1646b.f9206a;
            composerImplMo1636j.mo1622c(-2740744);
            iM11568a = C5408a.m11568a(i10, num3);
            if (iM11568a == CardStatus.New.getValue()) {
                composerImplMo1636j.mo1622c(-659094905);
                j10 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33941c.getValue()).f47705a;
                composerImplMo1636j.m1609Q(false);
            } else if (iM11568a == CardStatus.Recognized.getValue()) {
                composerImplMo1636j.mo1622c(-659094828);
                j10 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33942d.getValue()).f47705a;
                composerImplMo1636j.m1609Q(false);
            } else if (iM11568a == CardStatus.Familiar.getValue()) {
                composerImplMo1636j.mo1622c(-659094743);
                j10 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33943e.getValue()).f47705a;
                composerImplMo1636j.m1609Q(false);
            } else {
                if (iM11568a == CardStatus.Learned.getValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    composerImplMo1636j.mo1622c(-659094637);
                    j10 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33939a.getValue()).f47705a;
                    composerImplMo1636j.m1609Q(false);
                } else {
                    composerImplMo1636j.mo1622c(-659094582);
                    j10 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33939a.getValue()).f47705a;
                    composerImplMo1636j.m1609Q(false);
                }
            }
            composerImplMo1636j.m1609Q(false);
            C1645a c1645aM5339a2 = C1646b.m5339a(j10, composerImplMo1636j, 14);
            C9112d c9112d2 = new C9112d(1, new C9156l0(C7499b.m14898D(composerImplMo1636j).m5358q()));
            float f10 = SpacingKt.m10360a(composerImplMo1636j).f33954d;
            ButtonKt.m1555a(interfaceC2041a, interfaceC0500b, false, null, c1645aM5339a2, null, c9112d2, new C9782m(f10, f10, f10, f10), null, C7204a.m14522b(composerImplMo1636j, 375139857, new InterfaceC2057q<InterfaceC9786q, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.commons.status.StatusCardButtonKt$StatusCardButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                /* JADX WARN: Code duplicated, block: B:27:0x0089  */
                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final C9072e mo1343M(InterfaceC9786q interfaceC9786q, InterfaceC0476a interfaceC0476a2, Integer num5) {
                    String str;
                    InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                    int iIntValue = num5.intValue();
                    C5207g.m11111f(interfaceC9786q, "$this$Button");
                    if ((iIntValue & 81) == 16 && interfaceC0476a3.mo1642m()) {
                        interfaceC0476a3.mo1650q();
                    } else {
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                        CardStatus cardStatus = CardStatus.Ignored;
                        int value = cardStatus.getValue() + 1;
                        CardStatus cardStatus2 = CardStatus.Known;
                        int value2 = cardStatus2.getValue();
                        int i16 = i10;
                        Integer num6 = num3;
                        int iM11568a2 = C5408a.m11568a(i16, num6);
                        if (value <= iM11568a2 && iM11568a2 < value2) {
                            interfaceC0476a3.mo1622c(882863472);
                            C7218l c7218l = ((C1656l) interfaceC0476a3.mo1648p(TypographyKt.f2857a)).f9273j;
                            int iM11568a3 = C5408a.m11568a(i16, num6);
                            if (iM11568a3 == CardStatus.New.getValue()) {
                                str = "1";
                            } else if (iM11568a3 == CardStatus.Recognized.getValue()) {
                                str = "2";
                            } else if (iM11568a3 == CardStatus.Familiar.getValue()) {
                                str = "3";
                            } else if (iM11568a3 == CardStatus.Learned.getValue()) {
                                str = "4";
                            } else {
                                str = "1";
                            }
                            TextKt.m1576c(str, null, ((C1648d) interfaceC0476a3.mo1648p(ColorSchemeKt.f2735a)).m5355n(), 0L, null, null, null, 0L, null, new C9797g(4), 0L, 0, false, 0, null, c7218l, interfaceC0476a3, 0, 0, 32250);
                            interfaceC0476a3.mo1661w();
                        } else {
                            interfaceC0476a3.mo1622c(882863784);
                            int iM11568a4 = C5408a.m11568a(i16, num6);
                            int value3 = cardStatus2.getValue();
                            C9159n c9159n = C9159n.f47687a;
                            InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                            if (iM11568a4 == value3) {
                                interfaceC0476a3.mo1622c(882863931);
                                AbstractC9790b abstractC9790bM13028a = C6403c.m13028a(R.drawable.ic_check_thick, interfaceC0476a3);
                                long jM5355n = ((C1648d) interfaceC0476a3.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                                ImageKt.m1415a(abstractC9790bM13028a, "LingQ is known", SizeKt.m1513j(aVar, null, 3), null, null, 0.0f, new C9170v(Build.VERSION.SDK_INT >= 29 ? c9159n.m17478a(jM5355n, 5) : new PorterDuffColorFilter(C8584v.m16780C(jM5355n), C9137c.m17404b(5))), interfaceC0476a3, 440, 56);
                                interfaceC0476a3.mo1661w();
                            } else if (i16 == cardStatus.getValue()) {
                                interfaceC0476a3.mo1622c(882864325);
                                AbstractC9790b abstractC9790bM13028a2 = C6403c.m13028a(R.drawable.ic_trash, interfaceC0476a3);
                                long jM5355n2 = ((C1648d) interfaceC0476a3.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                                ImageKt.m1415a(abstractC9790bM13028a2, "LingQ is ignored", SizeKt.m1513j(aVar, null, 3), null, null, 0.0f, new C9170v(Build.VERSION.SDK_INT >= 29 ? c9159n.m17478a(jM5355n2, 5) : new PorterDuffColorFilter(C8584v.m16780C(jM5355n2), C9137c.m17404b(5))), interfaceC0476a3, 440, 56);
                                interfaceC0476a3.mo1661w();
                            } else {
                                interfaceC0476a3.mo1622c(882864669);
                                interfaceC0476a3.mo1661w();
                            }
                            interfaceC0476a3.mo1661w();
                        }
                    }
                    return C9072e.f47360a;
                }
            }), composerImplMo1636j, (14 & (i13 >> 9)) | 805306368 | ((i13 << 3) & 112), 300);
            num4 = num3;
        } else {
            if (i15 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
            C9782m c9782m3 = C1646b.f9206a;
            composerImplMo1636j.mo1622c(-2740744);
            iM11568a = C5408a.m11568a(i10, num3);
            if (iM11568a == CardStatus.New.getValue()) {
                composerImplMo1636j.mo1622c(-659094905);
                j10 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33941c.getValue()).f47705a;
                composerImplMo1636j.m1609Q(false);
            } else if (iM11568a == CardStatus.Recognized.getValue()) {
                composerImplMo1636j.mo1622c(-659094828);
                j10 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33942d.getValue()).f47705a;
                composerImplMo1636j.m1609Q(false);
            } else if (iM11568a == CardStatus.Familiar.getValue()) {
                composerImplMo1636j.mo1622c(-659094743);
                j10 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33943e.getValue()).f47705a;
                composerImplMo1636j.m1609Q(false);
            } else {
                if (iM11568a == CardStatus.Learned.getValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    composerImplMo1636j.mo1622c(-659094637);
                    j10 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33939a.getValue()).f47705a;
                    composerImplMo1636j.m1609Q(false);
                } else {
                    composerImplMo1636j.mo1622c(-659094582);
                    j10 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33939a.getValue()).f47705a;
                    composerImplMo1636j.m1609Q(false);
                }
            }
            composerImplMo1636j.m1609Q(false);
            C1645a c1645aM5339a3 = C1646b.m5339a(j10, composerImplMo1636j, 14);
            C9112d c9112d3 = new C9112d(1, new C9156l0(C7499b.m14898D(composerImplMo1636j).m5358q()));
            float f11 = SpacingKt.m10360a(composerImplMo1636j).f33954d;
            ButtonKt.m1555a(interfaceC2041a, interfaceC0500b, false, null, c1645aM5339a3, null, c9112d3, new C9782m(f11, f11, f11, f11), null, C7204a.m14522b(composerImplMo1636j, 375139857, new InterfaceC2057q<InterfaceC9786q, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.commons.status.StatusCardButtonKt$StatusCardButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                /* JADX WARN: Code duplicated, block: B:27:0x0089  */
                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final C9072e mo1343M(InterfaceC9786q interfaceC9786q, InterfaceC0476a interfaceC0476a2, Integer num5) {
                    String str;
                    InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                    int iIntValue = num5.intValue();
                    C5207g.m11111f(interfaceC9786q, "$this$Button");
                    if ((iIntValue & 81) == 16 && interfaceC0476a3.mo1642m()) {
                        interfaceC0476a3.mo1650q();
                    } else {
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                        CardStatus cardStatus = CardStatus.Ignored;
                        int value = cardStatus.getValue() + 1;
                        CardStatus cardStatus2 = CardStatus.Known;
                        int value2 = cardStatus2.getValue();
                        int i16 = i10;
                        Integer num6 = num3;
                        int iM11568a2 = C5408a.m11568a(i16, num6);
                        if (value <= iM11568a2 && iM11568a2 < value2) {
                            interfaceC0476a3.mo1622c(882863472);
                            C7218l c7218l = ((C1656l) interfaceC0476a3.mo1648p(TypographyKt.f2857a)).f9273j;
                            int iM11568a3 = C5408a.m11568a(i16, num6);
                            if (iM11568a3 == CardStatus.New.getValue()) {
                                str = "1";
                            } else if (iM11568a3 == CardStatus.Recognized.getValue()) {
                                str = "2";
                            } else if (iM11568a3 == CardStatus.Familiar.getValue()) {
                                str = "3";
                            } else if (iM11568a3 == CardStatus.Learned.getValue()) {
                                str = "4";
                            } else {
                                str = "1";
                            }
                            TextKt.m1576c(str, null, ((C1648d) interfaceC0476a3.mo1648p(ColorSchemeKt.f2735a)).m5355n(), 0L, null, null, null, 0L, null, new C9797g(4), 0L, 0, false, 0, null, c7218l, interfaceC0476a3, 0, 0, 32250);
                            interfaceC0476a3.mo1661w();
                        } else {
                            interfaceC0476a3.mo1622c(882863784);
                            int iM11568a4 = C5408a.m11568a(i16, num6);
                            int value3 = cardStatus2.getValue();
                            C9159n c9159n = C9159n.f47687a;
                            InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                            if (iM11568a4 == value3) {
                                interfaceC0476a3.mo1622c(882863931);
                                AbstractC9790b abstractC9790bM13028a = C6403c.m13028a(R.drawable.ic_check_thick, interfaceC0476a3);
                                long jM5355n = ((C1648d) interfaceC0476a3.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                                ImageKt.m1415a(abstractC9790bM13028a, "LingQ is known", SizeKt.m1513j(aVar, null, 3), null, null, 0.0f, new C9170v(Build.VERSION.SDK_INT >= 29 ? c9159n.m17478a(jM5355n, 5) : new PorterDuffColorFilter(C8584v.m16780C(jM5355n), C9137c.m17404b(5))), interfaceC0476a3, 440, 56);
                                interfaceC0476a3.mo1661w();
                            } else if (i16 == cardStatus.getValue()) {
                                interfaceC0476a3.mo1622c(882864325);
                                AbstractC9790b abstractC9790bM13028a2 = C6403c.m13028a(R.drawable.ic_trash, interfaceC0476a3);
                                long jM5355n2 = ((C1648d) interfaceC0476a3.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                                ImageKt.m1415a(abstractC9790bM13028a2, "LingQ is ignored", SizeKt.m1513j(aVar, null, 3), null, null, 0.0f, new C9170v(Build.VERSION.SDK_INT >= 29 ? c9159n.m17478a(jM5355n2, 5) : new PorterDuffColorFilter(C8584v.m16780C(jM5355n2), C9137c.m17404b(5))), interfaceC0476a3, 440, 56);
                                interfaceC0476a3.mo1661w();
                            } else {
                                interfaceC0476a3.mo1622c(882864669);
                                interfaceC0476a3.mo1661w();
                            }
                            interfaceC0476a3.mo1661w();
                        }
                    }
                    return C9072e.f47360a;
                }
            }), composerImplMo1636j, (14 & (i13 >> 9)) | 805306368 | ((i13 << 3) & 112), 300);
            num4 = num3;
        }
        c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.commons.status.StatusCardButtonKt$StatusCardButton$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num5) {
                num5.intValue();
                StatusCardButtonKt.m9751a(interfaceC0500b, i10, num4, interfaceC2041a, interfaceC0476a2, C8573r0.m16737l1(i11 | 1), i12);
                return C9072e.f47360a;
            }
        };
    }
}
