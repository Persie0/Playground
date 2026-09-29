package p000;

import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.feature.challenges.R$string;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t4d {
    /* JADX INFO: renamed from: a */
    public static final void m21840a(de0 de0Var, vi3 vi3Var, vi3 vi3Var2, vi3 vi3Var3, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-250416461);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(de0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(vi3Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22124i(vi3Var3) ? 2048 : 1024;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            bq1.m4039O(c99.m4412e(b16.f7762a, 1.0f), null, null, null, null, ci8.m4703P(-116983423, new C3357n2(vi3Var3, de0Var, vi3Var2, vi3Var), tj3Var), tj3Var, 196614, 30);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3522r4(de0Var, vi3Var, vi3Var2, vi3Var3, i, 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m21841b(ef0 ef0Var, boolean z, ui3 ui3Var, vi3 vi3Var, vi3 vi3Var2, vi3 vi3Var3, ui3 ui3Var2, ye1 ye1Var, int i) {
        vi3 vi3Var4;
        vi3 vi3Var5;
        vi3 vi3Var6;
        ui3 ui3Var3;
        ef0Var.getClass();
        List list = ef0Var.f37159a;
        ui3Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        vi3Var3.getClass();
        ui3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1016563934);
        int i2 = (tj3Var.m22124i(ef0Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22122h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            vi3Var4 = vi3Var;
            i2 |= tj3Var.m22124i(vi3Var4) ? 2048 : 1024;
        } else {
            vi3Var4 = vi3Var;
        }
        if ((i & 24576) == 0) {
            vi3Var5 = vi3Var2;
            i2 |= tj3Var.m22124i(vi3Var5) ? 16384 : 8192;
        } else {
            vi3Var5 = vi3Var2;
        }
        if ((196608 & i) == 0) {
            vi3Var6 = vi3Var3;
            i2 |= tj3Var.m22124i(vi3Var6) ? 131072 : 65536;
        } else {
            vi3Var6 = vi3Var3;
        }
        if ((1572864 & i) == 0) {
            ui3Var3 = ui3Var2;
            i2 |= tj3Var.m22124i(ui3Var3) ? 1048576 : 524288;
        } else {
            ui3Var3 = ui3Var2;
        }
        if (tj3Var.m22099R(i2 & 1, (599187 & i2) != 599186)) {
            List listM22615g1 = z ? list : u91.m22615g1(list, 3);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
            se1.f60731q.getClass();
            ui3 ui3Var4 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var4);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            ss5.m21708e(((i2 << 9) & 458752) | 1572870, 30, null, tj3Var, ui3Var, anb.f932a, c99.m4412e(b16Var, 1.0f), null, null, false);
            tj3Var.m22111b0(-1168795586);
            Iterator it = listM22615g1.iterator();
            while (it.hasNext()) {
                tj3 tj3Var2 = tj3Var;
                m21840a((de0) it.next(), vi3Var4, vi3Var5, vi3Var6, tj3Var2, (i2 >> 6) & 8176);
                vi3Var4 = vi3Var;
                vi3Var5 = vi3Var2;
                vi3Var6 = vi3Var3;
                tj3Var = tj3Var2;
            }
            tj3Var.m22139q(false);
            if (z || list.size() <= listM22615g1.size()) {
                tj3Var.m22111b0(-1872379878);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-1872605062);
                AbstractC0231g.m1153f(((i2 >> 18) & 14) | 805306368, 508, null, tj3Var, ui3Var3, anb.f933b, new gv3(nj0.f52792K), null, null, false);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new he0(ef0Var, z, ui3Var, vi3Var, vi3Var2, vi3Var3, ui3Var2, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m21842c(List list, Set set, vi3 vi3Var, ye1 ye1Var, int i) {
        List list2 = list;
        list2.getClass();
        set.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1674440275);
        int i2 = i | (tj3Var.m22124i(list2) ? 4 : 2) | (tj3Var.m22124i(set) ? 32 : 16) | (tj3Var.m22124i(vi3Var) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            zf1 zf1Var = ge9.f40637a;
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38952a, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16.f7762a);
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
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.challenge_filter_languages), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71404h, tj3Var, 0, 0, 131070);
            tj3Var = tj3Var;
            list2 = list;
            AbstractC3423or.m18244b(null, new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38952a, true, new gm5(28)), null, null, 0, 0, ci8.m4703P(-1806698296, new ie0(list2, set, vi3Var, 0), tj3Var), tj3Var, 1572864, 61);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new fe0(list2, set, vi3Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m21843d(int i, int i2, ye1 ye1Var, ui3 ui3Var, e16 e16Var) {
        ui3 ui3Var2;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2144730963);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= tj3Var.m22116e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= tj3Var.m22124i(ui3Var) ? 256 : 128;
        }
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            ui3Var2 = ui3Var;
            l5d.m15820a(null, 0.0f, ui3Var2, ci8.m4703P(978393876, new d00(i, ui3Var), tj3Var), tj3Var, (i3 & 896) | 3072);
            e16Var = b16.f7762a;
        } else {
            ui3Var2 = ui3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new en5(e16Var, i, ui3Var2, i2);
        }
    }
}
