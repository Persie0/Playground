package p000;

import androidx.compose.p002ui.state.ToggleableState;

/* JADX INFO: loaded from: classes.dex */
final class uba extends i16 {

    /* JADX INFO: renamed from: b */
    public final ToggleableState f63674b;

    /* JADX INFO: renamed from: c */
    public final v56 f63675c;

    /* JADX INFO: renamed from: d */
    public final w34 f63676d;

    /* JADX INFO: renamed from: e */
    public final boolean f63677e;

    /* JADX INFO: renamed from: f */
    public final uh8 f63678f;

    /* JADX INFO: renamed from: g */
    public final ui3 f63679g;

    public uba(ToggleableState toggleableState, v56 v56Var, rh8 rh8Var, boolean z, uh8 uh8Var, ui3 ui3Var) {
        this.f63674b = toggleableState;
        this.f63675c = v56Var;
        this.f63676d = rh8Var;
        this.f63677e = z;
        this.f63678f = uh8Var;
        this.f63679g = ui3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uba.class != obj.getClass()) {
            return false;
        }
        uba ubaVar = (uba) obj;
        return this.f63674b == ubaVar.f63674b && fa4.m11650l(this.f63675c, ubaVar.f63675c) && fa4.m11650l(this.f63676d, ubaVar.f63676d) && this.f63677e == ubaVar.f63677e && this.f63678f.equals(ubaVar.f63678f) && this.f63679g == ubaVar.f63679g;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        vba vbaVar = new vba(this.f63675c, this.f63676d, false, this.f63677e, null, this.f63678f, this.f63679g);
        vbaVar.f65171h0 = this.f63674b;
        return vbaVar;
    }

    public final int hashCode() {
        int iHashCode = this.f63674b.hashCode() * 31;
        v56 v56Var = this.f63675c;
        int iHashCode2 = (iHashCode + (v56Var != null ? v56Var.hashCode() : 0)) * 31;
        w34 w34Var = this.f63676d;
        return this.f63679g.hashCode() + wq1.m24106b(this.f63678f.f63934a, g9a.m12428e(g9a.m12428e((iHashCode2 + (w34Var != null ? w34Var.hashCode() : 0)) * 31, 31, false), 31, this.f63677e), 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "triStateToggleable";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(this.f63674b, "state");
        z91Var.m25511b(this.f63675c, "interactionSource");
        z91Var.m25511b(this.f63676d, "indicationNodeFactory");
        z91Var.m25511b(Boolean.valueOf(this.f63677e), "enabled");
        z91Var.m25511b(this.f63678f, "role");
        z91Var.m25511b(this.f63679g, "onClick");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        vba vbaVar = (vba) d16Var;
        ToggleableState toggleableState = vbaVar.f65171h0;
        ToggleableState toggleableState2 = this.f63674b;
        if (toggleableState != toggleableState2) {
            vbaVar.f65171h0 = toggleableState2;
            thb.m22062u(vbaVar);
        }
        vbaVar.m803o1(this.f63675c, this.f63676d, false, this.f63677e, null, this.f63678f, this.f63679g);
    }
}
