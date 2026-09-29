package androidx.compose.material3;

import ae.C0062b;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.kochava.tracker.BuildConfig;
import p036c0.C1649e;
import p059d0.C5001b;
import p081e0.C5332q0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p387t0.C9144f0;
import p470x1.C10017e;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class DividerKt {
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m1564a(InterfaceC0500b interfaceC0500b, float f3, long j10, InterfaceC0476a interfaceC0476a, final int i10, final int i11) {
        int i12;
        long j11;
        final InterfaceC0500b interfaceC0500b2;
        final float f10;
        float density;
        final long j12;
        C5332q0 c5332q0M1612T;
        int i13;
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(1562471785);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerImplMo1636j.mo1665y(interfaceC0500b) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerImplMo1636j.m1592D(f3) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                if ((i11 & 4) == 0) {
                    j11 = j10;
                    if (composerImplMo1636j.m1596F(j10)) {
                        i13 = 256;
                    }
                    i12 |= i13;
                } else {
                    j11 = j10;
                }
                i13 = BuildConfig.SDK_TRUNCATE_LENGTH;
                i12 |= i13;
            } else {
                j11 = j10;
            }
            if ((i12 & 731) == 146 || !composerImplMo1636j.mo1642m()) {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0 || composerImplMo1636j.m1616X()) {
                    if (i14 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        f10 = C1649e.f9242a;
                    } else {
                        f10 = f3;
                    }
                    if ((i11 & 4) != 0) {
                        float f11 = C1649e.f9242a;
                        composerImplMo1636j.mo1622c(77461041);
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                        long jM1563e = ColorSchemeKt.m1563e(C5001b.f32641a, composerImplMo1636j);
                        composerImplMo1636j.m1609Q(false);
                        j11 = jM1563e;
                    }
                } else {
                    composerImplMo1636j.mo1650q();
                    interfaceC0500b2 = interfaceC0500b;
                    f10 = f3;
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(1232935509);
                if (C10017e.m18618a(f10, 0.0f)) {
                    density = 1.0f / ((InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e)).getDensity();
                } else {
                    density = f10;
                }
                composerImplMo1636j.m1609Q(false);
                BoxKt.m1496a(C0062b.m309T(SizeKt.m1509f(SizeKt.m1508e(interfaceC0500b2), density), j11, C9144f0.f47650a), composerImplMo1636j, 0);
            } else {
                composerImplMo1636j.mo1650q();
                interfaceC0500b2 = interfaceC0500b;
                f10 = f3;
            }
            j12 = j11;
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.DividerKt$Divider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    DividerKt.m1564a(interfaceC0500b2, f10, j12, interfaceC0476a2, i10 | 1, i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 48;
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                j11 = j10;
                if (composerImplMo1636j.m1596F(j10)) {
                    i13 = 256;
                }
                i12 |= i13;
            } else {
                j11 = j10;
            }
            i13 = BuildConfig.SDK_TRUNCATE_LENGTH;
            i12 |= i13;
        } else {
            j11 = j10;
        }
        if ((i12 & 731) == 146) {
            composerImplMo1636j.m1654s0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    f10 = C1649e.f9242a;
                } else {
                    f10 = f3;
                }
                if ((i11 & 4) != 0) {
                    float f12 = C1649e.f9242a;
                    composerImplMo1636j.mo1622c(77461041);
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                    long jM1563e2 = ColorSchemeKt.m1563e(C5001b.f32641a, composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    j11 = jM1563e2;
                }
            } else {
                if (i14 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    f10 = C1649e.f9242a;
                } else {
                    f10 = f3;
                }
                if ((i11 & 4) != 0) {
                    float f13 = C1649e.f9242a;
                    composerImplMo1636j.mo1622c(77461041);
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                    long jM1563e3 = ColorSchemeKt.m1563e(C5001b.f32641a, composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    j11 = jM1563e3;
                }
            }
            composerImplMo1636j.m1610R();
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
            composerImplMo1636j.mo1622c(1232935509);
            if (C10017e.m18618a(f10, 0.0f)) {
                density = 1.0f / ((InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e)).getDensity();
            } else {
                density = f10;
            }
            composerImplMo1636j.m1609Q(false);
            BoxKt.m1496a(C0062b.m309T(SizeKt.m1509f(SizeKt.m1508e(interfaceC0500b2), density), j11, C9144f0.f47650a), composerImplMo1636j, 0);
        } else {
            composerImplMo1636j.m1654s0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    f10 = C1649e.f9242a;
                } else {
                    f10 = f3;
                }
                if ((i11 & 4) != 0) {
                    float f14 = C1649e.f9242a;
                    composerImplMo1636j.mo1622c(77461041);
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                    long jM1563e4 = ColorSchemeKt.m1563e(C5001b.f32641a, composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    j11 = jM1563e4;
                }
            } else {
                if (i14 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    f10 = C1649e.f9242a;
                } else {
                    f10 = f3;
                }
                if ((i11 & 4) != 0) {
                    float f15 = C1649e.f9242a;
                    composerImplMo1636j.mo1622c(77461041);
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                    long jM1563e5 = ColorSchemeKt.m1563e(C5001b.f32641a, composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    j11 = jM1563e5;
                }
            }
            composerImplMo1636j.m1610R();
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
            composerImplMo1636j.mo1622c(1232935509);
            if (C10017e.m18618a(f10, 0.0f)) {
                density = 1.0f / ((InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e)).getDensity();
            } else {
                density = f10;
            }
            composerImplMo1636j.m1609Q(false);
            BoxKt.m1496a(C0062b.m309T(SizeKt.m1509f(SizeKt.m1508e(interfaceC0500b2), density), j11, C9144f0.f47650a), composerImplMo1636j, 0);
        }
        j12 = j11;
        c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.DividerKt$Divider$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                DividerKt.m1564a(interfaceC0500b2, f10, j12, interfaceC0476a2, i10 | 1, i11);
                return C9072e.f47360a;
            }
        };
    }
}
