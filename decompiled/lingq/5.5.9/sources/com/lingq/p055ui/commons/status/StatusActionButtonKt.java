package com.lingq.p055ui.commons.status;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.lingq.p055ui.theme.CustomColorSchemeKt;
import com.lingq.p055ui.theme.SpacingKt;
import com.lingq.shared.uimodel.WordStatus;
import com.linguist.R;
import dm.C5207g;
import p036c0.C1645a;
import p036c0.C1646b;
import p036c0.C1648d;
import p081e0.C5332q0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p159hi.C6052c;
import p159hi.C6054e;
import p159hi.InterfaceC6053d;
import p187j1.C6403c;
import p230l0.C7204a;
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
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class StatusActionButtonKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.lingq.ui.commons.status.StatusActionButtonKt$StatusActionButton$1, kotlin.jvm.internal.Lambda] */
    /* JADX INFO: renamed from: a */
    public static final void m9750a(final InterfaceC6053d interfaceC6053d, final InterfaceC2041a<C9072e> interfaceC2041a, InterfaceC0476a interfaceC0476a, final int i10) {
        ComposerImpl composerImpl;
        C5207g.m11111f(interfaceC6053d, "token");
        C5207g.m11111f(interfaceC2041a, "onClick");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(-1448924308);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        boolean z10 = interfaceC6053d instanceof C6052c;
        InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
        if (z10) {
            composerImplMo1636j.mo1622c(535870435);
            InterfaceC0500b interfaceC0500bM1510g = SizeKt.m1510g(aVar, 32);
            C6052c c6052c = (C6052c) interfaceC6053d;
            StatusCardButtonKt.m9751a(interfaceC0500bM1510g, c6052c.f35740f, c6052c.f35741g, interfaceC2041a, composerImplMo1636j, ((i10 << 6) & 7168) | 6, 0);
            composerImplMo1636j.m1609Q(false);
            composerImpl = composerImplMo1636j;
        } else if (interfaceC6053d instanceof C6054e) {
            composerImplMo1636j.mo1622c(535870719);
            InterfaceC0500b interfaceC0500bM1510g2 = SizeKt.m1510g(aVar, 32);
            C9782m c9782m = C1646b.f9206a;
            C1645a c1645aM5339a = C1646b.m5339a(((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33939a.getValue()).f47705a, composerImplMo1636j, 14);
            C9112d c9112d = new C9112d(1, new C9156l0(C7499b.m14898D(composerImplMo1636j).m5358q()));
            float f3 = SpacingKt.m10360a(composerImplMo1636j).f33954d;
            composerImpl = composerImplMo1636j;
            ButtonKt.m1555a(interfaceC2041a, interfaceC0500bM1510g2, false, null, c1645aM5339a, null, c9112d, new C9782m(f3, f3, f3, f3), null, C7204a.m14522b(composerImplMo1636j, -592040325, new InterfaceC2057q<InterfaceC9786q, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.commons.status.StatusActionButtonKt$StatusActionButton$1
                {
                    super(3);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final C9072e mo1343M(InterfaceC9786q interfaceC9786q, InterfaceC0476a interfaceC0476a2, Integer num) {
                    InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                    int iIntValue = num.intValue();
                    C5207g.m11111f(interfaceC9786q, "$this$Button");
                    if ((iIntValue & 81) == 16 && interfaceC0476a3.mo1642m()) {
                        interfaceC0476a3.mo1650q();
                    } else {
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                        String str = ((C6054e) interfaceC6053d).f35748f;
                        boolean zM11106a = C5207g.m11106a(str, WordStatus.New.getValue());
                        C9159n c9159n = C9159n.f47687a;
                        InterfaceC0500b.a aVar2 = InterfaceC0500b.a.f3325a;
                        if (zM11106a) {
                            interfaceC0476a3.mo1622c(1806402098);
                            AbstractC9790b abstractC9790bM13028a = C6403c.m13028a(R.drawable.ic_plus_s, interfaceC0476a3);
                            long j10 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a3).f33944f.getValue()).f47705a;
                            ImageKt.m1415a(abstractC9790bM13028a, "Add word as LingQ", SizeKt.m1513j(aVar2, null, 3), null, null, 0.0f, new C9170v(Build.VERSION.SDK_INT >= 29 ? c9159n.m17478a(j10, 5) : new PorterDuffColorFilter(C8584v.m16780C(j10), C9137c.m17404b(5))), interfaceC0476a3, 440, 56);
                            interfaceC0476a3.mo1661w();
                        } else if (C5207g.m11106a(str, WordStatus.Ignored.getValue())) {
                            interfaceC0476a3.mo1622c(1806402543);
                            AbstractC9790b abstractC9790bM13028a2 = C6403c.m13028a(R.drawable.ic_trash, interfaceC0476a3);
                            InterfaceC0500b interfaceC0500bM1513j = SizeKt.m1513j(aVar2, null, 3);
                            long jM5355n = ((C1648d) interfaceC0476a3.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                            ImageKt.m1415a(abstractC9790bM13028a2, "Word is ignored", interfaceC0500bM1513j, null, null, 0.0f, new C9170v(Build.VERSION.SDK_INT >= 29 ? c9159n.m17478a(jM5355n, 5) : new PorterDuffColorFilter(C8584v.m16780C(jM5355n), C9137c.m17404b(5))), interfaceC0476a3, 440, 56);
                            interfaceC0476a3.mo1661w();
                        } else if (C5207g.m11106a(str, WordStatus.Known.getValue())) {
                            interfaceC0476a3.mo1622c(1806402991);
                            AbstractC9790b abstractC9790bM13028a3 = C6403c.m13028a(R.drawable.ic_check_thick, interfaceC0476a3);
                            long jM5355n2 = ((C1648d) interfaceC0476a3.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                            ImageKt.m1415a(abstractC9790bM13028a3, "Word is known", SizeKt.m1513j(aVar2, null, 3), null, null, 0.0f, new C9170v(Build.VERSION.SDK_INT >= 29 ? c9159n.m17478a(jM5355n2, 5) : new PorterDuffColorFilter(C8584v.m16780C(jM5355n2), C9137c.m17404b(5))), interfaceC0476a3, 440, 56);
                            interfaceC0476a3.mo1661w();
                        } else {
                            interfaceC0476a3.mo1622c(1806403412);
                            interfaceC0476a3.mo1661w();
                        }
                    }
                    return C9072e.f47360a;
                }
            }), composerImplMo1636j, (14 & (i10 >> 3)) | 805306416, 300);
            composerImpl.m1609Q(false);
        } else {
            composerImpl = composerImplMo1636j;
            composerImpl.mo1622c(535872605);
            composerImpl.m1609Q(false);
        }
        C5332q0 c5332q0M1612T = composerImpl.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.commons.status.StatusActionButtonKt$StatusActionButton$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                int iM16737l1 = C8573r0.m16737l1(i10 | 1);
                StatusActionButtonKt.m9750a(interfaceC6053d, interfaceC2041a, interfaceC0476a2, iM16737l1);
                return C9072e.f47360a;
            }
        };
    }
}
