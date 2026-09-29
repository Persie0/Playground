package p000;

import androidx.compose.foundation.C0145m;
import androidx.compose.material3.C0252k0;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s6a {

    /* JADX INFO: renamed from: a */
    public static final x17 f60435a = new x17(8.0f, 4.0f, 8.0f, 4.0f);

    /* JADX INFO: renamed from: a */
    public static final void m21130a(final v6a v6aVar, e16 e16Var, float f, o39 o39Var, long j, long j2, final C0282a c0282a, ye1 ye1Var, final int i) {
        int i2;
        tj3 tj3Var;
        final e16 e16Var2;
        final float f2;
        final o39 o39Var2;
        final long j3;
        final long j4;
        final long jM20492e;
        int i3;
        long jM20492e2;
        e16 e16Var3;
        o39 o39Var3;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-343758958);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? tj3Var2.m22120g(v6aVar) : tj3Var2.m22124i(v6aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 3504;
        if ((i & 24576) == 0) {
            i4 = i2 | 11696;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        int i5 = 113246208 | i4;
        if ((805306368 & i) == 0) {
            i5 |= tj3Var2.m22124i(c0282a) ? 536870912 : 268435456;
        }
        if (tj3Var2.m22099R(i5 & 1, (306783379 & i5) != 306783378)) {
            tj3Var2.m22104W();
            if ((i & 1) == 0 || tj3Var2.m22084B()) {
                f2 = c6a.f9644a;
                o39 o39VarM24271b = x49.m24271b(t87.f61984b, tj3Var2);
                jM20492e = ra1.m20492e(t87.f61985c, tj3Var2);
                i3 = i5 & (-4186113);
                jM20492e2 = ra1.m20492e(t87.f61983a, tj3Var2);
                e16Var3 = b16.f7762a;
                o39Var3 = o39VarM24271b;
            } else {
                tj3Var2.m22102U();
                i3 = i5 & (-4186113);
                e16Var3 = e16Var;
                f2 = f;
                o39Var3 = o39Var;
                jM20492e = j;
                jM20492e2 = j2;
            }
            tj3Var2.m22140r();
            tj3Var2.m22111b0(-1719869687);
            tj3Var2.m22139q(false);
            int i6 = i3 >> 9;
            tj3Var = tj3Var2;
            ho9.m13414a(e16Var3, o39Var3, jM20492e2, 0L, 0.0f, 0.0f, null, ci8.m4703P(-1573998995, new zi3() { // from class: q6a
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var3 = (tj3) ye1Var2;
                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        e16 e16VarM21606S = AbstractC3584sr.m21606S(c99.m4425r(b16.f7762a, 40.0f, 24.0f, f2, 8), s6a.f60435a);
                        ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                        int iHashCode = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m = tj3Var3.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM21606S);
                        se1.f60731q.getClass();
                        ui3 ui3Var = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, C0352b.f4303f, ht5VarM19966d);
                        oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                        oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                        oha.m18000f(tj3Var3, C0352b.f4305h);
                        oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                        pvc.m19508d(new a02[]{AbstractC3393o1.m17727b(jM20492e, sk1.f60948a), lw9.f50220a.mo1265a(cea.m4600a(t87.f61986d, tj3Var3))}, c0282a, tj3Var3, 8);
                        tj3Var3.m22139q(true);
                    } else {
                        tj3Var3.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var2), tj3Var, (57344 & i6) | 12582912 | (i6 & 458752), 72);
            j3 = jM20492e;
            e16Var2 = e16Var3;
            o39Var2 = o39Var3;
            j4 = jM20492e2;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
            f2 = f;
            o39Var2 = o39Var;
            j3 = j;
            j4 = j2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: r6a
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s6a.m21130a(v6aVar, e16Var2, f2, o39Var2, j3, j4, c0282a, (ye1) obj, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:110:0x020a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0210  */
    /* JADX WARN: Code duplicated, block: B:113:0x0215  */
    /* JADX WARN: Code duplicated, block: B:121:0x022f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0245  */
    /* JADX WARN: Code duplicated, block: B:125:0x0248  */
    /* JADX WARN: Code duplicated, block: B:129:0x025c  */
    /* JADX WARN: Code duplicated, block: B:133:0x027c  */
    /* JADX WARN: Code duplicated, block: B:137:0x0291  */
    /* JADX WARN: Code duplicated, block: B:139:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:142:0x0304  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:69:0x0122  */
    /* JADX WARN: Code duplicated, block: B:74:0x0134  */
    /* JADX WARN: Code duplicated, block: B:76:0x013a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0141  */
    /* JADX WARN: Code duplicated, block: B:85:0x015b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0173  */
    /* JADX WARN: Code duplicated, block: B:89:0x0176  */
    /* JADX WARN: Code duplicated, block: B:93:0x018c  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:98:0x01af  */
    /* JADX INFO: renamed from: b */
    public static final void m21131b(ph7 ph7Var, C0282a c0282a, C0252k0 c0252k0, e16 e16Var, boolean z, zi3 zi3Var, ye1 ye1Var, int i, int i2) {
        ph7 ph7Var2;
        int i3;
        e16 e16Var2;
        int i4;
        boolean z2;
        e16 e16Var3;
        boolean z3;
        x18 x18VarM22143u;
        e16 e16Var4;
        faa faaVarM15045g;
        Object objM22097O;
        p84 p84Var;
        t66 t66Var;
        Object objM22097O2;
        Object objM22097O3;
        t66 t66Var2;
        Object objM22097O4;
        boolean z4;
        Object objM24111g;
        boolean zBooleanValue;
        float f;
        boolean zM22120g;
        Object objM22097O5;
        boolean zBooleanValue2;
        float f2;
        boolean zM22120g2;
        Object objM22097O6;
        boolean z5;
        Object objM24111g2;
        boolean zBooleanValue3;
        float f3;
        boolean zM22120g3;
        Object objM22097O7;
        boolean zM22120g4;
        Object objM22097O8;
        boolean zM22120g5;
        jc9 jc9VarM16139y;
        vi3 vi3VarMo3163e;
        jc9 jc9VarM16106F;
        boolean zM22120g6;
        jc9 jc9VarM16139y2;
        vi3 vi3VarMo3163e2;
        jc9 jc9VarM16106F2;
        int i5;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-293753984);
        if ((i & 6) == 0) {
            ph7Var2 = ph7Var;
            i3 = (tj3Var.m22120g(ph7Var2) ? 4 : 2) | i;
        } else {
            ph7Var2 = ph7Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22124i(c0282a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? tj3Var.m22120g(c0252k0) : tj3Var.m22124i(c0252k0) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                e16Var2 = e16Var;
                i3 |= tj3Var.m22120g(e16Var2) ? 2048 : 1024;
            }
            i4 = i3 | 14376960;
            if ((100663296 & i) == 0) {
                if (tj3Var.m22124i(zi3Var)) {
                    i5 = 67108864;
                } else {
                    i5 = 33554432;
                }
                i4 |= i5;
            }
            if ((38347923 & i4) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (tj3Var.m22099R(i4 & 1, z2)) {
                if (i6 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                faaVarM15045g = kaa.m15045g(c0252k0.f3549b, "tooltip transition", tj3Var, 48);
                objM22097O = tj3Var.m22097O();
                p84Var = we1.f66679a;
                if (objM22097O == p84Var) {
                    objM22097O = AbstractC0278f.m1260j(null);
                    tj3Var.m22131l0(objM22097O);
                }
                t66Var = (t66) objM22097O;
                objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var) {
                    new un7(26, t66Var);
                    objM22097O2 = new v6a();
                    tj3Var.m22131l0(objM22097O2);
                }
                v6a v6aVar = (v6a) objM22097O2;
                C0282a c0282aM4703P = ci8.m4703P(-23901870, new eq8(24, t66Var, zi3Var), tj3Var);
                objM22097O3 = tj3Var.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = AbstractC0278f.m1260j(null);
                    tj3Var.m22131l0(objM22097O3);
                }
                t66Var2 = (t66) objM22097O3;
                objM22097O4 = tj3Var.m22097O();
                if (objM22097O4 == p84Var) {
                    objM22097O4 = AbstractC0278f.m1254d(new zy0(t66Var, t66Var2, 3));
                    tj3Var.m22131l0(objM22097O4);
                }
                dh9 dh9Var = (dh9) objM22097O4;
                l43 l43VarM21705c0 = ss5.m21705c0(MotionSchemeKeyTokens.FastSpatial, tj3Var);
                l43 l43VarM21705c1 = ss5.m21705c0(MotionSchemeKeyTokens.FastEffects, tj3Var);
                jda jdaVar = pk9.f56363h;
                if (faaVarM15045g.m11673g()) {
                    z4 = false;
                    objM24111g = wq1.m24111g(tj3Var, 1666827533, false, faaVarM15045g);
                } else {
                    tj3Var.m22111b0(1666573488);
                    zM22120g6 = tj3Var.m22120g(faaVarM15045g);
                    objM24111g = tj3Var.m22097O();
                    if (zM22120g6 || objM24111g == p84Var) {
                        jc9VarM16139y2 = lda.m16139y();
                        if (jc9VarM16139y2 != null) {
                            vi3VarMo3163e2 = jc9VarM16139y2.mo3163e();
                        } else {
                            vi3VarMo3163e2 = null;
                        }
                        jc9VarM16106F2 = lda.m16106F(jc9VarM16139y2);
                        try {
                            Object objM11669c = faaVarM15045g.m11669c();
                            lda.m16110J(jc9VarM16139y2, jc9VarM16106F2, vi3VarMo3163e2);
                            tj3Var.m22131l0(objM11669c);
                            objM24111g = objM11669c;
                        } catch (Throwable th) {
                            lda.m16110J(jc9VarM16139y2, jc9VarM16106F2, vi3VarMo3163e2);
                            throw th;
                        }
                    }
                    z4 = false;
                    tj3Var.m22139q(false);
                }
                zBooleanValue = ((Boolean) objM24111g).booleanValue();
                tj3Var.m22111b0(838300572);
                if (zBooleanValue) {
                    f = 1.0f;
                } else {
                    f = 0.8f;
                }
                tj3Var.m22139q(z4);
                Float fValueOf = Float.valueOf(f);
                zM22120g = tj3Var.m22120g(faaVarM15045g);
                objM22097O5 = tj3Var.m22097O();
                if (zM22120g || objM22097O5 == p84Var) {
                    objM22097O5 = AbstractC0278f.m1254d(new sw5(faaVarM15045g, 22));
                    tj3Var.m22131l0(objM22097O5);
                }
                zBooleanValue2 = ((Boolean) ((dh9) objM22097O5).getValue()).booleanValue();
                tj3Var.m22111b0(838300572);
                if (zBooleanValue2) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.8f;
                }
                tj3Var.m22139q(false);
                Float fValueOf2 = Float.valueOf(f2);
                zM22120g2 = tj3Var.m22120g(faaVarM15045g);
                objM22097O6 = tj3Var.m22097O();
                if (zM22120g2 || objM22097O6 == p84Var) {
                    objM22097O6 = AbstractC0278f.m1254d(new sw5(faaVarM15045g, 23));
                    tj3Var.m22131l0(objM22097O6);
                }
                tj3Var.m22111b0(-1664496585);
                tj3Var.m22139q(false);
                baa baaVarM15041c = kaa.m15041c(faaVarM15045g, fValueOf, fValueOf2, l43VarM21705c0, jdaVar, tj3Var, 196608);
                if (faaVarM15045g.m11673g()) {
                    z5 = false;
                    objM24111g2 = wq1.m24111g(tj3Var, 1666827533, false, faaVarM15045g);
                } else {
                    tj3Var.m22111b0(1666573488);
                    zM22120g5 = tj3Var.m22120g(faaVarM15045g);
                    objM24111g2 = tj3Var.m22097O();
                    if (zM22120g5 || objM24111g2 == p84Var) {
                        jc9VarM16139y = lda.m16139y();
                        if (jc9VarM16139y != null) {
                            vi3VarMo3163e = jc9VarM16139y.mo3163e();
                        } else {
                            vi3VarMo3163e = null;
                        }
                        jc9VarM16106F = lda.m16106F(jc9VarM16139y);
                        try {
                            Object objM11669c2 = faaVarM15045g.m11669c();
                            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                            tj3Var.m22131l0(objM11669c2);
                            objM24111g2 = objM11669c2;
                        } catch (Throwable th2) {
                            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                            throw th2;
                        }
                    }
                    z5 = false;
                    tj3Var.m22139q(false);
                }
                zBooleanValue3 = ((Boolean) objM24111g2).booleanValue();
                tj3Var.m22111b0(-1903393104);
                if (zBooleanValue3) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                tj3Var.m22139q(z5);
                Float fValueOf3 = Float.valueOf(f3);
                zM22120g3 = tj3Var.m22120g(faaVarM15045g);
                objM22097O7 = tj3Var.m22097O();
                if (zM22120g3 || objM22097O7 == p84Var) {
                    objM22097O7 = AbstractC0278f.m1254d(new sw5(faaVarM15045g, 24));
                    tj3Var.m22131l0(objM22097O7);
                }
                boolean zBooleanValue4 = ((Boolean) ((dh9) objM22097O7).getValue()).booleanValue();
                tj3Var.m22111b0(-1903393104);
                float f4 = zBooleanValue4 ? 1.0f : 0.0f;
                tj3Var.m22139q(z5);
                Float fValueOf4 = Float.valueOf(f4);
                zM22120g4 = tj3Var.m22120g(faaVarM15045g);
                objM22097O8 = tj3Var.m22097O();
                if (zM22120g4 || objM22097O8 == p84Var) {
                    objM22097O8 = AbstractC0278f.m1254d(new sw5(faaVarM15045g, 25));
                    tj3Var.m22131l0(objM22097O8);
                }
                tj3Var.m22111b0(-111222965);
                tj3Var.m22139q(z5);
                m4d.m16628a(ph7Var2, ci8.m4703P(-527401546, new zs0(t66Var2, baaVarM15041c, kaa.m15041c(faaVarM15045g, fValueOf3, fValueOf4, l43VarM21705c1, jdaVar, tj3Var, 196608), dh9Var, c0282a, v6aVar, 8), tj3Var), c0252k0, e16Var4, c0282aM4703P, tj3Var, (i4 & 14) | 100663344 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (i4 & 29360128));
                e16Var3 = e16Var4;
                z3 = true;
            } else {
                tj3Var.m22102U();
                e16Var3 = e16Var2;
                z3 = z;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new a65(ph7Var, c0282a, c0252k0, e16Var3, z3, zi3Var, i, i2);
            }
        }
        i3 |= 3072;
        e16Var2 = e16Var;
        i4 = i3 | 14376960;
        if ((100663296 & i) == 0) {
            if (tj3Var.m22124i(zi3Var)) {
                i5 = 67108864;
            } else {
                i5 = 33554432;
            }
            i4 |= i5;
        }
        if ((38347923 & i4) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (tj3Var.m22099R(i4 & 1, z2)) {
            if (i6 != 0) {
                e16Var4 = b16.f7762a;
            } else {
                e16Var4 = e16Var2;
            }
            faaVarM15045g = kaa.m15045g(c0252k0.f3549b, "tooltip transition", tj3Var, 48);
            objM22097O = tj3Var.m22097O();
            p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(null);
                tj3Var.m22131l0(objM22097O);
            }
            t66Var = (t66) objM22097O;
            objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                new un7(26, t66Var);
                objM22097O2 = new v6a();
                tj3Var.m22131l0(objM22097O2);
            }
            v6a v6aVar2 = (v6a) objM22097O2;
            C0282a c0282aM4703P2 = ci8.m4703P(-23901870, new eq8(24, t66Var, zi3Var), tj3Var);
            objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = AbstractC0278f.m1260j(null);
                tj3Var.m22131l0(objM22097O3);
            }
            t66Var2 = (t66) objM22097O3;
            objM22097O4 = tj3Var.m22097O();
            if (objM22097O4 == p84Var) {
                objM22097O4 = AbstractC0278f.m1254d(new zy0(t66Var, t66Var2, 3));
                tj3Var.m22131l0(objM22097O4);
            }
            dh9 dh9Var2 = (dh9) objM22097O4;
            l43 l43VarM21705c2 = ss5.m21705c0(MotionSchemeKeyTokens.FastSpatial, tj3Var);
            l43 l43VarM21705c3 = ss5.m21705c0(MotionSchemeKeyTokens.FastEffects, tj3Var);
            jda jdaVar2 = pk9.f56363h;
            if (faaVarM15045g.m11673g()) {
                tj3Var.m22111b0(1666573488);
                zM22120g6 = tj3Var.m22120g(faaVarM15045g);
                objM24111g = tj3Var.m22097O();
                if (zM22120g6) {
                    jc9VarM16139y2 = lda.m16139y();
                    if (jc9VarM16139y2 != null) {
                        vi3VarMo3163e2 = jc9VarM16139y2.mo3163e();
                    } else {
                        vi3VarMo3163e2 = null;
                    }
                    jc9VarM16106F2 = lda.m16106F(jc9VarM16139y2);
                    Object objM11669c3 = faaVarM15045g.m11669c();
                    lda.m16110J(jc9VarM16139y2, jc9VarM16106F2, vi3VarMo3163e2);
                    tj3Var.m22131l0(objM11669c3);
                    objM24111g = objM11669c3;
                } else {
                    jc9VarM16139y2 = lda.m16139y();
                    if (jc9VarM16139y2 != null) {
                        vi3VarMo3163e2 = jc9VarM16139y2.mo3163e();
                    } else {
                        vi3VarMo3163e2 = null;
                    }
                    jc9VarM16106F2 = lda.m16106F(jc9VarM16139y2);
                    Object objM11669c4 = faaVarM15045g.m11669c();
                    lda.m16110J(jc9VarM16139y2, jc9VarM16106F2, vi3VarMo3163e2);
                    tj3Var.m22131l0(objM11669c4);
                    objM24111g = objM11669c4;
                }
                z4 = false;
                tj3Var.m22139q(false);
            } else {
                z4 = false;
                objM24111g = wq1.m24111g(tj3Var, 1666827533, false, faaVarM15045g);
            }
            zBooleanValue = ((Boolean) objM24111g).booleanValue();
            tj3Var.m22111b0(838300572);
            if (zBooleanValue) {
                f = 1.0f;
            } else {
                f = 0.8f;
            }
            tj3Var.m22139q(z4);
            Float fValueOf5 = Float.valueOf(f);
            zM22120g = tj3Var.m22120g(faaVarM15045g);
            objM22097O5 = tj3Var.m22097O();
            if (zM22120g) {
                objM22097O5 = AbstractC0278f.m1254d(new sw5(faaVarM15045g, 22));
                tj3Var.m22131l0(objM22097O5);
            } else {
                objM22097O5 = AbstractC0278f.m1254d(new sw5(faaVarM15045g, 22));
                tj3Var.m22131l0(objM22097O5);
            }
            zBooleanValue2 = ((Boolean) ((dh9) objM22097O5).getValue()).booleanValue();
            tj3Var.m22111b0(838300572);
            if (zBooleanValue2) {
                f2 = 1.0f;
            } else {
                f2 = 0.8f;
            }
            tj3Var.m22139q(false);
            Float fValueOf6 = Float.valueOf(f2);
            zM22120g2 = tj3Var.m22120g(faaVarM15045g);
            objM22097O6 = tj3Var.m22097O();
            if (zM22120g2) {
                objM22097O6 = AbstractC0278f.m1254d(new sw5(faaVarM15045g, 23));
                tj3Var.m22131l0(objM22097O6);
            } else {
                objM22097O6 = AbstractC0278f.m1254d(new sw5(faaVarM15045g, 23));
                tj3Var.m22131l0(objM22097O6);
            }
            tj3Var.m22111b0(-1664496585);
            tj3Var.m22139q(false);
            baa baaVarM15041c2 = kaa.m15041c(faaVarM15045g, fValueOf5, fValueOf6, l43VarM21705c2, jdaVar2, tj3Var, 196608);
            if (faaVarM15045g.m11673g()) {
                tj3Var.m22111b0(1666573488);
                zM22120g5 = tj3Var.m22120g(faaVarM15045g);
                objM24111g2 = tj3Var.m22097O();
                if (zM22120g5) {
                    jc9VarM16139y = lda.m16139y();
                    if (jc9VarM16139y != null) {
                        vi3VarMo3163e = jc9VarM16139y.mo3163e();
                    } else {
                        vi3VarMo3163e = null;
                    }
                    jc9VarM16106F = lda.m16106F(jc9VarM16139y);
                    Object objM11669c5 = faaVarM15045g.m11669c();
                    lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                    tj3Var.m22131l0(objM11669c5);
                    objM24111g2 = objM11669c5;
                } else {
                    jc9VarM16139y = lda.m16139y();
                    if (jc9VarM16139y != null) {
                        vi3VarMo3163e = jc9VarM16139y.mo3163e();
                    } else {
                        vi3VarMo3163e = null;
                    }
                    jc9VarM16106F = lda.m16106F(jc9VarM16139y);
                    Object objM11669c6 = faaVarM15045g.m11669c();
                    lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                    tj3Var.m22131l0(objM11669c6);
                    objM24111g2 = objM11669c6;
                }
                z5 = false;
                tj3Var.m22139q(false);
            } else {
                z5 = false;
                objM24111g2 = wq1.m24111g(tj3Var, 1666827533, false, faaVarM15045g);
            }
            zBooleanValue3 = ((Boolean) objM24111g2).booleanValue();
            tj3Var.m22111b0(-1903393104);
            if (zBooleanValue3) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            tj3Var.m22139q(z5);
            Float fValueOf7 = Float.valueOf(f3);
            zM22120g3 = tj3Var.m22120g(faaVarM15045g);
            objM22097O7 = tj3Var.m22097O();
            if (zM22120g3) {
                objM22097O7 = AbstractC0278f.m1254d(new sw5(faaVarM15045g, 24));
                tj3Var.m22131l0(objM22097O7);
            } else {
                objM22097O7 = AbstractC0278f.m1254d(new sw5(faaVarM15045g, 24));
                tj3Var.m22131l0(objM22097O7);
            }
            boolean zBooleanValue5 = ((Boolean) ((dh9) objM22097O7).getValue()).booleanValue();
            tj3Var.m22111b0(-1903393104);
            if (zBooleanValue5) {
            }
            tj3Var.m22139q(z5);
            Float fValueOf8 = Float.valueOf(f4);
            zM22120g4 = tj3Var.m22120g(faaVarM15045g);
            objM22097O8 = tj3Var.m22097O();
            if (zM22120g4) {
                objM22097O8 = AbstractC0278f.m1254d(new sw5(faaVarM15045g, 25));
                tj3Var.m22131l0(objM22097O8);
            } else {
                objM22097O8 = AbstractC0278f.m1254d(new sw5(faaVarM15045g, 25));
                tj3Var.m22131l0(objM22097O8);
            }
            tj3Var.m22111b0(-111222965);
            tj3Var.m22139q(z5);
            m4d.m16628a(ph7Var2, ci8.m4703P(-527401546, new zs0(t66Var2, baaVarM15041c2, kaa.m15041c(faaVarM15045g, fValueOf7, fValueOf8, l43VarM21705c3, jdaVar2, tj3Var, 196608), dh9Var2, c0282a, v6aVar2, 8), tj3Var), c0252k0, e16Var4, c0282aM4703P2, tj3Var, (i4 & 14) | 100663344 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (i4 & 29360128));
            e16Var3 = e16Var4;
            z3 = true;
        } else {
            tj3Var.m22102U();
            e16Var3 = e16Var2;
            z3 = z;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new a65(ph7Var, c0282a, c0252k0, e16Var3, z3, zi3Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C0252k0 m21132c(ye1 ye1Var) {
        C0145m c0145m = ob0.f54125a;
        boolean zM22122h = ((tj3) ye1Var).m22122h(false) | ((tj3) ye1Var).m22120g(c0145m);
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        if (zM22122h || objM22097O == we1.f66679a) {
            objM22097O = new C0252k0(c0145m);
            tj3Var.m22131l0(objM22097O);
        }
        return (C0252k0) objM22097O;
    }
}
