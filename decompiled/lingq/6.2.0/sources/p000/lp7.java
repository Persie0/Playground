package p000;

import androidx.compose.animation.core.AbstractC0060b;
import androidx.compose.material3.pulltorefresh.C0258a;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class lp7 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f49980a = 0;

    static {
        List list = lh5.f49666a;
    }

    /* JADX INFO: renamed from: a */
    public static final void m16423a(k73 k73Var, long j, ye1 ye1Var, int i) {
        Object obj;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1353562852);
        int i2 = (tj3Var.m22120g(k73Var) ? 4 : 2) | i | (tj3Var.m22118f(j) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                obj = objM22097O;
                C3500qj c3500qjM22757a = AbstractC3650uj.m22757a();
                c3500qjM22757a.m19993j(1);
                tj3Var.m22131l0(c3500qjM22757a);
                obj = c3500qjM22757a;
            }
            obj = objM22097O;
            C3500qj c3500qj = (C3500qj) obj;
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1254d(new y47(k73Var, 2));
                tj3Var.m22131l0(objM22097O2);
            }
            dh9 dh9VarM750b = AbstractC0060b.m750b(((Number) ((dh9) objM22097O2).getValue()).floatValue(), ss5.m21705c0(MotionSchemeKeyTokens.DefaultEffects, tj3Var), null, null, tj3Var, 0, 28);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objM22097O3 = tj3Var.m22097O();
            if (z || objM22097O3 == p84Var) {
                objM22097O3 = new kv4(k73Var, 17);
                tj3Var.m22131l0(objM22097O3);
            }
            e16 e16VarM4422o = c99.m4422o(nv8.m17642b(b16.f7762a, (vi3) objM22097O3), 16.0f);
            boolean zM22120g = tj3Var.m22120g(dh9VarM750b) | (i3 == 4) | ((i2 & 112) == 32) | tj3Var.m22124i(c3500qj);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22120g || objM22097O4 == p84Var) {
                sf0 sf0Var = new sf0(k73Var, dh9VarM750b, j, c3500qj, 2);
                tj3Var.m22131l0(sf0Var);
                objM22097O4 = sf0Var;
            }
            eh0.m11124d(e16VarM4422o, (vi3) objM22097O4, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3498qh(k73Var, j, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:45:0x008e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00af  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:62:0x010b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0140  */
    /* JADX WARN: Code duplicated, block: B:68:0x0154  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m16424b(final boolean z, final ui3 ui3Var, e16 e16Var, mp7 mp7Var, InterfaceC3571se interfaceC3571se, aj3 aj3Var, boolean z2, float f, final C0282a c0282a, ye1 ye1Var, final int i, final int i2) {
        e16 e16Var2;
        final mp7 mp7VarM16426d;
        int i3;
        int i4;
        InterfaceC3571se interfaceC3571se2;
        int i5;
        int i6;
        boolean z3;
        final float f2;
        final e16 e16Var3;
        final mp7 mp7Var2;
        final aj3 aj3Var2;
        final boolean z4;
        final InterfaceC3571se interfaceC3571se3;
        x18 x18VarM22143u;
        aj3 aj3VarM4703P;
        float f3;
        boolean z5;
        ui3 ui3Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(492221845);
        int i7 = (tj3Var.m22122h(z) ? 4 : 2) | i | (tj3Var.m22124i(ui3Var) ? 32 : 16);
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                e16Var2 = e16Var;
                i7 |= tj3Var.m22120g(e16Var2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                mp7VarM16426d = mp7Var;
                int i9 = tj3Var.m22120g(mp7VarM16426d) ? 2048 : 1024;
                i3 = i7 | i9;
                i4 = i2 & 16;
                if (i4 != 0) {
                    if ((i & 24576) == 0) {
                        interfaceC3571se2 = interfaceC3571se;
                        if (tj3Var.m22120g(interfaceC3571se2)) {
                            i5 = 16384;
                        } else {
                            i5 = 8192;
                        }
                        i3 |= i5;
                    }
                    i6 = i3 | 14352384;
                    if ((38347923 & i6) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (tj3Var.m22099R(i6 & 1, z3)) {
                        tj3Var.m22104W();
                        if ((i & 1) != 0 || tj3Var.m22084B()) {
                            if (i8 != 0) {
                                e16Var2 = b16.f7762a;
                            }
                            if ((i2 & 8) != 0) {
                                mp7VarM16426d = m16426d(tj3Var);
                            }
                            if (i4 != 0) {
                                interfaceC3571se2 = nj0.f52808c;
                            }
                            aj3VarM4703P = ci8.m4703P(419143791, new aj3() { // from class: jp7
                                @Override // p000.aj3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    bi0 bi0Var = (bi0) obj;
                                    ye1 ye1Var2 = (ye1) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= ((tj3) ye1Var2).m22120g(bi0Var) ? 4 : 2;
                                    }
                                    tj3 tj3Var2 = (tj3) ye1Var2;
                                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        ip7.f44401a.m14066a(mp7VarM16426d, z, bi0Var.mo3727a(b16.f7762a, nj0.f52809d), 0L, 0L, 0.0f, tj3Var2, 1572864);
                                    } else {
                                        tj3Var2.m22102U();
                                    }
                                    return xfa.f68157a;
                                }
                            }, tj3Var);
                            f3 = ip7.f44403c;
                            z5 = true;
                        } else {
                            tj3Var.m22102U();
                            aj3VarM4703P = aj3Var;
                            z5 = z2;
                            f3 = f;
                        }
                        tj3Var.m22140r();
                        boolean z6 = z5;
                        float f4 = f3;
                        e16 e16VarMo3161g = e16Var2.mo3161g(new C0258a(z, ui3Var, z6, mp7VarM16426d, f4));
                        ht5 ht5VarM19966d = qh0.m19966d(interfaceC3571se2, false);
                        int iHashCode = Long.hashCode(tj3Var.f62385T);
                        l77 l77VarM22132m = tj3Var.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarMo3161g);
                        se1.f60731q.getClass();
                        ui3Var2 = C0352b.f4299b;
                        tj3Var.m22119f0();
                        if (tj3Var.f62384S) {
                            tj3Var.m22130l(ui3Var2);
                        } else {
                            tj3Var.m22137o0();
                        }
                        oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
                        oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                        oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                        oha.m18000f(tj3Var, C0352b.f4305h);
                        oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                        Object obj = ci0.f10109a;
                        c0282a.invoke(obj, tj3Var, 54);
                        aj3VarM4703P.invoke(obj, tj3Var, 54);
                        tj3Var.m22139q(true);
                        e16 e16Var4 = e16Var2;
                        aj3Var2 = aj3VarM4703P;
                        e16Var3 = e16Var4;
                        f2 = f4;
                        mp7Var2 = mp7VarM16426d;
                        z4 = z6;
                    } else {
                        tj3Var.m22102U();
                        f2 = f;
                        e16Var3 = e16Var2;
                        mp7Var2 = mp7VarM16426d;
                        aj3Var2 = aj3Var;
                        z4 = z2;
                    }
                    interfaceC3571se3 = interfaceC3571se2;
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new zi3() { // from class: kp7
                            @Override // p000.zi3
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                lp7.m16424b(z, ui3Var, e16Var3, mp7Var2, interfaceC3571se3, aj3Var2, z4, f2, c0282a, (ye1) obj2, pk9.m19383z(i | 1), i2);
                                return xfa.f68157a;
                            }
                        };
                    }
                }
                i3 |= 24576;
                interfaceC3571se2 = interfaceC3571se;
                i6 = i3 | 14352384;
                if ((38347923 & i6) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var.m22099R(i6 & 1, z3)) {
                    tj3Var.m22104W();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            e16Var2 = b16.f7762a;
                        }
                        if ((i2 & 8) != 0) {
                            mp7VarM16426d = m16426d(tj3Var);
                        }
                        if (i4 != 0) {
                            interfaceC3571se2 = nj0.f52808c;
                        }
                        aj3VarM4703P = ci8.m4703P(419143791, new aj3() { // from class: jp7
                            @Override // p000.aj3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                bi0 bi0Var = (bi0) obj2;
                                ye1 ye1Var2 = (ye1) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= ((tj3) ye1Var2).m22120g(bi0Var) ? 4 : 2;
                                }
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    ip7.f44401a.m14066a(mp7VarM16426d, z, bi0Var.mo3727a(b16.f7762a, nj0.f52809d), 0L, 0L, 0.0f, tj3Var2, 1572864);
                                } else {
                                    tj3Var2.m22102U();
                                }
                                return xfa.f68157a;
                            }
                        }, tj3Var);
                        f3 = ip7.f44403c;
                        z5 = true;
                    } else {
                        if (i8 != 0) {
                            e16Var2 = b16.f7762a;
                        }
                        if ((i2 & 8) != 0) {
                            mp7VarM16426d = m16426d(tj3Var);
                        }
                        if (i4 != 0) {
                            interfaceC3571se2 = nj0.f52808c;
                        }
                        aj3VarM4703P = ci8.m4703P(419143791, new aj3() { // from class: jp7
                            @Override // p000.aj3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                bi0 bi0Var = (bi0) obj2;
                                ye1 ye1Var2 = (ye1) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= ((tj3) ye1Var2).m22120g(bi0Var) ? 4 : 2;
                                }
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    ip7.f44401a.m14066a(mp7VarM16426d, z, bi0Var.mo3727a(b16.f7762a, nj0.f52809d), 0L, 0L, 0.0f, tj3Var2, 1572864);
                                } else {
                                    tj3Var2.m22102U();
                                }
                                return xfa.f68157a;
                            }
                        }, tj3Var);
                        f3 = ip7.f44403c;
                        z5 = true;
                    }
                    tj3Var.m22140r();
                    boolean z7 = z5;
                    float f5 = f3;
                    e16 e16VarMo3161g2 = e16Var2.mo3161g(new C0258a(z, ui3Var, z7, mp7VarM16426d, f5));
                    ht5 ht5VarM19966d2 = qh0.m19966d(interfaceC3571se2, false);
                    int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m2 = tj3Var.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarMo3161g2);
                    se1.f60731q.getClass();
                    ui3Var2 = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var2);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d2);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m2);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode2));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c2);
                    Object obj2 = ci0.f10109a;
                    c0282a.invoke(obj2, tj3Var, 54);
                    aj3VarM4703P.invoke(obj2, tj3Var, 54);
                    tj3Var.m22139q(true);
                    e16 e16Var5 = e16Var2;
                    aj3Var2 = aj3VarM4703P;
                    e16Var3 = e16Var5;
                    f2 = f5;
                    mp7Var2 = mp7VarM16426d;
                    z4 = z7;
                } else {
                    tj3Var.m22102U();
                    f2 = f;
                    e16Var3 = e16Var2;
                    mp7Var2 = mp7VarM16426d;
                    aj3Var2 = aj3Var;
                    z4 = z2;
                }
                interfaceC3571se3 = interfaceC3571se2;
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: kp7
                        @Override // p000.zi3
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            lp7.m16424b(z, ui3Var, e16Var3, mp7Var2, interfaceC3571se3, aj3Var2, z4, f2, c0282a, (ye1) obj3, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            mp7VarM16426d = mp7Var;
            i3 = i7 | i9;
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    interfaceC3571se2 = interfaceC3571se;
                    if (tj3Var.m22120g(interfaceC3571se2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i3 | 14352384;
                if ((38347923 & i6) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var.m22099R(i6 & 1, z3)) {
                    tj3Var.m22104W();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            e16Var2 = b16.f7762a;
                        }
                        if ((i2 & 8) != 0) {
                            mp7VarM16426d = m16426d(tj3Var);
                        }
                        if (i4 != 0) {
                            interfaceC3571se2 = nj0.f52808c;
                        }
                        aj3VarM4703P = ci8.m4703P(419143791, new aj3() { // from class: jp7
                            @Override // p000.aj3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                bi0 bi0Var = (bi0) obj3;
                                ye1 ye1Var2 = (ye1) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= ((tj3) ye1Var2).m22120g(bi0Var) ? 4 : 2;
                                }
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    ip7.f44401a.m14066a(mp7VarM16426d, z, bi0Var.mo3727a(b16.f7762a, nj0.f52809d), 0L, 0L, 0.0f, tj3Var2, 1572864);
                                } else {
                                    tj3Var2.m22102U();
                                }
                                return xfa.f68157a;
                            }
                        }, tj3Var);
                        f3 = ip7.f44403c;
                        z5 = true;
                    } else {
                        if (i8 != 0) {
                            e16Var2 = b16.f7762a;
                        }
                        if ((i2 & 8) != 0) {
                            mp7VarM16426d = m16426d(tj3Var);
                        }
                        if (i4 != 0) {
                            interfaceC3571se2 = nj0.f52808c;
                        }
                        aj3VarM4703P = ci8.m4703P(419143791, new aj3() { // from class: jp7
                            @Override // p000.aj3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                bi0 bi0Var = (bi0) obj3;
                                ye1 ye1Var2 = (ye1) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= ((tj3) ye1Var2).m22120g(bi0Var) ? 4 : 2;
                                }
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    ip7.f44401a.m14066a(mp7VarM16426d, z, bi0Var.mo3727a(b16.f7762a, nj0.f52809d), 0L, 0L, 0.0f, tj3Var2, 1572864);
                                } else {
                                    tj3Var2.m22102U();
                                }
                                return xfa.f68157a;
                            }
                        }, tj3Var);
                        f3 = ip7.f44403c;
                        z5 = true;
                    }
                    tj3Var.m22140r();
                    boolean z8 = z5;
                    float f6 = f3;
                    e16 e16VarMo3161g3 = e16Var2.mo3161g(new C0258a(z, ui3Var, z8, mp7VarM16426d, f6));
                    ht5 ht5VarM19966d3 = qh0.m19966d(interfaceC3571se2, false);
                    int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m3 = tj3Var.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarMo3161g3);
                    se1.f60731q.getClass();
                    ui3Var2 = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var2);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d3);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m3);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode3));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c3);
                    Object obj3 = ci0.f10109a;
                    c0282a.invoke(obj3, tj3Var, 54);
                    aj3VarM4703P.invoke(obj3, tj3Var, 54);
                    tj3Var.m22139q(true);
                    e16 e16Var6 = e16Var2;
                    aj3Var2 = aj3VarM4703P;
                    e16Var3 = e16Var6;
                    f2 = f6;
                    mp7Var2 = mp7VarM16426d;
                    z4 = z8;
                } else {
                    tj3Var.m22102U();
                    f2 = f;
                    e16Var3 = e16Var2;
                    mp7Var2 = mp7VarM16426d;
                    aj3Var2 = aj3Var;
                    z4 = z2;
                }
                interfaceC3571se3 = interfaceC3571se2;
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: kp7
                        @Override // p000.zi3
                        public final Object invoke(Object obj4, Object obj5) {
                            ((Integer) obj5).getClass();
                            lp7.m16424b(z, ui3Var, e16Var3, mp7Var2, interfaceC3571se3, aj3Var2, z4, f2, c0282a, (ye1) obj4, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i3 |= 24576;
            interfaceC3571se2 = interfaceC3571se;
            i6 = i3 | 14352384;
            if ((38347923 & i6) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var.m22099R(i6 & 1, z3)) {
                tj3Var.m22104W();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        e16Var2 = b16.f7762a;
                    }
                    if ((i2 & 8) != 0) {
                        mp7VarM16426d = m16426d(tj3Var);
                    }
                    if (i4 != 0) {
                        interfaceC3571se2 = nj0.f52808c;
                    }
                    aj3VarM4703P = ci8.m4703P(419143791, new aj3() { // from class: jp7
                        @Override // p000.aj3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            bi0 bi0Var = (bi0) obj4;
                            ye1 ye1Var2 = (ye1) obj5;
                            int iIntValue = ((Integer) obj6).intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= ((tj3) ye1Var2).m22120g(bi0Var) ? 4 : 2;
                            }
                            tj3 tj3Var2 = (tj3) ye1Var2;
                            if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                                ip7.f44401a.m14066a(mp7VarM16426d, z, bi0Var.mo3727a(b16.f7762a, nj0.f52809d), 0L, 0L, 0.0f, tj3Var2, 1572864);
                            } else {
                                tj3Var2.m22102U();
                            }
                            return xfa.f68157a;
                        }
                    }, tj3Var);
                    f3 = ip7.f44403c;
                    z5 = true;
                } else {
                    if (i8 != 0) {
                        e16Var2 = b16.f7762a;
                    }
                    if ((i2 & 8) != 0) {
                        mp7VarM16426d = m16426d(tj3Var);
                    }
                    if (i4 != 0) {
                        interfaceC3571se2 = nj0.f52808c;
                    }
                    aj3VarM4703P = ci8.m4703P(419143791, new aj3() { // from class: jp7
                        @Override // p000.aj3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            bi0 bi0Var = (bi0) obj4;
                            ye1 ye1Var2 = (ye1) obj5;
                            int iIntValue = ((Integer) obj6).intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= ((tj3) ye1Var2).m22120g(bi0Var) ? 4 : 2;
                            }
                            tj3 tj3Var2 = (tj3) ye1Var2;
                            if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                                ip7.f44401a.m14066a(mp7VarM16426d, z, bi0Var.mo3727a(b16.f7762a, nj0.f52809d), 0L, 0L, 0.0f, tj3Var2, 1572864);
                            } else {
                                tj3Var2.m22102U();
                            }
                            return xfa.f68157a;
                        }
                    }, tj3Var);
                    f3 = ip7.f44403c;
                    z5 = true;
                }
                tj3Var.m22140r();
                boolean z9 = z5;
                float f7 = f3;
                e16 e16VarMo3161g4 = e16Var2.mo3161g(new C0258a(z, ui3Var, z9, mp7VarM16426d, f7));
                ht5 ht5VarM19966d4 = qh0.m19966d(interfaceC3571se2, false);
                int iHashCode4 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m4 = tj3Var.m22132m();
                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, e16VarMo3161g4);
                se1.f60731q.getClass();
                ui3Var2 = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d4);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m4);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode4));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c4);
                Object obj4 = ci0.f10109a;
                c0282a.invoke(obj4, tj3Var, 54);
                aj3VarM4703P.invoke(obj4, tj3Var, 54);
                tj3Var.m22139q(true);
                e16 e16Var7 = e16Var2;
                aj3Var2 = aj3VarM4703P;
                e16Var3 = e16Var7;
                f2 = f7;
                mp7Var2 = mp7VarM16426d;
                z4 = z9;
            } else {
                tj3Var.m22102U();
                f2 = f;
                e16Var3 = e16Var2;
                mp7Var2 = mp7VarM16426d;
                aj3Var2 = aj3Var;
                z4 = z2;
            }
            interfaceC3571se3 = interfaceC3571se2;
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: kp7
                    @Override // p000.zi3
                    public final Object invoke(Object obj5, Object obj6) {
                        ((Integer) obj6).getClass();
                        lp7.m16424b(z, ui3Var, e16Var3, mp7Var2, interfaceC3571se3, aj3Var2, z4, f2, c0282a, (ye1) obj5, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i7 |= 384;
        e16Var2 = e16Var;
        if ((i2 & 8) == 0) {
            mp7VarM16426d = mp7Var;
            if (tj3Var.m22120g(mp7VarM16426d)) {
            }
            i3 = i7 | i9;
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    interfaceC3571se2 = interfaceC3571se;
                    if (tj3Var.m22120g(interfaceC3571se2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i3 | 14352384;
                if ((38347923 & i6) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var.m22099R(i6 & 1, z3)) {
                    tj3Var.m22104W();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            e16Var2 = b16.f7762a;
                        }
                        if ((i2 & 8) != 0) {
                            mp7VarM16426d = m16426d(tj3Var);
                        }
                        if (i4 != 0) {
                            interfaceC3571se2 = nj0.f52808c;
                        }
                        aj3VarM4703P = ci8.m4703P(419143791, new aj3() { // from class: jp7
                            @Override // p000.aj3
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                bi0 bi0Var = (bi0) obj5;
                                ye1 ye1Var2 = (ye1) obj6;
                                int iIntValue = ((Integer) obj7).intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= ((tj3) ye1Var2).m22120g(bi0Var) ? 4 : 2;
                                }
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    ip7.f44401a.m14066a(mp7VarM16426d, z, bi0Var.mo3727a(b16.f7762a, nj0.f52809d), 0L, 0L, 0.0f, tj3Var2, 1572864);
                                } else {
                                    tj3Var2.m22102U();
                                }
                                return xfa.f68157a;
                            }
                        }, tj3Var);
                        f3 = ip7.f44403c;
                        z5 = true;
                    } else {
                        if (i8 != 0) {
                            e16Var2 = b16.f7762a;
                        }
                        if ((i2 & 8) != 0) {
                            mp7VarM16426d = m16426d(tj3Var);
                        }
                        if (i4 != 0) {
                            interfaceC3571se2 = nj0.f52808c;
                        }
                        aj3VarM4703P = ci8.m4703P(419143791, new aj3() { // from class: jp7
                            @Override // p000.aj3
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                bi0 bi0Var = (bi0) obj5;
                                ye1 ye1Var2 = (ye1) obj6;
                                int iIntValue = ((Integer) obj7).intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= ((tj3) ye1Var2).m22120g(bi0Var) ? 4 : 2;
                                }
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    ip7.f44401a.m14066a(mp7VarM16426d, z, bi0Var.mo3727a(b16.f7762a, nj0.f52809d), 0L, 0L, 0.0f, tj3Var2, 1572864);
                                } else {
                                    tj3Var2.m22102U();
                                }
                                return xfa.f68157a;
                            }
                        }, tj3Var);
                        f3 = ip7.f44403c;
                        z5 = true;
                    }
                    tj3Var.m22140r();
                    boolean z10 = z5;
                    float f8 = f3;
                    e16 e16VarMo3161g5 = e16Var2.mo3161g(new C0258a(z, ui3Var, z10, mp7VarM16426d, f8));
                    ht5 ht5VarM19966d5 = qh0.m19966d(interfaceC3571se2, false);
                    int iHashCode5 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m5 = tj3Var.m22132m();
                    e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var, e16VarMo3161g5);
                    se1.f60731q.getClass();
                    ui3Var2 = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var2);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d5);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m5);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode5));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c5);
                    Object obj5 = ci0.f10109a;
                    c0282a.invoke(obj5, tj3Var, 54);
                    aj3VarM4703P.invoke(obj5, tj3Var, 54);
                    tj3Var.m22139q(true);
                    e16 e16Var8 = e16Var2;
                    aj3Var2 = aj3VarM4703P;
                    e16Var3 = e16Var8;
                    f2 = f8;
                    mp7Var2 = mp7VarM16426d;
                    z4 = z10;
                } else {
                    tj3Var.m22102U();
                    f2 = f;
                    e16Var3 = e16Var2;
                    mp7Var2 = mp7VarM16426d;
                    aj3Var2 = aj3Var;
                    z4 = z2;
                }
                interfaceC3571se3 = interfaceC3571se2;
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: kp7
                        @Override // p000.zi3
                        public final Object invoke(Object obj6, Object obj7) {
                            ((Integer) obj7).getClass();
                            lp7.m16424b(z, ui3Var, e16Var3, mp7Var2, interfaceC3571se3, aj3Var2, z4, f2, c0282a, (ye1) obj6, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i3 |= 24576;
            interfaceC3571se2 = interfaceC3571se;
            i6 = i3 | 14352384;
            if ((38347923 & i6) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var.m22099R(i6 & 1, z3)) {
                tj3Var.m22104W();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        e16Var2 = b16.f7762a;
                    }
                    if ((i2 & 8) != 0) {
                        mp7VarM16426d = m16426d(tj3Var);
                    }
                    if (i4 != 0) {
                        interfaceC3571se2 = nj0.f52808c;
                    }
                    aj3VarM4703P = ci8.m4703P(419143791, new aj3() { // from class: jp7
                        @Override // p000.aj3
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            bi0 bi0Var = (bi0) obj6;
                            ye1 ye1Var2 = (ye1) obj7;
                            int iIntValue = ((Integer) obj8).intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= ((tj3) ye1Var2).m22120g(bi0Var) ? 4 : 2;
                            }
                            tj3 tj3Var2 = (tj3) ye1Var2;
                            if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                                ip7.f44401a.m14066a(mp7VarM16426d, z, bi0Var.mo3727a(b16.f7762a, nj0.f52809d), 0L, 0L, 0.0f, tj3Var2, 1572864);
                            } else {
                                tj3Var2.m22102U();
                            }
                            return xfa.f68157a;
                        }
                    }, tj3Var);
                    f3 = ip7.f44403c;
                    z5 = true;
                } else {
                    if (i8 != 0) {
                        e16Var2 = b16.f7762a;
                    }
                    if ((i2 & 8) != 0) {
                        mp7VarM16426d = m16426d(tj3Var);
                    }
                    if (i4 != 0) {
                        interfaceC3571se2 = nj0.f52808c;
                    }
                    aj3VarM4703P = ci8.m4703P(419143791, new aj3() { // from class: jp7
                        @Override // p000.aj3
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            bi0 bi0Var = (bi0) obj6;
                            ye1 ye1Var2 = (ye1) obj7;
                            int iIntValue = ((Integer) obj8).intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= ((tj3) ye1Var2).m22120g(bi0Var) ? 4 : 2;
                            }
                            tj3 tj3Var2 = (tj3) ye1Var2;
                            if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                                ip7.f44401a.m14066a(mp7VarM16426d, z, bi0Var.mo3727a(b16.f7762a, nj0.f52809d), 0L, 0L, 0.0f, tj3Var2, 1572864);
                            } else {
                                tj3Var2.m22102U();
                            }
                            return xfa.f68157a;
                        }
                    }, tj3Var);
                    f3 = ip7.f44403c;
                    z5 = true;
                }
                tj3Var.m22140r();
                boolean z11 = z5;
                float f9 = f3;
                e16 e16VarMo3161g6 = e16Var2.mo3161g(new C0258a(z, ui3Var, z11, mp7VarM16426d, f9));
                ht5 ht5VarM19966d6 = qh0.m19966d(interfaceC3571se2, false);
                int iHashCode6 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m6 = tj3Var.m22132m();
                e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var, e16VarMo3161g6);
                se1.f60731q.getClass();
                ui3Var2 = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d6);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m6);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode6));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c6);
                Object obj6 = ci0.f10109a;
                c0282a.invoke(obj6, tj3Var, 54);
                aj3VarM4703P.invoke(obj6, tj3Var, 54);
                tj3Var.m22139q(true);
                e16 e16Var9 = e16Var2;
                aj3Var2 = aj3VarM4703P;
                e16Var3 = e16Var9;
                f2 = f9;
                mp7Var2 = mp7VarM16426d;
                z4 = z11;
            } else {
                tj3Var.m22102U();
                f2 = f;
                e16Var3 = e16Var2;
                mp7Var2 = mp7VarM16426d;
                aj3Var2 = aj3Var;
                z4 = z2;
            }
            interfaceC3571se3 = interfaceC3571se2;
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: kp7
                    @Override // p000.zi3
                    public final Object invoke(Object obj7, Object obj8) {
                        ((Integer) obj8).getClass();
                        lp7.m16424b(z, ui3Var, e16Var3, mp7Var2, interfaceC3571se3, aj3Var2, z4, f2, c0282a, (ye1) obj7, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        mp7VarM16426d = mp7Var;
        i3 = i7 | i9;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                interfaceC3571se2 = interfaceC3571se;
                if (tj3Var.m22120g(interfaceC3571se2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i3 | 14352384;
            if ((38347923 & i6) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var.m22099R(i6 & 1, z3)) {
                tj3Var.m22104W();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        e16Var2 = b16.f7762a;
                    }
                    if ((i2 & 8) != 0) {
                        mp7VarM16426d = m16426d(tj3Var);
                    }
                    if (i4 != 0) {
                        interfaceC3571se2 = nj0.f52808c;
                    }
                    aj3VarM4703P = ci8.m4703P(419143791, new aj3() { // from class: jp7
                        @Override // p000.aj3
                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                            bi0 bi0Var = (bi0) obj7;
                            ye1 ye1Var2 = (ye1) obj8;
                            int iIntValue = ((Integer) obj9).intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= ((tj3) ye1Var2).m22120g(bi0Var) ? 4 : 2;
                            }
                            tj3 tj3Var2 = (tj3) ye1Var2;
                            if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                                ip7.f44401a.m14066a(mp7VarM16426d, z, bi0Var.mo3727a(b16.f7762a, nj0.f52809d), 0L, 0L, 0.0f, tj3Var2, 1572864);
                            } else {
                                tj3Var2.m22102U();
                            }
                            return xfa.f68157a;
                        }
                    }, tj3Var);
                    f3 = ip7.f44403c;
                    z5 = true;
                } else {
                    if (i8 != 0) {
                        e16Var2 = b16.f7762a;
                    }
                    if ((i2 & 8) != 0) {
                        mp7VarM16426d = m16426d(tj3Var);
                    }
                    if (i4 != 0) {
                        interfaceC3571se2 = nj0.f52808c;
                    }
                    aj3VarM4703P = ci8.m4703P(419143791, new aj3() { // from class: jp7
                        @Override // p000.aj3
                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                            bi0 bi0Var = (bi0) obj7;
                            ye1 ye1Var2 = (ye1) obj8;
                            int iIntValue = ((Integer) obj9).intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= ((tj3) ye1Var2).m22120g(bi0Var) ? 4 : 2;
                            }
                            tj3 tj3Var2 = (tj3) ye1Var2;
                            if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                                ip7.f44401a.m14066a(mp7VarM16426d, z, bi0Var.mo3727a(b16.f7762a, nj0.f52809d), 0L, 0L, 0.0f, tj3Var2, 1572864);
                            } else {
                                tj3Var2.m22102U();
                            }
                            return xfa.f68157a;
                        }
                    }, tj3Var);
                    f3 = ip7.f44403c;
                    z5 = true;
                }
                tj3Var.m22140r();
                boolean z12 = z5;
                float f10 = f3;
                e16 e16VarMo3161g7 = e16Var2.mo3161g(new C0258a(z, ui3Var, z12, mp7VarM16426d, f10));
                ht5 ht5VarM19966d7 = qh0.m19966d(interfaceC3571se2, false);
                int iHashCode7 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m7 = tj3Var.m22132m();
                e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var, e16VarMo3161g7);
                se1.f60731q.getClass();
                ui3Var2 = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d7);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m7);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode7));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c7);
                Object obj7 = ci0.f10109a;
                c0282a.invoke(obj7, tj3Var, 54);
                aj3VarM4703P.invoke(obj7, tj3Var, 54);
                tj3Var.m22139q(true);
                e16 e16Var10 = e16Var2;
                aj3Var2 = aj3VarM4703P;
                e16Var3 = e16Var10;
                f2 = f10;
                mp7Var2 = mp7VarM16426d;
                z4 = z12;
            } else {
                tj3Var.m22102U();
                f2 = f;
                e16Var3 = e16Var2;
                mp7Var2 = mp7VarM16426d;
                aj3Var2 = aj3Var;
                z4 = z2;
            }
            interfaceC3571se3 = interfaceC3571se2;
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: kp7
                    @Override // p000.zi3
                    public final Object invoke(Object obj8, Object obj9) {
                        ((Integer) obj9).getClass();
                        lp7.m16424b(z, ui3Var, e16Var3, mp7Var2, interfaceC3571se3, aj3Var2, z4, f2, c0282a, (ye1) obj8, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i3 |= 24576;
        interfaceC3571se2 = interfaceC3571se;
        i6 = i3 | 14352384;
        if ((38347923 & i6) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tj3Var.m22099R(i6 & 1, z3)) {
            tj3Var.m22104W();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    e16Var2 = b16.f7762a;
                }
                if ((i2 & 8) != 0) {
                    mp7VarM16426d = m16426d(tj3Var);
                }
                if (i4 != 0) {
                    interfaceC3571se2 = nj0.f52808c;
                }
                aj3VarM4703P = ci8.m4703P(419143791, new aj3() { // from class: jp7
                    @Override // p000.aj3
                    public final Object invoke(Object obj8, Object obj9, Object obj10) {
                        bi0 bi0Var = (bi0) obj8;
                        ye1 ye1Var2 = (ye1) obj9;
                        int iIntValue = ((Integer) obj10).intValue();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= ((tj3) ye1Var2).m22120g(bi0Var) ? 4 : 2;
                        }
                        tj3 tj3Var2 = (tj3) ye1Var2;
                        if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                            ip7.f44401a.m14066a(mp7VarM16426d, z, bi0Var.mo3727a(b16.f7762a, nj0.f52809d), 0L, 0L, 0.0f, tj3Var2, 1572864);
                        } else {
                            tj3Var2.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }, tj3Var);
                f3 = ip7.f44403c;
                z5 = true;
            } else {
                if (i8 != 0) {
                    e16Var2 = b16.f7762a;
                }
                if ((i2 & 8) != 0) {
                    mp7VarM16426d = m16426d(tj3Var);
                }
                if (i4 != 0) {
                    interfaceC3571se2 = nj0.f52808c;
                }
                aj3VarM4703P = ci8.m4703P(419143791, new aj3() { // from class: jp7
                    @Override // p000.aj3
                    public final Object invoke(Object obj8, Object obj9, Object obj10) {
                        bi0 bi0Var = (bi0) obj8;
                        ye1 ye1Var2 = (ye1) obj9;
                        int iIntValue = ((Integer) obj10).intValue();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= ((tj3) ye1Var2).m22120g(bi0Var) ? 4 : 2;
                        }
                        tj3 tj3Var2 = (tj3) ye1Var2;
                        if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                            ip7.f44401a.m14066a(mp7VarM16426d, z, bi0Var.mo3727a(b16.f7762a, nj0.f52809d), 0L, 0L, 0.0f, tj3Var2, 1572864);
                        } else {
                            tj3Var2.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }, tj3Var);
                f3 = ip7.f44403c;
                z5 = true;
            }
            tj3Var.m22140r();
            boolean z13 = z5;
            float f11 = f3;
            e16 e16VarMo3161g8 = e16Var2.mo3161g(new C0258a(z, ui3Var, z13, mp7VarM16426d, f11));
            ht5 ht5VarM19966d8 = qh0.m19966d(interfaceC3571se2, false);
            int iHashCode8 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m8 = tj3Var.m22132m();
            e16 e16VarM1322c8 = AbstractC0287b.m1322c(tj3Var, e16VarMo3161g8);
            se1.f60731q.getClass();
            ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d8);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m8);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode8));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c8);
            Object obj8 = ci0.f10109a;
            c0282a.invoke(obj8, tj3Var, 54);
            aj3VarM4703P.invoke(obj8, tj3Var, 54);
            tj3Var.m22139q(true);
            e16 e16Var11 = e16Var2;
            aj3Var2 = aj3VarM4703P;
            e16Var3 = e16Var11;
            f2 = f11;
            mp7Var2 = mp7VarM16426d;
            z4 = z13;
        } else {
            tj3Var.m22102U();
            f2 = f;
            e16Var3 = e16Var2;
            mp7Var2 = mp7VarM16426d;
            aj3Var2 = aj3Var;
            z4 = z2;
        }
        interfaceC3571se3 = interfaceC3571se2;
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: kp7
                @Override // p000.zi3
                public final Object invoke(Object obj9, Object obj10) {
                    ((Integer) obj10).getClass();
                    lp7.m16424b(z, ui3Var, e16Var3, mp7Var2, interfaceC3571se3, aj3Var2, z4, f2, c0282a, (ye1) obj9, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m16425c(InterfaceC0310a interfaceC0310a, C3500qj c3500qj, e28 e28Var, long j, float f, C3588sv c3588sv) {
        c3500qj.m19991h();
        c3500qj.m19989f(0.0f, 0.0f);
        float fMo912g0 = interfaceC0310a.mo912g0(10.0f);
        float f2 = c3588sv.f61451b;
        c3500qj.m19988e((fMo912g0 * f2) / 2.0f, interfaceC0310a.mo912g0(5.0f) * f2);
        c3500qj.m19988e(interfaceC0310a.mo912g0(10.0f) * f2, 0.0f);
        float fMin = Math.min(e28Var.f36622c - e28Var.f36620a, e28Var.f36623d - e28Var.f36621b) / 2.0f;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (e28Var.m10803d() >> 32)) + fMin) - ((interfaceC0310a.mo912g0(10.0f) * f2) / 2.0f);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (e28Var.m10803d() & 4294967295L)) - interfaceC0310a.mo912g0(2.5f);
        c3500qj.m19994k((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
        float fMo912g1 = c3588sv.f61450a - interfaceC0310a.mo912g0(2.5f);
        long jMo1423z0 = interfaceC0310a.mo1423z0();
        C3309ls c3309lsMo603o0 = interfaceC0310a.mo603o0();
        long jM16483A = c3309lsMo603o0.m16483A();
        c3309lsMo603o0.m16515r().mo17016h();
        try {
            ((qn3) c3309lsMo603o0.f50064b).m20052F(fMo912g1, jMo1423z0);
            InterfaceC0310a.m1408A0(interfaceC0310a, c3500qj, j, f, new el9(interfaceC0310a.mo912g0(2.5f), 0.0f, 0, 0, 30), 48);
        } finally {
            AbstractC3393o1.m17751z(c3309lsMo603o0, jM16483A);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final mp7 m16426d(ye1 ye1Var) {
        Object[] objArr = new Object[0];
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        if (objM22097O == we1.f66679a) {
            objM22097O = new ri5(16);
            tj3Var.m22131l0(objM22097O);
        }
        return (mp7) xwc.m24747T(objArr, mp7.f51703b, (ui3) objM22097O, tj3Var, 384);
    }
}
