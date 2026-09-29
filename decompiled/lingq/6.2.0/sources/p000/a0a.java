package p000;

import androidx.compose.material3.C0250j0;

/* JADX INFO: loaded from: classes2.dex */
final class a0a extends i16 {

    /* JADX INFO: renamed from: b */
    public final v56 f37b;

    /* JADX INFO: renamed from: c */
    public final boolean f38c;

    /* JADX INFO: renamed from: d */
    public final l43 f39d;

    public a0a(v56 v56Var, boolean z, l43 l43Var) {
        this.f37b = v56Var;
        this.f38c = z;
        this.f39d = l43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0a)) {
            return false;
        }
        a0a a0aVar = (a0a) obj;
        return fa4.m11650l(this.f37b, a0aVar.f37b) && this.f38c == a0aVar.f38c && fa4.m11650l(this.f39d, a0aVar.f39d);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        C0250j0 c0250j0 = new C0250j0();
        c0250j0.f3539J = this.f37b;
        c0250j0.f3540K = this.f38c;
        c0250j0.f3541L = this.f39d;
        c0250j0.f3545P = Float.NaN;
        c0250j0.f3546Q = Float.NaN;
        return c0250j0;
    }

    public final int hashCode() {
        return this.f39d.hashCode() + g9a.m12428e(this.f37b.hashCode() * 31, 31, this.f38c);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "switchThumb";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(this.f37b, "interactionSource");
        z91Var.m25511b(Boolean.valueOf(this.f38c), "checked");
        z91Var.m25511b(this.f39d, "animationSpec");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        C0250j0 c0250j0 = (C0250j0) d16Var;
        c0250j0.f3539J = this.f37b;
        boolean z = c0250j0.f3540K;
        boolean z2 = this.f38c;
        if (z != z2) {
            d32.m10020R(c0250j0);
        }
        c0250j0.f3540K = z2;
        c0250j0.f3541L = this.f39d;
        if (c0250j0.f3544O == null && !Float.isNaN(c0250j0.f3546Q)) {
            c0250j0.f3544O = AbstractC3489q9.m19771a(c0250j0.f3546Q);
        }
        if (c0250j0.f3543N != null || Float.isNaN(c0250j0.f3545P)) {
            return;
        }
        c0250j0.f3543N = AbstractC3489q9.m19771a(c0250j0.f3545P);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.f37b + ", checked=" + this.f38c + ", animationSpec=" + this.f39d + ')';
    }
}
