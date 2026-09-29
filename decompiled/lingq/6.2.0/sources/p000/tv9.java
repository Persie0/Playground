package p000;

import androidx.compose.p002ui.platform.AbstractC0402n;

/* JADX INFO: loaded from: classes.dex */
final class tv9 extends i16 {

    /* JADX INFO: renamed from: b */
    public final vx9 f62956b;

    public tv9(vx9 vx9Var) {
        this.f62956b = vx9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv9)) {
            return false;
        }
        return fa4.m11650l(this.f62956b, ((tv9) obj).f62956b);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new uv9(this.f62956b);
    }

    public final int hashCode() {
        return this.f62956b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "textFieldMinSize";
        y64Var.f69367c.m25511b(this.f62956b, "style");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        uv9 uv9Var = (uv9) d16Var;
        uv9Var.getClass();
        vx9 vx9VarM23615W = vz1.m23615W(this.f62956b, te1.m21979L(uv9Var).f4328U);
        uv9Var.m22946Z0(vx9VarM23615W, (wa3) thb.m22050i(uv9Var, AbstractC0402n.f4819k));
        ce4 ce4Var = uv9Var.f64414L;
        if (ce4Var == null) {
            throw wq1.m24126v("Min size state is not set.");
        }
        ce4.m4570a(ce4Var, null, null, vx9VarM23615W, 23);
        d32.m10020R(uv9Var);
    }
}
