package androidx.compose.material3;

import p000.d16;
import p000.eu9;
import p000.fa4;
import p000.g9a;
import p000.i16;
import p000.o39;
import p000.pg9;
import p000.v56;
import p000.wfb;
import p000.wq1;
import p000.xj2;
import p000.y64;
import p000.z91;

/* JADX INFO: renamed from: androidx.compose.material3.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C0260q extends i16 {

    /* JADX INFO: renamed from: b */
    public final boolean f3610b;

    /* JADX INFO: renamed from: c */
    public final boolean f3611c;

    /* JADX INFO: renamed from: d */
    public final v56 f3612d;

    /* JADX INFO: renamed from: e */
    public final eu9 f3613e;

    /* JADX INFO: renamed from: f */
    public final o39 f3614f;

    public C0260q(boolean z, boolean z2, v56 v56Var, eu9 eu9Var, o39 o39Var) {
        this.f3610b = z;
        this.f3611c = z2;
        this.f3612d = v56Var;
        this.f3613e = eu9Var;
        this.f3614f = o39Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0260q)) {
            return false;
        }
        C0260q c0260q = (C0260q) obj;
        return this.f3610b == c0260q.f3610b && this.f3611c == c0260q.f3611c && fa4.m11650l(this.f3612d, c0260q.f3612d) && this.f3613e.equals(c0260q.f3613e) && fa4.m11650l(this.f3614f, c0260q.f3614f) && xj2.m24560b(2.0f, 2.0f) && xj2.m24560b(1.0f, 1.0f);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new C0261r(this.f3610b, this.f3611c, this.f3612d, this.f3613e, this.f3614f);
    }

    public final int hashCode() {
        int iHashCode = (this.f3613e.hashCode() + ((this.f3612d.hashCode() + g9a.m12428e(Boolean.hashCode(this.f3610b) * 31, 31, this.f3611c)) * 31)) * 31;
        o39 o39Var = this.f3614f;
        return Float.hashCode(1.0f) + wq1.m24105a((iHashCode + (o39Var == null ? 0 : o39Var.hashCode())) * 31, 2.0f, 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "indicatorLine";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(Boolean.valueOf(this.f3610b), "enabled");
        z91Var.m25511b(Boolean.valueOf(this.f3611c), "isError");
        z91Var.m25511b(this.f3612d, "interactionSource");
        z91Var.m25511b(this.f3613e, "colors");
        z91Var.m25511b(this.f3614f, "textFieldShape");
        z91Var.m25511b(new xj2(2.0f), "focusedIndicatorLineThickness");
        z91Var.m25511b(new xj2(1.0f), "unfocusedIndicatorLineThickness");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        boolean z;
        C0261r c0261r = (C0261r) d16Var;
        boolean z2 = c0261r.f3615L;
        boolean z3 = this.f3610b;
        boolean z4 = true;
        if (z2 != z3) {
            c0261r.f3615L = z3;
            z = true;
        } else {
            z = false;
        }
        boolean z5 = c0261r.f3616M;
        boolean z6 = this.f3611c;
        if (z5 != z6) {
            c0261r.f3616M = z6;
            z = true;
        }
        v56 v56Var = c0261r.f3617N;
        v56 v56Var2 = this.f3612d;
        if (v56Var != v56Var2) {
            c0261r.f3617N = v56Var2;
            pg9 pg9Var = c0261r.f3621R;
            if (pg9Var != null) {
                pg9Var.mo4537a(null);
            }
            c0261r.f3621R = wfb.m23926u(c0261r.m9971N0(), null, null, new IndicatorLineNode$update$1(c0261r, null), 3);
        }
        eu9 eu9Var = c0261r.f3622S;
        eu9 eu9Var2 = this.f3613e;
        if (!fa4.m11650l(eu9Var, eu9Var2)) {
            c0261r.f3622S = eu9Var2;
            z = true;
        }
        o39 o39Var = c0261r.f3624U;
        o39 o39Var2 = this.f3614f;
        if (!fa4.m11650l(o39Var, o39Var2)) {
            if (!fa4.m11650l(c0261r.f3624U, o39Var2)) {
                c0261r.f3624U = o39Var2;
                c0261r.f3626W.m1345Z0();
            }
            z = true;
        }
        if (!xj2.m24560b(c0261r.f3618O, 2.0f)) {
            c0261r.f3618O = 2.0f;
            z = true;
        }
        if (xj2.m24560b(c0261r.f3619P, 1.0f)) {
            z4 = z;
        } else {
            c0261r.f3619P = 1.0f;
        }
        if (z4) {
            c0261r.m1200d1();
        }
    }

    public final String toString() {
        return "IndicatorLineElement(enabled=" + this.f3610b + ", isError=" + this.f3611c + ", interactionSource=" + this.f3612d + ", colors=" + this.f3613e + ", textFieldShape=" + this.f3614f + ", focusedIndicatorLineThickness=" + ((Object) xj2.m24561c(2.0f)) + ", unfocusedIndicatorLineThickness=" + ((Object) xj2.m24561c(1.0f)) + ')';
    }
}
