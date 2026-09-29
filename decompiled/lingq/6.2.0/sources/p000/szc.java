package p000;

import android.graphics.Rect;
import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class szc {
    /* JADX INFO: renamed from: a */
    public static final void m21802a(fq8 fq8Var, vi3 vi3Var, e16 e16Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        fq8 fq8Var2 = fq8Var;
        String str = fq8Var2.f39490b;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(940546825);
        int i2 = i | (tj3Var.m22120g(fq8Var2) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            boolean zM22120g = tj3Var.m22120g(str);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(str);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            String str2 = (String) t66Var.getValue();
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            vh9 vh9Var = ps5.f56764b;
            vx9 vx9Var = ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j;
            hj4 hj4Var = new hj4(1, 3, null, 115);
            long j = aa1.f411j;
            eu9 eu9VarM16905h = mkd.m16905h(0L, 0L, j, j, j, tj3Var, 2147469311);
            si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c;
            boolean zM22120g2 = tj3Var.m22120g(t66Var) | ((i3 & 112) == 32);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O2 == p84Var) {
                objM22097O2 = new ix0(vi3Var, t66Var, 14);
                tj3Var.m22131l0(objM22097O2);
            }
            fq8Var2 = fq8Var;
            q6d.m19686c(str2, (vi3) objM22097O2, e16VarM4412e, false, vx9Var, null, ci8.m4703P(711529860, new ht6(fq8Var2, 17), tj3Var), skc.f60963a, null, null, false, null, hj4Var, null, true, 0, 0, si8Var, eu9VarM16905h, tj3Var, 113246208, 12779520, 1932888);
            tj3Var = tj3Var;
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new y35(i, 12, fq8Var2, vi3Var, e16Var2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C3395o3 m21803b() {
        if (C3395o3.f53748e == null) {
            C3395o3 c3395o3 = new C3395o3();
            new Rect();
            C3395o3.f53748e = c3395o3;
        }
        C3395o3 c3395o4 = C3395o3.f53748e;
        c3395o4.getClass();
        return c3395o4;
    }
}
