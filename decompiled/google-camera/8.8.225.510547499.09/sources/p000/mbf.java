package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mbf implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f39779a;

    /* JADX INFO: renamed from: b */
    private final oju f39780b;

    /* JADX INFO: renamed from: c */
    private final oju f39781c;

    /* JADX INFO: renamed from: d */
    private final oju f39782d;

    public mbf(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f39779a = ojuVar;
        this.f39780b = ojuVar2;
        this.f39781c = ojuVar3;
        this.f39782d = ojuVar4;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mbe get() {
        return new mbe((mav) this.f39779a.get(), (lxs) this.f39780b.get(), (mat) this.f39781c.get(), ((mbc) this.f39782d).get());
    }
}
