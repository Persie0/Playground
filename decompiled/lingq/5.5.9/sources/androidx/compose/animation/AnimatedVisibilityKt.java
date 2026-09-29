package androidx.compose.animation;

import androidx.compose.animation.core.C0372d;
import androidx.compose.animation.core.Transition;
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
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import p081e0.C5332q0;
import p081e0.C5333r;
import p081e0.C5340u0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5336s0;
import p127g1.InterfaceC5652p;
import p338qd.C8573r0;
import p350r.AbstractC8670d;
import p350r.AbstractC8672f;
import p350r.C8668b;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatedVisibilityKt {
    /* JADX INFO: renamed from: a */
    public static final <T> void m1333a(final Transition<T> transition, final InterfaceC2052l<? super T, Boolean> interfaceC2052l, final InterfaceC0500b interfaceC0500b, final AbstractC8670d abstractC8670d, final AbstractC8672f abstractC8672f, final InterfaceC2057q<? super AnimatedVisibilityScope, ? super InterfaceC0476a, ? super Integer, C9072e> interfaceC2057q, InterfaceC0476a interfaceC0476a, final int i10) {
        int i11;
        boolean z10;
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(808253933);
        if ((i10 & 14) == 0) {
            i11 = (composerImplMo1636j.mo1665y(transition) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerImplMo1636j.mo1665y(interfaceC2052l) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerImplMo1636j.mo1665y(interfaceC0500b) ? 256 : BuildConfig.SDK_TRUNCATE_LENGTH;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerImplMo1636j.mo1665y(abstractC8670d) ? 2048 : 1024;
        }
        if ((i10 & 57344) == 0) {
            i11 |= composerImplMo1636j.mo1665y(abstractC8672f) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerImplMo1636j.mo1665y(interfaceC2057q) ? 131072 : 65536;
        }
        if ((374491 & i11) == 74898 && composerImplMo1636j.mo1642m()) {
            composerImplMo1636j.mo1650q();
        } else {
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
            int i12 = i11 & 14;
            composerImplMo1636j.mo1622c(1157296644);
            boolean zMo1665y = composerImplMo1636j.mo1665y(transition);
            Object objM1619a0 = composerImplMo1636j.m1619a0();
            InterfaceC0476a.a.C10586a c10586a = InterfaceC0476a.a.f3122a;
            if (zMo1665y || objM1619a0 == c10586a) {
                objM1619a0 = C8573r0.m16684L0(interfaceC2052l.mo528n(transition.m1362b()));
                composerImplMo1636j.m1597F0(objM1619a0);
            }
            composerImplMo1636j.m1609Q(false);
            InterfaceC5312g0 interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
            if (interfaceC2052l.mo528n(transition.m1364d()).booleanValue() || ((Boolean) interfaceC5312g0.getValue()).booleanValue() || transition.m1365e()) {
                int i13 = i12 | 48;
                composerImplMo1636j.mo1622c(1215497572);
                int i14 = i13 & 14;
                composerImplMo1636j.mo1622c(1157296644);
                boolean zMo1665y2 = composerImplMo1636j.mo1665y(transition);
                Object objM1619a1 = composerImplMo1636j.m1619a0();
                if (zMo1665y2 || objM1619a1 == c10586a) {
                    objM1619a1 = transition.m1362b();
                    composerImplMo1636j.m1597F0(objM1619a1);
                }
                composerImplMo1636j.m1609Q(false);
                if (transition.m1365e()) {
                    objM1619a1 = transition.m1362b();
                }
                composerImplMo1636j.mo1622c(-1220581778);
                EnterExitState enterExitStateM1335c = m1335c(transition, interfaceC2052l, objM1619a1, composerImplMo1636j);
                composerImplMo1636j.m1609Q(false);
                T tM1364d = transition.m1364d();
                composerImplMo1636j.mo1622c(-1220581778);
                EnterExitState enterExitStateM1335c2 = m1335c(transition, interfaceC2052l, tM1364d, composerImplMo1636j);
                composerImplMo1636j.m1609Q(false);
                Transition transitionM1389a = C0372d.m1389a(transition, enterExitStateM1335c, enterExitStateM1335c2, composerImplMo1636j, ((i13 << 6) & 7168) | i14);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.mo1622c(511388516);
                boolean zMo1665y3 = composerImplMo1636j.mo1665y(transitionM1389a) | composerImplMo1636j.mo1665y(interfaceC5312g0);
                Object objM1619a2 = composerImplMo1636j.m1619a0();
                if (zMo1665y3 || objM1619a2 == c10586a) {
                    objM1619a2 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(transitionM1389a, interfaceC5312g0, null);
                    composerImplMo1636j.m1597F0(objM1619a2);
                }
                composerImplMo1636j.m1609Q(false);
                C5333r.m11460b(transitionM1389a, (InterfaceC2056p) objM1619a2, composerImplMo1636j);
                int i15 = i11 >> 3;
                int i16 = (i15 & 57344) | (i15 & 112) | (i15 & 896) | (i15 & 7168);
                composerImplMo1636j.mo1622c(-1967270694);
                Object objM1362b = transitionM1389a.m1362b();
                EnterExitState enterExitState = EnterExitState.Visible;
                if (objM1362b == enterExitState || transitionM1389a.m1364d() == enterExitState) {
                    int i17 = i16 & 14;
                    composerImplMo1636j.mo1622c(1157296644);
                    boolean zMo1665y4 = composerImplMo1636j.mo1665y(transitionM1389a);
                    Object objM1619a3 = composerImplMo1636j.m1619a0();
                    if (zMo1665y4 || objM1619a3 == c10586a) {
                        objM1619a3 = new C8668b(transitionM1389a);
                        composerImplMo1636j.m1597F0(objM1619a3);
                    }
                    composerImplMo1636j.m1609Q(false);
                    C8668b c8668b = (C8668b) objM1619a3;
                    int i18 = i16 >> 3;
                    z10 = false;
                    InterfaceC0500b interfaceC0500bMo1929K = interfaceC0500b.mo1929K(EnterExitTransitionKt.m1344a(transitionM1389a, abstractC8670d, abstractC8672f, "Built-in", composerImplMo1636j, i17 | 3072 | (i18 & 112) | (i18 & 896)));
                    composerImplMo1636j.mo1622c(-492369756);
                    Object objM1619a4 = composerImplMo1636j.m1619a0();
                    if (objM1619a4 == c10586a) {
                        objM1619a4 = new AnimatedEnterExitMeasurePolicy(c8668b);
                        composerImplMo1636j.m1597F0(objM1619a4);
                    }
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC5652p interfaceC5652p = (InterfaceC5652p) objM1619a4;
                    composerImplMo1636j.mo1622c(-1323940314);
                    InterfaceC10015c interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    LayoutDirection layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    ComposeUiNode.f3726n.getClass();
                    InterfaceC2041a<ComposeUiNode> interfaceC2041a = ComposeUiNode.Companion.f3728b;
                    ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bMo1929K);
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
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC5652p, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    composerImplMo1636j.mo1626e();
                    composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                    composerImplMo1636j.mo1622c(2058660585);
                    interfaceC2057q.mo1343M(c8668b, composerImplMo1636j, Integer.valueOf(((i16 >> 9) & 112) | 8));
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                } else {
                    z10 = false;
                }
                composerImplMo1636j.m1609Q(z10);
            }
        }
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                AnimatedVisibilityKt.m1333a(transition, interfaceC2052l, interfaceC0500b, abstractC8670d, abstractC8672f, interfaceC2057q, interfaceC0476a2, i10 | 1);
                return C9072e.f47360a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:76:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x0107  */
    /* JADX WARN: Code duplicated, block: B:85:0x010b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0145  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m1334b(final boolean z10, InterfaceC0500b interfaceC0500b, AbstractC8670d abstractC8670d, AbstractC8672f abstractC8672f, String str, final InterfaceC2057q<? super AnimatedVisibilityScope, ? super InterfaceC0476a, ? super Integer, C9072e> interfaceC2057q, InterfaceC0476a interfaceC0476a, final int i10, final int i11) {
        int i12;
        final InterfaceC0500b interfaceC0500b2;
        int i13;
        AbstractC8670d abstractC8670d2;
        int i14;
        int i15;
        AbstractC8672f abstractC8672f2;
        int i16;
        int i17;
        String str2;
        int i18;
        int i19;
        InterfaceC0500b interfaceC0500b3;
        AbstractC8670d abstractC8670dM16926b;
        AbstractC8672f abstractC8672fM16928b;
        final AbstractC8670d abstractC8670d3;
        final AbstractC8672f abstractC8672f3;
        final String str3;
        C5332q0 c5332q0M1612T;
        C5207g.m11111f(interfaceC2057q, "content");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(2088733774);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerImplMo1636j.m1598G(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 112) == 0) {
                interfaceC0500b2 = interfaceC0500b;
                i12 |= composerImplMo1636j.mo1665y(interfaceC0500b2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    abstractC8670d2 = abstractC8670d;
                    if (composerImplMo1636j.mo1665y(abstractC8670d2)) {
                        i14 = 256;
                    } else {
                        i14 = BuildConfig.SDK_TRUNCATE_LENGTH;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        abstractC8672f2 = abstractC8672f;
                        if (composerImplMo1636j.mo1665y(abstractC8672f2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 57344) == 0) {
                            str2 = str;
                            if (composerImplMo1636j.mo1665y(str2)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((i11 & 32) != 0) {
                            if ((i10 & 458752) == 0) {
                                if (composerImplMo1636j.mo1665y(interfaceC2057q)) {
                                    i19 = 131072;
                                } else {
                                    i19 = 65536;
                                }
                            }
                            if ((374491 & i12) == 74898 || !composerImplMo1636j.mo1642m()) {
                                if (i20 != 0) {
                                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                                } else {
                                    interfaceC0500b3 = interfaceC0500b2;
                                }
                                if (i13 != 0) {
                                    abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                                } else {
                                    abstractC8670dM16926b = abstractC8670d2;
                                }
                                if (i15 != 0) {
                                    abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                                } else {
                                    abstractC8672fM16928b = abstractC8672f2;
                                }
                                if (i17 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                                int i21 = i12 << 3;
                                int i22 = (i21 & 57344) | (i21 & 896) | 48 | (i21 & 7168) | (i12 & 458752);
                                interfaceC0500b2 = interfaceC0500b3;
                                abstractC8670d3 = abstractC8670dM16926b;
                                abstractC8672f3 = abstractC8672fM16928b;
                                m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final Boolean mo528n(Boolean bool) {
                                        return Boolean.valueOf(bool.booleanValue());
                                    }
                                }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i22);
                            } else {
                                composerImplMo1636j.mo1650q();
                                abstractC8670d3 = abstractC8670d2;
                                abstractC8672f3 = abstractC8672f2;
                            }
                            str3 = str2;
                            c5332q0M1612T = composerImplMo1636j.m1612T();
                            if (c5332q0M1612T == null) {
                                return;
                            }
                            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                    num.intValue();
                                    AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                                    return C9072e.f47360a;
                                }
                            };
                        }
                        i19 = 196608;
                        i12 |= i19;
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                            } else {
                                abstractC8670dM16926b = abstractC8670d2;
                            }
                            if (i15 != 0) {
                                abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                            } else {
                                abstractC8672fM16928b = abstractC8672f2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                            int i23 = i12 << 3;
                            int i24 = (i23 & 57344) | (i23 & 896) | 48 | (i23 & 7168) | (i12 & 458752);
                            interfaceC0500b2 = interfaceC0500b3;
                            abstractC8670d3 = abstractC8670dM16926b;
                            abstractC8672f3 = abstractC8672fM16928b;
                            m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final Boolean mo528n(Boolean bool) {
                                    return Boolean.valueOf(bool.booleanValue());
                                }
                            }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i24);
                        } else {
                            if (i20 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                            } else {
                                abstractC8670dM16926b = abstractC8670d2;
                            }
                            if (i15 != 0) {
                                abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                            } else {
                                abstractC8672fM16928b = abstractC8672f2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                            int i25 = i12 << 3;
                            int i26 = (i25 & 57344) | (i25 & 896) | 48 | (i25 & 7168) | (i12 & 458752);
                            interfaceC0500b2 = interfaceC0500b3;
                            abstractC8670d3 = abstractC8670dM16926b;
                            abstractC8672f3 = abstractC8672fM16928b;
                            m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final Boolean mo528n(Boolean bool) {
                                    return Boolean.valueOf(bool.booleanValue());
                                }
                            }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i26);
                        }
                        str3 = str2;
                        c5332q0M1612T = composerImplMo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                num.intValue();
                                AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i12 |= 24576;
                    str2 = str;
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (composerImplMo1636j.mo1665y(interfaceC2057q)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                            } else {
                                abstractC8670dM16926b = abstractC8670d2;
                            }
                            if (i15 != 0) {
                                abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                            } else {
                                abstractC8672fM16928b = abstractC8672f2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                            int i27 = i12 << 3;
                            int i28 = (i27 & 57344) | (i27 & 896) | 48 | (i27 & 7168) | (i12 & 458752);
                            interfaceC0500b2 = interfaceC0500b3;
                            abstractC8670d3 = abstractC8670dM16926b;
                            abstractC8672f3 = abstractC8672fM16928b;
                            m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final Boolean mo528n(Boolean bool) {
                                    return Boolean.valueOf(bool.booleanValue());
                                }
                            }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i28);
                        } else {
                            if (i20 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                            } else {
                                abstractC8670dM16926b = abstractC8670d2;
                            }
                            if (i15 != 0) {
                                abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                            } else {
                                abstractC8672fM16928b = abstractC8672f2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                            int i29 = i12 << 3;
                            int i210 = (i29 & 57344) | (i29 & 896) | 48 | (i29 & 7168) | (i12 & 458752);
                            interfaceC0500b2 = interfaceC0500b3;
                            abstractC8670d3 = abstractC8670dM16926b;
                            abstractC8672f3 = abstractC8672fM16928b;
                            m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final Boolean mo528n(Boolean bool) {
                                    return Boolean.valueOf(bool.booleanValue());
                                }
                            }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i210);
                        }
                        str3 = str2;
                        c5332q0M1612T = composerImplMo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                num.intValue();
                                AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i19 = 196608;
                    i12 |= i19;
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                        } else {
                            abstractC8670dM16926b = abstractC8670d2;
                        }
                        if (i15 != 0) {
                            abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                        } else {
                            abstractC8672fM16928b = abstractC8672f2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                        int i211 = i12 << 3;
                        int i212 = (i211 & 57344) | (i211 & 896) | 48 | (i211 & 7168) | (i12 & 458752);
                        interfaceC0500b2 = interfaceC0500b3;
                        abstractC8670d3 = abstractC8670dM16926b;
                        abstractC8672f3 = abstractC8672fM16928b;
                        m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final Boolean mo528n(Boolean bool) {
                                return Boolean.valueOf(bool.booleanValue());
                            }
                        }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i212);
                    } else {
                        if (i20 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                        } else {
                            abstractC8670dM16926b = abstractC8670d2;
                        }
                        if (i15 != 0) {
                            abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                        } else {
                            abstractC8672fM16928b = abstractC8672f2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                        int i213 = i12 << 3;
                        int i214 = (i213 & 57344) | (i213 & 896) | 48 | (i213 & 7168) | (i12 & 458752);
                        interfaceC0500b2 = interfaceC0500b3;
                        abstractC8670d3 = abstractC8670dM16926b;
                        abstractC8672f3 = abstractC8672fM16928b;
                        m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final Boolean mo528n(Boolean bool) {
                                return Boolean.valueOf(bool.booleanValue());
                            }
                        }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i214);
                    }
                    str3 = str2;
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i12 |= 3072;
                abstractC8672f2 = abstractC8672f;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        str2 = str;
                        if (composerImplMo1636j.mo1665y(str2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (composerImplMo1636j.mo1665y(interfaceC2057q)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                            } else {
                                abstractC8670dM16926b = abstractC8670d2;
                            }
                            if (i15 != 0) {
                                abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                            } else {
                                abstractC8672fM16928b = abstractC8672f2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q9 = ComposerKt.f3003a;
                            int i215 = i12 << 3;
                            int i216 = (i215 & 57344) | (i215 & 896) | 48 | (i215 & 7168) | (i12 & 458752);
                            interfaceC0500b2 = interfaceC0500b3;
                            abstractC8670d3 = abstractC8670dM16926b;
                            abstractC8672f3 = abstractC8672fM16928b;
                            m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final Boolean mo528n(Boolean bool) {
                                    return Boolean.valueOf(bool.booleanValue());
                                }
                            }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i216);
                        } else {
                            if (i20 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                            } else {
                                abstractC8670dM16926b = abstractC8670d2;
                            }
                            if (i15 != 0) {
                                abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                            } else {
                                abstractC8672fM16928b = abstractC8672f2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q10 = ComposerKt.f3003a;
                            int i217 = i12 << 3;
                            int i218 = (i217 & 57344) | (i217 & 896) | 48 | (i217 & 7168) | (i12 & 458752);
                            interfaceC0500b2 = interfaceC0500b3;
                            abstractC8670d3 = abstractC8670dM16926b;
                            abstractC8672f3 = abstractC8672fM16928b;
                            m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final Boolean mo528n(Boolean bool) {
                                    return Boolean.valueOf(bool.booleanValue());
                                }
                            }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i218);
                        }
                        str3 = str2;
                        c5332q0M1612T = composerImplMo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                num.intValue();
                                AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i19 = 196608;
                    i12 |= i19;
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                        } else {
                            abstractC8670dM16926b = abstractC8670d2;
                        }
                        if (i15 != 0) {
                            abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                        } else {
                            abstractC8672fM16928b = abstractC8672f2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11 = ComposerKt.f3003a;
                        int i219 = i12 << 3;
                        int i2110 = (i219 & 57344) | (i219 & 896) | 48 | (i219 & 7168) | (i12 & 458752);
                        interfaceC0500b2 = interfaceC0500b3;
                        abstractC8670d3 = abstractC8670dM16926b;
                        abstractC8672f3 = abstractC8672fM16928b;
                        m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final Boolean mo528n(Boolean bool) {
                                return Boolean.valueOf(bool.booleanValue());
                            }
                        }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i2110);
                    } else {
                        if (i20 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                        } else {
                            abstractC8670dM16926b = abstractC8670d2;
                        }
                        if (i15 != 0) {
                            abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                        } else {
                            abstractC8672fM16928b = abstractC8672f2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q12 = ComposerKt.f3003a;
                        int i2111 = i12 << 3;
                        int i2112 = (i2111 & 57344) | (i2111 & 896) | 48 | (i2111 & 7168) | (i12 & 458752);
                        interfaceC0500b2 = interfaceC0500b3;
                        abstractC8670d3 = abstractC8670dM16926b;
                        abstractC8672f3 = abstractC8672fM16928b;
                        m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final Boolean mo528n(Boolean bool) {
                                return Boolean.valueOf(bool.booleanValue());
                            }
                        }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i2112);
                    }
                    str3 = str2;
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i12 |= 24576;
                str2 = str;
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerImplMo1636j.mo1665y(interfaceC2057q)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                        } else {
                            abstractC8670dM16926b = abstractC8670d2;
                        }
                        if (i15 != 0) {
                            abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                        } else {
                            abstractC8672fM16928b = abstractC8672f2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q13 = ComposerKt.f3003a;
                        int i2113 = i12 << 3;
                        int i2114 = (i2113 & 57344) | (i2113 & 896) | 48 | (i2113 & 7168) | (i12 & 458752);
                        interfaceC0500b2 = interfaceC0500b3;
                        abstractC8670d3 = abstractC8670dM16926b;
                        abstractC8672f3 = abstractC8672fM16928b;
                        m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final Boolean mo528n(Boolean bool) {
                                return Boolean.valueOf(bool.booleanValue());
                            }
                        }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i2114);
                    } else {
                        if (i20 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                        } else {
                            abstractC8670dM16926b = abstractC8670d2;
                        }
                        if (i15 != 0) {
                            abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                        } else {
                            abstractC8672fM16928b = abstractC8672f2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q14 = ComposerKt.f3003a;
                        int i2115 = i12 << 3;
                        int i2116 = (i2115 & 57344) | (i2115 & 896) | 48 | (i2115 & 7168) | (i12 & 458752);
                        interfaceC0500b2 = interfaceC0500b3;
                        abstractC8670d3 = abstractC8670dM16926b;
                        abstractC8672f3 = abstractC8672fM16928b;
                        m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final Boolean mo528n(Boolean bool) {
                                return Boolean.valueOf(bool.booleanValue());
                            }
                        }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i2116);
                    }
                    str3 = str2;
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i19 = 196608;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                    } else {
                        abstractC8670dM16926b = abstractC8670d2;
                    }
                    if (i15 != 0) {
                        abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                    } else {
                        abstractC8672fM16928b = abstractC8672f2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q15 = ComposerKt.f3003a;
                    int i2117 = i12 << 3;
                    int i2118 = (i2117 & 57344) | (i2117 & 896) | 48 | (i2117 & 7168) | (i12 & 458752);
                    interfaceC0500b2 = interfaceC0500b3;
                    abstractC8670d3 = abstractC8670dM16926b;
                    abstractC8672f3 = abstractC8672fM16928b;
                    m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(Boolean bool) {
                            return Boolean.valueOf(bool.booleanValue());
                        }
                    }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i2118);
                } else {
                    if (i20 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                    } else {
                        abstractC8670dM16926b = abstractC8670d2;
                    }
                    if (i15 != 0) {
                        abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                    } else {
                        abstractC8672fM16928b = abstractC8672f2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q16 = ComposerKt.f3003a;
                    int i2119 = i12 << 3;
                    int i21110 = (i2119 & 57344) | (i2119 & 896) | 48 | (i2119 & 7168) | (i12 & 458752);
                    interfaceC0500b2 = interfaceC0500b3;
                    abstractC8670d3 = abstractC8670dM16926b;
                    abstractC8672f3 = abstractC8672fM16928b;
                    m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(Boolean bool) {
                            return Boolean.valueOf(bool.booleanValue());
                        }
                    }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i21110);
                }
                str3 = str2;
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 384;
            abstractC8670d2 = abstractC8670d;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    abstractC8672f2 = abstractC8672f;
                    if (composerImplMo1636j.mo1665y(abstractC8672f2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        str2 = str;
                        if (composerImplMo1636j.mo1665y(str2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (composerImplMo1636j.mo1665y(interfaceC2057q)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                            } else {
                                abstractC8670dM16926b = abstractC8670d2;
                            }
                            if (i15 != 0) {
                                abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                            } else {
                                abstractC8672fM16928b = abstractC8672f2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q17 = ComposerKt.f3003a;
                            int i21111 = i12 << 3;
                            int i21112 = (i21111 & 57344) | (i21111 & 896) | 48 | (i21111 & 7168) | (i12 & 458752);
                            interfaceC0500b2 = interfaceC0500b3;
                            abstractC8670d3 = abstractC8670dM16926b;
                            abstractC8672f3 = abstractC8672fM16928b;
                            m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final Boolean mo528n(Boolean bool) {
                                    return Boolean.valueOf(bool.booleanValue());
                                }
                            }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i21112);
                        } else {
                            if (i20 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                            } else {
                                abstractC8670dM16926b = abstractC8670d2;
                            }
                            if (i15 != 0) {
                                abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                            } else {
                                abstractC8672fM16928b = abstractC8672f2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q18 = ComposerKt.f3003a;
                            int i21113 = i12 << 3;
                            int i21114 = (i21113 & 57344) | (i21113 & 896) | 48 | (i21113 & 7168) | (i12 & 458752);
                            interfaceC0500b2 = interfaceC0500b3;
                            abstractC8670d3 = abstractC8670dM16926b;
                            abstractC8672f3 = abstractC8672fM16928b;
                            m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final Boolean mo528n(Boolean bool) {
                                    return Boolean.valueOf(bool.booleanValue());
                                }
                            }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i21114);
                        }
                        str3 = str2;
                        c5332q0M1612T = composerImplMo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                num.intValue();
                                AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i19 = 196608;
                    i12 |= i19;
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                        } else {
                            abstractC8670dM16926b = abstractC8670d2;
                        }
                        if (i15 != 0) {
                            abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                        } else {
                            abstractC8672fM16928b = abstractC8672f2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q19 = ComposerKt.f3003a;
                        int i21115 = i12 << 3;
                        int i21116 = (i21115 & 57344) | (i21115 & 896) | 48 | (i21115 & 7168) | (i12 & 458752);
                        interfaceC0500b2 = interfaceC0500b3;
                        abstractC8670d3 = abstractC8670dM16926b;
                        abstractC8672f3 = abstractC8672fM16928b;
                        m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final Boolean mo528n(Boolean bool) {
                                return Boolean.valueOf(bool.booleanValue());
                            }
                        }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i21116);
                    } else {
                        if (i20 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                        } else {
                            abstractC8670dM16926b = abstractC8670d2;
                        }
                        if (i15 != 0) {
                            abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                        } else {
                            abstractC8672fM16928b = abstractC8672f2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q110 = ComposerKt.f3003a;
                        int i21117 = i12 << 3;
                        int i21118 = (i21117 & 57344) | (i21117 & 896) | 48 | (i21117 & 7168) | (i12 & 458752);
                        interfaceC0500b2 = interfaceC0500b3;
                        abstractC8670d3 = abstractC8670dM16926b;
                        abstractC8672f3 = abstractC8672fM16928b;
                        m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final Boolean mo528n(Boolean bool) {
                                return Boolean.valueOf(bool.booleanValue());
                            }
                        }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i21118);
                    }
                    str3 = str2;
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i12 |= 24576;
                str2 = str;
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerImplMo1636j.mo1665y(interfaceC2057q)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                        } else {
                            abstractC8670dM16926b = abstractC8670d2;
                        }
                        if (i15 != 0) {
                            abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                        } else {
                            abstractC8672fM16928b = abstractC8672f2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111 = ComposerKt.f3003a;
                        int i21119 = i12 << 3;
                        int i211110 = (i21119 & 57344) | (i21119 & 896) | 48 | (i21119 & 7168) | (i12 & 458752);
                        interfaceC0500b2 = interfaceC0500b3;
                        abstractC8670d3 = abstractC8670dM16926b;
                        abstractC8672f3 = abstractC8672fM16928b;
                        m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final Boolean mo528n(Boolean bool) {
                                return Boolean.valueOf(bool.booleanValue());
                            }
                        }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i211110);
                    } else {
                        if (i20 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                        } else {
                            abstractC8670dM16926b = abstractC8670d2;
                        }
                        if (i15 != 0) {
                            abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                        } else {
                            abstractC8672fM16928b = abstractC8672f2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q112 = ComposerKt.f3003a;
                        int i211111 = i12 << 3;
                        int i211112 = (i211111 & 57344) | (i211111 & 896) | 48 | (i211111 & 7168) | (i12 & 458752);
                        interfaceC0500b2 = interfaceC0500b3;
                        abstractC8670d3 = abstractC8670dM16926b;
                        abstractC8672f3 = abstractC8672fM16928b;
                        m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final Boolean mo528n(Boolean bool) {
                                return Boolean.valueOf(bool.booleanValue());
                            }
                        }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i211112);
                    }
                    str3 = str2;
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i19 = 196608;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                    } else {
                        abstractC8670dM16926b = abstractC8670d2;
                    }
                    if (i15 != 0) {
                        abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                    } else {
                        abstractC8672fM16928b = abstractC8672f2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q113 = ComposerKt.f3003a;
                    int i211113 = i12 << 3;
                    int i211114 = (i211113 & 57344) | (i211113 & 896) | 48 | (i211113 & 7168) | (i12 & 458752);
                    interfaceC0500b2 = interfaceC0500b3;
                    abstractC8670d3 = abstractC8670dM16926b;
                    abstractC8672f3 = abstractC8672fM16928b;
                    m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(Boolean bool) {
                            return Boolean.valueOf(bool.booleanValue());
                        }
                    }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i211114);
                } else {
                    if (i20 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                    } else {
                        abstractC8670dM16926b = abstractC8670d2;
                    }
                    if (i15 != 0) {
                        abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                    } else {
                        abstractC8672fM16928b = abstractC8672f2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q114 = ComposerKt.f3003a;
                    int i211115 = i12 << 3;
                    int i211116 = (i211115 & 57344) | (i211115 & 896) | 48 | (i211115 & 7168) | (i12 & 458752);
                    interfaceC0500b2 = interfaceC0500b3;
                    abstractC8670d3 = abstractC8670dM16926b;
                    abstractC8672f3 = abstractC8672fM16928b;
                    m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(Boolean bool) {
                            return Boolean.valueOf(bool.booleanValue());
                        }
                    }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i211116);
                }
                str3 = str2;
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 3072;
            abstractC8672f2 = abstractC8672f;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    str2 = str;
                    if (composerImplMo1636j.mo1665y(str2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerImplMo1636j.mo1665y(interfaceC2057q)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                        } else {
                            abstractC8670dM16926b = abstractC8670d2;
                        }
                        if (i15 != 0) {
                            abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                        } else {
                            abstractC8672fM16928b = abstractC8672f2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q115 = ComposerKt.f3003a;
                        int i211117 = i12 << 3;
                        int i211118 = (i211117 & 57344) | (i211117 & 896) | 48 | (i211117 & 7168) | (i12 & 458752);
                        interfaceC0500b2 = interfaceC0500b3;
                        abstractC8670d3 = abstractC8670dM16926b;
                        abstractC8672f3 = abstractC8672fM16928b;
                        m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final Boolean mo528n(Boolean bool) {
                                return Boolean.valueOf(bool.booleanValue());
                            }
                        }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i211118);
                    } else {
                        if (i20 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                        } else {
                            abstractC8670dM16926b = abstractC8670d2;
                        }
                        if (i15 != 0) {
                            abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                        } else {
                            abstractC8672fM16928b = abstractC8672f2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q116 = ComposerKt.f3003a;
                        int i211119 = i12 << 3;
                        int i2111110 = (i211119 & 57344) | (i211119 & 896) | 48 | (i211119 & 7168) | (i12 & 458752);
                        interfaceC0500b2 = interfaceC0500b3;
                        abstractC8670d3 = abstractC8670dM16926b;
                        abstractC8672f3 = abstractC8672fM16928b;
                        m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final Boolean mo528n(Boolean bool) {
                                return Boolean.valueOf(bool.booleanValue());
                            }
                        }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i2111110);
                    }
                    str3 = str2;
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i19 = 196608;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                    } else {
                        abstractC8670dM16926b = abstractC8670d2;
                    }
                    if (i15 != 0) {
                        abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                    } else {
                        abstractC8672fM16928b = abstractC8672f2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q117 = ComposerKt.f3003a;
                    int i2111111 = i12 << 3;
                    int i2111112 = (i2111111 & 57344) | (i2111111 & 896) | 48 | (i2111111 & 7168) | (i12 & 458752);
                    interfaceC0500b2 = interfaceC0500b3;
                    abstractC8670d3 = abstractC8670dM16926b;
                    abstractC8672f3 = abstractC8672fM16928b;
                    m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(Boolean bool) {
                            return Boolean.valueOf(bool.booleanValue());
                        }
                    }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i2111112);
                } else {
                    if (i20 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                    } else {
                        abstractC8670dM16926b = abstractC8670d2;
                    }
                    if (i15 != 0) {
                        abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                    } else {
                        abstractC8672fM16928b = abstractC8672f2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q118 = ComposerKt.f3003a;
                    int i2111113 = i12 << 3;
                    int i2111114 = (i2111113 & 57344) | (i2111113 & 896) | 48 | (i2111113 & 7168) | (i12 & 458752);
                    interfaceC0500b2 = interfaceC0500b3;
                    abstractC8670d3 = abstractC8670dM16926b;
                    abstractC8672f3 = abstractC8672fM16928b;
                    m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(Boolean bool) {
                            return Boolean.valueOf(bool.booleanValue());
                        }
                    }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i2111114);
                }
                str3 = str2;
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 24576;
            str2 = str;
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerImplMo1636j.mo1665y(interfaceC2057q)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                    } else {
                        abstractC8670dM16926b = abstractC8670d2;
                    }
                    if (i15 != 0) {
                        abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                    } else {
                        abstractC8672fM16928b = abstractC8672f2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q119 = ComposerKt.f3003a;
                    int i2111115 = i12 << 3;
                    int i2111116 = (i2111115 & 57344) | (i2111115 & 896) | 48 | (i2111115 & 7168) | (i12 & 458752);
                    interfaceC0500b2 = interfaceC0500b3;
                    abstractC8670d3 = abstractC8670dM16926b;
                    abstractC8672f3 = abstractC8672fM16928b;
                    m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(Boolean bool) {
                            return Boolean.valueOf(bool.booleanValue());
                        }
                    }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i2111116);
                } else {
                    if (i20 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                    } else {
                        abstractC8670dM16926b = abstractC8670d2;
                    }
                    if (i15 != 0) {
                        abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                    } else {
                        abstractC8672fM16928b = abstractC8672f2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1110 = ComposerKt.f3003a;
                    int i2111117 = i12 << 3;
                    int i2111118 = (i2111117 & 57344) | (i2111117 & 896) | 48 | (i2111117 & 7168) | (i12 & 458752);
                    interfaceC0500b2 = interfaceC0500b3;
                    abstractC8670d3 = abstractC8670dM16926b;
                    abstractC8672f3 = abstractC8672fM16928b;
                    m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(Boolean bool) {
                            return Boolean.valueOf(bool.booleanValue());
                        }
                    }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i2111118);
                }
                str3 = str2;
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i19 = 196608;
            i12 |= i19;
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b3 = interfaceC0500b2;
                }
                if (i13 != 0) {
                    abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                } else {
                    abstractC8670dM16926b = abstractC8670d2;
                }
                if (i15 != 0) {
                    abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                } else {
                    abstractC8672fM16928b = abstractC8672f2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111 = ComposerKt.f3003a;
                int i2111119 = i12 << 3;
                int i21111110 = (i2111119 & 57344) | (i2111119 & 896) | 48 | (i2111119 & 7168) | (i12 & 458752);
                interfaceC0500b2 = interfaceC0500b3;
                abstractC8670d3 = abstractC8670dM16926b;
                abstractC8672f3 = abstractC8672fM16928b;
                m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Boolean mo528n(Boolean bool) {
                        return Boolean.valueOf(bool.booleanValue());
                    }
                }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i21111110);
            } else {
                if (i20 != 0) {
                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b3 = interfaceC0500b2;
                }
                if (i13 != 0) {
                    abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                } else {
                    abstractC8670dM16926b = abstractC8670d2;
                }
                if (i15 != 0) {
                    abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                } else {
                    abstractC8672fM16928b = abstractC8672f2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1112 = ComposerKt.f3003a;
                int i21111111 = i12 << 3;
                int i21111112 = (i21111111 & 57344) | (i21111111 & 896) | 48 | (i21111111 & 7168) | (i12 & 458752);
                interfaceC0500b2 = interfaceC0500b3;
                abstractC8670d3 = abstractC8670dM16926b;
                abstractC8672f3 = abstractC8672fM16928b;
                m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Boolean mo528n(Boolean bool) {
                        return Boolean.valueOf(bool.booleanValue());
                    }
                }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i21111112);
            }
            str3 = str2;
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 48;
        interfaceC0500b2 = interfaceC0500b;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                abstractC8670d2 = abstractC8670d;
                if (composerImplMo1636j.mo1665y(abstractC8670d2)) {
                    i14 = 256;
                } else {
                    i14 = BuildConfig.SDK_TRUNCATE_LENGTH;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    abstractC8672f2 = abstractC8672f;
                    if (composerImplMo1636j.mo1665y(abstractC8672f2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        str2 = str;
                        if (composerImplMo1636j.mo1665y(str2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (composerImplMo1636j.mo1665y(interfaceC2057q)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                            } else {
                                abstractC8670dM16926b = abstractC8670d2;
                            }
                            if (i15 != 0) {
                                abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                            } else {
                                abstractC8672fM16928b = abstractC8672f2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1113 = ComposerKt.f3003a;
                            int i21111113 = i12 << 3;
                            int i21111114 = (i21111113 & 57344) | (i21111113 & 896) | 48 | (i21111113 & 7168) | (i12 & 458752);
                            interfaceC0500b2 = interfaceC0500b3;
                            abstractC8670d3 = abstractC8670dM16926b;
                            abstractC8672f3 = abstractC8672fM16928b;
                            m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final Boolean mo528n(Boolean bool) {
                                    return Boolean.valueOf(bool.booleanValue());
                                }
                            }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i21111114);
                        } else {
                            if (i20 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                            } else {
                                abstractC8670dM16926b = abstractC8670d2;
                            }
                            if (i15 != 0) {
                                abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                            } else {
                                abstractC8672fM16928b = abstractC8672f2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1114 = ComposerKt.f3003a;
                            int i21111115 = i12 << 3;
                            int i21111116 = (i21111115 & 57344) | (i21111115 & 896) | 48 | (i21111115 & 7168) | (i12 & 458752);
                            interfaceC0500b2 = interfaceC0500b3;
                            abstractC8670d3 = abstractC8670dM16926b;
                            abstractC8672f3 = abstractC8672fM16928b;
                            m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final Boolean mo528n(Boolean bool) {
                                    return Boolean.valueOf(bool.booleanValue());
                                }
                            }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i21111116);
                        }
                        str3 = str2;
                        c5332q0M1612T = composerImplMo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                num.intValue();
                                AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i19 = 196608;
                    i12 |= i19;
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                        } else {
                            abstractC8670dM16926b = abstractC8670d2;
                        }
                        if (i15 != 0) {
                            abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                        } else {
                            abstractC8672fM16928b = abstractC8672f2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1115 = ComposerKt.f3003a;
                        int i21111117 = i12 << 3;
                        int i21111118 = (i21111117 & 57344) | (i21111117 & 896) | 48 | (i21111117 & 7168) | (i12 & 458752);
                        interfaceC0500b2 = interfaceC0500b3;
                        abstractC8670d3 = abstractC8670dM16926b;
                        abstractC8672f3 = abstractC8672fM16928b;
                        m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final Boolean mo528n(Boolean bool) {
                                return Boolean.valueOf(bool.booleanValue());
                            }
                        }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i21111118);
                    } else {
                        if (i20 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                        } else {
                            abstractC8670dM16926b = abstractC8670d2;
                        }
                        if (i15 != 0) {
                            abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                        } else {
                            abstractC8672fM16928b = abstractC8672f2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1116 = ComposerKt.f3003a;
                        int i21111119 = i12 << 3;
                        int i211111110 = (i21111119 & 57344) | (i21111119 & 896) | 48 | (i21111119 & 7168) | (i12 & 458752);
                        interfaceC0500b2 = interfaceC0500b3;
                        abstractC8670d3 = abstractC8670dM16926b;
                        abstractC8672f3 = abstractC8672fM16928b;
                        m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final Boolean mo528n(Boolean bool) {
                                return Boolean.valueOf(bool.booleanValue());
                            }
                        }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i211111110);
                    }
                    str3 = str2;
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i12 |= 24576;
                str2 = str;
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerImplMo1636j.mo1665y(interfaceC2057q)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                        } else {
                            abstractC8670dM16926b = abstractC8670d2;
                        }
                        if (i15 != 0) {
                            abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                        } else {
                            abstractC8672fM16928b = abstractC8672f2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1117 = ComposerKt.f3003a;
                        int i211111111 = i12 << 3;
                        int i211111112 = (i211111111 & 57344) | (i211111111 & 896) | 48 | (i211111111 & 7168) | (i12 & 458752);
                        interfaceC0500b2 = interfaceC0500b3;
                        abstractC8670d3 = abstractC8670dM16926b;
                        abstractC8672f3 = abstractC8672fM16928b;
                        m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final Boolean mo528n(Boolean bool) {
                                return Boolean.valueOf(bool.booleanValue());
                            }
                        }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i211111112);
                    } else {
                        if (i20 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                        } else {
                            abstractC8670dM16926b = abstractC8670d2;
                        }
                        if (i15 != 0) {
                            abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                        } else {
                            abstractC8672fM16928b = abstractC8672f2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1118 = ComposerKt.f3003a;
                        int i211111113 = i12 << 3;
                        int i211111114 = (i211111113 & 57344) | (i211111113 & 896) | 48 | (i211111113 & 7168) | (i12 & 458752);
                        interfaceC0500b2 = interfaceC0500b3;
                        abstractC8670d3 = abstractC8670dM16926b;
                        abstractC8672f3 = abstractC8672fM16928b;
                        m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final Boolean mo528n(Boolean bool) {
                                return Boolean.valueOf(bool.booleanValue());
                            }
                        }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i211111114);
                    }
                    str3 = str2;
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i19 = 196608;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                    } else {
                        abstractC8670dM16926b = abstractC8670d2;
                    }
                    if (i15 != 0) {
                        abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                    } else {
                        abstractC8672fM16928b = abstractC8672f2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1119 = ComposerKt.f3003a;
                    int i211111115 = i12 << 3;
                    int i211111116 = (i211111115 & 57344) | (i211111115 & 896) | 48 | (i211111115 & 7168) | (i12 & 458752);
                    interfaceC0500b2 = interfaceC0500b3;
                    abstractC8670d3 = abstractC8670dM16926b;
                    abstractC8672f3 = abstractC8672fM16928b;
                    m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(Boolean bool) {
                            return Boolean.valueOf(bool.booleanValue());
                        }
                    }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i211111116);
                } else {
                    if (i20 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                    } else {
                        abstractC8670dM16926b = abstractC8670d2;
                    }
                    if (i15 != 0) {
                        abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                    } else {
                        abstractC8672fM16928b = abstractC8672f2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11110 = ComposerKt.f3003a;
                    int i211111117 = i12 << 3;
                    int i211111118 = (i211111117 & 57344) | (i211111117 & 896) | 48 | (i211111117 & 7168) | (i12 & 458752);
                    interfaceC0500b2 = interfaceC0500b3;
                    abstractC8670d3 = abstractC8670dM16926b;
                    abstractC8672f3 = abstractC8672fM16928b;
                    m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(Boolean bool) {
                            return Boolean.valueOf(bool.booleanValue());
                        }
                    }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i211111118);
                }
                str3 = str2;
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 3072;
            abstractC8672f2 = abstractC8672f;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    str2 = str;
                    if (composerImplMo1636j.mo1665y(str2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerImplMo1636j.mo1665y(interfaceC2057q)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                        } else {
                            abstractC8670dM16926b = abstractC8670d2;
                        }
                        if (i15 != 0) {
                            abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                        } else {
                            abstractC8672fM16928b = abstractC8672f2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11111 = ComposerKt.f3003a;
                        int i211111119 = i12 << 3;
                        int i2111111110 = (i211111119 & 57344) | (i211111119 & 896) | 48 | (i211111119 & 7168) | (i12 & 458752);
                        interfaceC0500b2 = interfaceC0500b3;
                        abstractC8670d3 = abstractC8670dM16926b;
                        abstractC8672f3 = abstractC8672fM16928b;
                        m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final Boolean mo528n(Boolean bool) {
                                return Boolean.valueOf(bool.booleanValue());
                            }
                        }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i2111111110);
                    } else {
                        if (i20 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                        } else {
                            abstractC8670dM16926b = abstractC8670d2;
                        }
                        if (i15 != 0) {
                            abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                        } else {
                            abstractC8672fM16928b = abstractC8672f2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11112 = ComposerKt.f3003a;
                        int i2111111111 = i12 << 3;
                        int i2111111112 = (i2111111111 & 57344) | (i2111111111 & 896) | 48 | (i2111111111 & 7168) | (i12 & 458752);
                        interfaceC0500b2 = interfaceC0500b3;
                        abstractC8670d3 = abstractC8670dM16926b;
                        abstractC8672f3 = abstractC8672fM16928b;
                        m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final Boolean mo528n(Boolean bool) {
                                return Boolean.valueOf(bool.booleanValue());
                            }
                        }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i2111111112);
                    }
                    str3 = str2;
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i19 = 196608;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                    } else {
                        abstractC8670dM16926b = abstractC8670d2;
                    }
                    if (i15 != 0) {
                        abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                    } else {
                        abstractC8672fM16928b = abstractC8672f2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11113 = ComposerKt.f3003a;
                    int i2111111113 = i12 << 3;
                    int i2111111114 = (i2111111113 & 57344) | (i2111111113 & 896) | 48 | (i2111111113 & 7168) | (i12 & 458752);
                    interfaceC0500b2 = interfaceC0500b3;
                    abstractC8670d3 = abstractC8670dM16926b;
                    abstractC8672f3 = abstractC8672fM16928b;
                    m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(Boolean bool) {
                            return Boolean.valueOf(bool.booleanValue());
                        }
                    }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i2111111114);
                } else {
                    if (i20 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                    } else {
                        abstractC8670dM16926b = abstractC8670d2;
                    }
                    if (i15 != 0) {
                        abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                    } else {
                        abstractC8672fM16928b = abstractC8672f2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11114 = ComposerKt.f3003a;
                    int i2111111115 = i12 << 3;
                    int i2111111116 = (i2111111115 & 57344) | (i2111111115 & 896) | 48 | (i2111111115 & 7168) | (i12 & 458752);
                    interfaceC0500b2 = interfaceC0500b3;
                    abstractC8670d3 = abstractC8670dM16926b;
                    abstractC8672f3 = abstractC8672fM16928b;
                    m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(Boolean bool) {
                            return Boolean.valueOf(bool.booleanValue());
                        }
                    }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i2111111116);
                }
                str3 = str2;
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 24576;
            str2 = str;
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerImplMo1636j.mo1665y(interfaceC2057q)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                    } else {
                        abstractC8670dM16926b = abstractC8670d2;
                    }
                    if (i15 != 0) {
                        abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                    } else {
                        abstractC8672fM16928b = abstractC8672f2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11115 = ComposerKt.f3003a;
                    int i2111111117 = i12 << 3;
                    int i2111111118 = (i2111111117 & 57344) | (i2111111117 & 896) | 48 | (i2111111117 & 7168) | (i12 & 458752);
                    interfaceC0500b2 = interfaceC0500b3;
                    abstractC8670d3 = abstractC8670dM16926b;
                    abstractC8672f3 = abstractC8672fM16928b;
                    m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(Boolean bool) {
                            return Boolean.valueOf(bool.booleanValue());
                        }
                    }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i2111111118);
                } else {
                    if (i20 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                    } else {
                        abstractC8670dM16926b = abstractC8670d2;
                    }
                    if (i15 != 0) {
                        abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                    } else {
                        abstractC8672fM16928b = abstractC8672f2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11116 = ComposerKt.f3003a;
                    int i2111111119 = i12 << 3;
                    int i21111111110 = (i2111111119 & 57344) | (i2111111119 & 896) | 48 | (i2111111119 & 7168) | (i12 & 458752);
                    interfaceC0500b2 = interfaceC0500b3;
                    abstractC8670d3 = abstractC8670dM16926b;
                    abstractC8672f3 = abstractC8672fM16928b;
                    m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(Boolean bool) {
                            return Boolean.valueOf(bool.booleanValue());
                        }
                    }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i21111111110);
                }
                str3 = str2;
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i19 = 196608;
            i12 |= i19;
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b3 = interfaceC0500b2;
                }
                if (i13 != 0) {
                    abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                } else {
                    abstractC8670dM16926b = abstractC8670d2;
                }
                if (i15 != 0) {
                    abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                } else {
                    abstractC8672fM16928b = abstractC8672f2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11117 = ComposerKt.f3003a;
                int i21111111111 = i12 << 3;
                int i21111111112 = (i21111111111 & 57344) | (i21111111111 & 896) | 48 | (i21111111111 & 7168) | (i12 & 458752);
                interfaceC0500b2 = interfaceC0500b3;
                abstractC8670d3 = abstractC8670dM16926b;
                abstractC8672f3 = abstractC8672fM16928b;
                m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Boolean mo528n(Boolean bool) {
                        return Boolean.valueOf(bool.booleanValue());
                    }
                }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i21111111112);
            } else {
                if (i20 != 0) {
                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b3 = interfaceC0500b2;
                }
                if (i13 != 0) {
                    abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                } else {
                    abstractC8670dM16926b = abstractC8670d2;
                }
                if (i15 != 0) {
                    abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                } else {
                    abstractC8672fM16928b = abstractC8672f2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11118 = ComposerKt.f3003a;
                int i21111111113 = i12 << 3;
                int i21111111114 = (i21111111113 & 57344) | (i21111111113 & 896) | 48 | (i21111111113 & 7168) | (i12 & 458752);
                interfaceC0500b2 = interfaceC0500b3;
                abstractC8670d3 = abstractC8670dM16926b;
                abstractC8672f3 = abstractC8672fM16928b;
                m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Boolean mo528n(Boolean bool) {
                        return Boolean.valueOf(bool.booleanValue());
                    }
                }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i21111111114);
            }
            str3 = str2;
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 384;
        abstractC8670d2 = abstractC8670d;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                abstractC8672f2 = abstractC8672f;
                if (composerImplMo1636j.mo1665y(abstractC8672f2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    str2 = str;
                    if (composerImplMo1636j.mo1665y(str2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerImplMo1636j.mo1665y(interfaceC2057q)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                        } else {
                            abstractC8670dM16926b = abstractC8670d2;
                        }
                        if (i15 != 0) {
                            abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                        } else {
                            abstractC8672fM16928b = abstractC8672f2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11119 = ComposerKt.f3003a;
                        int i21111111115 = i12 << 3;
                        int i21111111116 = (i21111111115 & 57344) | (i21111111115 & 896) | 48 | (i21111111115 & 7168) | (i12 & 458752);
                        interfaceC0500b2 = interfaceC0500b3;
                        abstractC8670d3 = abstractC8670dM16926b;
                        abstractC8672f3 = abstractC8672fM16928b;
                        m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final Boolean mo528n(Boolean bool) {
                                return Boolean.valueOf(bool.booleanValue());
                            }
                        }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i21111111116);
                    } else {
                        if (i20 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                        } else {
                            abstractC8670dM16926b = abstractC8670d2;
                        }
                        if (i15 != 0) {
                            abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                        } else {
                            abstractC8672fM16928b = abstractC8672f2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111110 = ComposerKt.f3003a;
                        int i21111111117 = i12 << 3;
                        int i21111111118 = (i21111111117 & 57344) | (i21111111117 & 896) | 48 | (i21111111117 & 7168) | (i12 & 458752);
                        interfaceC0500b2 = interfaceC0500b3;
                        abstractC8670d3 = abstractC8670dM16926b;
                        abstractC8672f3 = abstractC8672fM16928b;
                        m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final Boolean mo528n(Boolean bool) {
                                return Boolean.valueOf(bool.booleanValue());
                            }
                        }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i21111111118);
                    }
                    str3 = str2;
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i19 = 196608;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                    } else {
                        abstractC8670dM16926b = abstractC8670d2;
                    }
                    if (i15 != 0) {
                        abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                    } else {
                        abstractC8672fM16928b = abstractC8672f2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111111 = ComposerKt.f3003a;
                    int i21111111119 = i12 << 3;
                    int i211111111110 = (i21111111119 & 57344) | (i21111111119 & 896) | 48 | (i21111111119 & 7168) | (i12 & 458752);
                    interfaceC0500b2 = interfaceC0500b3;
                    abstractC8670d3 = abstractC8670dM16926b;
                    abstractC8672f3 = abstractC8672fM16928b;
                    m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(Boolean bool) {
                            return Boolean.valueOf(bool.booleanValue());
                        }
                    }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i211111111110);
                } else {
                    if (i20 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                    } else {
                        abstractC8670dM16926b = abstractC8670d2;
                    }
                    if (i15 != 0) {
                        abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                    } else {
                        abstractC8672fM16928b = abstractC8672f2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111112 = ComposerKt.f3003a;
                    int i211111111111 = i12 << 3;
                    int i211111111112 = (i211111111111 & 57344) | (i211111111111 & 896) | 48 | (i211111111111 & 7168) | (i12 & 458752);
                    interfaceC0500b2 = interfaceC0500b3;
                    abstractC8670d3 = abstractC8670dM16926b;
                    abstractC8672f3 = abstractC8672fM16928b;
                    m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(Boolean bool) {
                            return Boolean.valueOf(bool.booleanValue());
                        }
                    }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i211111111112);
                }
                str3 = str2;
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 24576;
            str2 = str;
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerImplMo1636j.mo1665y(interfaceC2057q)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                    } else {
                        abstractC8670dM16926b = abstractC8670d2;
                    }
                    if (i15 != 0) {
                        abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                    } else {
                        abstractC8672fM16928b = abstractC8672f2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111113 = ComposerKt.f3003a;
                    int i211111111113 = i12 << 3;
                    int i211111111114 = (i211111111113 & 57344) | (i211111111113 & 896) | 48 | (i211111111113 & 7168) | (i12 & 458752);
                    interfaceC0500b2 = interfaceC0500b3;
                    abstractC8670d3 = abstractC8670dM16926b;
                    abstractC8672f3 = abstractC8672fM16928b;
                    m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(Boolean bool) {
                            return Boolean.valueOf(bool.booleanValue());
                        }
                    }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i211111111114);
                } else {
                    if (i20 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                    } else {
                        abstractC8670dM16926b = abstractC8670d2;
                    }
                    if (i15 != 0) {
                        abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                    } else {
                        abstractC8672fM16928b = abstractC8672f2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111114 = ComposerKt.f3003a;
                    int i211111111115 = i12 << 3;
                    int i211111111116 = (i211111111115 & 57344) | (i211111111115 & 896) | 48 | (i211111111115 & 7168) | (i12 & 458752);
                    interfaceC0500b2 = interfaceC0500b3;
                    abstractC8670d3 = abstractC8670dM16926b;
                    abstractC8672f3 = abstractC8672fM16928b;
                    m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(Boolean bool) {
                            return Boolean.valueOf(bool.booleanValue());
                        }
                    }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i211111111116);
                }
                str3 = str2;
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i19 = 196608;
            i12 |= i19;
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b3 = interfaceC0500b2;
                }
                if (i13 != 0) {
                    abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                } else {
                    abstractC8670dM16926b = abstractC8670d2;
                }
                if (i15 != 0) {
                    abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                } else {
                    abstractC8672fM16928b = abstractC8672f2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111115 = ComposerKt.f3003a;
                int i211111111117 = i12 << 3;
                int i211111111118 = (i211111111117 & 57344) | (i211111111117 & 896) | 48 | (i211111111117 & 7168) | (i12 & 458752);
                interfaceC0500b2 = interfaceC0500b3;
                abstractC8670d3 = abstractC8670dM16926b;
                abstractC8672f3 = abstractC8672fM16928b;
                m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Boolean mo528n(Boolean bool) {
                        return Boolean.valueOf(bool.booleanValue());
                    }
                }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i211111111118);
            } else {
                if (i20 != 0) {
                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b3 = interfaceC0500b2;
                }
                if (i13 != 0) {
                    abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                } else {
                    abstractC8670dM16926b = abstractC8670d2;
                }
                if (i15 != 0) {
                    abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                } else {
                    abstractC8672fM16928b = abstractC8672f2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111116 = ComposerKt.f3003a;
                int i211111111119 = i12 << 3;
                int i2111111111110 = (i211111111119 & 57344) | (i211111111119 & 896) | 48 | (i211111111119 & 7168) | (i12 & 458752);
                interfaceC0500b2 = interfaceC0500b3;
                abstractC8670d3 = abstractC8670dM16926b;
                abstractC8672f3 = abstractC8672fM16928b;
                m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Boolean mo528n(Boolean bool) {
                        return Boolean.valueOf(bool.booleanValue());
                    }
                }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i2111111111110);
            }
            str3 = str2;
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 3072;
        abstractC8672f2 = abstractC8672f;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 57344) == 0) {
                str2 = str;
                if (composerImplMo1636j.mo1665y(str2)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerImplMo1636j.mo1665y(interfaceC2057q)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                    } else {
                        abstractC8670dM16926b = abstractC8670d2;
                    }
                    if (i15 != 0) {
                        abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                    } else {
                        abstractC8672fM16928b = abstractC8672f2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111117 = ComposerKt.f3003a;
                    int i2111111111111 = i12 << 3;
                    int i2111111111112 = (i2111111111111 & 57344) | (i2111111111111 & 896) | 48 | (i2111111111111 & 7168) | (i12 & 458752);
                    interfaceC0500b2 = interfaceC0500b3;
                    abstractC8670d3 = abstractC8670dM16926b;
                    abstractC8672f3 = abstractC8672fM16928b;
                    m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(Boolean bool) {
                            return Boolean.valueOf(bool.booleanValue());
                        }
                    }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i2111111111112);
                } else {
                    if (i20 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                    } else {
                        abstractC8670dM16926b = abstractC8670d2;
                    }
                    if (i15 != 0) {
                        abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                    } else {
                        abstractC8672fM16928b = abstractC8672f2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111118 = ComposerKt.f3003a;
                    int i2111111111113 = i12 << 3;
                    int i2111111111114 = (i2111111111113 & 57344) | (i2111111111113 & 896) | 48 | (i2111111111113 & 7168) | (i12 & 458752);
                    interfaceC0500b2 = interfaceC0500b3;
                    abstractC8670d3 = abstractC8670dM16926b;
                    abstractC8672f3 = abstractC8672fM16928b;
                    m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(Boolean bool) {
                            return Boolean.valueOf(bool.booleanValue());
                        }
                    }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i2111111111114);
                }
                str3 = str2;
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i19 = 196608;
            i12 |= i19;
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b3 = interfaceC0500b2;
                }
                if (i13 != 0) {
                    abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                } else {
                    abstractC8670dM16926b = abstractC8670d2;
                }
                if (i15 != 0) {
                    abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                } else {
                    abstractC8672fM16928b = abstractC8672f2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111119 = ComposerKt.f3003a;
                int i2111111111115 = i12 << 3;
                int i2111111111116 = (i2111111111115 & 57344) | (i2111111111115 & 896) | 48 | (i2111111111115 & 7168) | (i12 & 458752);
                interfaceC0500b2 = interfaceC0500b3;
                abstractC8670d3 = abstractC8670dM16926b;
                abstractC8672f3 = abstractC8672fM16928b;
                m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Boolean mo528n(Boolean bool) {
                        return Boolean.valueOf(bool.booleanValue());
                    }
                }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i2111111111116);
            } else {
                if (i20 != 0) {
                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b3 = interfaceC0500b2;
                }
                if (i13 != 0) {
                    abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                } else {
                    abstractC8670dM16926b = abstractC8670d2;
                }
                if (i15 != 0) {
                    abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                } else {
                    abstractC8672fM16928b = abstractC8672f2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111110 = ComposerKt.f3003a;
                int i2111111111117 = i12 << 3;
                int i2111111111118 = (i2111111111117 & 57344) | (i2111111111117 & 896) | 48 | (i2111111111117 & 7168) | (i12 & 458752);
                interfaceC0500b2 = interfaceC0500b3;
                abstractC8670d3 = abstractC8670dM16926b;
                abstractC8672f3 = abstractC8672fM16928b;
                m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Boolean mo528n(Boolean bool) {
                        return Boolean.valueOf(bool.booleanValue());
                    }
                }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i2111111111118);
            }
            str3 = str2;
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 24576;
        str2 = str;
        if ((i11 & 32) != 0) {
            if ((i10 & 458752) == 0) {
                if (composerImplMo1636j.mo1665y(interfaceC2057q)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
            }
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b3 = interfaceC0500b2;
                }
                if (i13 != 0) {
                    abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                } else {
                    abstractC8670dM16926b = abstractC8670d2;
                }
                if (i15 != 0) {
                    abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                } else {
                    abstractC8672fM16928b = abstractC8672f2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111111 = ComposerKt.f3003a;
                int i2111111111119 = i12 << 3;
                int i21111111111110 = (i2111111111119 & 57344) | (i2111111111119 & 896) | 48 | (i2111111111119 & 7168) | (i12 & 458752);
                interfaceC0500b2 = interfaceC0500b3;
                abstractC8670d3 = abstractC8670dM16926b;
                abstractC8672f3 = abstractC8672fM16928b;
                m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Boolean mo528n(Boolean bool) {
                        return Boolean.valueOf(bool.booleanValue());
                    }
                }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i21111111111110);
            } else {
                if (i20 != 0) {
                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b3 = interfaceC0500b2;
                }
                if (i13 != 0) {
                    abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
                } else {
                    abstractC8670dM16926b = abstractC8670d2;
                }
                if (i15 != 0) {
                    abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
                } else {
                    abstractC8672fM16928b = abstractC8672f2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111112 = ComposerKt.f3003a;
                int i21111111111111 = i12 << 3;
                int i21111111111112 = (i21111111111111 & 57344) | (i21111111111111 & 896) | 48 | (i21111111111111 & 7168) | (i12 & 458752);
                interfaceC0500b2 = interfaceC0500b3;
                abstractC8670d3 = abstractC8670dM16926b;
                abstractC8672f3 = abstractC8672fM16928b;
                m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Boolean mo528n(Boolean bool) {
                        return Boolean.valueOf(bool.booleanValue());
                    }
                }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i21111111111112);
            }
            str3 = str2;
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                    return C9072e.f47360a;
                }
            };
        }
        i19 = 196608;
        i12 |= i19;
        if ((374491 & i12) == 74898) {
            if (i20 != 0) {
                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
            } else {
                interfaceC0500b3 = interfaceC0500b2;
            }
            if (i13 != 0) {
                abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
            } else {
                abstractC8670dM16926b = abstractC8670d2;
            }
            if (i15 != 0) {
                abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
            } else {
                abstractC8672fM16928b = abstractC8672f2;
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111113 = ComposerKt.f3003a;
            int i21111111111113 = i12 << 3;
            int i21111111111114 = (i21111111111113 & 57344) | (i21111111111113 & 896) | 48 | (i21111111111113 & 7168) | (i12 & 458752);
            interfaceC0500b2 = interfaceC0500b3;
            abstractC8670d3 = abstractC8670dM16926b;
            abstractC8672f3 = abstractC8672fM16928b;
            m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final Boolean mo528n(Boolean bool) {
                    return Boolean.valueOf(bool.booleanValue());
                }
            }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i21111111111114);
        } else {
            if (i20 != 0) {
                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
            } else {
                interfaceC0500b3 = interfaceC0500b2;
            }
            if (i13 != 0) {
                abstractC8670dM16926b = EnterExitTransitionKt.m1347d(0.0f, 3).m16926b(EnterExitTransitionKt.m1345b());
            } else {
                abstractC8670dM16926b = abstractC8670d2;
            }
            if (i15 != 0) {
                abstractC8672fM16928b = EnterExitTransitionKt.m1349f().m16928b(EnterExitTransitionKt.m1348e(null, 3));
            } else {
                abstractC8672fM16928b = abstractC8672f2;
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111114 = ComposerKt.f3003a;
            int i21111111111115 = i12 << 3;
            int i21111111111116 = (i21111111111115 & 57344) | (i21111111111115 & 896) | 48 | (i21111111111115 & 7168) | (i12 & 458752);
            interfaceC0500b2 = interfaceC0500b3;
            abstractC8670d3 = abstractC8670dM16926b;
            abstractC8672f3 = abstractC8672fM16928b;
            m1333a(C0372d.m1392d(Boolean.valueOf(z10), str2, composerImplMo1636j, (i12 & 14) | ((i12 >> 9) & 112)), new InterfaceC2052l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final Boolean mo528n(Boolean bool) {
                    return Boolean.valueOf(bool.booleanValue());
                }
            }, interfaceC0500b2, abstractC8670d3, abstractC8672f3, interfaceC2057q, composerImplMo1636j, i21111111111116);
        }
        str3 = str2;
        c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                AnimatedVisibilityKt.m1334b(z10, interfaceC0500b2, abstractC8670d3, abstractC8672f3, str3, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                return C9072e.f47360a;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final EnterExitState m1335c(Transition transition, InterfaceC2052l interfaceC2052l, Object obj, InterfaceC0476a interfaceC0476a) {
        EnterExitState enterExitState;
        interfaceC0476a.mo1622c(361571134);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        interfaceC0476a.mo1638k(-721837504, transition);
        if (!transition.m1365e()) {
            interfaceC0476a.mo1622c(-492369756);
            Object objMo1624d = interfaceC0476a.mo1624d();
            if (objMo1624d == InterfaceC0476a.a.f3122a) {
                objMo1624d = C8573r0.m16684L0(Boolean.FALSE);
                interfaceC0476a.mo1655t(objMo1624d);
            }
            interfaceC0476a.mo1661w();
            InterfaceC5312g0 interfaceC5312g0 = (InterfaceC5312g0) objMo1624d;
            if (((Boolean) interfaceC2052l.mo528n(transition.m1362b())).booleanValue()) {
                interfaceC5312g0.setValue(Boolean.TRUE);
            }
            if (((Boolean) interfaceC2052l.mo528n(obj)).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else {
                enterExitState = ((Boolean) interfaceC5312g0.getValue()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
            }
        } else if (((Boolean) interfaceC2052l.mo528n(obj)).booleanValue()) {
            enterExitState = EnterExitState.Visible;
        } else {
            enterExitState = ((Boolean) interfaceC2052l.mo528n(transition.m1362b())).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
        }
        interfaceC0476a.mo1659v();
        interfaceC0476a.mo1661w();
        return enterExitState;
    }
}
