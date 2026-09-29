package p000;

/* JADX INFO: loaded from: classes.dex */
public final class as4 extends i16 {

    /* JADX INFO: renamed from: b */
    public final float f7426b;

    /* JADX INFO: renamed from: c */
    public final boolean f7427c;

    public as4(float f, boolean z) {
        this.f7426b = f;
        this.f7427c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        as4 as4Var = obj instanceof as4 ? (as4) obj : null;
        return as4Var != null && this.f7426b == as4Var.f7426b && this.f7427c == as4Var.f7427c;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        bs4 bs4Var = new bs4();
        bs4Var.f8940J = this.f7426b;
        bs4Var.f8941K = this.f7427c;
        return bs4Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7427c) + (Float.hashCode(this.f7426b) * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "weight";
        float f = this.f7426b;
        y64Var.f69366b = Float.valueOf(f);
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(Float.valueOf(f), "weight");
        z91Var.m25511b(Boolean.valueOf(this.f7427c), "fill");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        bs4 bs4Var = (bs4) d16Var;
        bs4Var.f8940J = this.f7426b;
        bs4Var.f8941K = this.f7427c;
    }
}
