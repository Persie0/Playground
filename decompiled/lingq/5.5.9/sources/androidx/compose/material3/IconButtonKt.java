package androidx.compose.material3;

import ae.C0062b;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p017ui.ComposedModifierKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.layout.C0520a;
import androidx.compose.p017ui.node.ComposeUiNode;
import androidx.compose.p017ui.platform.CompositionLocalsKt;
import androidx.compose.p017ui.platform.InspectableValueKt;
import androidx.compose.p017ui.platform.InterfaceC0647n1;
import androidx.compose.p017ui.unit.LayoutDirection;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import p021b0.C1284i;
import p036c0.C1652h;
import p059d0.C5006g;
import p081e0.C5304d1;
import p081e0.C5328o0;
import p081e0.C5332q0;
import p081e0.C5340u0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5336s0;
import p127g1.InterfaceC5652p;
import p210k1.C6569g;
import p284o0.C7886b;
import p284o0.InterfaceC7885a;
import p338qd.C8573r0;
import p387t0.C9144f0;
import p387t0.C9169u;
import p423v.C9613k;
import p423v.InterfaceC9612j;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class IconButtonKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0182  */
    /* JADX WARN: Code duplicated, block: B:101:0x0185  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:106:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:107:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:110:0x0240  */
    /* JADX WARN: Code duplicated, block: B:111:0x0243  */
    /* JADX WARN: Code duplicated, block: B:116:0x0291  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:85:0x0100  */
    /* JADX WARN: Code duplicated, block: B:87:0x0103  */
    /* JADX WARN: Code duplicated, block: B:88:0x0106  */
    /* JADX WARN: Code duplicated, block: B:91:0x010c  */
    /* JADX WARN: Code duplicated, block: B:93:0x013a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0148  */
    /* JADX WARN: Code duplicated, block: B:97:0x0159 A[PHI: r0 r3 r4 r11
      0x0159: PHI (r0v47 int) = (r0v20 int), (r0v48 int) binds: [B:92:0x0138, B:82:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x0159: PHI (r3v13 androidx.compose.ui.b) = (r3v2 androidx.compose.ui.b), (r3v15 androidx.compose.ui.b) binds: [B:92:0x0138, B:82:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x0159: PHI (r4v22 boolean) = (r4v4 boolean), (r4v23 boolean) binds: [B:92:0x0138, B:82:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x0159: PHI (r11v12 c0.h) = (r11v8 c0.h), (r11v7 c0.h) binds: [B:92:0x0138, B:82:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m1565a(final InterfaceC2041a<C9072e> interfaceC2041a, InterfaceC0500b interfaceC0500b, boolean z10, C1652h c1652h, InterfaceC9612j interfaceC9612j, final InterfaceC2056p<? super InterfaceC0476a, ? super Integer, C9072e> interfaceC2056p, InterfaceC0476a interfaceC0476a, final int i10, final int i11) {
        int i12;
        InterfaceC0500b interfaceC0500b2;
        int i13;
        boolean z11;
        int i14;
        C1652h c1652h2;
        int i15;
        InterfaceC9612j interfaceC9612j2;
        int i16;
        int i17;
        InterfaceC0500b interfaceC0500b3;
        boolean z12;
        Object objM1619a0;
        int i18;
        InterfaceC0500b interfaceC0500b4;
        C1652h c1652h3;
        boolean z13;
        long j10;
        InterfaceC5652p interfaceC5652pM1499d;
        InterfaceC10015c interfaceC10015c;
        LayoutDirection layoutDirection;
        InterfaceC0647n1 interfaceC0647n1;
        InterfaceC2041a<ComposeUiNode> interfaceC2041a2;
        ComposableLambdaImpl composableLambdaImplM2036a;
        long j11;
        final InterfaceC0500b interfaceC0500b5;
        final boolean z14;
        final C1652h c1652h4;
        final InterfaceC9612j interfaceC9612j3;
        C5332q0 c5332q0M1612T;
        C5207g.m11111f(interfaceC2041a, "onClick");
        C5207g.m11111f(interfaceC2056p, "content");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(-1142896114);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerImplMo1636j.mo1665y(interfaceC2041a) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 112) == 0) {
                interfaceC0500b2 = interfaceC0500b;
                i12 |= composerImplMo1636j.mo1665y(interfaceC0500b2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    z11 = z10;
                    if (composerImplMo1636j.m1598G(z11)) {
                        i14 = 256;
                    } else {
                        i14 = BuildConfig.SDK_TRUNCATE_LENGTH;
                    }
                    i12 |= i14;
                }
                if ((i10 & 7168) == 0) {
                    if ((i11 & 8) == 0) {
                        c1652h2 = c1652h;
                        int i20 = composerImplMo1636j.mo1665y(c1652h2) ? 2048 : 1024;
                        i12 |= i20;
                    } else {
                        c1652h2 = c1652h;
                    }
                    i12 |= i20;
                } else {
                    c1652h2 = c1652h;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((57344 & i10) == 0) {
                        interfaceC9612j2 = interfaceC9612j;
                        if (composerImplMo1636j.mo1665y(interfaceC9612j2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 32) != 0) {
                        if ((458752 & i10) == 0) {
                            if (composerImplMo1636j.mo1665y(interfaceC2056p)) {
                                i17 = 131072;
                            } else {
                                i17 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898 || !composerImplMo1636j.mo1642m()) {
                            composerImplMo1636j.m1654s0();
                            if ((i10 & 1) != 0 || composerImplMo1636j.m1616X()) {
                                if (i19 != 0) {
                                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                                } else {
                                    interfaceC0500b3 = interfaceC0500b2;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z10;
                                }
                                if ((i11 & 8) != 0) {
                                    composerImplMo1636j.mo1622c(999008085);
                                    long j12 = C9169u.f47702e;
                                    long j13 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                                    long jM17496b = C9169u.m17496b(j13, 0.38f);
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                                    C1652h c1652h5 = new C1652h(j12, j13, j12, jM17496b);
                                    composerImplMo1636j.m1609Q(false);
                                    i12 &= -7169;
                                    c1652h2 = c1652h5;
                                }
                                if (i15 != 0) {
                                    composerImplMo1636j.mo1622c(-492369756);
                                    objM1619a0 = composerImplMo1636j.m1619a0();
                                    if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                        objM1619a0 = new C9613k();
                                        composerImplMo1636j.m1597F0(objM1619a0);
                                    }
                                    composerImplMo1636j.m1609Q(false);
                                    i18 = i12;
                                    interfaceC0500b4 = interfaceC0500b3;
                                    interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                                }
                                c1652h3 = c1652h2;
                                z13 = z12;
                                composerImplMo1636j.m1610R();
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                                C5304d1 c5304d1 = TouchTargetKt.f2854a;
                                C5207g.m11111f(interfaceC0500b4, "<this>");
                                InterfaceC0500b interfaceC0500bM1927a = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                                float f3 = C5006g.f32673a;
                                InterfaceC0500b interfaceC0500bM1510g = SizeKt.m1510g(interfaceC0500bM1927a, f3);
                                c1652h3.getClass();
                                composerImplMo1636j.mo1622c(1876083926);
                                if (z13) {
                                    j10 = c1652h3.f9249a;
                                } else {
                                    j10 = c1652h3.f9251c;
                                }
                                InterfaceC5312g0 interfaceC5312g0M16704V0 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                                composerImplMo1636j.m1609Q(false);
                                InterfaceC0500b interfaceC0500bM1409c = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g, ((C9169u) interfaceC5312g0M16704V0.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f3 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                                C7886b c7886b = InterfaceC7885a.a.f42991c;
                                composerImplMo1636j.mo1622c(733328855);
                                interfaceC5652pM1499d = BoxKt.m1499d(c7886b, false, composerImplMo1636j);
                                composerImplMo1636j.mo1622c(-1323940314);
                                interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                                layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                                interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                                ComposeUiNode.f3726n.getClass();
                                interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                                composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c);
                                if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                composerImplMo1636j.mo1640l();
                                if (composerImplMo1636j.f2897L) {
                                    composerImplMo1636j.mo1634i(interfaceC2041a2);
                                } else {
                                    composerImplMo1636j.mo1653s();
                                }
                                composerImplMo1636j.f2933x = false;
                                C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                                C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                                C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                                C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                                composerImplMo1636j.mo1626e();
                                composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                                composerImplMo1636j.mo1622c(2058660585);
                                composerImplMo1636j.mo1622c(-2137368960);
                                composerImplMo1636j.mo1622c(1428615496);
                                composerImplMo1636j.mo1622c(613133646);
                                if (z13) {
                                    j11 = c1652h3.f9250b;
                                } else {
                                    j11 = c1652h3.f9252d;
                                }
                                InterfaceC5312g0 interfaceC5312g0M16704V1 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                                composerImplMo1636j.m1609Q(false);
                                CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V1.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                                composerImplMo1636j.m1609Q(false);
                                composerImplMo1636j.m1609Q(false);
                                composerImplMo1636j.m1609Q(false);
                                composerImplMo1636j.m1609Q(true);
                                composerImplMo1636j.m1609Q(false);
                                composerImplMo1636j.m1609Q(false);
                                interfaceC0500b5 = interfaceC0500b4;
                                z14 = z13;
                                c1652h4 = c1652h3;
                            } else {
                                composerImplMo1636j.mo1650q();
                                if ((i11 & 8) != 0) {
                                    i12 &= -7169;
                                }
                                interfaceC0500b3 = interfaceC0500b2;
                                z12 = z10;
                            }
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            c1652h3 = c1652h2;
                            z13 = z12;
                            composerImplMo1636j.m1610R();
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                            C5304d1 c5304d2 = TouchTargetKt.f2854a;
                            C5207g.m11111f(interfaceC0500b4, "<this>");
                            InterfaceC0500b interfaceC0500bM1927a2 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                            float f10 = C5006g.f32673a;
                            InterfaceC0500b interfaceC0500bM1510g2 = SizeKt.m1510g(interfaceC0500bM1927a2, f10);
                            c1652h3.getClass();
                            composerImplMo1636j.mo1622c(1876083926);
                            if (z13) {
                                j10 = c1652h3.f9249a;
                            } else {
                                j10 = c1652h3.f9251c;
                            }
                            InterfaceC5312g0 interfaceC5312g0M16704V2 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                            composerImplMo1636j.m1609Q(false);
                            InterfaceC0500b interfaceC0500bM1409c2 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g2, ((C9169u) interfaceC5312g0M16704V2.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f10 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                            C7886b c7886b2 = InterfaceC7885a.a.f42991c;
                            composerImplMo1636j.mo1622c(733328855);
                            interfaceC5652pM1499d = BoxKt.m1499d(c7886b2, false, composerImplMo1636j);
                            composerImplMo1636j.mo1622c(-1323940314);
                            interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                            layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                            interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                            ComposeUiNode.f3726n.getClass();
                            interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                            composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c2);
                            if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            composerImplMo1636j.mo1640l();
                            if (composerImplMo1636j.f2897L) {
                                composerImplMo1636j.mo1634i(interfaceC2041a2);
                            } else {
                                composerImplMo1636j.mo1653s();
                            }
                            composerImplMo1636j.f2933x = false;
                            C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                            C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                            C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                            C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                            composerImplMo1636j.mo1626e();
                            composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                            composerImplMo1636j.mo1622c(2058660585);
                            composerImplMo1636j.mo1622c(-2137368960);
                            composerImplMo1636j.mo1622c(1428615496);
                            composerImplMo1636j.mo1622c(613133646);
                            if (z13) {
                                j11 = c1652h3.f9250b;
                            } else {
                                j11 = c1652h3.f9252d;
                            }
                            InterfaceC5312g0 interfaceC5312g0M16704V3 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                            composerImplMo1636j.m1609Q(false);
                            CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V3.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                            composerImplMo1636j.m1609Q(false);
                            composerImplMo1636j.m1609Q(false);
                            composerImplMo1636j.m1609Q(false);
                            composerImplMo1636j.m1609Q(true);
                            composerImplMo1636j.m1609Q(false);
                            composerImplMo1636j.m1609Q(false);
                            interfaceC0500b5 = interfaceC0500b4;
                            z14 = z13;
                            c1652h4 = c1652h3;
                        } else {
                            composerImplMo1636j.mo1650q();
                            interfaceC0500b5 = interfaceC0500b2;
                            z14 = z11;
                            c1652h4 = c1652h2;
                        }
                        interfaceC9612j3 = interfaceC9612j2;
                        c5332q0M1612T = composerImplMo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                num.intValue();
                                IconButtonKt.m1565a(interfaceC2041a, interfaceC0500b5, z14, c1652h4, interfaceC9612j3, interfaceC2056p, interfaceC0476a2, i10 | 1, i11);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i17 = 196608;
                    i12 |= i17;
                    if ((374491 & i12) == 74898) {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z10;
                            }
                            if ((i11 & 8) != 0) {
                                composerImplMo1636j.mo1622c(999008085);
                                long j14 = C9169u.f47702e;
                                long j15 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                                long jM17496b2 = C9169u.m17496b(j15, 0.38f);
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                                C1652h c1652h6 = new C1652h(j14, j15, j14, jM17496b2);
                                composerImplMo1636j.m1609Q(false);
                                i12 &= -7169;
                                c1652h2 = c1652h6;
                            }
                            if (i15 != 0) {
                                composerImplMo1636j.mo1622c(-492369756);
                                objM1619a0 = composerImplMo1636j.m1619a0();
                                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                    objM1619a0 = new C9613k();
                                    composerImplMo1636j.m1597F0(objM1619a0);
                                }
                                composerImplMo1636j.m1609Q(false);
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                                interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                            } else {
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                            }
                        } else {
                            if (i19 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z10;
                            }
                            if ((i11 & 8) != 0) {
                                composerImplMo1636j.mo1622c(999008085);
                                long j16 = C9169u.f47702e;
                                long j17 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                                long jM17496b3 = C9169u.m17496b(j17, 0.38f);
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                                C1652h c1652h7 = new C1652h(j16, j17, j16, jM17496b3);
                                composerImplMo1636j.m1609Q(false);
                                i12 &= -7169;
                                c1652h2 = c1652h7;
                            }
                            if (i15 != 0) {
                                composerImplMo1636j.mo1622c(-492369756);
                                objM1619a0 = composerImplMo1636j.m1619a0();
                                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                    objM1619a0 = new C9613k();
                                    composerImplMo1636j.m1597F0(objM1619a0);
                                }
                                composerImplMo1636j.m1609Q(false);
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                                interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                            } else {
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                            }
                        }
                        c1652h3 = c1652h2;
                        z13 = z12;
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                        C5304d1 c5304d3 = TouchTargetKt.f2854a;
                        C5207g.m11111f(interfaceC0500b4, "<this>");
                        InterfaceC0500b interfaceC0500bM1927a3 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                        float f11 = C5006g.f32673a;
                        InterfaceC0500b interfaceC0500bM1510g3 = SizeKt.m1510g(interfaceC0500bM1927a3, f11);
                        c1652h3.getClass();
                        composerImplMo1636j.mo1622c(1876083926);
                        if (z13) {
                            j10 = c1652h3.f9249a;
                        } else {
                            j10 = c1652h3.f9251c;
                        }
                        InterfaceC5312g0 interfaceC5312g0M16704V4 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                        composerImplMo1636j.m1609Q(false);
                        InterfaceC0500b interfaceC0500bM1409c3 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g3, ((C9169u) interfaceC5312g0M16704V4.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f11 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                        C7886b c7886b3 = InterfaceC7885a.a.f42991c;
                        composerImplMo1636j.mo1622c(733328855);
                        interfaceC5652pM1499d = BoxKt.m1499d(c7886b3, false, composerImplMo1636j);
                        composerImplMo1636j.mo1622c(-1323940314);
                        interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                        layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                        interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                        ComposeUiNode.f3726n.getClass();
                        interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                        composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c3);
                        if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.mo1640l();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(interfaceC2041a2);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        composerImplMo1636j.f2933x = false;
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                        C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                        composerImplMo1636j.mo1626e();
                        composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                        composerImplMo1636j.mo1622c(2058660585);
                        composerImplMo1636j.mo1622c(-2137368960);
                        composerImplMo1636j.mo1622c(1428615496);
                        composerImplMo1636j.mo1622c(613133646);
                        if (z13) {
                            j11 = c1652h3.f9250b;
                        } else {
                            j11 = c1652h3.f9252d;
                        }
                        InterfaceC5312g0 interfaceC5312g0M16704V5 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                        composerImplMo1636j.m1609Q(false);
                        CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V5.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        interfaceC0500b5 = interfaceC0500b4;
                        z14 = z13;
                        c1652h4 = c1652h3;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z10;
                            }
                            if ((i11 & 8) != 0) {
                                composerImplMo1636j.mo1622c(999008085);
                                long j18 = C9169u.f47702e;
                                long j19 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                                long jM17496b4 = C9169u.m17496b(j19, 0.38f);
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                                C1652h c1652h8 = new C1652h(j18, j19, j18, jM17496b4);
                                composerImplMo1636j.m1609Q(false);
                                i12 &= -7169;
                                c1652h2 = c1652h8;
                            }
                            if (i15 != 0) {
                                composerImplMo1636j.mo1622c(-492369756);
                                objM1619a0 = composerImplMo1636j.m1619a0();
                                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                    objM1619a0 = new C9613k();
                                    composerImplMo1636j.m1597F0(objM1619a0);
                                }
                                composerImplMo1636j.m1609Q(false);
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                                interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                            } else {
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                            }
                        } else {
                            if (i19 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z10;
                            }
                            if ((i11 & 8) != 0) {
                                composerImplMo1636j.mo1622c(999008085);
                                long j110 = C9169u.f47702e;
                                long j111 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                                long jM17496b5 = C9169u.m17496b(j111, 0.38f);
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                                C1652h c1652h9 = new C1652h(j110, j111, j110, jM17496b5);
                                composerImplMo1636j.m1609Q(false);
                                i12 &= -7169;
                                c1652h2 = c1652h9;
                            }
                            if (i15 != 0) {
                                composerImplMo1636j.mo1622c(-492369756);
                                objM1619a0 = composerImplMo1636j.m1619a0();
                                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                    objM1619a0 = new C9613k();
                                    composerImplMo1636j.m1597F0(objM1619a0);
                                }
                                composerImplMo1636j.m1609Q(false);
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                                interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                            } else {
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                            }
                        }
                        c1652h3 = c1652h2;
                        z13 = z12;
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q9 = ComposerKt.f3003a;
                        C5304d1 c5304d4 = TouchTargetKt.f2854a;
                        C5207g.m11111f(interfaceC0500b4, "<this>");
                        InterfaceC0500b interfaceC0500bM1927a4 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                        float f12 = C5006g.f32673a;
                        InterfaceC0500b interfaceC0500bM1510g4 = SizeKt.m1510g(interfaceC0500bM1927a4, f12);
                        c1652h3.getClass();
                        composerImplMo1636j.mo1622c(1876083926);
                        if (z13) {
                            j10 = c1652h3.f9249a;
                        } else {
                            j10 = c1652h3.f9251c;
                        }
                        InterfaceC5312g0 interfaceC5312g0M16704V6 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                        composerImplMo1636j.m1609Q(false);
                        InterfaceC0500b interfaceC0500bM1409c4 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g4, ((C9169u) interfaceC5312g0M16704V6.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f12 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                        C7886b c7886b4 = InterfaceC7885a.a.f42991c;
                        composerImplMo1636j.mo1622c(733328855);
                        interfaceC5652pM1499d = BoxKt.m1499d(c7886b4, false, composerImplMo1636j);
                        composerImplMo1636j.mo1622c(-1323940314);
                        interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                        layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                        interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                        ComposeUiNode.f3726n.getClass();
                        interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                        composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c4);
                        if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.mo1640l();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(interfaceC2041a2);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        composerImplMo1636j.f2933x = false;
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                        C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                        composerImplMo1636j.mo1626e();
                        composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                        composerImplMo1636j.mo1622c(2058660585);
                        composerImplMo1636j.mo1622c(-2137368960);
                        composerImplMo1636j.mo1622c(1428615496);
                        composerImplMo1636j.mo1622c(613133646);
                        if (z13) {
                            j11 = c1652h3.f9250b;
                        } else {
                            j11 = c1652h3.f9252d;
                        }
                        InterfaceC5312g0 interfaceC5312g0M16704V7 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                        composerImplMo1636j.m1609Q(false);
                        CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V7.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        interfaceC0500b5 = interfaceC0500b4;
                        z14 = z13;
                        c1652h4 = c1652h3;
                    }
                    interfaceC9612j3 = interfaceC9612j2;
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            IconButtonKt.m1565a(interfaceC2041a, interfaceC0500b5, z14, c1652h4, interfaceC9612j3, interfaceC2056p, interfaceC0476a2, i10 | 1, i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i12 |= 24576;
                interfaceC9612j2 = interfaceC9612j;
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (composerImplMo1636j.mo1665y(interfaceC2056p)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z10;
                            }
                            if ((i11 & 8) != 0) {
                                composerImplMo1636j.mo1622c(999008085);
                                long j112 = C9169u.f47702e;
                                long j113 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                                long jM17496b6 = C9169u.m17496b(j113, 0.38f);
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q10 = ComposerKt.f3003a;
                                C1652h c1652h10 = new C1652h(j112, j113, j112, jM17496b6);
                                composerImplMo1636j.m1609Q(false);
                                i12 &= -7169;
                                c1652h2 = c1652h10;
                            }
                            if (i15 != 0) {
                                composerImplMo1636j.mo1622c(-492369756);
                                objM1619a0 = composerImplMo1636j.m1619a0();
                                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                    objM1619a0 = new C9613k();
                                    composerImplMo1636j.m1597F0(objM1619a0);
                                }
                                composerImplMo1636j.m1609Q(false);
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                                interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                            } else {
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                            }
                        } else {
                            if (i19 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z10;
                            }
                            if ((i11 & 8) != 0) {
                                composerImplMo1636j.mo1622c(999008085);
                                long j114 = C9169u.f47702e;
                                long j115 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                                long jM17496b7 = C9169u.m17496b(j115, 0.38f);
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11 = ComposerKt.f3003a;
                                C1652h c1652h11 = new C1652h(j114, j115, j114, jM17496b7);
                                composerImplMo1636j.m1609Q(false);
                                i12 &= -7169;
                                c1652h2 = c1652h11;
                            }
                            if (i15 != 0) {
                                composerImplMo1636j.mo1622c(-492369756);
                                objM1619a0 = composerImplMo1636j.m1619a0();
                                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                    objM1619a0 = new C9613k();
                                    composerImplMo1636j.m1597F0(objM1619a0);
                                }
                                composerImplMo1636j.m1609Q(false);
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                                interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                            } else {
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                            }
                        }
                        c1652h3 = c1652h2;
                        z13 = z12;
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q12 = ComposerKt.f3003a;
                        C5304d1 c5304d5 = TouchTargetKt.f2854a;
                        C5207g.m11111f(interfaceC0500b4, "<this>");
                        InterfaceC0500b interfaceC0500bM1927a5 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                        float f13 = C5006g.f32673a;
                        InterfaceC0500b interfaceC0500bM1510g5 = SizeKt.m1510g(interfaceC0500bM1927a5, f13);
                        c1652h3.getClass();
                        composerImplMo1636j.mo1622c(1876083926);
                        if (z13) {
                            j10 = c1652h3.f9249a;
                        } else {
                            j10 = c1652h3.f9251c;
                        }
                        InterfaceC5312g0 interfaceC5312g0M16704V8 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                        composerImplMo1636j.m1609Q(false);
                        InterfaceC0500b interfaceC0500bM1409c5 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g5, ((C9169u) interfaceC5312g0M16704V8.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f13 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                        C7886b c7886b5 = InterfaceC7885a.a.f42991c;
                        composerImplMo1636j.mo1622c(733328855);
                        interfaceC5652pM1499d = BoxKt.m1499d(c7886b5, false, composerImplMo1636j);
                        composerImplMo1636j.mo1622c(-1323940314);
                        interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                        layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                        interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                        ComposeUiNode.f3726n.getClass();
                        interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                        composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c5);
                        if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.mo1640l();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(interfaceC2041a2);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        composerImplMo1636j.f2933x = false;
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                        C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                        composerImplMo1636j.mo1626e();
                        composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                        composerImplMo1636j.mo1622c(2058660585);
                        composerImplMo1636j.mo1622c(-2137368960);
                        composerImplMo1636j.mo1622c(1428615496);
                        composerImplMo1636j.mo1622c(613133646);
                        if (z13) {
                            j11 = c1652h3.f9250b;
                        } else {
                            j11 = c1652h3.f9252d;
                        }
                        InterfaceC5312g0 interfaceC5312g0M16704V9 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                        composerImplMo1636j.m1609Q(false);
                        CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V9.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        interfaceC0500b5 = interfaceC0500b4;
                        z14 = z13;
                        c1652h4 = c1652h3;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z10;
                            }
                            if ((i11 & 8) != 0) {
                                composerImplMo1636j.mo1622c(999008085);
                                long j116 = C9169u.f47702e;
                                long j117 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                                long jM17496b8 = C9169u.m17496b(j117, 0.38f);
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q13 = ComposerKt.f3003a;
                                C1652h c1652h12 = new C1652h(j116, j117, j116, jM17496b8);
                                composerImplMo1636j.m1609Q(false);
                                i12 &= -7169;
                                c1652h2 = c1652h12;
                            }
                            if (i15 != 0) {
                                composerImplMo1636j.mo1622c(-492369756);
                                objM1619a0 = composerImplMo1636j.m1619a0();
                                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                    objM1619a0 = new C9613k();
                                    composerImplMo1636j.m1597F0(objM1619a0);
                                }
                                composerImplMo1636j.m1609Q(false);
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                                interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                            } else {
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                            }
                        } else {
                            if (i19 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z10;
                            }
                            if ((i11 & 8) != 0) {
                                composerImplMo1636j.mo1622c(999008085);
                                long j118 = C9169u.f47702e;
                                long j119 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                                long jM17496b9 = C9169u.m17496b(j119, 0.38f);
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q14 = ComposerKt.f3003a;
                                C1652h c1652h13 = new C1652h(j118, j119, j118, jM17496b9);
                                composerImplMo1636j.m1609Q(false);
                                i12 &= -7169;
                                c1652h2 = c1652h13;
                            }
                            if (i15 != 0) {
                                composerImplMo1636j.mo1622c(-492369756);
                                objM1619a0 = composerImplMo1636j.m1619a0();
                                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                    objM1619a0 = new C9613k();
                                    composerImplMo1636j.m1597F0(objM1619a0);
                                }
                                composerImplMo1636j.m1609Q(false);
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                                interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                            } else {
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                            }
                        }
                        c1652h3 = c1652h2;
                        z13 = z12;
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q15 = ComposerKt.f3003a;
                        C5304d1 c5304d6 = TouchTargetKt.f2854a;
                        C5207g.m11111f(interfaceC0500b4, "<this>");
                        InterfaceC0500b interfaceC0500bM1927a6 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                        float f14 = C5006g.f32673a;
                        InterfaceC0500b interfaceC0500bM1510g6 = SizeKt.m1510g(interfaceC0500bM1927a6, f14);
                        c1652h3.getClass();
                        composerImplMo1636j.mo1622c(1876083926);
                        if (z13) {
                            j10 = c1652h3.f9249a;
                        } else {
                            j10 = c1652h3.f9251c;
                        }
                        InterfaceC5312g0 interfaceC5312g0M16704V10 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                        composerImplMo1636j.m1609Q(false);
                        InterfaceC0500b interfaceC0500bM1409c6 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g6, ((C9169u) interfaceC5312g0M16704V10.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f14 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                        C7886b c7886b6 = InterfaceC7885a.a.f42991c;
                        composerImplMo1636j.mo1622c(733328855);
                        interfaceC5652pM1499d = BoxKt.m1499d(c7886b6, false, composerImplMo1636j);
                        composerImplMo1636j.mo1622c(-1323940314);
                        interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                        layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                        interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                        ComposeUiNode.f3726n.getClass();
                        interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                        composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c6);
                        if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.mo1640l();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(interfaceC2041a2);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        composerImplMo1636j.f2933x = false;
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                        C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                        composerImplMo1636j.mo1626e();
                        composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                        composerImplMo1636j.mo1622c(2058660585);
                        composerImplMo1636j.mo1622c(-2137368960);
                        composerImplMo1636j.mo1622c(1428615496);
                        composerImplMo1636j.mo1622c(613133646);
                        if (z13) {
                            j11 = c1652h3.f9250b;
                        } else {
                            j11 = c1652h3.f9252d;
                        }
                        InterfaceC5312g0 interfaceC5312g0M16704V11 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                        composerImplMo1636j.m1609Q(false);
                        CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V11.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        interfaceC0500b5 = interfaceC0500b4;
                        z14 = z13;
                        c1652h4 = c1652h3;
                    }
                    interfaceC9612j3 = interfaceC9612j2;
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            IconButtonKt.m1565a(interfaceC2041a, interfaceC0500b5, z14, c1652h4, interfaceC9612j3, interfaceC2056p, interfaceC0476a2, i10 | 1, i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i17 = 196608;
                i12 |= i17;
                if ((374491 & i12) == 74898) {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j1110 = C9169u.f47702e;
                            long j1111 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b10 = C9169u.m17496b(j1111, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q16 = ComposerKt.f3003a;
                            C1652h c1652h14 = new C1652h(j1110, j1111, j1110, jM17496b10);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h14;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    } else {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j1112 = C9169u.f47702e;
                            long j1113 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b11 = C9169u.m17496b(j1113, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q17 = ComposerKt.f3003a;
                            C1652h c1652h15 = new C1652h(j1112, j1113, j1112, jM17496b11);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h15;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    }
                    c1652h3 = c1652h2;
                    z13 = z12;
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q18 = ComposerKt.f3003a;
                    C5304d1 c5304d7 = TouchTargetKt.f2854a;
                    C5207g.m11111f(interfaceC0500b4, "<this>");
                    InterfaceC0500b interfaceC0500bM1927a7 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                    float f15 = C5006g.f32673a;
                    InterfaceC0500b interfaceC0500bM1510g7 = SizeKt.m1510g(interfaceC0500bM1927a7, f15);
                    c1652h3.getClass();
                    composerImplMo1636j.mo1622c(1876083926);
                    if (z13) {
                        j10 = c1652h3.f9249a;
                    } else {
                        j10 = c1652h3.f9251c;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V12 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1409c7 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g7, ((C9169u) interfaceC5312g0M16704V12.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f15 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                    C7886b c7886b7 = InterfaceC7885a.a.f42991c;
                    composerImplMo1636j.mo1622c(733328855);
                    interfaceC5652pM1499d = BoxKt.m1499d(c7886b7, false, composerImplMo1636j);
                    composerImplMo1636j.mo1622c(-1323940314);
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                    composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c7);
                    if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(interfaceC2041a2);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    composerImplMo1636j.f2933x = false;
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    composerImplMo1636j.mo1626e();
                    composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                    composerImplMo1636j.mo1622c(2058660585);
                    composerImplMo1636j.mo1622c(-2137368960);
                    composerImplMo1636j.mo1622c(1428615496);
                    composerImplMo1636j.mo1622c(613133646);
                    if (z13) {
                        j11 = c1652h3.f9250b;
                    } else {
                        j11 = c1652h3.f9252d;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V13 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V13.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b5 = interfaceC0500b4;
                    z14 = z13;
                    c1652h4 = c1652h3;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j1114 = C9169u.f47702e;
                            long j1115 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b12 = C9169u.m17496b(j1115, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q19 = ComposerKt.f3003a;
                            C1652h c1652h16 = new C1652h(j1114, j1115, j1114, jM17496b12);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h16;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    } else {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j1116 = C9169u.f47702e;
                            long j1117 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b13 = C9169u.m17496b(j1117, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q110 = ComposerKt.f3003a;
                            C1652h c1652h17 = new C1652h(j1116, j1117, j1116, jM17496b13);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h17;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    }
                    c1652h3 = c1652h2;
                    z13 = z12;
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111 = ComposerKt.f3003a;
                    C5304d1 c5304d8 = TouchTargetKt.f2854a;
                    C5207g.m11111f(interfaceC0500b4, "<this>");
                    InterfaceC0500b interfaceC0500bM1927a8 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                    float f16 = C5006g.f32673a;
                    InterfaceC0500b interfaceC0500bM1510g8 = SizeKt.m1510g(interfaceC0500bM1927a8, f16);
                    c1652h3.getClass();
                    composerImplMo1636j.mo1622c(1876083926);
                    if (z13) {
                        j10 = c1652h3.f9249a;
                    } else {
                        j10 = c1652h3.f9251c;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V14 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1409c8 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g8, ((C9169u) interfaceC5312g0M16704V14.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f16 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                    C7886b c7886b8 = InterfaceC7885a.a.f42991c;
                    composerImplMo1636j.mo1622c(733328855);
                    interfaceC5652pM1499d = BoxKt.m1499d(c7886b8, false, composerImplMo1636j);
                    composerImplMo1636j.mo1622c(-1323940314);
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                    composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c8);
                    if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(interfaceC2041a2);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    composerImplMo1636j.f2933x = false;
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    composerImplMo1636j.mo1626e();
                    composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                    composerImplMo1636j.mo1622c(2058660585);
                    composerImplMo1636j.mo1622c(-2137368960);
                    composerImplMo1636j.mo1622c(1428615496);
                    composerImplMo1636j.mo1622c(613133646);
                    if (z13) {
                        j11 = c1652h3.f9250b;
                    } else {
                        j11 = c1652h3.f9252d;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V15 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V15.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b5 = interfaceC0500b4;
                    z14 = z13;
                    c1652h4 = c1652h3;
                }
                interfaceC9612j3 = interfaceC9612j2;
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        IconButtonKt.m1565a(interfaceC2041a, interfaceC0500b5, z14, c1652h4, interfaceC9612j3, interfaceC2056p, interfaceC0476a2, i10 | 1, i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 384;
            z11 = z10;
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    c1652h2 = c1652h;
                    if (composerImplMo1636j.mo1665y(c1652h2)) {
                    }
                    i12 |= i20;
                } else {
                    c1652h2 = c1652h;
                }
                i12 |= i20;
            } else {
                c1652h2 = c1652h;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    interfaceC9612j2 = interfaceC9612j;
                    if (composerImplMo1636j.mo1665y(interfaceC9612j2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (composerImplMo1636j.mo1665y(interfaceC2056p)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z10;
                            }
                            if ((i11 & 8) != 0) {
                                composerImplMo1636j.mo1622c(999008085);
                                long j1118 = C9169u.f47702e;
                                long j1119 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                                long jM17496b14 = C9169u.m17496b(j1119, 0.38f);
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q112 = ComposerKt.f3003a;
                                C1652h c1652h18 = new C1652h(j1118, j1119, j1118, jM17496b14);
                                composerImplMo1636j.m1609Q(false);
                                i12 &= -7169;
                                c1652h2 = c1652h18;
                            }
                            if (i15 != 0) {
                                composerImplMo1636j.mo1622c(-492369756);
                                objM1619a0 = composerImplMo1636j.m1619a0();
                                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                    objM1619a0 = new C9613k();
                                    composerImplMo1636j.m1597F0(objM1619a0);
                                }
                                composerImplMo1636j.m1609Q(false);
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                                interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                            } else {
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                            }
                        } else {
                            if (i19 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z10;
                            }
                            if ((i11 & 8) != 0) {
                                composerImplMo1636j.mo1622c(999008085);
                                long j11110 = C9169u.f47702e;
                                long j11111 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                                long jM17496b15 = C9169u.m17496b(j11111, 0.38f);
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q113 = ComposerKt.f3003a;
                                C1652h c1652h19 = new C1652h(j11110, j11111, j11110, jM17496b15);
                                composerImplMo1636j.m1609Q(false);
                                i12 &= -7169;
                                c1652h2 = c1652h19;
                            }
                            if (i15 != 0) {
                                composerImplMo1636j.mo1622c(-492369756);
                                objM1619a0 = composerImplMo1636j.m1619a0();
                                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                    objM1619a0 = new C9613k();
                                    composerImplMo1636j.m1597F0(objM1619a0);
                                }
                                composerImplMo1636j.m1609Q(false);
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                                interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                            } else {
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                            }
                        }
                        c1652h3 = c1652h2;
                        z13 = z12;
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q114 = ComposerKt.f3003a;
                        C5304d1 c5304d9 = TouchTargetKt.f2854a;
                        C5207g.m11111f(interfaceC0500b4, "<this>");
                        InterfaceC0500b interfaceC0500bM1927a9 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                        float f17 = C5006g.f32673a;
                        InterfaceC0500b interfaceC0500bM1510g9 = SizeKt.m1510g(interfaceC0500bM1927a9, f17);
                        c1652h3.getClass();
                        composerImplMo1636j.mo1622c(1876083926);
                        if (z13) {
                            j10 = c1652h3.f9249a;
                        } else {
                            j10 = c1652h3.f9251c;
                        }
                        InterfaceC5312g0 interfaceC5312g0M16704V16 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                        composerImplMo1636j.m1609Q(false);
                        InterfaceC0500b interfaceC0500bM1409c9 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g9, ((C9169u) interfaceC5312g0M16704V16.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f17 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                        C7886b c7886b9 = InterfaceC7885a.a.f42991c;
                        composerImplMo1636j.mo1622c(733328855);
                        interfaceC5652pM1499d = BoxKt.m1499d(c7886b9, false, composerImplMo1636j);
                        composerImplMo1636j.mo1622c(-1323940314);
                        interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                        layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                        interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                        ComposeUiNode.f3726n.getClass();
                        interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                        composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c9);
                        if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.mo1640l();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(interfaceC2041a2);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        composerImplMo1636j.f2933x = false;
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                        C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                        composerImplMo1636j.mo1626e();
                        composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                        composerImplMo1636j.mo1622c(2058660585);
                        composerImplMo1636j.mo1622c(-2137368960);
                        composerImplMo1636j.mo1622c(1428615496);
                        composerImplMo1636j.mo1622c(613133646);
                        if (z13) {
                            j11 = c1652h3.f9250b;
                        } else {
                            j11 = c1652h3.f9252d;
                        }
                        InterfaceC5312g0 interfaceC5312g0M16704V17 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                        composerImplMo1636j.m1609Q(false);
                        CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V17.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        interfaceC0500b5 = interfaceC0500b4;
                        z14 = z13;
                        c1652h4 = c1652h3;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z10;
                            }
                            if ((i11 & 8) != 0) {
                                composerImplMo1636j.mo1622c(999008085);
                                long j11112 = C9169u.f47702e;
                                long j11113 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                                long jM17496b16 = C9169u.m17496b(j11113, 0.38f);
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q115 = ComposerKt.f3003a;
                                C1652h c1652h110 = new C1652h(j11112, j11113, j11112, jM17496b16);
                                composerImplMo1636j.m1609Q(false);
                                i12 &= -7169;
                                c1652h2 = c1652h110;
                            }
                            if (i15 != 0) {
                                composerImplMo1636j.mo1622c(-492369756);
                                objM1619a0 = composerImplMo1636j.m1619a0();
                                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                    objM1619a0 = new C9613k();
                                    composerImplMo1636j.m1597F0(objM1619a0);
                                }
                                composerImplMo1636j.m1609Q(false);
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                                interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                            } else {
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                            }
                        } else {
                            if (i19 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z10;
                            }
                            if ((i11 & 8) != 0) {
                                composerImplMo1636j.mo1622c(999008085);
                                long j11114 = C9169u.f47702e;
                                long j11115 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                                long jM17496b17 = C9169u.m17496b(j11115, 0.38f);
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q116 = ComposerKt.f3003a;
                                C1652h c1652h111 = new C1652h(j11114, j11115, j11114, jM17496b17);
                                composerImplMo1636j.m1609Q(false);
                                i12 &= -7169;
                                c1652h2 = c1652h111;
                            }
                            if (i15 != 0) {
                                composerImplMo1636j.mo1622c(-492369756);
                                objM1619a0 = composerImplMo1636j.m1619a0();
                                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                    objM1619a0 = new C9613k();
                                    composerImplMo1636j.m1597F0(objM1619a0);
                                }
                                composerImplMo1636j.m1609Q(false);
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                                interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                            } else {
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                            }
                        }
                        c1652h3 = c1652h2;
                        z13 = z12;
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q117 = ComposerKt.f3003a;
                        C5304d1 c5304d10 = TouchTargetKt.f2854a;
                        C5207g.m11111f(interfaceC0500b4, "<this>");
                        InterfaceC0500b interfaceC0500bM1927a10 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                        float f18 = C5006g.f32673a;
                        InterfaceC0500b interfaceC0500bM1510g10 = SizeKt.m1510g(interfaceC0500bM1927a10, f18);
                        c1652h3.getClass();
                        composerImplMo1636j.mo1622c(1876083926);
                        if (z13) {
                            j10 = c1652h3.f9249a;
                        } else {
                            j10 = c1652h3.f9251c;
                        }
                        InterfaceC5312g0 interfaceC5312g0M16704V18 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                        composerImplMo1636j.m1609Q(false);
                        InterfaceC0500b interfaceC0500bM1409c10 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g10, ((C9169u) interfaceC5312g0M16704V18.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f18 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                        C7886b c7886b10 = InterfaceC7885a.a.f42991c;
                        composerImplMo1636j.mo1622c(733328855);
                        interfaceC5652pM1499d = BoxKt.m1499d(c7886b10, false, composerImplMo1636j);
                        composerImplMo1636j.mo1622c(-1323940314);
                        interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                        layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                        interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                        ComposeUiNode.f3726n.getClass();
                        interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                        composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c10);
                        if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.mo1640l();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(interfaceC2041a2);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        composerImplMo1636j.f2933x = false;
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                        C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                        composerImplMo1636j.mo1626e();
                        composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                        composerImplMo1636j.mo1622c(2058660585);
                        composerImplMo1636j.mo1622c(-2137368960);
                        composerImplMo1636j.mo1622c(1428615496);
                        composerImplMo1636j.mo1622c(613133646);
                        if (z13) {
                            j11 = c1652h3.f9250b;
                        } else {
                            j11 = c1652h3.f9252d;
                        }
                        InterfaceC5312g0 interfaceC5312g0M16704V19 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                        composerImplMo1636j.m1609Q(false);
                        CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V19.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        interfaceC0500b5 = interfaceC0500b4;
                        z14 = z13;
                        c1652h4 = c1652h3;
                    }
                    interfaceC9612j3 = interfaceC9612j2;
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            IconButtonKt.m1565a(interfaceC2041a, interfaceC0500b5, z14, c1652h4, interfaceC9612j3, interfaceC2056p, interfaceC0476a2, i10 | 1, i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i17 = 196608;
                i12 |= i17;
                if ((374491 & i12) == 74898) {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j11116 = C9169u.f47702e;
                            long j11117 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b18 = C9169u.m17496b(j11117, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q118 = ComposerKt.f3003a;
                            C1652h c1652h112 = new C1652h(j11116, j11117, j11116, jM17496b18);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h112;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    } else {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j11118 = C9169u.f47702e;
                            long j11119 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b19 = C9169u.m17496b(j11119, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q119 = ComposerKt.f3003a;
                            C1652h c1652h113 = new C1652h(j11118, j11119, j11118, jM17496b19);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h113;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    }
                    c1652h3 = c1652h2;
                    z13 = z12;
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1110 = ComposerKt.f3003a;
                    C5304d1 c5304d11 = TouchTargetKt.f2854a;
                    C5207g.m11111f(interfaceC0500b4, "<this>");
                    InterfaceC0500b interfaceC0500bM1927a11 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                    float f19 = C5006g.f32673a;
                    InterfaceC0500b interfaceC0500bM1510g11 = SizeKt.m1510g(interfaceC0500bM1927a11, f19);
                    c1652h3.getClass();
                    composerImplMo1636j.mo1622c(1876083926);
                    if (z13) {
                        j10 = c1652h3.f9249a;
                    } else {
                        j10 = c1652h3.f9251c;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V110 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1409c11 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g11, ((C9169u) interfaceC5312g0M16704V110.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f19 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                    C7886b c7886b11 = InterfaceC7885a.a.f42991c;
                    composerImplMo1636j.mo1622c(733328855);
                    interfaceC5652pM1499d = BoxKt.m1499d(c7886b11, false, composerImplMo1636j);
                    composerImplMo1636j.mo1622c(-1323940314);
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                    composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c11);
                    if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(interfaceC2041a2);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    composerImplMo1636j.f2933x = false;
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    composerImplMo1636j.mo1626e();
                    composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                    composerImplMo1636j.mo1622c(2058660585);
                    composerImplMo1636j.mo1622c(-2137368960);
                    composerImplMo1636j.mo1622c(1428615496);
                    composerImplMo1636j.mo1622c(613133646);
                    if (z13) {
                        j11 = c1652h3.f9250b;
                    } else {
                        j11 = c1652h3.f9252d;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V111 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V111.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b5 = interfaceC0500b4;
                    z14 = z13;
                    c1652h4 = c1652h3;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j111110 = C9169u.f47702e;
                            long j111111 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b110 = C9169u.m17496b(j111111, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111 = ComposerKt.f3003a;
                            C1652h c1652h114 = new C1652h(j111110, j111111, j111110, jM17496b110);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h114;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    } else {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j111112 = C9169u.f47702e;
                            long j111113 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b111 = C9169u.m17496b(j111113, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1112 = ComposerKt.f3003a;
                            C1652h c1652h115 = new C1652h(j111112, j111113, j111112, jM17496b111);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h115;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    }
                    c1652h3 = c1652h2;
                    z13 = z12;
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1113 = ComposerKt.f3003a;
                    C5304d1 c5304d12 = TouchTargetKt.f2854a;
                    C5207g.m11111f(interfaceC0500b4, "<this>");
                    InterfaceC0500b interfaceC0500bM1927a12 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                    float f110 = C5006g.f32673a;
                    InterfaceC0500b interfaceC0500bM1510g12 = SizeKt.m1510g(interfaceC0500bM1927a12, f110);
                    c1652h3.getClass();
                    composerImplMo1636j.mo1622c(1876083926);
                    if (z13) {
                        j10 = c1652h3.f9249a;
                    } else {
                        j10 = c1652h3.f9251c;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V112 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1409c12 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g12, ((C9169u) interfaceC5312g0M16704V112.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f110 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                    C7886b c7886b12 = InterfaceC7885a.a.f42991c;
                    composerImplMo1636j.mo1622c(733328855);
                    interfaceC5652pM1499d = BoxKt.m1499d(c7886b12, false, composerImplMo1636j);
                    composerImplMo1636j.mo1622c(-1323940314);
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                    composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c12);
                    if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(interfaceC2041a2);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    composerImplMo1636j.f2933x = false;
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    composerImplMo1636j.mo1626e();
                    composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                    composerImplMo1636j.mo1622c(2058660585);
                    composerImplMo1636j.mo1622c(-2137368960);
                    composerImplMo1636j.mo1622c(1428615496);
                    composerImplMo1636j.mo1622c(613133646);
                    if (z13) {
                        j11 = c1652h3.f9250b;
                    } else {
                        j11 = c1652h3.f9252d;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V113 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V113.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b5 = interfaceC0500b4;
                    z14 = z13;
                    c1652h4 = c1652h3;
                }
                interfaceC9612j3 = interfaceC9612j2;
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        IconButtonKt.m1565a(interfaceC2041a, interfaceC0500b5, z14, c1652h4, interfaceC9612j3, interfaceC2056p, interfaceC0476a2, i10 | 1, i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 24576;
            interfaceC9612j2 = interfaceC9612j;
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (composerImplMo1636j.mo1665y(interfaceC2056p)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j111114 = C9169u.f47702e;
                            long j111115 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b112 = C9169u.m17496b(j111115, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1114 = ComposerKt.f3003a;
                            C1652h c1652h116 = new C1652h(j111114, j111115, j111114, jM17496b112);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h116;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    } else {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j111116 = C9169u.f47702e;
                            long j111117 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b113 = C9169u.m17496b(j111117, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1115 = ComposerKt.f3003a;
                            C1652h c1652h117 = new C1652h(j111116, j111117, j111116, jM17496b113);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h117;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    }
                    c1652h3 = c1652h2;
                    z13 = z12;
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1116 = ComposerKt.f3003a;
                    C5304d1 c5304d13 = TouchTargetKt.f2854a;
                    C5207g.m11111f(interfaceC0500b4, "<this>");
                    InterfaceC0500b interfaceC0500bM1927a13 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                    float f111 = C5006g.f32673a;
                    InterfaceC0500b interfaceC0500bM1510g13 = SizeKt.m1510g(interfaceC0500bM1927a13, f111);
                    c1652h3.getClass();
                    composerImplMo1636j.mo1622c(1876083926);
                    if (z13) {
                        j10 = c1652h3.f9249a;
                    } else {
                        j10 = c1652h3.f9251c;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V114 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1409c13 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g13, ((C9169u) interfaceC5312g0M16704V114.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f111 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                    C7886b c7886b13 = InterfaceC7885a.a.f42991c;
                    composerImplMo1636j.mo1622c(733328855);
                    interfaceC5652pM1499d = BoxKt.m1499d(c7886b13, false, composerImplMo1636j);
                    composerImplMo1636j.mo1622c(-1323940314);
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                    composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c13);
                    if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(interfaceC2041a2);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    composerImplMo1636j.f2933x = false;
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    composerImplMo1636j.mo1626e();
                    composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                    composerImplMo1636j.mo1622c(2058660585);
                    composerImplMo1636j.mo1622c(-2137368960);
                    composerImplMo1636j.mo1622c(1428615496);
                    composerImplMo1636j.mo1622c(613133646);
                    if (z13) {
                        j11 = c1652h3.f9250b;
                    } else {
                        j11 = c1652h3.f9252d;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V115 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V115.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b5 = interfaceC0500b4;
                    z14 = z13;
                    c1652h4 = c1652h3;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j111118 = C9169u.f47702e;
                            long j111119 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b114 = C9169u.m17496b(j111119, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1117 = ComposerKt.f3003a;
                            C1652h c1652h118 = new C1652h(j111118, j111119, j111118, jM17496b114);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h118;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    } else {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j1111110 = C9169u.f47702e;
                            long j1111111 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b115 = C9169u.m17496b(j1111111, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1118 = ComposerKt.f3003a;
                            C1652h c1652h119 = new C1652h(j1111110, j1111111, j1111110, jM17496b115);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h119;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    }
                    c1652h3 = c1652h2;
                    z13 = z12;
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1119 = ComposerKt.f3003a;
                    C5304d1 c5304d14 = TouchTargetKt.f2854a;
                    C5207g.m11111f(interfaceC0500b4, "<this>");
                    InterfaceC0500b interfaceC0500bM1927a14 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                    float f112 = C5006g.f32673a;
                    InterfaceC0500b interfaceC0500bM1510g14 = SizeKt.m1510g(interfaceC0500bM1927a14, f112);
                    c1652h3.getClass();
                    composerImplMo1636j.mo1622c(1876083926);
                    if (z13) {
                        j10 = c1652h3.f9249a;
                    } else {
                        j10 = c1652h3.f9251c;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V116 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1409c14 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g14, ((C9169u) interfaceC5312g0M16704V116.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f112 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                    C7886b c7886b14 = InterfaceC7885a.a.f42991c;
                    composerImplMo1636j.mo1622c(733328855);
                    interfaceC5652pM1499d = BoxKt.m1499d(c7886b14, false, composerImplMo1636j);
                    composerImplMo1636j.mo1622c(-1323940314);
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                    composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c14);
                    if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(interfaceC2041a2);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    composerImplMo1636j.f2933x = false;
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    composerImplMo1636j.mo1626e();
                    composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                    composerImplMo1636j.mo1622c(2058660585);
                    composerImplMo1636j.mo1622c(-2137368960);
                    composerImplMo1636j.mo1622c(1428615496);
                    composerImplMo1636j.mo1622c(613133646);
                    if (z13) {
                        j11 = c1652h3.f9250b;
                    } else {
                        j11 = c1652h3.f9252d;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V117 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V117.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b5 = interfaceC0500b4;
                    z14 = z13;
                    c1652h4 = c1652h3;
                }
                interfaceC9612j3 = interfaceC9612j2;
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        IconButtonKt.m1565a(interfaceC2041a, interfaceC0500b5, z14, c1652h4, interfaceC9612j3, interfaceC2056p, interfaceC0476a2, i10 | 1, i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i17 = 196608;
            i12 |= i17;
            if ((374491 & i12) == 74898) {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        composerImplMo1636j.mo1622c(999008085);
                        long j1111112 = C9169u.f47702e;
                        long j1111113 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        long jM17496b116 = C9169u.m17496b(j1111113, 0.38f);
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11110 = ComposerKt.f3003a;
                        C1652h c1652h1110 = new C1652h(j1111112, j1111113, j1111112, jM17496b116);
                        composerImplMo1636j.m1609Q(false);
                        i12 &= -7169;
                        c1652h2 = c1652h1110;
                    }
                    if (i15 != 0) {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new C9613k();
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                    } else {
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                    }
                } else {
                    if (i19 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        composerImplMo1636j.mo1622c(999008085);
                        long j1111114 = C9169u.f47702e;
                        long j1111115 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        long jM17496b117 = C9169u.m17496b(j1111115, 0.38f);
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11111 = ComposerKt.f3003a;
                        C1652h c1652h1111 = new C1652h(j1111114, j1111115, j1111114, jM17496b117);
                        composerImplMo1636j.m1609Q(false);
                        i12 &= -7169;
                        c1652h2 = c1652h1111;
                    }
                    if (i15 != 0) {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new C9613k();
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                    } else {
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                    }
                }
                c1652h3 = c1652h2;
                z13 = z12;
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11112 = ComposerKt.f3003a;
                C5304d1 c5304d15 = TouchTargetKt.f2854a;
                C5207g.m11111f(interfaceC0500b4, "<this>");
                InterfaceC0500b interfaceC0500bM1927a15 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                float f113 = C5006g.f32673a;
                InterfaceC0500b interfaceC0500bM1510g15 = SizeKt.m1510g(interfaceC0500bM1927a15, f113);
                c1652h3.getClass();
                composerImplMo1636j.mo1622c(1876083926);
                if (z13) {
                    j10 = c1652h3.f9249a;
                } else {
                    j10 = c1652h3.f9251c;
                }
                InterfaceC5312g0 interfaceC5312g0M16704V118 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                composerImplMo1636j.m1609Q(false);
                InterfaceC0500b interfaceC0500bM1409c15 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g15, ((C9169u) interfaceC5312g0M16704V118.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f113 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                C7886b c7886b15 = InterfaceC7885a.a.f42991c;
                composerImplMo1636j.mo1622c(733328855);
                interfaceC5652pM1499d = BoxKt.m1499d(c7886b15, false, composerImplMo1636j);
                composerImplMo1636j.mo1622c(-1323940314);
                interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c15);
                if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.mo1640l();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(interfaceC2041a2);
                } else {
                    composerImplMo1636j.mo1653s();
                }
                composerImplMo1636j.f2933x = false;
                C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                composerImplMo1636j.mo1626e();
                composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                composerImplMo1636j.mo1622c(2058660585);
                composerImplMo1636j.mo1622c(-2137368960);
                composerImplMo1636j.mo1622c(1428615496);
                composerImplMo1636j.mo1622c(613133646);
                if (z13) {
                    j11 = c1652h3.f9250b;
                } else {
                    j11 = c1652h3.f9252d;
                }
                InterfaceC5312g0 interfaceC5312g0M16704V119 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                composerImplMo1636j.m1609Q(false);
                CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V119.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                interfaceC0500b5 = interfaceC0500b4;
                z14 = z13;
                c1652h4 = c1652h3;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        composerImplMo1636j.mo1622c(999008085);
                        long j1111116 = C9169u.f47702e;
                        long j1111117 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        long jM17496b118 = C9169u.m17496b(j1111117, 0.38f);
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11113 = ComposerKt.f3003a;
                        C1652h c1652h1112 = new C1652h(j1111116, j1111117, j1111116, jM17496b118);
                        composerImplMo1636j.m1609Q(false);
                        i12 &= -7169;
                        c1652h2 = c1652h1112;
                    }
                    if (i15 != 0) {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new C9613k();
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                    } else {
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                    }
                } else {
                    if (i19 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        composerImplMo1636j.mo1622c(999008085);
                        long j1111118 = C9169u.f47702e;
                        long j1111119 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        long jM17496b119 = C9169u.m17496b(j1111119, 0.38f);
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11114 = ComposerKt.f3003a;
                        C1652h c1652h1113 = new C1652h(j1111118, j1111119, j1111118, jM17496b119);
                        composerImplMo1636j.m1609Q(false);
                        i12 &= -7169;
                        c1652h2 = c1652h1113;
                    }
                    if (i15 != 0) {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new C9613k();
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                    } else {
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                    }
                }
                c1652h3 = c1652h2;
                z13 = z12;
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11115 = ComposerKt.f3003a;
                C5304d1 c5304d16 = TouchTargetKt.f2854a;
                C5207g.m11111f(interfaceC0500b4, "<this>");
                InterfaceC0500b interfaceC0500bM1927a16 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                float f114 = C5006g.f32673a;
                InterfaceC0500b interfaceC0500bM1510g16 = SizeKt.m1510g(interfaceC0500bM1927a16, f114);
                c1652h3.getClass();
                composerImplMo1636j.mo1622c(1876083926);
                if (z13) {
                    j10 = c1652h3.f9249a;
                } else {
                    j10 = c1652h3.f9251c;
                }
                InterfaceC5312g0 interfaceC5312g0M16704V1110 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                composerImplMo1636j.m1609Q(false);
                InterfaceC0500b interfaceC0500bM1409c16 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g16, ((C9169u) interfaceC5312g0M16704V1110.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f114 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                C7886b c7886b16 = InterfaceC7885a.a.f42991c;
                composerImplMo1636j.mo1622c(733328855);
                interfaceC5652pM1499d = BoxKt.m1499d(c7886b16, false, composerImplMo1636j);
                composerImplMo1636j.mo1622c(-1323940314);
                interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c16);
                if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.mo1640l();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(interfaceC2041a2);
                } else {
                    composerImplMo1636j.mo1653s();
                }
                composerImplMo1636j.f2933x = false;
                C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                composerImplMo1636j.mo1626e();
                composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                composerImplMo1636j.mo1622c(2058660585);
                composerImplMo1636j.mo1622c(-2137368960);
                composerImplMo1636j.mo1622c(1428615496);
                composerImplMo1636j.mo1622c(613133646);
                if (z13) {
                    j11 = c1652h3.f9250b;
                } else {
                    j11 = c1652h3.f9252d;
                }
                InterfaceC5312g0 interfaceC5312g0M16704V1111 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                composerImplMo1636j.m1609Q(false);
                CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V1111.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                interfaceC0500b5 = interfaceC0500b4;
                z14 = z13;
                c1652h4 = c1652h3;
            }
            interfaceC9612j3 = interfaceC9612j2;
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    IconButtonKt.m1565a(interfaceC2041a, interfaceC0500b5, z14, c1652h4, interfaceC9612j3, interfaceC2056p, interfaceC0476a2, i10 | 1, i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 48;
        interfaceC0500b2 = interfaceC0500b;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                z11 = z10;
                if (composerImplMo1636j.m1598G(z11)) {
                    i14 = 256;
                } else {
                    i14 = BuildConfig.SDK_TRUNCATE_LENGTH;
                }
                i12 |= i14;
            }
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    c1652h2 = c1652h;
                    if (composerImplMo1636j.mo1665y(c1652h2)) {
                    }
                    i12 |= i20;
                } else {
                    c1652h2 = c1652h;
                }
                i12 |= i20;
            } else {
                c1652h2 = c1652h;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    interfaceC9612j2 = interfaceC9612j;
                    if (composerImplMo1636j.mo1665y(interfaceC9612j2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (composerImplMo1636j.mo1665y(interfaceC2056p)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z10;
                            }
                            if ((i11 & 8) != 0) {
                                composerImplMo1636j.mo1622c(999008085);
                                long j11111110 = C9169u.f47702e;
                                long j11111111 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                                long jM17496b1110 = C9169u.m17496b(j11111111, 0.38f);
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11116 = ComposerKt.f3003a;
                                C1652h c1652h1114 = new C1652h(j11111110, j11111111, j11111110, jM17496b1110);
                                composerImplMo1636j.m1609Q(false);
                                i12 &= -7169;
                                c1652h2 = c1652h1114;
                            }
                            if (i15 != 0) {
                                composerImplMo1636j.mo1622c(-492369756);
                                objM1619a0 = composerImplMo1636j.m1619a0();
                                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                    objM1619a0 = new C9613k();
                                    composerImplMo1636j.m1597F0(objM1619a0);
                                }
                                composerImplMo1636j.m1609Q(false);
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                                interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                            } else {
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                            }
                        } else {
                            if (i19 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z10;
                            }
                            if ((i11 & 8) != 0) {
                                composerImplMo1636j.mo1622c(999008085);
                                long j11111112 = C9169u.f47702e;
                                long j11111113 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                                long jM17496b1111 = C9169u.m17496b(j11111113, 0.38f);
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11117 = ComposerKt.f3003a;
                                C1652h c1652h1115 = new C1652h(j11111112, j11111113, j11111112, jM17496b1111);
                                composerImplMo1636j.m1609Q(false);
                                i12 &= -7169;
                                c1652h2 = c1652h1115;
                            }
                            if (i15 != 0) {
                                composerImplMo1636j.mo1622c(-492369756);
                                objM1619a0 = composerImplMo1636j.m1619a0();
                                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                    objM1619a0 = new C9613k();
                                    composerImplMo1636j.m1597F0(objM1619a0);
                                }
                                composerImplMo1636j.m1609Q(false);
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                                interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                            } else {
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                            }
                        }
                        c1652h3 = c1652h2;
                        z13 = z12;
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11118 = ComposerKt.f3003a;
                        C5304d1 c5304d17 = TouchTargetKt.f2854a;
                        C5207g.m11111f(interfaceC0500b4, "<this>");
                        InterfaceC0500b interfaceC0500bM1927a17 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                        float f115 = C5006g.f32673a;
                        InterfaceC0500b interfaceC0500bM1510g17 = SizeKt.m1510g(interfaceC0500bM1927a17, f115);
                        c1652h3.getClass();
                        composerImplMo1636j.mo1622c(1876083926);
                        if (z13) {
                            j10 = c1652h3.f9249a;
                        } else {
                            j10 = c1652h3.f9251c;
                        }
                        InterfaceC5312g0 interfaceC5312g0M16704V1112 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                        composerImplMo1636j.m1609Q(false);
                        InterfaceC0500b interfaceC0500bM1409c17 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g17, ((C9169u) interfaceC5312g0M16704V1112.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f115 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                        C7886b c7886b17 = InterfaceC7885a.a.f42991c;
                        composerImplMo1636j.mo1622c(733328855);
                        interfaceC5652pM1499d = BoxKt.m1499d(c7886b17, false, composerImplMo1636j);
                        composerImplMo1636j.mo1622c(-1323940314);
                        interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                        layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                        interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                        ComposeUiNode.f3726n.getClass();
                        interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                        composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c17);
                        if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.mo1640l();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(interfaceC2041a2);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        composerImplMo1636j.f2933x = false;
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                        C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                        composerImplMo1636j.mo1626e();
                        composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                        composerImplMo1636j.mo1622c(2058660585);
                        composerImplMo1636j.mo1622c(-2137368960);
                        composerImplMo1636j.mo1622c(1428615496);
                        composerImplMo1636j.mo1622c(613133646);
                        if (z13) {
                            j11 = c1652h3.f9250b;
                        } else {
                            j11 = c1652h3.f9252d;
                        }
                        InterfaceC5312g0 interfaceC5312g0M16704V1113 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                        composerImplMo1636j.m1609Q(false);
                        CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V1113.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        interfaceC0500b5 = interfaceC0500b4;
                        z14 = z13;
                        c1652h4 = c1652h3;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z10;
                            }
                            if ((i11 & 8) != 0) {
                                composerImplMo1636j.mo1622c(999008085);
                                long j11111114 = C9169u.f47702e;
                                long j11111115 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                                long jM17496b1112 = C9169u.m17496b(j11111115, 0.38f);
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11119 = ComposerKt.f3003a;
                                C1652h c1652h1116 = new C1652h(j11111114, j11111115, j11111114, jM17496b1112);
                                composerImplMo1636j.m1609Q(false);
                                i12 &= -7169;
                                c1652h2 = c1652h1116;
                            }
                            if (i15 != 0) {
                                composerImplMo1636j.mo1622c(-492369756);
                                objM1619a0 = composerImplMo1636j.m1619a0();
                                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                    objM1619a0 = new C9613k();
                                    composerImplMo1636j.m1597F0(objM1619a0);
                                }
                                composerImplMo1636j.m1609Q(false);
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                                interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                            } else {
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                            }
                        } else {
                            if (i19 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z10;
                            }
                            if ((i11 & 8) != 0) {
                                composerImplMo1636j.mo1622c(999008085);
                                long j11111116 = C9169u.f47702e;
                                long j11111117 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                                long jM17496b1113 = C9169u.m17496b(j11111117, 0.38f);
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111110 = ComposerKt.f3003a;
                                C1652h c1652h1117 = new C1652h(j11111116, j11111117, j11111116, jM17496b1113);
                                composerImplMo1636j.m1609Q(false);
                                i12 &= -7169;
                                c1652h2 = c1652h1117;
                            }
                            if (i15 != 0) {
                                composerImplMo1636j.mo1622c(-492369756);
                                objM1619a0 = composerImplMo1636j.m1619a0();
                                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                    objM1619a0 = new C9613k();
                                    composerImplMo1636j.m1597F0(objM1619a0);
                                }
                                composerImplMo1636j.m1609Q(false);
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                                interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                            } else {
                                i18 = i12;
                                interfaceC0500b4 = interfaceC0500b3;
                            }
                        }
                        c1652h3 = c1652h2;
                        z13 = z12;
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111111 = ComposerKt.f3003a;
                        C5304d1 c5304d18 = TouchTargetKt.f2854a;
                        C5207g.m11111f(interfaceC0500b4, "<this>");
                        InterfaceC0500b interfaceC0500bM1927a18 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                        float f116 = C5006g.f32673a;
                        InterfaceC0500b interfaceC0500bM1510g18 = SizeKt.m1510g(interfaceC0500bM1927a18, f116);
                        c1652h3.getClass();
                        composerImplMo1636j.mo1622c(1876083926);
                        if (z13) {
                            j10 = c1652h3.f9249a;
                        } else {
                            j10 = c1652h3.f9251c;
                        }
                        InterfaceC5312g0 interfaceC5312g0M16704V1114 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                        composerImplMo1636j.m1609Q(false);
                        InterfaceC0500b interfaceC0500bM1409c18 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g18, ((C9169u) interfaceC5312g0M16704V1114.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f116 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                        C7886b c7886b18 = InterfaceC7885a.a.f42991c;
                        composerImplMo1636j.mo1622c(733328855);
                        interfaceC5652pM1499d = BoxKt.m1499d(c7886b18, false, composerImplMo1636j);
                        composerImplMo1636j.mo1622c(-1323940314);
                        interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                        layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                        interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                        ComposeUiNode.f3726n.getClass();
                        interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                        composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c18);
                        if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.mo1640l();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(interfaceC2041a2);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        composerImplMo1636j.f2933x = false;
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                        C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                        composerImplMo1636j.mo1626e();
                        composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                        composerImplMo1636j.mo1622c(2058660585);
                        composerImplMo1636j.mo1622c(-2137368960);
                        composerImplMo1636j.mo1622c(1428615496);
                        composerImplMo1636j.mo1622c(613133646);
                        if (z13) {
                            j11 = c1652h3.f9250b;
                        } else {
                            j11 = c1652h3.f9252d;
                        }
                        InterfaceC5312g0 interfaceC5312g0M16704V1115 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                        composerImplMo1636j.m1609Q(false);
                        CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V1115.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        interfaceC0500b5 = interfaceC0500b4;
                        z14 = z13;
                        c1652h4 = c1652h3;
                    }
                    interfaceC9612j3 = interfaceC9612j2;
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            IconButtonKt.m1565a(interfaceC2041a, interfaceC0500b5, z14, c1652h4, interfaceC9612j3, interfaceC2056p, interfaceC0476a2, i10 | 1, i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i17 = 196608;
                i12 |= i17;
                if ((374491 & i12) == 74898) {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j11111118 = C9169u.f47702e;
                            long j11111119 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b1114 = C9169u.m17496b(j11111119, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111112 = ComposerKt.f3003a;
                            C1652h c1652h1118 = new C1652h(j11111118, j11111119, j11111118, jM17496b1114);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h1118;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    } else {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j111111110 = C9169u.f47702e;
                            long j111111111 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b1115 = C9169u.m17496b(j111111111, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111113 = ComposerKt.f3003a;
                            C1652h c1652h1119 = new C1652h(j111111110, j111111111, j111111110, jM17496b1115);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h1119;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    }
                    c1652h3 = c1652h2;
                    z13 = z12;
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111114 = ComposerKt.f3003a;
                    C5304d1 c5304d19 = TouchTargetKt.f2854a;
                    C5207g.m11111f(interfaceC0500b4, "<this>");
                    InterfaceC0500b interfaceC0500bM1927a19 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                    float f117 = C5006g.f32673a;
                    InterfaceC0500b interfaceC0500bM1510g19 = SizeKt.m1510g(interfaceC0500bM1927a19, f117);
                    c1652h3.getClass();
                    composerImplMo1636j.mo1622c(1876083926);
                    if (z13) {
                        j10 = c1652h3.f9249a;
                    } else {
                        j10 = c1652h3.f9251c;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V1116 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1409c19 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g19, ((C9169u) interfaceC5312g0M16704V1116.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f117 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                    C7886b c7886b19 = InterfaceC7885a.a.f42991c;
                    composerImplMo1636j.mo1622c(733328855);
                    interfaceC5652pM1499d = BoxKt.m1499d(c7886b19, false, composerImplMo1636j);
                    composerImplMo1636j.mo1622c(-1323940314);
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                    composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c19);
                    if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(interfaceC2041a2);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    composerImplMo1636j.f2933x = false;
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    composerImplMo1636j.mo1626e();
                    composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                    composerImplMo1636j.mo1622c(2058660585);
                    composerImplMo1636j.mo1622c(-2137368960);
                    composerImplMo1636j.mo1622c(1428615496);
                    composerImplMo1636j.mo1622c(613133646);
                    if (z13) {
                        j11 = c1652h3.f9250b;
                    } else {
                        j11 = c1652h3.f9252d;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V1117 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V1117.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b5 = interfaceC0500b4;
                    z14 = z13;
                    c1652h4 = c1652h3;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j111111112 = C9169u.f47702e;
                            long j111111113 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b1116 = C9169u.m17496b(j111111113, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111115 = ComposerKt.f3003a;
                            C1652h c1652h11110 = new C1652h(j111111112, j111111113, j111111112, jM17496b1116);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h11110;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    } else {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j111111114 = C9169u.f47702e;
                            long j111111115 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b1117 = C9169u.m17496b(j111111115, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111116 = ComposerKt.f3003a;
                            C1652h c1652h11111 = new C1652h(j111111114, j111111115, j111111114, jM17496b1117);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h11111;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    }
                    c1652h3 = c1652h2;
                    z13 = z12;
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111117 = ComposerKt.f3003a;
                    C5304d1 c5304d110 = TouchTargetKt.f2854a;
                    C5207g.m11111f(interfaceC0500b4, "<this>");
                    InterfaceC0500b interfaceC0500bM1927a110 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                    float f118 = C5006g.f32673a;
                    InterfaceC0500b interfaceC0500bM1510g110 = SizeKt.m1510g(interfaceC0500bM1927a110, f118);
                    c1652h3.getClass();
                    composerImplMo1636j.mo1622c(1876083926);
                    if (z13) {
                        j10 = c1652h3.f9249a;
                    } else {
                        j10 = c1652h3.f9251c;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V1118 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1409c110 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g110, ((C9169u) interfaceC5312g0M16704V1118.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f118 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                    C7886b c7886b110 = InterfaceC7885a.a.f42991c;
                    composerImplMo1636j.mo1622c(733328855);
                    interfaceC5652pM1499d = BoxKt.m1499d(c7886b110, false, composerImplMo1636j);
                    composerImplMo1636j.mo1622c(-1323940314);
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                    composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c110);
                    if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(interfaceC2041a2);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    composerImplMo1636j.f2933x = false;
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    composerImplMo1636j.mo1626e();
                    composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                    composerImplMo1636j.mo1622c(2058660585);
                    composerImplMo1636j.mo1622c(-2137368960);
                    composerImplMo1636j.mo1622c(1428615496);
                    composerImplMo1636j.mo1622c(613133646);
                    if (z13) {
                        j11 = c1652h3.f9250b;
                    } else {
                        j11 = c1652h3.f9252d;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V1119 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V1119.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b5 = interfaceC0500b4;
                    z14 = z13;
                    c1652h4 = c1652h3;
                }
                interfaceC9612j3 = interfaceC9612j2;
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        IconButtonKt.m1565a(interfaceC2041a, interfaceC0500b5, z14, c1652h4, interfaceC9612j3, interfaceC2056p, interfaceC0476a2, i10 | 1, i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 24576;
            interfaceC9612j2 = interfaceC9612j;
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (composerImplMo1636j.mo1665y(interfaceC2056p)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j111111116 = C9169u.f47702e;
                            long j111111117 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b1118 = C9169u.m17496b(j111111117, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111118 = ComposerKt.f3003a;
                            C1652h c1652h11112 = new C1652h(j111111116, j111111117, j111111116, jM17496b1118);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h11112;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    } else {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j111111118 = C9169u.f47702e;
                            long j111111119 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b1119 = C9169u.m17496b(j111111119, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111119 = ComposerKt.f3003a;
                            C1652h c1652h11113 = new C1652h(j111111118, j111111119, j111111118, jM17496b1119);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h11113;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    }
                    c1652h3 = c1652h2;
                    z13 = z12;
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111110 = ComposerKt.f3003a;
                    C5304d1 c5304d111 = TouchTargetKt.f2854a;
                    C5207g.m11111f(interfaceC0500b4, "<this>");
                    InterfaceC0500b interfaceC0500bM1927a111 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                    float f119 = C5006g.f32673a;
                    InterfaceC0500b interfaceC0500bM1510g111 = SizeKt.m1510g(interfaceC0500bM1927a111, f119);
                    c1652h3.getClass();
                    composerImplMo1636j.mo1622c(1876083926);
                    if (z13) {
                        j10 = c1652h3.f9249a;
                    } else {
                        j10 = c1652h3.f9251c;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V11110 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1409c111 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g111, ((C9169u) interfaceC5312g0M16704V11110.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f119 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                    C7886b c7886b111 = InterfaceC7885a.a.f42991c;
                    composerImplMo1636j.mo1622c(733328855);
                    interfaceC5652pM1499d = BoxKt.m1499d(c7886b111, false, composerImplMo1636j);
                    composerImplMo1636j.mo1622c(-1323940314);
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                    composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c111);
                    if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(interfaceC2041a2);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    composerImplMo1636j.f2933x = false;
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    composerImplMo1636j.mo1626e();
                    composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                    composerImplMo1636j.mo1622c(2058660585);
                    composerImplMo1636j.mo1622c(-2137368960);
                    composerImplMo1636j.mo1622c(1428615496);
                    composerImplMo1636j.mo1622c(613133646);
                    if (z13) {
                        j11 = c1652h3.f9250b;
                    } else {
                        j11 = c1652h3.f9252d;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V11111 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V11111.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b5 = interfaceC0500b4;
                    z14 = z13;
                    c1652h4 = c1652h3;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j1111111110 = C9169u.f47702e;
                            long j1111111111 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b11110 = C9169u.m17496b(j1111111111, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111111 = ComposerKt.f3003a;
                            C1652h c1652h11114 = new C1652h(j1111111110, j1111111111, j1111111110, jM17496b11110);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h11114;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    } else {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j1111111112 = C9169u.f47702e;
                            long j1111111113 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b11111 = C9169u.m17496b(j1111111113, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111112 = ComposerKt.f3003a;
                            C1652h c1652h11115 = new C1652h(j1111111112, j1111111113, j1111111112, jM17496b11111);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h11115;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    }
                    c1652h3 = c1652h2;
                    z13 = z12;
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111113 = ComposerKt.f3003a;
                    C5304d1 c5304d112 = TouchTargetKt.f2854a;
                    C5207g.m11111f(interfaceC0500b4, "<this>");
                    InterfaceC0500b interfaceC0500bM1927a112 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                    float f1110 = C5006g.f32673a;
                    InterfaceC0500b interfaceC0500bM1510g112 = SizeKt.m1510g(interfaceC0500bM1927a112, f1110);
                    c1652h3.getClass();
                    composerImplMo1636j.mo1622c(1876083926);
                    if (z13) {
                        j10 = c1652h3.f9249a;
                    } else {
                        j10 = c1652h3.f9251c;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V11112 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1409c112 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g112, ((C9169u) interfaceC5312g0M16704V11112.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f1110 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                    C7886b c7886b112 = InterfaceC7885a.a.f42991c;
                    composerImplMo1636j.mo1622c(733328855);
                    interfaceC5652pM1499d = BoxKt.m1499d(c7886b112, false, composerImplMo1636j);
                    composerImplMo1636j.mo1622c(-1323940314);
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                    composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c112);
                    if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(interfaceC2041a2);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    composerImplMo1636j.f2933x = false;
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    composerImplMo1636j.mo1626e();
                    composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                    composerImplMo1636j.mo1622c(2058660585);
                    composerImplMo1636j.mo1622c(-2137368960);
                    composerImplMo1636j.mo1622c(1428615496);
                    composerImplMo1636j.mo1622c(613133646);
                    if (z13) {
                        j11 = c1652h3.f9250b;
                    } else {
                        j11 = c1652h3.f9252d;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V11113 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V11113.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b5 = interfaceC0500b4;
                    z14 = z13;
                    c1652h4 = c1652h3;
                }
                interfaceC9612j3 = interfaceC9612j2;
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        IconButtonKt.m1565a(interfaceC2041a, interfaceC0500b5, z14, c1652h4, interfaceC9612j3, interfaceC2056p, interfaceC0476a2, i10 | 1, i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i17 = 196608;
            i12 |= i17;
            if ((374491 & i12) == 74898) {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        composerImplMo1636j.mo1622c(999008085);
                        long j1111111114 = C9169u.f47702e;
                        long j1111111115 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        long jM17496b11112 = C9169u.m17496b(j1111111115, 0.38f);
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111114 = ComposerKt.f3003a;
                        C1652h c1652h11116 = new C1652h(j1111111114, j1111111115, j1111111114, jM17496b11112);
                        composerImplMo1636j.m1609Q(false);
                        i12 &= -7169;
                        c1652h2 = c1652h11116;
                    }
                    if (i15 != 0) {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new C9613k();
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                    } else {
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                    }
                } else {
                    if (i19 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        composerImplMo1636j.mo1622c(999008085);
                        long j1111111116 = C9169u.f47702e;
                        long j1111111117 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        long jM17496b11113 = C9169u.m17496b(j1111111117, 0.38f);
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111115 = ComposerKt.f3003a;
                        C1652h c1652h11117 = new C1652h(j1111111116, j1111111117, j1111111116, jM17496b11113);
                        composerImplMo1636j.m1609Q(false);
                        i12 &= -7169;
                        c1652h2 = c1652h11117;
                    }
                    if (i15 != 0) {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new C9613k();
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                    } else {
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                    }
                }
                c1652h3 = c1652h2;
                z13 = z12;
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111116 = ComposerKt.f3003a;
                C5304d1 c5304d113 = TouchTargetKt.f2854a;
                C5207g.m11111f(interfaceC0500b4, "<this>");
                InterfaceC0500b interfaceC0500bM1927a113 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                float f1111 = C5006g.f32673a;
                InterfaceC0500b interfaceC0500bM1510g113 = SizeKt.m1510g(interfaceC0500bM1927a113, f1111);
                c1652h3.getClass();
                composerImplMo1636j.mo1622c(1876083926);
                if (z13) {
                    j10 = c1652h3.f9249a;
                } else {
                    j10 = c1652h3.f9251c;
                }
                InterfaceC5312g0 interfaceC5312g0M16704V11114 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                composerImplMo1636j.m1609Q(false);
                InterfaceC0500b interfaceC0500bM1409c113 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g113, ((C9169u) interfaceC5312g0M16704V11114.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f1111 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                C7886b c7886b113 = InterfaceC7885a.a.f42991c;
                composerImplMo1636j.mo1622c(733328855);
                interfaceC5652pM1499d = BoxKt.m1499d(c7886b113, false, composerImplMo1636j);
                composerImplMo1636j.mo1622c(-1323940314);
                interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c113);
                if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.mo1640l();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(interfaceC2041a2);
                } else {
                    composerImplMo1636j.mo1653s();
                }
                composerImplMo1636j.f2933x = false;
                C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                composerImplMo1636j.mo1626e();
                composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                composerImplMo1636j.mo1622c(2058660585);
                composerImplMo1636j.mo1622c(-2137368960);
                composerImplMo1636j.mo1622c(1428615496);
                composerImplMo1636j.mo1622c(613133646);
                if (z13) {
                    j11 = c1652h3.f9250b;
                } else {
                    j11 = c1652h3.f9252d;
                }
                InterfaceC5312g0 interfaceC5312g0M16704V11115 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                composerImplMo1636j.m1609Q(false);
                CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V11115.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                interfaceC0500b5 = interfaceC0500b4;
                z14 = z13;
                c1652h4 = c1652h3;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        composerImplMo1636j.mo1622c(999008085);
                        long j1111111118 = C9169u.f47702e;
                        long j1111111119 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        long jM17496b11114 = C9169u.m17496b(j1111111119, 0.38f);
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111117 = ComposerKt.f3003a;
                        C1652h c1652h11118 = new C1652h(j1111111118, j1111111119, j1111111118, jM17496b11114);
                        composerImplMo1636j.m1609Q(false);
                        i12 &= -7169;
                        c1652h2 = c1652h11118;
                    }
                    if (i15 != 0) {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new C9613k();
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                    } else {
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                    }
                } else {
                    if (i19 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        composerImplMo1636j.mo1622c(999008085);
                        long j11111111110 = C9169u.f47702e;
                        long j11111111111 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        long jM17496b11115 = C9169u.m17496b(j11111111111, 0.38f);
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111118 = ComposerKt.f3003a;
                        C1652h c1652h11119 = new C1652h(j11111111110, j11111111111, j11111111110, jM17496b11115);
                        composerImplMo1636j.m1609Q(false);
                        i12 &= -7169;
                        c1652h2 = c1652h11119;
                    }
                    if (i15 != 0) {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new C9613k();
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                    } else {
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                    }
                }
                c1652h3 = c1652h2;
                z13 = z12;
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111119 = ComposerKt.f3003a;
                C5304d1 c5304d114 = TouchTargetKt.f2854a;
                C5207g.m11111f(interfaceC0500b4, "<this>");
                InterfaceC0500b interfaceC0500bM1927a114 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                float f1112 = C5006g.f32673a;
                InterfaceC0500b interfaceC0500bM1510g114 = SizeKt.m1510g(interfaceC0500bM1927a114, f1112);
                c1652h3.getClass();
                composerImplMo1636j.mo1622c(1876083926);
                if (z13) {
                    j10 = c1652h3.f9249a;
                } else {
                    j10 = c1652h3.f9251c;
                }
                InterfaceC5312g0 interfaceC5312g0M16704V11116 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                composerImplMo1636j.m1609Q(false);
                InterfaceC0500b interfaceC0500bM1409c114 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g114, ((C9169u) interfaceC5312g0M16704V11116.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f1112 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                C7886b c7886b114 = InterfaceC7885a.a.f42991c;
                composerImplMo1636j.mo1622c(733328855);
                interfaceC5652pM1499d = BoxKt.m1499d(c7886b114, false, composerImplMo1636j);
                composerImplMo1636j.mo1622c(-1323940314);
                interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c114);
                if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.mo1640l();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(interfaceC2041a2);
                } else {
                    composerImplMo1636j.mo1653s();
                }
                composerImplMo1636j.f2933x = false;
                C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                composerImplMo1636j.mo1626e();
                composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                composerImplMo1636j.mo1622c(2058660585);
                composerImplMo1636j.mo1622c(-2137368960);
                composerImplMo1636j.mo1622c(1428615496);
                composerImplMo1636j.mo1622c(613133646);
                if (z13) {
                    j11 = c1652h3.f9250b;
                } else {
                    j11 = c1652h3.f9252d;
                }
                InterfaceC5312g0 interfaceC5312g0M16704V11117 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                composerImplMo1636j.m1609Q(false);
                CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V11117.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                interfaceC0500b5 = interfaceC0500b4;
                z14 = z13;
                c1652h4 = c1652h3;
            }
            interfaceC9612j3 = interfaceC9612j2;
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    IconButtonKt.m1565a(interfaceC2041a, interfaceC0500b5, z14, c1652h4, interfaceC9612j3, interfaceC2056p, interfaceC0476a2, i10 | 1, i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 384;
        z11 = z10;
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                c1652h2 = c1652h;
                if (composerImplMo1636j.mo1665y(c1652h2)) {
                }
                i12 |= i20;
            } else {
                c1652h2 = c1652h;
            }
            i12 |= i20;
        } else {
            c1652h2 = c1652h;
        }
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((57344 & i10) == 0) {
                interfaceC9612j2 = interfaceC9612j;
                if (composerImplMo1636j.mo1665y(interfaceC9612j2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (composerImplMo1636j.mo1665y(interfaceC2056p)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j11111111112 = C9169u.f47702e;
                            long j11111111113 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b11116 = C9169u.m17496b(j11111111113, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11111110 = ComposerKt.f3003a;
                            C1652h c1652h111110 = new C1652h(j11111111112, j11111111113, j11111111112, jM17496b11116);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h111110;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    } else {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j11111111114 = C9169u.f47702e;
                            long j11111111115 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b11117 = C9169u.m17496b(j11111111115, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11111111 = ComposerKt.f3003a;
                            C1652h c1652h111111 = new C1652h(j11111111114, j11111111115, j11111111114, jM17496b11117);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h111111;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    }
                    c1652h3 = c1652h2;
                    z13 = z12;
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11111112 = ComposerKt.f3003a;
                    C5304d1 c5304d115 = TouchTargetKt.f2854a;
                    C5207g.m11111f(interfaceC0500b4, "<this>");
                    InterfaceC0500b interfaceC0500bM1927a115 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                    float f1113 = C5006g.f32673a;
                    InterfaceC0500b interfaceC0500bM1510g115 = SizeKt.m1510g(interfaceC0500bM1927a115, f1113);
                    c1652h3.getClass();
                    composerImplMo1636j.mo1622c(1876083926);
                    if (z13) {
                        j10 = c1652h3.f9249a;
                    } else {
                        j10 = c1652h3.f9251c;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V11118 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1409c115 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g115, ((C9169u) interfaceC5312g0M16704V11118.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f1113 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                    C7886b c7886b115 = InterfaceC7885a.a.f42991c;
                    composerImplMo1636j.mo1622c(733328855);
                    interfaceC5652pM1499d = BoxKt.m1499d(c7886b115, false, composerImplMo1636j);
                    composerImplMo1636j.mo1622c(-1323940314);
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                    composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c115);
                    if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(interfaceC2041a2);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    composerImplMo1636j.f2933x = false;
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    composerImplMo1636j.mo1626e();
                    composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                    composerImplMo1636j.mo1622c(2058660585);
                    composerImplMo1636j.mo1622c(-2137368960);
                    composerImplMo1636j.mo1622c(1428615496);
                    composerImplMo1636j.mo1622c(613133646);
                    if (z13) {
                        j11 = c1652h3.f9250b;
                    } else {
                        j11 = c1652h3.f9252d;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V11119 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V11119.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b5 = interfaceC0500b4;
                    z14 = z13;
                    c1652h4 = c1652h3;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j11111111116 = C9169u.f47702e;
                            long j11111111117 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b11118 = C9169u.m17496b(j11111111117, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11111113 = ComposerKt.f3003a;
                            C1652h c1652h111112 = new C1652h(j11111111116, j11111111117, j11111111116, jM17496b11118);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h111112;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    } else {
                        if (i19 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            composerImplMo1636j.mo1622c(999008085);
                            long j11111111118 = C9169u.f47702e;
                            long j11111111119 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            long jM17496b11119 = C9169u.m17496b(j11111111119, 0.38f);
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11111114 = ComposerKt.f3003a;
                            C1652h c1652h111113 = new C1652h(j11111111118, j11111111119, j11111111118, jM17496b11119);
                            composerImplMo1636j.m1609Q(false);
                            i12 &= -7169;
                            c1652h2 = c1652h111113;
                        }
                        if (i15 != 0) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new C9613k();
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                        } else {
                            i18 = i12;
                            interfaceC0500b4 = interfaceC0500b3;
                        }
                    }
                    c1652h3 = c1652h2;
                    z13 = z12;
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11111115 = ComposerKt.f3003a;
                    C5304d1 c5304d116 = TouchTargetKt.f2854a;
                    C5207g.m11111f(interfaceC0500b4, "<this>");
                    InterfaceC0500b interfaceC0500bM1927a116 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                    float f1114 = C5006g.f32673a;
                    InterfaceC0500b interfaceC0500bM1510g116 = SizeKt.m1510g(interfaceC0500bM1927a116, f1114);
                    c1652h3.getClass();
                    composerImplMo1636j.mo1622c(1876083926);
                    if (z13) {
                        j10 = c1652h3.f9249a;
                    } else {
                        j10 = c1652h3.f9251c;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V111110 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1409c116 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g116, ((C9169u) interfaceC5312g0M16704V111110.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f1114 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                    C7886b c7886b116 = InterfaceC7885a.a.f42991c;
                    composerImplMo1636j.mo1622c(733328855);
                    interfaceC5652pM1499d = BoxKt.m1499d(c7886b116, false, composerImplMo1636j);
                    composerImplMo1636j.mo1622c(-1323940314);
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                    composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c116);
                    if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(interfaceC2041a2);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    composerImplMo1636j.f2933x = false;
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    composerImplMo1636j.mo1626e();
                    composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                    composerImplMo1636j.mo1622c(2058660585);
                    composerImplMo1636j.mo1622c(-2137368960);
                    composerImplMo1636j.mo1622c(1428615496);
                    composerImplMo1636j.mo1622c(613133646);
                    if (z13) {
                        j11 = c1652h3.f9250b;
                    } else {
                        j11 = c1652h3.f9252d;
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V111111 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                    composerImplMo1636j.m1609Q(false);
                    CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V111111.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b5 = interfaceC0500b4;
                    z14 = z13;
                    c1652h4 = c1652h3;
                }
                interfaceC9612j3 = interfaceC9612j2;
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        IconButtonKt.m1565a(interfaceC2041a, interfaceC0500b5, z14, c1652h4, interfaceC9612j3, interfaceC2056p, interfaceC0476a2, i10 | 1, i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i17 = 196608;
            i12 |= i17;
            if ((374491 & i12) == 74898) {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        composerImplMo1636j.mo1622c(999008085);
                        long j111111111110 = C9169u.f47702e;
                        long j111111111111 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        long jM17496b111110 = C9169u.m17496b(j111111111111, 0.38f);
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11111116 = ComposerKt.f3003a;
                        C1652h c1652h111114 = new C1652h(j111111111110, j111111111111, j111111111110, jM17496b111110);
                        composerImplMo1636j.m1609Q(false);
                        i12 &= -7169;
                        c1652h2 = c1652h111114;
                    }
                    if (i15 != 0) {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new C9613k();
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                    } else {
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                    }
                } else {
                    if (i19 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        composerImplMo1636j.mo1622c(999008085);
                        long j111111111112 = C9169u.f47702e;
                        long j111111111113 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        long jM17496b111111 = C9169u.m17496b(j111111111113, 0.38f);
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11111117 = ComposerKt.f3003a;
                        C1652h c1652h111115 = new C1652h(j111111111112, j111111111113, j111111111112, jM17496b111111);
                        composerImplMo1636j.m1609Q(false);
                        i12 &= -7169;
                        c1652h2 = c1652h111115;
                    }
                    if (i15 != 0) {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new C9613k();
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                    } else {
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                    }
                }
                c1652h3 = c1652h2;
                z13 = z12;
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11111118 = ComposerKt.f3003a;
                C5304d1 c5304d117 = TouchTargetKt.f2854a;
                C5207g.m11111f(interfaceC0500b4, "<this>");
                InterfaceC0500b interfaceC0500bM1927a117 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                float f1115 = C5006g.f32673a;
                InterfaceC0500b interfaceC0500bM1510g117 = SizeKt.m1510g(interfaceC0500bM1927a117, f1115);
                c1652h3.getClass();
                composerImplMo1636j.mo1622c(1876083926);
                if (z13) {
                    j10 = c1652h3.f9249a;
                } else {
                    j10 = c1652h3.f9251c;
                }
                InterfaceC5312g0 interfaceC5312g0M16704V111112 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                composerImplMo1636j.m1609Q(false);
                InterfaceC0500b interfaceC0500bM1409c117 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g117, ((C9169u) interfaceC5312g0M16704V111112.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f1115 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                C7886b c7886b117 = InterfaceC7885a.a.f42991c;
                composerImplMo1636j.mo1622c(733328855);
                interfaceC5652pM1499d = BoxKt.m1499d(c7886b117, false, composerImplMo1636j);
                composerImplMo1636j.mo1622c(-1323940314);
                interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c117);
                if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.mo1640l();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(interfaceC2041a2);
                } else {
                    composerImplMo1636j.mo1653s();
                }
                composerImplMo1636j.f2933x = false;
                C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                composerImplMo1636j.mo1626e();
                composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                composerImplMo1636j.mo1622c(2058660585);
                composerImplMo1636j.mo1622c(-2137368960);
                composerImplMo1636j.mo1622c(1428615496);
                composerImplMo1636j.mo1622c(613133646);
                if (z13) {
                    j11 = c1652h3.f9250b;
                } else {
                    j11 = c1652h3.f9252d;
                }
                InterfaceC5312g0 interfaceC5312g0M16704V111113 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                composerImplMo1636j.m1609Q(false);
                CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V111113.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                interfaceC0500b5 = interfaceC0500b4;
                z14 = z13;
                c1652h4 = c1652h3;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        composerImplMo1636j.mo1622c(999008085);
                        long j111111111114 = C9169u.f47702e;
                        long j111111111115 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        long jM17496b111112 = C9169u.m17496b(j111111111115, 0.38f);
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11111119 = ComposerKt.f3003a;
                        C1652h c1652h111116 = new C1652h(j111111111114, j111111111115, j111111111114, jM17496b111112);
                        composerImplMo1636j.m1609Q(false);
                        i12 &= -7169;
                        c1652h2 = c1652h111116;
                    }
                    if (i15 != 0) {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new C9613k();
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                    } else {
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                    }
                } else {
                    if (i19 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        composerImplMo1636j.mo1622c(999008085);
                        long j111111111116 = C9169u.f47702e;
                        long j111111111117 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        long jM17496b111113 = C9169u.m17496b(j111111111117, 0.38f);
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111111110 = ComposerKt.f3003a;
                        C1652h c1652h111117 = new C1652h(j111111111116, j111111111117, j111111111116, jM17496b111113);
                        composerImplMo1636j.m1609Q(false);
                        i12 &= -7169;
                        c1652h2 = c1652h111117;
                    }
                    if (i15 != 0) {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new C9613k();
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                    } else {
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                    }
                }
                c1652h3 = c1652h2;
                z13 = z12;
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111111111 = ComposerKt.f3003a;
                C5304d1 c5304d118 = TouchTargetKt.f2854a;
                C5207g.m11111f(interfaceC0500b4, "<this>");
                InterfaceC0500b interfaceC0500bM1927a118 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                float f1116 = C5006g.f32673a;
                InterfaceC0500b interfaceC0500bM1510g118 = SizeKt.m1510g(interfaceC0500bM1927a118, f1116);
                c1652h3.getClass();
                composerImplMo1636j.mo1622c(1876083926);
                if (z13) {
                    j10 = c1652h3.f9249a;
                } else {
                    j10 = c1652h3.f9251c;
                }
                InterfaceC5312g0 interfaceC5312g0M16704V111114 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                composerImplMo1636j.m1609Q(false);
                InterfaceC0500b interfaceC0500bM1409c118 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g118, ((C9169u) interfaceC5312g0M16704V111114.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f1116 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                C7886b c7886b118 = InterfaceC7885a.a.f42991c;
                composerImplMo1636j.mo1622c(733328855);
                interfaceC5652pM1499d = BoxKt.m1499d(c7886b118, false, composerImplMo1636j);
                composerImplMo1636j.mo1622c(-1323940314);
                interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c118);
                if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.mo1640l();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(interfaceC2041a2);
                } else {
                    composerImplMo1636j.mo1653s();
                }
                composerImplMo1636j.f2933x = false;
                C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                composerImplMo1636j.mo1626e();
                composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                composerImplMo1636j.mo1622c(2058660585);
                composerImplMo1636j.mo1622c(-2137368960);
                composerImplMo1636j.mo1622c(1428615496);
                composerImplMo1636j.mo1622c(613133646);
                if (z13) {
                    j11 = c1652h3.f9250b;
                } else {
                    j11 = c1652h3.f9252d;
                }
                InterfaceC5312g0 interfaceC5312g0M16704V111115 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                composerImplMo1636j.m1609Q(false);
                CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V111115.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                interfaceC0500b5 = interfaceC0500b4;
                z14 = z13;
                c1652h4 = c1652h3;
            }
            interfaceC9612j3 = interfaceC9612j2;
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    IconButtonKt.m1565a(interfaceC2041a, interfaceC0500b5, z14, c1652h4, interfaceC9612j3, interfaceC2056p, interfaceC0476a2, i10 | 1, i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 24576;
        interfaceC9612j2 = interfaceC9612j;
        if ((i11 & 32) != 0) {
            if ((458752 & i10) == 0) {
                if (composerImplMo1636j.mo1665y(interfaceC2056p)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
            }
            if ((374491 & i12) == 74898) {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        composerImplMo1636j.mo1622c(999008085);
                        long j111111111118 = C9169u.f47702e;
                        long j111111111119 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        long jM17496b111114 = C9169u.m17496b(j111111111119, 0.38f);
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111111112 = ComposerKt.f3003a;
                        C1652h c1652h111118 = new C1652h(j111111111118, j111111111119, j111111111118, jM17496b111114);
                        composerImplMo1636j.m1609Q(false);
                        i12 &= -7169;
                        c1652h2 = c1652h111118;
                    }
                    if (i15 != 0) {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new C9613k();
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                    } else {
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                    }
                } else {
                    if (i19 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        composerImplMo1636j.mo1622c(999008085);
                        long j1111111111110 = C9169u.f47702e;
                        long j1111111111111 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        long jM17496b111115 = C9169u.m17496b(j1111111111111, 0.38f);
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111111113 = ComposerKt.f3003a;
                        C1652h c1652h111119 = new C1652h(j1111111111110, j1111111111111, j1111111111110, jM17496b111115);
                        composerImplMo1636j.m1609Q(false);
                        i12 &= -7169;
                        c1652h2 = c1652h111119;
                    }
                    if (i15 != 0) {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new C9613k();
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                    } else {
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                    }
                }
                c1652h3 = c1652h2;
                z13 = z12;
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111111114 = ComposerKt.f3003a;
                C5304d1 c5304d119 = TouchTargetKt.f2854a;
                C5207g.m11111f(interfaceC0500b4, "<this>");
                InterfaceC0500b interfaceC0500bM1927a119 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                float f1117 = C5006g.f32673a;
                InterfaceC0500b interfaceC0500bM1510g119 = SizeKt.m1510g(interfaceC0500bM1927a119, f1117);
                c1652h3.getClass();
                composerImplMo1636j.mo1622c(1876083926);
                if (z13) {
                    j10 = c1652h3.f9249a;
                } else {
                    j10 = c1652h3.f9251c;
                }
                InterfaceC5312g0 interfaceC5312g0M16704V111116 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                composerImplMo1636j.m1609Q(false);
                InterfaceC0500b interfaceC0500bM1409c119 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g119, ((C9169u) interfaceC5312g0M16704V111116.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f1117 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                C7886b c7886b119 = InterfaceC7885a.a.f42991c;
                composerImplMo1636j.mo1622c(733328855);
                interfaceC5652pM1499d = BoxKt.m1499d(c7886b119, false, composerImplMo1636j);
                composerImplMo1636j.mo1622c(-1323940314);
                interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c119);
                if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.mo1640l();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(interfaceC2041a2);
                } else {
                    composerImplMo1636j.mo1653s();
                }
                composerImplMo1636j.f2933x = false;
                C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                composerImplMo1636j.mo1626e();
                composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                composerImplMo1636j.mo1622c(2058660585);
                composerImplMo1636j.mo1622c(-2137368960);
                composerImplMo1636j.mo1622c(1428615496);
                composerImplMo1636j.mo1622c(613133646);
                if (z13) {
                    j11 = c1652h3.f9250b;
                } else {
                    j11 = c1652h3.f9252d;
                }
                InterfaceC5312g0 interfaceC5312g0M16704V111117 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                composerImplMo1636j.m1609Q(false);
                CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V111117.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                interfaceC0500b5 = interfaceC0500b4;
                z14 = z13;
                c1652h4 = c1652h3;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        composerImplMo1636j.mo1622c(999008085);
                        long j1111111111112 = C9169u.f47702e;
                        long j1111111111113 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        long jM17496b111116 = C9169u.m17496b(j1111111111113, 0.38f);
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111111115 = ComposerKt.f3003a;
                        C1652h c1652h1111110 = new C1652h(j1111111111112, j1111111111113, j1111111111112, jM17496b111116);
                        composerImplMo1636j.m1609Q(false);
                        i12 &= -7169;
                        c1652h2 = c1652h1111110;
                    }
                    if (i15 != 0) {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new C9613k();
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                    } else {
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                    }
                } else {
                    if (i19 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        composerImplMo1636j.mo1622c(999008085);
                        long j1111111111114 = C9169u.f47702e;
                        long j1111111111115 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        long jM17496b111117 = C9169u.m17496b(j1111111111115, 0.38f);
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111111116 = ComposerKt.f3003a;
                        C1652h c1652h1111111 = new C1652h(j1111111111114, j1111111111115, j1111111111114, jM17496b111117);
                        composerImplMo1636j.m1609Q(false);
                        i12 &= -7169;
                        c1652h2 = c1652h1111111;
                    }
                    if (i15 != 0) {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new C9613k();
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                    } else {
                        i18 = i12;
                        interfaceC0500b4 = interfaceC0500b3;
                    }
                }
                c1652h3 = c1652h2;
                z13 = z12;
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111111117 = ComposerKt.f3003a;
                C5304d1 c5304d1110 = TouchTargetKt.f2854a;
                C5207g.m11111f(interfaceC0500b4, "<this>");
                InterfaceC0500b interfaceC0500bM1927a1110 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
                float f1118 = C5006g.f32673a;
                InterfaceC0500b interfaceC0500bM1510g1110 = SizeKt.m1510g(interfaceC0500bM1927a1110, f1118);
                c1652h3.getClass();
                composerImplMo1636j.mo1622c(1876083926);
                if (z13) {
                    j10 = c1652h3.f9249a;
                } else {
                    j10 = c1652h3.f9251c;
                }
                InterfaceC5312g0 interfaceC5312g0M16704V111118 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
                composerImplMo1636j.m1609Q(false);
                InterfaceC0500b interfaceC0500bM1409c1110 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g1110, ((C9169u) interfaceC5312g0M16704V111118.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f1118 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
                C7886b c7886b1110 = InterfaceC7885a.a.f42991c;
                composerImplMo1636j.mo1622c(733328855);
                interfaceC5652pM1499d = BoxKt.m1499d(c7886b1110, false, composerImplMo1636j);
                composerImplMo1636j.mo1622c(-1323940314);
                interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c1110);
                if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.mo1640l();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(interfaceC2041a2);
                } else {
                    composerImplMo1636j.mo1653s();
                }
                composerImplMo1636j.f2933x = false;
                C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                composerImplMo1636j.mo1626e();
                composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                composerImplMo1636j.mo1622c(2058660585);
                composerImplMo1636j.mo1622c(-2137368960);
                composerImplMo1636j.mo1622c(1428615496);
                composerImplMo1636j.mo1622c(613133646);
                if (z13) {
                    j11 = c1652h3.f9250b;
                } else {
                    j11 = c1652h3.f9252d;
                }
                InterfaceC5312g0 interfaceC5312g0M16704V111119 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
                composerImplMo1636j.m1609Q(false);
                CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V111119.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                interfaceC0500b5 = interfaceC0500b4;
                z14 = z13;
                c1652h4 = c1652h3;
            }
            interfaceC9612j3 = interfaceC9612j2;
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    IconButtonKt.m1565a(interfaceC2041a, interfaceC0500b5, z14, c1652h4, interfaceC9612j3, interfaceC2056p, interfaceC0476a2, i10 | 1, i11);
                    return C9072e.f47360a;
                }
            };
        }
        i17 = 196608;
        i12 |= i17;
        if ((374491 & i12) == 74898) {
            composerImplMo1636j.m1654s0();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b3 = interfaceC0500b2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z10;
                }
                if ((i11 & 8) != 0) {
                    composerImplMo1636j.mo1622c(999008085);
                    long j1111111111116 = C9169u.f47702e;
                    long j1111111111117 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                    long jM17496b111118 = C9169u.m17496b(j1111111111117, 0.38f);
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111111118 = ComposerKt.f3003a;
                    C1652h c1652h1111112 = new C1652h(j1111111111116, j1111111111117, j1111111111116, jM17496b111118);
                    composerImplMo1636j.m1609Q(false);
                    i12 &= -7169;
                    c1652h2 = c1652h1111112;
                }
                if (i15 != 0) {
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                        objM1619a0 = new C9613k();
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    i18 = i12;
                    interfaceC0500b4 = interfaceC0500b3;
                    interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                } else {
                    i18 = i12;
                    interfaceC0500b4 = interfaceC0500b3;
                }
            } else {
                if (i19 != 0) {
                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b3 = interfaceC0500b2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z10;
                }
                if ((i11 & 8) != 0) {
                    composerImplMo1636j.mo1622c(999008085);
                    long j1111111111118 = C9169u.f47702e;
                    long j1111111111119 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                    long jM17496b111119 = C9169u.m17496b(j1111111111119, 0.38f);
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111111119 = ComposerKt.f3003a;
                    C1652h c1652h1111113 = new C1652h(j1111111111118, j1111111111119, j1111111111118, jM17496b111119);
                    composerImplMo1636j.m1609Q(false);
                    i12 &= -7169;
                    c1652h2 = c1652h1111113;
                }
                if (i15 != 0) {
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                        objM1619a0 = new C9613k();
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    i18 = i12;
                    interfaceC0500b4 = interfaceC0500b3;
                    interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                } else {
                    i18 = i12;
                    interfaceC0500b4 = interfaceC0500b3;
                }
            }
            c1652h3 = c1652h2;
            z13 = z12;
            composerImplMo1636j.m1610R();
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111111110 = ComposerKt.f3003a;
            C5304d1 c5304d1111 = TouchTargetKt.f2854a;
            C5207g.m11111f(interfaceC0500b4, "<this>");
            InterfaceC0500b interfaceC0500bM1927a1111 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
            float f1119 = C5006g.f32673a;
            InterfaceC0500b interfaceC0500bM1510g1111 = SizeKt.m1510g(interfaceC0500bM1927a1111, f1119);
            c1652h3.getClass();
            composerImplMo1636j.mo1622c(1876083926);
            if (z13) {
                j10 = c1652h3.f9249a;
            } else {
                j10 = c1652h3.f9251c;
            }
            InterfaceC5312g0 interfaceC5312g0M16704V1111110 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
            composerImplMo1636j.m1609Q(false);
            InterfaceC0500b interfaceC0500bM1409c1111 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g1111, ((C9169u) interfaceC5312g0M16704V1111110.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f1119 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
            C7886b c7886b1111 = InterfaceC7885a.a.f42991c;
            composerImplMo1636j.mo1622c(733328855);
            interfaceC5652pM1499d = BoxKt.m1499d(c7886b1111, false, composerImplMo1636j);
            composerImplMo1636j.mo1622c(-1323940314);
            interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
            layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
            interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
            ComposeUiNode.f3726n.getClass();
            interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
            composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c1111);
            if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                C8573r0.m16771y0();
                throw null;
            }
            composerImplMo1636j.mo1640l();
            if (composerImplMo1636j.f2897L) {
                composerImplMo1636j.mo1634i(interfaceC2041a2);
            } else {
                composerImplMo1636j.mo1653s();
            }
            composerImplMo1636j.f2933x = false;
            C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
            C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
            composerImplMo1636j.mo1626e();
            composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
            composerImplMo1636j.mo1622c(2058660585);
            composerImplMo1636j.mo1622c(-2137368960);
            composerImplMo1636j.mo1622c(1428615496);
            composerImplMo1636j.mo1622c(613133646);
            if (z13) {
                j11 = c1652h3.f9250b;
            } else {
                j11 = c1652h3.f9252d;
            }
            InterfaceC5312g0 interfaceC5312g0M16704V1111111 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
            composerImplMo1636j.m1609Q(false);
            CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V1111111.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(true);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(false);
            interfaceC0500b5 = interfaceC0500b4;
            z14 = z13;
            c1652h4 = c1652h3;
        } else {
            composerImplMo1636j.m1654s0();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b3 = interfaceC0500b2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z10;
                }
                if ((i11 & 8) != 0) {
                    composerImplMo1636j.mo1622c(999008085);
                    long j11111111111110 = C9169u.f47702e;
                    long j11111111111111 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                    long jM17496b1111110 = C9169u.m17496b(j11111111111111, 0.38f);
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111111111 = ComposerKt.f3003a;
                    C1652h c1652h1111114 = new C1652h(j11111111111110, j11111111111111, j11111111111110, jM17496b1111110);
                    composerImplMo1636j.m1609Q(false);
                    i12 &= -7169;
                    c1652h2 = c1652h1111114;
                }
                if (i15 != 0) {
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                        objM1619a0 = new C9613k();
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    i18 = i12;
                    interfaceC0500b4 = interfaceC0500b3;
                    interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                } else {
                    i18 = i12;
                    interfaceC0500b4 = interfaceC0500b3;
                }
            } else {
                if (i19 != 0) {
                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b3 = interfaceC0500b2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z10;
                }
                if ((i11 & 8) != 0) {
                    composerImplMo1636j.mo1622c(999008085);
                    long j11111111111112 = C9169u.f47702e;
                    long j11111111111113 = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                    long jM17496b1111111 = C9169u.m17496b(j11111111111113, 0.38f);
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111111112 = ComposerKt.f3003a;
                    C1652h c1652h1111115 = new C1652h(j11111111111112, j11111111111113, j11111111111112, jM17496b1111111);
                    composerImplMo1636j.m1609Q(false);
                    i12 &= -7169;
                    c1652h2 = c1652h1111115;
                }
                if (i15 != 0) {
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                        objM1619a0 = new C9613k();
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    i18 = i12;
                    interfaceC0500b4 = interfaceC0500b3;
                    interfaceC9612j2 = (InterfaceC9612j) objM1619a0;
                } else {
                    i18 = i12;
                    interfaceC0500b4 = interfaceC0500b3;
                }
            }
            c1652h3 = c1652h2;
            z13 = z12;
            composerImplMo1636j.m1610R();
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111111113 = ComposerKt.f3003a;
            C5304d1 c5304d1112 = TouchTargetKt.f2854a;
            C5207g.m11111f(interfaceC0500b4, "<this>");
            InterfaceC0500b interfaceC0500bM1927a1112 = ComposedModifierKt.m1927a(interfaceC0500b4, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b);
            float f11110 = C5006g.f32673a;
            InterfaceC0500b interfaceC0500bM1510g1112 = SizeKt.m1510g(interfaceC0500bM1927a1112, f11110);
            c1652h3.getClass();
            composerImplMo1636j.mo1622c(1876083926);
            if (z13) {
                j10 = c1652h3.f9249a;
            } else {
                j10 = c1652h3.f9251c;
            }
            InterfaceC5312g0 interfaceC5312g0M16704V1111112 = C8573r0.m16704V0(new C9169u(j10), composerImplMo1636j);
            composerImplMo1636j.m1609Q(false);
            InterfaceC0500b interfaceC0500bM1409c1112 = ClickableKt.m1409c(C0062b.m309T(interfaceC0500bM1510g1112, ((C9169u) interfaceC5312g0M16704V1111112.getValue()).f47705a, C9144f0.f47650a), interfaceC9612j2, C1284i.m4789a(f11110 / 2, composerImplMo1636j, 54, 4), z13, new C6569g(0), interfaceC2041a, 8);
            C7886b c7886b1112 = InterfaceC7885a.a.f42991c;
            composerImplMo1636j.mo1622c(733328855);
            interfaceC5652pM1499d = BoxKt.m1499d(c7886b1112, false, composerImplMo1636j);
            composerImplMo1636j.mo1622c(-1323940314);
            interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
            layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
            interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
            ComposeUiNode.f3726n.getClass();
            interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
            composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c1112);
            if (composerImplMo1636j.f2910a instanceof InterfaceC5299c) {
                C8573r0.m16771y0();
                throw null;
            }
            composerImplMo1636j.mo1640l();
            if (composerImplMo1636j.f2897L) {
                composerImplMo1636j.mo1634i(interfaceC2041a2);
            } else {
                composerImplMo1636j.mo1653s();
            }
            composerImplMo1636j.f2933x = false;
            C8573r0.m16714a1(composerImplMo1636j, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
            C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
            composerImplMo1636j.mo1626e();
            composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
            composerImplMo1636j.mo1622c(2058660585);
            composerImplMo1636j.mo1622c(-2137368960);
            composerImplMo1636j.mo1622c(1428615496);
            composerImplMo1636j.mo1622c(613133646);
            if (z13) {
                j11 = c1652h3.f9250b;
            } else {
                j11 = c1652h3.f9252d;
            }
            InterfaceC5312g0 interfaceC5312g0M16704V1111113 = C8573r0.m16704V0(new C9169u(j11), composerImplMo1636j);
            composerImplMo1636j.m1609Q(false);
            CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(((C9169u) interfaceC5312g0M16704V1111113.getValue()).f47705a))}, interfaceC2056p, composerImplMo1636j, ((i18 >> 12) & 112) | 8);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(true);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(false);
            interfaceC0500b5 = interfaceC0500b4;
            z14 = z13;
            c1652h4 = c1652h3;
        }
        interfaceC9612j3 = interfaceC9612j2;
        c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                IconButtonKt.m1565a(interfaceC2041a, interfaceC0500b5, z14, c1652h4, interfaceC9612j3, interfaceC2056p, interfaceC0476a2, i10 | 1, i11);
                return C9072e.f47360a;
            }
        };
    }
}
