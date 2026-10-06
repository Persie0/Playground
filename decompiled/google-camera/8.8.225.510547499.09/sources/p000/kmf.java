package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kmf implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f36537a;

    /* JADX INFO: renamed from: b */
    private final oju f36538b;

    /* JADX INFO: renamed from: c */
    private final oju f36539c;

    public kmf(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f36537a = ojuVar;
        this.f36538b = ojuVar2;
        this.f36539c = ojuVar3;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final kmk get() {
        kmk kmkVar = ((Boolean) ((etl) this.f36537a).m7866a().mo16811e(false)).booleanValue() ? (kmk) this.f36538b.get() : ((kmo) this.f36539c).get();
        kmkVar.getClass();
        return kmkVar;
    }
}
