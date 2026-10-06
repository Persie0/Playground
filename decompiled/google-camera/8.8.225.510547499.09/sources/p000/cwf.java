package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cwf implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f9868a;

    /* JADX INFO: renamed from: b */
    private final oju f9869b;

    public cwf(oju ojuVar, oju ojuVar2) {
        this.f9868a = ojuVar;
        this.f9869b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dsx get() {
        return new dsx(this.f9868a, ((cwe) this.f9869b).get());
    }
}
