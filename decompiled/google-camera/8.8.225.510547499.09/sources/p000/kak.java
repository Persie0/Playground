package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kak implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f35482a;

    /* JADX INFO: renamed from: b */
    private final oju f35483b;

    public kak(oju ojuVar, oju ojuVar2) {
        this.f35482a = ojuVar;
        this.f35483b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final kme get() {
        mrm mrmVar = (mrm) ((ohj) this.f35482a).f46012a;
        kme kmeVar = (kme) this.f35483b.get();
        kmeVar.getClass();
        return mrmVar.mo16813g() ? (kme) mrmVar.mo16809c() : kmeVar;
    }
}
