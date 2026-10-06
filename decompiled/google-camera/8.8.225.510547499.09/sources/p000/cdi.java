package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cdi implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f5302a;

    /* JADX INFO: renamed from: b */
    private final oju f5303b;

    /* JADX INFO: renamed from: c */
    private final oju f5304c;

    /* JADX INFO: renamed from: d */
    private final oju f5305d;

    public cdi(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f5302a = ojuVar;
        this.f5303b = ojuVar2;
        this.f5304c = ojuVar3;
        this.f5305d = ojuVar4;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cdh get() {
        return new cdh((dox) this.f5302a.get(), ((dwz) this.f5303b).get(), (drj) this.f5304c.get(), (djm) this.f5305d.get(), null, null, null, null);
    }
}
