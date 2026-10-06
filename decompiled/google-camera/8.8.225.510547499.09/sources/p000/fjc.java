package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fjc implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f22206a;

    /* JADX INFO: renamed from: b */
    private final oju f22207b;

    /* JADX INFO: renamed from: c */
    private final oju f22208c;

    public fjc(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f22206a = ojuVar;
        this.f22207b = ojuVar2;
        this.f22208c = ojuVar3;
    }

    /* JADX INFO: renamed from: b */
    public static fjc m8479b(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new fjc(ojuVar, ojuVar2, ojuVar3);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fjb get() {
        return new fjb((kov) this.f22206a.get(), ((fxk) this.f22207b).get(), (gvw) this.f22208c.get());
    }
}
