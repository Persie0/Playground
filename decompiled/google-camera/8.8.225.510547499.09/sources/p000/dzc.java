package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dzc implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f12957a;

    /* JADX INFO: renamed from: b */
    private final oju f12958b;

    /* JADX INFO: renamed from: c */
    private final oju f12959c;

    public dzc(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f12957a = ojuVar;
        this.f12958b = ojuVar2;
        this.f12959c = ojuVar3;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dzb get() {
        return new dzb((dyy) this.f12957a.get(), ((dzf) this.f12958b).get(), (dzr) this.f12959c.get());
    }
}
