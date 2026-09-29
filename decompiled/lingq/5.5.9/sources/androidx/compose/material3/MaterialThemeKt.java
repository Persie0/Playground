package androidx.compose.material3;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import p001a0.C0005d;
import p021b0.C1277b;
import p021b0.C1278c;
import p021b0.C1284i;
import p036c0.C1648d;
import p036c0.C1653i;
import p036c0.C1655k;
import p036c0.C1656l;
import p081e0.C5304d1;
import p081e0.C5328o0;
import p081e0.C5332q0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p230l0.C7204a;
import p387t0.C9169u;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialThemeKt {

    /* JADX INFO: renamed from: a */
    public static final C1278c f2753a = new C1278c(0.16f, 0.12f, 0.08f, 0.12f);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.compose.material3.MaterialThemeKt$MaterialTheme$1, kotlin.jvm.internal.Lambda] */
    /* JADX INFO: renamed from: a */
    public static final void m1566a(C1648d c1648d, C1655k c1655k, C1656l c1656l, final InterfaceC2056p<? super InterfaceC0476a, ? super Integer, C9072e> interfaceC2056p, InterfaceC0476a interfaceC0476a, final int i10, final int i11) {
        final C1648d c1648d2;
        final int i12;
        C1655k c1655k2;
        final C1656l c1656l2;
        int i13;
        C5207g.m11111f(interfaceC2056p, "content");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(-2127166334);
        if ((i10 & 14) == 0) {
            if ((i11 & 1) == 0) {
                c1648d2 = c1648d;
                int i14 = composerImplMo1636j.mo1665y(c1648d2) ? 4 : 2;
                i12 = i14 | i10;
            } else {
                c1648d2 = c1648d;
            }
            i12 = i14 | i10;
        } else {
            c1648d2 = c1648d;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                c1655k2 = c1655k;
                int i15 = composerImplMo1636j.mo1665y(c1655k2) ? 32 : 16;
                i12 |= i15;
            } else {
                c1655k2 = c1655k;
            }
            i12 |= i15;
        } else {
            c1655k2 = c1655k;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                c1656l2 = c1656l;
                if (composerImplMo1636j.mo1665y(c1656l2)) {
                    i13 = 256;
                }
                i12 |= i13;
            } else {
                c1656l2 = c1656l;
            }
            i13 = BuildConfig.SDK_TRUNCATE_LENGTH;
            i12 |= i13;
        } else {
            c1656l2 = c1656l;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= composerImplMo1636j.mo1665y(interfaceC2056p) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && composerImplMo1636j.mo1642m()) {
            composerImplMo1636j.mo1650q();
        } else {
            composerImplMo1636j.m1654s0();
            if ((i10 & 1) == 0 || composerImplMo1636j.m1616X()) {
                if ((i11 & 1) != 0) {
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                    c1648d2 = (C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a);
                    i12 &= -15;
                }
                if ((i11 & 2) != 0) {
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                    c1655k2 = (C1655k) composerImplMo1636j.mo1648p(ShapesKt.f2783a);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                    c1656l2 = (C1656l) composerImplMo1636j.mo1648p(TypographyKt.f2857a);
                    i12 &= -897;
                }
            } else {
                composerImplMo1636j.mo1650q();
                if ((i11 & 1) != 0) {
                    i12 &= -15;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
            }
            composerImplMo1636j.m1610R();
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
            composerImplMo1636j.mo1622c(-492369756);
            Object objM1619a0 = composerImplMo1636j.m1619a0();
            InterfaceC0476a.a.C10586a c10586a = InterfaceC0476a.a.f3122a;
            if (objM1619a0 == c10586a) {
                C1648d c1648d3 = new C1648d(c1648d2.m5359r(), c1648d2.m5350i(), c1648d2.m5360s(), c1648d2.m5351j(), ((C9169u) c1648d2.f9220e.getValue()).f47705a, c1648d2.m5361t(), c1648d2.m5352k(), c1648d2.m5362u(), c1648d2.m5353l(), c1648d2.m5366y(), c1648d2.m5356o(), c1648d2.m5367z(), c1648d2.m5357p(), c1648d2.m5342a(), c1648d2.m5347f(), c1648d2.m5363v(), c1648d2.m5354m(), c1648d2.m5365x(), c1648d2.m5355n(), c1648d2.m5364w(), c1648d2.m5346e(), c1648d2.m5345d(), c1648d2.m5343b(), c1648d2.m5348g(), c1648d2.m5344c(), c1648d2.m5349h(), c1648d2.m5358q(), ((C9169u) c1648d2.f9214B.getValue()).f47705a, ((C9169u) c1648d2.f9215C.getValue()).f47705a);
                composerImplMo1636j.m1597F0(c1648d3);
                objM1619a0 = c1648d3;
            }
            composerImplMo1636j.m1609Q(false);
            C1648d c1648d4 = (C1648d) objM1619a0;
            C5304d1 c5304d1 = ColorSchemeKt.f2735a;
            C5207g.m11111f(c1648d4, "<this>");
            C5207g.m11111f(c1648d2, "other");
            c1648d4.f9216a.setValue(new C9169u(c1648d2.m5359r()));
            c1648d4.f9217b.setValue(new C9169u(c1648d2.m5350i()));
            c1648d4.f9218c.setValue(new C9169u(c1648d2.m5360s()));
            c1648d4.f9219d.setValue(new C9169u(c1648d2.m5351j()));
            c1648d4.f9220e.setValue(new C9169u(((C9169u) c1648d2.f9220e.getValue()).f47705a));
            c1648d4.f9221f.setValue(new C9169u(c1648d2.m5361t()));
            c1648d4.f9222g.setValue(new C9169u(c1648d2.m5352k()));
            c1648d4.f9223h.setValue(new C9169u(c1648d2.m5362u()));
            c1648d4.f9224i.setValue(new C9169u(c1648d2.m5353l()));
            c1648d4.f9225j.setValue(new C9169u(c1648d2.m5366y()));
            c1648d4.f9226k.setValue(new C9169u(c1648d2.m5356o()));
            c1648d4.f9227l.setValue(new C9169u(c1648d2.m5367z()));
            c1648d4.f9228m.setValue(new C9169u(c1648d2.m5357p()));
            c1648d4.f9229n.setValue(new C9169u(c1648d2.m5342a()));
            c1648d4.f9230o.setValue(new C9169u(c1648d2.m5347f()));
            c1648d4.f9231p.setValue(new C9169u(c1648d2.m5363v()));
            c1648d4.f9232q.setValue(new C9169u(c1648d2.m5354m()));
            c1648d4.f9233r.setValue(new C9169u(c1648d2.m5365x()));
            c1648d4.f9234s.setValue(new C9169u(c1648d2.m5355n()));
            c1648d4.f9235t.setValue(new C9169u(c1648d2.m5364w()));
            c1648d4.f9236u.setValue(new C9169u(c1648d2.m5346e()));
            c1648d4.f9237v.setValue(new C9169u(c1648d2.m5345d()));
            c1648d4.f9238w.setValue(new C9169u(c1648d2.m5343b()));
            c1648d4.f9239x.setValue(new C9169u(c1648d2.m5348g()));
            c1648d4.f9240y.setValue(new C9169u(c1648d2.m5344c()));
            c1648d4.f9241z.setValue(new C9169u(c1648d2.m5349h()));
            c1648d4.f9213A.setValue(new C9169u(c1648d2.m5358q()));
            c1648d4.f9214B.setValue(new C9169u(((C9169u) c1648d2.f9214B.getValue()).f47705a));
            c1648d4.f9215C.setValue(new C9169u(((C9169u) c1648d2.f9215C.getValue()).f47705a));
            C1277b c1277bM4789a = C1284i.m4789a(0.0f, composerImplMo1636j, 0, 7);
            composerImplMo1636j.mo1622c(1866455512);
            long jM5359r = c1648d4.m5359r();
            C9169u c9169u = new C9169u(jM5359r);
            composerImplMo1636j.mo1622c(1157296644);
            boolean zMo1665y = composerImplMo1636j.mo1665y(c9169u);
            Object objM1619a1 = composerImplMo1636j.m1619a0();
            if (zMo1665y || objM1619a1 == c10586a) {
                objM1619a1 = new C0005d(jM5359r, C9169u.m17496b(jM5359r, 0.4f));
                composerImplMo1636j.m1597F0(objM1619a1);
            }
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(false);
            c1656l2 = c1656l2;
            CompositionLocalKt.m1691a(new C5328o0[]{ColorSchemeKt.f2735a.m11458b(c1648d4), IndicationKt.f1887a.m11458b(c1277bM4789a), RippleThemeKt.f2618a.m11458b(C1653i.f9253a), ShapesKt.f2783a.m11458b(c1655k2), TextSelectionColorsKt.f2571a.m11458b((C0005d) objM1619a1), TypographyKt.f2857a.m11458b(c1656l2)}, C7204a.m14522b(composerImplMo1636j, -1066563262, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.MaterialThemeKt$MaterialTheme$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                    if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                        interfaceC0476a3.mo1650q();
                    } else {
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                        TextKt.m1574a(c1656l2.f9273j, interfaceC2056p, interfaceC0476a3, (i12 >> 6) & 112);
                    }
                    return C9072e.f47360a;
                }
            }), composerImplMo1636j, 56);
        }
        final C1655k c1655k3 = c1655k2;
        final C1656l c1656l3 = c1656l2;
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.MaterialThemeKt$MaterialTheme$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                MaterialThemeKt.m1566a(c1648d2, c1655k3, c1656l3, interfaceC2056p, interfaceC0476a2, i10 | 1, i11);
                return C9072e.f47360a;
            }
        };
    }
}
