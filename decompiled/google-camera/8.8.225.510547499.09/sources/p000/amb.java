package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class amb extends alz {
    public amb() {
        this(alx.f669a);
    }

    @Override // p000.alz
    /* JADX INFO: renamed from: a */
    public final Object mo925a(aly alyVar) {
        return this.f670b.get(alyVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m932b(aly alyVar, Object obj) {
        this.f670b.put(alyVar, obj);
    }

    public amb(alz alzVar) {
        alzVar.getClass();
        this.f670b.putAll(alzVar.f670b);
    }
}
