package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.onboarding.auth.registration.C2196e;
import p000.lda;
import p000.ux5;
import p000.wfb;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oxb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f55157a = new C0282a(-46956295, false, new td1(24));

    /* JADX INFO: renamed from: b */
    public static final C0282a f55158b = new C0282a(-433372446, false, new td1(25));

    /* JADX INFO: renamed from: a */
    public static final void m18562a(t66 t66Var, zi3 zi3Var, i48 i48Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(122754293);
        int i2 = i | (tj3Var2.m22120g(t66Var) ? 4 : 2) | (tj3Var2.m22124i(zi3Var) ? 32 : 16) | (tj3Var2.m22124i(i48Var) ? 256 : 128);
        int i3 = 0;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            String str = (String) t66Var.getValue();
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            hj4 hj4Var = new hj4(6, 0, null, 123);
            boolean z = i48Var.f43519b != 0;
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objM22097O = tj3Var2.m22097O();
            if (z2 || objM22097O == we1.f66679a) {
                objM22097O = new jw6(t66Var, zi3Var, 0);
                tj3Var2.m22131l0(objM22097O);
            }
            tj3Var = tj3Var2;
            bna.m3942c(str, (vi3) objM22097O, e16VarM4412e, false, null, q3c.f57226j, null, null, null, null, ci8.m4703P(1786693358, new kw6(i48Var, i3), tj3Var2), z, null, hj4Var, null, true, 0, 0, null, null, tj3Var, 1573248, 12779904, 8212408);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new lw6(t66Var, zi3Var, i48Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m18563b(t66 t66Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-89259620);
        int i2 = (tj3Var2.m22120g(t66Var) ? 4 : 2) | i;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 3) != 2)) {
            String str = (String) t66Var.getValue();
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            boolean z = (i2 & 14) == 4;
            Object objM22097O = tj3Var2.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new dt6(5, t66Var);
                tj3Var2.m22131l0(objM22097O);
            }
            tj3Var = tj3Var2;
            bna.m3942c(str, (vi3) objM22097O, e16VarM4412e, false, null, q3c.f57224h, null, null, null, null, q3c.f57225i, false, null, null, null, true, 0, 0, null, null, tj3Var, 1573248, 12583296, 8253368);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C0812bj(t66Var, i, 7);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m18564c(C2196e c2196e, ui3 ui3Var, ui3 ui3Var2, vi3 vi3Var, ye1 ye1Var, int i) {
        final C2196e c2196e2;
        int i2;
        ui3Var.getClass();
        ui3Var2.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1454890554);
        int i3 = i | 2 | (tj3Var.m22124i(ui3Var) ? 32 : 16) | (tj3Var.m22124i(ui3Var2) ? 256 : 128) | (tj3Var.m22124i(vi3Var) ? 2048 : 1024);
        if (tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    c2196e2 = (C2196e) pfa.m19114d(y38.m24933a(C2196e.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                    i2 = i3 & (-15);
                }
            } else {
                tj3Var.m22102U();
                i2 = i3 & (-15);
                c2196e2 = c2196e;
            }
            tj3Var.m22140r();
            ym5 ym5Var = c2196e2.m9124V2().f41784b;
            if (ym5Var instanceof xm5) {
                g48 g48Var = (g48) ((xm5) ym5Var).f68348a;
                vi3Var.invoke(new ei6(g48Var.f40185a, g48Var.f40186b, g48Var.f40187c));
            }
            h48 h48VarM9124V2 = c2196e2.m9124V2();
            int i4 = i2 & 7168;
            boolean z = i4 == 2048;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z || objM22097O == p84Var) {
                objM22097O = new et6(vi3Var, 7);
                tj3Var.m22131l0(objM22097O);
            }
            ui3 ui3Var3 = (ui3) objM22097O;
            boolean zM22124i = tj3Var.m22124i(c2196e2);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                objM22097O2 = new cj3() { // from class: com.lingq.feature.onboarding.auth.registration.d
                    @Override // p000.cj3
                    /* JADX INFO: renamed from: i */
                    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        String str = (String) obj;
                        String str2 = (String) obj2;
                        String str3 = (String) obj3;
                        String str4 = (String) obj4;
                        String str5 = (String) obj5;
                        ux5.m22975B(str, str2, str3, str4, str5);
                        C2196e c2196e3 = c2196e2;
                        wfb.m23926u(lda.m16103C(c2196e3), null, null, new OnboardingRegistrationViewModel$register$1(c2196e3, str5, str, str3, str2, str4, null), 3);
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O2);
            }
            cj3 cj3Var = (cj3) objM22097O2;
            boolean zM22124i2 = tj3Var.m22124i(c2196e2);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O3 == p84Var) {
                objM22097O3 = new ht6(c2196e2, 5);
                tj3Var.m22131l0(objM22097O3);
            }
            zi3 zi3Var = (zi3) objM22097O3;
            boolean z2 = (i2 & 896) == 256;
            Object objM22097O4 = tj3Var.m22097O();
            if (z2 || objM22097O4 == p84Var) {
                objM22097O4 = new xa0(19, ui3Var2);
                tj3Var.m22131l0(objM22097O4);
            }
            ui3 ui3Var4 = (ui3) objM22097O4;
            boolean z3 = (i2 & 112) == 32;
            Object objM22097O5 = tj3Var.m22097O();
            if (z3 || objM22097O5 == p84Var) {
                objM22097O5 = new xa0(21, ui3Var);
                tj3Var.m22131l0(objM22097O5);
            }
            ui3 ui3Var5 = (ui3) objM22097O5;
            boolean z4 = i4 == 2048;
            Object objM22097O6 = tj3Var.m22097O();
            if (z4 || objM22097O6 == p84Var) {
                objM22097O6 = new et6(vi3Var, 10);
                tj3Var.m22131l0(objM22097O6);
            }
            ui3 ui3Var6 = (ui3) objM22097O6;
            boolean z5 = i4 == 2048;
            Object objM22097O7 = tj3Var.m22097O();
            if (z5 || objM22097O7 == p84Var) {
                objM22097O7 = new i75(vi3Var, 17);
                tj3Var.m22131l0(objM22097O7);
            }
            m18565d(h48VarM9124V2, ui3Var3, cj3Var, zi3Var, ui3Var4, ui3Var5, ui3Var6, (vi3) objM22097O7, tj3Var, 0, 0);
            tj3Var = tj3Var;
        } else {
            tj3Var.m22102U();
            c2196e2 = c2196e;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2919d9((Object) c2196e2, ui3Var, ui3Var2, (Object) vi3Var, i, 22);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m18565d(final h48 h48Var, ui3 ui3Var, cj3 cj3Var, zi3 zi3Var, ui3 ui3Var2, ui3 ui3Var3, ui3 ui3Var4, vi3 vi3Var, ye1 ye1Var, int i, int i2) {
        ui3 ui3Var5;
        int i3;
        cj3 cj3Var2;
        int i4;
        zi3 zi3Var2;
        int i5;
        ui3 ui3Var6;
        int i6;
        int i7;
        int i8;
        int i9;
        tj3 tj3Var;
        ui3 ui3Var7;
        vi3 vi3Var2;
        ui3 ui3Var8;
        cj3 cj3Var3;
        ui3 ui3Var9;
        ui3 ui3Var10;
        final cj3 cj3Var4;
        final zi3 zi3Var3;
        final ui3 ui3Var11;
        final ui3 ui3Var12;
        final ui3 ui3Var13;
        final vi3 vi3Var3;
        h48Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(635887080);
        int i10 = i | (tj3Var2.m22124i(h48Var) ? 4 : 2);
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 = i10 | 48;
            ui3Var5 = ui3Var;
        } else {
            ui3Var5 = ui3Var;
            i3 = i10 | (tj3Var2.m22124i(ui3Var5) ? 32 : 16);
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i4 = i3 | 384;
            cj3Var2 = cj3Var;
        } else {
            cj3Var2 = cj3Var;
            i4 = i3 | (tj3Var2.m22124i(cj3Var2) ? 256 : 128);
        }
        int i13 = i2 & 8;
        if (i13 != 0) {
            i5 = i4 | 3072;
            zi3Var2 = zi3Var;
        } else {
            zi3Var2 = zi3Var;
            i5 = i4 | (tj3Var2.m22124i(zi3Var2) ? 2048 : 1024);
        }
        int i14 = i2 & 16;
        if (i14 != 0) {
            i6 = i5 | 24576;
            ui3Var6 = ui3Var2;
        } else {
            ui3Var6 = ui3Var2;
            i6 = i5 | (tj3Var2.m22124i(ui3Var6) ? 16384 : 8192);
        }
        int i15 = i2 & 32;
        if (i15 != 0) {
            i7 = i6 | 196608;
        } else {
            i7 = i6 | (tj3Var2.m22124i(ui3Var3) ? 131072 : 65536);
        }
        int i16 = i2 & 64;
        if (i16 != 0) {
            i8 = i7 | 1572864;
        } else {
            i8 = i7 | (tj3Var2.m22124i(ui3Var4) ? 1048576 : 524288);
        }
        int i17 = i2 & 128;
        if (i17 != 0) {
            i9 = i8 | 12582912;
        } else {
            i9 = i8 | (tj3Var2.m22124i(vi3Var) ? 8388608 : 4194304);
        }
        if (tj3Var2.m22099R(i9 & 1, (i9 & 4793491) != 4793490)) {
            p84 p84Var = we1.f66679a;
            if (i11 != 0) {
                Object objM22097O = tj3Var2.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = new C3288l7(7);
                    tj3Var2.m22131l0(objM22097O);
                }
                ui3Var5 = (ui3) objM22097O;
            }
            if (i12 != 0) {
                Object objM22097O2 = tj3Var2.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = new iw6(0);
                    tj3Var2.m22131l0(objM22097O2);
                }
                cj3Var4 = (cj3) objM22097O2;
            } else {
                cj3Var4 = cj3Var2;
            }
            if (i13 != 0) {
                Object objM22097O3 = tj3Var2.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = new yu4(19);
                    tj3Var2.m22131l0(objM22097O3);
                }
                zi3Var3 = (zi3) objM22097O3;
            } else {
                zi3Var3 = zi3Var2;
            }
            if (i14 != 0) {
                Object objM22097O4 = tj3Var2.m22097O();
                if (objM22097O4 == p84Var) {
                    objM22097O4 = new C3288l7(7);
                    tj3Var2.m22131l0(objM22097O4);
                }
                ui3Var11 = (ui3) objM22097O4;
            } else {
                ui3Var11 = ui3Var6;
            }
            if (i15 != 0) {
                Object objM22097O5 = tj3Var2.m22097O();
                if (objM22097O5 == p84Var) {
                    objM22097O5 = new C3288l7(7);
                    tj3Var2.m22131l0(objM22097O5);
                }
                ui3Var12 = (ui3) objM22097O5;
            } else {
                ui3Var12 = ui3Var3;
            }
            if (i16 != 0) {
                Object objM22097O6 = tj3Var2.m22097O();
                if (objM22097O6 == p84Var) {
                    objM22097O6 = new C3288l7(7);
                    tj3Var2.m22131l0(objM22097O6);
                }
                ui3Var13 = (ui3) objM22097O6;
            } else {
                ui3Var13 = ui3Var4;
            }
            if (i17 != 0) {
                Object objM22097O7 = tj3Var2.m22097O();
                if (objM22097O7 == p84Var) {
                    objM22097O7 = new lz5(20);
                    tj3Var2.m22131l0(objM22097O7);
                }
                vi3Var3 = (vi3) objM22097O7;
            } else {
                vi3Var3 = vi3Var;
            }
            Object[] objArr = new Object[0];
            Object objM22097O8 = tj3Var2.m22097O();
            if (objM22097O8 == p84Var) {
                objM22097O8 = new tx5(11);
                tj3Var2.m22131l0(objM22097O8);
            }
            final t66 t66Var = (t66) xwc.m24745R(objArr, (ui3) objM22097O8, tj3Var2, 48);
            Object[] objArr2 = new Object[0];
            Object objM22097O9 = tj3Var2.m22097O();
            if (objM22097O9 == p84Var) {
                objM22097O9 = new tx5(12);
                tj3Var2.m22131l0(objM22097O9);
            }
            final t66 t66Var2 = (t66) xwc.m24745R(objArr2, (ui3) objM22097O9, tj3Var2, 48);
            Object[] objArr3 = new Object[0];
            Object objM22097O10 = tj3Var2.m22097O();
            if (objM22097O10 == p84Var) {
                objM22097O10 = new tx5(13);
                tj3Var2.m22131l0(objM22097O10);
            }
            final t66 t66Var3 = (t66) xwc.m24745R(objArr3, (ui3) objM22097O10, tj3Var2, 48);
            Object[] objArr4 = new Object[0];
            Object objM22097O11 = tj3Var2.m22097O();
            if (objM22097O11 == p84Var) {
                objM22097O11 = new tx5(14);
                tj3Var2.m22131l0(objM22097O11);
            }
            final t66 t66Var4 = (t66) xwc.m24745R(objArr4, (ui3) objM22097O11, tj3Var2, 48);
            Object[] objArr5 = new Object[0];
            Object objM22097O12 = tj3Var2.m22097O();
            if (objM22097O12 == p84Var) {
                objM22097O12 = new tx5(15);
                tj3Var2.m22131l0(objM22097O12);
            }
            final t66 t66Var5 = (t66) xwc.m24745R(objArr5, (ui3) objM22097O12, tj3Var2, 48);
            Object[] objArr6 = new Object[0];
            Object objM22097O13 = tj3Var2.m22097O();
            if (objM22097O13 == p84Var) {
                objM22097O13 = new tx5(8);
                tj3Var2.m22131l0(objM22097O13);
            }
            final t66 t66Var6 = (t66) xwc.m24745R(objArr6, (ui3) objM22097O13, tj3Var2, 48);
            Object[] objArr7 = new Object[0];
            Object objM22097O14 = tj3Var2.m22097O();
            if (objM22097O14 == p84Var) {
                objM22097O14 = new tx5(9);
                tj3Var2.m22131l0(objM22097O14);
            }
            final t66 t66Var7 = (t66) xwc.m24745R(objArr7, (ui3) objM22097O14, tj3Var2, 48);
            Object[] objArr8 = new Object[0];
            Object objM22097O15 = tj3Var2.m22097O();
            if (objM22097O15 == p84Var) {
                objM22097O15 = new tx5(10);
                tj3Var2.m22131l0(objM22097O15);
            }
            final t66 t66Var8 = (t66) xwc.m24745R(objArr8, (ui3) objM22097O15, tj3Var2, 48);
            zi3Var2 = zi3Var3;
            tj3Var = tj3Var2;
            b34.m3232b(null, ci8.m4703P(-1432131668, new lo6(ui3Var5, t66Var2, t66Var, 4), tj3Var2), null, null, null, 0, 0L, 0L, null, ci8.m4703P(-1044483017, new aj3() { // from class: hw6
                /* JADX WARN: Code duplicated, block: B:101:0x060f  */
                /* JADX WARN: Code duplicated, block: B:34:0x016f  */
                /* JADX WARN: Code duplicated, block: B:89:0x056a  */
                /* JADX WARN: Code duplicated, block: B:93:0x0582  */
                /* JADX WARN: Code duplicated, block: B:96:0x059c  */
                /* JADX WARN: Code duplicated, block: B:98:0x05d4  */
                /* JADX WARN: Code duplicated, block: B:99:0x05d8  */
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    zi3 zi3Var4;
                    p84 p84Var2;
                    zi3 zi3Var5;
                    vi3 vi3Var4;
                    tj3 tj3Var3;
                    boolean z;
                    ci0 ci0Var;
                    mv3 mv3Var;
                    gc0 gc0Var;
                    p84 p84Var3;
                    vi3 vi3Var5;
                    boolean zM22120g;
                    Object objM22097O16;
                    boolean zM22120g2;
                    Object objM22097O17;
                    boolean z2;
                    mv3 mv3Var2 = ss5.f61356d;
                    t17 t17Var = (t17) obj;
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    gc0 gc0Var2 = nj0.f52812g;
                    t17Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((tj3) ye1Var2).m22120g(t17Var) ? 4 : 2;
                    }
                    tj3 tj3Var4 = (tj3) ye1Var2;
                    if (tj3Var4.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                        b16 b16Var = b16.f7762a;
                        e16 e16VarM21606S = AbstractC3584sr.m21606S(l70.m15962y(b16Var), t17Var);
                        gc0 gc0Var3 = nj0.f52808c;
                        ht5 ht5VarM19966d = qh0.m19966d(gc0Var3, false);
                        int iHashCode = Long.hashCode(tj3Var4.f62385T);
                        l77 l77VarM22132m = tj3Var4.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var4, e16VarM21606S);
                        se1.f60731q.getClass();
                        ui3 ui3Var14 = C0352b.f4299b;
                        tj3Var4.m22119f0();
                        if (tj3Var4.f62384S) {
                            tj3Var4.m22130l(ui3Var14);
                        } else {
                            tj3Var4.m22137o0();
                        }
                        zi3 zi3Var6 = C0352b.f4303f;
                        oha.m18001g(tj3Var4, zi3Var6, ht5VarM19966d);
                        zi3 zi3Var7 = C0352b.f4302e;
                        oha.m18001g(tj3Var4, zi3Var7, l77VarM22132m);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        zi3 zi3Var8 = C0352b.f4304g;
                        oha.m18001g(tj3Var4, zi3Var8, numValueOf);
                        vi3 vi3Var6 = C0352b.f4305h;
                        oha.m18000f(tj3Var4, vi3Var6);
                        zi3 zi3Var9 = C0352b.f4301d;
                        oha.m18001g(tj3Var4, zi3Var9, e16VarM1322c);
                        e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
                        C3587su c3587su = eh0.f37238d;
                        ec0 ec0Var = nj0.f52791J;
                        bb1 bb1VarM230a = ab1.m230a(c3587su, ec0Var, tj3Var4, 0);
                        int iHashCode2 = Long.hashCode(tj3Var4.f62385T);
                        l77 l77VarM22132m2 = tj3Var4.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var4, e16VarM4411d);
                        tj3Var4.m22119f0();
                        if (tj3Var4.f62384S) {
                            tj3Var4.m22130l(ui3Var14);
                        } else {
                            tj3Var4.m22137o0();
                        }
                        oha.m18001g(tj3Var4, zi3Var6, bb1VarM230a);
                        oha.m18001g(tj3Var4, zi3Var7, l77VarM22132m2);
                        AbstractC3393o1.m17747v(iHashCode2, tj3Var4, zi3Var8, tj3Var4, vi3Var6);
                        oha.m18001g(tj3Var4, zi3Var9, e16VarM1322c2);
                        e16 e16VarM21610W = AbstractC3584sr.m21610W(c99.m4411d(b16Var, 1.0f), ge9.m12515a(tj3Var4).f38960i, ge9.m12515a(tj3Var4).f38963l, ge9.m12515a(tj3Var4).f38960i, ge9.m12515a(tj3Var4).f38963l);
                        bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var4, 0);
                        int iHashCode3 = Long.hashCode(tj3Var4.f62385T);
                        l77 l77VarM22132m3 = tj3Var4.m22132m();
                        e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var4, e16VarM21610W);
                        tj3Var4.m22119f0();
                        if (tj3Var4.f62384S) {
                            tj3Var4.m22130l(ui3Var14);
                        } else {
                            tj3Var4.m22137o0();
                        }
                        oha.m18001g(tj3Var4, zi3Var6, bb1VarM230a2);
                        oha.m18001g(tj3Var4, zi3Var7, l77VarM22132m3);
                        AbstractC3393o1.m17747v(iHashCode3, tj3Var4, zi3Var8, tj3Var4, vi3Var6);
                        oha.m18001g(tj3Var4, zi3Var9, e16VarM1322c3);
                        t66 t66Var9 = t66Var;
                        boolean zBooleanValue = ((Boolean) t66Var9.getValue()).booleanValue();
                        h48 h48Var2 = h48Var;
                        t66 t66Var10 = t66Var5;
                        zi3 zi3Var10 = zi3Var3;
                        p84 p84Var4 = we1.f66679a;
                        if (zBooleanValue) {
                            zi3Var4 = zi3Var7;
                            ui3Var14 = ui3Var14;
                            tj3Var4.m22111b0(-231963152);
                            i48 i48Var = (i48) pk9.m19372j(h48Var2.f41785c, new i48(0, 0, 3));
                            oxb.m18562a(t66Var10, zi3Var10, i48Var, tj3Var4, 0);
                            t66 t66Var11 = t66Var6;
                            oxb.m18563b(t66Var11, tj3Var4, 0);
                            i48 i48Var2 = (i48) pk9.m19372j(h48Var2.f41785c, new i48(0, 0, 3));
                            t66 t66Var12 = t66Var3;
                            oxb.m18568g(t66Var12, zi3Var10, i48Var2, tj3Var4, 0);
                            i48 i48Var3 = new i48(0, 0, 3);
                            t66 t66Var13 = t66Var4;
                            oxb.m18566e(t66Var13, t66Var8, i48Var3, tj3Var4, 0);
                            boolean zBooleanValue2 = ((Boolean) t66Var2.getValue()).booleanValue();
                            t66 t66Var14 = t66Var7;
                            if (zBooleanValue2) {
                                tj3Var4.m22111b0(-231132383);
                                oxb.m18567f(t66Var14, tj3Var4, 0);
                                tj3Var4.m22139q(false);
                            } else {
                                tj3Var4.m22111b0(-231043971);
                                tj3Var4.m22139q(false);
                            }
                            e16 e16VarM22984g = ux5.m22984g(b16Var, ge9.m12515a(tj3Var4).f38952a, tj3Var4, b16Var, 1.0f);
                            boolean z3 = ((CharSequence) t66Var12.getValue()).length() > 0 && ((CharSequence) t66Var13.getValue()).length() > 0 && ((CharSequence) t66Var10.getValue()).length() > 0 && ((CharSequence) t66Var11.getValue()).length() > 0 && i48Var.f43518a == 0 && i48Var.f43519b == 0;
                            cj3 cj3Var5 = cj3Var4;
                            boolean zM22120g3 = tj3Var4.m22120g(cj3Var5) | tj3Var4.m22120g(t66Var12) | tj3Var4.m22120g(t66Var13) | tj3Var4.m22120g(t66Var10) | tj3Var4.m22120g(t66Var11) | tj3Var4.m22120g(t66Var14);
                            boolean z4 = z3;
                            Object objM22097O18 = tj3Var4.m22097O();
                            if (zM22120g3 || objM22097O18 == p84Var4) {
                                objM22097O18 = new qx0(cj3Var5, t66Var12, t66Var13, t66Var10, t66Var11, t66Var14);
                                tj3Var4.m22131l0(objM22097O18);
                            }
                            p84Var2 = p84Var4;
                            zi3Var5 = zi3Var8;
                            vi3Var4 = vi3Var6;
                            ss5.m21710f(e16VarM22984g, null, null, z4, (ui3) objM22097O18, q3c.f57221e, tj3Var4, 196614, 6);
                            tj3Var3 = tj3Var4;
                            z = false;
                            tj3Var3.m22139q(false);
                        } else {
                            tj3Var4.m22111b0(-233014362);
                            oxb.m18562a(t66Var10, zi3Var10, (i48) pk9.m19372j(h48Var2.f41785c, new i48(0, 0, 3)), tj3Var4, 0);
                            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                            if (((CharSequence) t66Var10.getValue()).length() > 0) {
                                ym5 ym5Var = h48Var2.f41785c;
                                ym5Var.getClass();
                                if (ym5Var instanceof xm5) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z2 = false;
                            }
                            boolean zM22120g4 = tj3Var4.m22120g(t66Var9);
                            Object objM22097O19 = tj3Var4.m22097O();
                            if (zM22120g4 || objM22097O19 == p84Var4) {
                                objM22097O19 = new do4(15, t66Var9);
                                tj3Var4.m22131l0(objM22097O19);
                            }
                            p84Var2 = p84Var4;
                            zi3Var5 = zi3Var8;
                            zi3Var4 = zi3Var7;
                            ss5.m21710f(e16VarM4412e, null, null, z2, (ui3) objM22097O19, q3c.f57220d, tj3Var4, 196614, 6);
                            tj3Var3 = tj3Var4;
                            z = false;
                            ux5.m23003z(b16Var, ge9.m12515a(tj3Var3).f38957f, tj3Var3, false);
                            vi3Var4 = vi3Var6;
                        }
                        boolean zBooleanValue3 = ((Boolean) t66Var9.getValue()).booleanValue();
                        ci0 ci0Var2 = ci0.f10109a;
                        if (zBooleanValue3) {
                            ci0Var = ci0Var2;
                            mv3Var = mv3Var2;
                            gc0Var = gc0Var2;
                            tj3Var3.m22111b0(-227863619);
                            tj3Var3.m22139q(z);
                        } else {
                            tj3Var3.m22111b0(-229695285);
                            e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                            ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var3, z);
                            int iHashCode4 = Long.hashCode(tj3Var3.f62385T);
                            l77 l77VarM22132m4 = tj3Var3.m22132m();
                            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e2);
                            tj3Var3.m22119f0();
                            if (tj3Var3.f62384S) {
                                tj3Var3.m22130l(ui3Var14);
                            } else {
                                tj3Var3.m22137o0();
                            }
                            oha.m18001g(tj3Var3, zi3Var6, ht5VarM19966d2);
                            oha.m18001g(tj3Var3, zi3Var4, l77VarM22132m4);
                            AbstractC3393o1.m17747v(iHashCode4, tj3Var3, zi3Var5, tj3Var3, vi3Var4);
                            oha.m18001g(tj3Var3, zi3Var9, e16VarM1322c4);
                            tj3 tj3Var5 = tj3Var3;
                            ci0Var = ci0Var2;
                            pb1.m19031a(1.0f, 48, 4, 0L, tj3Var5, ci0Var2.mo3727a(c99.m4412e(b16Var, 1.0f), gc0Var2));
                            gc0Var = gc0Var2;
                            mv3Var = mv3Var2;
                            lw9.m16554b(vz1.m23620a0(tj3Var5, R$string.onboarding_social_or), AbstractC3584sr.m21609V(d32.m10007D(ci0Var.mo3727a(b16Var, gc0Var2), p58.m18900f(tj3Var5).f55868n, mv3Var), ge9.m12515a(tj3Var5).f38952a, 0.0f, 2), p58.m18900f(tj3Var5).f55858i, null, 0L, null, null, 0L, null, ks9.m15662a(), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var5).f71407k, tj3Var5, 0, 0, 130040);
                            tj3Var5.m22139q(true);
                            e16 e16VarM22984g2 = ux5.m22984g(b16Var, ge9.m12515a(tj3Var5).f38952a, tj3Var5, b16Var, 1.0f);
                            bb1 bb1VarM230a3 = ab1.m230a(c3587su, nj0.f52792K, tj3Var5, 48);
                            int iHashCode5 = Long.hashCode(tj3Var5.f62385T);
                            l77 l77VarM22132m5 = tj3Var5.m22132m();
                            e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var5, e16VarM22984g2);
                            tj3Var5.m22119f0();
                            if (tj3Var5.f62384S) {
                                tj3Var5.m22130l(ui3Var14);
                            } else {
                                tj3Var5.m22137o0();
                            }
                            oha.m18001g(tj3Var5, zi3Var6, bb1VarM230a3);
                            oha.m18001g(tj3Var5, zi3Var4, l77VarM22132m5);
                            AbstractC3393o1.m17747v(iHashCode5, tj3Var5, zi3Var5, tj3Var5, vi3Var4);
                            oha.m18001g(tj3Var5, zi3Var9, e16VarM1322c5);
                            AbstractC3352my.m17116e(c99.m4412e(b16Var, 1.0f), com.lingq.feature.onboarding.R$string.onboarding_social_google, com.lingq.feature.onboarding.R$string.onboarding_social_facebook, ui3Var11, ui3Var12, tj3Var5, 6);
                            tj3Var3 = tj3Var5;
                            tj3Var3.m22139q(true);
                            tj3Var3.m22139q(false);
                        }
                        e16 e16VarM21609V = AbstractC3584sr.m21609V(ux5.m22984g(b16Var, ge9.m12515a(tj3Var3).f38962k, tj3Var3, b16Var, 1.0f), 0.0f, ge9.m12515a(tj3Var3).f38952a, 1);
                        sj8 sj8VarM20003a = qj8.m20003a(eh0.f37240f, nj0.f52817l, tj3Var3, 6);
                        int iHashCode6 = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m6 = tj3Var3.m22132m();
                        e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var3, e16VarM21609V);
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var14);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, zi3Var6, sj8VarM20003a);
                        oha.m18001g(tj3Var3, zi3Var4, l77VarM22132m6);
                        AbstractC3393o1.m17747v(iHashCode6, tj3Var3, zi3Var5, tj3Var3, vi3Var4);
                        oha.m18001g(tj3Var3, zi3Var9, e16VarM1322c6);
                        tj3 tj3Var6 = tj3Var3;
                        lw9.m16554b(ux5.m22990m(vz1.m23620a0(tj3Var3, com.lingq.feature.onboarding.R$string.welcome_already_signed_up), " "), null, 0L, null, 0L, null, null, 0L, null, ks9.m15662a(), 0L, 0, false, 0, 0, null, vx9.m23584b(p58.m18902j(tj3Var3).f71409m, 0L, 0L, bc3.f8321g, null, null, 0L, null, null, 0, 0L, null, 16777211), tj3Var6, 0, 0, 130046);
                        String strM23620a0 = vz1.m23620a0(tj3Var6, com.lingq.feature.onboarding.R$string.welcome_log_in_button);
                        vx9 vx9VarM23584b = vx9.m23584b(p58.m18902j(tj3Var6).f71409m, 0L, 0L, null, null, null, 0L, rt9.f59802c, null, 0, 0L, null, 16773119);
                        ui3 ui3Var15 = ui3Var13;
                        boolean zM22120g5 = tj3Var6.m22120g(ui3Var15);
                        Object objM22097O20 = tj3Var6.m22097O();
                        if (zM22120g5) {
                            p84Var3 = p84Var2;
                        } else {
                            p84Var3 = p84Var2;
                            if (objM22097O20 == p84Var3) {
                            }
                            p84 p84Var5 = p84Var3;
                            lw9.m16554b(strM23620a0, AbstractC0080f.m815b(null, false, (ui3) objM22097O20, b16Var, 15), 0L, null, 0L, null, null, 0L, null, ks9.m15662a(), 0L, 0, false, 0, 0, null, vx9VarM23584b, tj3Var6, 0, 0, 130044);
                            AbstractC3393o1.m17723A(tj3Var6, true, true, true);
                            e16 e16VarM21611X = AbstractC3584sr.m21611X(ci0Var.mo3727a(c99.m4412e(b16Var, 1.0f), nj0.f52815j), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var6).f38963l, 7);
                            vi3Var5 = vi3Var3;
                            zM22120g = tj3Var6.m22120g(vi3Var5);
                            objM22097O16 = tj3Var6.m22097O();
                            if (zM22120g || objM22097O16 == p84Var5) {
                                objM22097O16 = new et6(vi3Var5, 8);
                                tj3Var6.m22131l0(objM22097O16);
                            }
                            ui3 ui3Var16 = (ui3) objM22097O16;
                            zM22120g2 = tj3Var6.m22120g(vi3Var5);
                            objM22097O17 = tj3Var6.m22097O();
                            if (zM22120g2 || objM22097O17 == p84Var5) {
                                objM22097O17 = new et6(vi3Var5, 9);
                                tj3Var6.m22131l0(objM22097O17);
                            }
                            te1.m21989c(e16VarM21611X, ui3Var16, (ui3) objM22097O17, tj3Var6, 0);
                            tj3Var6.m22139q(true);
                            if (h48Var2.f41783a) {
                                tj3Var6.m22111b0(852252276);
                                e16 e16VarM10007D = d32.m10007D(c99.m4411d(b16Var, 1.0f), aa1.m198b(0.5f, p58.m18900f(tj3Var6).f55868n), mv3Var);
                                ht5 ht5VarM19966d3 = qh0.m19966d(gc0Var3, false);
                                int iHashCode7 = Long.hashCode(tj3Var6.f62385T);
                                l77 l77VarM22132m7 = tj3Var6.m22132m();
                                e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var6, e16VarM10007D);
                                tj3Var6.m22119f0();
                                if (tj3Var6.f62384S) {
                                    tj3Var6.m22130l(ui3Var14);
                                } else {
                                    tj3Var6.m22137o0();
                                }
                                oha.m18001g(tj3Var6, zi3Var6, ht5VarM19966d3);
                                oha.m18001g(tj3Var6, zi3Var4, l77VarM22132m7);
                                AbstractC3393o1.m17747v(iHashCode7, tj3Var6, zi3Var5, tj3Var6, vi3Var4);
                                oha.m18001g(tj3Var6, zi3Var9, e16VarM1322c7);
                                dn7.m10492a(ci0Var.mo3727a(b16Var, gc0Var), p58.m18900f(tj3Var6).f55860j, 0.0f, 0L, 0, 0.0f, tj3Var6, 0, 60);
                                tj3Var6.m22139q(true);
                                tj3Var6.m22139q(false);
                            } else {
                                tj3Var6.m22111b0(852643403);
                                tj3Var6.m22139q(false);
                            }
                        }
                        objM22097O20 = new xa0(18, ui3Var15);
                        tj3Var6.m22131l0(objM22097O20);
                        p84 p84Var6 = p84Var3;
                        lw9.m16554b(strM23620a0, AbstractC0080f.m815b(null, false, (ui3) objM22097O20, b16Var, 15), 0L, null, 0L, null, null, 0L, null, ks9.m15662a(), 0L, 0, false, 0, 0, null, vx9VarM23584b, tj3Var6, 0, 0, 130044);
                        AbstractC3393o1.m17723A(tj3Var6, true, true, true);
                        e16 e16VarM21611X2 = AbstractC3584sr.m21611X(ci0Var.mo3727a(c99.m4412e(b16Var, 1.0f), nj0.f52815j), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var6).f38963l, 7);
                        vi3Var5 = vi3Var3;
                        zM22120g = tj3Var6.m22120g(vi3Var5);
                        objM22097O16 = tj3Var6.m22097O();
                        if (zM22120g) {
                            objM22097O16 = new et6(vi3Var5, 8);
                            tj3Var6.m22131l0(objM22097O16);
                        } else {
                            objM22097O16 = new et6(vi3Var5, 8);
                            tj3Var6.m22131l0(objM22097O16);
                        }
                        ui3 ui3Var17 = (ui3) objM22097O16;
                        zM22120g2 = tj3Var6.m22120g(vi3Var5);
                        objM22097O17 = tj3Var6.m22097O();
                        if (zM22120g2) {
                            objM22097O17 = new et6(vi3Var5, 9);
                            tj3Var6.m22131l0(objM22097O17);
                        } else {
                            objM22097O17 = new et6(vi3Var5, 9);
                            tj3Var6.m22131l0(objM22097O17);
                        }
                        te1.m21989c(e16VarM21611X2, ui3Var17, (ui3) objM22097O17, tj3Var6, 0);
                        tj3Var6.m22139q(true);
                        if (h48Var2.f41783a) {
                            tj3Var6.m22111b0(852252276);
                            e16 e16VarM10007D2 = d32.m10007D(c99.m4411d(b16Var, 1.0f), aa1.m198b(0.5f, p58.m18900f(tj3Var6).f55868n), mv3Var);
                            ht5 ht5VarM19966d4 = qh0.m19966d(gc0Var3, false);
                            int iHashCode8 = Long.hashCode(tj3Var6.f62385T);
                            l77 l77VarM22132m8 = tj3Var6.m22132m();
                            e16 e16VarM1322c8 = AbstractC0287b.m1322c(tj3Var6, e16VarM10007D2);
                            tj3Var6.m22119f0();
                            if (tj3Var6.f62384S) {
                                tj3Var6.m22130l(ui3Var14);
                            } else {
                                tj3Var6.m22137o0();
                            }
                            oha.m18001g(tj3Var6, zi3Var6, ht5VarM19966d4);
                            oha.m18001g(tj3Var6, zi3Var4, l77VarM22132m8);
                            AbstractC3393o1.m17747v(iHashCode8, tj3Var6, zi3Var5, tj3Var6, vi3Var4);
                            oha.m18001g(tj3Var6, zi3Var9, e16VarM1322c8);
                            dn7.m10492a(ci0Var.mo3727a(b16Var, gc0Var), p58.m18900f(tj3Var6).f55860j, 0.0f, 0L, 0, 0.0f, tj3Var6, 0, 60);
                            tj3Var6.m22139q(true);
                            tj3Var6.m22139q(false);
                        } else {
                            tj3Var6.m22111b0(852643403);
                            tj3Var6.m22139q(false);
                        }
                    } else {
                        tj3Var4.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var2), tj3Var, 805306416, 509);
            ui3Var7 = ui3Var12;
            cj3Var3 = cj3Var4;
            vi3Var2 = vi3Var3;
            ui3Var8 = ui3Var5;
            ui3Var10 = ui3Var13;
            ui3Var9 = ui3Var11;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            ui3Var7 = ui3Var3;
            vi3Var2 = vi3Var;
            ui3Var8 = ui3Var5;
            cj3Var3 = cj3Var2;
            ui3Var9 = ui3Var6;
            ui3Var10 = ui3Var4;
        }
        zi3 zi3Var4 = zi3Var2;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new xs0(h48Var, ui3Var8, cj3Var3, zi3Var4, ui3Var9, ui3Var7, ui3Var10, vi3Var2, i, i2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m18566e(t66 t66Var, t66 t66Var2, i48 i48Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-836950827);
        int i2 = i | (tj3Var2.m22120g(t66Var) ? 4 : 2) | (tj3Var2.m22120g(t66Var2) ? 32 : 16);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 19) != 18)) {
            String str = (String) t66Var.getValue();
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            kwa c57Var = ((Boolean) t66Var2.getValue()).booleanValue() ? g9c.f40432f : new c57();
            boolean z = (i2 & 14) == 4;
            Object objM22097O = tj3Var2.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new dt6(6, t66Var);
                tj3Var2.m22131l0(objM22097O);
            }
            tj3Var = tj3Var2;
            bna.m3942c(str, (vi3) objM22097O, e16VarM4412e, false, null, q3c.f57227k, null, null, ci8.m4703P(1165083582, new C0812bj(8, t66Var2), tj3Var2), null, q3c.f57228l, false, c57Var, null, null, true, 0, 0, null, null, tj3Var, 806879616, 12586368, 8228280);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new lo6(i, 5, t66Var, t66Var2, i48Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m18567f(t66 t66Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1926874397);
        int i2 = (tj3Var2.m22120g(t66Var) ? 4 : 2) | i;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 3) != 2)) {
            String str = (String) t66Var.getValue();
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            boolean z = (i2 & 14) == 4;
            Object objM22097O = tj3Var2.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new dt6(4, t66Var);
                tj3Var2.m22131l0(objM22097O);
            }
            tj3Var = tj3Var2;
            bna.m3942c(str, (vi3) objM22097O, e16VarM4412e, false, null, q3c.f57222f, null, null, null, null, q3c.f57223g, false, null, null, null, true, 0, 0, null, null, tj3Var, 1573248, 12583296, 8253368);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C0812bj(t66Var, i, 6);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m18568g(t66 t66Var, zi3 zi3Var, i48 i48Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        t66Var.getClass();
        zi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(853284959);
        int i2 = i | (tj3Var2.m22120g(t66Var) ? 4 : 2) | (tj3Var2.m22124i(zi3Var) ? 32 : 16) | (tj3Var2.m22124i(i48Var) ? 256 : 128);
        int i3 = 1;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            String str = (String) t66Var.getValue();
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            boolean z = i48Var.f43518a != 0;
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objM22097O = tj3Var2.m22097O();
            if (z2 || objM22097O == we1.f66679a) {
                objM22097O = new jw6(t66Var, zi3Var, 1);
                tj3Var2.m22131l0(objM22097O);
            }
            tj3Var = tj3Var2;
            bna.m3942c(str, (vi3) objM22097O, e16VarM4412e, false, null, q3c.f57229m, null, null, null, null, ci8.m4703P(-1250560058, new kw6(i48Var, i3), tj3Var2), z, null, null, null, true, 0, 0, null, null, tj3Var, 1573248, 12583296, 8245176);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new lw6(t66Var, zi3Var, i48Var, i, 1);
        }
    }
}
