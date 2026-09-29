package p000;

import androidx.compose.foundation.gestures.C0100h;
import androidx.compose.foundation.lazy.staggeredgrid.C0144d;
import androidx.compose.material3.AbstractC0218a;
import androidx.compose.p002ui.input.nestedscroll.AbstractC0319c;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.feature.reader.stats.C2530e;
import com.lingq.feature.reader.stats.C2532g;
import kotlin.jvm.internal.FunctionReference;
import p000.AbstractC3584sr;
import p000.b16;
import p000.bmc;
import p000.c99;
import p000.cy4;
import p000.e16;
import p000.fe9;
import p000.ge9;
import p000.l8d;
import p000.p84;
import p000.tj3;
import p000.ui3;
import p000.vv4;
import p000.we1;
import p000.xfa;
import p000.ye1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qid {
    /* JADX WARN: Code duplicated, block: B:100:0x0178  */
    /* JADX WARN: Code duplicated, block: B:101:0x017e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0181  */
    /* JADX WARN: Code duplicated, block: B:104:0x0183  */
    /* JADX WARN: Code duplicated, block: B:107:0x0189  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:112:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:114:0x024f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0260  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:64:0x0101  */
    /* JADX WARN: Code duplicated, block: B:66:0x010b  */
    /* JADX WARN: Code duplicated, block: B:67:0x010e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0116  */
    /* JADX WARN: Code duplicated, block: B:74:0x0121 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x012c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0140  */
    /* JADX WARN: Code duplicated, block: B:85:0x0149  */
    /* JADX WARN: Code duplicated, block: B:88:0x0153  */
    /* JADX WARN: Code duplicated, block: B:90:0x015a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0169  */
    /* JADX WARN: Code duplicated, block: B:96:0x016d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0173  */
    /* JADX INFO: renamed from: a */
    public static final void m19981a(final boolean z, final qj9 qj9Var, final uj9 uj9Var, final d4b d4bVar, final InterfaceC3066h8 interfaceC3066h8, final a85 a85Var, final s65 s65Var, final jl6 jl6Var, final y65 y65Var, final C3026g5 c3026g5, ql9 ql9Var, x08 x08Var, boolean z2, mn5 mn5Var, final cy4 cy4Var, ye1 ye1Var, final int i, final int i2) {
        int i3;
        final ql9 ql9Var2;
        final x08 x08Var2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        tj3 tj3Var;
        final mn5 mn5Var2;
        final ql9 ql9Var3;
        final x08 x08Var3;
        final boolean z4;
        x18 x18VarM22143u;
        ql9 ql9Var4;
        x08 x08Var4;
        boolean z5;
        mn5 mn5Var3;
        final boolean z6;
        final C0144d c0144dM19027O;
        Object objM22097O;
        qj9Var.getClass();
        uj9Var.getClass();
        d4bVar.getClass();
        interfaceC3066h8.getClass();
        a85Var.getClass();
        s65Var.getClass();
        jl6Var.getClass();
        y65Var.getClass();
        c3026g5.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1939130208);
        if ((i & 6) == 0) {
            i3 = i | (tj3Var2.m22122h(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        char c = 1024;
        int i8 = i3 | (tj3Var2.m22124i(qj9Var) ? 32 : 16) | (tj3Var2.m22124i(uj9Var) ? 256 : 128) | (tj3Var2.m22124i(d4bVar) ? 2048 : 1024) | (tj3Var2.m22124i(interfaceC3066h8) ? 16384 : 8192) | (tj3Var2.m22124i(a85Var) ? 131072 : 65536) | (tj3Var2.m22124i(s65Var) ? 1048576 : 524288) | (tj3Var2.m22120g(jl6Var) ? 8388608 : 4194304) | (tj3Var2.m22120g(y65Var) ? 67108864 : 33554432) | (tj3Var2.m22124i(c3026g5) ? 536870912 : 268435456);
        if ((i2 & 1024) == 0) {
            ql9Var2 = ql9Var;
            char c2 = tj3Var2.m22124i(ql9Var2) ? (char) 4 : (char) 2;
            if ((i2 & 2048) == 0) {
                x08Var2 = x08Var;
                char c3 = tj3Var2.m22124i(x08Var2) ? ' ' : (char) 16;
                i4 = c2 | c3;
                i5 = i2 & 4096;
                if (i5 != 0) {
                    i7 = i4 | 384;
                } else {
                    if (tj3Var2.m22122h(z2)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i7 = i4 | i6;
                }
                if ((i2 & 8192) == 0 && tj3Var2.m22124i(mn5Var)) {
                    c = 2048;
                }
                int i9 = i7 | c | (tj3Var2.m22120g(cy4Var) ? (char) 16384 : (char) 8192);
                if ((i8 & 306783379) == 306783378 || (i9 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var2.m22099R(i8 & 1, z3)) {
                    tj3Var2.m22104W();
                    if ((i & 1) != 0 || tj3Var2.m22084B()) {
                        if ((i2 & 1024) != 0) {
                            ql9Var4 = new ql9();
                        } else {
                            ql9Var4 = ql9Var2;
                        }
                        if ((i2 & 2048) != 0) {
                            x08Var4 = new x08();
                        } else {
                            x08Var4 = x08Var2;
                        }
                        if (i5 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i2 & 8192) != 0) {
                            mn5Var3 = new mn5(false, false, false, false, null, null, false, 0, 0, null, null, null, null, null, null, 65535);
                        } else {
                            mn5Var3 = mn5Var;
                        }
                        ql9Var2 = ql9Var4;
                        x08Var2 = x08Var4;
                        z6 = z5;
                    } else {
                        tj3Var2.m22102U();
                        z6 = z2;
                        mn5Var3 = mn5Var;
                    }
                    tj3Var2.m22140r();
                    x17 x17Var = h7a.f41916a;
                    rv2 rv2VarM13115b = h7a.m13115b(AbstractC0218a.m1129i(tj3Var2), tj3Var2);
                    c0144dM19027O = pb1.m19027O(tj3Var2);
                    objM22097O = tj3Var2.m22097O();
                    if (objM22097O == we1.f66679a) {
                        objM22097O = AbstractC0278f.m1254d(new hz4(c0144dM19027O, 0));
                        tj3Var2.m22131l0(objM22097O);
                    }
                    final mn5 mn5Var4 = mn5Var3;
                    tj3Var = tj3Var2;
                    b34.m3232b(AbstractC0319c.m1450a(b16.f7762a, rv2VarM13115b.f59847e, null), ci8.m4703P(-1304188892, new rw1(24, rv2VarM13115b, cy4Var), tj3Var2), ci8.m4703P(925698341, new C3836zk(jl6Var, (dh9) objM22097O, cy4Var, 19), tj3Var2), null, null, 0, 0L, 0L, null, ci8.m4703P(-2010179601, new aj3() { // from class: kz4
                        @Override // p000.aj3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            t17 t17Var = (t17) obj;
                            ye1 ye1Var2 = (ye1) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            t17Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= ((tj3) ye1Var2).m22120g(t17Var) ? 4 : 2;
                            }
                            tj3 tj3Var3 = (tj3) ye1Var2;
                            if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                                qid.m19983c(t17Var, c0144dM19027O, z, qj9Var, uj9Var, d4bVar, interfaceC3066h8, a85Var, s65Var, jl6Var, y65Var, c3026g5, ql9Var2, x08Var2, z6, mn5Var4, cy4Var, tj3Var3, iIntValue & 14);
                            } else {
                                tj3Var3.m22102U();
                            }
                            return xfa.f68157a;
                        }
                    }, tj3Var), tj3Var, 805306800, 504);
                    ql9Var3 = ql9Var2;
                    x08Var3 = x08Var2;
                    z4 = z6;
                    mn5Var2 = mn5Var4;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    mn5Var2 = mn5Var;
                    ql9Var3 = ql9Var2;
                    x08Var3 = x08Var2;
                    z4 = z2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: lz4
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(i | 1);
                            qid.m19981a(z, qj9Var, uj9Var, d4bVar, interfaceC3066h8, a85Var, s65Var, jl6Var, y65Var, c3026g5, ql9Var3, x08Var3, z4, mn5Var2, cy4Var, (ye1) obj, iM19383z, i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            x08Var2 = x08Var;
            i4 = c2 | c3;
            i5 = i2 & 4096;
            if (i5 != 0) {
                i7 = i4 | 384;
            } else {
                if (tj3Var2.m22122h(z2)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i7 = i4 | i6;
            }
            if ((i2 & 8192) == 0) {
                c = 2048;
            }
            int i10 = i7 | c | (tj3Var2.m22120g(cy4Var) ? (char) 16384 : (char) 8192);
            if ((i8 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (tj3Var2.m22099R(i8 & 1, z3)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0) {
                    if ((i2 & 1024) != 0) {
                        ql9Var4 = new ql9();
                    } else {
                        ql9Var4 = ql9Var2;
                    }
                    if ((i2 & 2048) != 0) {
                        x08Var4 = new x08();
                    } else {
                        x08Var4 = x08Var2;
                    }
                    if (i5 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i2 & 8192) != 0) {
                        mn5Var3 = new mn5(false, false, false, false, null, null, false, 0, 0, null, null, null, null, null, null, 65535);
                    } else {
                        mn5Var3 = mn5Var;
                    }
                    ql9Var2 = ql9Var4;
                    x08Var2 = x08Var4;
                    z6 = z5;
                } else {
                    if ((i2 & 1024) != 0) {
                        ql9Var4 = new ql9();
                    } else {
                        ql9Var4 = ql9Var2;
                    }
                    if ((i2 & 2048) != 0) {
                        x08Var4 = new x08();
                    } else {
                        x08Var4 = x08Var2;
                    }
                    if (i5 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i2 & 8192) != 0) {
                        mn5Var3 = new mn5(false, false, false, false, null, null, false, 0, 0, null, null, null, null, null, null, 65535);
                    } else {
                        mn5Var3 = mn5Var;
                    }
                    ql9Var2 = ql9Var4;
                    x08Var2 = x08Var4;
                    z6 = z5;
                }
                tj3Var2.m22140r();
                x17 x17Var2 = h7a.f41916a;
                rv2 rv2VarM13115b2 = h7a.m13115b(AbstractC0218a.m1129i(tj3Var2), tj3Var2);
                c0144dM19027O = pb1.m19027O(tj3Var2);
                objM22097O = tj3Var2.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = AbstractC0278f.m1254d(new hz4(c0144dM19027O, 0));
                    tj3Var2.m22131l0(objM22097O);
                }
                final mn5 mn5Var5 = mn5Var3;
                tj3Var = tj3Var2;
                b34.m3232b(AbstractC0319c.m1450a(b16.f7762a, rv2VarM13115b2.f59847e, null), ci8.m4703P(-1304188892, new rw1(24, rv2VarM13115b2, cy4Var), tj3Var2), ci8.m4703P(925698341, new C3836zk(jl6Var, (dh9) objM22097O, cy4Var, 19), tj3Var2), null, null, 0, 0L, 0L, null, ci8.m4703P(-2010179601, new aj3() { // from class: kz4
                    @Override // p000.aj3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        t17 t17Var = (t17) obj;
                        ye1 ye1Var2 = (ye1) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        t17Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= ((tj3) ye1Var2).m22120g(t17Var) ? 4 : 2;
                        }
                        tj3 tj3Var3 = (tj3) ye1Var2;
                        if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                            qid.m19983c(t17Var, c0144dM19027O, z, qj9Var, uj9Var, d4bVar, interfaceC3066h8, a85Var, s65Var, jl6Var, y65Var, c3026g5, ql9Var2, x08Var2, z6, mn5Var5, cy4Var, tj3Var3, iIntValue & 14);
                        } else {
                            tj3Var3.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }, tj3Var), tj3Var, 805306800, 504);
                ql9Var3 = ql9Var2;
                x08Var3 = x08Var2;
                z4 = z6;
                mn5Var2 = mn5Var5;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                mn5Var2 = mn5Var;
                ql9Var3 = ql9Var2;
                x08Var3 = x08Var2;
                z4 = z2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: lz4
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM19383z = pk9.m19383z(i | 1);
                        qid.m19981a(z, qj9Var, uj9Var, d4bVar, interfaceC3066h8, a85Var, s65Var, jl6Var, y65Var, c3026g5, ql9Var3, x08Var3, z4, mn5Var2, cy4Var, (ye1) obj, iM19383z, i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        ql9Var2 = ql9Var;
        if ((i2 & 2048) == 0) {
            x08Var2 = x08Var;
            if (tj3Var2.m22124i(x08Var2)) {
            }
            i4 = c2 | c3;
            i5 = i2 & 4096;
            if (i5 != 0) {
                i7 = i4 | 384;
            } else {
                if (tj3Var2.m22122h(z2)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i7 = i4 | i6;
            }
            if ((i2 & 8192) == 0) {
                c = 2048;
            }
            int i11 = i7 | c | (tj3Var2.m22120g(cy4Var) ? (char) 16384 : (char) 8192);
            if ((i8 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (tj3Var2.m22099R(i8 & 1, z3)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0) {
                    if ((i2 & 1024) != 0) {
                        ql9Var4 = new ql9();
                    } else {
                        ql9Var4 = ql9Var2;
                    }
                    if ((i2 & 2048) != 0) {
                        x08Var4 = new x08();
                    } else {
                        x08Var4 = x08Var2;
                    }
                    if (i5 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i2 & 8192) != 0) {
                        mn5Var3 = new mn5(false, false, false, false, null, null, false, 0, 0, null, null, null, null, null, null, 65535);
                    } else {
                        mn5Var3 = mn5Var;
                    }
                    ql9Var2 = ql9Var4;
                    x08Var2 = x08Var4;
                    z6 = z5;
                } else {
                    if ((i2 & 1024) != 0) {
                        ql9Var4 = new ql9();
                    } else {
                        ql9Var4 = ql9Var2;
                    }
                    if ((i2 & 2048) != 0) {
                        x08Var4 = new x08();
                    } else {
                        x08Var4 = x08Var2;
                    }
                    if (i5 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i2 & 8192) != 0) {
                        mn5Var3 = new mn5(false, false, false, false, null, null, false, 0, 0, null, null, null, null, null, null, 65535);
                    } else {
                        mn5Var3 = mn5Var;
                    }
                    ql9Var2 = ql9Var4;
                    x08Var2 = x08Var4;
                    z6 = z5;
                }
                tj3Var2.m22140r();
                x17 x17Var3 = h7a.f41916a;
                rv2 rv2VarM13115b3 = h7a.m13115b(AbstractC0218a.m1129i(tj3Var2), tj3Var2);
                c0144dM19027O = pb1.m19027O(tj3Var2);
                objM22097O = tj3Var2.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = AbstractC0278f.m1254d(new hz4(c0144dM19027O, 0));
                    tj3Var2.m22131l0(objM22097O);
                }
                final mn5 mn5Var6 = mn5Var3;
                tj3Var = tj3Var2;
                b34.m3232b(AbstractC0319c.m1450a(b16.f7762a, rv2VarM13115b3.f59847e, null), ci8.m4703P(-1304188892, new rw1(24, rv2VarM13115b3, cy4Var), tj3Var2), ci8.m4703P(925698341, new C3836zk(jl6Var, (dh9) objM22097O, cy4Var, 19), tj3Var2), null, null, 0, 0L, 0L, null, ci8.m4703P(-2010179601, new aj3() { // from class: kz4
                    @Override // p000.aj3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        t17 t17Var = (t17) obj;
                        ye1 ye1Var2 = (ye1) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        t17Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= ((tj3) ye1Var2).m22120g(t17Var) ? 4 : 2;
                        }
                        tj3 tj3Var3 = (tj3) ye1Var2;
                        if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                            qid.m19983c(t17Var, c0144dM19027O, z, qj9Var, uj9Var, d4bVar, interfaceC3066h8, a85Var, s65Var, jl6Var, y65Var, c3026g5, ql9Var2, x08Var2, z6, mn5Var6, cy4Var, tj3Var3, iIntValue & 14);
                        } else {
                            tj3Var3.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }, tj3Var), tj3Var, 805306800, 504);
                ql9Var3 = ql9Var2;
                x08Var3 = x08Var2;
                z4 = z6;
                mn5Var2 = mn5Var6;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                mn5Var2 = mn5Var;
                ql9Var3 = ql9Var2;
                x08Var3 = x08Var2;
                z4 = z2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: lz4
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM19383z = pk9.m19383z(i | 1);
                        qid.m19981a(z, qj9Var, uj9Var, d4bVar, interfaceC3066h8, a85Var, s65Var, jl6Var, y65Var, c3026g5, ql9Var3, x08Var3, z4, mn5Var2, cy4Var, (ye1) obj, iM19383z, i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        x08Var2 = x08Var;
        i4 = c2 | c3;
        i5 = i2 & 4096;
        if (i5 != 0) {
            i7 = i4 | 384;
        } else {
            if (tj3Var2.m22122h(z2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i7 = i4 | i6;
        }
        if ((i2 & 8192) == 0) {
            c = 2048;
        }
        int i12 = i7 | c | (tj3Var2.m22120g(cy4Var) ? (char) 16384 : (char) 8192);
        if ((i8 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (tj3Var2.m22099R(i8 & 1, z3)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0) {
                if ((i2 & 1024) != 0) {
                    ql9Var4 = new ql9();
                } else {
                    ql9Var4 = ql9Var2;
                }
                if ((i2 & 2048) != 0) {
                    x08Var4 = new x08();
                } else {
                    x08Var4 = x08Var2;
                }
                if (i5 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if ((i2 & 8192) != 0) {
                    mn5Var3 = new mn5(false, false, false, false, null, null, false, 0, 0, null, null, null, null, null, null, 65535);
                } else {
                    mn5Var3 = mn5Var;
                }
                ql9Var2 = ql9Var4;
                x08Var2 = x08Var4;
                z6 = z5;
            } else {
                if ((i2 & 1024) != 0) {
                    ql9Var4 = new ql9();
                } else {
                    ql9Var4 = ql9Var2;
                }
                if ((i2 & 2048) != 0) {
                    x08Var4 = new x08();
                } else {
                    x08Var4 = x08Var2;
                }
                if (i5 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if ((i2 & 8192) != 0) {
                    mn5Var3 = new mn5(false, false, false, false, null, null, false, 0, 0, null, null, null, null, null, null, 65535);
                } else {
                    mn5Var3 = mn5Var;
                }
                ql9Var2 = ql9Var4;
                x08Var2 = x08Var4;
                z6 = z5;
            }
            tj3Var2.m22140r();
            x17 x17Var4 = h7a.f41916a;
            rv2 rv2VarM13115b4 = h7a.m13115b(AbstractC0218a.m1129i(tj3Var2), tj3Var2);
            c0144dM19027O = pb1.m19027O(tj3Var2);
            objM22097O = tj3Var2.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = AbstractC0278f.m1254d(new hz4(c0144dM19027O, 0));
                tj3Var2.m22131l0(objM22097O);
            }
            final mn5 mn5Var7 = mn5Var3;
            tj3Var = tj3Var2;
            b34.m3232b(AbstractC0319c.m1450a(b16.f7762a, rv2VarM13115b4.f59847e, null), ci8.m4703P(-1304188892, new rw1(24, rv2VarM13115b4, cy4Var), tj3Var2), ci8.m4703P(925698341, new C3836zk(jl6Var, (dh9) objM22097O, cy4Var, 19), tj3Var2), null, null, 0, 0L, 0L, null, ci8.m4703P(-2010179601, new aj3() { // from class: kz4
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    t17 t17Var = (t17) obj;
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    t17Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((tj3) ye1Var2).m22120g(t17Var) ? 4 : 2;
                    }
                    tj3 tj3Var3 = (tj3) ye1Var2;
                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                        qid.m19983c(t17Var, c0144dM19027O, z, qj9Var, uj9Var, d4bVar, interfaceC3066h8, a85Var, s65Var, jl6Var, y65Var, c3026g5, ql9Var2, x08Var2, z6, mn5Var7, cy4Var, tj3Var3, iIntValue & 14);
                    } else {
                        tj3Var3.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 805306800, 504);
            ql9Var3 = ql9Var2;
            x08Var3 = x08Var2;
            z4 = z6;
            mn5Var2 = mn5Var7;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            mn5Var2 = mn5Var;
            ql9Var3 = ql9Var2;
            x08Var3 = x08Var2;
            z4 = z2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: lz4
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i | 1);
                    qid.m19981a(z, qj9Var, uj9Var, d4bVar, interfaceC3066h8, a85Var, s65Var, jl6Var, y65Var, c3026g5, ql9Var3, x08Var3, z4, mn5Var2, cy4Var, (ye1) obj, iM19383z, i2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m19982b(e16 e16Var, C0282a c0282a, ye1 ye1Var, int i, int i2) {
        int i3;
        tj3 tj3Var;
        e16 e16Var2;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(477040044);
        int i4 = i2 & 1;
        int i5 = 2;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (tj3Var2.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var2.m22124i(c0282a) ? 32 : 16;
        }
        int i6 = i3;
        if (tj3Var2.m22099R(i6 & 1, (i6 & 19) != 18)) {
            e16 e16Var3 = i4 != 0 ? b16.f7762a : e16Var;
            r46.m20381f(e16Var3, null, null, te1.m21999m(0, 14, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55824I, 0L, tj3Var2), ci8.m4703P(-1604764650, new mx0(c0282a, i5), tj3Var2), tj3Var2, (i6 & 14) | 24576, 6);
            tj3Var = tj3Var2;
            e16Var2 = e16Var3;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zs1(e16Var2, c0282a, i, i2, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m19983c(final t17 t17Var, final C0144d c0144d, final boolean z, final qj9 qj9Var, final uj9 uj9Var, final d4b d4bVar, final InterfaceC3066h8 interfaceC3066h8, final a85 a85Var, final s65 s65Var, final jl6 jl6Var, final y65 y65Var, final C3026g5 c3026g5, final ql9 ql9Var, final x08 x08Var, final boolean z2, final mn5 mn5Var, final cy4 cy4Var, ye1 ye1Var, final int i) {
        int i2;
        tj3 tj3Var;
        Object obj;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1899408383);
        if ((i & 6) == 0) {
            i2 = i | (tj3Var2.m22120g(t17Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22120g(c0144d) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22122h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var2.m22124i(qj9Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var2.m22124i(uj9Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= tj3Var2.m22124i(d4bVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= tj3Var2.m22124i(interfaceC3066h8) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= tj3Var2.m22124i(a85Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= tj3Var2.m22124i(s65Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= (i & 1073741824) == 0 ? tj3Var2.m22120g(jl6Var) : tj3Var2.m22124i(jl6Var) ? 536870912 : 268435456;
        }
        int i3 = i2;
        int i4 = (tj3Var2.m22120g(y65Var) ? (char) 4 : (char) 2) | (tj3Var2.m22124i(c3026g5) ? ' ' : (char) 16) | (tj3Var2.m22124i(ql9Var) ? (char) 256 : (char) 128) | (tj3Var2.m22124i(x08Var) ? (char) 2048 : (char) 1024) | (tj3Var2.m22122h(z2) ? (char) 16384 : (char) 8192) | (tj3Var2.m22124i(mn5Var) ? (char) 0 : (char) 0) | (tj3Var2.m22120g(cy4Var) ? (char) 0 : (char) 0);
        if (tj3Var2.m22099R(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 599187) == 599186) ? false : true)) {
            e16 e16VarM10007D = d32.m10007D(c99.m4411d(b16.f7762a, 1.0f), ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55868n, ss5.f61356d);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(e16VarM10007D, ((fe9) tj3Var2.m22128k(zf1Var)).f38960i, 0.0f, ((fe9) tj3Var2.m22128k(zf1Var)).f38960i, 0.0f, 10);
            kg9 kg9Var = new kg9(400.0f);
            C3661uu c3661uu = new C3661uu(((fe9) tj3Var2.m22128k(zf1Var)).f38962k, true, new gm5(28));
            f32 f32VarM21341a = sf9.m21341a(tj3Var2);
            boolean zM22120g = tj3Var2.m22120g(f32VarM21341a);
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                objM22097O = new C0100h(f32VarM21341a);
                tj3Var2.m22131l0(objM22097O);
            }
            C0100h c0100h = (C0100h) objM22097O;
            boolean zM22124i = ((i3 & 896) == 256) | ((i4 & 14) == 4) | ((i4 & 3670016) == 1048576) | tj3Var2.m22124i(c3026g5) | tj3Var2.m22124i(s65Var) | tj3Var2.m22124i(qj9Var) | tj3Var2.m22124i(uj9Var) | tj3Var2.m22124i(mn5Var) | tj3Var2.m22124i(a85Var) | tj3Var2.m22124i(d4bVar) | tj3Var2.m22124i(interfaceC3066h8) | tj3Var2.m22124i(ql9Var) | tj3Var2.m22124i(x08Var) | ((1879048192 & i3) == 536870912 || ((i3 & 1073741824) != 0 && tj3Var2.m22124i(jl6Var))) | ((i4 & 57344) == 16384);
            Object objM22097O2 = tj3Var2.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                obj = new vi3() { // from class: mz4
                    @Override // p000.vi3
                    public final Object invoke(Object obj2) {
                        tv4 tv4Var = (tv4) obj2;
                        tv4Var.getClass();
                        final y65 y65Var2 = y65Var;
                        final cy4 cy4Var2 = cy4Var;
                        tv4.m22312g(tv4Var, "lessonCompleteHeader", new C0282a(-214637195, true, new tw2(y65Var2, cy4Var2, c3026g5, z)), 6);
                        final s65 s65Var2 = s65Var;
                        tv4.m22312g(tv4Var, "lessonStats", new C0282a(2041259038, true, new C3180kd(29, s65Var2, cy4Var2)), 6);
                        final qj9 qj9Var2 = qj9Var;
                        final uj9 uj9Var2 = uj9Var;
                        tv4.m22312g(tv4Var, "statsAndStreak", new C0282a(-690611203, true, new aj3() { // from class: com.lingq.feature.reader.stats.d
                            @Override // p000.aj3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                ye1 ye1Var2 = (ye1) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                ((vv4) obj3).getClass();
                                tj3 tj3Var3 = (tj3) ye1Var2;
                                if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    e16 e16VarM21611X2 = AbstractC3584sr.m21611X(c99.m4412e(b16.f7762a, 1.0f), 0.0f, 0.0f, 0.0f, ((fe9) tj3Var3.m22128k(ge9.f40637a)).f38957f, 7);
                                    cy4 cy4Var3 = cy4Var2;
                                    boolean zM22124i2 = tj3Var3.m22124i(cy4Var3);
                                    Object objM22097O3 = tj3Var3.m22097O();
                                    if (zM22124i2 || objM22097O3 == we1.f66679a) {
                                        LessonCompleteScreenKt$ScrollableContent$1$1$3$1$1 lessonCompleteScreenKt$ScrollableContent$1$1$3$1$1 = new LessonCompleteScreenKt$ScrollableContent$1$1$3$1$1(0, cy4Var3, cy4.class, "onStatsClicked", "onStatsClicked()V", 0);
                                        tj3Var3.m22131l0(lessonCompleteScreenKt$ScrollableContent$1$1$3$1$1);
                                        objM22097O3 = lessonCompleteScreenKt$ScrollableContent$1$1$3$1$1;
                                    }
                                    l8d.m16027a(e16VarM21611X2, s65Var2, qj9Var2, uj9Var2, (ui3) ((FunctionReference) objM22097O3), tj3Var3, 0);
                                } else {
                                    tj3Var3.m22102U();
                                }
                                return xfa.f68157a;
                            }
                        }), 6);
                        final mn5 mn5Var2 = mn5Var;
                        if (mn5Var2.f51559a) {
                            tv4.m22312g(tv4Var, "lynxCoach", new C0282a(-133457798, true, new C2530e(cy4Var2, mn5Var2)), 6);
                        }
                        tv4.m22312g(tv4Var, "reinforce", new C0282a(872485852, true, new aj3() { // from class: com.lingq.feature.reader.stats.f
                            @Override // p000.aj3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                ye1 ye1Var2 = (ye1) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                ((vv4) obj3).getClass();
                                tj3 tj3Var3 = (tj3) ye1Var2;
                                if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    e16 e16VarM21611X2 = AbstractC3584sr.m21611X(b16.f7762a, 0.0f, 0.0f, 0.0f, ((fe9) tj3Var3.m22128k(ge9.f40637a)).f38957f, 7);
                                    boolean z3 = y65Var2.f69374g;
                                    boolean z4 = !mn5Var2.f51559a;
                                    cy4 cy4Var3 = cy4Var2;
                                    boolean zM22124i2 = tj3Var3.m22124i(cy4Var3);
                                    Object objM22097O3 = tj3Var3.m22097O();
                                    p84 p84Var2 = we1.f66679a;
                                    if (zM22124i2 || objM22097O3 == p84Var2) {
                                        LessonCompleteScreenKt$ScrollableContent$1$1$5$1$1 lessonCompleteScreenKt$ScrollableContent$1$1$5$1$1 = new LessonCompleteScreenKt$ScrollableContent$1$1$5$1$1(0, cy4Var3, cy4.class, "onReviewLingQsClicked", "onReviewLingQsClicked()V", 0);
                                        tj3Var3.m22131l0(lessonCompleteScreenKt$ScrollableContent$1$1$5$1$1);
                                        objM22097O3 = lessonCompleteScreenKt$ScrollableContent$1$1$5$1$1;
                                    }
                                    ui3 ui3Var = (ui3) ((FunctionReference) objM22097O3);
                                    boolean zM22124i3 = tj3Var3.m22124i(cy4Var3);
                                    Object objM22097O4 = tj3Var3.m22097O();
                                    if (zM22124i3 || objM22097O4 == p84Var2) {
                                        LessonCompleteScreenKt$ScrollableContent$1$1$5$2$1 lessonCompleteScreenKt$ScrollableContent$1$1$5$2$1 = new LessonCompleteScreenKt$ScrollableContent$1$1$5$2$1(0, cy4Var3, cy4.class, "onReplayAudioClicked", "onReplayAudioClicked()V", 0);
                                        tj3Var3.m22131l0(lessonCompleteScreenKt$ScrollableContent$1$1$5$2$1);
                                        objM22097O4 = lessonCompleteScreenKt$ScrollableContent$1$1$5$2$1;
                                    }
                                    ui3 ui3Var2 = (ui3) ((FunctionReference) objM22097O4);
                                    boolean zM22124i4 = tj3Var3.m22124i(cy4Var3);
                                    Object objM22097O5 = tj3Var3.m22097O();
                                    if (zM22124i4 || objM22097O5 == p84Var2) {
                                        LessonCompleteScreenKt$ScrollableContent$1$1$5$3$1 lessonCompleteScreenKt$ScrollableContent$1$1$5$3$1 = new LessonCompleteScreenKt$ScrollableContent$1$1$5$3$1(0, cy4Var3, cy4.class, "onChatWithAIClicked", "onChatWithAIClicked()V", 0);
                                        tj3Var3.m22131l0(lessonCompleteScreenKt$ScrollableContent$1$1$5$3$1);
                                        objM22097O5 = lessonCompleteScreenKt$ScrollableContent$1$1$5$3$1;
                                    }
                                    bmc.m3883a(e16VarM21611X2, z3, z4, ui3Var, ui3Var2, (ui3) ((FunctionReference) objM22097O5), tj3Var3, 0);
                                } else {
                                    tj3Var3.m22102U();
                                }
                                return xfa.f68157a;
                            }
                        }), 6);
                        tv4.m22312g(tv4Var, "languageProgress", new C0282a(-1859384389, true, new C3357n2(a85Var, s65Var2, d4bVar, y65Var2, 10)), 6);
                        int i5 = 0;
                        tv4.m22312g(tv4Var, "studyTimeGraph", new C0282a(-296287334, true, new iz4(i5, interfaceC3066h8, ql9Var)), 6);
                        tv4.m22312g(tv4Var, "readingSpeedGraph", new C0282a(1266809721, true, new se0(x08Var, 18)), 6);
                        jl6 jl6Var2 = jl6Var;
                        if (jl6Var2 instanceof il6) {
                            tv4.m22312g(tv4Var, "nextLesson", new C0282a(-1549719069, true, new C2530e(jl6Var2, cy4Var2)), 6);
                        }
                        if (z2) {
                            tv4.m22312g(tv4Var, "recommended", new C0282a(13377986, true, new C2532g(cy4Var2, i5)), 6);
                        }
                        return xfa.f68157a;
                    }
                };
                tj3Var = tj3Var2;
                tj3Var.m22131l0(obj);
            } else {
                obj = objM22097O2;
                tj3Var = tj3Var2;
            }
            xwc.m24758c(kg9Var, e16VarM21611X, c0144d, t17Var, 0.0f, c3661uu, c0100h, false, null, (vi3) obj, tj3Var, ((i3 << 3) & 896) | ((i3 << 9) & 7168), 816);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: nz4
                @Override // p000.zi3
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM19383z = pk9.m19383z(i | 1);
                    qid.m19983c(t17Var, c0144d, z, qj9Var, uj9Var, d4bVar, interfaceC3066h8, a85Var, s65Var, jl6Var, y65Var, c3026g5, ql9Var, x08Var, z2, mn5Var, cy4Var, (ye1) obj2, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }
}
