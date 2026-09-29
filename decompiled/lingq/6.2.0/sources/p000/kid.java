package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.status.TokenStatus;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kid {
    /* JADX INFO: renamed from: a */
    public static final void m15265a(vs3 vs3Var, TokenStatus tokenStatus, vi3 vi3Var, e16 e16Var, ye1 ye1Var, int i) {
        vs3 vs3Var2 = vs3Var;
        vs3Var2.getClass();
        tokenStatus.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1416258105);
        int i2 = 2;
        int i3 = (i & 6) == 0 ? (tj3Var.m22124i(vs3Var2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22116e(tokenStatus.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var.m22124i(vi3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= tj3Var.m22120g(e16Var) ? 2048 : 1024;
        }
        boolean z = true;
        if (tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            float f = 1.0f;
            e16 e16VarM4412e = c99.m4412e(e16Var, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37243i, nj0.f52817l, tj3Var, 6);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            tj3Var.m22111b0(813339316);
            ys2<TokenStatus> entries = TokenStatus.getEntries();
            ArrayList arrayList = new ArrayList(v91.m23189q0(entries, 10));
            for (TokenStatus tokenStatus2 : entries) {
                yd5 yd5Var = vs3Var2.f65847c;
                boolean z2 = tokenStatus == tokenStatus2 ? z : false;
                e16 e16VarM21995i = te1.m21995i(f, AbstractC3584sr.m21609V(new as4(f, z), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38954c, 0.0f, i2), z);
                boolean zM22116e = tj3Var.m22116e(tokenStatus2.ordinal()) | ((i3 & 896) == 256 ? z : false);
                Object objM22097O = tj3Var.m22097O();
                if (zM22116e || objM22097O == we1.f66679a) {
                    objM22097O = new pw4(vi3Var, tokenStatus2, 0);
                    tj3Var.m22131l0(objM22097O);
                }
                l4d.m15802b(e16VarM21995i, tokenStatus2, yd5Var, z2, (ui3) objM22097O, tj3Var, 0, 0);
                arrayList.add(xfa.f68157a);
                i2 = 2;
                f = 1.0f;
                z = z;
                vs3Var2 = vs3Var;
            }
            tj3Var.m22139q(false);
            tj3Var.m22139q(z);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3522r4(vs3Var, tokenStatus, vi3Var, e16Var, i, 13);
        }
    }
}
