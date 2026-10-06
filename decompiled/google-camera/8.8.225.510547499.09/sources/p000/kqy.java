package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kqy implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f36978a;

    /* JADX INFO: renamed from: b */
    private final oju f36979b;

    /* JADX INFO: renamed from: c */
    private final oju f36980c;

    /* JADX INFO: renamed from: d */
    private final oju f36981d;

    public kqy(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f36978a = ojuVar;
        this.f36979b = ojuVar2;
        this.f36980c = ojuVar3;
        this.f36981d = ojuVar4;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final kqx get() {
        kqv kqvVar = ((hlz) this.f36978a).get();
        kqj kqjVar = ((kqk) this.f36979b).get();
        drj drjVar = ((kqt) this.f36980c).get();
        return new kqx(kqvVar, kqjVar, drjVar, null, null, null);
    }
}
