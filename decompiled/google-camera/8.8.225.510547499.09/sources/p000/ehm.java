package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ehm implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f14050a;

    /* JADX INFO: renamed from: b */
    private final oju f14051b;

    public ehm(oju ojuVar, oju ojuVar2) {
        this.f14050a = ojuVar;
        this.f14051b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ehl get() {
        return new ehl(this.f14050a, (dhv) this.f14051b.get());
    }
}
