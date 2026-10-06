package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvh implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f9784a;

    /* JADX INFO: renamed from: b */
    private final oju f9785b;

    public cvh(oju ojuVar, oju ojuVar2) {
        this.f9784a = ojuVar;
        this.f9785b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cvg get() {
        return new cvg(((cvf) this.f9784a).get(), (gyz) this.f9785b.get(), null);
    }
}
