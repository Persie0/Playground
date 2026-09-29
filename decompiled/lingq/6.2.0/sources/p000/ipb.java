package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ipb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f44411a = new C0282a(-88243348, false, new nd1(2));

    /* JADX INFO: renamed from: b */
    public static final C0282a f44412b = new C0282a(-188537675, false, new ld1(25));

    /* JADX INFO: renamed from: c */
    public static final C0282a f44413c = new C0282a(726169489, false, new ld1(26));

    /* JADX INFO: renamed from: a */
    public static final void m14072a(int i, ye1 ye1Var, ui3 ui3Var, e16 e16Var, List list) {
        e16 e16Var2;
        list.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-39591713);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM815b = AbstractC0080f.m815b(null, false, ui3Var, c99.m4412e(b16Var, 1.0f), 15);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21608U = AbstractC3584sr.m21608U(e16VarM815b, ((fe9) tj3Var.m22128k(zf1Var)).f38956e, ((fe9) tj3Var.m22128k(zf1Var)).f38952a);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
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
            List list2 = list;
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = new ry4(28);
                tj3Var.m22131l0(objM22097O);
            }
            String strM22596N0 = u91.m22596N0(list2, "; ", null, null, (vi3) objM22097O, 30);
            as4 as4Var = new as4(1.0f, true);
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(strM22596N0, as4Var, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j, tj3Var, 0, 0, 131064);
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new y35(i, 3, e16Var2, list, ui3Var);
        }
    }
}
