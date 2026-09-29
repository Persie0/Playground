package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.FeedTopic;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.vocabulary.R$drawable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fbd {
    /* JADX INFO: renamed from: a */
    public static final void m11751a(int i, ye1 ye1Var, ui3 ui3Var, ui3 ui3Var2, vi3 vi3Var, sxa sxaVar) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-694396419);
        int i2 = (tj3Var.m22124i(sxaVar) ? 4 : 2) | i | (tj3Var.m22124i(ui3Var) ? 32 : 16) | (tj3Var.m22124i(vi3Var) ? 256 : 128) | (tj3Var.m22124i(ui3Var2) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zM12247b = fy9.m12247b(t9a.m21912b(tj3Var));
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            vh9 vh9Var = ps5.f56764b;
            ho9.m13414a(null, ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55872p, 0L, 0.0f, 0.0f, null, ci8.m4703P(-177131902, new py3(zM12247b, sxaVar, ui3Var, ui3Var2, vi3Var, t66Var), tj3Var), tj3Var, 12582912, 121);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new f0b(sxaVar, ui3Var, vi3Var, ui3Var2, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m11752b(vxa vxaVar, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(339011028);
        int i2 = i | (tj3Var.m22120g(vxaVar) ? 4 : 2);
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(e16VarM4412e, ((fe9) tj3Var.m22128k(zf1Var)).f38960i);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38952a, true, new gm5(28)), nj0.f52792K, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
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
            bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_empty_vocabulary, tj3Var, 0), null, null, null, null, 0.0f, null, tj3Var, 56, 124);
            String strM23620a0 = vz1.m23620a0(tj3Var, vxaVar.f66068a);
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(strM23620a0, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71404h, tj3Var, 0, 0, 131070);
            tj3Var = tj3Var;
            Integer num = vxaVar.f66069b;
            if (num == null) {
                tj3Var.m22111b0(-1357508865);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-1357508864);
                lw9.m16554b(vz1.m23620a0(tj3Var, num.intValue()), null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, tj3Var, 0, 0, 131066);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new dl9(vxaVar, i, 15);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m11753c(h0b h0bVar, x17 x17Var, vi3 vi3Var, zi3 zi3Var, vi3 vi3Var2, C0282a c0282a, e16 e16Var, ye1 ye1Var, int i) {
        h0bVar.getClass();
        vi3Var.getClass();
        zi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1870624652);
        int i2 = (tj3Var.m22124i(vi3Var2) ? 16384 : 8192) | i | (tj3Var.m22124i(h0bVar) ? 4 : 2) | (tj3Var.m22120g(x17Var) ? 32 : 16) | (tj3Var.m22124i(vi3Var) ? 256 : 128) | (tj3Var.m22124i(zi3Var) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, (599187 & i2) != 599186)) {
            boolean zM22124i = tj3Var.m22124i(h0bVar) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                C3537ri c3537ri = new C3537ri((Object) h0bVar, (Object) c0282a, vi3Var, (xi3) zi3Var, vi3Var2, 10);
                tj3Var.m22131l0(c3537ri);
                objM22097O = c3537ri;
            }
            fa4.m11642c(e16Var, null, x17Var, null, null, null, false, null, (vi3) objM22097O, tj3Var, 6 | ((i2 << 3) & 896), 506);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new sx0(h0bVar, x17Var, vi3Var, zi3Var, vi3Var2, c0282a, e16Var, i, 4);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m11754d(sxa sxaVar, boolean z, ui3 ui3Var, ui3 ui3Var2, ui3 ui3Var3, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-932485992);
        int i2 = i | (tj3Var.m22124i(sxaVar) ? 4 : 2) | (tj3Var.m22122h(z) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128) | (tj3Var.m22124i(ui3Var2) ? 2048 : 1024) | (tj3Var.m22124i(vi3Var2) ? 1048576 : 524288);
        if (tj3Var.m22099R(i2 & 1, (599187 & i2) != 599186)) {
            si8 si8Var = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64857c;
            b16 b16Var = b16.f7762a;
            e16 e16VarM815b = AbstractC0080f.m815b(null, false, ui3Var, pb1.m19045o(b16Var, si8Var), 15);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(e16VarM815b, ((fe9) tj3Var.m22128k(zf1Var)).f38952a);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
            se1.f60731q.getClass();
            ui3 ui3Var4 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var4);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            int i3 = i2 & 14;
            int i4 = i2 & 126;
            int i5 = i2 >> 6;
            m11755e(sxaVar, z, ui3Var3, vi3Var, vi3Var2, tj3Var, i4 | 3456 | (57344 & i5));
            tj3Var = tj3Var;
            m11758h(sxaVar, ui3Var2, AbstractC3393o1.m17728c(1.0f, AbstractC3584sr.m21607T(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38952a), true), false, tj3Var, i3 | (i5 & 112), 8);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new f87(sxaVar, z, ui3Var, ui3Var2, ui3Var3, vi3Var, vi3Var2, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m11755e(sxa sxaVar, boolean z, ui3 ui3Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        ui3 ui3Var2;
        vi3 vi3Var3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-817886712);
        int i2 = (tj3Var.m22124i(sxaVar) ? 4 : 2) | i | (tj3Var.m22122h(z) ? 32 : 16);
        if ((i & 384) == 0) {
            ui3Var2 = ui3Var;
            i2 |= tj3Var.m22124i(ui3Var2) ? 256 : 128;
        } else {
            ui3Var2 = ui3Var;
        }
        if ((i & 3072) == 0) {
            vi3Var3 = vi3Var;
            i2 |= tj3Var.m22124i(vi3Var3) ? 2048 : 1024;
        } else {
            vi3Var3 = vi3Var;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22124i(vi3Var2) ? 16384 : 8192;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            e16 e16VarM4430w = c99.m4430w(b16.f7762a, null, 3);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4430w);
            se1.f60731q.getClass();
            ui3 ui3Var3 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            l4d.m15802b(null, y7d.m24984c(sxaVar.f61568g, sxaVar.f61569h), sxaVar.f61570i.f65847c, false, ui3Var2, tj3Var, (i2 << 6) & 57344, 9);
            tj3Var = tj3Var;
            vs3 vs3Var = sxaVar.f61570i;
            boolean z2 = (i2 & 57344) == 16384;
            Object objM22097O = tj3Var.m22097O();
            if (z2 || objM22097O == we1.f66679a) {
                objM22097O = new v4a(vi3Var2, 17);
                tj3Var.m22131l0(objM22097O);
            }
            o4d.m17800a(vs3Var, z, vi3Var3, (vi3) objM22097O, tj3Var, (i2 & 112) | ((i2 >> 3) & 896));
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new be7(sxaVar, z, ui3Var, vi3Var, vi3Var2, i);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m11756f(int i, ye1 ye1Var, ui3 ui3Var, ui3 ui3Var2, vi3 vi3Var, sxa sxaVar) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-836138685);
        int i2 = (tj3Var.m22124i(sxaVar) ? 4 : 2) | i | (tj3Var.m22124i(ui3Var) ? 32 : 16) | (tj3Var.m22124i(ui3Var2) ? 256 : 128) | (tj3Var.m22124i(vi3Var) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            e16 e16VarM815b = AbstractC0080f.m815b(null, false, ui3Var, pb1.m19045o(b16.f7762a, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64857c), 15);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(e16VarM815b, ((fe9) tj3Var.m22128k(zf1Var)).f38952a);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38957f, true, new gm5(28)), nj0.f52817l, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
            se1.f60731q.getClass();
            ui3 ui3Var3 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            m11758h(sxaVar, ui3Var2, e65.m10871c(tj3Var, e16VarM1322c, C0352b.f4301d, 1.0f, true), true, tj3Var, (i2 & 14) | 3072 | ((i2 >> 3) & 112), 0);
            vs3 vs3Var = sxaVar.f61570i;
            TokenStatus tokenStatusM24984c = y7d.m24984c(sxaVar.f61568g, sxaVar.f61569h);
            boolean z = (i2 & 7168) == 2048;
            Object objM22097O = tj3Var.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new v4a(vi3Var, 18);
                tj3Var.m22131l0(objM22097O);
            }
            kid.m15265a(vs3Var, tokenStatusM24984c, (vi3) objM22097O, c99.m4426s(new opa(nj0.f52789H), 168.0f), tj3Var, 0);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new f0b(sxaVar, ui3Var, ui3Var2, vi3Var, i);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m11757g(ArrayList arrayList, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2007801849);
        int i2 = 2;
        int i3 = (tj3Var.m22124i(arrayList) ? 4 : 2) | i;
        if (tj3Var.m22099R(i3 & 1, (i3 & 3) != 2)) {
            zf1 zf1Var = ge9.f40637a;
            AbstractC3423or.m18244b(null, new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38955d, true, new gm5(28)), new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38955d, true, new gm5(28)), null, 0, 0, ci8.m4703P(-1486298580, new iq8(arrayList, 10), tj3Var), tj3Var, 1572864, 57);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new i04(arrayList, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:50:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public static final void m11758h(sxa sxaVar, ui3 ui3Var, e16 e16Var, boolean z, ye1 ye1Var, int i, int i2) {
        boolean z2;
        boolean z3;
        tj3 tj3Var;
        boolean z4;
        x18 x18VarM22143u;
        boolean z5;
        ui3 ui3Var2;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1744031797);
        int i3 = (tj3Var2.m22124i(sxaVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= tj3Var2.m22124i(ui3Var) ? 32 : 16;
        }
        int i4 = i3 | (tj3Var2.m22120g(e16Var) ? 256 : 128);
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i4 |= tj3Var2.m22122h(z2) ? 2048 : 1024;
            }
            if ((i4 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var2.m22099R(i4 & 1, z3)) {
                if (i5 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var2.m22128k(ge9.f40637a)).f38955d, true, new gm5(28)), nj0.f52791J, tj3Var2, 0);
                int iHashCode = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m = tj3Var2.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16Var);
                se1.f60731q.getClass();
                ui3Var2 = C0352b.f4299b;
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var2);
                } else {
                    tj3Var2.m22137o0();
                }
                zi3 zi3Var = C0352b.f4303f;
                oha.m18001g(tj3Var2, zi3Var, bb1VarM230a);
                zi3 zi3Var2 = C0352b.f4302e;
                oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
                Integer numValueOf = Integer.valueOf(iHashCode);
                zi3 zi3Var3 = C0352b.f4304g;
                oha.m18001g(tj3Var2, zi3Var3, numValueOf);
                vi3 vi3Var = C0352b.f4305h;
                oha.m18000f(tj3Var2, vi3Var);
                zi3 zi3Var4 = C0352b.f4301d;
                oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
                sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var2, 0);
                int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m2 = tj3Var2.m22132m();
                b16 b16Var = b16.f7762a;
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, b16Var);
                tj3Var2.m22119f0();
                int i6 = i4;
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var2);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a);
                oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var);
                oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
                String str = sxaVar.f61564c;
                ArrayList arrayList = sxaVar.f61567f;
                vh9 vh9Var = ps5.f56764b;
                lw9.m16554b(str, c99.m4430w(b16Var, null, 3), ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71406j, tj3Var2, 48, 0, 131064);
                m11759i((i6 >> 3) & 14, tj3Var2, ui3Var, new opa(nj0.f52789H));
                tj3Var2.m22139q(true);
                lw9.m16554b(sxaVar.f61565d, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71407k, tj3Var2, 0, 0, 131066);
                tj3Var = tj3Var2;
                if (z5 || arrayList.isEmpty()) {
                    tj3Var.m22111b0(1625936835);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(1625882058);
                    m11757g(arrayList, tj3Var, 0);
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(true);
                z4 = z5;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                z4 = z2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new co5(sxaVar, ui3Var, e16Var, z4, i, i2);
            }
        }
        i4 |= 3072;
        z2 = z;
        if ((i4 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tj3Var2.m22099R(i4 & 1, z3)) {
            if (i5 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            bb1 bb1VarM230a2 = ab1.m230a(new C3661uu(((fe9) tj3Var2.m22128k(ge9.f40637a)).f38955d, true, new gm5(28)), nj0.f52791J, tj3Var2, 0);
            int iHashCode3 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m3 = tj3Var2.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var2, e16Var);
            se1.f60731q.getClass();
            ui3Var2 = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var2);
            } else {
                tj3Var2.m22137o0();
            }
            zi3 zi3Var5 = C0352b.f4303f;
            oha.m18001g(tj3Var2, zi3Var5, bb1VarM230a2);
            zi3 zi3Var6 = C0352b.f4302e;
            oha.m18001g(tj3Var2, zi3Var6, l77VarM22132m3);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            zi3 zi3Var7 = C0352b.f4304g;
            oha.m18001g(tj3Var2, zi3Var7, numValueOf2);
            vi3 vi3Var2 = C0352b.f4305h;
            oha.m18000f(tj3Var2, vi3Var2);
            zi3 zi3Var8 = C0352b.f4301d;
            oha.m18001g(tj3Var2, zi3Var8, e16VarM1322c3);
            sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var2, 0);
            int iHashCode4 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m4 = tj3Var2.m22132m();
            b16 b16Var2 = b16.f7762a;
            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var2, b16Var2);
            tj3Var2.m22119f0();
            int i7 = i4;
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var2);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var5, sj8VarM20003a2);
            oha.m18001g(tj3Var2, zi3Var6, l77VarM22132m4);
            AbstractC3393o1.m17747v(iHashCode4, tj3Var2, zi3Var7, tj3Var2, vi3Var2);
            oha.m18001g(tj3Var2, zi3Var8, e16VarM1322c4);
            String str2 = sxaVar.f61564c;
            ArrayList arrayList2 = sxaVar.f61567f;
            vh9 vh9Var2 = ps5.f56764b;
            lw9.m16554b(str2, c99.m4430w(b16Var2, null, 3), ((ms5) tj3Var2.m22128k(vh9Var2)).f51799a.f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var2)).f51800b.f71406j, tj3Var2, 48, 0, 131064);
            m11759i((i7 >> 3) & 14, tj3Var2, ui3Var, new opa(nj0.f52789H));
            tj3Var2.m22139q(true);
            lw9.m16554b(sxaVar.f61565d, null, ((ms5) tj3Var2.m22128k(vh9Var2)).f51799a.f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var2)).f51800b.f71407k, tj3Var2, 0, 0, 131066);
            tj3Var = tj3Var2;
            if (z5) {
                tj3Var.m22111b0(1625936835);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1625936835);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
            z4 = z5;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            z4 = z2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new co5(sxaVar, ui3Var, e16Var, z4, i, i2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m11759i(int i, ye1 ye1Var, ui3 ui3Var, e16 e16Var) {
        int i2;
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1673344112);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22124i(ui3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22120g(e16Var) ? 32 : 16;
        }
        int i3 = i2;
        if (tj3Var2.m22099R(i3 & 1, (i3 & 19) != 18)) {
            zf1 zf1Var = ge9.f40637a;
            tj3Var = tj3Var2;
            omd.m18141c(ui3Var, c99.m4422o(AbstractC3584sr.m21611X(e16Var, ((fe9) tj3Var2.m22128k(zf1Var)).f38952a, 0.0f, 0.0f, 0.0f, 14), ((fe9) tj3Var2.m22128k(zf1Var)).f38957f), false, null, null, tsc.f62835a, tj3Var, (i3 & 14) | 1572864, 60);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new d0b(i, ui3Var, e16Var);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: j */
    public static final int m11760j(FeedTopic feedTopic) {
        String str;
        feedTopic.getClass();
        switch (ri2.f59348a[feedTopic.ordinal()]) {
            case 1:
                str = "feed_topics_books";
                break;
            case 2:
                str = "feed_topics_food";
                break;
            case 3:
                str = "feed_topics_podcasts";
                break;
            case 4:
                str = "feed_topics_news";
                break;
            case 5:
                str = "feed_topics_business";
                break;
            case 6:
                str = "feed_topics_entertainment";
                break;
            case 7:
                str = "feed_topics_sports";
                break;
            case 8:
                str = "feed_topics_technology";
                break;
            case 9:
                str = "feed_topics_pronunciation";
                break;
            case 10:
                str = "feed_topics_grammar";
                break;
            case 11:
                str = "feed_topics_health";
                break;
            case 12:
                str = "feed_topics_science";
                break;
            case 13:
                str = "feed_topics_self_help";
                break;
            case 14:
                str = "feed_topics_culture";
                break;
            case 15:
                str = "feed_topics_travel";
                break;
            case 16:
                str = "feed_topics_politics";
                break;
            case 17:
                str = "feed_topics_language";
                break;
            case 18:
                str = "feed_topics_kids";
                break;
            case 19:
                str = "feed_topics_history";
                break;
            case 20:
                str = "feed_topics_song";
                break;
            case 21:
                str = "feed_topics_youtubers";
                break;
            default:
                gm5.m12750e();
                return 0;
        }
        switch (str.hashCode()) {
            case -1849636488:
                if (str.equals("feed_topics_food")) {
                    return R$string.feed_topics_food;
                }
                break;
            case -1849493625:
                if (str.equals("feed_topics_kids")) {
                    return R$string.feed_topics_kids;
                }
                break;
            case -1849407507:
                if (str.equals("feed_topics_news")) {
                    return R$string.feed_topics_news;
                }
                break;
            case -1849249233:
                if (str.equals("feed_topics_song")) {
                    return R$string.feed_topics_song;
                }
                break;
            case -1507850032:
                if (str.equals("feed_topics_books")) {
                    return R$string.feed_topics_books;
                }
                break;
            case -1424335795:
                if (str.equals("feed_topics_grammar")) {
                    return R$string.feed_topics_grammar;
                }
                break;
            case -1316986934:
                if (str.equals("feed_topics_youtubers")) {
                    return R$string.feed_topics_youtubers;
                }
                break;
            case -990544375:
                if (str.equals("feed_topics_podcasts")) {
                    return R$string.feed_topics_podcasts;
                }
                break;
            case -777660102:
                if (str.equals("feed_topics_history")) {
                    return R$string.feed_topics_history;
                }
                break;
            case -755414149:
                if (str.equals("feed_topics_politics")) {
                    return R$string.feed_topics_politics;
                }
                break;
            case -583120300:
                if (str.equals("feed_topics_culture")) {
                    return R$string.feed_topics_culture;
                }
                break;
            case 213487370:
                if (str.equals("feed_topics_science")) {
                    return R$string.feed_topics_science;
                }
                break;
            case 425393019:
                if (str.equals("feed_topics_pronunciation")) {
                    return R$string.feed_topics_pronunciation;
                }
                break;
            case 446203558:
                if (str.equals("feed_topics_technology")) {
                    return R$string.feed_topics_technology;
                }
                break;
            case 663412982:
                if (str.equals("feed_topics_health")) {
                    return R$string.feed_topics_health;
                }
                break;
            case 871025530:
                if (str.equals("feed_topics_self_help")) {
                    return R$string.feed_topics_self_help;
                }
                break;
            case 988915225:
                if (str.equals("feed_topics_sports")) {
                    return R$string.feed_topics_sports;
                }
                break;
            case 1018977716:
                if (str.equals("feed_topics_travel")) {
                    return R$string.feed_topics_travel;
                }
                break;
            case 1378562930:
                if (str.equals("feed_topics_language")) {
                    return R$string.feed_topics_language;
                }
                break;
            case 1446436782:
                if (str.equals("feed_topics_entertainment")) {
                    return R$string.feed_topics_entertainment;
                }
                break;
            case 1845321690:
                if (str.equals("feed_topics_business")) {
                    return R$string.feed_topics_business;
                }
                break;
        }
        return R$string.feed_topics_books;
    }
}
