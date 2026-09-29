package p000;

import android.content.Context;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.cup.CupPrizeSource;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.feature.challenges.R$string;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r9d {
    /* JADX INFO: renamed from: a */
    public static final void m20479a(e16 e16Var, C0282a c0282a, ye1 ye1Var, int i, int i2) {
        int i3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1009346778);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22124i(c0282a) ? 32 : 16;
        }
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                e16Var = b16.f7762a;
            }
            si8 si8VarM22753b = ui8.m22753b(((fe9) tj3Var.m22128k(ge9.f40637a)).f38958g);
            e16 e16VarM19045o = pb1.m19045o(c99.m4412e(e16Var, 1.0f), si8VarM22753b);
            vh9 vh9Var = ps5.f56764b;
            e16 e16VarM20387m = r46.m20387m(d32.m10007D(e16VarM19045o, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55825J, ss5.f61356d), 1.0f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55817B, si8VarM22753b);
            int i5 = (i3 << 6) & 7168;
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM20387m);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            c0282a.invoke(db1.f35347a, tj3Var, Integer.valueOf(((i5 >> 6) & 112) | 6));
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        e16 e16Var2 = e16Var;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zs1(e16Var2, c0282a, i, i2, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m20480b(Integer num, e16 e16Var, boolean z, ye1 ye1Var, int i) {
        tj3 tj3Var;
        e16 e16Var2;
        String strM22988k;
        long j;
        Pair pair;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1286308713);
        int i2 = i | (tj3Var2.m22120g(num) ? 4 : 2) | 48;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            if (num == null || num.intValue() == 0) {
                strM22988k = "–";
            } else if (num.intValue() > 0) {
                strM22988k = "▲ " + num;
            } else {
                strM22988k = ux5.m22988k(-num.intValue(), "▼ ");
            }
            b16 b16Var = b16.f7762a;
            if (z) {
                tj3Var2.m22111b0(724910071);
                if (num == null || num.intValue() == 0) {
                    pair = new Pair(new aa1(xs1.f68628u), new aa1(xs1.f68630w));
                } else {
                    pair = num.intValue() > 0 ? new Pair(new aa1(xs1.f68624q), new aa1(xs1.f68625r)) : new Pair(new aa1(xs1.f68626s), new aa1(xs1.f68627t));
                }
                long j2 = ((aa1) pair.f47623a).f414a;
                long j3 = ((aa1) pair.f47624b).f414a;
                zf1 zf1Var = ge9.f40637a;
                e16 e16VarM21608U = AbstractC3584sr.m21608U(d32.m10007D(pb1.m19045o(b16Var, ui8.m22753b(((fe9) tj3Var2.m22128k(zf1Var)).f38952a)), j2, ss5.f61356d), ((fe9) tj3Var2.m22128k(zf1Var)).f38956e, ((fe9) tj3Var2.m22128k(zf1Var)).f38954c);
                sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var2, 48);
                int iHashCode = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m = tj3Var2.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM21608U);
                se1.f60731q.getClass();
                ui3 ui3Var = C0352b.f4299b;
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, C0352b.f4303f, sj8VarM20003a);
                oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                oha.m18000f(tj3Var2, C0352b.f4305h);
                oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                e16Var2 = b16Var;
                lw9.m16554b(strM22988k, null, j3, null, 0L, null, bc3.f8323i, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var2, 1572864, 0, 131002);
                tj3Var = tj3Var2;
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            } else {
                String str = strM22988k;
                e16Var2 = b16Var;
                tj3Var2.m22111b0(725823269);
                if (num == null || num.intValue() == 0) {
                    tj3Var2.m22111b0(-807867559);
                    j = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55875s;
                    tj3Var2.m22139q(false);
                } else if (num.intValue() > 0) {
                    tj3Var2.m22111b0(-807865900);
                    tj3Var2.m22139q(false);
                    j = xs1.f68625r;
                } else {
                    tj3Var2.m22111b0(-807864554);
                    tj3Var2.m22139q(false);
                    j = xs1.f68627t;
                }
                lw9.m16554b(str, e16Var2, j, null, 0L, null, bc3.f8323i, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var2, 1572912, 0, 131000);
                tj3Var = tj3Var2;
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ln0(num, e16Var2, z, i, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m20481c(int i, ye1 ye1Var, e16 e16Var, String str) {
        int i2;
        str.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1077872723);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22120g(e16Var) ? 32 : 16;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            bq1.m4042R(AbstractC3423or.m18236U(AbstractC3423or.m18282v((Context) tj3Var.m22128k(AbstractC0394f.f4761b), str), tj3Var, 0), null, pb1.m19045o(e16Var, ui8.f63972a), null, null, 0.0f, null, tj3Var, 56, 120);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ys1(str, e16Var, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m20482d(e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1931186657);
        int i2 = i | 6;
        int i3 = 2;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38959h, 1);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
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
            dn7.m10492a(null, 0L, 0.0f, 0L, 0, 0.0f, tj3Var, 0, 63);
            tj3Var.m22139q(true);
            e16Var = b16Var;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3456pd(i, i3, e16Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:23:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m20483e(int i, int i2, ye1 ye1Var, e16 e16Var, String str) {
        e16 e16Var2;
        byte b;
        boolean z;
        x18 x18VarM22143u;
        e16 e16Var3;
        str.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1782086709);
        int i3 = 2;
        int i4 = (tj3Var.m22120g(str) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                e16Var2 = e16Var;
                i4 |= tj3Var.m22120g(e16Var2) ? 32 : 16;
            }
            b = 0;
            if ((i4 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i4 & 1, z)) {
                if (i5 != 0) {
                    e16Var3 = b16.f7762a;
                } else {
                    e16Var3 = e16Var2;
                }
                si8 si8VarM22753b = ui8.m22753b(((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e);
                vh9 vh9Var = ps5.f56764b;
                ho9.m13414a(c99.m4412e(e16Var3, 1.0f), si8VarM22753b, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55872p, 0L, 0.0f, 0.0f, ci8.m4714a(1.0f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55817B), ci8.m4703P(-1150877360, new tha(str, i3, b), tj3Var), tj3Var, 12582912, 56);
                e16Var2 = e16Var3;
            } else {
                tj3Var.m22102U();
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new C3672v4(str, e16Var2, i, i2);
            }
        }
        i4 |= 48;
        e16Var2 = e16Var;
        b = 0;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var.m22099R(i4 & 1, z)) {
            if (i5 != 0) {
                e16Var3 = b16.f7762a;
            } else {
                e16Var3 = e16Var2;
            }
            si8 si8VarM22753b2 = ui8.m22753b(((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e);
            vh9 vh9Var2 = ps5.f56764b;
            ho9.m13414a(c99.m4412e(e16Var3, 1.0f), si8VarM22753b2, ((ms5) tj3Var.m22128k(vh9Var2)).f51799a.f55872p, 0L, 0.0f, 0.0f, ci8.m4714a(1.0f, ((ms5) tj3Var.m22128k(vh9Var2)).f51799a.f55817B), ci8.m4703P(-1150877360, new tha(str, i3, b), tj3Var), tj3Var, 12582912, 56);
            e16Var2 = e16Var3;
        } else {
            tj3Var.m22102U();
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3672v4(str, e16Var2, i, i2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m20484f(final int i, final float f, ye1 ye1Var, final int i2, final int i3) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-269533016);
        int i4 = (tj3Var.m22116e(i) ? 4 : 2) | i2;
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= tj3Var.m22114d(f) ? 32 : 16;
        }
        if (tj3Var.m22099R(i4 & 1, (i4 & 19) != 18)) {
            if (i5 != 0) {
                f = 150.0f;
            }
            bq1.m4042R(AbstractC3423or.m18236U(i, tj3Var, i4 & 14), null, c99.m4414g(c99.m4412e(b16.f7762a, 1.0f), f), null, hl1.f42565b, 0.0f, null, tj3Var, 24632, 104);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: gia
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i2 | 1);
                    r9d.m20484f(i, f, (ye1) obj, iM19383z, i3);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m20485g(final UpgradeReason upgradeReason, final boolean z, final boolean z2, final List list, final String str, ui3 ui3Var, final ui3 ui3Var2, e16 e16Var, ye1 ye1Var, final int i) {
        final e16 e16Var2;
        final ui3 ui3Var3 = ui3Var;
        upgradeReason.getClass();
        list.getClass();
        str.getClass();
        ui3Var3.getClass();
        ui3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1515512578);
        int i2 = i | (tj3Var.m22116e(upgradeReason.ordinal()) ? 4 : 2) | (tj3Var.m22122h(z) ? 32 : 16) | (tj3Var.m22122h(z2) ? 256 : 128) | (tj3Var.m22124i(list) ? 2048 : 1024) | (tj3Var.m22120g(str) ? 16384 : 8192) | (tj3Var.m22124i(ui3Var3) ? 131072 : 65536) | (tj3Var.m22124i(ui3Var2) ? 1048576 : 524288) | 12582912;
        if (tj3Var.m22099R(i2 & 1, (4793491 & i2) != 4793490)) {
            int i3 = hia.f42411a[upgradeReason.ordinal()];
            b16 b16Var = b16.f7762a;
            switch (i3) {
                case 1:
                    tj3Var.m22111b0(413684047);
                    wx1.m24192a(list, ui3Var3, tj3Var, ((i2 >> 9) & 14) | ((i2 >> 12) & 112) | 384);
                    tj3Var.m22139q(false);
                    break;
                case 2:
                case 3:
                    tj3Var.m22111b0(413688168);
                    sfd.m21344a(((i2 >> 15) & 14) | 48, tj3Var, ui3Var3);
                    tj3Var.m22139q(false);
                    break;
                case 4:
                    tj3Var.m22111b0(413690545);
                    kjd.m15291b(((i2 >> 15) & 14) | 48, tj3Var, ui3Var3);
                    tj3Var.m22139q(false);
                    break;
                case 5:
                case 6:
                    tj3Var.m22111b0(413694511);
                    b4d.m3296a(((i2 >> 15) & 14) | 48, tj3Var, ui3Var3);
                    tj3Var.m22139q(false);
                    break;
                case 7:
                    tj3Var.m22111b0(413696968);
                    qnb.m20084a(((i2 >> 15) & 14) | 48, 0, tj3Var, ui3Var3, b16Var);
                    tj3Var.m22139q(false);
                    break;
                case 8:
                    tj3Var.m22111b0(413705279);
                    if (z) {
                        tj3Var.m22111b0(-60025992);
                        oid.m18036a(upgradeReason, ui3Var3, tj3Var, (i2 & 14) | ((i2 >> 12) & 112) | 384);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(-59947903);
                        AbstractC3607td.m21957a(true, ui3Var3, null, tj3Var, ((i2 >> 12) & 112) | 390);
                        tj3Var.m22139q(false);
                    }
                    tj3Var.m22139q(false);
                    break;
                case 9:
                    tj3Var.m22111b0(413712938);
                    AbstractC3607td.m21957a(false, ui3Var3, null, tj3Var, ((i2 >> 12) & 112) | 390);
                    tj3Var.m22139q(false);
                    break;
                case 10:
                    tj3Var.m22111b0(413716816);
                    o2d.m17771a(((i2 >> 15) & 14) | 48, tj3Var, ui3Var3);
                    tj3Var.m22139q(false);
                    break;
                case 11:
                    tj3Var.m22111b0(413719993);
                    int i4 = (i2 >> 3) & 126;
                    int i5 = i2 >> 6;
                    wnb.m24085b(z, z2, str, ui3Var3, ui3Var2, tj3Var, (i5 & 57344) | i4 | (i5 & 896) | (i5 & 7168) | 196608);
                    ui3Var3 = ui3Var3;
                    tj3Var.m22139q(false);
                    break;
                case 12:
                    tj3Var.m22111b0(413728914);
                    wnb.m24084a(z, ui3Var3, tj3Var, ((i2 >> 12) & 112) | ((i2 >> 3) & 14) | 384);
                    tj3Var.m22139q(false);
                    break;
                case 13:
                    tj3Var.m22111b0(413731903);
                    wnb.m24084a(true, ui3Var3, tj3Var, ((i2 >> 12) & 112) | 390);
                    tj3Var.m22139q(false);
                    break;
                case 14:
                case 15:
                case 16:
                case 17:
                    tj3Var.m22111b0(413740242);
                    oid.m18036a(upgradeReason, ui3Var3, tj3Var, ((i2 >> 12) & 112) | (i2 & 14) | 384);
                    tj3Var.m22139q(false);
                    break;
                default:
                    throw ux5.m23001x(tj3Var, 413684169, false);
            }
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(z, z2, list, str, ui3Var3, ui3Var2, e16Var2, i) { // from class: fia

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f39154b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f39155c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ List f39156d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ String f39157e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ ui3 f39158f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ ui3 f39159g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ e16 f39160h;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1);
                    r9d.m20485g(this.f39153a, this.f39154b, this.f39155c, this.f39156d, this.f39157e, this.f39158f, this.f39159g, this.f39160h, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: h */
    public static final String m20486h(CupPrizeSource cupPrizeSource, ye1 ye1Var) {
        int i;
        cupPrizeSource.getClass();
        switch (at1.f7453a[cupPrizeSource.ordinal()]) {
            case 1:
                i = R$string.cup_source_reading;
                break;
            case 2:
                i = R$string.cup_source_listening;
                break;
            case 3:
                i = R$string.cup_source_lingq;
                break;
            case 4:
                i = R$string.cup_source_known;
                break;
            case 5:
                i = R$string.cup_source_all;
                break;
            case 6:
                i = R$string.cup_source_all;
                break;
            default:
                gm5.m12750e();
                return null;
        }
        return vz1.m23620a0(ye1Var, i);
    }
}
