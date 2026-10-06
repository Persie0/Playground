package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mrq extends mrm {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public final Object f41482a;

    public mrq(Object obj) {
        this.f41482a = obj;
    }

    @Override // p000.mrm
    /* JADX INFO: renamed from: a */
    public final mrm mo16807a(mrm mrmVar) {
        return this;
    }

    @Override // p000.mrm
    /* JADX INFO: renamed from: b */
    public final mrm mo16808b(mrf mrfVar) {
        Object objApply = mrfVar.apply(this.f41482a);
        objApply.getClass();
        return new mrq(objApply);
    }

    @Override // p000.mrm
    /* JADX INFO: renamed from: c */
    public final Object mo16809c() {
        return this.f41482a;
    }

    @Override // p000.mrm
    /* JADX INFO: renamed from: d */
    public final Object mo16810d(msi msiVar) {
        msiVar.getClass();
        return this.f41482a;
    }

    @Override // p000.mrm
    /* JADX INFO: renamed from: e */
    public final Object mo16811e(Object obj) {
        obj.getClass();
        return this.f41482a;
    }

    @Override // p000.mrm
    public final boolean equals(Object obj) {
        if (obj instanceof mrq) {
            return this.f41482a.equals(((mrq) obj).f41482a);
        }
        return false;
    }

    @Override // p000.mrm
    /* JADX INFO: renamed from: f */
    public final Object mo16812f() {
        return this.f41482a;
    }

    @Override // p000.mrm
    /* JADX INFO: renamed from: g */
    public final boolean mo16813g() {
        return true;
    }

    @Override // p000.mrm
    public final int hashCode() {
        return this.f41482a.hashCode() + 1502476572;
    }

    @Override // p000.mrm
    public final String toString() {
        return "Optional.of(" + this.f41482a + ")";
    }
}
