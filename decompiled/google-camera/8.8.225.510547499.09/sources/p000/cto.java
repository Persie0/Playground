package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cto implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f9489a;

    /* JADX INFO: renamed from: b */
    private final oju f9490b;

    public cto(oju ojuVar, oju ojuVar2) {
        this.f9489a = ojuVar;
        this.f9490b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ctn get() {
        return new ctn((dhv) this.f9489a.get(), ((kbm) this.f9490b).get());
    }
}
