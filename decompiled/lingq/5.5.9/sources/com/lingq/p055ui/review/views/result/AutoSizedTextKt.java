package com.lingq.p055ui.review.views.result;

import androidx.compose.material3.TextKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.draw.C0501a;
import androidx.compose.p017ui.text.C0692c;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import java.util.ArrayList;
import p081e0.C5332q0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5336s0;
import p231l1.C7208b;
import p231l1.C7216j;
import p231l1.C7218l;
import p338qd.C8573r0;
import p387t0.C9169u;
import p424v0.InterfaceC9619c;
import p445w1.C9797g;
import p470x1.C10023k;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class AutoSizedTextKt {
    /* JADX WARN: Code duplicated, block: B:100:0x012f  */
    /* JADX WARN: Code duplicated, block: B:104:0x014b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0155  */
    /* JADX WARN: Code duplicated, block: B:113:0x0176 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0178  */
    /* JADX WARN: Code duplicated, block: B:115:0x017b  */
    /* JADX WARN: Code duplicated, block: B:117:0x017f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0182  */
    /* JADX WARN: Code duplicated, block: B:120:0x0186  */
    /* JADX WARN: Code duplicated, block: B:121:0x0189  */
    /* JADX WARN: Code duplicated, block: B:123:0x018c  */
    /* JADX WARN: Code duplicated, block: B:124:0x018f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0192  */
    /* JADX WARN: Code duplicated, block: B:127:0x0194  */
    /* JADX WARN: Code duplicated, block: B:129:0x0198  */
    /* JADX WARN: Code duplicated, block: B:130:0x019a  */
    /* JADX WARN: Code duplicated, block: B:132:0x019e  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:146:0x0217 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x0219  */
    /* JADX WARN: Code duplicated, block: B:150:0x0250 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x0252  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00da  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:84:0x0100  */
    /* JADX WARN: Code duplicated, block: B:85:0x0103  */
    /* JADX WARN: Code duplicated, block: B:89:0x010d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0111  */
    /* JADX WARN: Code duplicated, block: B:94:0x011c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0123  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m10305a(final String str, InterfaceC0500b interfaceC0500b, long j10, C9797g c9797g, long j11, int i10, boolean z10, int i11, C7218l c7218l, InterfaceC0476a interfaceC0476a, final int i12, final int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        C9797g c9797g2;
        int i18;
        int i19;
        long j12;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        InterfaceC0500b interfaceC0500b2;
        long j13;
        C9797g c9797g3;
        long j14;
        int i27;
        boolean z11;
        int i28;
        C7218l c7218l2;
        int i29;
        InterfaceC0500b interfaceC0500b3;
        long j15;
        C9797g c9797g4;
        long j16;
        int i30;
        boolean z12;
        Object objM1619a0;
        InterfaceC0476a.a.C10586a c10586a;
        final InterfaceC5312g0 interfaceC5312g0;
        Object objM1619a1;
        final InterfaceC5312g0 interfaceC5312g1;
        boolean zMo1665y;
        Object objM1619a2;
        boolean zMo1665y2;
        Object objM1619a3;
        ComposerImpl composerImpl;
        final long j17;
        final C9797g c9797g5;
        final long j18;
        final int i31;
        final boolean z13;
        final int i32;
        final C7218l c7218l3;
        final InterfaceC0500b interfaceC0500b4;
        C5332q0 c5332q0M1612T;
        C5207g.m11111f(str, "text");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(-586106975);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (composerImplMo1636j.mo1665y(str) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i33 = i13 & 2;
        if (i33 == 0) {
            if ((i12 & 112) == 0) {
                i14 |= composerImplMo1636j.mo1665y(interfaceC0500b) ? 32 : 16;
            }
            i15 = i13 & 4;
            if (i15 != 0) {
                if ((i12 & 896) == 0) {
                    if (composerImplMo1636j.m1596F(j10)) {
                        i16 = 256;
                    } else {
                        i16 = BuildConfig.SDK_TRUNCATE_LENGTH;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 8;
                if (i17 != 0) {
                    if ((i12 & 7168) == 0) {
                        c9797g2 = c9797g;
                        if (composerImplMo1636j.mo1665y(c9797g2)) {
                            i18 = 2048;
                        } else {
                            i18 = 1024;
                        }
                        i14 |= i18;
                    }
                    i19 = i13 & 16;
                    if (i19 != 0) {
                        if ((57344 & i12) == 0) {
                            j12 = j11;
                            if (composerImplMo1636j.m1596F(j12)) {
                                i20 = 16384;
                            } else {
                                i20 = 8192;
                            }
                            i14 |= i20;
                        }
                        i21 = i13 & 32;
                        if (i21 != 0) {
                            i14 |= 196608;
                        } else if ((i12 & 458752) == 0) {
                            if (composerImplMo1636j.m1594E(i10)) {
                                i22 = 131072;
                            } else {
                                i22 = 65536;
                            }
                            i14 |= i22;
                        }
                        i23 = i13 & 64;
                        if (i23 != 0) {
                            i14 |= 1572864;
                        } else if ((i12 & 3670016) == 0) {
                            if (composerImplMo1636j.m1598G(z10)) {
                                i24 = 1048576;
                            } else {
                                i24 = 524288;
                            }
                            i14 |= i24;
                        }
                        i25 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
                        if (i25 != 0) {
                            i14 |= 12582912;
                        } else if ((i12 & 29360128) == 0) {
                            if (composerImplMo1636j.m1594E(i11)) {
                                i26 = 8388608;
                            } else {
                                i26 = 4194304;
                            }
                            i14 |= i26;
                        }
                        if ((i12 & 234881024) != 0) {
                            i14 |= ((i13 & 256) == 0 || !composerImplMo1636j.mo1665y(c7218l)) ? 33554432 : 67108864;
                        }
                        if ((i14 & 191739611) == 38347922 || !composerImplMo1636j.mo1642m()) {
                            composerImplMo1636j.m1654s0();
                            if ((i12 & 1) != 0 || composerImplMo1636j.m1616X()) {
                                if (i33 != 0) {
                                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                                } else {
                                    interfaceC0500b2 = interfaceC0500b;
                                }
                                if (i15 != 0) {
                                    j13 = C9169u.f47703f;
                                } else {
                                    j13 = j10;
                                }
                                if (i17 != 0) {
                                    c9797g3 = null;
                                } else {
                                    c9797g3 = c9797g2;
                                }
                                if (i19 != 0) {
                                    j14 = C10023k.f50982c;
                                } else {
                                    j14 = j12;
                                }
                                if (i21 != 0) {
                                    i27 = 2;
                                } else {
                                    i27 = i10;
                                }
                                if (i23 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i25 != 0) {
                                    i28 = Integer.MAX_VALUE;
                                } else {
                                    i28 = i11;
                                }
                                if ((i13 & 256) != 0) {
                                    i14 &= -234881025;
                                    i29 = i28;
                                    j15 = j13;
                                    c9797g4 = c9797g3;
                                    j16 = j14;
                                    i30 = i27;
                                    z12 = z11;
                                    c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                                    interfaceC0500b3 = interfaceC0500b2;
                                } else {
                                    c7218l2 = c7218l;
                                    i29 = i28;
                                    interfaceC0500b3 = interfaceC0500b2;
                                    j15 = j13;
                                    c9797g4 = c9797g3;
                                    j16 = j14;
                                    i30 = i27;
                                    z12 = z11;
                                }
                            } else {
                                composerImplMo1636j.mo1650q();
                                if ((i13 & 256) != 0) {
                                    i14 &= -234881025;
                                }
                                j15 = j10;
                                i30 = i10;
                                z12 = z10;
                                i29 = i11;
                                c7218l2 = c7218l;
                                c9797g4 = c9797g2;
                                j16 = j12;
                                interfaceC0500b3 = interfaceC0500b;
                            }
                            composerImplMo1636j.m1610R();
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            c10586a = InterfaceC0476a.a.f3122a;
                            if (objM1619a0 == c10586a) {
                                objM1619a0 = C8573r0.m16684L0(c7218l2);
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a1 = composerImplMo1636j.m1619a0();
                            if (objM1619a1 == c10586a) {
                                objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                                composerImplMo1636j.m1597F0(objM1619a1);
                            }
                            composerImplMo1636j.m1609Q(false);
                            interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                            composerImplMo1636j.mo1622c(1157296644);
                            zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                            objM1619a2 = composerImplMo1636j.m1619a0();
                            if (zMo1665y || objM1619a2 == c10586a) {
                                objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                        InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                        C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                        if (interfaceC5312g1.getValue().booleanValue()) {
                                            interfaceC9619c2.mo12668E0();
                                        }
                                        return C9072e.f47360a;
                                    }
                                };
                                composerImplMo1636j.m1597F0(objM1619a2);
                            }
                            composerImplMo1636j.m1609Q(false);
                            InterfaceC0500b interfaceC0500bM1950c = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                            C7218l c7218l4 = (C7218l) interfaceC5312g0.getValue();
                            composerImplMo1636j.mo1622c(511388516);
                            zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                            objM1619a3 = composerImplMo1636j.m1619a0();
                            if (zMo1665y2 || objM1619a3 == c10586a) {
                                objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C7216j c7216j2 = c7216j;
                                        C5207g.m11111f(c7216j2, "result");
                                        C0692c c0692c = c7216j2.f40591b;
                                        int i34 = c0692c.f4561f - 1;
                                        c0692c.m2586c(i34);
                                        ArrayList arrayList = c0692c.f4563h;
                                        if (((C7208b) arrayList.get(C8573r0.m16731j0(i34, arrayList))).f40548a.mo2555l(i34)) {
                                            InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                            C7218l value = interfaceC5312g2.getValue();
                                            long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                            if (!(!C8573r0.m16670E0(j19))) {
                                                throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                            }
                                            interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                        } else {
                                            interfaceC5312g1.setValue(Boolean.TRUE);
                                        }
                                        return C9072e.f47360a;
                                    }
                                };
                                composerImplMo1636j.m1597F0(objM1619a3);
                            }
                            composerImplMo1636j.m1609Q(false);
                            int i34 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                            int i35 = i14 >> 12;
                            InterfaceC0500b interfaceC0500b5 = interfaceC0500b3;
                            composerImpl = composerImplMo1636j;
                            TextKt.m1576c(str, interfaceC0500bM1950c, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l4, composerImpl, i34, (i35 & 14) | (i35 & 112) | (i35 & 896) | (i35 & 7168), 504);
                            j17 = j15;
                            c9797g5 = c9797g4;
                            j18 = j16;
                            i31 = i30;
                            z13 = z12;
                            i32 = i29;
                            c7218l3 = c7218l2;
                            interfaceC0500b4 = interfaceC0500b5;
                        } else {
                            composerImplMo1636j.mo1650q();
                            interfaceC0500b4 = interfaceC0500b;
                            j17 = j10;
                            z13 = z10;
                            c9797g5 = c9797g2;
                            j18 = j12;
                            composerImpl = composerImplMo1636j;
                            i31 = i10;
                            i32 = i11;
                            c7218l3 = c7218l;
                        }
                        c5332q0M1612T = composerImpl.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                num.intValue();
                                AutoSizedTextKt.m10305a(str, interfaceC0500b4, j17, c9797g5, j18, i31, z13, i32, c7218l3, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i14 |= 24576;
                    j12 = j11;
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        i14 |= 196608;
                    } else if ((i12 & 458752) == 0) {
                        if (composerImplMo1636j.m1594E(i10)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 3670016) == 0) {
                        if (composerImplMo1636j.m1598G(z10)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                    i25 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
                    if (i25 != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 29360128) == 0) {
                        if (composerImplMo1636j.m1594E(i11)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    if ((i12 & 234881024) != 0) {
                        i14 |= ((i13 & 256) == 0 || !composerImplMo1636j.mo1665y(c7218l)) ? 33554432 : 67108864;
                    }
                    if ((i14 & 191739611) == 38347922) {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i33 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                j13 = C9169u.f47703f;
                            } else {
                                j13 = j10;
                            }
                            if (i17 != 0) {
                                c9797g3 = null;
                            } else {
                                c9797g3 = c9797g2;
                            }
                            if (i19 != 0) {
                                j14 = C10023k.f50982c;
                            } else {
                                j14 = j12;
                            }
                            if (i21 != 0) {
                                i27 = 2;
                            } else {
                                i27 = i10;
                            }
                            if (i23 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i25 != 0) {
                                i28 = Integer.MAX_VALUE;
                            } else {
                                i28 = i11;
                            }
                            if ((i13 & 256) != 0) {
                                i14 &= -234881025;
                                i29 = i28;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                                interfaceC0500b3 = interfaceC0500b2;
                            } else {
                                c7218l2 = c7218l;
                                i29 = i28;
                                interfaceC0500b3 = interfaceC0500b2;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                            }
                        } else {
                            if (i33 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                j13 = C9169u.f47703f;
                            } else {
                                j13 = j10;
                            }
                            if (i17 != 0) {
                                c9797g3 = null;
                            } else {
                                c9797g3 = c9797g2;
                            }
                            if (i19 != 0) {
                                j14 = C10023k.f50982c;
                            } else {
                                j14 = j12;
                            }
                            if (i21 != 0) {
                                i27 = 2;
                            } else {
                                i27 = i10;
                            }
                            if (i23 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i25 != 0) {
                                i28 = Integer.MAX_VALUE;
                            } else {
                                i28 = i11;
                            }
                            if ((i13 & 256) != 0) {
                                i14 &= -234881025;
                                i29 = i28;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                                interfaceC0500b3 = interfaceC0500b2;
                            } else {
                                c7218l2 = c7218l;
                                i29 = i28;
                                interfaceC0500b3 = interfaceC0500b2;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        c10586a = InterfaceC0476a.a.f3122a;
                        if (objM1619a0 == c10586a) {
                            objM1619a0 = C8573r0.m16684L0(c7218l2);
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a1 = composerImplMo1636j.m1619a0();
                        if (objM1619a1 == c10586a) {
                            objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                            composerImplMo1636j.m1597F0(objM1619a1);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                        composerImplMo1636j.mo1622c(1157296644);
                        zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                        objM1619a2 = composerImplMo1636j.m1619a0();
                        if (zMo1665y) {
                            objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                    InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                    C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                    if (interfaceC5312g1.getValue().booleanValue()) {
                                        interfaceC9619c2.mo12668E0();
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        } else {
                            objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                    InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                    C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                    if (interfaceC5312g1.getValue().booleanValue()) {
                                        interfaceC9619c2.mo12668E0();
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        }
                        composerImplMo1636j.m1609Q(false);
                        InterfaceC0500b interfaceC0500bM1950c2 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                        C7218l c7218l5 = (C7218l) interfaceC5312g0.getValue();
                        composerImplMo1636j.mo1622c(511388516);
                        zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                        objM1619a3 = composerImplMo1636j.m1619a0();
                        if (zMo1665y2) {
                            objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C7216j c7216j2 = c7216j;
                                    C5207g.m11111f(c7216j2, "result");
                                    C0692c c0692c = c7216j2.f40591b;
                                    int i36 = c0692c.f4561f - 1;
                                    c0692c.m2586c(i36);
                                    ArrayList arrayList = c0692c.f4563h;
                                    if (((C7208b) arrayList.get(C8573r0.m16731j0(i36, arrayList))).f40548a.mo2555l(i36)) {
                                        InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                        C7218l value = interfaceC5312g2.getValue();
                                        long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                        if (!(!C8573r0.m16670E0(j19))) {
                                            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                        }
                                        interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                    } else {
                                        interfaceC5312g1.setValue(Boolean.TRUE);
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a3);
                        } else {
                            objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C7216j c7216j2 = c7216j;
                                    C5207g.m11111f(c7216j2, "result");
                                    C0692c c0692c = c7216j2.f40591b;
                                    int i36 = c0692c.f4561f - 1;
                                    c0692c.m2586c(i36);
                                    ArrayList arrayList = c0692c.f4563h;
                                    if (((C7208b) arrayList.get(C8573r0.m16731j0(i36, arrayList))).f40548a.mo2555l(i36)) {
                                        InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                        C7218l value = interfaceC5312g2.getValue();
                                        long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                        if (!(!C8573r0.m16670E0(j19))) {
                                            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                        }
                                        interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                    } else {
                                        interfaceC5312g1.setValue(Boolean.TRUE);
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a3);
                        }
                        composerImplMo1636j.m1609Q(false);
                        int i36 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                        int i37 = i14 >> 12;
                        InterfaceC0500b interfaceC0500b6 = interfaceC0500b3;
                        composerImpl = composerImplMo1636j;
                        TextKt.m1576c(str, interfaceC0500bM1950c2, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l5, composerImpl, i36, (i37 & 14) | (i37 & 112) | (i37 & 896) | (i37 & 7168), 504);
                        j17 = j15;
                        c9797g5 = c9797g4;
                        j18 = j16;
                        i31 = i30;
                        z13 = z12;
                        i32 = i29;
                        c7218l3 = c7218l2;
                        interfaceC0500b4 = interfaceC0500b6;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i33 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                j13 = C9169u.f47703f;
                            } else {
                                j13 = j10;
                            }
                            if (i17 != 0) {
                                c9797g3 = null;
                            } else {
                                c9797g3 = c9797g2;
                            }
                            if (i19 != 0) {
                                j14 = C10023k.f50982c;
                            } else {
                                j14 = j12;
                            }
                            if (i21 != 0) {
                                i27 = 2;
                            } else {
                                i27 = i10;
                            }
                            if (i23 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i25 != 0) {
                                i28 = Integer.MAX_VALUE;
                            } else {
                                i28 = i11;
                            }
                            if ((i13 & 256) != 0) {
                                i14 &= -234881025;
                                i29 = i28;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                                interfaceC0500b3 = interfaceC0500b2;
                            } else {
                                c7218l2 = c7218l;
                                i29 = i28;
                                interfaceC0500b3 = interfaceC0500b2;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                            }
                        } else {
                            if (i33 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                j13 = C9169u.f47703f;
                            } else {
                                j13 = j10;
                            }
                            if (i17 != 0) {
                                c9797g3 = null;
                            } else {
                                c9797g3 = c9797g2;
                            }
                            if (i19 != 0) {
                                j14 = C10023k.f50982c;
                            } else {
                                j14 = j12;
                            }
                            if (i21 != 0) {
                                i27 = 2;
                            } else {
                                i27 = i10;
                            }
                            if (i23 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i25 != 0) {
                                i28 = Integer.MAX_VALUE;
                            } else {
                                i28 = i11;
                            }
                            if ((i13 & 256) != 0) {
                                i14 &= -234881025;
                                i29 = i28;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                                interfaceC0500b3 = interfaceC0500b2;
                            } else {
                                c7218l2 = c7218l;
                                i29 = i28;
                                interfaceC0500b3 = interfaceC0500b2;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        c10586a = InterfaceC0476a.a.f3122a;
                        if (objM1619a0 == c10586a) {
                            objM1619a0 = C8573r0.m16684L0(c7218l2);
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a1 = composerImplMo1636j.m1619a0();
                        if (objM1619a1 == c10586a) {
                            objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                            composerImplMo1636j.m1597F0(objM1619a1);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                        composerImplMo1636j.mo1622c(1157296644);
                        zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                        objM1619a2 = composerImplMo1636j.m1619a0();
                        if (zMo1665y) {
                            objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                    InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                    C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                    if (interfaceC5312g1.getValue().booleanValue()) {
                                        interfaceC9619c2.mo12668E0();
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        } else {
                            objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                    InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                    C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                    if (interfaceC5312g1.getValue().booleanValue()) {
                                        interfaceC9619c2.mo12668E0();
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        }
                        composerImplMo1636j.m1609Q(false);
                        InterfaceC0500b interfaceC0500bM1950c3 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                        C7218l c7218l6 = (C7218l) interfaceC5312g0.getValue();
                        composerImplMo1636j.mo1622c(511388516);
                        zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                        objM1619a3 = composerImplMo1636j.m1619a0();
                        if (zMo1665y2) {
                            objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C7216j c7216j2 = c7216j;
                                    C5207g.m11111f(c7216j2, "result");
                                    C0692c c0692c = c7216j2.f40591b;
                                    int i38 = c0692c.f4561f - 1;
                                    c0692c.m2586c(i38);
                                    ArrayList arrayList = c0692c.f4563h;
                                    if (((C7208b) arrayList.get(C8573r0.m16731j0(i38, arrayList))).f40548a.mo2555l(i38)) {
                                        InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                        C7218l value = interfaceC5312g2.getValue();
                                        long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                        if (!(!C8573r0.m16670E0(j19))) {
                                            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                        }
                                        interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                    } else {
                                        interfaceC5312g1.setValue(Boolean.TRUE);
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a3);
                        } else {
                            objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C7216j c7216j2 = c7216j;
                                    C5207g.m11111f(c7216j2, "result");
                                    C0692c c0692c = c7216j2.f40591b;
                                    int i38 = c0692c.f4561f - 1;
                                    c0692c.m2586c(i38);
                                    ArrayList arrayList = c0692c.f4563h;
                                    if (((C7208b) arrayList.get(C8573r0.m16731j0(i38, arrayList))).f40548a.mo2555l(i38)) {
                                        InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                        C7218l value = interfaceC5312g2.getValue();
                                        long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                        if (!(!C8573r0.m16670E0(j19))) {
                                            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                        }
                                        interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                    } else {
                                        interfaceC5312g1.setValue(Boolean.TRUE);
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a3);
                        }
                        composerImplMo1636j.m1609Q(false);
                        int i38 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                        int i39 = i14 >> 12;
                        InterfaceC0500b interfaceC0500b7 = interfaceC0500b3;
                        composerImpl = composerImplMo1636j;
                        TextKt.m1576c(str, interfaceC0500bM1950c3, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l6, composerImpl, i38, (i39 & 14) | (i39 & 112) | (i39 & 896) | (i39 & 7168), 504);
                        j17 = j15;
                        c9797g5 = c9797g4;
                        j18 = j16;
                        i31 = i30;
                        z13 = z12;
                        i32 = i29;
                        c7218l3 = c7218l2;
                        interfaceC0500b4 = interfaceC0500b7;
                    }
                    c5332q0M1612T = composerImpl.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            AutoSizedTextKt.m10305a(str, interfaceC0500b4, j17, c9797g5, j18, i31, z13, i32, c7218l3, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                            return C9072e.f47360a;
                        }
                    };
                }
                i14 |= 3072;
                c9797g2 = c9797g;
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((57344 & i12) == 0) {
                        j12 = j11;
                        if (composerImplMo1636j.m1596F(j12)) {
                            i20 = 16384;
                        } else {
                            i20 = 8192;
                        }
                        i14 |= i20;
                    }
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        i14 |= 196608;
                    } else if ((i12 & 458752) == 0) {
                        if (composerImplMo1636j.m1594E(i10)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 3670016) == 0) {
                        if (composerImplMo1636j.m1598G(z10)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                    i25 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
                    if (i25 != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 29360128) == 0) {
                        if (composerImplMo1636j.m1594E(i11)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    if ((i12 & 234881024) != 0) {
                        i14 |= ((i13 & 256) == 0 || !composerImplMo1636j.mo1665y(c7218l)) ? 33554432 : 67108864;
                    }
                    if ((i14 & 191739611) == 38347922) {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i33 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                j13 = C9169u.f47703f;
                            } else {
                                j13 = j10;
                            }
                            if (i17 != 0) {
                                c9797g3 = null;
                            } else {
                                c9797g3 = c9797g2;
                            }
                            if (i19 != 0) {
                                j14 = C10023k.f50982c;
                            } else {
                                j14 = j12;
                            }
                            if (i21 != 0) {
                                i27 = 2;
                            } else {
                                i27 = i10;
                            }
                            if (i23 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i25 != 0) {
                                i28 = Integer.MAX_VALUE;
                            } else {
                                i28 = i11;
                            }
                            if ((i13 & 256) != 0) {
                                i14 &= -234881025;
                                i29 = i28;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                                interfaceC0500b3 = interfaceC0500b2;
                            } else {
                                c7218l2 = c7218l;
                                i29 = i28;
                                interfaceC0500b3 = interfaceC0500b2;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                            }
                        } else {
                            if (i33 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                j13 = C9169u.f47703f;
                            } else {
                                j13 = j10;
                            }
                            if (i17 != 0) {
                                c9797g3 = null;
                            } else {
                                c9797g3 = c9797g2;
                            }
                            if (i19 != 0) {
                                j14 = C10023k.f50982c;
                            } else {
                                j14 = j12;
                            }
                            if (i21 != 0) {
                                i27 = 2;
                            } else {
                                i27 = i10;
                            }
                            if (i23 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i25 != 0) {
                                i28 = Integer.MAX_VALUE;
                            } else {
                                i28 = i11;
                            }
                            if ((i13 & 256) != 0) {
                                i14 &= -234881025;
                                i29 = i28;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                                interfaceC0500b3 = interfaceC0500b2;
                            } else {
                                c7218l2 = c7218l;
                                i29 = i28;
                                interfaceC0500b3 = interfaceC0500b2;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        c10586a = InterfaceC0476a.a.f3122a;
                        if (objM1619a0 == c10586a) {
                            objM1619a0 = C8573r0.m16684L0(c7218l2);
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a1 = composerImplMo1636j.m1619a0();
                        if (objM1619a1 == c10586a) {
                            objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                            composerImplMo1636j.m1597F0(objM1619a1);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                        composerImplMo1636j.mo1622c(1157296644);
                        zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                        objM1619a2 = composerImplMo1636j.m1619a0();
                        if (zMo1665y) {
                            objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                    InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                    C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                    if (interfaceC5312g1.getValue().booleanValue()) {
                                        interfaceC9619c2.mo12668E0();
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        } else {
                            objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                    InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                    C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                    if (interfaceC5312g1.getValue().booleanValue()) {
                                        interfaceC9619c2.mo12668E0();
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        }
                        composerImplMo1636j.m1609Q(false);
                        InterfaceC0500b interfaceC0500bM1950c4 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                        C7218l c7218l7 = (C7218l) interfaceC5312g0.getValue();
                        composerImplMo1636j.mo1622c(511388516);
                        zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                        objM1619a3 = composerImplMo1636j.m1619a0();
                        if (zMo1665y2) {
                            objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C7216j c7216j2 = c7216j;
                                    C5207g.m11111f(c7216j2, "result");
                                    C0692c c0692c = c7216j2.f40591b;
                                    int i310 = c0692c.f4561f - 1;
                                    c0692c.m2586c(i310);
                                    ArrayList arrayList = c0692c.f4563h;
                                    if (((C7208b) arrayList.get(C8573r0.m16731j0(i310, arrayList))).f40548a.mo2555l(i310)) {
                                        InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                        C7218l value = interfaceC5312g2.getValue();
                                        long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                        if (!(!C8573r0.m16670E0(j19))) {
                                            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                        }
                                        interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                    } else {
                                        interfaceC5312g1.setValue(Boolean.TRUE);
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a3);
                        } else {
                            objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C7216j c7216j2 = c7216j;
                                    C5207g.m11111f(c7216j2, "result");
                                    C0692c c0692c = c7216j2.f40591b;
                                    int i310 = c0692c.f4561f - 1;
                                    c0692c.m2586c(i310);
                                    ArrayList arrayList = c0692c.f4563h;
                                    if (((C7208b) arrayList.get(C8573r0.m16731j0(i310, arrayList))).f40548a.mo2555l(i310)) {
                                        InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                        C7218l value = interfaceC5312g2.getValue();
                                        long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                        if (!(!C8573r0.m16670E0(j19))) {
                                            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                        }
                                        interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                    } else {
                                        interfaceC5312g1.setValue(Boolean.TRUE);
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a3);
                        }
                        composerImplMo1636j.m1609Q(false);
                        int i310 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                        int i311 = i14 >> 12;
                        InterfaceC0500b interfaceC0500b8 = interfaceC0500b3;
                        composerImpl = composerImplMo1636j;
                        TextKt.m1576c(str, interfaceC0500bM1950c4, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l7, composerImpl, i310, (i311 & 14) | (i311 & 112) | (i311 & 896) | (i311 & 7168), 504);
                        j17 = j15;
                        c9797g5 = c9797g4;
                        j18 = j16;
                        i31 = i30;
                        z13 = z12;
                        i32 = i29;
                        c7218l3 = c7218l2;
                        interfaceC0500b4 = interfaceC0500b8;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i33 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                j13 = C9169u.f47703f;
                            } else {
                                j13 = j10;
                            }
                            if (i17 != 0) {
                                c9797g3 = null;
                            } else {
                                c9797g3 = c9797g2;
                            }
                            if (i19 != 0) {
                                j14 = C10023k.f50982c;
                            } else {
                                j14 = j12;
                            }
                            if (i21 != 0) {
                                i27 = 2;
                            } else {
                                i27 = i10;
                            }
                            if (i23 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i25 != 0) {
                                i28 = Integer.MAX_VALUE;
                            } else {
                                i28 = i11;
                            }
                            if ((i13 & 256) != 0) {
                                i14 &= -234881025;
                                i29 = i28;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                                interfaceC0500b3 = interfaceC0500b2;
                            } else {
                                c7218l2 = c7218l;
                                i29 = i28;
                                interfaceC0500b3 = interfaceC0500b2;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                            }
                        } else {
                            if (i33 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                j13 = C9169u.f47703f;
                            } else {
                                j13 = j10;
                            }
                            if (i17 != 0) {
                                c9797g3 = null;
                            } else {
                                c9797g3 = c9797g2;
                            }
                            if (i19 != 0) {
                                j14 = C10023k.f50982c;
                            } else {
                                j14 = j12;
                            }
                            if (i21 != 0) {
                                i27 = 2;
                            } else {
                                i27 = i10;
                            }
                            if (i23 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i25 != 0) {
                                i28 = Integer.MAX_VALUE;
                            } else {
                                i28 = i11;
                            }
                            if ((i13 & 256) != 0) {
                                i14 &= -234881025;
                                i29 = i28;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                                interfaceC0500b3 = interfaceC0500b2;
                            } else {
                                c7218l2 = c7218l;
                                i29 = i28;
                                interfaceC0500b3 = interfaceC0500b2;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        c10586a = InterfaceC0476a.a.f3122a;
                        if (objM1619a0 == c10586a) {
                            objM1619a0 = C8573r0.m16684L0(c7218l2);
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a1 = composerImplMo1636j.m1619a0();
                        if (objM1619a1 == c10586a) {
                            objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                            composerImplMo1636j.m1597F0(objM1619a1);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                        composerImplMo1636j.mo1622c(1157296644);
                        zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                        objM1619a2 = composerImplMo1636j.m1619a0();
                        if (zMo1665y) {
                            objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                    InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                    C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                    if (interfaceC5312g1.getValue().booleanValue()) {
                                        interfaceC9619c2.mo12668E0();
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        } else {
                            objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                    InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                    C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                    if (interfaceC5312g1.getValue().booleanValue()) {
                                        interfaceC9619c2.mo12668E0();
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        }
                        composerImplMo1636j.m1609Q(false);
                        InterfaceC0500b interfaceC0500bM1950c5 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                        C7218l c7218l8 = (C7218l) interfaceC5312g0.getValue();
                        composerImplMo1636j.mo1622c(511388516);
                        zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                        objM1619a3 = composerImplMo1636j.m1619a0();
                        if (zMo1665y2) {
                            objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C7216j c7216j2 = c7216j;
                                    C5207g.m11111f(c7216j2, "result");
                                    C0692c c0692c = c7216j2.f40591b;
                                    int i312 = c0692c.f4561f - 1;
                                    c0692c.m2586c(i312);
                                    ArrayList arrayList = c0692c.f4563h;
                                    if (((C7208b) arrayList.get(C8573r0.m16731j0(i312, arrayList))).f40548a.mo2555l(i312)) {
                                        InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                        C7218l value = interfaceC5312g2.getValue();
                                        long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                        if (!(!C8573r0.m16670E0(j19))) {
                                            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                        }
                                        interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                    } else {
                                        interfaceC5312g1.setValue(Boolean.TRUE);
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a3);
                        } else {
                            objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C7216j c7216j2 = c7216j;
                                    C5207g.m11111f(c7216j2, "result");
                                    C0692c c0692c = c7216j2.f40591b;
                                    int i312 = c0692c.f4561f - 1;
                                    c0692c.m2586c(i312);
                                    ArrayList arrayList = c0692c.f4563h;
                                    if (((C7208b) arrayList.get(C8573r0.m16731j0(i312, arrayList))).f40548a.mo2555l(i312)) {
                                        InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                        C7218l value = interfaceC5312g2.getValue();
                                        long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                        if (!(!C8573r0.m16670E0(j19))) {
                                            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                        }
                                        interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                    } else {
                                        interfaceC5312g1.setValue(Boolean.TRUE);
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a3);
                        }
                        composerImplMo1636j.m1609Q(false);
                        int i312 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                        int i313 = i14 >> 12;
                        InterfaceC0500b interfaceC0500b9 = interfaceC0500b3;
                        composerImpl = composerImplMo1636j;
                        TextKt.m1576c(str, interfaceC0500bM1950c5, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l8, composerImpl, i312, (i313 & 14) | (i313 & 112) | (i313 & 896) | (i313 & 7168), 504);
                        j17 = j15;
                        c9797g5 = c9797g4;
                        j18 = j16;
                        i31 = i30;
                        z13 = z12;
                        i32 = i29;
                        c7218l3 = c7218l2;
                        interfaceC0500b4 = interfaceC0500b9;
                    }
                    c5332q0M1612T = composerImpl.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            AutoSizedTextKt.m10305a(str, interfaceC0500b4, j17, c9797g5, j18, i31, z13, i32, c7218l3, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                            return C9072e.f47360a;
                        }
                    };
                }
                i14 |= 24576;
                j12 = j11;
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= 196608;
                } else if ((i12 & 458752) == 0) {
                    if (composerImplMo1636j.m1594E(i10)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerImplMo1636j.m1598G(z10)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                i25 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i25 != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (composerImplMo1636j.m1594E(i11)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i12 & 234881024) != 0) {
                    i14 |= ((i13 & 256) == 0 || !composerImplMo1636j.mo1665y(c7218l)) ? 33554432 : 67108864;
                }
                if ((i14 & 191739611) == 38347922) {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    } else {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    c10586a = InterfaceC0476a.a.f3122a;
                    if (objM1619a0 == c10586a) {
                        objM1619a0 = C8573r0.m16684L0(c7218l2);
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1950c6 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                    C7218l c7218l9 = (C7218l) interfaceC5312g0.getValue();
                    composerImplMo1636j.mo1622c(511388516);
                    zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a3 = composerImplMo1636j.m1619a0();
                    if (zMo1665y2) {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i314 = c0692c.f4561f - 1;
                                c0692c.m2586c(i314);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i314, arrayList))).f40548a.mo2555l(i314)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    } else {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i314 = c0692c.f4561f - 1;
                                c0692c.m2586c(i314);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i314, arrayList))).f40548a.mo2555l(i314)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    }
                    composerImplMo1636j.m1609Q(false);
                    int i314 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                    int i315 = i14 >> 12;
                    InterfaceC0500b interfaceC0500b10 = interfaceC0500b3;
                    composerImpl = composerImplMo1636j;
                    TextKt.m1576c(str, interfaceC0500bM1950c6, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l9, composerImpl, i314, (i315 & 14) | (i315 & 112) | (i315 & 896) | (i315 & 7168), 504);
                    j17 = j15;
                    c9797g5 = c9797g4;
                    j18 = j16;
                    i31 = i30;
                    z13 = z12;
                    i32 = i29;
                    c7218l3 = c7218l2;
                    interfaceC0500b4 = interfaceC0500b10;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    } else {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    c10586a = InterfaceC0476a.a.f3122a;
                    if (objM1619a0 == c10586a) {
                        objM1619a0 = C8573r0.m16684L0(c7218l2);
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1950c7 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                    C7218l c7218l10 = (C7218l) interfaceC5312g0.getValue();
                    composerImplMo1636j.mo1622c(511388516);
                    zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a3 = composerImplMo1636j.m1619a0();
                    if (zMo1665y2) {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i316 = c0692c.f4561f - 1;
                                c0692c.m2586c(i316);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i316, arrayList))).f40548a.mo2555l(i316)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    } else {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i316 = c0692c.f4561f - 1;
                                c0692c.m2586c(i316);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i316, arrayList))).f40548a.mo2555l(i316)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    }
                    composerImplMo1636j.m1609Q(false);
                    int i316 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                    int i317 = i14 >> 12;
                    InterfaceC0500b interfaceC0500b11 = interfaceC0500b3;
                    composerImpl = composerImplMo1636j;
                    TextKt.m1576c(str, interfaceC0500bM1950c7, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l10, composerImpl, i316, (i317 & 14) | (i317 & 112) | (i317 & 896) | (i317 & 7168), 504);
                    j17 = j15;
                    c9797g5 = c9797g4;
                    j18 = j16;
                    i31 = i30;
                    z13 = z12;
                    i32 = i29;
                    c7218l3 = c7218l2;
                    interfaceC0500b4 = interfaceC0500b11;
                }
                c5332q0M1612T = composerImpl.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        AutoSizedTextKt.m10305a(str, interfaceC0500b4, j17, c9797g5, j18, i31, z13, i32, c7218l3, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 |= 384;
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 7168) == 0) {
                    c9797g2 = c9797g;
                    if (composerImplMo1636j.mo1665y(c9797g2)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((57344 & i12) == 0) {
                        j12 = j11;
                        if (composerImplMo1636j.m1596F(j12)) {
                            i20 = 16384;
                        } else {
                            i20 = 8192;
                        }
                        i14 |= i20;
                    }
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        i14 |= 196608;
                    } else if ((i12 & 458752) == 0) {
                        if (composerImplMo1636j.m1594E(i10)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 3670016) == 0) {
                        if (composerImplMo1636j.m1598G(z10)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                    i25 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
                    if (i25 != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 29360128) == 0) {
                        if (composerImplMo1636j.m1594E(i11)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    if ((i12 & 234881024) != 0) {
                        i14 |= ((i13 & 256) == 0 || !composerImplMo1636j.mo1665y(c7218l)) ? 33554432 : 67108864;
                    }
                    if ((i14 & 191739611) == 38347922) {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i33 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                j13 = C9169u.f47703f;
                            } else {
                                j13 = j10;
                            }
                            if (i17 != 0) {
                                c9797g3 = null;
                            } else {
                                c9797g3 = c9797g2;
                            }
                            if (i19 != 0) {
                                j14 = C10023k.f50982c;
                            } else {
                                j14 = j12;
                            }
                            if (i21 != 0) {
                                i27 = 2;
                            } else {
                                i27 = i10;
                            }
                            if (i23 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i25 != 0) {
                                i28 = Integer.MAX_VALUE;
                            } else {
                                i28 = i11;
                            }
                            if ((i13 & 256) != 0) {
                                i14 &= -234881025;
                                i29 = i28;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                                interfaceC0500b3 = interfaceC0500b2;
                            } else {
                                c7218l2 = c7218l;
                                i29 = i28;
                                interfaceC0500b3 = interfaceC0500b2;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                            }
                        } else {
                            if (i33 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                j13 = C9169u.f47703f;
                            } else {
                                j13 = j10;
                            }
                            if (i17 != 0) {
                                c9797g3 = null;
                            } else {
                                c9797g3 = c9797g2;
                            }
                            if (i19 != 0) {
                                j14 = C10023k.f50982c;
                            } else {
                                j14 = j12;
                            }
                            if (i21 != 0) {
                                i27 = 2;
                            } else {
                                i27 = i10;
                            }
                            if (i23 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i25 != 0) {
                                i28 = Integer.MAX_VALUE;
                            } else {
                                i28 = i11;
                            }
                            if ((i13 & 256) != 0) {
                                i14 &= -234881025;
                                i29 = i28;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                                interfaceC0500b3 = interfaceC0500b2;
                            } else {
                                c7218l2 = c7218l;
                                i29 = i28;
                                interfaceC0500b3 = interfaceC0500b2;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        c10586a = InterfaceC0476a.a.f3122a;
                        if (objM1619a0 == c10586a) {
                            objM1619a0 = C8573r0.m16684L0(c7218l2);
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a1 = composerImplMo1636j.m1619a0();
                        if (objM1619a1 == c10586a) {
                            objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                            composerImplMo1636j.m1597F0(objM1619a1);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                        composerImplMo1636j.mo1622c(1157296644);
                        zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                        objM1619a2 = composerImplMo1636j.m1619a0();
                        if (zMo1665y) {
                            objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                    InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                    C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                    if (interfaceC5312g1.getValue().booleanValue()) {
                                        interfaceC9619c2.mo12668E0();
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        } else {
                            objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                    InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                    C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                    if (interfaceC5312g1.getValue().booleanValue()) {
                                        interfaceC9619c2.mo12668E0();
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        }
                        composerImplMo1636j.m1609Q(false);
                        InterfaceC0500b interfaceC0500bM1950c8 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                        C7218l c7218l11 = (C7218l) interfaceC5312g0.getValue();
                        composerImplMo1636j.mo1622c(511388516);
                        zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                        objM1619a3 = composerImplMo1636j.m1619a0();
                        if (zMo1665y2) {
                            objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C7216j c7216j2 = c7216j;
                                    C5207g.m11111f(c7216j2, "result");
                                    C0692c c0692c = c7216j2.f40591b;
                                    int i318 = c0692c.f4561f - 1;
                                    c0692c.m2586c(i318);
                                    ArrayList arrayList = c0692c.f4563h;
                                    if (((C7208b) arrayList.get(C8573r0.m16731j0(i318, arrayList))).f40548a.mo2555l(i318)) {
                                        InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                        C7218l value = interfaceC5312g2.getValue();
                                        long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                        if (!(!C8573r0.m16670E0(j19))) {
                                            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                        }
                                        interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                    } else {
                                        interfaceC5312g1.setValue(Boolean.TRUE);
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a3);
                        } else {
                            objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C7216j c7216j2 = c7216j;
                                    C5207g.m11111f(c7216j2, "result");
                                    C0692c c0692c = c7216j2.f40591b;
                                    int i318 = c0692c.f4561f - 1;
                                    c0692c.m2586c(i318);
                                    ArrayList arrayList = c0692c.f4563h;
                                    if (((C7208b) arrayList.get(C8573r0.m16731j0(i318, arrayList))).f40548a.mo2555l(i318)) {
                                        InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                        C7218l value = interfaceC5312g2.getValue();
                                        long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                        if (!(!C8573r0.m16670E0(j19))) {
                                            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                        }
                                        interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                    } else {
                                        interfaceC5312g1.setValue(Boolean.TRUE);
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a3);
                        }
                        composerImplMo1636j.m1609Q(false);
                        int i318 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                        int i319 = i14 >> 12;
                        InterfaceC0500b interfaceC0500b12 = interfaceC0500b3;
                        composerImpl = composerImplMo1636j;
                        TextKt.m1576c(str, interfaceC0500bM1950c8, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l11, composerImpl, i318, (i319 & 14) | (i319 & 112) | (i319 & 896) | (i319 & 7168), 504);
                        j17 = j15;
                        c9797g5 = c9797g4;
                        j18 = j16;
                        i31 = i30;
                        z13 = z12;
                        i32 = i29;
                        c7218l3 = c7218l2;
                        interfaceC0500b4 = interfaceC0500b12;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i33 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                j13 = C9169u.f47703f;
                            } else {
                                j13 = j10;
                            }
                            if (i17 != 0) {
                                c9797g3 = null;
                            } else {
                                c9797g3 = c9797g2;
                            }
                            if (i19 != 0) {
                                j14 = C10023k.f50982c;
                            } else {
                                j14 = j12;
                            }
                            if (i21 != 0) {
                                i27 = 2;
                            } else {
                                i27 = i10;
                            }
                            if (i23 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i25 != 0) {
                                i28 = Integer.MAX_VALUE;
                            } else {
                                i28 = i11;
                            }
                            if ((i13 & 256) != 0) {
                                i14 &= -234881025;
                                i29 = i28;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                                interfaceC0500b3 = interfaceC0500b2;
                            } else {
                                c7218l2 = c7218l;
                                i29 = i28;
                                interfaceC0500b3 = interfaceC0500b2;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                            }
                        } else {
                            if (i33 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                j13 = C9169u.f47703f;
                            } else {
                                j13 = j10;
                            }
                            if (i17 != 0) {
                                c9797g3 = null;
                            } else {
                                c9797g3 = c9797g2;
                            }
                            if (i19 != 0) {
                                j14 = C10023k.f50982c;
                            } else {
                                j14 = j12;
                            }
                            if (i21 != 0) {
                                i27 = 2;
                            } else {
                                i27 = i10;
                            }
                            if (i23 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i25 != 0) {
                                i28 = Integer.MAX_VALUE;
                            } else {
                                i28 = i11;
                            }
                            if ((i13 & 256) != 0) {
                                i14 &= -234881025;
                                i29 = i28;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                                interfaceC0500b3 = interfaceC0500b2;
                            } else {
                                c7218l2 = c7218l;
                                i29 = i28;
                                interfaceC0500b3 = interfaceC0500b2;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q9 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        c10586a = InterfaceC0476a.a.f3122a;
                        if (objM1619a0 == c10586a) {
                            objM1619a0 = C8573r0.m16684L0(c7218l2);
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a1 = composerImplMo1636j.m1619a0();
                        if (objM1619a1 == c10586a) {
                            objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                            composerImplMo1636j.m1597F0(objM1619a1);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                        composerImplMo1636j.mo1622c(1157296644);
                        zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                        objM1619a2 = composerImplMo1636j.m1619a0();
                        if (zMo1665y) {
                            objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                    InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                    C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                    if (interfaceC5312g1.getValue().booleanValue()) {
                                        interfaceC9619c2.mo12668E0();
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        } else {
                            objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                    InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                    C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                    if (interfaceC5312g1.getValue().booleanValue()) {
                                        interfaceC9619c2.mo12668E0();
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        }
                        composerImplMo1636j.m1609Q(false);
                        InterfaceC0500b interfaceC0500bM1950c9 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                        C7218l c7218l12 = (C7218l) interfaceC5312g0.getValue();
                        composerImplMo1636j.mo1622c(511388516);
                        zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                        objM1619a3 = composerImplMo1636j.m1619a0();
                        if (zMo1665y2) {
                            objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C7216j c7216j2 = c7216j;
                                    C5207g.m11111f(c7216j2, "result");
                                    C0692c c0692c = c7216j2.f40591b;
                                    int i3110 = c0692c.f4561f - 1;
                                    c0692c.m2586c(i3110);
                                    ArrayList arrayList = c0692c.f4563h;
                                    if (((C7208b) arrayList.get(C8573r0.m16731j0(i3110, arrayList))).f40548a.mo2555l(i3110)) {
                                        InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                        C7218l value = interfaceC5312g2.getValue();
                                        long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                        if (!(!C8573r0.m16670E0(j19))) {
                                            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                        }
                                        interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                    } else {
                                        interfaceC5312g1.setValue(Boolean.TRUE);
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a3);
                        } else {
                            objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C7216j c7216j2 = c7216j;
                                    C5207g.m11111f(c7216j2, "result");
                                    C0692c c0692c = c7216j2.f40591b;
                                    int i3110 = c0692c.f4561f - 1;
                                    c0692c.m2586c(i3110);
                                    ArrayList arrayList = c0692c.f4563h;
                                    if (((C7208b) arrayList.get(C8573r0.m16731j0(i3110, arrayList))).f40548a.mo2555l(i3110)) {
                                        InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                        C7218l value = interfaceC5312g2.getValue();
                                        long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                        if (!(!C8573r0.m16670E0(j19))) {
                                            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                        }
                                        interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                    } else {
                                        interfaceC5312g1.setValue(Boolean.TRUE);
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a3);
                        }
                        composerImplMo1636j.m1609Q(false);
                        int i3110 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                        int i3111 = i14 >> 12;
                        InterfaceC0500b interfaceC0500b13 = interfaceC0500b3;
                        composerImpl = composerImplMo1636j;
                        TextKt.m1576c(str, interfaceC0500bM1950c9, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l12, composerImpl, i3110, (i3111 & 14) | (i3111 & 112) | (i3111 & 896) | (i3111 & 7168), 504);
                        j17 = j15;
                        c9797g5 = c9797g4;
                        j18 = j16;
                        i31 = i30;
                        z13 = z12;
                        i32 = i29;
                        c7218l3 = c7218l2;
                        interfaceC0500b4 = interfaceC0500b13;
                    }
                    c5332q0M1612T = composerImpl.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            AutoSizedTextKt.m10305a(str, interfaceC0500b4, j17, c9797g5, j18, i31, z13, i32, c7218l3, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                            return C9072e.f47360a;
                        }
                    };
                }
                i14 |= 24576;
                j12 = j11;
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= 196608;
                } else if ((i12 & 458752) == 0) {
                    if (composerImplMo1636j.m1594E(i10)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerImplMo1636j.m1598G(z10)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                i25 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i25 != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (composerImplMo1636j.m1594E(i11)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i12 & 234881024) != 0) {
                    i14 |= ((i13 & 256) == 0 || !composerImplMo1636j.mo1665y(c7218l)) ? 33554432 : 67108864;
                }
                if ((i14 & 191739611) == 38347922) {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    } else {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q10 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    c10586a = InterfaceC0476a.a.f3122a;
                    if (objM1619a0 == c10586a) {
                        objM1619a0 = C8573r0.m16684L0(c7218l2);
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1950c10 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                    C7218l c7218l13 = (C7218l) interfaceC5312g0.getValue();
                    composerImplMo1636j.mo1622c(511388516);
                    zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a3 = composerImplMo1636j.m1619a0();
                    if (zMo1665y2) {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i3112 = c0692c.f4561f - 1;
                                c0692c.m2586c(i3112);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i3112, arrayList))).f40548a.mo2555l(i3112)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    } else {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i3112 = c0692c.f4561f - 1;
                                c0692c.m2586c(i3112);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i3112, arrayList))).f40548a.mo2555l(i3112)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    }
                    composerImplMo1636j.m1609Q(false);
                    int i3112 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                    int i3113 = i14 >> 12;
                    InterfaceC0500b interfaceC0500b14 = interfaceC0500b3;
                    composerImpl = composerImplMo1636j;
                    TextKt.m1576c(str, interfaceC0500bM1950c10, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l13, composerImpl, i3112, (i3113 & 14) | (i3113 & 112) | (i3113 & 896) | (i3113 & 7168), 504);
                    j17 = j15;
                    c9797g5 = c9797g4;
                    j18 = j16;
                    i31 = i30;
                    z13 = z12;
                    i32 = i29;
                    c7218l3 = c7218l2;
                    interfaceC0500b4 = interfaceC0500b14;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    } else {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    c10586a = InterfaceC0476a.a.f3122a;
                    if (objM1619a0 == c10586a) {
                        objM1619a0 = C8573r0.m16684L0(c7218l2);
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1950c11 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                    C7218l c7218l14 = (C7218l) interfaceC5312g0.getValue();
                    composerImplMo1636j.mo1622c(511388516);
                    zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a3 = composerImplMo1636j.m1619a0();
                    if (zMo1665y2) {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i3114 = c0692c.f4561f - 1;
                                c0692c.m2586c(i3114);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i3114, arrayList))).f40548a.mo2555l(i3114)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    } else {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i3114 = c0692c.f4561f - 1;
                                c0692c.m2586c(i3114);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i3114, arrayList))).f40548a.mo2555l(i3114)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    }
                    composerImplMo1636j.m1609Q(false);
                    int i3114 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                    int i3115 = i14 >> 12;
                    InterfaceC0500b interfaceC0500b15 = interfaceC0500b3;
                    composerImpl = composerImplMo1636j;
                    TextKt.m1576c(str, interfaceC0500bM1950c11, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l14, composerImpl, i3114, (i3115 & 14) | (i3115 & 112) | (i3115 & 896) | (i3115 & 7168), 504);
                    j17 = j15;
                    c9797g5 = c9797g4;
                    j18 = j16;
                    i31 = i30;
                    z13 = z12;
                    i32 = i29;
                    c7218l3 = c7218l2;
                    interfaceC0500b4 = interfaceC0500b15;
                }
                c5332q0M1612T = composerImpl.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        AutoSizedTextKt.m10305a(str, interfaceC0500b4, j17, c9797g5, j18, i31, z13, i32, c7218l3, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 |= 3072;
            c9797g2 = c9797g;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((57344 & i12) == 0) {
                    j12 = j11;
                    if (composerImplMo1636j.m1596F(j12)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= 196608;
                } else if ((i12 & 458752) == 0) {
                    if (composerImplMo1636j.m1594E(i10)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerImplMo1636j.m1598G(z10)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                i25 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i25 != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (composerImplMo1636j.m1594E(i11)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i12 & 234881024) != 0) {
                    i14 |= ((i13 & 256) == 0 || !composerImplMo1636j.mo1665y(c7218l)) ? 33554432 : 67108864;
                }
                if ((i14 & 191739611) == 38347922) {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    } else {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q12 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    c10586a = InterfaceC0476a.a.f3122a;
                    if (objM1619a0 == c10586a) {
                        objM1619a0 = C8573r0.m16684L0(c7218l2);
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1950c12 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                    C7218l c7218l15 = (C7218l) interfaceC5312g0.getValue();
                    composerImplMo1636j.mo1622c(511388516);
                    zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a3 = composerImplMo1636j.m1619a0();
                    if (zMo1665y2) {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i3116 = c0692c.f4561f - 1;
                                c0692c.m2586c(i3116);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i3116, arrayList))).f40548a.mo2555l(i3116)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    } else {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i3116 = c0692c.f4561f - 1;
                                c0692c.m2586c(i3116);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i3116, arrayList))).f40548a.mo2555l(i3116)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    }
                    composerImplMo1636j.m1609Q(false);
                    int i3116 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                    int i3117 = i14 >> 12;
                    InterfaceC0500b interfaceC0500b16 = interfaceC0500b3;
                    composerImpl = composerImplMo1636j;
                    TextKt.m1576c(str, interfaceC0500bM1950c12, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l15, composerImpl, i3116, (i3117 & 14) | (i3117 & 112) | (i3117 & 896) | (i3117 & 7168), 504);
                    j17 = j15;
                    c9797g5 = c9797g4;
                    j18 = j16;
                    i31 = i30;
                    z13 = z12;
                    i32 = i29;
                    c7218l3 = c7218l2;
                    interfaceC0500b4 = interfaceC0500b16;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    } else {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q13 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    c10586a = InterfaceC0476a.a.f3122a;
                    if (objM1619a0 == c10586a) {
                        objM1619a0 = C8573r0.m16684L0(c7218l2);
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1950c13 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                    C7218l c7218l16 = (C7218l) interfaceC5312g0.getValue();
                    composerImplMo1636j.mo1622c(511388516);
                    zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a3 = composerImplMo1636j.m1619a0();
                    if (zMo1665y2) {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i3118 = c0692c.f4561f - 1;
                                c0692c.m2586c(i3118);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i3118, arrayList))).f40548a.mo2555l(i3118)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    } else {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i3118 = c0692c.f4561f - 1;
                                c0692c.m2586c(i3118);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i3118, arrayList))).f40548a.mo2555l(i3118)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    }
                    composerImplMo1636j.m1609Q(false);
                    int i3118 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                    int i3119 = i14 >> 12;
                    InterfaceC0500b interfaceC0500b17 = interfaceC0500b3;
                    composerImpl = composerImplMo1636j;
                    TextKt.m1576c(str, interfaceC0500bM1950c13, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l16, composerImpl, i3118, (i3119 & 14) | (i3119 & 112) | (i3119 & 896) | (i3119 & 7168), 504);
                    j17 = j15;
                    c9797g5 = c9797g4;
                    j18 = j16;
                    i31 = i30;
                    z13 = z12;
                    i32 = i29;
                    c7218l3 = c7218l2;
                    interfaceC0500b4 = interfaceC0500b17;
                }
                c5332q0M1612T = composerImpl.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        AutoSizedTextKt.m10305a(str, interfaceC0500b4, j17, c9797g5, j18, i31, z13, i32, c7218l3, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 |= 24576;
            j12 = j11;
            i21 = i13 & 32;
            if (i21 != 0) {
                i14 |= 196608;
            } else if ((i12 & 458752) == 0) {
                if (composerImplMo1636j.m1594E(i10)) {
                    i22 = 131072;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (composerImplMo1636j.m1598G(z10)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i14 |= i24;
            }
            i25 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
            if (i25 != 0) {
                i14 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (composerImplMo1636j.m1594E(i11)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            if ((i12 & 234881024) != 0) {
                i14 |= ((i13 & 256) == 0 || !composerImplMo1636j.mo1665y(c7218l)) ? 33554432 : 67108864;
            }
            if ((i14 & 191739611) == 38347922) {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i33 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        j13 = C9169u.f47703f;
                    } else {
                        j13 = j10;
                    }
                    if (i17 != 0) {
                        c9797g3 = null;
                    } else {
                        c9797g3 = c9797g2;
                    }
                    if (i19 != 0) {
                        j14 = C10023k.f50982c;
                    } else {
                        j14 = j12;
                    }
                    if (i21 != 0) {
                        i27 = 2;
                    } else {
                        i27 = i10;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        i29 = i28;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        interfaceC0500b3 = interfaceC0500b2;
                    } else {
                        c7218l2 = c7218l;
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                    }
                } else {
                    if (i33 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        j13 = C9169u.f47703f;
                    } else {
                        j13 = j10;
                    }
                    if (i17 != 0) {
                        c9797g3 = null;
                    } else {
                        c9797g3 = c9797g2;
                    }
                    if (i19 != 0) {
                        j14 = C10023k.f50982c;
                    } else {
                        j14 = j12;
                    }
                    if (i21 != 0) {
                        i27 = 2;
                    } else {
                        i27 = i10;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        i29 = i28;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        interfaceC0500b3 = interfaceC0500b2;
                    } else {
                        c7218l2 = c7218l;
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q14 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                c10586a = InterfaceC0476a.a.f3122a;
                if (objM1619a0 == c10586a) {
                    objM1619a0 = C8573r0.m16684L0(c7218l2);
                    composerImplMo1636j.m1597F0(objM1619a0);
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a1 = composerImplMo1636j.m1619a0();
                if (objM1619a1 == c10586a) {
                    objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                    composerImplMo1636j.m1597F0(objM1619a1);
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                composerImplMo1636j.mo1622c(1157296644);
                zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                objM1619a2 = composerImplMo1636j.m1619a0();
                if (zMo1665y) {
                    objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                            InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                            C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                            if (interfaceC5312g1.getValue().booleanValue()) {
                                interfaceC9619c2.mo12668E0();
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                } else {
                    objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                            InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                            C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                            if (interfaceC5312g1.getValue().booleanValue()) {
                                interfaceC9619c2.mo12668E0();
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                }
                composerImplMo1636j.m1609Q(false);
                InterfaceC0500b interfaceC0500bM1950c14 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                C7218l c7218l17 = (C7218l) interfaceC5312g0.getValue();
                composerImplMo1636j.mo1622c(511388516);
                zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                objM1619a3 = composerImplMo1636j.m1619a0();
                if (zMo1665y2) {
                    objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C7216j c7216j2 = c7216j;
                            C5207g.m11111f(c7216j2, "result");
                            C0692c c0692c = c7216j2.f40591b;
                            int i31110 = c0692c.f4561f - 1;
                            c0692c.m2586c(i31110);
                            ArrayList arrayList = c0692c.f4563h;
                            if (((C7208b) arrayList.get(C8573r0.m16731j0(i31110, arrayList))).f40548a.mo2555l(i31110)) {
                                InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                C7218l value = interfaceC5312g2.getValue();
                                long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                if (!(!C8573r0.m16670E0(j19))) {
                                    throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                }
                                interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                            } else {
                                interfaceC5312g1.setValue(Boolean.TRUE);
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a3);
                } else {
                    objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C7216j c7216j2 = c7216j;
                            C5207g.m11111f(c7216j2, "result");
                            C0692c c0692c = c7216j2.f40591b;
                            int i31110 = c0692c.f4561f - 1;
                            c0692c.m2586c(i31110);
                            ArrayList arrayList = c0692c.f4563h;
                            if (((C7208b) arrayList.get(C8573r0.m16731j0(i31110, arrayList))).f40548a.mo2555l(i31110)) {
                                InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                C7218l value = interfaceC5312g2.getValue();
                                long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                if (!(!C8573r0.m16670E0(j19))) {
                                    throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                }
                                interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                            } else {
                                interfaceC5312g1.setValue(Boolean.TRUE);
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a3);
                }
                composerImplMo1636j.m1609Q(false);
                int i31110 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                int i31111 = i14 >> 12;
                InterfaceC0500b interfaceC0500b18 = interfaceC0500b3;
                composerImpl = composerImplMo1636j;
                TextKt.m1576c(str, interfaceC0500bM1950c14, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l17, composerImpl, i31110, (i31111 & 14) | (i31111 & 112) | (i31111 & 896) | (i31111 & 7168), 504);
                j17 = j15;
                c9797g5 = c9797g4;
                j18 = j16;
                i31 = i30;
                z13 = z12;
                i32 = i29;
                c7218l3 = c7218l2;
                interfaceC0500b4 = interfaceC0500b18;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i33 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        j13 = C9169u.f47703f;
                    } else {
                        j13 = j10;
                    }
                    if (i17 != 0) {
                        c9797g3 = null;
                    } else {
                        c9797g3 = c9797g2;
                    }
                    if (i19 != 0) {
                        j14 = C10023k.f50982c;
                    } else {
                        j14 = j12;
                    }
                    if (i21 != 0) {
                        i27 = 2;
                    } else {
                        i27 = i10;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        i29 = i28;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        interfaceC0500b3 = interfaceC0500b2;
                    } else {
                        c7218l2 = c7218l;
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                    }
                } else {
                    if (i33 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        j13 = C9169u.f47703f;
                    } else {
                        j13 = j10;
                    }
                    if (i17 != 0) {
                        c9797g3 = null;
                    } else {
                        c9797g3 = c9797g2;
                    }
                    if (i19 != 0) {
                        j14 = C10023k.f50982c;
                    } else {
                        j14 = j12;
                    }
                    if (i21 != 0) {
                        i27 = 2;
                    } else {
                        i27 = i10;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        i29 = i28;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        interfaceC0500b3 = interfaceC0500b2;
                    } else {
                        c7218l2 = c7218l;
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q15 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                c10586a = InterfaceC0476a.a.f3122a;
                if (objM1619a0 == c10586a) {
                    objM1619a0 = C8573r0.m16684L0(c7218l2);
                    composerImplMo1636j.m1597F0(objM1619a0);
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a1 = composerImplMo1636j.m1619a0();
                if (objM1619a1 == c10586a) {
                    objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                    composerImplMo1636j.m1597F0(objM1619a1);
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                composerImplMo1636j.mo1622c(1157296644);
                zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                objM1619a2 = composerImplMo1636j.m1619a0();
                if (zMo1665y) {
                    objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                            InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                            C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                            if (interfaceC5312g1.getValue().booleanValue()) {
                                interfaceC9619c2.mo12668E0();
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                } else {
                    objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                            InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                            C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                            if (interfaceC5312g1.getValue().booleanValue()) {
                                interfaceC9619c2.mo12668E0();
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                }
                composerImplMo1636j.m1609Q(false);
                InterfaceC0500b interfaceC0500bM1950c15 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                C7218l c7218l18 = (C7218l) interfaceC5312g0.getValue();
                composerImplMo1636j.mo1622c(511388516);
                zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                objM1619a3 = composerImplMo1636j.m1619a0();
                if (zMo1665y2) {
                    objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C7216j c7216j2 = c7216j;
                            C5207g.m11111f(c7216j2, "result");
                            C0692c c0692c = c7216j2.f40591b;
                            int i31112 = c0692c.f4561f - 1;
                            c0692c.m2586c(i31112);
                            ArrayList arrayList = c0692c.f4563h;
                            if (((C7208b) arrayList.get(C8573r0.m16731j0(i31112, arrayList))).f40548a.mo2555l(i31112)) {
                                InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                C7218l value = interfaceC5312g2.getValue();
                                long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                if (!(!C8573r0.m16670E0(j19))) {
                                    throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                }
                                interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                            } else {
                                interfaceC5312g1.setValue(Boolean.TRUE);
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a3);
                } else {
                    objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C7216j c7216j2 = c7216j;
                            C5207g.m11111f(c7216j2, "result");
                            C0692c c0692c = c7216j2.f40591b;
                            int i31112 = c0692c.f4561f - 1;
                            c0692c.m2586c(i31112);
                            ArrayList arrayList = c0692c.f4563h;
                            if (((C7208b) arrayList.get(C8573r0.m16731j0(i31112, arrayList))).f40548a.mo2555l(i31112)) {
                                InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                C7218l value = interfaceC5312g2.getValue();
                                long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                if (!(!C8573r0.m16670E0(j19))) {
                                    throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                }
                                interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                            } else {
                                interfaceC5312g1.setValue(Boolean.TRUE);
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a3);
                }
                composerImplMo1636j.m1609Q(false);
                int i31112 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                int i31113 = i14 >> 12;
                InterfaceC0500b interfaceC0500b19 = interfaceC0500b3;
                composerImpl = composerImplMo1636j;
                TextKt.m1576c(str, interfaceC0500bM1950c15, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l18, composerImpl, i31112, (i31113 & 14) | (i31113 & 112) | (i31113 & 896) | (i31113 & 7168), 504);
                j17 = j15;
                c9797g5 = c9797g4;
                j18 = j16;
                i31 = i30;
                z13 = z12;
                i32 = i29;
                c7218l3 = c7218l2;
                interfaceC0500b4 = interfaceC0500b19;
            }
            c5332q0M1612T = composerImpl.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    AutoSizedTextKt.m10305a(str, interfaceC0500b4, j17, c9797g5, j18, i31, z13, i32, c7218l3, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                    return C9072e.f47360a;
                }
            };
        }
        i14 |= 48;
        i15 = i13 & 4;
        if (i15 != 0) {
            if ((i12 & 896) == 0) {
                if (composerImplMo1636j.m1596F(j10)) {
                    i16 = 256;
                } else {
                    i16 = BuildConfig.SDK_TRUNCATE_LENGTH;
                }
                i14 |= i16;
            }
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 7168) == 0) {
                    c9797g2 = c9797g;
                    if (composerImplMo1636j.mo1665y(c9797g2)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((57344 & i12) == 0) {
                        j12 = j11;
                        if (composerImplMo1636j.m1596F(j12)) {
                            i20 = 16384;
                        } else {
                            i20 = 8192;
                        }
                        i14 |= i20;
                    }
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        i14 |= 196608;
                    } else if ((i12 & 458752) == 0) {
                        if (composerImplMo1636j.m1594E(i10)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 3670016) == 0) {
                        if (composerImplMo1636j.m1598G(z10)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                    i25 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
                    if (i25 != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 29360128) == 0) {
                        if (composerImplMo1636j.m1594E(i11)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    if ((i12 & 234881024) != 0) {
                        i14 |= ((i13 & 256) == 0 || !composerImplMo1636j.mo1665y(c7218l)) ? 33554432 : 67108864;
                    }
                    if ((i14 & 191739611) == 38347922) {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i33 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                j13 = C9169u.f47703f;
                            } else {
                                j13 = j10;
                            }
                            if (i17 != 0) {
                                c9797g3 = null;
                            } else {
                                c9797g3 = c9797g2;
                            }
                            if (i19 != 0) {
                                j14 = C10023k.f50982c;
                            } else {
                                j14 = j12;
                            }
                            if (i21 != 0) {
                                i27 = 2;
                            } else {
                                i27 = i10;
                            }
                            if (i23 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i25 != 0) {
                                i28 = Integer.MAX_VALUE;
                            } else {
                                i28 = i11;
                            }
                            if ((i13 & 256) != 0) {
                                i14 &= -234881025;
                                i29 = i28;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                                interfaceC0500b3 = interfaceC0500b2;
                            } else {
                                c7218l2 = c7218l;
                                i29 = i28;
                                interfaceC0500b3 = interfaceC0500b2;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                            }
                        } else {
                            if (i33 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                j13 = C9169u.f47703f;
                            } else {
                                j13 = j10;
                            }
                            if (i17 != 0) {
                                c9797g3 = null;
                            } else {
                                c9797g3 = c9797g2;
                            }
                            if (i19 != 0) {
                                j14 = C10023k.f50982c;
                            } else {
                                j14 = j12;
                            }
                            if (i21 != 0) {
                                i27 = 2;
                            } else {
                                i27 = i10;
                            }
                            if (i23 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i25 != 0) {
                                i28 = Integer.MAX_VALUE;
                            } else {
                                i28 = i11;
                            }
                            if ((i13 & 256) != 0) {
                                i14 &= -234881025;
                                i29 = i28;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                                interfaceC0500b3 = interfaceC0500b2;
                            } else {
                                c7218l2 = c7218l;
                                i29 = i28;
                                interfaceC0500b3 = interfaceC0500b2;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q16 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        c10586a = InterfaceC0476a.a.f3122a;
                        if (objM1619a0 == c10586a) {
                            objM1619a0 = C8573r0.m16684L0(c7218l2);
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a1 = composerImplMo1636j.m1619a0();
                        if (objM1619a1 == c10586a) {
                            objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                            composerImplMo1636j.m1597F0(objM1619a1);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                        composerImplMo1636j.mo1622c(1157296644);
                        zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                        objM1619a2 = composerImplMo1636j.m1619a0();
                        if (zMo1665y) {
                            objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                    InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                    C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                    if (interfaceC5312g1.getValue().booleanValue()) {
                                        interfaceC9619c2.mo12668E0();
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        } else {
                            objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                    InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                    C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                    if (interfaceC5312g1.getValue().booleanValue()) {
                                        interfaceC9619c2.mo12668E0();
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        }
                        composerImplMo1636j.m1609Q(false);
                        InterfaceC0500b interfaceC0500bM1950c16 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                        C7218l c7218l19 = (C7218l) interfaceC5312g0.getValue();
                        composerImplMo1636j.mo1622c(511388516);
                        zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                        objM1619a3 = composerImplMo1636j.m1619a0();
                        if (zMo1665y2) {
                            objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C7216j c7216j2 = c7216j;
                                    C5207g.m11111f(c7216j2, "result");
                                    C0692c c0692c = c7216j2.f40591b;
                                    int i31114 = c0692c.f4561f - 1;
                                    c0692c.m2586c(i31114);
                                    ArrayList arrayList = c0692c.f4563h;
                                    if (((C7208b) arrayList.get(C8573r0.m16731j0(i31114, arrayList))).f40548a.mo2555l(i31114)) {
                                        InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                        C7218l value = interfaceC5312g2.getValue();
                                        long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                        if (!(!C8573r0.m16670E0(j19))) {
                                            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                        }
                                        interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                    } else {
                                        interfaceC5312g1.setValue(Boolean.TRUE);
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a3);
                        } else {
                            objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C7216j c7216j2 = c7216j;
                                    C5207g.m11111f(c7216j2, "result");
                                    C0692c c0692c = c7216j2.f40591b;
                                    int i31114 = c0692c.f4561f - 1;
                                    c0692c.m2586c(i31114);
                                    ArrayList arrayList = c0692c.f4563h;
                                    if (((C7208b) arrayList.get(C8573r0.m16731j0(i31114, arrayList))).f40548a.mo2555l(i31114)) {
                                        InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                        C7218l value = interfaceC5312g2.getValue();
                                        long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                        if (!(!C8573r0.m16670E0(j19))) {
                                            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                        }
                                        interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                    } else {
                                        interfaceC5312g1.setValue(Boolean.TRUE);
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a3);
                        }
                        composerImplMo1636j.m1609Q(false);
                        int i31114 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                        int i31115 = i14 >> 12;
                        InterfaceC0500b interfaceC0500b110 = interfaceC0500b3;
                        composerImpl = composerImplMo1636j;
                        TextKt.m1576c(str, interfaceC0500bM1950c16, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l19, composerImpl, i31114, (i31115 & 14) | (i31115 & 112) | (i31115 & 896) | (i31115 & 7168), 504);
                        j17 = j15;
                        c9797g5 = c9797g4;
                        j18 = j16;
                        i31 = i30;
                        z13 = z12;
                        i32 = i29;
                        c7218l3 = c7218l2;
                        interfaceC0500b4 = interfaceC0500b110;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i33 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                j13 = C9169u.f47703f;
                            } else {
                                j13 = j10;
                            }
                            if (i17 != 0) {
                                c9797g3 = null;
                            } else {
                                c9797g3 = c9797g2;
                            }
                            if (i19 != 0) {
                                j14 = C10023k.f50982c;
                            } else {
                                j14 = j12;
                            }
                            if (i21 != 0) {
                                i27 = 2;
                            } else {
                                i27 = i10;
                            }
                            if (i23 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i25 != 0) {
                                i28 = Integer.MAX_VALUE;
                            } else {
                                i28 = i11;
                            }
                            if ((i13 & 256) != 0) {
                                i14 &= -234881025;
                                i29 = i28;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                                interfaceC0500b3 = interfaceC0500b2;
                            } else {
                                c7218l2 = c7218l;
                                i29 = i28;
                                interfaceC0500b3 = interfaceC0500b2;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                            }
                        } else {
                            if (i33 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                j13 = C9169u.f47703f;
                            } else {
                                j13 = j10;
                            }
                            if (i17 != 0) {
                                c9797g3 = null;
                            } else {
                                c9797g3 = c9797g2;
                            }
                            if (i19 != 0) {
                                j14 = C10023k.f50982c;
                            } else {
                                j14 = j12;
                            }
                            if (i21 != 0) {
                                i27 = 2;
                            } else {
                                i27 = i10;
                            }
                            if (i23 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i25 != 0) {
                                i28 = Integer.MAX_VALUE;
                            } else {
                                i28 = i11;
                            }
                            if ((i13 & 256) != 0) {
                                i14 &= -234881025;
                                i29 = i28;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                                interfaceC0500b3 = interfaceC0500b2;
                            } else {
                                c7218l2 = c7218l;
                                i29 = i28;
                                interfaceC0500b3 = interfaceC0500b2;
                                j15 = j13;
                                c9797g4 = c9797g3;
                                j16 = j14;
                                i30 = i27;
                                z12 = z11;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q17 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        c10586a = InterfaceC0476a.a.f3122a;
                        if (objM1619a0 == c10586a) {
                            objM1619a0 = C8573r0.m16684L0(c7218l2);
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a1 = composerImplMo1636j.m1619a0();
                        if (objM1619a1 == c10586a) {
                            objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                            composerImplMo1636j.m1597F0(objM1619a1);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                        composerImplMo1636j.mo1622c(1157296644);
                        zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                        objM1619a2 = composerImplMo1636j.m1619a0();
                        if (zMo1665y) {
                            objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                    InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                    C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                    if (interfaceC5312g1.getValue().booleanValue()) {
                                        interfaceC9619c2.mo12668E0();
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        } else {
                            objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                    InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                    C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                    if (interfaceC5312g1.getValue().booleanValue()) {
                                        interfaceC9619c2.mo12668E0();
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        }
                        composerImplMo1636j.m1609Q(false);
                        InterfaceC0500b interfaceC0500bM1950c17 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                        C7218l c7218l110 = (C7218l) interfaceC5312g0.getValue();
                        composerImplMo1636j.mo1622c(511388516);
                        zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                        objM1619a3 = composerImplMo1636j.m1619a0();
                        if (zMo1665y2) {
                            objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C7216j c7216j2 = c7216j;
                                    C5207g.m11111f(c7216j2, "result");
                                    C0692c c0692c = c7216j2.f40591b;
                                    int i31116 = c0692c.f4561f - 1;
                                    c0692c.m2586c(i31116);
                                    ArrayList arrayList = c0692c.f4563h;
                                    if (((C7208b) arrayList.get(C8573r0.m16731j0(i31116, arrayList))).f40548a.mo2555l(i31116)) {
                                        InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                        C7218l value = interfaceC5312g2.getValue();
                                        long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                        if (!(!C8573r0.m16670E0(j19))) {
                                            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                        }
                                        interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                    } else {
                                        interfaceC5312g1.setValue(Boolean.TRUE);
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a3);
                        } else {
                            objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C7216j c7216j2 = c7216j;
                                    C5207g.m11111f(c7216j2, "result");
                                    C0692c c0692c = c7216j2.f40591b;
                                    int i31116 = c0692c.f4561f - 1;
                                    c0692c.m2586c(i31116);
                                    ArrayList arrayList = c0692c.f4563h;
                                    if (((C7208b) arrayList.get(C8573r0.m16731j0(i31116, arrayList))).f40548a.mo2555l(i31116)) {
                                        InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                        C7218l value = interfaceC5312g2.getValue();
                                        long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                        if (!(!C8573r0.m16670E0(j19))) {
                                            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                        }
                                        interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                    } else {
                                        interfaceC5312g1.setValue(Boolean.TRUE);
                                    }
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a3);
                        }
                        composerImplMo1636j.m1609Q(false);
                        int i31116 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                        int i31117 = i14 >> 12;
                        InterfaceC0500b interfaceC0500b111 = interfaceC0500b3;
                        composerImpl = composerImplMo1636j;
                        TextKt.m1576c(str, interfaceC0500bM1950c17, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l110, composerImpl, i31116, (i31117 & 14) | (i31117 & 112) | (i31117 & 896) | (i31117 & 7168), 504);
                        j17 = j15;
                        c9797g5 = c9797g4;
                        j18 = j16;
                        i31 = i30;
                        z13 = z12;
                        i32 = i29;
                        c7218l3 = c7218l2;
                        interfaceC0500b4 = interfaceC0500b111;
                    }
                    c5332q0M1612T = composerImpl.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            AutoSizedTextKt.m10305a(str, interfaceC0500b4, j17, c9797g5, j18, i31, z13, i32, c7218l3, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                            return C9072e.f47360a;
                        }
                    };
                }
                i14 |= 24576;
                j12 = j11;
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= 196608;
                } else if ((i12 & 458752) == 0) {
                    if (composerImplMo1636j.m1594E(i10)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerImplMo1636j.m1598G(z10)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                i25 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i25 != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (composerImplMo1636j.m1594E(i11)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i12 & 234881024) != 0) {
                    i14 |= ((i13 & 256) == 0 || !composerImplMo1636j.mo1665y(c7218l)) ? 33554432 : 67108864;
                }
                if ((i14 & 191739611) == 38347922) {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    } else {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q18 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    c10586a = InterfaceC0476a.a.f3122a;
                    if (objM1619a0 == c10586a) {
                        objM1619a0 = C8573r0.m16684L0(c7218l2);
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1950c18 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                    C7218l c7218l111 = (C7218l) interfaceC5312g0.getValue();
                    composerImplMo1636j.mo1622c(511388516);
                    zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a3 = composerImplMo1636j.m1619a0();
                    if (zMo1665y2) {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i31118 = c0692c.f4561f - 1;
                                c0692c.m2586c(i31118);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i31118, arrayList))).f40548a.mo2555l(i31118)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    } else {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i31118 = c0692c.f4561f - 1;
                                c0692c.m2586c(i31118);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i31118, arrayList))).f40548a.mo2555l(i31118)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    }
                    composerImplMo1636j.m1609Q(false);
                    int i31118 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                    int i31119 = i14 >> 12;
                    InterfaceC0500b interfaceC0500b112 = interfaceC0500b3;
                    composerImpl = composerImplMo1636j;
                    TextKt.m1576c(str, interfaceC0500bM1950c18, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l111, composerImpl, i31118, (i31119 & 14) | (i31119 & 112) | (i31119 & 896) | (i31119 & 7168), 504);
                    j17 = j15;
                    c9797g5 = c9797g4;
                    j18 = j16;
                    i31 = i30;
                    z13 = z12;
                    i32 = i29;
                    c7218l3 = c7218l2;
                    interfaceC0500b4 = interfaceC0500b112;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    } else {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q19 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    c10586a = InterfaceC0476a.a.f3122a;
                    if (objM1619a0 == c10586a) {
                        objM1619a0 = C8573r0.m16684L0(c7218l2);
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1950c19 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                    C7218l c7218l112 = (C7218l) interfaceC5312g0.getValue();
                    composerImplMo1636j.mo1622c(511388516);
                    zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a3 = composerImplMo1636j.m1619a0();
                    if (zMo1665y2) {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i311110 = c0692c.f4561f - 1;
                                c0692c.m2586c(i311110);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i311110, arrayList))).f40548a.mo2555l(i311110)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    } else {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i311110 = c0692c.f4561f - 1;
                                c0692c.m2586c(i311110);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i311110, arrayList))).f40548a.mo2555l(i311110)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    }
                    composerImplMo1636j.m1609Q(false);
                    int i311110 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                    int i311111 = i14 >> 12;
                    InterfaceC0500b interfaceC0500b113 = interfaceC0500b3;
                    composerImpl = composerImplMo1636j;
                    TextKt.m1576c(str, interfaceC0500bM1950c19, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l112, composerImpl, i311110, (i311111 & 14) | (i311111 & 112) | (i311111 & 896) | (i311111 & 7168), 504);
                    j17 = j15;
                    c9797g5 = c9797g4;
                    j18 = j16;
                    i31 = i30;
                    z13 = z12;
                    i32 = i29;
                    c7218l3 = c7218l2;
                    interfaceC0500b4 = interfaceC0500b113;
                }
                c5332q0M1612T = composerImpl.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        AutoSizedTextKt.m10305a(str, interfaceC0500b4, j17, c9797g5, j18, i31, z13, i32, c7218l3, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 |= 3072;
            c9797g2 = c9797g;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((57344 & i12) == 0) {
                    j12 = j11;
                    if (composerImplMo1636j.m1596F(j12)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= 196608;
                } else if ((i12 & 458752) == 0) {
                    if (composerImplMo1636j.m1594E(i10)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerImplMo1636j.m1598G(z10)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                i25 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i25 != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (composerImplMo1636j.m1594E(i11)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i12 & 234881024) != 0) {
                    i14 |= ((i13 & 256) == 0 || !composerImplMo1636j.mo1665y(c7218l)) ? 33554432 : 67108864;
                }
                if ((i14 & 191739611) == 38347922) {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    } else {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q110 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    c10586a = InterfaceC0476a.a.f3122a;
                    if (objM1619a0 == c10586a) {
                        objM1619a0 = C8573r0.m16684L0(c7218l2);
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1950c110 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                    C7218l c7218l113 = (C7218l) interfaceC5312g0.getValue();
                    composerImplMo1636j.mo1622c(511388516);
                    zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a3 = composerImplMo1636j.m1619a0();
                    if (zMo1665y2) {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i311112 = c0692c.f4561f - 1;
                                c0692c.m2586c(i311112);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i311112, arrayList))).f40548a.mo2555l(i311112)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    } else {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i311112 = c0692c.f4561f - 1;
                                c0692c.m2586c(i311112);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i311112, arrayList))).f40548a.mo2555l(i311112)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    }
                    composerImplMo1636j.m1609Q(false);
                    int i311112 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                    int i311113 = i14 >> 12;
                    InterfaceC0500b interfaceC0500b114 = interfaceC0500b3;
                    composerImpl = composerImplMo1636j;
                    TextKt.m1576c(str, interfaceC0500bM1950c110, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l113, composerImpl, i311112, (i311113 & 14) | (i311113 & 112) | (i311113 & 896) | (i311113 & 7168), 504);
                    j17 = j15;
                    c9797g5 = c9797g4;
                    j18 = j16;
                    i31 = i30;
                    z13 = z12;
                    i32 = i29;
                    c7218l3 = c7218l2;
                    interfaceC0500b4 = interfaceC0500b114;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    } else {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    c10586a = InterfaceC0476a.a.f3122a;
                    if (objM1619a0 == c10586a) {
                        objM1619a0 = C8573r0.m16684L0(c7218l2);
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1950c111 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                    C7218l c7218l114 = (C7218l) interfaceC5312g0.getValue();
                    composerImplMo1636j.mo1622c(511388516);
                    zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a3 = composerImplMo1636j.m1619a0();
                    if (zMo1665y2) {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i311114 = c0692c.f4561f - 1;
                                c0692c.m2586c(i311114);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i311114, arrayList))).f40548a.mo2555l(i311114)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    } else {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i311114 = c0692c.f4561f - 1;
                                c0692c.m2586c(i311114);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i311114, arrayList))).f40548a.mo2555l(i311114)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    }
                    composerImplMo1636j.m1609Q(false);
                    int i311114 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                    int i311115 = i14 >> 12;
                    InterfaceC0500b interfaceC0500b115 = interfaceC0500b3;
                    composerImpl = composerImplMo1636j;
                    TextKt.m1576c(str, interfaceC0500bM1950c111, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l114, composerImpl, i311114, (i311115 & 14) | (i311115 & 112) | (i311115 & 896) | (i311115 & 7168), 504);
                    j17 = j15;
                    c9797g5 = c9797g4;
                    j18 = j16;
                    i31 = i30;
                    z13 = z12;
                    i32 = i29;
                    c7218l3 = c7218l2;
                    interfaceC0500b4 = interfaceC0500b115;
                }
                c5332q0M1612T = composerImpl.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        AutoSizedTextKt.m10305a(str, interfaceC0500b4, j17, c9797g5, j18, i31, z13, i32, c7218l3, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 |= 24576;
            j12 = j11;
            i21 = i13 & 32;
            if (i21 != 0) {
                i14 |= 196608;
            } else if ((i12 & 458752) == 0) {
                if (composerImplMo1636j.m1594E(i10)) {
                    i22 = 131072;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (composerImplMo1636j.m1598G(z10)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i14 |= i24;
            }
            i25 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
            if (i25 != 0) {
                i14 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (composerImplMo1636j.m1594E(i11)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            if ((i12 & 234881024) != 0) {
                i14 |= ((i13 & 256) == 0 || !composerImplMo1636j.mo1665y(c7218l)) ? 33554432 : 67108864;
            }
            if ((i14 & 191739611) == 38347922) {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i33 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        j13 = C9169u.f47703f;
                    } else {
                        j13 = j10;
                    }
                    if (i17 != 0) {
                        c9797g3 = null;
                    } else {
                        c9797g3 = c9797g2;
                    }
                    if (i19 != 0) {
                        j14 = C10023k.f50982c;
                    } else {
                        j14 = j12;
                    }
                    if (i21 != 0) {
                        i27 = 2;
                    } else {
                        i27 = i10;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        i29 = i28;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        interfaceC0500b3 = interfaceC0500b2;
                    } else {
                        c7218l2 = c7218l;
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                    }
                } else {
                    if (i33 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        j13 = C9169u.f47703f;
                    } else {
                        j13 = j10;
                    }
                    if (i17 != 0) {
                        c9797g3 = null;
                    } else {
                        c9797g3 = c9797g2;
                    }
                    if (i19 != 0) {
                        j14 = C10023k.f50982c;
                    } else {
                        j14 = j12;
                    }
                    if (i21 != 0) {
                        i27 = 2;
                    } else {
                        i27 = i10;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        i29 = i28;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        interfaceC0500b3 = interfaceC0500b2;
                    } else {
                        c7218l2 = c7218l;
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q112 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                c10586a = InterfaceC0476a.a.f3122a;
                if (objM1619a0 == c10586a) {
                    objM1619a0 = C8573r0.m16684L0(c7218l2);
                    composerImplMo1636j.m1597F0(objM1619a0);
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a1 = composerImplMo1636j.m1619a0();
                if (objM1619a1 == c10586a) {
                    objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                    composerImplMo1636j.m1597F0(objM1619a1);
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                composerImplMo1636j.mo1622c(1157296644);
                zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                objM1619a2 = composerImplMo1636j.m1619a0();
                if (zMo1665y) {
                    objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                            InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                            C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                            if (interfaceC5312g1.getValue().booleanValue()) {
                                interfaceC9619c2.mo12668E0();
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                } else {
                    objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                            InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                            C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                            if (interfaceC5312g1.getValue().booleanValue()) {
                                interfaceC9619c2.mo12668E0();
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                }
                composerImplMo1636j.m1609Q(false);
                InterfaceC0500b interfaceC0500bM1950c112 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                C7218l c7218l115 = (C7218l) interfaceC5312g0.getValue();
                composerImplMo1636j.mo1622c(511388516);
                zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                objM1619a3 = composerImplMo1636j.m1619a0();
                if (zMo1665y2) {
                    objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C7216j c7216j2 = c7216j;
                            C5207g.m11111f(c7216j2, "result");
                            C0692c c0692c = c7216j2.f40591b;
                            int i311116 = c0692c.f4561f - 1;
                            c0692c.m2586c(i311116);
                            ArrayList arrayList = c0692c.f4563h;
                            if (((C7208b) arrayList.get(C8573r0.m16731j0(i311116, arrayList))).f40548a.mo2555l(i311116)) {
                                InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                C7218l value = interfaceC5312g2.getValue();
                                long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                if (!(!C8573r0.m16670E0(j19))) {
                                    throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                }
                                interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                            } else {
                                interfaceC5312g1.setValue(Boolean.TRUE);
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a3);
                } else {
                    objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C7216j c7216j2 = c7216j;
                            C5207g.m11111f(c7216j2, "result");
                            C0692c c0692c = c7216j2.f40591b;
                            int i311116 = c0692c.f4561f - 1;
                            c0692c.m2586c(i311116);
                            ArrayList arrayList = c0692c.f4563h;
                            if (((C7208b) arrayList.get(C8573r0.m16731j0(i311116, arrayList))).f40548a.mo2555l(i311116)) {
                                InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                C7218l value = interfaceC5312g2.getValue();
                                long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                if (!(!C8573r0.m16670E0(j19))) {
                                    throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                }
                                interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                            } else {
                                interfaceC5312g1.setValue(Boolean.TRUE);
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a3);
                }
                composerImplMo1636j.m1609Q(false);
                int i311116 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                int i311117 = i14 >> 12;
                InterfaceC0500b interfaceC0500b116 = interfaceC0500b3;
                composerImpl = composerImplMo1636j;
                TextKt.m1576c(str, interfaceC0500bM1950c112, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l115, composerImpl, i311116, (i311117 & 14) | (i311117 & 112) | (i311117 & 896) | (i311117 & 7168), 504);
                j17 = j15;
                c9797g5 = c9797g4;
                j18 = j16;
                i31 = i30;
                z13 = z12;
                i32 = i29;
                c7218l3 = c7218l2;
                interfaceC0500b4 = interfaceC0500b116;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i33 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        j13 = C9169u.f47703f;
                    } else {
                        j13 = j10;
                    }
                    if (i17 != 0) {
                        c9797g3 = null;
                    } else {
                        c9797g3 = c9797g2;
                    }
                    if (i19 != 0) {
                        j14 = C10023k.f50982c;
                    } else {
                        j14 = j12;
                    }
                    if (i21 != 0) {
                        i27 = 2;
                    } else {
                        i27 = i10;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        i29 = i28;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        interfaceC0500b3 = interfaceC0500b2;
                    } else {
                        c7218l2 = c7218l;
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                    }
                } else {
                    if (i33 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        j13 = C9169u.f47703f;
                    } else {
                        j13 = j10;
                    }
                    if (i17 != 0) {
                        c9797g3 = null;
                    } else {
                        c9797g3 = c9797g2;
                    }
                    if (i19 != 0) {
                        j14 = C10023k.f50982c;
                    } else {
                        j14 = j12;
                    }
                    if (i21 != 0) {
                        i27 = 2;
                    } else {
                        i27 = i10;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        i29 = i28;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        interfaceC0500b3 = interfaceC0500b2;
                    } else {
                        c7218l2 = c7218l;
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q113 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                c10586a = InterfaceC0476a.a.f3122a;
                if (objM1619a0 == c10586a) {
                    objM1619a0 = C8573r0.m16684L0(c7218l2);
                    composerImplMo1636j.m1597F0(objM1619a0);
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a1 = composerImplMo1636j.m1619a0();
                if (objM1619a1 == c10586a) {
                    objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                    composerImplMo1636j.m1597F0(objM1619a1);
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                composerImplMo1636j.mo1622c(1157296644);
                zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                objM1619a2 = composerImplMo1636j.m1619a0();
                if (zMo1665y) {
                    objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                            InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                            C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                            if (interfaceC5312g1.getValue().booleanValue()) {
                                interfaceC9619c2.mo12668E0();
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                } else {
                    objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                            InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                            C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                            if (interfaceC5312g1.getValue().booleanValue()) {
                                interfaceC9619c2.mo12668E0();
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                }
                composerImplMo1636j.m1609Q(false);
                InterfaceC0500b interfaceC0500bM1950c113 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                C7218l c7218l116 = (C7218l) interfaceC5312g0.getValue();
                composerImplMo1636j.mo1622c(511388516);
                zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                objM1619a3 = composerImplMo1636j.m1619a0();
                if (zMo1665y2) {
                    objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C7216j c7216j2 = c7216j;
                            C5207g.m11111f(c7216j2, "result");
                            C0692c c0692c = c7216j2.f40591b;
                            int i311118 = c0692c.f4561f - 1;
                            c0692c.m2586c(i311118);
                            ArrayList arrayList = c0692c.f4563h;
                            if (((C7208b) arrayList.get(C8573r0.m16731j0(i311118, arrayList))).f40548a.mo2555l(i311118)) {
                                InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                C7218l value = interfaceC5312g2.getValue();
                                long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                if (!(!C8573r0.m16670E0(j19))) {
                                    throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                }
                                interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                            } else {
                                interfaceC5312g1.setValue(Boolean.TRUE);
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a3);
                } else {
                    objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C7216j c7216j2 = c7216j;
                            C5207g.m11111f(c7216j2, "result");
                            C0692c c0692c = c7216j2.f40591b;
                            int i311118 = c0692c.f4561f - 1;
                            c0692c.m2586c(i311118);
                            ArrayList arrayList = c0692c.f4563h;
                            if (((C7208b) arrayList.get(C8573r0.m16731j0(i311118, arrayList))).f40548a.mo2555l(i311118)) {
                                InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                C7218l value = interfaceC5312g2.getValue();
                                long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                if (!(!C8573r0.m16670E0(j19))) {
                                    throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                }
                                interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                            } else {
                                interfaceC5312g1.setValue(Boolean.TRUE);
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a3);
                }
                composerImplMo1636j.m1609Q(false);
                int i311118 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                int i311119 = i14 >> 12;
                InterfaceC0500b interfaceC0500b117 = interfaceC0500b3;
                composerImpl = composerImplMo1636j;
                TextKt.m1576c(str, interfaceC0500bM1950c113, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l116, composerImpl, i311118, (i311119 & 14) | (i311119 & 112) | (i311119 & 896) | (i311119 & 7168), 504);
                j17 = j15;
                c9797g5 = c9797g4;
                j18 = j16;
                i31 = i30;
                z13 = z12;
                i32 = i29;
                c7218l3 = c7218l2;
                interfaceC0500b4 = interfaceC0500b117;
            }
            c5332q0M1612T = composerImpl.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    AutoSizedTextKt.m10305a(str, interfaceC0500b4, j17, c9797g5, j18, i31, z13, i32, c7218l3, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                    return C9072e.f47360a;
                }
            };
        }
        i14 |= 384;
        i17 = i13 & 8;
        if (i17 != 0) {
            if ((i12 & 7168) == 0) {
                c9797g2 = c9797g;
                if (composerImplMo1636j.mo1665y(c9797g2)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i14 |= i18;
            }
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((57344 & i12) == 0) {
                    j12 = j11;
                    if (composerImplMo1636j.m1596F(j12)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= 196608;
                } else if ((i12 & 458752) == 0) {
                    if (composerImplMo1636j.m1594E(i10)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerImplMo1636j.m1598G(z10)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                i25 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i25 != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (composerImplMo1636j.m1594E(i11)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i12 & 234881024) != 0) {
                    i14 |= ((i13 & 256) == 0 || !composerImplMo1636j.mo1665y(c7218l)) ? 33554432 : 67108864;
                }
                if ((i14 & 191739611) == 38347922) {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    } else {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q114 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    c10586a = InterfaceC0476a.a.f3122a;
                    if (objM1619a0 == c10586a) {
                        objM1619a0 = C8573r0.m16684L0(c7218l2);
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1950c114 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                    C7218l c7218l117 = (C7218l) interfaceC5312g0.getValue();
                    composerImplMo1636j.mo1622c(511388516);
                    zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a3 = composerImplMo1636j.m1619a0();
                    if (zMo1665y2) {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i3111110 = c0692c.f4561f - 1;
                                c0692c.m2586c(i3111110);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i3111110, arrayList))).f40548a.mo2555l(i3111110)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    } else {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i3111110 = c0692c.f4561f - 1;
                                c0692c.m2586c(i3111110);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i3111110, arrayList))).f40548a.mo2555l(i3111110)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    }
                    composerImplMo1636j.m1609Q(false);
                    int i3111110 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                    int i3111111 = i14 >> 12;
                    InterfaceC0500b interfaceC0500b118 = interfaceC0500b3;
                    composerImpl = composerImplMo1636j;
                    TextKt.m1576c(str, interfaceC0500bM1950c114, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l117, composerImpl, i3111110, (i3111111 & 14) | (i3111111 & 112) | (i3111111 & 896) | (i3111111 & 7168), 504);
                    j17 = j15;
                    c9797g5 = c9797g4;
                    j18 = j16;
                    i31 = i30;
                    z13 = z12;
                    i32 = i29;
                    c7218l3 = c7218l2;
                    interfaceC0500b4 = interfaceC0500b118;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    } else {
                        if (i33 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            j13 = C9169u.f47703f;
                        } else {
                            j13 = j10;
                        }
                        if (i17 != 0) {
                            c9797g3 = null;
                        } else {
                            c9797g3 = c9797g2;
                        }
                        if (i19 != 0) {
                            j14 = C10023k.f50982c;
                        } else {
                            j14 = j12;
                        }
                        if (i21 != 0) {
                            i27 = 2;
                        } else {
                            i27 = i10;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            i29 = i28;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            interfaceC0500b3 = interfaceC0500b2;
                        } else {
                            c7218l2 = c7218l;
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            j15 = j13;
                            c9797g4 = c9797g3;
                            j16 = j14;
                            i30 = i27;
                            z12 = z11;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q115 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    c10586a = InterfaceC0476a.a.f3122a;
                    if (objM1619a0 == c10586a) {
                        objM1619a0 = C8573r0.m16684L0(c7218l2);
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                                if (interfaceC5312g1.getValue().booleanValue()) {
                                    interfaceC9619c2.mo12668E0();
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    InterfaceC0500b interfaceC0500bM1950c115 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                    C7218l c7218l118 = (C7218l) interfaceC5312g0.getValue();
                    composerImplMo1636j.mo1622c(511388516);
                    zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                    objM1619a3 = composerImplMo1636j.m1619a0();
                    if (zMo1665y2) {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i3111112 = c0692c.f4561f - 1;
                                c0692c.m2586c(i3111112);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i3111112, arrayList))).f40548a.mo2555l(i3111112)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    } else {
                        objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C7216j c7216j2 = c7216j;
                                C5207g.m11111f(c7216j2, "result");
                                C0692c c0692c = c7216j2.f40591b;
                                int i3111112 = c0692c.f4561f - 1;
                                c0692c.m2586c(i3111112);
                                ArrayList arrayList = c0692c.f4563h;
                                if (((C7208b) arrayList.get(C8573r0.m16731j0(i3111112, arrayList))).f40548a.mo2555l(i3111112)) {
                                    InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                    C7218l value = interfaceC5312g2.getValue();
                                    long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                    if (!(!C8573r0.m16670E0(j19))) {
                                        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                    }
                                    interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                                } else {
                                    interfaceC5312g1.setValue(Boolean.TRUE);
                                }
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a3);
                    }
                    composerImplMo1636j.m1609Q(false);
                    int i3111112 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                    int i3111113 = i14 >> 12;
                    InterfaceC0500b interfaceC0500b119 = interfaceC0500b3;
                    composerImpl = composerImplMo1636j;
                    TextKt.m1576c(str, interfaceC0500bM1950c115, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l118, composerImpl, i3111112, (i3111113 & 14) | (i3111113 & 112) | (i3111113 & 896) | (i3111113 & 7168), 504);
                    j17 = j15;
                    c9797g5 = c9797g4;
                    j18 = j16;
                    i31 = i30;
                    z13 = z12;
                    i32 = i29;
                    c7218l3 = c7218l2;
                    interfaceC0500b4 = interfaceC0500b119;
                }
                c5332q0M1612T = composerImpl.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        AutoSizedTextKt.m10305a(str, interfaceC0500b4, j17, c9797g5, j18, i31, z13, i32, c7218l3, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 |= 24576;
            j12 = j11;
            i21 = i13 & 32;
            if (i21 != 0) {
                i14 |= 196608;
            } else if ((i12 & 458752) == 0) {
                if (composerImplMo1636j.m1594E(i10)) {
                    i22 = 131072;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (composerImplMo1636j.m1598G(z10)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i14 |= i24;
            }
            i25 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
            if (i25 != 0) {
                i14 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (composerImplMo1636j.m1594E(i11)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            if ((i12 & 234881024) != 0) {
                i14 |= ((i13 & 256) == 0 || !composerImplMo1636j.mo1665y(c7218l)) ? 33554432 : 67108864;
            }
            if ((i14 & 191739611) == 38347922) {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i33 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        j13 = C9169u.f47703f;
                    } else {
                        j13 = j10;
                    }
                    if (i17 != 0) {
                        c9797g3 = null;
                    } else {
                        c9797g3 = c9797g2;
                    }
                    if (i19 != 0) {
                        j14 = C10023k.f50982c;
                    } else {
                        j14 = j12;
                    }
                    if (i21 != 0) {
                        i27 = 2;
                    } else {
                        i27 = i10;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        i29 = i28;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        interfaceC0500b3 = interfaceC0500b2;
                    } else {
                        c7218l2 = c7218l;
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                    }
                } else {
                    if (i33 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        j13 = C9169u.f47703f;
                    } else {
                        j13 = j10;
                    }
                    if (i17 != 0) {
                        c9797g3 = null;
                    } else {
                        c9797g3 = c9797g2;
                    }
                    if (i19 != 0) {
                        j14 = C10023k.f50982c;
                    } else {
                        j14 = j12;
                    }
                    if (i21 != 0) {
                        i27 = 2;
                    } else {
                        i27 = i10;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        i29 = i28;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        interfaceC0500b3 = interfaceC0500b2;
                    } else {
                        c7218l2 = c7218l;
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q116 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                c10586a = InterfaceC0476a.a.f3122a;
                if (objM1619a0 == c10586a) {
                    objM1619a0 = C8573r0.m16684L0(c7218l2);
                    composerImplMo1636j.m1597F0(objM1619a0);
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a1 = composerImplMo1636j.m1619a0();
                if (objM1619a1 == c10586a) {
                    objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                    composerImplMo1636j.m1597F0(objM1619a1);
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                composerImplMo1636j.mo1622c(1157296644);
                zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                objM1619a2 = composerImplMo1636j.m1619a0();
                if (zMo1665y) {
                    objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                            InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                            C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                            if (interfaceC5312g1.getValue().booleanValue()) {
                                interfaceC9619c2.mo12668E0();
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                } else {
                    objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                            InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                            C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                            if (interfaceC5312g1.getValue().booleanValue()) {
                                interfaceC9619c2.mo12668E0();
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                }
                composerImplMo1636j.m1609Q(false);
                InterfaceC0500b interfaceC0500bM1950c116 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                C7218l c7218l119 = (C7218l) interfaceC5312g0.getValue();
                composerImplMo1636j.mo1622c(511388516);
                zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                objM1619a3 = composerImplMo1636j.m1619a0();
                if (zMo1665y2) {
                    objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C7216j c7216j2 = c7216j;
                            C5207g.m11111f(c7216j2, "result");
                            C0692c c0692c = c7216j2.f40591b;
                            int i3111114 = c0692c.f4561f - 1;
                            c0692c.m2586c(i3111114);
                            ArrayList arrayList = c0692c.f4563h;
                            if (((C7208b) arrayList.get(C8573r0.m16731j0(i3111114, arrayList))).f40548a.mo2555l(i3111114)) {
                                InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                C7218l value = interfaceC5312g2.getValue();
                                long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                if (!(!C8573r0.m16670E0(j19))) {
                                    throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                }
                                interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                            } else {
                                interfaceC5312g1.setValue(Boolean.TRUE);
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a3);
                } else {
                    objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C7216j c7216j2 = c7216j;
                            C5207g.m11111f(c7216j2, "result");
                            C0692c c0692c = c7216j2.f40591b;
                            int i3111114 = c0692c.f4561f - 1;
                            c0692c.m2586c(i3111114);
                            ArrayList arrayList = c0692c.f4563h;
                            if (((C7208b) arrayList.get(C8573r0.m16731j0(i3111114, arrayList))).f40548a.mo2555l(i3111114)) {
                                InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                C7218l value = interfaceC5312g2.getValue();
                                long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                if (!(!C8573r0.m16670E0(j19))) {
                                    throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                }
                                interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                            } else {
                                interfaceC5312g1.setValue(Boolean.TRUE);
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a3);
                }
                composerImplMo1636j.m1609Q(false);
                int i3111114 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                int i3111115 = i14 >> 12;
                InterfaceC0500b interfaceC0500b1110 = interfaceC0500b3;
                composerImpl = composerImplMo1636j;
                TextKt.m1576c(str, interfaceC0500bM1950c116, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l119, composerImpl, i3111114, (i3111115 & 14) | (i3111115 & 112) | (i3111115 & 896) | (i3111115 & 7168), 504);
                j17 = j15;
                c9797g5 = c9797g4;
                j18 = j16;
                i31 = i30;
                z13 = z12;
                i32 = i29;
                c7218l3 = c7218l2;
                interfaceC0500b4 = interfaceC0500b1110;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i33 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        j13 = C9169u.f47703f;
                    } else {
                        j13 = j10;
                    }
                    if (i17 != 0) {
                        c9797g3 = null;
                    } else {
                        c9797g3 = c9797g2;
                    }
                    if (i19 != 0) {
                        j14 = C10023k.f50982c;
                    } else {
                        j14 = j12;
                    }
                    if (i21 != 0) {
                        i27 = 2;
                    } else {
                        i27 = i10;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        i29 = i28;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        interfaceC0500b3 = interfaceC0500b2;
                    } else {
                        c7218l2 = c7218l;
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                    }
                } else {
                    if (i33 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        j13 = C9169u.f47703f;
                    } else {
                        j13 = j10;
                    }
                    if (i17 != 0) {
                        c9797g3 = null;
                    } else {
                        c9797g3 = c9797g2;
                    }
                    if (i19 != 0) {
                        j14 = C10023k.f50982c;
                    } else {
                        j14 = j12;
                    }
                    if (i21 != 0) {
                        i27 = 2;
                    } else {
                        i27 = i10;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        i29 = i28;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        interfaceC0500b3 = interfaceC0500b2;
                    } else {
                        c7218l2 = c7218l;
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q117 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                c10586a = InterfaceC0476a.a.f3122a;
                if (objM1619a0 == c10586a) {
                    objM1619a0 = C8573r0.m16684L0(c7218l2);
                    composerImplMo1636j.m1597F0(objM1619a0);
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a1 = composerImplMo1636j.m1619a0();
                if (objM1619a1 == c10586a) {
                    objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                    composerImplMo1636j.m1597F0(objM1619a1);
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                composerImplMo1636j.mo1622c(1157296644);
                zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                objM1619a2 = composerImplMo1636j.m1619a0();
                if (zMo1665y) {
                    objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                            InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                            C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                            if (interfaceC5312g1.getValue().booleanValue()) {
                                interfaceC9619c2.mo12668E0();
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                } else {
                    objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                            InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                            C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                            if (interfaceC5312g1.getValue().booleanValue()) {
                                interfaceC9619c2.mo12668E0();
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                }
                composerImplMo1636j.m1609Q(false);
                InterfaceC0500b interfaceC0500bM1950c117 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                C7218l c7218l1110 = (C7218l) interfaceC5312g0.getValue();
                composerImplMo1636j.mo1622c(511388516);
                zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                objM1619a3 = composerImplMo1636j.m1619a0();
                if (zMo1665y2) {
                    objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C7216j c7216j2 = c7216j;
                            C5207g.m11111f(c7216j2, "result");
                            C0692c c0692c = c7216j2.f40591b;
                            int i3111116 = c0692c.f4561f - 1;
                            c0692c.m2586c(i3111116);
                            ArrayList arrayList = c0692c.f4563h;
                            if (((C7208b) arrayList.get(C8573r0.m16731j0(i3111116, arrayList))).f40548a.mo2555l(i3111116)) {
                                InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                C7218l value = interfaceC5312g2.getValue();
                                long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                if (!(!C8573r0.m16670E0(j19))) {
                                    throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                }
                                interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                            } else {
                                interfaceC5312g1.setValue(Boolean.TRUE);
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a3);
                } else {
                    objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C7216j c7216j2 = c7216j;
                            C5207g.m11111f(c7216j2, "result");
                            C0692c c0692c = c7216j2.f40591b;
                            int i3111116 = c0692c.f4561f - 1;
                            c0692c.m2586c(i3111116);
                            ArrayList arrayList = c0692c.f4563h;
                            if (((C7208b) arrayList.get(C8573r0.m16731j0(i3111116, arrayList))).f40548a.mo2555l(i3111116)) {
                                InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                C7218l value = interfaceC5312g2.getValue();
                                long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                if (!(!C8573r0.m16670E0(j19))) {
                                    throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                }
                                interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                            } else {
                                interfaceC5312g1.setValue(Boolean.TRUE);
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a3);
                }
                composerImplMo1636j.m1609Q(false);
                int i3111116 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                int i3111117 = i14 >> 12;
                InterfaceC0500b interfaceC0500b1111 = interfaceC0500b3;
                composerImpl = composerImplMo1636j;
                TextKt.m1576c(str, interfaceC0500bM1950c117, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l1110, composerImpl, i3111116, (i3111117 & 14) | (i3111117 & 112) | (i3111117 & 896) | (i3111117 & 7168), 504);
                j17 = j15;
                c9797g5 = c9797g4;
                j18 = j16;
                i31 = i30;
                z13 = z12;
                i32 = i29;
                c7218l3 = c7218l2;
                interfaceC0500b4 = interfaceC0500b1111;
            }
            c5332q0M1612T = composerImpl.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    AutoSizedTextKt.m10305a(str, interfaceC0500b4, j17, c9797g5, j18, i31, z13, i32, c7218l3, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                    return C9072e.f47360a;
                }
            };
        }
        i14 |= 3072;
        c9797g2 = c9797g;
        i19 = i13 & 16;
        if (i19 != 0) {
            if ((57344 & i12) == 0) {
                j12 = j11;
                if (composerImplMo1636j.m1596F(j12)) {
                    i20 = 16384;
                } else {
                    i20 = 8192;
                }
                i14 |= i20;
            }
            i21 = i13 & 32;
            if (i21 != 0) {
                i14 |= 196608;
            } else if ((i12 & 458752) == 0) {
                if (composerImplMo1636j.m1594E(i10)) {
                    i22 = 131072;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (composerImplMo1636j.m1598G(z10)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i14 |= i24;
            }
            i25 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
            if (i25 != 0) {
                i14 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (composerImplMo1636j.m1594E(i11)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            if ((i12 & 234881024) != 0) {
                i14 |= ((i13 & 256) == 0 || !composerImplMo1636j.mo1665y(c7218l)) ? 33554432 : 67108864;
            }
            if ((i14 & 191739611) == 38347922) {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i33 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        j13 = C9169u.f47703f;
                    } else {
                        j13 = j10;
                    }
                    if (i17 != 0) {
                        c9797g3 = null;
                    } else {
                        c9797g3 = c9797g2;
                    }
                    if (i19 != 0) {
                        j14 = C10023k.f50982c;
                    } else {
                        j14 = j12;
                    }
                    if (i21 != 0) {
                        i27 = 2;
                    } else {
                        i27 = i10;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        i29 = i28;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        interfaceC0500b3 = interfaceC0500b2;
                    } else {
                        c7218l2 = c7218l;
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                    }
                } else {
                    if (i33 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        j13 = C9169u.f47703f;
                    } else {
                        j13 = j10;
                    }
                    if (i17 != 0) {
                        c9797g3 = null;
                    } else {
                        c9797g3 = c9797g2;
                    }
                    if (i19 != 0) {
                        j14 = C10023k.f50982c;
                    } else {
                        j14 = j12;
                    }
                    if (i21 != 0) {
                        i27 = 2;
                    } else {
                        i27 = i10;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        i29 = i28;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        interfaceC0500b3 = interfaceC0500b2;
                    } else {
                        c7218l2 = c7218l;
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q118 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                c10586a = InterfaceC0476a.a.f3122a;
                if (objM1619a0 == c10586a) {
                    objM1619a0 = C8573r0.m16684L0(c7218l2);
                    composerImplMo1636j.m1597F0(objM1619a0);
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a1 = composerImplMo1636j.m1619a0();
                if (objM1619a1 == c10586a) {
                    objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                    composerImplMo1636j.m1597F0(objM1619a1);
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                composerImplMo1636j.mo1622c(1157296644);
                zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                objM1619a2 = composerImplMo1636j.m1619a0();
                if (zMo1665y) {
                    objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                            InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                            C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                            if (interfaceC5312g1.getValue().booleanValue()) {
                                interfaceC9619c2.mo12668E0();
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                } else {
                    objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                            InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                            C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                            if (interfaceC5312g1.getValue().booleanValue()) {
                                interfaceC9619c2.mo12668E0();
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                }
                composerImplMo1636j.m1609Q(false);
                InterfaceC0500b interfaceC0500bM1950c118 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                C7218l c7218l1111 = (C7218l) interfaceC5312g0.getValue();
                composerImplMo1636j.mo1622c(511388516);
                zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                objM1619a3 = composerImplMo1636j.m1619a0();
                if (zMo1665y2) {
                    objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C7216j c7216j2 = c7216j;
                            C5207g.m11111f(c7216j2, "result");
                            C0692c c0692c = c7216j2.f40591b;
                            int i3111118 = c0692c.f4561f - 1;
                            c0692c.m2586c(i3111118);
                            ArrayList arrayList = c0692c.f4563h;
                            if (((C7208b) arrayList.get(C8573r0.m16731j0(i3111118, arrayList))).f40548a.mo2555l(i3111118)) {
                                InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                C7218l value = interfaceC5312g2.getValue();
                                long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                if (!(!C8573r0.m16670E0(j19))) {
                                    throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                }
                                interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                            } else {
                                interfaceC5312g1.setValue(Boolean.TRUE);
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a3);
                } else {
                    objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C7216j c7216j2 = c7216j;
                            C5207g.m11111f(c7216j2, "result");
                            C0692c c0692c = c7216j2.f40591b;
                            int i3111118 = c0692c.f4561f - 1;
                            c0692c.m2586c(i3111118);
                            ArrayList arrayList = c0692c.f4563h;
                            if (((C7208b) arrayList.get(C8573r0.m16731j0(i3111118, arrayList))).f40548a.mo2555l(i3111118)) {
                                InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                C7218l value = interfaceC5312g2.getValue();
                                long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                if (!(!C8573r0.m16670E0(j19))) {
                                    throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                }
                                interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                            } else {
                                interfaceC5312g1.setValue(Boolean.TRUE);
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a3);
                }
                composerImplMo1636j.m1609Q(false);
                int i3111118 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                int i3111119 = i14 >> 12;
                InterfaceC0500b interfaceC0500b1112 = interfaceC0500b3;
                composerImpl = composerImplMo1636j;
                TextKt.m1576c(str, interfaceC0500bM1950c118, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l1111, composerImpl, i3111118, (i3111119 & 14) | (i3111119 & 112) | (i3111119 & 896) | (i3111119 & 7168), 504);
                j17 = j15;
                c9797g5 = c9797g4;
                j18 = j16;
                i31 = i30;
                z13 = z12;
                i32 = i29;
                c7218l3 = c7218l2;
                interfaceC0500b4 = interfaceC0500b1112;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i33 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        j13 = C9169u.f47703f;
                    } else {
                        j13 = j10;
                    }
                    if (i17 != 0) {
                        c9797g3 = null;
                    } else {
                        c9797g3 = c9797g2;
                    }
                    if (i19 != 0) {
                        j14 = C10023k.f50982c;
                    } else {
                        j14 = j12;
                    }
                    if (i21 != 0) {
                        i27 = 2;
                    } else {
                        i27 = i10;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        i29 = i28;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        interfaceC0500b3 = interfaceC0500b2;
                    } else {
                        c7218l2 = c7218l;
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                    }
                } else {
                    if (i33 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        j13 = C9169u.f47703f;
                    } else {
                        j13 = j10;
                    }
                    if (i17 != 0) {
                        c9797g3 = null;
                    } else {
                        c9797g3 = c9797g2;
                    }
                    if (i19 != 0) {
                        j14 = C10023k.f50982c;
                    } else {
                        j14 = j12;
                    }
                    if (i21 != 0) {
                        i27 = 2;
                    } else {
                        i27 = i10;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        i29 = i28;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        interfaceC0500b3 = interfaceC0500b2;
                    } else {
                        c7218l2 = c7218l;
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        j15 = j13;
                        c9797g4 = c9797g3;
                        j16 = j14;
                        i30 = i27;
                        z12 = z11;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q119 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                c10586a = InterfaceC0476a.a.f3122a;
                if (objM1619a0 == c10586a) {
                    objM1619a0 = C8573r0.m16684L0(c7218l2);
                    composerImplMo1636j.m1597F0(objM1619a0);
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a1 = composerImplMo1636j.m1619a0();
                if (objM1619a1 == c10586a) {
                    objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                    composerImplMo1636j.m1597F0(objM1619a1);
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
                composerImplMo1636j.mo1622c(1157296644);
                zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
                objM1619a2 = composerImplMo1636j.m1619a0();
                if (zMo1665y) {
                    objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                            InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                            C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                            if (interfaceC5312g1.getValue().booleanValue()) {
                                interfaceC9619c2.mo12668E0();
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                } else {
                    objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                            InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                            C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                            if (interfaceC5312g1.getValue().booleanValue()) {
                                interfaceC9619c2.mo12668E0();
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                }
                composerImplMo1636j.m1609Q(false);
                InterfaceC0500b interfaceC0500bM1950c119 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
                C7218l c7218l1112 = (C7218l) interfaceC5312g0.getValue();
                composerImplMo1636j.mo1622c(511388516);
                zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
                objM1619a3 = composerImplMo1636j.m1619a0();
                if (zMo1665y2) {
                    objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C7216j c7216j2 = c7216j;
                            C5207g.m11111f(c7216j2, "result");
                            C0692c c0692c = c7216j2.f40591b;
                            int i31111110 = c0692c.f4561f - 1;
                            c0692c.m2586c(i31111110);
                            ArrayList arrayList = c0692c.f4563h;
                            if (((C7208b) arrayList.get(C8573r0.m16731j0(i31111110, arrayList))).f40548a.mo2555l(i31111110)) {
                                InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                C7218l value = interfaceC5312g2.getValue();
                                long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                if (!(!C8573r0.m16670E0(j19))) {
                                    throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                }
                                interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                            } else {
                                interfaceC5312g1.setValue(Boolean.TRUE);
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a3);
                } else {
                    objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C7216j c7216j2 = c7216j;
                            C5207g.m11111f(c7216j2, "result");
                            C0692c c0692c = c7216j2.f40591b;
                            int i31111110 = c0692c.f4561f - 1;
                            c0692c.m2586c(i31111110);
                            ArrayList arrayList = c0692c.f4563h;
                            if (((C7208b) arrayList.get(C8573r0.m16731j0(i31111110, arrayList))).f40548a.mo2555l(i31111110)) {
                                InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                                C7218l value = interfaceC5312g2.getValue();
                                long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                                if (!(!C8573r0.m16670E0(j19))) {
                                    throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                                }
                                interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                            } else {
                                interfaceC5312g1.setValue(Boolean.TRUE);
                            }
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a3);
                }
                composerImplMo1636j.m1609Q(false);
                int i31111110 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
                int i31111111 = i14 >> 12;
                InterfaceC0500b interfaceC0500b1113 = interfaceC0500b3;
                composerImpl = composerImplMo1636j;
                TextKt.m1576c(str, interfaceC0500bM1950c119, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l1112, composerImpl, i31111110, (i31111111 & 14) | (i31111111 & 112) | (i31111111 & 896) | (i31111111 & 7168), 504);
                j17 = j15;
                c9797g5 = c9797g4;
                j18 = j16;
                i31 = i30;
                z13 = z12;
                i32 = i29;
                c7218l3 = c7218l2;
                interfaceC0500b4 = interfaceC0500b1113;
            }
            c5332q0M1612T = composerImpl.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    AutoSizedTextKt.m10305a(str, interfaceC0500b4, j17, c9797g5, j18, i31, z13, i32, c7218l3, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                    return C9072e.f47360a;
                }
            };
        }
        i14 |= 24576;
        j12 = j11;
        i21 = i13 & 32;
        if (i21 != 0) {
            i14 |= 196608;
        } else if ((i12 & 458752) == 0) {
            if (composerImplMo1636j.m1594E(i10)) {
                i22 = 131072;
            } else {
                i22 = 65536;
            }
            i14 |= i22;
        }
        i23 = i13 & 64;
        if (i23 != 0) {
            i14 |= 1572864;
        } else if ((i12 & 3670016) == 0) {
            if (composerImplMo1636j.m1598G(z10)) {
                i24 = 1048576;
            } else {
                i24 = 524288;
            }
            i14 |= i24;
        }
        i25 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
        if (i25 != 0) {
            i14 |= 12582912;
        } else if ((i12 & 29360128) == 0) {
            if (composerImplMo1636j.m1594E(i11)) {
                i26 = 8388608;
            } else {
                i26 = 4194304;
            }
            i14 |= i26;
        }
        if ((i12 & 234881024) != 0) {
            i14 |= ((i13 & 256) == 0 || !composerImplMo1636j.mo1665y(c7218l)) ? 33554432 : 67108864;
        }
        if ((i14 & 191739611) == 38347922) {
            composerImplMo1636j.m1654s0();
            if ((i12 & 1) != 0) {
                if (i33 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    j13 = C9169u.f47703f;
                } else {
                    j13 = j10;
                }
                if (i17 != 0) {
                    c9797g3 = null;
                } else {
                    c9797g3 = c9797g2;
                }
                if (i19 != 0) {
                    j14 = C10023k.f50982c;
                } else {
                    j14 = j12;
                }
                if (i21 != 0) {
                    i27 = 2;
                } else {
                    i27 = i10;
                }
                if (i23 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i25 != 0) {
                    i28 = Integer.MAX_VALUE;
                } else {
                    i28 = i11;
                }
                if ((i13 & 256) != 0) {
                    i14 &= -234881025;
                    i29 = i28;
                    j15 = j13;
                    c9797g4 = c9797g3;
                    j16 = j14;
                    i30 = i27;
                    z12 = z11;
                    c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                    interfaceC0500b3 = interfaceC0500b2;
                } else {
                    c7218l2 = c7218l;
                    i29 = i28;
                    interfaceC0500b3 = interfaceC0500b2;
                    j15 = j13;
                    c9797g4 = c9797g3;
                    j16 = j14;
                    i30 = i27;
                    z12 = z11;
                }
            } else {
                if (i33 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    j13 = C9169u.f47703f;
                } else {
                    j13 = j10;
                }
                if (i17 != 0) {
                    c9797g3 = null;
                } else {
                    c9797g3 = c9797g2;
                }
                if (i19 != 0) {
                    j14 = C10023k.f50982c;
                } else {
                    j14 = j12;
                }
                if (i21 != 0) {
                    i27 = 2;
                } else {
                    i27 = i10;
                }
                if (i23 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i25 != 0) {
                    i28 = Integer.MAX_VALUE;
                } else {
                    i28 = i11;
                }
                if ((i13 & 256) != 0) {
                    i14 &= -234881025;
                    i29 = i28;
                    j15 = j13;
                    c9797g4 = c9797g3;
                    j16 = j14;
                    i30 = i27;
                    z12 = z11;
                    c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                    interfaceC0500b3 = interfaceC0500b2;
                } else {
                    c7218l2 = c7218l;
                    i29 = i28;
                    interfaceC0500b3 = interfaceC0500b2;
                    j15 = j13;
                    c9797g4 = c9797g3;
                    j16 = j14;
                    i30 = i27;
                    z12 = z11;
                }
            }
            composerImplMo1636j.m1610R();
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1110 = ComposerKt.f3003a;
            composerImplMo1636j.mo1622c(-492369756);
            objM1619a0 = composerImplMo1636j.m1619a0();
            c10586a = InterfaceC0476a.a.f3122a;
            if (objM1619a0 == c10586a) {
                objM1619a0 = C8573r0.m16684L0(c7218l2);
                composerImplMo1636j.m1597F0(objM1619a0);
            }
            composerImplMo1636j.m1609Q(false);
            interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
            composerImplMo1636j.mo1622c(-492369756);
            objM1619a1 = composerImplMo1636j.m1619a0();
            if (objM1619a1 == c10586a) {
                objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                composerImplMo1636j.m1597F0(objM1619a1);
            }
            composerImplMo1636j.m1609Q(false);
            interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
            composerImplMo1636j.mo1622c(1157296644);
            zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
            objM1619a2 = composerImplMo1636j.m1619a0();
            if (zMo1665y) {
                objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                        InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                        C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                        if (interfaceC5312g1.getValue().booleanValue()) {
                            interfaceC9619c2.mo12668E0();
                        }
                        return C9072e.f47360a;
                    }
                };
                composerImplMo1636j.m1597F0(objM1619a2);
            } else {
                objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                        InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                        C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                        if (interfaceC5312g1.getValue().booleanValue()) {
                            interfaceC9619c2.mo12668E0();
                        }
                        return C9072e.f47360a;
                    }
                };
                composerImplMo1636j.m1597F0(objM1619a2);
            }
            composerImplMo1636j.m1609Q(false);
            InterfaceC0500b interfaceC0500bM1950c1110 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
            C7218l c7218l1113 = (C7218l) interfaceC5312g0.getValue();
            composerImplMo1636j.mo1622c(511388516);
            zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
            objM1619a3 = composerImplMo1636j.m1619a0();
            if (zMo1665y2) {
                objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(C7216j c7216j) {
                        C7216j c7216j2 = c7216j;
                        C5207g.m11111f(c7216j2, "result");
                        C0692c c0692c = c7216j2.f40591b;
                        int i31111112 = c0692c.f4561f - 1;
                        c0692c.m2586c(i31111112);
                        ArrayList arrayList = c0692c.f4563h;
                        if (((C7208b) arrayList.get(C8573r0.m16731j0(i31111112, arrayList))).f40548a.mo2555l(i31111112)) {
                            InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                            C7218l value = interfaceC5312g2.getValue();
                            long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                            if (!(!C8573r0.m16670E0(j19))) {
                                throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                            }
                            interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                        } else {
                            interfaceC5312g1.setValue(Boolean.TRUE);
                        }
                        return C9072e.f47360a;
                    }
                };
                composerImplMo1636j.m1597F0(objM1619a3);
            } else {
                objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(C7216j c7216j) {
                        C7216j c7216j2 = c7216j;
                        C5207g.m11111f(c7216j2, "result");
                        C0692c c0692c = c7216j2.f40591b;
                        int i31111112 = c0692c.f4561f - 1;
                        c0692c.m2586c(i31111112);
                        ArrayList arrayList = c0692c.f4563h;
                        if (((C7208b) arrayList.get(C8573r0.m16731j0(i31111112, arrayList))).f40548a.mo2555l(i31111112)) {
                            InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                            C7218l value = interfaceC5312g2.getValue();
                            long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                            if (!(!C8573r0.m16670E0(j19))) {
                                throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                            }
                            interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                        } else {
                            interfaceC5312g1.setValue(Boolean.TRUE);
                        }
                        return C9072e.f47360a;
                    }
                };
                composerImplMo1636j.m1597F0(objM1619a3);
            }
            composerImplMo1636j.m1609Q(false);
            int i31111112 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
            int i31111113 = i14 >> 12;
            InterfaceC0500b interfaceC0500b1114 = interfaceC0500b3;
            composerImpl = composerImplMo1636j;
            TextKt.m1576c(str, interfaceC0500bM1950c1110, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l1113, composerImpl, i31111112, (i31111113 & 14) | (i31111113 & 112) | (i31111113 & 896) | (i31111113 & 7168), 504);
            j17 = j15;
            c9797g5 = c9797g4;
            j18 = j16;
            i31 = i30;
            z13 = z12;
            i32 = i29;
            c7218l3 = c7218l2;
            interfaceC0500b4 = interfaceC0500b1114;
        } else {
            composerImplMo1636j.m1654s0();
            if ((i12 & 1) != 0) {
                if (i33 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    j13 = C9169u.f47703f;
                } else {
                    j13 = j10;
                }
                if (i17 != 0) {
                    c9797g3 = null;
                } else {
                    c9797g3 = c9797g2;
                }
                if (i19 != 0) {
                    j14 = C10023k.f50982c;
                } else {
                    j14 = j12;
                }
                if (i21 != 0) {
                    i27 = 2;
                } else {
                    i27 = i10;
                }
                if (i23 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i25 != 0) {
                    i28 = Integer.MAX_VALUE;
                } else {
                    i28 = i11;
                }
                if ((i13 & 256) != 0) {
                    i14 &= -234881025;
                    i29 = i28;
                    j15 = j13;
                    c9797g4 = c9797g3;
                    j16 = j14;
                    i30 = i27;
                    z12 = z11;
                    c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                    interfaceC0500b3 = interfaceC0500b2;
                } else {
                    c7218l2 = c7218l;
                    i29 = i28;
                    interfaceC0500b3 = interfaceC0500b2;
                    j15 = j13;
                    c9797g4 = c9797g3;
                    j16 = j14;
                    i30 = i27;
                    z12 = z11;
                }
            } else {
                if (i33 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    j13 = C9169u.f47703f;
                } else {
                    j13 = j10;
                }
                if (i17 != 0) {
                    c9797g3 = null;
                } else {
                    c9797g3 = c9797g2;
                }
                if (i19 != 0) {
                    j14 = C10023k.f50982c;
                } else {
                    j14 = j12;
                }
                if (i21 != 0) {
                    i27 = 2;
                } else {
                    i27 = i10;
                }
                if (i23 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i25 != 0) {
                    i28 = Integer.MAX_VALUE;
                } else {
                    i28 = i11;
                }
                if ((i13 & 256) != 0) {
                    i14 &= -234881025;
                    i29 = i28;
                    j15 = j13;
                    c9797g4 = c9797g3;
                    j16 = j14;
                    i30 = i27;
                    z12 = z11;
                    c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                    interfaceC0500b3 = interfaceC0500b2;
                } else {
                    c7218l2 = c7218l;
                    i29 = i28;
                    interfaceC0500b3 = interfaceC0500b2;
                    j15 = j13;
                    c9797g4 = c9797g3;
                    j16 = j14;
                    i30 = i27;
                    z12 = z11;
                }
            }
            composerImplMo1636j.m1610R();
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111 = ComposerKt.f3003a;
            composerImplMo1636j.mo1622c(-492369756);
            objM1619a0 = composerImplMo1636j.m1619a0();
            c10586a = InterfaceC0476a.a.f3122a;
            if (objM1619a0 == c10586a) {
                objM1619a0 = C8573r0.m16684L0(c7218l2);
                composerImplMo1636j.m1597F0(objM1619a0);
            }
            composerImplMo1636j.m1609Q(false);
            interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
            composerImplMo1636j.mo1622c(-492369756);
            objM1619a1 = composerImplMo1636j.m1619a0();
            if (objM1619a1 == c10586a) {
                objM1619a1 = C8573r0.m16684L0(Boolean.FALSE);
                composerImplMo1636j.m1597F0(objM1619a1);
            }
            composerImplMo1636j.m1609Q(false);
            interfaceC5312g1 = (InterfaceC5312g0) objM1619a1;
            composerImplMo1636j.mo1622c(1157296644);
            zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g1);
            objM1619a2 = composerImplMo1636j.m1619a0();
            if (zMo1665y) {
                objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                        InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                        C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                        if (interfaceC5312g1.getValue().booleanValue()) {
                            interfaceC9619c2.mo12668E0();
                        }
                        return C9072e.f47360a;
                    }
                };
                composerImplMo1636j.m1597F0(objM1619a2);
            } else {
                objM1619a2 = new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                        InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                        C5207g.m11111f(interfaceC9619c2, "$this$drawWithContent");
                        if (interfaceC5312g1.getValue().booleanValue()) {
                            interfaceC9619c2.mo12668E0();
                        }
                        return C9072e.f47360a;
                    }
                };
                composerImplMo1636j.m1597F0(objM1619a2);
            }
            composerImplMo1636j.m1609Q(false);
            InterfaceC0500b interfaceC0500bM1950c1111 = C0501a.m1950c(interfaceC0500b3, (InterfaceC2052l) objM1619a2);
            C7218l c7218l1114 = (C7218l) interfaceC5312g0.getValue();
            composerImplMo1636j.mo1622c(511388516);
            zMo1665y2 = composerImplMo1636j.mo1665y(interfaceC5312g0) | composerImplMo1636j.mo1665y(interfaceC5312g1);
            objM1619a3 = composerImplMo1636j.m1619a0();
            if (zMo1665y2) {
                objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(C7216j c7216j) {
                        C7216j c7216j2 = c7216j;
                        C5207g.m11111f(c7216j2, "result");
                        C0692c c0692c = c7216j2.f40591b;
                        int i31111114 = c0692c.f4561f - 1;
                        c0692c.m2586c(i31111114);
                        ArrayList arrayList = c0692c.f4563h;
                        if (((C7208b) arrayList.get(C8573r0.m16731j0(i31111114, arrayList))).f40548a.mo2555l(i31111114)) {
                            InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                            C7218l value = interfaceC5312g2.getValue();
                            long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                            if (!(!C8573r0.m16670E0(j19))) {
                                throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                            }
                            interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                        } else {
                            interfaceC5312g1.setValue(Boolean.TRUE);
                        }
                        return C9072e.f47360a;
                    }
                };
                composerImplMo1636j.m1597F0(objM1619a3);
            } else {
                objM1619a3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(C7216j c7216j) {
                        C7216j c7216j2 = c7216j;
                        C5207g.m11111f(c7216j2, "result");
                        C0692c c0692c = c7216j2.f40591b;
                        int i31111114 = c0692c.f4561f - 1;
                        c0692c.m2586c(i31111114);
                        ArrayList arrayList = c0692c.f4563h;
                        if (((C7208b) arrayList.get(C8573r0.m16731j0(i31111114, arrayList))).f40548a.mo2555l(i31111114)) {
                            InterfaceC5312g0<C7218l> interfaceC5312g2 = interfaceC5312g0;
                            C7218l value = interfaceC5312g2.getValue();
                            long j19 = interfaceC5312g2.getValue().f40600a.f40571b;
                            if (!(!C8573r0.m16670E0(j19))) {
                                throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                            }
                            interfaceC5312g2.setValue(C7218l.m14543a(value, C8573r0.m16690O0((float) (((double) C10023k.m18632c(j19)) * 0.9d), 1095216660480L & j19), null, 4194301));
                        } else {
                            interfaceC5312g1.setValue(Boolean.TRUE);
                        }
                        return C9072e.f47360a;
                    }
                };
                composerImplMo1636j.m1597F0(objM1619a3);
            }
            composerImplMo1636j.m1609Q(false);
            int i31111114 = (i14 & 14) | (i14 & 896) | ((i14 << 18) & 1879048192);
            int i31111115 = i14 >> 12;
            InterfaceC0500b interfaceC0500b1115 = interfaceC0500b3;
            composerImpl = composerImplMo1636j;
            TextKt.m1576c(str, interfaceC0500bM1950c1111, j15, 0L, null, null, null, 0L, null, c9797g4, j16, i30, z12, i29, (InterfaceC2052l) objM1619a3, c7218l1114, composerImpl, i31111114, (i31111115 & 14) | (i31111115 & 112) | (i31111115 & 896) | (i31111115 & 7168), 504);
            j17 = j15;
            c9797g5 = c9797g4;
            j18 = j16;
            i31 = i30;
            z13 = z12;
            i32 = i29;
            c7218l3 = c7218l2;
            interfaceC0500b4 = interfaceC0500b1115;
        }
        c5332q0M1612T = composerImpl.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.AutoSizedTextKt$AutoSizeText$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                AutoSizedTextKt.m10305a(str, interfaceC0500b4, j17, c9797g5, j18, i31, z13, i32, c7218l3, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                return C9072e.f47360a;
            }
        };
    }
}
