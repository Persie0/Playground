package p000;

/* JADX INFO: loaded from: classes.dex */
final class bq4 extends i16 {

    /* JADX INFO: renamed from: b */
    public final aj3 f8867b;

    public bq4(aj3 aj3Var) {
        this.f8867b = aj3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bq4) {
            return this.f8867b == ((bq4) obj).f8867b;
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        iq4 iq4Var = new iq4();
        iq4Var.f44426J = this.f8867b;
        return iq4Var;
    }

    public final int hashCode() {
        return this.f8867b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "layout";
        y64Var.f69367c.m25511b(this.f8867b, "measure");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ((iq4) d16Var).f44426J = this.f8867b;
    }
}
