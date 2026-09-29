package p000;

/* JADX INFO: loaded from: classes.dex */
final class ku8 extends i16 {

    /* JADX INFO: renamed from: b */
    public final boolean f48432b;

    /* JADX INFO: renamed from: c */
    public final v56 f48433c;

    /* JADX INFO: renamed from: d */
    public final w34 f48434d;

    /* JADX INFO: renamed from: e */
    public final boolean f48435e;

    /* JADX INFO: renamed from: f */
    public final uh8 f48436f;

    /* JADX INFO: renamed from: g */
    public final ui3 f48437g;

    public ku8(boolean z, v56 v56Var, w34 w34Var, boolean z2, uh8 uh8Var, ui3 ui3Var) {
        this.f48432b = z;
        this.f48433c = v56Var;
        this.f48434d = w34Var;
        this.f48435e = z2;
        this.f48436f = uh8Var;
        this.f48437g = ui3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ku8.class != obj.getClass()) {
            return false;
        }
        ku8 ku8Var = (ku8) obj;
        return this.f48432b == ku8Var.f48432b && fa4.m11650l(this.f48433c, ku8Var.f48433c) && fa4.m11650l(this.f48434d, ku8Var.f48434d) && this.f48435e == ku8Var.f48435e && fa4.m11650l(this.f48436f, ku8Var.f48436f) && this.f48437g == ku8Var.f48437g;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        mu8 mu8Var = new mu8(this.f48433c, this.f48434d, false, this.f48435e, null, this.f48436f, this.f48437g);
        mu8Var.f51858h0 = this.f48432b;
        return mu8Var;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f48432b) * 31;
        v56 v56Var = this.f48433c;
        int iHashCode2 = (iHashCode + (v56Var != null ? v56Var.hashCode() : 0)) * 31;
        w34 w34Var = this.f48434d;
        int iM12428e = g9a.m12428e(g9a.m12428e((iHashCode2 + (w34Var != null ? w34Var.hashCode() : 0)) * 31, 31, false), 31, this.f48435e);
        uh8 uh8Var = this.f48436f;
        return this.f48437g.hashCode() + ((iM12428e + (uh8Var != null ? Integer.hashCode(uh8Var.f63934a) : 0)) * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "selectable";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(Boolean.valueOf(this.f48432b), "selected");
        z91Var.m25511b(this.f48433c, "interactionSource");
        z91Var.m25511b(this.f48434d, "indicationNodeFactory");
        z91Var.m25511b(Boolean.valueOf(this.f48435e), "enabled");
        z91Var.m25511b(this.f48436f, "role");
        z91Var.m25511b(this.f48437g, "onClick");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        mu8 mu8Var = (mu8) d16Var;
        boolean z = mu8Var.f51858h0;
        boolean z2 = this.f48432b;
        if (z != z2) {
            mu8Var.f51858h0 = z2;
            thb.m22062u(mu8Var);
        }
        mu8Var.m803o1(this.f48433c, this.f48434d, false, this.f48435e, null, this.f48436f, this.f48437g);
    }
}
