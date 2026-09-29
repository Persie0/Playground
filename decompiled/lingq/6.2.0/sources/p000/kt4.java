package p000;

import androidx.compose.foundation.gestures.Orientation;

/* JADX INFO: loaded from: classes.dex */
final class kt4 extends i16 {

    /* JADX INFO: renamed from: b */
    public final pt4 f48409b;

    /* JADX INFO: renamed from: c */
    public final ii0 f48410c;

    /* JADX INFO: renamed from: d */
    public final boolean f48411d;

    /* JADX INFO: renamed from: e */
    public final Orientation f48412e;

    public kt4(pt4 pt4Var, ii0 ii0Var, boolean z, Orientation orientation) {
        this.f48409b = pt4Var;
        this.f48410c = ii0Var;
        this.f48411d = z;
        this.f48412e = orientation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt4)) {
            return false;
        }
        kt4 kt4Var = (kt4) obj;
        return fa4.m11650l(this.f48409b, kt4Var.f48409b) && fa4.m11650l(this.f48410c, kt4Var.f48410c) && this.f48411d == kt4Var.f48411d && this.f48412e == kt4Var.f48412e;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        ot4 ot4Var = new ot4();
        ot4Var.f54962J = this.f48409b;
        ot4Var.f54963K = this.f48410c;
        ot4Var.f54964L = this.f48411d;
        ot4Var.f54965M = this.f48412e;
        return ot4Var;
    }

    public final int hashCode() {
        return this.f48412e.hashCode() + g9a.m12428e((this.f48410c.hashCode() + (this.f48409b.hashCode() * 31)) * 31, 31, this.f48411d);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ot4 ot4Var = (ot4) d16Var;
        ot4Var.f54962J = this.f48409b;
        ot4Var.f54963K = this.f48410c;
        ot4Var.f54964L = this.f48411d;
        ot4Var.f54965M = this.f48412e;
    }
}
