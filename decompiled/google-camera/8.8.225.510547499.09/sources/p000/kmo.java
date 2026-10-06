package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kmo implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f36549a;

    /* JADX INFO: renamed from: b */
    private final oju f36550b;

    public kmo(oju ojuVar, oju ojuVar2) {
        this.f36549a = ojuVar;
        this.f36550b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final kmn get() {
        return new kmn(((emn) this.f36549a).get(), ((kbm) this.f36550b).get());
    }
}
