package p000;

import androidx.compose.foundation.gestures.Orientation;

/* JADX INFO: loaded from: classes.dex */
final class qu4 extends i16 {

    /* JADX INFO: renamed from: b */
    public final ui3 f58216b;

    /* JADX INFO: renamed from: c */
    public final nu4 f58217c;

    /* JADX INFO: renamed from: d */
    public final Orientation f58218d;

    /* JADX INFO: renamed from: e */
    public final boolean f58219e;

    /* JADX INFO: renamed from: f */
    public final boolean f58220f;

    public qu4(ui3 ui3Var, nu4 nu4Var, Orientation orientation, boolean z, boolean z2) {
        this.f58216b = ui3Var;
        this.f58217c = nu4Var;
        this.f58218d = orientation;
        this.f58219e = z;
        this.f58220f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu4)) {
            return false;
        }
        qu4 qu4Var = (qu4) obj;
        return this.f58216b == qu4Var.f58216b && fa4.m11650l(this.f58217c, qu4Var.f58217c) && this.f58218d == qu4Var.f58218d && this.f58219e == qu4Var.f58219e && this.f58220f == qu4Var.f58220f;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new su4(this.f58216b, this.f58217c, this.f58218d, this.f58219e, this.f58220f);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58220f) + g9a.m12428e((this.f58218d.hashCode() + ((this.f58217c.hashCode() + (this.f58216b.hashCode() * 31)) * 31)) * 31, 31, this.f58219e);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        su4 su4Var = (su4) d16Var;
        su4Var.f61410J = this.f58216b;
        su4Var.f61411K = this.f58217c;
        Orientation orientation = su4Var.f61412L;
        Orientation orientation2 = this.f58218d;
        if (orientation != orientation2) {
            su4Var.f61412L = orientation2;
            thb.m22062u(su4Var);
        }
        boolean z = su4Var.f61413M;
        boolean z2 = this.f58219e;
        boolean z3 = this.f58220f;
        if (z == z2 && su4Var.f61414N == z3) {
            return;
        }
        su4Var.f61413M = z2;
        su4Var.f61414N = z3;
        su4Var.m21743Z0();
        thb.m22062u(su4Var);
    }
}
