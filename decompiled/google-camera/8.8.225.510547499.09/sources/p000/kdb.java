package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kdb implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f35632a;

    /* JADX INFO: renamed from: b */
    private final oju f35633b;

    public kdb(oju ojuVar, oju ojuVar2) {
        this.f35632a = ojuVar;
        this.f35633b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final kqj get() {
        mrm mrmVar = (mrm) ((ohj) this.f35632a).f46012a;
        return mrmVar.mo16813g() ? (kqj) mrmVar.mo16809c() : ((kda) this.f35633b).get();
    }
}
