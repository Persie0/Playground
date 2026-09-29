package p000;

import androidx.compose.material3.AbstractC0218a;
import androidx.compose.p002ui.input.nestedscroll.AbstractC0319c;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zhd {
    /* JADX INFO: renamed from: a */
    public static final void m25663a(String str, g80 g80Var, ui3 ui3Var, ye1 ye1Var, int i, int i2) {
        int i3;
        ui3 ui3Var2;
        int i4;
        ui3 ui3Var3;
        ui3 ui3Var4;
        g80Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2136529366);
        if ((i & 6) == 0) {
            i3 = i | (tj3Var.m22120g(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i3 | (tj3Var.m22120g(g80Var) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i4 = i5 | 384;
            ui3Var2 = ui3Var;
        } else {
            ui3Var2 = ui3Var;
            i4 = i5 | (tj3Var.m22124i(ui3Var2) ? 256 : 128);
        }
        int i7 = 0;
        int i8 = 1;
        if (tj3Var.m22099R(i4 & 1, (i4 & 147) != 146)) {
            if (i6 != 0) {
                Object objM22097O = tj3Var.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = new C3288l7(7);
                    tj3Var.m22131l0(objM22097O);
                }
                ui3Var4 = (ui3) objM22097O;
            } else {
                ui3Var4 = ui3Var2;
            }
            x17 x17Var = h7a.f41916a;
            rv2 rv2VarM13115b = h7a.m13115b(AbstractC0218a.m1129i(tj3Var), tj3Var);
            b34.m3232b(AbstractC0319c.m1450a(b16.f7762a, rv2VarM13115b.f59847e, null), ci8.m4703P(-1386992998, new mn4(rv2VarM13115b, str, ui3Var4, i8), tj3Var), null, null, null, 0, 0L, 0L, null, ci8.m4703P(1919225445, new on4(g80Var, i7), tj3Var), tj3Var, 805306416, 508);
            ui3Var3 = ui3Var4;
        } else {
            tj3Var.m22102U();
            ui3Var3 = ui3Var2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new dz1(str, g80Var, ui3Var3, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m25664b(t17 t17Var, g80 g80Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-912600097);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(t17Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22120g(g80Var) ? 32 : 16;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            boolean z = g80Var instanceof f80;
            b16 b16Var = b16.f7762a;
            if (z) {
                tj3Var.m22111b0(-126317007);
                List list = ((f80) g80Var).f38606a;
                zf1 zf1Var = ge9.f40637a;
                e16 e16VarM4411d = c99.m4411d(AbstractC3584sr.m21610W(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, t17Var.mo14021d(), ((fe9) tj3Var.m22128k(zf1Var)).f38960i, t17Var.mo14018a()), 1.0f);
                wp3 wp3Var = new wp3();
                if (xj2.m24559a(150.0f, 0.0f) <= 0) {
                    l54.m15814a("Provided min size should be larger than zero.");
                }
                boolean zM22124i = tj3Var.m22124i(list);
                Object objM22097O = tj3Var.m22097O();
                if (zM22124i || objM22097O == we1.f66679a) {
                    objM22097O = new bz0(4, list);
                    tj3Var.m22131l0(objM22097O);
                }
                ss5.m21706d(wp3Var, e16VarM4411d, null, null, null, null, null, false, null, (vi3) objM22097O, tj3Var, 0);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-125387038);
                e16 e16VarM4414g = c99.m4414g(c99.m4426s(b16Var, 120.0f), 30.0f);
                vh9 vh9Var = ps5.f56764b;
                qh0.m19963a(x74.m24341H(pb1.m19045o(e16VarM4414g, ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64858d)), tj3Var, 0);
                thb.m22044c(tj3Var, c99.m4414g(b16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e));
                qh0.m19963a(x74.m24341H(pb1.m19045o(c99.m4414g(c99.m4426s(b16Var, 190.0f), 30.0f), ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64858d)), tj3Var, 0);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(t17Var, i, 14, g80Var);
        }
    }
}
