package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.core.player.video.AbstractC1824e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nad {
    /* JADX INFO: renamed from: a */
    public static final void m17305a(tpa tpaVar, hqa hqaVar, qbb qbbVar, vi3 vi3Var, e16 e16Var, ye1 ye1Var, int i) {
        int i2;
        e16 e16Var2;
        tpaVar.getClass();
        String str = tpaVar.f62707b;
        hqaVar.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1126859261);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(tpaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22120g(hqaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22120g(qbbVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (tj3Var.m22099R(i3 & 1, (i3 & 9363) != 9362)) {
            boolean zM22120g = tj3Var.m22120g(str);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                objM22097O = AbstractC3352my.m17131l0(str);
                tj3Var.m22131l0(objM22097O);
            }
            String str2 = (String) objM22097O;
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O2);
            }
            t66 t66Var = (t66) objM22097O2;
            int length = str2.length();
            b16 b16Var = b16.f7762a;
            if (length <= 0 || !hqaVar.f42799g) {
                e16Var2 = b16Var;
                tj3Var.m22111b0(-797660641);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-799375065);
                e16 e16VarM10007D = d32.m10007D(te1.m21995i(1.7777778f, c99.m4412e(b16Var, 1.0f), false), aa1.f403b, ss5.f61356d);
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
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
                e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
                Object objM22097O3 = tj3Var.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = new tia(2, t66Var);
                    tj3Var.m22131l0(objM22097O3);
                }
                e16 e16VarM1406a = AbstractC0309d.m1406a(e16VarM4411d, (vi3) objM22097O3);
                pbb pbbVar = qbbVar.f57547a;
                float f = hqaVar.f42798f;
                ac7 ac7Var = hqaVar.f42797e;
                boolean z = !hqaVar.f42796d || hqaVar.f42795c;
                String str3 = tpaVar.f62711f;
                ui3 ui3Var2 = qbbVar.f57548b;
                int i4 = i3 & 7168;
                boolean z2 = i4 == 2048;
                Object objM22097O4 = tj3Var.m22097O();
                int i5 = 10;
                if (z2 || objM22097O4 == p84Var) {
                    objM22097O4 = new v4a(vi3Var, i5);
                    tj3Var.m22131l0(objM22097O4);
                }
                vi3 vi3Var2 = (vi3) objM22097O4;
                boolean z3 = i4 == 2048;
                Object objM22097O5 = tj3Var.m22097O();
                if (z3 || objM22097O5 == p84Var) {
                    objM22097O5 = new v4a(vi3Var, 11);
                    tj3Var.m22131l0(objM22097O5);
                }
                vi3 vi3Var3 = (vi3) objM22097O5;
                boolean z4 = i4 == 2048;
                Object objM22097O6 = tj3Var.m22097O();
                if (z4 || objM22097O6 == p84Var) {
                    objM22097O6 = new v4a(vi3Var, 12);
                    tj3Var.m22131l0(objM22097O6);
                }
                vi3 vi3Var4 = (vi3) objM22097O6;
                boolean z5 = i4 == 2048;
                Object objM22097O7 = tj3Var.m22097O();
                if (z5 || objM22097O7 == p84Var) {
                    objM22097O7 = new az0(vi3Var, t66Var, 10);
                    tj3Var.m22131l0(objM22097O7);
                }
                e16Var2 = b16Var;
                AbstractC1824e.m8502a(e16VarM1406a, str2, pbbVar, ac7Var, f, z, true, str3, ui3Var2, vi3Var2, vi3Var3, vi3Var4, (ui3) objM22097O7, tj3Var, 1572870, 0, 0);
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rb0(tpaVar, hqaVar, qbbVar, vi3Var, e16Var2, i, 9);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final long m17306b(int i, int i2) {
        long j = (((long) i) * 12) + ((long) i2);
        long j2 = j / 12;
        if (-2147483648L <= j2 && j2 <= 2147483647L) {
            return j;
        }
        C3386nv.m17624j(ux5.m22987j(i, i2, "The total number of years in ", " years and ", " months overflows an Int"));
        return 0L;
    }
}
