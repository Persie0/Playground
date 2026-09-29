package p000;

import android.app.Activity;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.material3.C0269z;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.p012ui.R$drawable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r1d {
    /* JADX INFO: renamed from: a */
    public static final void m20246a(final xu8 xu8Var, final vi3 vi3Var, zi3 zi3Var, ye1 ye1Var, final int i, final int i2) {
        zi3 zi3Var2;
        int i3;
        tj3 tj3Var;
        final zi3 zi3Var3;
        x18 x18VarM22143u;
        zi3 zi3Var4;
        xu8Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1525173237);
        int i4 = i | (tj3Var2.m22124i(xu8Var) ? 4 : 2) | (tj3Var2.m22124i(vi3Var) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            zi3Var2 = zi3Var;
        } else {
            zi3Var2 = zi3Var;
            i3 = i4 | (tj3Var2.m22124i(zi3Var2) ? 256 : 128);
        }
        if (tj3Var2.m22099R(i3 & 1, (i3 & 147) != 146)) {
            final zi3 zi3Var5 = i5 != 0 ? null : zi3Var2;
            if (xu8Var.f68807c) {
                C0269z c0269zM1154g = AbstractC0231g.m1154g(true, tj3Var2, 6, 2);
                boolean z = (i3 & 112) == 32;
                Object objM22097O = tj3Var2.m22097O();
                if (z || objM22097O == we1.f66679a) {
                    objM22097O = new nc8(vi3Var, 20);
                    tj3Var2.m22131l0(objM22097O);
                }
                tj3Var = tj3Var2;
                AbstractC0231g.m1150c((ui3) objM22097O, null, c0269zM1154g, 0.0f, false, null, 0L, 0L, 0L, null, null, null, ci8.m4703P(356349523, new a05(xu8Var, vi3Var, zi3Var5, 13), tj3Var2), tj3Var, 0, 3072, 8186);
                zi3Var3 = zi3Var5;
            } else {
                x18VarM22143u = tj3Var2.m22143u();
                if (x18VarM22143u == null) {
                    return;
                }
                final int i6 = 0;
                zi3Var4 = new zi3(xu8Var, vi3Var, zi3Var5, i, i2, i6) { // from class: vu8

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ int f65945a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ xu8 f65946b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ vi3 f65947c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ zi3 f65948d;

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ int f65949e;

                    {
                        this.f65945a = i6;
                        this.f65949e = i2;
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i7 = this.f65945a;
                        xfa xfaVar = xfa.f68157a;
                        switch (i7) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iM19383z = pk9.m19383z(1);
                                r1d.m20246a(this.f65946b, this.f65947c, this.f65948d, (ye1) obj, iM19383z, this.f65949e);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iM19383z2 = pk9.m19383z(1);
                                r1d.m20246a(this.f65946b, this.f65947c, this.f65948d, (ye1) obj, iM19383z2, this.f65949e);
                                break;
                        }
                        return xfaVar;
                    }
                };
            }
            x18VarM22143u.f67642d = zi3Var4;
        }
        tj3Var = tj3Var2;
        tj3Var.m22102U();
        zi3Var3 = zi3Var2;
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final int i7 = 1;
            zi3Var4 = new zi3(xu8Var, vi3Var, zi3Var3, i, i2, i7) { // from class: vu8

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f65945a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ xu8 f65946b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ vi3 f65947c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ zi3 f65948d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ int f65949e;

                {
                    this.f65945a = i7;
                    this.f65949e = i2;
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i8 = this.f65945a;
                    xfa xfaVar = xfa.f68157a;
                    switch (i8) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(1);
                            r1d.m20246a(this.f65946b, this.f65947c, this.f65948d, (ye1) obj, iM19383z, this.f65949e);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iM19383z2 = pk9.m19383z(1);
                            r1d.m20246a(this.f65946b, this.f65947c, this.f65948d, (ye1) obj, iM19383z2, this.f65949e);
                            break;
                    }
                    return xfaVar;
                }
            };
            x18VarM22143u.f67642d = zi3Var4;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m20247b(e16 e16Var, y29 y29Var, boolean z, ui3 ui3Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        boolean z2;
        String strM23620a0;
        int i2 = y29Var.f69190i;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2968930);
        int i3 = i | 6 | (tj3Var.m22124i(y29Var) ? 32 : 16) | (tj3Var.m22122h(z) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024);
        if (tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            e16Var2 = b16.f7762a;
            e16 e16VarM19514j = pvc.m19514j(AbstractC0080f.m815b(null, z, ui3Var, c99.m4409b(c99.m4412e(e16Var2, 1.0f), 0.0f, 40.0f, 1), 14), z ? 1.0f : 0.5f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var, 54);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM19514j);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16Var2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            boolean z3 = y29Var.f69192k;
            if (i2 != 0) {
                tj3Var.m22111b0(-1565862256);
                strM23620a0 = vz1.m23620a0(tj3Var, i2);
                z2 = false;
                tj3Var.m22139q(false);
            } else {
                z2 = false;
                tj3Var.m22111b0(-1565785438);
                tj3Var.m22139q(false);
                strM23620a0 = y29Var.f9424b;
            }
            boolean z4 = z2;
            lw9.m16554b(strM23620a0, null, p58.m18900f(tj3Var).f55870o, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 131066);
            tj3Var = tj3Var;
            if (y29Var.f69191j && !z3) {
                tj3Var.m22111b0(-1565523829);
                thb.m22044c(tj3Var, c99.m4426s(e16Var2, ge9.m12515a(tj3Var).f38955d));
                bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_ai, tj3Var, z4 ? 1 : 0), null, c99.m4426s(e16Var2, 16.0f), null, null, 0.0f, new qd0(5, cx2.m9917a(tj3Var).m4218k()), tj3Var, 440, 56);
                tj3Var.m22139q(z4);
            } else if (z3) {
                tj3Var.m22111b0(-1565098013);
                thb.m22044c(tj3Var, c99.m4426s(e16Var2, ge9.m12515a(tj3Var).f38955d));
                bq1.m4042R(AbstractC3423or.m18236U(com.lingq.core.premium.R$drawable.ic_crown, tj3Var, z4 ? 1 : 0), null, c99.m4426s(e16Var2, 16.0f), null, null, 0.0f, new qd0(5, cx2.m9917a(tj3Var).m4218k()), tj3Var, 440, 56);
                tj3Var.m22139q(z4);
            } else {
                tj3Var.m22111b0(-1564708808);
                tj3Var.m22139q(z4);
            }
            tj3Var.m22139q(true);
            if (y29Var.f9426d) {
                tj3Var.m22111b0(-1291090444);
                ty3.m22351a(f7d.m11590a(), null, null, p58.m18900f(tj3Var).f55870o, tj3Var, 48, 4);
                tj3Var = tj3Var;
                tj3Var.m22139q(z4);
            } else {
                tj3Var.m22111b0(-1290898244);
                tj3Var.m22139q(z4);
            }
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new py0(e16Var2, y29Var, z, ui3Var, i, 6);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m20248c(e16 e16Var, z29 z29Var, vi3 vi3Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-647962123);
        int i2 = i | 6 | (tj3Var.m22124i(z29Var) ? 32 : 16) | (tj3Var.m22124i(vi3Var) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var, 54);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            String strM23620a0 = vz1.m23620a0(tj3Var, z29Var.f70804f);
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(strM23620a0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55870o, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j, tj3Var, 0, 0, 131066);
            tj3Var = tj3Var;
            ap9.m2973a(z29Var.f70805g, vi3Var, null, false, null, tj3Var, (i2 >> 3) & 112);
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new lo6(e16Var2, z29Var, vi3Var, i, 25);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m20249d(e16 e16Var, a39 a39Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        e16 e16Var2;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1116859466);
        int i2 = i | 6 | (tj3Var2.m22124i(a39Var) ? 32 : 16);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 19) != 18)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            String strM23620a0 = vz1.m23620a0(tj3Var2, a39Var.f182e);
            vh9 vh9Var = ps5.f56764b;
            tj3Var = tj3Var2;
            lw9.m16554b(strM23620a0, e16VarM4412e, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55870o, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71403g, tj3Var, 0, 0, 131064);
            e16Var2 = b16Var;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new eq8(e16Var2, i, 6, a39Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m20250e(e16 e16Var, b39 b39Var, ui3 ui3Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-562079932);
        int i2 = i | 6 | (tj3Var.m22124i(b39Var) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM815b = AbstractC0080f.m815b(null, false, ui3Var, c99.m4409b(c99.m4412e(b16Var, 1.0f), 0.0f, 40.0f, 1), 15);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var, 54);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM815b);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            String strM23620a0 = vz1.m23620a0(tj3Var, fbd.m11760j(b39Var.f7879h));
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(strM23620a0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55870o, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, tj3Var, 0, 0, 131066);
            tj3Var = tj3Var;
            if (b39Var.f9426d) {
                tj3Var.m22111b0(-119920462);
                ty3.m22351a(f7d.m11590a(), null, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55870o, tj3Var, 48, 4);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-119728262);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new lo6(i, 24, e16Var2, b39Var, ui3Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m20251f(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
