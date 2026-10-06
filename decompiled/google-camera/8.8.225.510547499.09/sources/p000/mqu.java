package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mqu extends mrm {

    /* JADX INFO: renamed from: a */
    public static final mqu f41450a = new mqu();
    private static final long serialVersionUID = 0;

    private mqu() {
    }

    private Object readResolve() {
        return f41450a;
    }

    @Override // p000.mrm
    /* JADX INFO: renamed from: a */
    public final mrm mo16807a(mrm mrmVar) {
        return mrmVar;
    }

    @Override // p000.mrm
    /* JADX INFO: renamed from: b */
    public final mrm mo16808b(mrf mrfVar) {
        mrfVar.getClass();
        return f41450a;
    }

    @Override // p000.mrm
    /* JADX INFO: renamed from: c */
    public final Object mo16809c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // p000.mrm
    /* JADX INFO: renamed from: d */
    public final Object mo16810d(msi msiVar) {
        Object objMo6051a = msiVar.mo6051a();
        objMo6051a.getClass();
        return objMo6051a;
    }

    @Override // p000.mrm
    /* JADX INFO: renamed from: e */
    public final Object mo16811e(Object obj) {
        obj.getClass();
        return obj;
    }

    @Override // p000.mrm
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // p000.mrm
    /* JADX INFO: renamed from: f */
    public final Object mo16812f() {
        return null;
    }

    @Override // p000.mrm
    /* JADX INFO: renamed from: g */
    public final boolean mo16813g() {
        return false;
    }

    @Override // p000.mrm
    public final int hashCode() {
        return 2040732332;
    }

    @Override // p000.mrm
    public final String toString() {
        return "Optional.absent()";
    }
}
