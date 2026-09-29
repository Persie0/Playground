package p000;

import androidx.compose.p002ui.window.AbstractC0456d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u1d {
    /* JADX INFO: renamed from: a */
    public static final void m22390a(boolean z, e28 e28Var, String str, vi3 vi3Var, vi3 vi3Var2, ui3 ui3Var, ye1 ye1Var, int i, int i2) {
        int i3;
        vi3 vi3Var3;
        int i4;
        vi3 vi3Var4;
        e28Var.getClass();
        str.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(992796644);
        if ((i & 6) == 0) {
            i3 = i | (tj3Var.m22122h(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i3 | (tj3Var.m22120g(e28Var) ? 32 : 16) | (tj3Var.m22120g(str) ? 256 : 128) | (tj3Var.m22124i(vi3Var) ? 2048 : 1024);
        int i6 = i2 & 16;
        if (i6 != 0) {
            i4 = i5 | 24576;
            vi3Var3 = vi3Var2;
        } else {
            vi3Var3 = vi3Var2;
            i4 = i5 | (tj3Var.m22124i(vi3Var3) ? 16384 : 8192);
        }
        int i7 = i4 | (tj3Var.m22124i(ui3Var) ? 131072 : 65536);
        if (tj3Var.m22099R(i7 & 1, (74899 & i7) != 74898)) {
            vi3 vi3Var5 = i6 != 0 ? null : vi3Var3;
            if (z) {
                tj3Var.m22111b0(1260303622);
                AbstractC0456d.m1897a(new vqb(e28Var), ui3Var, null, ci8.m4703P(1914650251, new C2919d9(vi3Var, str, ui3Var, vi3Var5), tj3Var), tj3Var, ((i7 >> 12) & 112) | 3072, 4);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1261403006);
                tj3Var.m22139q(false);
            }
            vi3Var4 = vi3Var5;
        } else {
            tj3Var.m22102U();
            vi3Var4 = vi3Var3;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new a65(z, e28Var, str, vi3Var, vi3Var4, ui3Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m22391b(int i) {
        if (i != -1) {
            return i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }
}
