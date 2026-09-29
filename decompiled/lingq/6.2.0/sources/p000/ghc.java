package p000;

import android.content.Context;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ghc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f40838a = new C0282a(111747821, false, new zd1(16));

    /* JADX INFO: renamed from: b */
    public static final C0282a f40839b = new C0282a(987631190, false, new zd1(17));

    /* JADX INFO: renamed from: c */
    public static final C0282a f40840c = new C0282a(1536171412, false, new zd1(18));

    /* JADX INFO: renamed from: a */
    public static final void m12667a(e16 e16Var, fm7 fm7Var, ui3 ui3Var, ui3 ui3Var2, vi3 vi3Var, ye1 ye1Var, int i) {
        fm7Var.getClass();
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-46926100);
        int i2 = i | 6 | (tj3Var.m22124i(fm7Var) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128) | (tj3Var.m22124i(ui3Var2) ? 2048 : 1024) | (tj3Var.m22124i(vi3Var) ? 16384 : 8192);
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            l5d.m15820a(null, 0.0f, ui3Var2, ci8.m4703P(1044341587, new zs0(ui3Var2, fm7Var, ui3Var, (t66) objM22097O, vi3Var, context), tj3Var), tj3Var, ((i2 >> 3) & 896) | 3072);
            e16Var = b16.f7762a;
        } else {
            tj3Var.m22102U();
        }
        e16 e16Var2 = e16Var;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new xy0(e16Var2, fm7Var, ui3Var, ui3Var2, vi3Var, i);
        }
    }
}
