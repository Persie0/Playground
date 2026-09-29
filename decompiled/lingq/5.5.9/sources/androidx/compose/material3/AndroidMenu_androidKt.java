package androidx.compose.material3;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.platform.CompositionLocalsKt;
import androidx.compose.p017ui.window.AndroidPopup_androidKt;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import dm.C5212l;
import p036c0.C1650f;
import p081e0.C5332q0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5336s0;
import p230l0.C7204a;
import p338qd.C8573r0;
import p338qd.C8584v;
import p374s.C8934v;
import p387t0.C9162o0;
import p443w.InterfaceC9771b;
import p470x1.C10021i;
import p470x1.InterfaceC10015c;
import p521z1.C10435i;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidMenu_androidKt {
    /* JADX WARN: Code duplicated, block: B:101:0x016a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0196 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x0198  */
    /* JADX WARN: Code duplicated, block: B:111:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:87:0x0101  */
    /* JADX WARN: Code duplicated, block: B:90:0x0106  */
    /* JADX WARN: Code duplicated, block: B:91:0x0117  */
    /* JADX WARN: Code duplicated, block: B:94:0x012d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0153  */
    /* JADX WARN: Code duplicated, block: B:99:0x0161  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1, kotlin.jvm.internal.Lambda] */
    /* JADX INFO: renamed from: a */
    public static final void m1554a(final boolean z10, final InterfaceC2041a<C9072e> interfaceC2041a, InterfaceC0500b interfaceC0500b, long j10, C10435i c10435i, final InterfaceC2057q<? super InterfaceC9771b, ? super InterfaceC0476a, ? super Integer, C9072e> interfaceC2057q, InterfaceC0476a interfaceC0476a, final int i10, final int i11) {
        int i12;
        InterfaceC0500b interfaceC0500b2;
        int i13;
        final long j11;
        int i14;
        final C10435i c10435i2;
        int i15;
        InterfaceC0500b interfaceC0500b3;
        long jM16786k;
        InterfaceC0500b interfaceC0500b4;
        long j12;
        int i16;
        C10435i c10435i3;
        Object objM1619a0;
        InterfaceC0476a.a.C10586a c10586a;
        final C8934v c8934v;
        Object objM1619a1;
        final InterfaceC5312g0 interfaceC5312g0;
        boolean zMo1665y;
        Object objM1619a2;
        final InterfaceC0500b interfaceC0500b5;
        C5332q0 c5332q0M1612T;
        C5207g.m11111f(interfaceC2041a, "onDismissRequest");
        C5207g.m11111f(interfaceC2057q, "content");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(354826666);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerImplMo1636j.m1598G(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerImplMo1636j.mo1665y(interfaceC2041a) ? 32 : 16;
        }
        int i17 = i11 & 4;
        if (i17 == 0) {
            if ((i10 & 896) == 0) {
                interfaceC0500b2 = interfaceC0500b;
                i12 |= composerImplMo1636j.mo1665y(interfaceC0500b2) ? 256 : BuildConfig.SDK_TRUNCATE_LENGTH;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    j11 = j10;
                    if (composerImplMo1636j.m1596F(j11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        c10435i2 = c10435i;
                        int i18 = composerImplMo1636j.mo1665y(c10435i2) ? 16384 : 8192;
                        i12 |= i18;
                    } else {
                        c10435i2 = c10435i;
                    }
                    i12 |= i18;
                } else {
                    c10435i2 = c10435i;
                }
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (composerImplMo1636j.mo1665y(interfaceC2057q)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898 || !composerImplMo1636j.mo1642m()) {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0 || composerImplMo1636j.m1616X()) {
                            if (i17 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if (i13 != 0) {
                                float f3 = 0;
                                jM16786k = C8584v.m16786k(f3, f3);
                            } else {
                                jM16786k = j11;
                            }
                            if ((i11 & 16) != 0) {
                                i16 = i12 & (-57345);
                                interfaceC0500b4 = interfaceC0500b3;
                                j12 = jM16786k;
                                c10435i3 = new C10435i(true, 62);
                            } else {
                                interfaceC0500b4 = interfaceC0500b3;
                                j12 = jM16786k;
                            }
                            composerImplMo1636j.m1610R();
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            c10586a = InterfaceC0476a.a.f3122a;
                            if (objM1619a0 == c10586a) {
                                objM1619a0 = new C8934v(Boolean.FALSE);
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            c8934v = (C8934v) objM1619a0;
                            c8934v.f46859b.setValue(Boolean.valueOf(z10));
                            if (((Boolean) c8934v.f46858a.getValue()).booleanValue() || ((Boolean) c8934v.f46859b.getValue()).booleanValue()) {
                                composerImplMo1636j.mo1622c(-492369756);
                                objM1619a1 = composerImplMo1636j.m1619a0();
                                if (objM1619a1 == c10586a) {
                                    objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                                    composerImplMo1636j.m1597F0(objM1619a1);
                                }
                                composerImplMo1636j.m1609Q(false);
                                interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                                InterfaceC10015c interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                                composerImplMo1636j.mo1622c(1157296644);
                                zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                                objM1619a2 = composerImplMo1636j.m1619a0();
                                if (zMo1665y || objM1619a2 == c10586a) {
                                    objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                        /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                        @Override // cm.InterfaceC2056p
                                        /* JADX INFO: renamed from: m0 */
                                        public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                            float fMin;
                                            C10021i c10021i3 = c10021i;
                                            C10021i c10021i4 = c10021i2;
                                            C5207g.m11111f(c10021i3, "parentBounds");
                                            C5207g.m11111f(c10021i4, "menuBounds");
                                            float f10 = MenuKt.f2763a;
                                            float fMin2 = 1.0f;
                                            int i19 = c10021i3.f50978c;
                                            int i20 = c10021i4.f50976a;
                                            if (i20 < i19) {
                                                int i21 = c10021i4.f50978c;
                                                int i22 = c10021i3.f50976a;
                                                if (i21 <= i22) {
                                                    fMin = 1.0f;
                                                } else {
                                                    int i23 = i21 - i20;
                                                    if (i23 == 0) {
                                                        fMin = 0.0f;
                                                    } else {
                                                        fMin = (((Math.min(i19, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                                    }
                                                }
                                            } else {
                                                fMin = 0.0f;
                                            }
                                            int i24 = c10021i3.f50979d;
                                            int i25 = c10021i4.f50977b;
                                            if (i25 < i24) {
                                                int i26 = c10021i4.f50979d;
                                                int i27 = c10021i3.f50977b;
                                                if (i26 > i27) {
                                                    int i28 = i26 - i25;
                                                    if (i28 == 0) {
                                                        fMin2 = 0.0f;
                                                    } else {
                                                        fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                                    }
                                                }
                                            } else {
                                                fMin2 = 0.0f;
                                            }
                                            interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                            return C9072e.f47360a;
                                        }
                                    };
                                    composerImplMo1636j.m1597F0(objM1619a2);
                                }
                                composerImplMo1636j.m1609Q(false);
                                C1650f c1650f = new C1650f(j12, interfaceC10015c, (InterfaceC2056p) objM1619a2);
                                final InterfaceC0500b interfaceC0500b6 = interfaceC0500b4;
                                final int i19 = i16;
                                AndroidPopup_androidKt.m2619a(c1650f, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                                            C8934v<Boolean> c8934v2 = c8934v;
                                            InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                            InterfaceC0500b interfaceC0500b7 = interfaceC0500b6;
                                            InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q4 = interfaceC2057q;
                                            int i20 = i19;
                                            MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b7, interfaceC2057q4, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                                        }
                                        return C9072e.f47360a;
                                    }
                                }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                            }
                            interfaceC0500b5 = interfaceC0500b4;
                            j11 = j12;
                            c10435i2 = c10435i3;
                        } else {
                            composerImplMo1636j.mo1650q();
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            interfaceC0500b4 = interfaceC0500b2;
                            j12 = j11;
                        }
                        c10435i3 = c10435i2;
                        i16 = i12;
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        c10586a = InterfaceC0476a.a.f3122a;
                        if (objM1619a0 == c10586a) {
                            objM1619a0 = new C8934v(Boolean.FALSE);
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        c8934v = (C8934v) objM1619a0;
                        c8934v.f46859b.setValue(Boolean.valueOf(z10));
                        if (((Boolean) c8934v.f46858a.getValue()).booleanValue()) {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a1 = composerImplMo1636j.m1619a0();
                            if (objM1619a1 == c10586a) {
                                objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                                composerImplMo1636j.m1597F0(objM1619a1);
                            }
                            composerImplMo1636j.m1609Q(false);
                            interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                            InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                            composerImplMo1636j.mo1622c(1157296644);
                            zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                            objM1619a2 = composerImplMo1636j.m1619a0();
                            if (zMo1665y) {
                                objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                        float fMin;
                                        C10021i c10021i3 = c10021i;
                                        C10021i c10021i4 = c10021i2;
                                        C5207g.m11111f(c10021i3, "parentBounds");
                                        C5207g.m11111f(c10021i4, "menuBounds");
                                        float f10 = MenuKt.f2763a;
                                        float fMin2 = 1.0f;
                                        int i110 = c10021i3.f50978c;
                                        int i20 = c10021i4.f50976a;
                                        if (i20 < i110) {
                                            int i21 = c10021i4.f50978c;
                                            int i22 = c10021i3.f50976a;
                                            if (i21 <= i22) {
                                                fMin = 1.0f;
                                            } else {
                                                int i23 = i21 - i20;
                                                if (i23 == 0) {
                                                    fMin = 0.0f;
                                                } else {
                                                    fMin = (((Math.min(i110, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                                }
                                            }
                                        } else {
                                            fMin = 0.0f;
                                        }
                                        int i24 = c10021i3.f50979d;
                                        int i25 = c10021i4.f50977b;
                                        if (i25 < i24) {
                                            int i26 = c10021i4.f50979d;
                                            int i27 = c10021i3.f50977b;
                                            if (i26 > i27) {
                                                int i28 = i26 - i25;
                                                if (i28 == 0) {
                                                    fMin2 = 0.0f;
                                                } else {
                                                    fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                                }
                                            }
                                        } else {
                                            fMin2 = 0.0f;
                                        }
                                        interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                        return C9072e.f47360a;
                                    }
                                };
                                composerImplMo1636j.m1597F0(objM1619a2);
                            } else {
                                objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                        float fMin;
                                        C10021i c10021i3 = c10021i;
                                        C10021i c10021i4 = c10021i2;
                                        C5207g.m11111f(c10021i3, "parentBounds");
                                        C5207g.m11111f(c10021i4, "menuBounds");
                                        float f10 = MenuKt.f2763a;
                                        float fMin2 = 1.0f;
                                        int i110 = c10021i3.f50978c;
                                        int i20 = c10021i4.f50976a;
                                        if (i20 < i110) {
                                            int i21 = c10021i4.f50978c;
                                            int i22 = c10021i3.f50976a;
                                            if (i21 <= i22) {
                                                fMin = 1.0f;
                                            } else {
                                                int i23 = i21 - i20;
                                                if (i23 == 0) {
                                                    fMin = 0.0f;
                                                } else {
                                                    fMin = (((Math.min(i110, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                                }
                                            }
                                        } else {
                                            fMin = 0.0f;
                                        }
                                        int i24 = c10021i3.f50979d;
                                        int i25 = c10021i4.f50977b;
                                        if (i25 < i24) {
                                            int i26 = c10021i4.f50979d;
                                            int i27 = c10021i3.f50977b;
                                            if (i26 > i27) {
                                                int i28 = i26 - i25;
                                                if (i28 == 0) {
                                                    fMin2 = 0.0f;
                                                } else {
                                                    fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                                }
                                            }
                                        } else {
                                            fMin2 = 0.0f;
                                        }
                                        interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                        return C9072e.f47360a;
                                    }
                                };
                                composerImplMo1636j.m1597F0(objM1619a2);
                            }
                            composerImplMo1636j.m1609Q(false);
                            C1650f c1650f2 = new C1650f(j12, interfaceC10015c2, (InterfaceC2056p) objM1619a2);
                            final InterfaceC0500b interfaceC0500b7 = interfaceC0500b4;
                            final int i110 = i16;
                            AndroidPopup_androidKt.m2619a(c1650f2, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                                        C8934v<Boolean> c8934v2 = c8934v;
                                        InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                        InterfaceC0500b interfaceC0500b8 = interfaceC0500b7;
                                        InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q5 = interfaceC2057q;
                                        int i20 = i110;
                                        MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b8, interfaceC2057q5, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                                    }
                                    return C9072e.f47360a;
                                }
                            }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                        } else {
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a1 = composerImplMo1636j.m1619a0();
                            if (objM1619a1 == c10586a) {
                                objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                                composerImplMo1636j.m1597F0(objM1619a1);
                            }
                            composerImplMo1636j.m1609Q(false);
                            interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                            InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                            composerImplMo1636j.mo1622c(1157296644);
                            zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                            objM1619a2 = composerImplMo1636j.m1619a0();
                            if (zMo1665y) {
                                objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                        float fMin;
                                        C10021i c10021i3 = c10021i;
                                        C10021i c10021i4 = c10021i2;
                                        C5207g.m11111f(c10021i3, "parentBounds");
                                        C5207g.m11111f(c10021i4, "menuBounds");
                                        float f10 = MenuKt.f2763a;
                                        float fMin2 = 1.0f;
                                        int i111 = c10021i3.f50978c;
                                        int i20 = c10021i4.f50976a;
                                        if (i20 < i111) {
                                            int i21 = c10021i4.f50978c;
                                            int i22 = c10021i3.f50976a;
                                            if (i21 <= i22) {
                                                fMin = 1.0f;
                                            } else {
                                                int i23 = i21 - i20;
                                                if (i23 == 0) {
                                                    fMin = 0.0f;
                                                } else {
                                                    fMin = (((Math.min(i111, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                                }
                                            }
                                        } else {
                                            fMin = 0.0f;
                                        }
                                        int i24 = c10021i3.f50979d;
                                        int i25 = c10021i4.f50977b;
                                        if (i25 < i24) {
                                            int i26 = c10021i4.f50979d;
                                            int i27 = c10021i3.f50977b;
                                            if (i26 > i27) {
                                                int i28 = i26 - i25;
                                                if (i28 == 0) {
                                                    fMin2 = 0.0f;
                                                } else {
                                                    fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                                }
                                            }
                                        } else {
                                            fMin2 = 0.0f;
                                        }
                                        interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                        return C9072e.f47360a;
                                    }
                                };
                                composerImplMo1636j.m1597F0(objM1619a2);
                            } else {
                                objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                        float fMin;
                                        C10021i c10021i3 = c10021i;
                                        C10021i c10021i4 = c10021i2;
                                        C5207g.m11111f(c10021i3, "parentBounds");
                                        C5207g.m11111f(c10021i4, "menuBounds");
                                        float f10 = MenuKt.f2763a;
                                        float fMin2 = 1.0f;
                                        int i111 = c10021i3.f50978c;
                                        int i20 = c10021i4.f50976a;
                                        if (i20 < i111) {
                                            int i21 = c10021i4.f50978c;
                                            int i22 = c10021i3.f50976a;
                                            if (i21 <= i22) {
                                                fMin = 1.0f;
                                            } else {
                                                int i23 = i21 - i20;
                                                if (i23 == 0) {
                                                    fMin = 0.0f;
                                                } else {
                                                    fMin = (((Math.min(i111, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                                }
                                            }
                                        } else {
                                            fMin = 0.0f;
                                        }
                                        int i24 = c10021i3.f50979d;
                                        int i25 = c10021i4.f50977b;
                                        if (i25 < i24) {
                                            int i26 = c10021i4.f50979d;
                                            int i27 = c10021i3.f50977b;
                                            if (i26 > i27) {
                                                int i28 = i26 - i25;
                                                if (i28 == 0) {
                                                    fMin2 = 0.0f;
                                                } else {
                                                    fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                                }
                                            }
                                        } else {
                                            fMin2 = 0.0f;
                                        }
                                        interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                        return C9072e.f47360a;
                                    }
                                };
                                composerImplMo1636j.m1597F0(objM1619a2);
                            }
                            composerImplMo1636j.m1609Q(false);
                            C1650f c1650f3 = new C1650f(j12, interfaceC10015c3, (InterfaceC2056p) objM1619a2);
                            final InterfaceC0500b interfaceC0500b8 = interfaceC0500b4;
                            final int i111 = i16;
                            AndroidPopup_androidKt.m2619a(c1650f3, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                                        C8934v<Boolean> c8934v2 = c8934v;
                                        InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                        InterfaceC0500b interfaceC0500b9 = interfaceC0500b8;
                                        InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q5 = interfaceC2057q;
                                        int i20 = i111;
                                        MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b9, interfaceC2057q5, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                                    }
                                    return C9072e.f47360a;
                                }
                            }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                        }
                        interfaceC0500b5 = interfaceC0500b4;
                        j11 = j12;
                        c10435i2 = c10435i3;
                    } else {
                        composerImplMo1636j.mo1650q();
                        interfaceC0500b5 = interfaceC0500b2;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            AndroidMenu_androidKt.m1554a(z10, interfaceC2041a, interfaceC0500b5, j11, c10435i2, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i15 = 196608;
                i12 |= i15;
                if ((374491 & i12) == 74898) {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            float f10 = 0;
                            jM16786k = C8584v.m16786k(f10, f10);
                        } else {
                            jM16786k = j11;
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = new C10435i(true, 62);
                        } else {
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = c10435i2;
                            i16 = i12;
                        }
                    } else {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            float f11 = 0;
                            jM16786k = C8584v.m16786k(f11, f11);
                        } else {
                            jM16786k = j11;
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = new C10435i(true, 62);
                        } else {
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = c10435i2;
                            i16 = i12;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    c10586a = InterfaceC0476a.a.f3122a;
                    if (objM1619a0 == c10586a) {
                        objM1619a0 = new C8934v(Boolean.FALSE);
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    c8934v = (C8934v) objM1619a0;
                    c8934v.f46859b.setValue(Boolean.valueOf(z10));
                    if (((Boolean) c8934v.f46858a.getValue()).booleanValue()) {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a1 = composerImplMo1636j.m1619a0();
                        if (objM1619a1 == c10586a) {
                            objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                            composerImplMo1636j.m1597F0(objM1619a1);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                        InterfaceC10015c interfaceC10015c4 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                        composerImplMo1636j.mo1622c(1157296644);
                        zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                        objM1619a2 = composerImplMo1636j.m1619a0();
                        if (zMo1665y) {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f12 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i112 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i112) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i112, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        } else {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f12 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i112 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i112) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i112, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        }
                        composerImplMo1636j.m1609Q(false);
                        C1650f c1650f4 = new C1650f(j12, interfaceC10015c4, (InterfaceC2056p) objM1619a2);
                        final InterfaceC0500b interfaceC0500b9 = interfaceC0500b4;
                        final int i112 = i16;
                        AndroidPopup_androidKt.m2619a(c1650f4, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                    C8934v<Boolean> c8934v2 = c8934v;
                                    InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                    InterfaceC0500b interfaceC0500b10 = interfaceC0500b9;
                                    InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q6 = interfaceC2057q;
                                    int i20 = i112;
                                    MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b10, interfaceC2057q6, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                                }
                                return C9072e.f47360a;
                            }
                        }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                    } else {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a1 = composerImplMo1636j.m1619a0();
                        if (objM1619a1 == c10586a) {
                            objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                            composerImplMo1636j.m1597F0(objM1619a1);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                        InterfaceC10015c interfaceC10015c5 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                        composerImplMo1636j.mo1622c(1157296644);
                        zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                        objM1619a2 = composerImplMo1636j.m1619a0();
                        if (zMo1665y) {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f12 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i113 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i113) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i113, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        } else {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f12 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i113 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i113) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i113, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        }
                        composerImplMo1636j.m1609Q(false);
                        C1650f c1650f5 = new C1650f(j12, interfaceC10015c5, (InterfaceC2056p) objM1619a2);
                        final InterfaceC0500b interfaceC0500b10 = interfaceC0500b4;
                        final int i113 = i16;
                        AndroidPopup_androidKt.m2619a(c1650f5, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                    C8934v<Boolean> c8934v2 = c8934v;
                                    InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                    InterfaceC0500b interfaceC0500b11 = interfaceC0500b10;
                                    InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q6 = interfaceC2057q;
                                    int i20 = i113;
                                    MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b11, interfaceC2057q6, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                                }
                                return C9072e.f47360a;
                            }
                        }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                    }
                    interfaceC0500b5 = interfaceC0500b4;
                    j11 = j12;
                    c10435i2 = c10435i3;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            float f12 = 0;
                            jM16786k = C8584v.m16786k(f12, f12);
                        } else {
                            jM16786k = j11;
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = new C10435i(true, 62);
                        } else {
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = c10435i2;
                            i16 = i12;
                        }
                    } else {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            float f13 = 0;
                            jM16786k = C8584v.m16786k(f13, f13);
                        } else {
                            jM16786k = j11;
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = new C10435i(true, 62);
                        } else {
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = c10435i2;
                            i16 = i12;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    c10586a = InterfaceC0476a.a.f3122a;
                    if (objM1619a0 == c10586a) {
                        objM1619a0 = new C8934v(Boolean.FALSE);
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    c8934v = (C8934v) objM1619a0;
                    c8934v.f46859b.setValue(Boolean.valueOf(z10));
                    if (((Boolean) c8934v.f46858a.getValue()).booleanValue()) {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a1 = composerImplMo1636j.m1619a0();
                        if (objM1619a1 == c10586a) {
                            objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                            composerImplMo1636j.m1597F0(objM1619a1);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                        InterfaceC10015c interfaceC10015c6 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                        composerImplMo1636j.mo1622c(1157296644);
                        zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                        objM1619a2 = composerImplMo1636j.m1619a0();
                        if (zMo1665y) {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f14 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i114 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i114) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i114, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        } else {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f14 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i114 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i114) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i114, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        }
                        composerImplMo1636j.m1609Q(false);
                        C1650f c1650f6 = new C1650f(j12, interfaceC10015c6, (InterfaceC2056p) objM1619a2);
                        final InterfaceC0500b interfaceC0500b11 = interfaceC0500b4;
                        final int i114 = i16;
                        AndroidPopup_androidKt.m2619a(c1650f6, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                                    C8934v<Boolean> c8934v2 = c8934v;
                                    InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                    InterfaceC0500b interfaceC0500b12 = interfaceC0500b11;
                                    InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q7 = interfaceC2057q;
                                    int i20 = i114;
                                    MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b12, interfaceC2057q7, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                                }
                                return C9072e.f47360a;
                            }
                        }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                    } else {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a1 = composerImplMo1636j.m1619a0();
                        if (objM1619a1 == c10586a) {
                            objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                            composerImplMo1636j.m1597F0(objM1619a1);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                        InterfaceC10015c interfaceC10015c7 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                        composerImplMo1636j.mo1622c(1157296644);
                        zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                        objM1619a2 = composerImplMo1636j.m1619a0();
                        if (zMo1665y) {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f14 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i115 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i115) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i115, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        } else {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f14 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i115 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i115) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i115, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        }
                        composerImplMo1636j.m1609Q(false);
                        C1650f c1650f7 = new C1650f(j12, interfaceC10015c7, (InterfaceC2056p) objM1619a2);
                        final InterfaceC0500b interfaceC0500b12 = interfaceC0500b4;
                        final int i115 = i16;
                        AndroidPopup_androidKt.m2619a(c1650f7, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                                    C8934v<Boolean> c8934v2 = c8934v;
                                    InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                    InterfaceC0500b interfaceC0500b13 = interfaceC0500b12;
                                    InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q7 = interfaceC2057q;
                                    int i20 = i115;
                                    MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b13, interfaceC2057q7, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                                }
                                return C9072e.f47360a;
                            }
                        }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                    }
                    interfaceC0500b5 = interfaceC0500b4;
                    j11 = j12;
                    c10435i2 = c10435i3;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        AndroidMenu_androidKt.m1554a(z10, interfaceC2041a, interfaceC0500b5, j11, c10435i2, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 3072;
            j11 = j10;
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    c10435i2 = c10435i;
                    if (composerImplMo1636j.mo1665y(c10435i2)) {
                    }
                    i12 |= i18;
                } else {
                    c10435i2 = c10435i;
                }
                i12 |= i18;
            } else {
                c10435i2 = c10435i;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (composerImplMo1636j.mo1665y(interfaceC2057q)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            float f14 = 0;
                            jM16786k = C8584v.m16786k(f14, f14);
                        } else {
                            jM16786k = j11;
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = new C10435i(true, 62);
                        } else {
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = c10435i2;
                            i16 = i12;
                        }
                    } else {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            float f15 = 0;
                            jM16786k = C8584v.m16786k(f15, f15);
                        } else {
                            jM16786k = j11;
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = new C10435i(true, 62);
                        } else {
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = c10435i2;
                            i16 = i12;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    c10586a = InterfaceC0476a.a.f3122a;
                    if (objM1619a0 == c10586a) {
                        objM1619a0 = new C8934v(Boolean.FALSE);
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    c8934v = (C8934v) objM1619a0;
                    c8934v.f46859b.setValue(Boolean.valueOf(z10));
                    if (((Boolean) c8934v.f46858a.getValue()).booleanValue()) {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a1 = composerImplMo1636j.m1619a0();
                        if (objM1619a1 == c10586a) {
                            objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                            composerImplMo1636j.m1597F0(objM1619a1);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                        InterfaceC10015c interfaceC10015c8 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                        composerImplMo1636j.mo1622c(1157296644);
                        zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                        objM1619a2 = composerImplMo1636j.m1619a0();
                        if (zMo1665y) {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f16 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i116 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i116) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i116, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        } else {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f16 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i116 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i116) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i116, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        }
                        composerImplMo1636j.m1609Q(false);
                        C1650f c1650f8 = new C1650f(j12, interfaceC10015c8, (InterfaceC2056p) objM1619a2);
                        final InterfaceC0500b interfaceC0500b13 = interfaceC0500b4;
                        final int i116 = i16;
                        AndroidPopup_androidKt.m2619a(c1650f8, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                                    C8934v<Boolean> c8934v2 = c8934v;
                                    InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                    InterfaceC0500b interfaceC0500b14 = interfaceC0500b13;
                                    InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q8 = interfaceC2057q;
                                    int i20 = i116;
                                    MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b14, interfaceC2057q8, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                                }
                                return C9072e.f47360a;
                            }
                        }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                    } else {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a1 = composerImplMo1636j.m1619a0();
                        if (objM1619a1 == c10586a) {
                            objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                            composerImplMo1636j.m1597F0(objM1619a1);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                        InterfaceC10015c interfaceC10015c9 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                        composerImplMo1636j.mo1622c(1157296644);
                        zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                        objM1619a2 = composerImplMo1636j.m1619a0();
                        if (zMo1665y) {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f16 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i117 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i117) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i117, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        } else {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f16 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i117 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i117) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i117, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        }
                        composerImplMo1636j.m1609Q(false);
                        C1650f c1650f9 = new C1650f(j12, interfaceC10015c9, (InterfaceC2056p) objM1619a2);
                        final InterfaceC0500b interfaceC0500b14 = interfaceC0500b4;
                        final int i117 = i16;
                        AndroidPopup_androidKt.m2619a(c1650f9, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                                    C8934v<Boolean> c8934v2 = c8934v;
                                    InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                    InterfaceC0500b interfaceC0500b15 = interfaceC0500b14;
                                    InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q8 = interfaceC2057q;
                                    int i20 = i117;
                                    MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b15, interfaceC2057q8, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                                }
                                return C9072e.f47360a;
                            }
                        }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                    }
                    interfaceC0500b5 = interfaceC0500b4;
                    j11 = j12;
                    c10435i2 = c10435i3;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            float f16 = 0;
                            jM16786k = C8584v.m16786k(f16, f16);
                        } else {
                            jM16786k = j11;
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = new C10435i(true, 62);
                        } else {
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = c10435i2;
                            i16 = i12;
                        }
                    } else {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            float f17 = 0;
                            jM16786k = C8584v.m16786k(f17, f17);
                        } else {
                            jM16786k = j11;
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = new C10435i(true, 62);
                        } else {
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = c10435i2;
                            i16 = i12;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    c10586a = InterfaceC0476a.a.f3122a;
                    if (objM1619a0 == c10586a) {
                        objM1619a0 = new C8934v(Boolean.FALSE);
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    c8934v = (C8934v) objM1619a0;
                    c8934v.f46859b.setValue(Boolean.valueOf(z10));
                    if (((Boolean) c8934v.f46858a.getValue()).booleanValue()) {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a1 = composerImplMo1636j.m1619a0();
                        if (objM1619a1 == c10586a) {
                            objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                            composerImplMo1636j.m1597F0(objM1619a1);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                        InterfaceC10015c interfaceC10015c10 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                        composerImplMo1636j.mo1622c(1157296644);
                        zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                        objM1619a2 = composerImplMo1636j.m1619a0();
                        if (zMo1665y) {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f18 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i118 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i118) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i118, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        } else {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f18 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i118 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i118) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i118, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        }
                        composerImplMo1636j.m1609Q(false);
                        C1650f c1650f10 = new C1650f(j12, interfaceC10015c10, (InterfaceC2056p) objM1619a2);
                        final InterfaceC0500b interfaceC0500b15 = interfaceC0500b4;
                        final int i118 = i16;
                        AndroidPopup_androidKt.m2619a(c1650f10, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                                    C8934v<Boolean> c8934v2 = c8934v;
                                    InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                    InterfaceC0500b interfaceC0500b16 = interfaceC0500b15;
                                    InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q9 = interfaceC2057q;
                                    int i20 = i118;
                                    MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b16, interfaceC2057q9, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                                }
                                return C9072e.f47360a;
                            }
                        }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                    } else {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a1 = composerImplMo1636j.m1619a0();
                        if (objM1619a1 == c10586a) {
                            objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                            composerImplMo1636j.m1597F0(objM1619a1);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                        InterfaceC10015c interfaceC10015c11 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                        composerImplMo1636j.mo1622c(1157296644);
                        zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                        objM1619a2 = composerImplMo1636j.m1619a0();
                        if (zMo1665y) {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f18 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i119 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i119) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i119, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        } else {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f18 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i119 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i119) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i119, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        }
                        composerImplMo1636j.m1609Q(false);
                        C1650f c1650f11 = new C1650f(j12, interfaceC10015c11, (InterfaceC2056p) objM1619a2);
                        final InterfaceC0500b interfaceC0500b16 = interfaceC0500b4;
                        final int i119 = i16;
                        AndroidPopup_androidKt.m2619a(c1650f11, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                                    C8934v<Boolean> c8934v2 = c8934v;
                                    InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                    InterfaceC0500b interfaceC0500b17 = interfaceC0500b16;
                                    InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q9 = interfaceC2057q;
                                    int i20 = i119;
                                    MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b17, interfaceC2057q9, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                                }
                                return C9072e.f47360a;
                            }
                        }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                    }
                    interfaceC0500b5 = interfaceC0500b4;
                    j11 = j12;
                    c10435i2 = c10435i3;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        AndroidMenu_androidKt.m1554a(z10, interfaceC2041a, interfaceC0500b5, j11, c10435i2, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i15 = 196608;
            i12 |= i15;
            if ((374491 & i12) == 74898) {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        float f18 = 0;
                        jM16786k = C8584v.m16786k(f18, f18);
                    } else {
                        jM16786k = j11;
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = new C10435i(true, 62);
                    } else {
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = c10435i2;
                        i16 = i12;
                    }
                } else {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        float f19 = 0;
                        jM16786k = C8584v.m16786k(f19, f19);
                    } else {
                        jM16786k = j11;
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = new C10435i(true, 62);
                    } else {
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = c10435i2;
                        i16 = i12;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                c10586a = InterfaceC0476a.a.f3122a;
                if (objM1619a0 == c10586a) {
                    objM1619a0 = new C8934v(Boolean.FALSE);
                    composerImplMo1636j.m1597F0(objM1619a0);
                }
                composerImplMo1636j.m1609Q(false);
                c8934v = (C8934v) objM1619a0;
                c8934v.f46859b.setValue(Boolean.valueOf(z10));
                if (((Boolean) c8934v.f46858a.getValue()).booleanValue()) {
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                    InterfaceC10015c interfaceC10015c12 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f110 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i1110 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i1110) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i1110, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f110 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i1110 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i1110) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i1110, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    C1650f c1650f12 = new C1650f(j12, interfaceC10015c12, (InterfaceC2056p) objM1619a2);
                    final InterfaceC0500b interfaceC0500b17 = interfaceC0500b4;
                    final int i1110 = i16;
                    AndroidPopup_androidKt.m2619a(c1650f12, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q9 = ComposerKt.f3003a;
                                C8934v<Boolean> c8934v2 = c8934v;
                                InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                InterfaceC0500b interfaceC0500b18 = interfaceC0500b17;
                                InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q10 = interfaceC2057q;
                                int i20 = i1110;
                                MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b18, interfaceC2057q10, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                } else {
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                    InterfaceC10015c interfaceC10015c13 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f110 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i1111 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i1111) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i1111, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f110 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i1111 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i1111) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i1111, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    C1650f c1650f13 = new C1650f(j12, interfaceC10015c13, (InterfaceC2056p) objM1619a2);
                    final InterfaceC0500b interfaceC0500b18 = interfaceC0500b4;
                    final int i1111 = i16;
                    AndroidPopup_androidKt.m2619a(c1650f13, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q9 = ComposerKt.f3003a;
                                C8934v<Boolean> c8934v2 = c8934v;
                                InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                InterfaceC0500b interfaceC0500b19 = interfaceC0500b18;
                                InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q10 = interfaceC2057q;
                                int i20 = i1111;
                                MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b19, interfaceC2057q10, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                }
                interfaceC0500b5 = interfaceC0500b4;
                j11 = j12;
                c10435i2 = c10435i3;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        float f110 = 0;
                        jM16786k = C8584v.m16786k(f110, f110);
                    } else {
                        jM16786k = j11;
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = new C10435i(true, 62);
                    } else {
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = c10435i2;
                        i16 = i12;
                    }
                } else {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        float f111 = 0;
                        jM16786k = C8584v.m16786k(f111, f111);
                    } else {
                        jM16786k = j11;
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = new C10435i(true, 62);
                    } else {
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = c10435i2;
                        i16 = i12;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q9 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                c10586a = InterfaceC0476a.a.f3122a;
                if (objM1619a0 == c10586a) {
                    objM1619a0 = new C8934v(Boolean.FALSE);
                    composerImplMo1636j.m1597F0(objM1619a0);
                }
                composerImplMo1636j.m1609Q(false);
                c8934v = (C8934v) objM1619a0;
                c8934v.f46859b.setValue(Boolean.valueOf(z10));
                if (((Boolean) c8934v.f46858a.getValue()).booleanValue()) {
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                    InterfaceC10015c interfaceC10015c14 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f112 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i1112 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i1112) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i1112, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f112 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i1112 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i1112) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i1112, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    C1650f c1650f14 = new C1650f(j12, interfaceC10015c14, (InterfaceC2056p) objM1619a2);
                    final InterfaceC0500b interfaceC0500b19 = interfaceC0500b4;
                    final int i1112 = i16;
                    AndroidPopup_androidKt.m2619a(c1650f14, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q10 = ComposerKt.f3003a;
                                C8934v<Boolean> c8934v2 = c8934v;
                                InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                InterfaceC0500b interfaceC0500b110 = interfaceC0500b19;
                                InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q11 = interfaceC2057q;
                                int i20 = i1112;
                                MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b110, interfaceC2057q11, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                } else {
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                    InterfaceC10015c interfaceC10015c15 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f112 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i1113 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i1113) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i1113, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f112 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i1113 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i1113) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i1113, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    C1650f c1650f15 = new C1650f(j12, interfaceC10015c15, (InterfaceC2056p) objM1619a2);
                    final InterfaceC0500b interfaceC0500b110 = interfaceC0500b4;
                    final int i1113 = i16;
                    AndroidPopup_androidKt.m2619a(c1650f15, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q10 = ComposerKt.f3003a;
                                C8934v<Boolean> c8934v2 = c8934v;
                                InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                InterfaceC0500b interfaceC0500b111 = interfaceC0500b110;
                                InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q11 = interfaceC2057q;
                                int i20 = i1113;
                                MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b111, interfaceC2057q11, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                }
                interfaceC0500b5 = interfaceC0500b4;
                j11 = j12;
                c10435i2 = c10435i3;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    AndroidMenu_androidKt.m1554a(z10, interfaceC2041a, interfaceC0500b5, j11, c10435i2, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 384;
        interfaceC0500b2 = interfaceC0500b;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                j11 = j10;
                if (composerImplMo1636j.m1596F(j11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    c10435i2 = c10435i;
                    if (composerImplMo1636j.mo1665y(c10435i2)) {
                    }
                    i12 |= i18;
                } else {
                    c10435i2 = c10435i;
                }
                i12 |= i18;
            } else {
                c10435i2 = c10435i;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (composerImplMo1636j.mo1665y(interfaceC2057q)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            float f112 = 0;
                            jM16786k = C8584v.m16786k(f112, f112);
                        } else {
                            jM16786k = j11;
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = new C10435i(true, 62);
                        } else {
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = c10435i2;
                            i16 = i12;
                        }
                    } else {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            float f113 = 0;
                            jM16786k = C8584v.m16786k(f113, f113);
                        } else {
                            jM16786k = j11;
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = new C10435i(true, 62);
                        } else {
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = c10435i2;
                            i16 = i12;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q10 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    c10586a = InterfaceC0476a.a.f3122a;
                    if (objM1619a0 == c10586a) {
                        objM1619a0 = new C8934v(Boolean.FALSE);
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    c8934v = (C8934v) objM1619a0;
                    c8934v.f46859b.setValue(Boolean.valueOf(z10));
                    if (((Boolean) c8934v.f46858a.getValue()).booleanValue()) {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a1 = composerImplMo1636j.m1619a0();
                        if (objM1619a1 == c10586a) {
                            objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                            composerImplMo1636j.m1597F0(objM1619a1);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                        InterfaceC10015c interfaceC10015c16 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                        composerImplMo1636j.mo1622c(1157296644);
                        zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                        objM1619a2 = composerImplMo1636j.m1619a0();
                        if (zMo1665y) {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f114 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i1114 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i1114) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i1114, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        } else {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f114 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i1114 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i1114) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i1114, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        }
                        composerImplMo1636j.m1609Q(false);
                        C1650f c1650f16 = new C1650f(j12, interfaceC10015c16, (InterfaceC2056p) objM1619a2);
                        final InterfaceC0500b interfaceC0500b111 = interfaceC0500b4;
                        final int i1114 = i16;
                        AndroidPopup_androidKt.m2619a(c1650f16, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11 = ComposerKt.f3003a;
                                    C8934v<Boolean> c8934v2 = c8934v;
                                    InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                    InterfaceC0500b interfaceC0500b112 = interfaceC0500b111;
                                    InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q12 = interfaceC2057q;
                                    int i20 = i1114;
                                    MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b112, interfaceC2057q12, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                                }
                                return C9072e.f47360a;
                            }
                        }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                    } else {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a1 = composerImplMo1636j.m1619a0();
                        if (objM1619a1 == c10586a) {
                            objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                            composerImplMo1636j.m1597F0(objM1619a1);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                        InterfaceC10015c interfaceC10015c17 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                        composerImplMo1636j.mo1622c(1157296644);
                        zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                        objM1619a2 = composerImplMo1636j.m1619a0();
                        if (zMo1665y) {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f114 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i1115 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i1115) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i1115, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        } else {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f114 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i1115 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i1115) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i1115, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        }
                        composerImplMo1636j.m1609Q(false);
                        C1650f c1650f17 = new C1650f(j12, interfaceC10015c17, (InterfaceC2056p) objM1619a2);
                        final InterfaceC0500b interfaceC0500b112 = interfaceC0500b4;
                        final int i1115 = i16;
                        AndroidPopup_androidKt.m2619a(c1650f17, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11 = ComposerKt.f3003a;
                                    C8934v<Boolean> c8934v2 = c8934v;
                                    InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                    InterfaceC0500b interfaceC0500b113 = interfaceC0500b112;
                                    InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q12 = interfaceC2057q;
                                    int i20 = i1115;
                                    MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b113, interfaceC2057q12, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                                }
                                return C9072e.f47360a;
                            }
                        }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                    }
                    interfaceC0500b5 = interfaceC0500b4;
                    j11 = j12;
                    c10435i2 = c10435i3;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            float f114 = 0;
                            jM16786k = C8584v.m16786k(f114, f114);
                        } else {
                            jM16786k = j11;
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = new C10435i(true, 62);
                        } else {
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = c10435i2;
                            i16 = i12;
                        }
                    } else {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if (i13 != 0) {
                            float f115 = 0;
                            jM16786k = C8584v.m16786k(f115, f115);
                        } else {
                            jM16786k = j11;
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = new C10435i(true, 62);
                        } else {
                            interfaceC0500b4 = interfaceC0500b3;
                            j12 = jM16786k;
                            c10435i3 = c10435i2;
                            i16 = i12;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    c10586a = InterfaceC0476a.a.f3122a;
                    if (objM1619a0 == c10586a) {
                        objM1619a0 = new C8934v(Boolean.FALSE);
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    c8934v = (C8934v) objM1619a0;
                    c8934v.f46859b.setValue(Boolean.valueOf(z10));
                    if (((Boolean) c8934v.f46858a.getValue()).booleanValue()) {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a1 = composerImplMo1636j.m1619a0();
                        if (objM1619a1 == c10586a) {
                            objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                            composerImplMo1636j.m1597F0(objM1619a1);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                        InterfaceC10015c interfaceC10015c18 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                        composerImplMo1636j.mo1622c(1157296644);
                        zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                        objM1619a2 = composerImplMo1636j.m1619a0();
                        if (zMo1665y) {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f116 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i1116 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i1116) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i1116, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        } else {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f116 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i1116 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i1116) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i1116, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        }
                        composerImplMo1636j.m1609Q(false);
                        C1650f c1650f18 = new C1650f(j12, interfaceC10015c18, (InterfaceC2056p) objM1619a2);
                        final InterfaceC0500b interfaceC0500b113 = interfaceC0500b4;
                        final int i1116 = i16;
                        AndroidPopup_androidKt.m2619a(c1650f18, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q12 = ComposerKt.f3003a;
                                    C8934v<Boolean> c8934v2 = c8934v;
                                    InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                    InterfaceC0500b interfaceC0500b114 = interfaceC0500b113;
                                    InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q13 = interfaceC2057q;
                                    int i20 = i1116;
                                    MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b114, interfaceC2057q13, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                                }
                                return C9072e.f47360a;
                            }
                        }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                    } else {
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a1 = composerImplMo1636j.m1619a0();
                        if (objM1619a1 == c10586a) {
                            objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                            composerImplMo1636j.m1597F0(objM1619a1);
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                        InterfaceC10015c interfaceC10015c19 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                        composerImplMo1636j.mo1622c(1157296644);
                        zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                        objM1619a2 = composerImplMo1636j.m1619a0();
                        if (zMo1665y) {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f116 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i1117 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i1117) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i1117, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        } else {
                            objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                    float fMin;
                                    C10021i c10021i3 = c10021i;
                                    C10021i c10021i4 = c10021i2;
                                    C5207g.m11111f(c10021i3, "parentBounds");
                                    C5207g.m11111f(c10021i4, "menuBounds");
                                    float f116 = MenuKt.f2763a;
                                    float fMin2 = 1.0f;
                                    int i1117 = c10021i3.f50978c;
                                    int i20 = c10021i4.f50976a;
                                    if (i20 < i1117) {
                                        int i21 = c10021i4.f50978c;
                                        int i22 = c10021i3.f50976a;
                                        if (i21 <= i22) {
                                            fMin = 1.0f;
                                        } else {
                                            int i23 = i21 - i20;
                                            if (i23 == 0) {
                                                fMin = 0.0f;
                                            } else {
                                                fMin = (((Math.min(i1117, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                            }
                                        }
                                    } else {
                                        fMin = 0.0f;
                                    }
                                    int i24 = c10021i3.f50979d;
                                    int i25 = c10021i4.f50977b;
                                    if (i25 < i24) {
                                        int i26 = c10021i4.f50979d;
                                        int i27 = c10021i3.f50977b;
                                        if (i26 > i27) {
                                            int i28 = i26 - i25;
                                            if (i28 == 0) {
                                                fMin2 = 0.0f;
                                            } else {
                                                fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                            }
                                        }
                                    } else {
                                        fMin2 = 0.0f;
                                    }
                                    interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                    return C9072e.f47360a;
                                }
                            };
                            composerImplMo1636j.m1597F0(objM1619a2);
                        }
                        composerImplMo1636j.m1609Q(false);
                        C1650f c1650f19 = new C1650f(j12, interfaceC10015c19, (InterfaceC2056p) objM1619a2);
                        final InterfaceC0500b interfaceC0500b114 = interfaceC0500b4;
                        final int i1117 = i16;
                        AndroidPopup_androidKt.m2619a(c1650f19, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q12 = ComposerKt.f3003a;
                                    C8934v<Boolean> c8934v2 = c8934v;
                                    InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                    InterfaceC0500b interfaceC0500b115 = interfaceC0500b114;
                                    InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q13 = interfaceC2057q;
                                    int i20 = i1117;
                                    MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b115, interfaceC2057q13, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                                }
                                return C9072e.f47360a;
                            }
                        }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                    }
                    interfaceC0500b5 = interfaceC0500b4;
                    j11 = j12;
                    c10435i2 = c10435i3;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        AndroidMenu_androidKt.m1554a(z10, interfaceC2041a, interfaceC0500b5, j11, c10435i2, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i15 = 196608;
            i12 |= i15;
            if ((374491 & i12) == 74898) {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        float f116 = 0;
                        jM16786k = C8584v.m16786k(f116, f116);
                    } else {
                        jM16786k = j11;
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = new C10435i(true, 62);
                    } else {
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = c10435i2;
                        i16 = i12;
                    }
                } else {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        float f117 = 0;
                        jM16786k = C8584v.m16786k(f117, f117);
                    } else {
                        jM16786k = j11;
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = new C10435i(true, 62);
                    } else {
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = c10435i2;
                        i16 = i12;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q12 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                c10586a = InterfaceC0476a.a.f3122a;
                if (objM1619a0 == c10586a) {
                    objM1619a0 = new C8934v(Boolean.FALSE);
                    composerImplMo1636j.m1597F0(objM1619a0);
                }
                composerImplMo1636j.m1609Q(false);
                c8934v = (C8934v) objM1619a0;
                c8934v.f46859b.setValue(Boolean.valueOf(z10));
                if (((Boolean) c8934v.f46858a.getValue()).booleanValue()) {
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                    InterfaceC10015c interfaceC10015c110 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f118 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i1118 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i1118) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i1118, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f118 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i1118 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i1118) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i1118, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    C1650f c1650f110 = new C1650f(j12, interfaceC10015c110, (InterfaceC2056p) objM1619a2);
                    final InterfaceC0500b interfaceC0500b115 = interfaceC0500b4;
                    final int i1118 = i16;
                    AndroidPopup_androidKt.m2619a(c1650f110, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q13 = ComposerKt.f3003a;
                                C8934v<Boolean> c8934v2 = c8934v;
                                InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                InterfaceC0500b interfaceC0500b116 = interfaceC0500b115;
                                InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q14 = interfaceC2057q;
                                int i20 = i1118;
                                MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b116, interfaceC2057q14, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                } else {
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                    InterfaceC10015c interfaceC10015c111 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f118 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i1119 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i1119) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i1119, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f118 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i1119 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i1119) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i1119, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    C1650f c1650f111 = new C1650f(j12, interfaceC10015c111, (InterfaceC2056p) objM1619a2);
                    final InterfaceC0500b interfaceC0500b116 = interfaceC0500b4;
                    final int i1119 = i16;
                    AndroidPopup_androidKt.m2619a(c1650f111, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q13 = ComposerKt.f3003a;
                                C8934v<Boolean> c8934v2 = c8934v;
                                InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                InterfaceC0500b interfaceC0500b117 = interfaceC0500b116;
                                InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q14 = interfaceC2057q;
                                int i20 = i1119;
                                MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b117, interfaceC2057q14, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                }
                interfaceC0500b5 = interfaceC0500b4;
                j11 = j12;
                c10435i2 = c10435i3;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        float f118 = 0;
                        jM16786k = C8584v.m16786k(f118, f118);
                    } else {
                        jM16786k = j11;
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = new C10435i(true, 62);
                    } else {
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = c10435i2;
                        i16 = i12;
                    }
                } else {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        float f119 = 0;
                        jM16786k = C8584v.m16786k(f119, f119);
                    } else {
                        jM16786k = j11;
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = new C10435i(true, 62);
                    } else {
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = c10435i2;
                        i16 = i12;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q13 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                c10586a = InterfaceC0476a.a.f3122a;
                if (objM1619a0 == c10586a) {
                    objM1619a0 = new C8934v(Boolean.FALSE);
                    composerImplMo1636j.m1597F0(objM1619a0);
                }
                composerImplMo1636j.m1609Q(false);
                c8934v = (C8934v) objM1619a0;
                c8934v.f46859b.setValue(Boolean.valueOf(z10));
                if (((Boolean) c8934v.f46858a.getValue()).booleanValue()) {
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                    InterfaceC10015c interfaceC10015c112 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f1110 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i11110 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i11110) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i11110, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f1110 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i11110 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i11110) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i11110, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    C1650f c1650f112 = new C1650f(j12, interfaceC10015c112, (InterfaceC2056p) objM1619a2);
                    final InterfaceC0500b interfaceC0500b117 = interfaceC0500b4;
                    final int i11110 = i16;
                    AndroidPopup_androidKt.m2619a(c1650f112, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q14 = ComposerKt.f3003a;
                                C8934v<Boolean> c8934v2 = c8934v;
                                InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                InterfaceC0500b interfaceC0500b118 = interfaceC0500b117;
                                InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q15 = interfaceC2057q;
                                int i20 = i11110;
                                MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b118, interfaceC2057q15, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                } else {
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                    InterfaceC10015c interfaceC10015c113 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f1110 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i11111 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i11111) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i11111, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f1110 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i11111 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i11111) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i11111, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    C1650f c1650f113 = new C1650f(j12, interfaceC10015c113, (InterfaceC2056p) objM1619a2);
                    final InterfaceC0500b interfaceC0500b118 = interfaceC0500b4;
                    final int i11111 = i16;
                    AndroidPopup_androidKt.m2619a(c1650f113, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q14 = ComposerKt.f3003a;
                                C8934v<Boolean> c8934v2 = c8934v;
                                InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                InterfaceC0500b interfaceC0500b119 = interfaceC0500b118;
                                InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q15 = interfaceC2057q;
                                int i20 = i11111;
                                MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b119, interfaceC2057q15, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                }
                interfaceC0500b5 = interfaceC0500b4;
                j11 = j12;
                c10435i2 = c10435i3;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    AndroidMenu_androidKt.m1554a(z10, interfaceC2041a, interfaceC0500b5, j11, c10435i2, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 3072;
        j11 = j10;
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                c10435i2 = c10435i;
                if (composerImplMo1636j.mo1665y(c10435i2)) {
                }
                i12 |= i18;
            } else {
                c10435i2 = c10435i;
            }
            i12 |= i18;
        } else {
            c10435i2 = c10435i;
        }
        if ((i11 & 32) != 0) {
            if ((458752 & i10) == 0) {
                if (composerImplMo1636j.mo1665y(interfaceC2057q)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
            }
            if ((374491 & i12) == 74898) {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        float f1110 = 0;
                        jM16786k = C8584v.m16786k(f1110, f1110);
                    } else {
                        jM16786k = j11;
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = new C10435i(true, 62);
                    } else {
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = c10435i2;
                        i16 = i12;
                    }
                } else {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        float f1111 = 0;
                        jM16786k = C8584v.m16786k(f1111, f1111);
                    } else {
                        jM16786k = j11;
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = new C10435i(true, 62);
                    } else {
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = c10435i2;
                        i16 = i12;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q14 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                c10586a = InterfaceC0476a.a.f3122a;
                if (objM1619a0 == c10586a) {
                    objM1619a0 = new C8934v(Boolean.FALSE);
                    composerImplMo1636j.m1597F0(objM1619a0);
                }
                composerImplMo1636j.m1609Q(false);
                c8934v = (C8934v) objM1619a0;
                c8934v.f46859b.setValue(Boolean.valueOf(z10));
                if (((Boolean) c8934v.f46858a.getValue()).booleanValue()) {
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                    InterfaceC10015c interfaceC10015c114 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f1112 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i11112 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i11112) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i11112, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f1112 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i11112 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i11112) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i11112, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    C1650f c1650f114 = new C1650f(j12, interfaceC10015c114, (InterfaceC2056p) objM1619a2);
                    final InterfaceC0500b interfaceC0500b119 = interfaceC0500b4;
                    final int i11112 = i16;
                    AndroidPopup_androidKt.m2619a(c1650f114, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q15 = ComposerKt.f3003a;
                                C8934v<Boolean> c8934v2 = c8934v;
                                InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                InterfaceC0500b interfaceC0500b1110 = interfaceC0500b119;
                                InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q16 = interfaceC2057q;
                                int i20 = i11112;
                                MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b1110, interfaceC2057q16, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                } else {
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                    InterfaceC10015c interfaceC10015c115 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f1112 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i11113 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i11113) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i11113, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f1112 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i11113 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i11113) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i11113, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    C1650f c1650f115 = new C1650f(j12, interfaceC10015c115, (InterfaceC2056p) objM1619a2);
                    final InterfaceC0500b interfaceC0500b1110 = interfaceC0500b4;
                    final int i11113 = i16;
                    AndroidPopup_androidKt.m2619a(c1650f115, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q15 = ComposerKt.f3003a;
                                C8934v<Boolean> c8934v2 = c8934v;
                                InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                InterfaceC0500b interfaceC0500b1111 = interfaceC0500b1110;
                                InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q16 = interfaceC2057q;
                                int i20 = i11113;
                                MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b1111, interfaceC2057q16, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                }
                interfaceC0500b5 = interfaceC0500b4;
                j11 = j12;
                c10435i2 = c10435i3;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        float f1112 = 0;
                        jM16786k = C8584v.m16786k(f1112, f1112);
                    } else {
                        jM16786k = j11;
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = new C10435i(true, 62);
                    } else {
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = c10435i2;
                        i16 = i12;
                    }
                } else {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if (i13 != 0) {
                        float f1113 = 0;
                        jM16786k = C8584v.m16786k(f1113, f1113);
                    } else {
                        jM16786k = j11;
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = new C10435i(true, 62);
                    } else {
                        interfaceC0500b4 = interfaceC0500b3;
                        j12 = jM16786k;
                        c10435i3 = c10435i2;
                        i16 = i12;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q15 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                c10586a = InterfaceC0476a.a.f3122a;
                if (objM1619a0 == c10586a) {
                    objM1619a0 = new C8934v(Boolean.FALSE);
                    composerImplMo1636j.m1597F0(objM1619a0);
                }
                composerImplMo1636j.m1609Q(false);
                c8934v = (C8934v) objM1619a0;
                c8934v.f46859b.setValue(Boolean.valueOf(z10));
                if (((Boolean) c8934v.f46858a.getValue()).booleanValue()) {
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                    InterfaceC10015c interfaceC10015c116 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f1114 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i11114 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i11114) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i11114, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f1114 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i11114 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i11114) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i11114, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    C1650f c1650f116 = new C1650f(j12, interfaceC10015c116, (InterfaceC2056p) objM1619a2);
                    final InterfaceC0500b interfaceC0500b1111 = interfaceC0500b4;
                    final int i11114 = i16;
                    AndroidPopup_androidKt.m2619a(c1650f116, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q16 = ComposerKt.f3003a;
                                C8934v<Boolean> c8934v2 = c8934v;
                                InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                InterfaceC0500b interfaceC0500b1112 = interfaceC0500b1111;
                                InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q17 = interfaceC2057q;
                                int i20 = i11114;
                                MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b1112, interfaceC2057q17, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                } else {
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a1 = composerImplMo1636j.m1619a0();
                    if (objM1619a1 == c10586a) {
                        objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                        composerImplMo1636j.m1597F0(objM1619a1);
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                    InterfaceC10015c interfaceC10015c117 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                    objM1619a2 = composerImplMo1636j.m1619a0();
                    if (zMo1665y) {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f1114 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i11115 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i11115) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i11115, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    } else {
                        objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                            /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                                float fMin;
                                C10021i c10021i3 = c10021i;
                                C10021i c10021i4 = c10021i2;
                                C5207g.m11111f(c10021i3, "parentBounds");
                                C5207g.m11111f(c10021i4, "menuBounds");
                                float f1114 = MenuKt.f2763a;
                                float fMin2 = 1.0f;
                                int i11115 = c10021i3.f50978c;
                                int i20 = c10021i4.f50976a;
                                if (i20 < i11115) {
                                    int i21 = c10021i4.f50978c;
                                    int i22 = c10021i3.f50976a;
                                    if (i21 <= i22) {
                                        fMin = 1.0f;
                                    } else {
                                        int i23 = i21 - i20;
                                        if (i23 == 0) {
                                            fMin = 0.0f;
                                        } else {
                                            fMin = (((Math.min(i11115, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                        }
                                    }
                                } else {
                                    fMin = 0.0f;
                                }
                                int i24 = c10021i3.f50979d;
                                int i25 = c10021i4.f50977b;
                                if (i25 < i24) {
                                    int i26 = c10021i4.f50979d;
                                    int i27 = c10021i3.f50977b;
                                    if (i26 > i27) {
                                        int i28 = i26 - i25;
                                        if (i28 == 0) {
                                            fMin2 = 0.0f;
                                        } else {
                                            fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                        }
                                    }
                                } else {
                                    fMin2 = 0.0f;
                                }
                                interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                                return C9072e.f47360a;
                            }
                        };
                        composerImplMo1636j.m1597F0(objM1619a2);
                    }
                    composerImplMo1636j.m1609Q(false);
                    C1650f c1650f117 = new C1650f(j12, interfaceC10015c117, (InterfaceC2056p) objM1619a2);
                    final InterfaceC0500b interfaceC0500b1112 = interfaceC0500b4;
                    final int i11115 = i16;
                    AndroidPopup_androidKt.m2619a(c1650f117, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q16 = ComposerKt.f3003a;
                                C8934v<Boolean> c8934v2 = c8934v;
                                InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                                InterfaceC0500b interfaceC0500b1113 = interfaceC0500b1112;
                                InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q17 = interfaceC2057q;
                                int i20 = i11115;
                                MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b1113, interfaceC2057q17, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                            }
                            return C9072e.f47360a;
                        }
                    }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
                }
                interfaceC0500b5 = interfaceC0500b4;
                j11 = j12;
                c10435i2 = c10435i3;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    AndroidMenu_androidKt.m1554a(z10, interfaceC2041a, interfaceC0500b5, j11, c10435i2, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                    return C9072e.f47360a;
                }
            };
        }
        i15 = 196608;
        i12 |= i15;
        if ((374491 & i12) == 74898) {
            composerImplMo1636j.m1654s0();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b3 = interfaceC0500b2;
                }
                if (i13 != 0) {
                    float f1114 = 0;
                    jM16786k = C8584v.m16786k(f1114, f1114);
                } else {
                    jM16786k = j11;
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    interfaceC0500b4 = interfaceC0500b3;
                    j12 = jM16786k;
                    c10435i3 = new C10435i(true, 62);
                } else {
                    interfaceC0500b4 = interfaceC0500b3;
                    j12 = jM16786k;
                    c10435i3 = c10435i2;
                    i16 = i12;
                }
            } else {
                if (i17 != 0) {
                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b3 = interfaceC0500b2;
                }
                if (i13 != 0) {
                    float f1115 = 0;
                    jM16786k = C8584v.m16786k(f1115, f1115);
                } else {
                    jM16786k = j11;
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    interfaceC0500b4 = interfaceC0500b3;
                    j12 = jM16786k;
                    c10435i3 = new C10435i(true, 62);
                } else {
                    interfaceC0500b4 = interfaceC0500b3;
                    j12 = jM16786k;
                    c10435i3 = c10435i2;
                    i16 = i12;
                }
            }
            composerImplMo1636j.m1610R();
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q16 = ComposerKt.f3003a;
            composerImplMo1636j.mo1622c(-492369756);
            objM1619a0 = composerImplMo1636j.m1619a0();
            c10586a = InterfaceC0476a.a.f3122a;
            if (objM1619a0 == c10586a) {
                objM1619a0 = new C8934v(Boolean.FALSE);
                composerImplMo1636j.m1597F0(objM1619a0);
            }
            composerImplMo1636j.m1609Q(false);
            c8934v = (C8934v) objM1619a0;
            c8934v.f46859b.setValue(Boolean.valueOf(z10));
            if (((Boolean) c8934v.f46858a.getValue()).booleanValue()) {
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a1 = composerImplMo1636j.m1619a0();
                if (objM1619a1 == c10586a) {
                    objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                    composerImplMo1636j.m1597F0(objM1619a1);
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                InterfaceC10015c interfaceC10015c118 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                composerImplMo1636j.mo1622c(1157296644);
                zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                objM1619a2 = composerImplMo1636j.m1619a0();
                if (zMo1665y) {
                    objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                        /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                            float fMin;
                            C10021i c10021i3 = c10021i;
                            C10021i c10021i4 = c10021i2;
                            C5207g.m11111f(c10021i3, "parentBounds");
                            C5207g.m11111f(c10021i4, "menuBounds");
                            float f1116 = MenuKt.f2763a;
                            float fMin2 = 1.0f;
                            int i11116 = c10021i3.f50978c;
                            int i20 = c10021i4.f50976a;
                            if (i20 < i11116) {
                                int i21 = c10021i4.f50978c;
                                int i22 = c10021i3.f50976a;
                                if (i21 <= i22) {
                                    fMin = 1.0f;
                                } else {
                                    int i23 = i21 - i20;
                                    if (i23 == 0) {
                                        fMin = 0.0f;
                                    } else {
                                        fMin = (((Math.min(i11116, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                    }
                                }
                            } else {
                                fMin = 0.0f;
                            }
                            int i24 = c10021i3.f50979d;
                            int i25 = c10021i4.f50977b;
                            if (i25 < i24) {
                                int i26 = c10021i4.f50979d;
                                int i27 = c10021i3.f50977b;
                                if (i26 > i27) {
                                    int i28 = i26 - i25;
                                    if (i28 == 0) {
                                        fMin2 = 0.0f;
                                    } else {
                                        fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                    }
                                }
                            } else {
                                fMin2 = 0.0f;
                            }
                            interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                } else {
                    objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                        /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                            float fMin;
                            C10021i c10021i3 = c10021i;
                            C10021i c10021i4 = c10021i2;
                            C5207g.m11111f(c10021i3, "parentBounds");
                            C5207g.m11111f(c10021i4, "menuBounds");
                            float f1116 = MenuKt.f2763a;
                            float fMin2 = 1.0f;
                            int i11116 = c10021i3.f50978c;
                            int i20 = c10021i4.f50976a;
                            if (i20 < i11116) {
                                int i21 = c10021i4.f50978c;
                                int i22 = c10021i3.f50976a;
                                if (i21 <= i22) {
                                    fMin = 1.0f;
                                } else {
                                    int i23 = i21 - i20;
                                    if (i23 == 0) {
                                        fMin = 0.0f;
                                    } else {
                                        fMin = (((Math.min(i11116, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                    }
                                }
                            } else {
                                fMin = 0.0f;
                            }
                            int i24 = c10021i3.f50979d;
                            int i25 = c10021i4.f50977b;
                            if (i25 < i24) {
                                int i26 = c10021i4.f50979d;
                                int i27 = c10021i3.f50977b;
                                if (i26 > i27) {
                                    int i28 = i26 - i25;
                                    if (i28 == 0) {
                                        fMin2 = 0.0f;
                                    } else {
                                        fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                    }
                                }
                            } else {
                                fMin2 = 0.0f;
                            }
                            interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                }
                composerImplMo1636j.m1609Q(false);
                C1650f c1650f118 = new C1650f(j12, interfaceC10015c118, (InterfaceC2056p) objM1619a2);
                final InterfaceC0500b interfaceC0500b1113 = interfaceC0500b4;
                final int i11116 = i16;
                AndroidPopup_androidKt.m2619a(c1650f118, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q17 = ComposerKt.f3003a;
                            C8934v<Boolean> c8934v2 = c8934v;
                            InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                            InterfaceC0500b interfaceC0500b1114 = interfaceC0500b1113;
                            InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q18 = interfaceC2057q;
                            int i20 = i11116;
                            MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b1114, interfaceC2057q18, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                        }
                        return C9072e.f47360a;
                    }
                }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
            } else {
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a1 = composerImplMo1636j.m1619a0();
                if (objM1619a1 == c10586a) {
                    objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                    composerImplMo1636j.m1597F0(objM1619a1);
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                InterfaceC10015c interfaceC10015c119 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                composerImplMo1636j.mo1622c(1157296644);
                zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                objM1619a2 = composerImplMo1636j.m1619a0();
                if (zMo1665y) {
                    objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                        /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                            float fMin;
                            C10021i c10021i3 = c10021i;
                            C10021i c10021i4 = c10021i2;
                            C5207g.m11111f(c10021i3, "parentBounds");
                            C5207g.m11111f(c10021i4, "menuBounds");
                            float f1116 = MenuKt.f2763a;
                            float fMin2 = 1.0f;
                            int i11117 = c10021i3.f50978c;
                            int i20 = c10021i4.f50976a;
                            if (i20 < i11117) {
                                int i21 = c10021i4.f50978c;
                                int i22 = c10021i3.f50976a;
                                if (i21 <= i22) {
                                    fMin = 1.0f;
                                } else {
                                    int i23 = i21 - i20;
                                    if (i23 == 0) {
                                        fMin = 0.0f;
                                    } else {
                                        fMin = (((Math.min(i11117, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                    }
                                }
                            } else {
                                fMin = 0.0f;
                            }
                            int i24 = c10021i3.f50979d;
                            int i25 = c10021i4.f50977b;
                            if (i25 < i24) {
                                int i26 = c10021i4.f50979d;
                                int i27 = c10021i3.f50977b;
                                if (i26 > i27) {
                                    int i28 = i26 - i25;
                                    if (i28 == 0) {
                                        fMin2 = 0.0f;
                                    } else {
                                        fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                    }
                                }
                            } else {
                                fMin2 = 0.0f;
                            }
                            interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                } else {
                    objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                        /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                            float fMin;
                            C10021i c10021i3 = c10021i;
                            C10021i c10021i4 = c10021i2;
                            C5207g.m11111f(c10021i3, "parentBounds");
                            C5207g.m11111f(c10021i4, "menuBounds");
                            float f1116 = MenuKt.f2763a;
                            float fMin2 = 1.0f;
                            int i11117 = c10021i3.f50978c;
                            int i20 = c10021i4.f50976a;
                            if (i20 < i11117) {
                                int i21 = c10021i4.f50978c;
                                int i22 = c10021i3.f50976a;
                                if (i21 <= i22) {
                                    fMin = 1.0f;
                                } else {
                                    int i23 = i21 - i20;
                                    if (i23 == 0) {
                                        fMin = 0.0f;
                                    } else {
                                        fMin = (((Math.min(i11117, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                    }
                                }
                            } else {
                                fMin = 0.0f;
                            }
                            int i24 = c10021i3.f50979d;
                            int i25 = c10021i4.f50977b;
                            if (i25 < i24) {
                                int i26 = c10021i4.f50979d;
                                int i27 = c10021i3.f50977b;
                                if (i26 > i27) {
                                    int i28 = i26 - i25;
                                    if (i28 == 0) {
                                        fMin2 = 0.0f;
                                    } else {
                                        fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                    }
                                }
                            } else {
                                fMin2 = 0.0f;
                            }
                            interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                }
                composerImplMo1636j.m1609Q(false);
                C1650f c1650f119 = new C1650f(j12, interfaceC10015c119, (InterfaceC2056p) objM1619a2);
                final InterfaceC0500b interfaceC0500b1114 = interfaceC0500b4;
                final int i11117 = i16;
                AndroidPopup_androidKt.m2619a(c1650f119, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q17 = ComposerKt.f3003a;
                            C8934v<Boolean> c8934v2 = c8934v;
                            InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                            InterfaceC0500b interfaceC0500b1115 = interfaceC0500b1114;
                            InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q18 = interfaceC2057q;
                            int i20 = i11117;
                            MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b1115, interfaceC2057q18, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                        }
                        return C9072e.f47360a;
                    }
                }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
            }
            interfaceC0500b5 = interfaceC0500b4;
            j11 = j12;
            c10435i2 = c10435i3;
        } else {
            composerImplMo1636j.m1654s0();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b3 = interfaceC0500b2;
                }
                if (i13 != 0) {
                    float f1116 = 0;
                    jM16786k = C8584v.m16786k(f1116, f1116);
                } else {
                    jM16786k = j11;
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    interfaceC0500b4 = interfaceC0500b3;
                    j12 = jM16786k;
                    c10435i3 = new C10435i(true, 62);
                } else {
                    interfaceC0500b4 = interfaceC0500b3;
                    j12 = jM16786k;
                    c10435i3 = c10435i2;
                    i16 = i12;
                }
            } else {
                if (i17 != 0) {
                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b3 = interfaceC0500b2;
                }
                if (i13 != 0) {
                    float f1117 = 0;
                    jM16786k = C8584v.m16786k(f1117, f1117);
                } else {
                    jM16786k = j11;
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    interfaceC0500b4 = interfaceC0500b3;
                    j12 = jM16786k;
                    c10435i3 = new C10435i(true, 62);
                } else {
                    interfaceC0500b4 = interfaceC0500b3;
                    j12 = jM16786k;
                    c10435i3 = c10435i2;
                    i16 = i12;
                }
            }
            composerImplMo1636j.m1610R();
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q17 = ComposerKt.f3003a;
            composerImplMo1636j.mo1622c(-492369756);
            objM1619a0 = composerImplMo1636j.m1619a0();
            c10586a = InterfaceC0476a.a.f3122a;
            if (objM1619a0 == c10586a) {
                objM1619a0 = new C8934v(Boolean.FALSE);
                composerImplMo1636j.m1597F0(objM1619a0);
            }
            composerImplMo1636j.m1609Q(false);
            c8934v = (C8934v) objM1619a0;
            c8934v.f46859b.setValue(Boolean.valueOf(z10));
            if (((Boolean) c8934v.f46858a.getValue()).booleanValue()) {
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a1 = composerImplMo1636j.m1619a0();
                if (objM1619a1 == c10586a) {
                    objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                    composerImplMo1636j.m1597F0(objM1619a1);
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                InterfaceC10015c interfaceC10015c1110 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                composerImplMo1636j.mo1622c(1157296644);
                zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                objM1619a2 = composerImplMo1636j.m1619a0();
                if (zMo1665y) {
                    objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                        /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                            float fMin;
                            C10021i c10021i3 = c10021i;
                            C10021i c10021i4 = c10021i2;
                            C5207g.m11111f(c10021i3, "parentBounds");
                            C5207g.m11111f(c10021i4, "menuBounds");
                            float f1118 = MenuKt.f2763a;
                            float fMin2 = 1.0f;
                            int i11118 = c10021i3.f50978c;
                            int i20 = c10021i4.f50976a;
                            if (i20 < i11118) {
                                int i21 = c10021i4.f50978c;
                                int i22 = c10021i3.f50976a;
                                if (i21 <= i22) {
                                    fMin = 1.0f;
                                } else {
                                    int i23 = i21 - i20;
                                    if (i23 == 0) {
                                        fMin = 0.0f;
                                    } else {
                                        fMin = (((Math.min(i11118, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                    }
                                }
                            } else {
                                fMin = 0.0f;
                            }
                            int i24 = c10021i3.f50979d;
                            int i25 = c10021i4.f50977b;
                            if (i25 < i24) {
                                int i26 = c10021i4.f50979d;
                                int i27 = c10021i3.f50977b;
                                if (i26 > i27) {
                                    int i28 = i26 - i25;
                                    if (i28 == 0) {
                                        fMin2 = 0.0f;
                                    } else {
                                        fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                    }
                                }
                            } else {
                                fMin2 = 0.0f;
                            }
                            interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                } else {
                    objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                        /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                            float fMin;
                            C10021i c10021i3 = c10021i;
                            C10021i c10021i4 = c10021i2;
                            C5207g.m11111f(c10021i3, "parentBounds");
                            C5207g.m11111f(c10021i4, "menuBounds");
                            float f1118 = MenuKt.f2763a;
                            float fMin2 = 1.0f;
                            int i11118 = c10021i3.f50978c;
                            int i20 = c10021i4.f50976a;
                            if (i20 < i11118) {
                                int i21 = c10021i4.f50978c;
                                int i22 = c10021i3.f50976a;
                                if (i21 <= i22) {
                                    fMin = 1.0f;
                                } else {
                                    int i23 = i21 - i20;
                                    if (i23 == 0) {
                                        fMin = 0.0f;
                                    } else {
                                        fMin = (((Math.min(i11118, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                    }
                                }
                            } else {
                                fMin = 0.0f;
                            }
                            int i24 = c10021i3.f50979d;
                            int i25 = c10021i4.f50977b;
                            if (i25 < i24) {
                                int i26 = c10021i4.f50979d;
                                int i27 = c10021i3.f50977b;
                                if (i26 > i27) {
                                    int i28 = i26 - i25;
                                    if (i28 == 0) {
                                        fMin2 = 0.0f;
                                    } else {
                                        fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                    }
                                }
                            } else {
                                fMin2 = 0.0f;
                            }
                            interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                }
                composerImplMo1636j.m1609Q(false);
                C1650f c1650f1110 = new C1650f(j12, interfaceC10015c1110, (InterfaceC2056p) objM1619a2);
                final InterfaceC0500b interfaceC0500b1115 = interfaceC0500b4;
                final int i11118 = i16;
                AndroidPopup_androidKt.m2619a(c1650f1110, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q18 = ComposerKt.f3003a;
                            C8934v<Boolean> c8934v2 = c8934v;
                            InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                            InterfaceC0500b interfaceC0500b1116 = interfaceC0500b1115;
                            InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q19 = interfaceC2057q;
                            int i20 = i11118;
                            MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b1116, interfaceC2057q19, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                        }
                        return C9072e.f47360a;
                    }
                }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
            } else {
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a1 = composerImplMo1636j.m1619a0();
                if (objM1619a1 == c10586a) {
                    objM1619a1 = C8573r0.m16684L0(new C9162o0(C9162o0.f47689b));
                    composerImplMo1636j.m1597F0(objM1619a1);
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC5312g0 = (InterfaceC5312g0) objM1619a1;
                InterfaceC10015c interfaceC10015c1111 = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
                composerImplMo1636j.mo1622c(1157296644);
                zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
                objM1619a2 = composerImplMo1636j.m1619a0();
                if (zMo1665y) {
                    objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                        /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                            float fMin;
                            C10021i c10021i3 = c10021i;
                            C10021i c10021i4 = c10021i2;
                            C5207g.m11111f(c10021i3, "parentBounds");
                            C5207g.m11111f(c10021i4, "menuBounds");
                            float f1118 = MenuKt.f2763a;
                            float fMin2 = 1.0f;
                            int i11119 = c10021i3.f50978c;
                            int i20 = c10021i4.f50976a;
                            if (i20 < i11119) {
                                int i21 = c10021i4.f50978c;
                                int i22 = c10021i3.f50976a;
                                if (i21 <= i22) {
                                    fMin = 1.0f;
                                } else {
                                    int i23 = i21 - i20;
                                    if (i23 == 0) {
                                        fMin = 0.0f;
                                    } else {
                                        fMin = (((Math.min(i11119, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                    }
                                }
                            } else {
                                fMin = 0.0f;
                            }
                            int i24 = c10021i3.f50979d;
                            int i25 = c10021i4.f50977b;
                            if (i25 < i24) {
                                int i26 = c10021i4.f50979d;
                                int i27 = c10021i3.f50977b;
                                if (i26 > i27) {
                                    int i28 = i26 - i25;
                                    if (i28 == 0) {
                                        fMin2 = 0.0f;
                                    } else {
                                        fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                    }
                                }
                            } else {
                                fMin2 = 0.0f;
                            }
                            interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                } else {
                    objM1619a2 = new InterfaceC2056p<C10021i, C10021i, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                        /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10021i c10021i, C10021i c10021i2) {
                            float fMin;
                            C10021i c10021i3 = c10021i;
                            C10021i c10021i4 = c10021i2;
                            C5207g.m11111f(c10021i3, "parentBounds");
                            C5207g.m11111f(c10021i4, "menuBounds");
                            float f1118 = MenuKt.f2763a;
                            float fMin2 = 1.0f;
                            int i11119 = c10021i3.f50978c;
                            int i20 = c10021i4.f50976a;
                            if (i20 < i11119) {
                                int i21 = c10021i4.f50978c;
                                int i22 = c10021i3.f50976a;
                                if (i21 <= i22) {
                                    fMin = 1.0f;
                                } else {
                                    int i23 = i21 - i20;
                                    if (i23 == 0) {
                                        fMin = 0.0f;
                                    } else {
                                        fMin = (((Math.min(i11119, i21) + Math.max(i22, i20)) / 2) - i20) / i23;
                                    }
                                }
                            } else {
                                fMin = 0.0f;
                            }
                            int i24 = c10021i3.f50979d;
                            int i25 = c10021i4.f50977b;
                            if (i25 < i24) {
                                int i26 = c10021i4.f50979d;
                                int i27 = c10021i3.f50977b;
                                if (i26 > i27) {
                                    int i28 = i26 - i25;
                                    if (i28 == 0) {
                                        fMin2 = 0.0f;
                                    } else {
                                        fMin2 = (((Math.min(i24, i26) + Math.max(i27, i25)) / 2) - i25) / i28;
                                    }
                                }
                            } else {
                                fMin2 = 0.0f;
                            }
                            interfaceC5312g0.setValue(new C9162o0(C5212l.m11167m(fMin, fMin2)));
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a2);
                }
                composerImplMo1636j.m1609Q(false);
                C1650f c1650f1111 = new C1650f(j12, interfaceC10015c1111, (InterfaceC2056p) objM1619a2);
                final InterfaceC0500b interfaceC0500b1116 = interfaceC0500b4;
                final int i11119 = i16;
                AndroidPopup_androidKt.m2619a(c1650f1111, interfaceC2041a, c10435i3, C7204a.m14522b(composerImplMo1636j, -1192563503, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q18 = ComposerKt.f3003a;
                            C8934v<Boolean> c8934v2 = c8934v;
                            InterfaceC5312g0<C9162o0> interfaceC5312g1 = interfaceC5312g0;
                            InterfaceC0500b interfaceC0500b1117 = interfaceC0500b1116;
                            InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e> interfaceC2057q19 = interfaceC2057q;
                            int i20 = i11119;
                            MenuKt.m1567a(c8934v2, interfaceC5312g1, interfaceC0500b1117, interfaceC2057q19, interfaceC0476a3, (i20 & 896) | 48 | ((i20 >> 6) & 7168), 0);
                        }
                        return C9072e.f47360a;
                    }
                }), composerImplMo1636j, (i16 & 112) | 3072 | ((i16 >> 6) & 896), 0);
            }
            interfaceC0500b5 = interfaceC0500b4;
            j11 = j12;
            c10435i2 = c10435i3;
        }
        c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                AndroidMenu_androidKt.m1554a(z10, interfaceC2041a, interfaceC0500b5, j11, c10435i2, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                return C9072e.f47360a;
            }
        };
    }
}
