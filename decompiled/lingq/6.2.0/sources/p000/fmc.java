package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.token.TokenRelatedPhrase;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fmc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f39314a = new C0282a(-1637627108, false, new be1(23));

    /* JADX INFO: renamed from: b */
    public static final C0282a f39315b = new C0282a(-255680787, false, new be1(24));

    /* JADX INFO: renamed from: c */
    public static final C0282a f39316c = new C0282a(1965053355, false, new be1(25));

    /* JADX INFO: renamed from: a */
    public static final void m11946a(TokenRelatedPhrase tokenRelatedPhrase, ui3 ui3Var, ye1 ye1Var, int i) {
        tokenRelatedPhrase.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1712380861);
        int i2 = (tj3Var.m22124i(tokenRelatedPhrase) ? 4 : 2) | i | (tj3Var.m22124i(ui3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            lw9.m16554b(tokenRelatedPhrase.f19612a, AbstractC0080f.m815b(null, false, ui3Var, AbstractC3584sr.m21607T(d32.m10007D(AbstractC3584sr.m21609V(AbstractC3584sr.m21609V(b16.f7762a, ge9.m12515a(tj3Var).f38965n, 0.0f, 2), 0.0f, ge9.m12515a(tj3Var).f38955d, 1), p58.m18900f(tj3Var).f55823H, p58.m18901i(tj3Var).f64856b), ge9.m12515a(tj3Var).f38955d), 15), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, 0, 0, 131068);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wa5(tokenRelatedPhrase, i, 21, ui3Var);
        }
    }
}
