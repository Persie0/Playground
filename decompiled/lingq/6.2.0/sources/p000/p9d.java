package p000;

import android.content.Context;
import android.util.Log;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.draw.AbstractC0294a;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.p012ui.R$string;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p9d {
    /* JADX INFO: renamed from: a */
    public static final void m18995a(int i, ye1 ye1Var, ui3 ui3Var, e16 e16Var) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-516398586);
        int i2 = (tj3Var2.m22120g(e16Var) ? 4 : 2) | i | (tj3Var2.m22124i(ui3Var) ? 32 : 16);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 19) != 18)) {
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(e16Var, ((fe9) tj3Var2.m22128k(zf1Var)).f38955d, 0.0f, 0.0f, ((fe9) tj3Var2.m22128k(zf1Var)).f38955d, 6);
            boolean z = (i2 & 112) == 32;
            Object objM22097O = tj3Var2.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new zy7(16, ui3Var);
                tj3Var2.m22131l0(objM22097O);
            }
            e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM21611X, 15);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM815b);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var2);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var2, C0352b.f4305h);
            oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
            gc0 gc0Var = nj0.f52812g;
            ci0 ci0Var = ci0.f10109a;
            b16 b16Var = b16.f7762a;
            qh0.m19963a(AbstractC0294a.m1342a(c99.m4422o(d32.m10007D(pb1.m19045o(ci0Var.mo3727a(b16Var, gc0Var), ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51801c.f64856b), d32.m10035e(301989887), ss5.f61356d), 24.0f)), tj3Var2, 0);
            tj3Var = tj3Var2;
            ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_close_s, tj3Var2, 0), vz1.m23620a0(tj3Var2, R$string.ui_close), AbstractC3584sr.m21607T(ci0Var.mo3727a(c99.m4422o(b16Var, 22.0f), gc0Var), 2.0f), ((bx2) tj3Var2.m22128k(cx2.f34676a)).m4210c(), tj3Var, 8, 0);
            tj3Var.m22139q(true);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ov1(i, ui3Var, e16Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m18996b(e16 e16Var, String str, boolean z, ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i, int i2) {
        int i3;
        str.getClass();
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-632557954);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (tj3Var.m22120g(e16Var) ? 4 : 2);
        }
        int i5 = i3 | (tj3Var.m22120g(str) ? 32 : 16) | (tj3Var.m22122h(z) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024) | (tj3Var.m22124i(ui3Var2) ? 16384 : 8192);
        if (tj3Var.m22099R(i5 & 1, (i5 & 9363) != 9362)) {
            if (i4 != 0) {
                e16Var = b16.f7762a;
            }
            e16 e16VarM4412e = c99.m4412e(e16Var, 1.0f);
            boolean z2 = (i5 & 7168) == 2048;
            Object objM22097O = tj3Var.m22097O();
            if (z2 || objM22097O == we1.f66679a) {
                objM22097O = new zy7(17, ui3Var);
                tj3Var.m22131l0(objM22097O);
            }
            bq1.m4039O(AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM4412e, 15), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64858d, null, te1.m22000n(62, 0.0f), null, ci8.m4703P(54886092, new xh3(str, z, ui3Var2, 7), tj3Var), tj3Var, 196608, 20);
        } else {
            tj3Var.m22102U();
        }
        e16 e16Var2 = e16Var;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new be7(e16Var2, str, z, ui3Var, ui3Var2, i, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m18997c(Context context, Throwable th) {
        try {
            lda.m16130p(context);
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }
}
