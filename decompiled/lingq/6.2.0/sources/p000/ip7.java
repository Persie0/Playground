package p000;

import androidx.compose.animation.AbstractC0054a;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class ip7 {

    /* JADX INFO: renamed from: a */
    public static final ip7 f44401a = new ip7();

    /* JADX INFO: renamed from: b */
    public static final si8 f44402b = ui8.f63972a;

    /* JADX INFO: renamed from: c */
    public static final float f44403c = 80.0f;

    /* JADX INFO: renamed from: d */
    public static final float f44404d = 80.0f;

    /* JADX INFO: renamed from: e */
    public static final float f44405e = 3.0f;

    /* JADX INFO: renamed from: a */
    public final void m14066a(final mp7 mp7Var, final boolean z, final e16 e16Var, long j, long j2, float f, ye1 ye1Var, final int i) {
        final long j3;
        final long j4;
        final float f2;
        int i2;
        float f3;
        final long j5;
        long j6;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1076870256);
        int i3 = i | (tj3Var.m22120g(mp7Var) ? 4 : 2) | (tj3Var.m22122h(z) ? 32 : 16) | (tj3Var.m22120g(e16Var) ? 256 : 128) | 74752;
        if (tj3Var.m22099R(i3 & 1, (599187 & i3) != 599186)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                vh9 vh9Var = ps5.f56764b;
                long j7 = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55822G;
                long j8 = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s;
                i2 = i3 & (-523265);
                f3 = f44404d;
                j5 = j8;
                j6 = j7;
            } else {
                tj3Var.m22102U();
                i2 = i3 & (-523265);
                j6 = j;
                j5 = j2;
                f3 = f;
            }
            tj3Var.m22140r();
            m14067b(mp7Var, z, e16Var, f3, null, j6, 0.0f, ci8.m4703P(298232649, new aj3() { // from class: cp7
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        Boolean boolValueOf = Boolean.valueOf(z);
                        l43 l43VarM21705c0 = ss5.m21705c0(MotionSchemeKeyTokens.DefaultEffects, tj3Var2);
                        final long j9 = j5;
                        final mp7 mp7Var2 = mp7Var;
                        AbstractC0054a.m734i(boolValueOf, null, l43VarM21705c0, null, ci8.m4703P(-2064098104, new aj3() { // from class: ep7
                            @Override // p000.aj3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                ye1 ye1Var3 = (ye1) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= ((tj3) ye1Var3).m22122h(zBooleanValue) ? 4 : 2;
                                }
                                tj3 tj3Var3 = (tj3) ye1Var3;
                                if (tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    long j10 = j9;
                                    if (zBooleanValue) {
                                        tj3Var3.m22111b0(-499763759);
                                        int i4 = lp7.f49980a;
                                        dn7.m10492a(c99.m4422o(b16.f7762a, 16.0f), j10, 2.5f, 0L, 0, 0.0f, tj3Var3, 390, 56);
                                        tj3Var3.m22139q(false);
                                    } else {
                                        tj3Var3.m22111b0(-499540745);
                                        mp7 mp7Var3 = mp7Var2;
                                        boolean zM22120g = tj3Var3.m22120g(mp7Var3);
                                        Object objM22097O = tj3Var3.m22097O();
                                        if (zM22120g || objM22097O == we1.f66679a) {
                                            objM22097O = new a82(mp7Var3, 2);
                                            tj3Var3.m22131l0(objM22097O);
                                        }
                                        lp7.m16423a((k73) objM22097O, j10, tj3Var3, 0);
                                        tj3Var3.m22139q(false);
                                    }
                                } else {
                                    tj3Var3.m22102U();
                                }
                                return xfa.f68157a;
                            }
                        }, tj3Var2), tj3Var2, 24576, 10);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, (i2 & 896) | (i2 & 14) | 12582912 | (i2 & 112) | 100663296);
            f2 = f3;
            j3 = j6;
            j4 = j5;
        } else {
            tj3Var.m22102U();
            j3 = j;
            j4 = j2;
            f2 = f;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(mp7Var, z, e16Var, j3, j4, f2, i) { // from class: dp7

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ mp7 f36002b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f36003c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ e16 f36004d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ long f36005e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ long f36006f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ float f36007g;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1572865);
                    this.f36001a.m14066a(this.f36002b, this.f36003c, this.f36004d, this.f36005e, this.f36006f, this.f36007g, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14067b(final mp7 mp7Var, final boolean z, final e16 e16Var, final float f, o39 o39Var, final long j, float f2, final C0282a c0282a, ye1 ye1Var, final int i) {
        final mp7 mp7Var2;
        int i2;
        ip7 ip7Var;
        final o39 o39Var2;
        final float f3;
        int i3;
        o39 o39Var3;
        final o39 o39Var4;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1341144489);
        if ((i & 6) == 0) {
            mp7Var2 = mp7Var;
            i2 = (tj3Var.m22120g(mp7Var2) ? 4 : 2) | i;
        } else {
            mp7Var2 = mp7Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22122h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22120g(e16Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22114d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var.m22118f(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            ip7Var = this;
            i2 |= tj3Var.m22120g(ip7Var) ? 67108864 : 33554432;
        } else {
            ip7Var = this;
        }
        if (tj3Var.m22099R(i2 & 1, (38347923 & i2) != 38347922)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                i3 = i2 & (-3727361);
                o39Var3 = f44402b;
                f3 = f44405e;
            } else {
                tj3Var.m22102U();
                i3 = i2 & (-3727361);
                o39Var3 = o39Var;
                f3 = f2;
            }
            int i4 = i3;
            tj3Var.m22140r();
            int i5 = lp7.f49980a;
            e16 e16VarM4422o = c99.m4422o(e16Var, 40.0f);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = new vp6(20);
                tj3Var.m22131l0(objM22097O);
            }
            e16 e16VarM23656z = vz1.m23656z(e16VarM4422o, (vi3) objM22097O);
            boolean zM22114d = ((i4 & 112) == 32) | ((i4 & 14) == 4) | ((((i4 & 7168) ^ 3072) > 2048 && tj3Var.m22114d(f)) || (i4 & 3072) == 2048) | tj3Var.m22114d(f3) | tj3Var.m22120g(o39Var3);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22114d || objM22097O2 == p84Var) {
                o39Var4 = o39Var3;
                aj3 aj3Var = new aj3() { // from class: fp7
                    @Override // p000.aj3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        final l87 l87VarMo1514r = ((ct5) obj2).mo1514r(((bk1) obj3).f8631a);
                        int i6 = l87VarMo1514r.f49301a;
                        int i7 = l87VarMo1514r.f49302b;
                        final mp7 mp7Var3 = mp7Var2;
                        final boolean z2 = z;
                        final float f4 = f;
                        final float f5 = f3;
                        final o39 o39Var5 = o39Var4;
                        return ((jt5) obj).mo9895M0(i6, i7, AbstractC3194a.m15360M(), new vi3() { // from class: hp7
                            @Override // p000.vi3
                            public final Object invoke(Object obj4) {
                                final mp7 mp7Var4 = mp7Var3;
                                final boolean z3 = z2;
                                final float f6 = f4;
                                final float f7 = f5;
                                final o39 o39Var6 = o39Var5;
                                AbstractC0343j.m1525p((AbstractC0343j) obj4, l87VarMo1514r, 0, 0, new vi3() { // from class: bp7
                                    @Override // p000.vi3
                                    public final Object invoke(Object obj5) {
                                        q98 q98Var = (q98) obj5;
                                        mp7 mp7Var5 = mp7Var4;
                                        boolean z4 = ((Number) mp7Var5.f51704a.m745d()).floatValue() > 0.0f || z3;
                                        q98Var.m19811D((((Number) mp7Var5.f51704a.m745d()).floatValue() * q98Var.mo916w0(f6)) - Float.intBitsToFloat((int) (q98Var.f57462M & 4294967295L)));
                                        q98Var.m19825r(z4 ? q98Var.f57464O.mo594a() * f7 : 0.0f);
                                        q98Var.m19826s(o39Var6);
                                        q98Var.m19816f(true);
                                        return xfa.f68157a;
                                    }
                                }, 4);
                                return xfa.f68157a;
                            }
                        });
                    }
                };
                tj3Var.m22131l0(aj3Var);
                objM22097O2 = aj3Var;
            } else {
                o39Var4 = o39Var3;
            }
            e16 e16VarM10007D = d32.m10007D(te1.m21968A(e16VarM23656z, (aj3) objM22097O2), j, o39Var4);
            int i6 = ((i4 >> 12) & 7168) | 48;
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM10007D);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            c0282a.invoke(ci0.f10109a, tj3Var, Integer.valueOf(((i6 >> 6) & 112) | 6));
            tj3Var.m22139q(true);
            o39Var2 = o39Var4;
        } else {
            tj3Var.m22102U();
            o39Var2 = o39Var;
            f3 = f2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final ip7 ip7Var2 = ip7Var;
            x18VarM22143u.f67642d = new zi3() { // from class: gp7
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f41150a.m14067b(mp7Var, z, e16Var, f, o39Var2, j, f3, c0282a, (ye1) obj, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }
}
