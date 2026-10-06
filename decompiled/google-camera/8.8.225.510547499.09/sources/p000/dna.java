package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dna implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f12070a;

    /* JADX INFO: renamed from: b */
    private final oju f12071b;

    public dna(oju ojuVar, oju ojuVar2) {
        this.f12070a = ojuVar;
        this.f12071b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dsx get() {
        return new dsx(((dws) this.f12070a).m6830a(), (jvd) this.f12071b.get());
    }
}
