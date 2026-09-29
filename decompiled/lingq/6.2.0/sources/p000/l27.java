package p000;

import androidx.compose.foundation.lazy.layout.AbstractC0133b;
import androidx.compose.foundation.lazy.layout.C0139h;
import androidx.compose.foundation.pager.AbstractC0150d;

/* JADX INFO: loaded from: classes.dex */
public final class l27 implements yt4 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0150d f48939a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0133b f48940b;

    /* JADX INFO: renamed from: c */
    public final C0139h f48941c;

    public l27(AbstractC0150d abstractC0150d, k27 k27Var, C0139h c0139h) {
        this.f48939a = abstractC0150d;
        this.f48940b = k27Var;
        this.f48941c = c0139h;
    }

    @Override // p000.yt4
    /* JADX INFO: renamed from: a */
    public final int mo15745a() {
        return this.f48940b.mo997d().f41171b;
    }

    @Override // p000.yt4
    /* JADX INFO: renamed from: b */
    public final void mo15746b(int i, Object obj, ye1 ye1Var, int i2) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1201380429);
        int i3 = (tj3Var.m22116e(i) ? 4 : 2) | i2 | (tj3Var.m22124i(obj) ? 32 : 16) | (tj3Var.m22120g(this) ? 256 : 128);
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            bna.m3938a(obj, i, this.f48939a.f2664A, ci8.m4703P(1142237095, new ks4(this, i, 3), tj3Var), tj3Var, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3504qn(i, i2, 11, this, obj);
        }
    }

    @Override // p000.yt4
    /* JADX INFO: renamed from: c */
    public final Object mo15747c(int i) {
        Object objM1019b = this.f48941c.m1019b(i);
        return objM1019b == null ? this.f48940b.m998e(i) : objM1019b;
    }

    @Override // p000.yt4
    /* JADX INFO: renamed from: e */
    public final int mo15748e(Object obj) {
        return this.f48941c.m1018a(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l27)) {
            return false;
        }
        return fa4.m11650l(this.f48940b, ((l27) obj).f48940b);
    }

    public final int hashCode() {
        return this.f48940b.hashCode();
    }
}
