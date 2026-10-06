package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ihh implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f30954a;

    /* JADX INFO: renamed from: b */
    private final oju f30955b;

    /* JADX INFO: renamed from: c */
    private final oju f30956c;

    public ihh(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f30954a = ojuVar;
        this.f30955b = ojuVar2;
        this.f30956c = ojuVar3;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ihg get() {
        return new ihg(((emc) this.f30954a).get(), (dhv) this.f30955b.get(), ((fkb) this.f30956c).get());
    }
}
