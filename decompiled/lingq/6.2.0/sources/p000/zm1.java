package p000;

import androidx.compose.foundation.text.selection.C0205f;

/* JADX INFO: loaded from: classes.dex */
public final class zm1 extends i16 {

    /* JADX INFO: renamed from: b */
    public final n9a f71738b;

    /* JADX INFO: renamed from: c */
    public final vv9 f71739c;

    /* JADX INFO: renamed from: d */
    public final yw4 f71740d;

    /* JADX INFO: renamed from: e */
    public final boolean f71741e;

    /* JADX INFO: renamed from: f */
    public final boolean f71742f;

    /* JADX INFO: renamed from: g */
    public final mq6 f71743g;

    /* JADX INFO: renamed from: h */
    public final C0205f f71744h;

    /* JADX INFO: renamed from: i */
    public final w04 f71745i;

    /* JADX INFO: renamed from: j */
    public final z93 f71746j;

    public zm1(n9a n9aVar, vv9 vv9Var, yw4 yw4Var, boolean z, boolean z2, mq6 mq6Var, C0205f c0205f, w04 w04Var, z93 z93Var) {
        this.f71738b = n9aVar;
        this.f71739c = vv9Var;
        this.f71740d = yw4Var;
        this.f71741e = z;
        this.f71742f = z2;
        this.f71743g = mq6Var;
        this.f71744h = c0205f;
        this.f71745i = w04Var;
        this.f71746j = z93Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zm1) {
            zm1 zm1Var = (zm1) obj;
            if (this.f71738b.equals(zm1Var.f71738b) && fa4.m11650l(this.f71739c, zm1Var.f71739c) && this.f71740d == zm1Var.f71740d && this.f71741e == zm1Var.f71741e && this.f71742f == zm1Var.f71742f && this.f71743g.equals(zm1Var.f71743g) && this.f71744h == zm1Var.f71744h && fa4.m11650l(this.f71745i, zm1Var.f71745i) && fa4.m11650l(this.f71746j, zm1Var.f71746j)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        cn1 cn1Var = new cn1();
        cn1Var.f10306L = this.f71738b;
        cn1Var.f10307M = this.f71739c;
        cn1Var.f10308N = this.f71740d;
        cn1Var.f10309O = this.f71741e;
        cn1Var.f10310P = this.f71742f;
        cn1Var.f10311Q = this.f71743g;
        C0205f c0205f = this.f71744h;
        cn1Var.f10312R = c0205f;
        cn1Var.f10313S = this.f71745i;
        cn1Var.f10314T = this.f71746j;
        c0205f.f3082g = new an1(cn1Var, 4);
        return cn1Var;
    }

    public final int hashCode() {
        return this.f71746j.hashCode() + ((this.f71745i.hashCode() + ((this.f71744h.hashCode() + ((this.f71743g.hashCode() + g9a.m12428e(g9a.m12428e(g9a.m12428e((this.f71740d.hashCode() + ((this.f71739c.hashCode() + (this.f71738b.hashCode() * 31)) * 31)) * 31, 31, false), 31, this.f71741e), 31, this.f71742f)) * 31)) * 31)) * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        cn1 cn1Var = (cn1) d16Var;
        boolean z = cn1Var.f10309O;
        boolean z2 = cn1Var.f10310P;
        w04 w04Var = cn1Var.f10313S;
        C0205f c0205f = cn1Var.f10312R;
        cn1Var.f10306L = this.f71738b;
        vv9 vv9Var = this.f71739c;
        cn1Var.f10307M = vv9Var;
        cn1Var.f10308N = this.f71740d;
        boolean z3 = this.f71741e;
        cn1Var.f10309O = z3;
        cn1Var.f10311Q = this.f71743g;
        C0205f c0205f2 = this.f71744h;
        cn1Var.f10312R = c0205f2;
        w04 w04Var2 = this.f71745i;
        cn1Var.f10313S = w04Var2;
        cn1Var.f10314T = this.f71746j;
        if (z3 != z || z3 != z || !fa4.m11650l(w04Var2, w04Var) || this.f71742f != z2 || !cx9.m9921c(vv9Var.f65991b)) {
            thb.m22062u(cn1Var);
        }
        if (c0205f2 != c0205f) {
            c0205f2.f3082g = new an1(cn1Var, 0);
        }
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f71738b + ", value=" + this.f71739c + ", state=" + this.f71740d + ", readOnly=false, enabled=" + this.f71741e + ", isPassword=" + this.f71742f + ", offsetMapping=" + this.f71743g + ", manager=" + this.f71744h + ", imeOptions=" + this.f71745i + ", focusRequester=" + this.f71746j + ')';
    }
}
