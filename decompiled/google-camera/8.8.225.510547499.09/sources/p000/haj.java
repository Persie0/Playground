package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class haj implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f27101a;

    /* JADX INFO: renamed from: b */
    private final oju f27102b;

    public haj(oju ojuVar, oju ojuVar2) {
        this.f27101a = ojuVar;
        this.f27102b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ihk get() {
        return new ihk((had) this.f27101a.get(), ((dki) this.f27102b).get());
    }
}
