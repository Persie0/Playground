package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ebb implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f13196a;

    /* JADX INFO: renamed from: b */
    private final oju f13197b;

    /* JADX INFO: renamed from: c */
    private final oju f13198c;

    public ebb(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f13196a = ojuVar;
        this.f13197b = ojuVar2;
        this.f13198c = ojuVar3;
    }

    /* JADX INFO: renamed from: b */
    public static ebb m7038b(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new ebb(ojuVar, ojuVar2, ojuVar3);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eba get() {
        return new eba((dhv) this.f13196a.get(), (edk) this.f13197b.get(), (ebq) this.f13198c.get());
    }
}
