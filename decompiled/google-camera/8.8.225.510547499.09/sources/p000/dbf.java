package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dbf implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f10373a;

    /* JADX INFO: renamed from: b */
    private final oju f10374b;

    /* JADX INFO: renamed from: c */
    private final oju f10375c;

    public dbf(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f10373a = ojuVar;
        this.f10374b = ojuVar2;
        this.f10375c = ojuVar3;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dbe get() {
        return new dbe(((dws) this.f10373a).m6830a(), (dhv) this.f10374b.get(), ((dbc) this.f10375c).get());
    }
}
