package p000;

/* JADX INFO: renamed from: ht */
/* JADX INFO: loaded from: classes.dex */
public final class C3087ht extends i16 implements mv8 {

    /* JADX INFO: renamed from: b */
    public final boolean f42896b;

    /* JADX INFO: renamed from: c */
    public final vi3 f42897c;

    public C3087ht(vi3 vi3Var, boolean z) {
        this.f42896b = z;
        this.f42897c = vi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3087ht)) {
            return false;
        }
        C3087ht c3087ht = (C3087ht) obj;
        return this.f42896b == c3087ht.f42896b && this.f42897c == c3087ht.f42897c;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new om1(this.f42896b, false, this.f42897c);
    }

    public final int hashCode() {
        return this.f42897c.hashCode() + (Boolean.hashCode(this.f42896b) * 31);
    }

    @Override // p000.mv8
    /* JADX INFO: renamed from: k */
    public final kv8 mo12308k() {
        kv8 kv8Var = new kv8();
        kv8Var.f48473c = this.f42896b;
        this.f42897c.invoke(kv8Var);
        return kv8Var;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "semantics";
        y64Var.f69367c.m25511b(Boolean.valueOf(this.f42896b), "mergeDescendants");
        nv8.m17641a(y64Var, mo12308k());
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        om1 om1Var = (om1) d16Var;
        om1Var.f54564J = this.f42896b;
        om1Var.f54566L = this.f42897c;
    }
}
