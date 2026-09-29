package p000;

import android.os.Build;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x4d {
    /* JADX INFO: renamed from: a */
    public static final void m24284a(e16 e16Var, int i, int i2, int i3, ye1 ye1Var, int i4) {
        gc0 gc0Var = nj0.f52812g;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(869737695);
        int i5 = i4 | (tj3Var.m22120g(e16Var) ? 4 : 2) | (tj3Var.m22116e(i) ? 32 : 16) | (tj3Var.m22116e(i2) ? 256 : 128) | (tj3Var.m22116e(i3) ? 2048 : 1024);
        if (tj3Var.m22099R(i5 & 1, (i5 & 1171) != 1170)) {
            int iMax = Math.max(0, i);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
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
            b16 b16Var = b16.f7762a;
            ci0 ci0Var = ci0.f10109a;
            if (iMax < i2) {
                tj3Var.m22111b0(-2136623250);
                m1d.m16599d(ci0Var.mo3727a(c99.m4411d(te1.m21995i(1.0f, b16Var, false), 1.0f), gc0Var), iMax, i2, i3, 0.0f, tj3Var, i5 & 8064);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-2136303795);
                m1d.m16596a(ci0Var.mo3727a(c99.m4411d(te1.m21995i(1.0f, b16Var, false), 1.0f), gc0Var), iMax, i2, i3, true, false, tj3Var, (i5 & 896) | 24576 | (i5 & 7168), 32);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new yy1(e16Var, i, i2, i3, i4, 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Integer m24285b() {
        return Integer.valueOf(Build.VERSION.SDK_INT);
    }
}
