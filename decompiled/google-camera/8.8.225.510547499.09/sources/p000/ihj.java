package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ihj implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f30961a;

    /* JADX INFO: renamed from: b */
    private final oju f30962b;

    /* JADX INFO: renamed from: c */
    private final oju f30963c;

    /* JADX INFO: renamed from: d */
    private final oju f30964d;

    public ihj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f30961a = ojuVar;
        this.f30962b = ojuVar2;
        this.f30963c = ojuVar3;
        this.f30964d = ojuVar4;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ihi get() {
        return new ihi(((emc) this.f30961a).get(), (dhv) this.f30962b.get(), ((kak) this.f30963c).get(), ((fkb) this.f30964d).get());
    }
}
