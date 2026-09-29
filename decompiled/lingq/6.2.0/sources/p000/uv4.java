package p000;

import androidx.compose.foundation.lazy.layout.C0139h;
import androidx.compose.foundation.lazy.staggeredgrid.C0144d;

/* JADX INFO: loaded from: classes.dex */
public final class uv4 implements yt4 {

    /* JADX INFO: renamed from: a */
    public final C0144d f64400a;

    /* JADX INFO: renamed from: b */
    public final tv4 f64401b;

    /* JADX INFO: renamed from: c */
    public final C0139h f64402c;

    public uv4(C0144d c0144d, tv4 tv4Var, C0139h c0139h) {
        this.f64400a = c0144d;
        this.f64401b = tv4Var;
        this.f64402c = c0139h;
    }

    @Override // p000.yt4
    /* JADX INFO: renamed from: a */
    public final int mo15745a() {
        return this.f64401b.mo997d().f41171b;
    }

    @Override // p000.yt4
    /* JADX INFO: renamed from: b */
    public final void mo15746b(int i, Object obj, ye1 ye1Var, int i2) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(89098518);
        int i3 = 2;
        int i4 = (tj3Var.m22116e(i) ? 4 : 2) | i2 | (tj3Var.m22124i(obj) ? 32 : 16) | (tj3Var.m22120g(this) ? 256 : 128);
        if (tj3Var.m22099R(i4 & 1, (i4 & 147) != 146)) {
            bna.m3938a(obj, i, this.f64400a.f2616s, ci8.m4703P(608834466, new ks4(this, i, i3), tj3Var), tj3Var, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3504qn(i, i2, 9, this, obj);
        }
    }

    @Override // p000.yt4
    /* JADX INFO: renamed from: c */
    public final Object mo15747c(int i) {
        Object objM1019b = this.f64402c.m1019b(i);
        return objM1019b == null ? this.f64401b.m998e(i) : objM1019b;
    }

    @Override // p000.yt4
    /* JADX INFO: renamed from: d */
    public final Object mo16527d(int i) {
        return this.f64401b.m996c(i);
    }

    @Override // p000.yt4
    /* JADX INFO: renamed from: e */
    public final int mo15748e(Object obj) {
        return this.f64402c.m1018a(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv4)) {
            return false;
        }
        return fa4.m11650l(this.f64401b, ((uv4) obj).f64401b);
    }

    public final int hashCode() {
        return this.f64401b.hashCode();
    }
}
