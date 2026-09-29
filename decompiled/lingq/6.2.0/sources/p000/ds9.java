package p000;

/* JADX INFO: loaded from: classes.dex */
final class ds9 extends i16 {

    /* JADX INFO: renamed from: b */
    public final String f36180b;

    public ds9(String str) {
        this.f36180b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds9)) {
            return false;
        }
        return this.f36180b.equals(((ds9) obj).f36180b);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        es9 es9Var = new es9();
        es9Var.f37779J = this.f36180b;
        return es9Var;
    }

    public final int hashCode() {
        return this.f36180b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "testTag";
        y64Var.f69367c.m25511b(this.f36180b, "tag");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ((es9) d16Var).f37779J = this.f36180b;
    }
}
