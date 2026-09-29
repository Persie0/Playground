package p000;

/* JADX INFO: loaded from: classes.dex */
final class fi4 extends i16 {

    /* JADX INFO: renamed from: b */
    public final vi3 f39143b;

    /* JADX INFO: renamed from: c */
    public final vi3 f39144c;

    public fi4(vi3 vi3Var, vi3 vi3Var2) {
        this.f39143b = vi3Var;
        this.f39144c = vi3Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi4)) {
            return false;
        }
        fi4 fi4Var = (fi4) obj;
        return this.f39143b == fi4Var.f39143b && this.f39144c == fi4Var.f39144c;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        hi4 hi4Var = new hi4();
        hi4Var.f42402J = this.f39143b;
        hi4Var.f42403K = this.f39144c;
        return hi4Var;
    }

    public final int hashCode() {
        vi3 vi3Var = this.f39143b;
        int iHashCode = (vi3Var != null ? vi3Var.hashCode() : 0) * 31;
        vi3 vi3Var2 = this.f39144c;
        return iHashCode + (vi3Var2 != null ? vi3Var2.hashCode() : 0);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        z91 z91Var = y64Var.f69367c;
        vi3 vi3Var = this.f39143b;
        if (vi3Var != null) {
            y64Var.f69365a = "onKeyEvent";
            z91Var.m25511b(vi3Var, "onKeyEvent");
        }
        vi3 vi3Var2 = this.f39144c;
        if (vi3Var2 != null) {
            y64Var.f69365a = "onPreviewKeyEvent";
            z91Var.m25511b(vi3Var2, "onPreviewKeyEvent");
        }
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        hi4 hi4Var = (hi4) d16Var;
        hi4Var.f42402J = this.f39143b;
        hi4Var.f42403K = this.f39144c;
    }
}
