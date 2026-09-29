package p000;

import androidx.compose.material3.AbstractC0231g;
import androidx.compose.material3.C0269z;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.playlists.AbstractC1825a;
import com.lingq.core.playlists.C1830f;
import com.lingq.core.playlists.C1831g;
import com.lingq.core.playlists.C1832h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k3c {

    /* JADX INFO: renamed from: a */
    public static final C0282a f46668a = new C0282a(-1675380055, false, new xd1(0));

    /* JADX INFO: renamed from: b */
    public static final C0282a f46669b = new C0282a(1861332489, false, new xd1(1));

    /* JADX INFO: renamed from: c */
    public static final C0282a f46670c = new C0282a(1630014324, false, new wd1(14));

    /* JADX INFO: renamed from: a */
    public static final void m14790a(tf7 tf7Var, vi3 vi3Var, vi3 vi3Var2, vi3 vi3Var3, ui3 ui3Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1138772112);
        int i2 = i | (tj3Var2.m22120g(tf7Var) ? 4 : 2) | (tj3Var2.m22124i(vi3Var) ? 32 : 16) | (tj3Var2.m22124i(vi3Var2) ? 256 : 128) | (tj3Var2.m22124i(vi3Var3) ? 2048 : 1024) | (tj3Var2.m22124i(ui3Var) ? 16384 : 8192);
        if (!tj3Var2.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        } else if (tf7Var instanceof rf7) {
            tj3Var2.m22111b0(786979153);
            e16 e16VarM4414g = c99.m4414g(c99.m4412e(b16.f7762a, 1.0f), 300.0f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM4414g);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var2);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var2, C0352b.f4305h);
            oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
            tj3Var = tj3Var2;
            do7.m10527c(null, 0L, 0.0f, 0.0f, tj3Var, 0, 15);
            tj3Var.m22139q(true);
            tj3Var.m22139q(false);
        } else {
            if (!(tf7Var instanceof sf7)) {
                throw ux5.m23001x(tj3Var2, 856668857, false);
            }
            tj3Var2.m22111b0(787286177);
            int i3 = i2 << 6;
            d32.m10057q(((sf7) tf7Var).f60794a, true, true, vi3Var, vi3Var2, vi3Var3, ui3Var, tj3Var2, (i3 & 3670016) | (i3 & 7168) | 432 | (57344 & i3) | (458752 & i3));
            tj3Var = tj3Var2;
            tj3Var.m22139q(false);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new xy0(tf7Var, vi3Var, vi3Var2, vi3Var3, ui3Var, i, 9);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m14791b(oe7 oe7Var, ye1 ye1Var, int i) {
        oe7Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(189856215);
        int i2 = 0;
        if (tj3Var.m22099R(i & 1, (i & 3) != 2)) {
            dua duaVarM21396a = si5.m21396a(tj3Var);
            if (duaVarM21396a == null) {
                C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            C1832h c1832h = (C1832h) pfa.m19114d(y38.m24933a(C1832h.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
            t66 t66VarM2513c = AbstractC0711a.m2513c(c1832h.f22303m, tj3Var);
            ho9.m13414a(c99.m4411d(b16.f7762a, 1.0f), null, 0L, 0L, 0.0f, 0.0f, null, ci8.m4703P(514560370, new lo6(c1832h, oe7Var, t66VarM2513c, 8), tj3Var), tj3Var, 12582918, 126);
            tj3Var = tj3Var;
            tf7 tf7Var = (tf7) t66VarM2513c.getValue();
            if (tf7Var instanceof sf7) {
                tj3Var.m22111b0(-463969649);
                nd7 nd7Var = ((sf7) tf7Var).f60796c;
                if (nd7Var instanceof md7) {
                    tj3Var.m22111b0(-463904456);
                    tj3Var.m22139q(false);
                } else {
                    boolean z = nd7Var instanceof kd7;
                    p84 p84Var = we1.f66679a;
                    if (z) {
                        tj3Var.m22111b0(-463831172);
                        String str = ((kd7) nd7Var).f47067a;
                        boolean zM22124i = tj3Var.m22124i(c1832h);
                        Object objM22097O = tj3Var.m22097O();
                        if (zM22124i || objM22097O == p84Var) {
                            objM22097O = new nf7(c1832h, 3);
                            tj3Var.m22131l0(objM22097O);
                        }
                        ui3 ui3Var = (ui3) objM22097O;
                        boolean zM22124i2 = tj3Var.m22124i(c1832h);
                        Object objM22097O2 = tj3Var.m22097O();
                        if (zM22124i2 || objM22097O2 == p84Var) {
                            objM22097O2 = new C1830f(c1832h, i2);
                            tj3Var.m22131l0(objM22097O2);
                        }
                        AbstractC1825a.m8506a(str, ui3Var, (vi3) objM22097O2, null, tj3Var, 6, 16);
                        tj3Var = tj3Var;
                        tj3Var.m22139q(false);
                    } else {
                        if (!(nd7Var instanceof ld7)) {
                            throw ux5.m23001x(tj3Var, 2063243219, false);
                        }
                        tj3Var.m22111b0(-463482732);
                        ld7 ld7Var = (ld7) nd7Var;
                        String str2 = ld7Var.f49504a;
                        String str3 = ld7Var.f49505b;
                        boolean zM22124i3 = tj3Var.m22124i(c1832h);
                        Object objM22097O3 = tj3Var.m22097O();
                        if (zM22124i3 || objM22097O3 == p84Var) {
                            objM22097O3 = new nf7(c1832h, 0);
                            tj3Var.m22131l0(objM22097O3);
                        }
                        ui3 ui3Var2 = (ui3) objM22097O3;
                        boolean zM22124i4 = tj3Var.m22124i(c1832h) | tj3Var.m22124i(nd7Var);
                        Object objM22097O4 = tj3Var.m22097O();
                        if (zM22124i4 || objM22097O4 == p84Var) {
                            objM22097O4 = new C1831g(c1832h, nd7Var, 0);
                            tj3Var.m22131l0(objM22097O4);
                        }
                        AbstractC1825a.m8507b(str2, str3, ui3Var2, (vi3) objM22097O4, null, tj3Var, 6, 32);
                        tj3Var.m22139q(false);
                    }
                }
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-463044981);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ht6(oe7Var, i, 9);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m14792c(final boolean z, final oe7 oe7Var, C0269z c0269z, ye1 ye1Var, final int i) {
        final C0269z c0269z2;
        C0269z c0269zM1154g;
        boolean z2;
        oe7Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-525670920);
        int i2 = i | (tj3Var.m22122h(z) ? 4 : 2) | 128;
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                c0269zM1154g = AbstractC0231g.m1154g(false, tj3Var, 6, 2);
            } else {
                tj3Var.m22102U();
                c0269zM1154g = c0269z;
            }
            tj3Var.m22140r();
            if (!z) {
                x18 x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    final int i3 = 0;
                    final C0269z c0269z3 = c0269zM1154g;
                    x18VarM22143u.f67642d = new zi3(z, oe7Var, c0269z3, i, i3) { // from class: mf7

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ int f51252a;

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ boolean f51253b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ oe7 f51254c;

                        /* JADX INFO: renamed from: d */
                        public final /* synthetic */ C0269z f51255d;

                        {
                            this.f51252a = i3;
                        }

                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.f51252a;
                            xfa xfaVar = xfa.f68157a;
                            C0269z c0269z4 = this.f51255d;
                            oe7 oe7Var2 = this.f51254c;
                            boolean z3 = this.f51253b;
                            ye1 ye1Var2 = (ye1) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    k3c.m14792c(z3, oe7Var2, c0269z4, ye1Var2, pk9.m19383z(49));
                                    break;
                                default:
                                    k3c.m14792c(z3, oe7Var2, c0269z4, ye1Var2, pk9.m19383z(49));
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    return;
                }
                return;
            }
            C0269z c0269z4 = c0269zM1154g;
            dua duaVarM21396a = si5.m21396a(tj3Var);
            if (duaVarM21396a == null) {
                C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            C1832h c1832h = (C1832h) pfa.m19114d(y38.m24933a(C1832h.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
            t66 t66VarM2513c = AbstractC0711a.m2513c(c1832h.f22303m, tj3Var);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = new hz4(oe7Var, 15);
                tj3Var.m22131l0(objM22097O);
            }
            ng0 ng0Var = ng0.f52694a;
            AbstractC0231g.m1150c((ui3) objM22097O, null, c0269z4, 0.0f, false, null, 0L, 0L, ng0.m17408b(tj3Var), null, null, null, ci8.m4703P(949366102, new a05(oe7Var, c1832h, t66VarM2513c, 9), tj3Var), tj3Var, 0, 3072, 7674);
            tj3Var = tj3Var;
            tf7 tf7Var = (tf7) t66VarM2513c.getValue();
            if (tf7Var instanceof sf7) {
                tj3Var.m22111b0(-810093906);
                nd7 nd7Var = ((sf7) tf7Var).f60796c;
                if (nd7Var instanceof md7) {
                    tj3Var.m22111b0(-810028713);
                    z2 = false;
                    tj3Var.m22139q(false);
                } else {
                    z2 = false;
                    if (nd7Var instanceof kd7) {
                        tj3Var.m22111b0(-809955429);
                        String str = ((kd7) nd7Var).f47067a;
                        boolean zM22124i = tj3Var.m22124i(c1832h);
                        Object objM22097O2 = tj3Var.m22097O();
                        if (zM22124i || objM22097O2 == p84Var) {
                            objM22097O2 = new nf7(c1832h, 1);
                            tj3Var.m22131l0(objM22097O2);
                        }
                        ui3 ui3Var = (ui3) objM22097O2;
                        boolean zM22124i2 = tj3Var.m22124i(c1832h);
                        Object objM22097O3 = tj3Var.m22097O();
                        if (zM22124i2 || objM22097O3 == p84Var) {
                            objM22097O3 = new C1830f(c1832h, 3);
                            tj3Var.m22131l0(objM22097O3);
                        }
                        AbstractC1825a.m8506a(str, ui3Var, (vi3) objM22097O3, null, tj3Var, 6, 16);
                        tj3Var = tj3Var;
                        tj3Var.m22139q(false);
                    } else {
                        if (!(nd7Var instanceof ld7)) {
                            throw ux5.m23001x(tj3Var, 1636435924, false);
                        }
                        tj3Var.m22111b0(-809606989);
                        ld7 ld7Var = (ld7) nd7Var;
                        String str2 = ld7Var.f49504a;
                        String str3 = ld7Var.f49505b;
                        boolean zM22124i3 = tj3Var.m22124i(c1832h);
                        Object objM22097O4 = tj3Var.m22097O();
                        if (zM22124i3 || objM22097O4 == p84Var) {
                            objM22097O4 = new nf7(c1832h, 2);
                            tj3Var.m22131l0(objM22097O4);
                        }
                        ui3 ui3Var2 = (ui3) objM22097O4;
                        boolean zM22124i4 = tj3Var.m22124i(c1832h) | tj3Var.m22124i(nd7Var);
                        Object objM22097O5 = tj3Var.m22097O();
                        if (zM22124i4 || objM22097O5 == p84Var) {
                            objM22097O5 = new C1831g(c1832h, nd7Var, 1);
                            tj3Var.m22131l0(objM22097O5);
                        }
                        AbstractC1825a.m8507b(str2, str3, ui3Var2, (vi3) objM22097O5, null, tj3Var, 6, 32);
                        tj3Var.m22139q(false);
                    }
                }
                tj3Var.m22139q(z2);
            } else {
                tj3Var.m22111b0(-809169238);
                tj3Var.m22139q(false);
            }
            c0269z2 = c0269z4;
        } else {
            tj3Var.m22102U();
            c0269z2 = c0269z;
        }
        x18 x18VarM22143u2 = tj3Var.m22143u();
        if (x18VarM22143u2 != null) {
            final int i4 = 1;
            x18VarM22143u2.f67642d = new zi3(z, oe7Var, c0269z2, i, i4) { // from class: mf7

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f51252a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f51253b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ oe7 f51254c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C0269z f51255d;

                {
                    this.f51252a = i4;
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.f51252a;
                    xfa xfaVar = xfa.f68157a;
                    C0269z c0269z5 = this.f51255d;
                    oe7 oe7Var2 = this.f51254c;
                    boolean z3 = this.f51253b;
                    ye1 ye1Var2 = (ye1) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            k3c.m14792c(z3, oe7Var2, c0269z5, ye1Var2, pk9.m19383z(49));
                            break;
                        default:
                            k3c.m14792c(z3, oe7Var2, c0269z5, ye1Var2, pk9.m19383z(49));
                            break;
                    }
                    return xfaVar;
                }
            };
        }
    }
}
