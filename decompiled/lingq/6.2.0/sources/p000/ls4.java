package p000;

import androidx.compose.foundation.lazy.grid.C0129b;
import androidx.compose.foundation.lazy.layout.C0139h;

/* JADX INFO: loaded from: classes.dex */
public final class ls4 implements yt4 {

    /* JADX INFO: renamed from: a */
    public final C0129b f50072a;

    /* JADX INFO: renamed from: b */
    public final js4 f50073b;

    /* JADX INFO: renamed from: c */
    public final C0139h f50074c;

    public ls4(C0129b c0129b, js4 js4Var, C0139h c0139h) {
        this.f50072a = c0129b;
        this.f50073b = js4Var;
        this.f50074c = c0139h;
    }

    @Override // p000.yt4
    /* JADX INFO: renamed from: a */
    public final int mo15745a() {
        return this.f50073b.mo997d().f41171b;
    }

    @Override // p000.yt4
    /* JADX INFO: renamed from: b */
    public final void mo15746b(int i, Object obj, ye1 ye1Var, int i2) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1493551140);
        int i3 = (tj3Var.m22116e(i) ? 4 : 2) | i2 | (tj3Var.m22124i(obj) ? 32 : 16) | (tj3Var.m22120g(this) ? 256 : 128);
        int i4 = 0;
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            bna.m3938a(obj, i, this.f50072a.f2484q, ci8.m4703P(726189336, new ks4(this, i, i4), tj3Var), tj3Var, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3504qn(i, i2, 6, this, obj);
        }
    }

    @Override // p000.yt4
    /* JADX INFO: renamed from: c */
    public final Object mo15747c(int i) {
        Object objM1019b = this.f50074c.m1019b(i);
        return objM1019b == null ? this.f50073b.m998e(i) : objM1019b;
    }

    @Override // p000.yt4
    /* JADX INFO: renamed from: d */
    public final Object mo16527d(int i) {
        return this.f50073b.m996c(i);
    }

    @Override // p000.yt4
    /* JADX INFO: renamed from: e */
    public final int mo15748e(Object obj) {
        return this.f50074c.m1018a(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls4)) {
            return false;
        }
        return fa4.m11650l(this.f50073b, ((ls4) obj).f50073b);
    }

    public final int hashCode() {
        return this.f50073b.hashCode();
    }
}
