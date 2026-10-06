package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dba implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f10359a;

    /* JADX INFO: renamed from: b */
    private final oju f10360b;

    /* JADX INFO: renamed from: c */
    private final oju f10361c;

    public dba(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f10359a = ojuVar;
        this.f10360b = ojuVar2;
        this.f10361c = ojuVar3;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final daz get() {
        return new daz(((dws) this.f10359a).m6830a(), (hst) this.f10360b.get(), (dhv) this.f10361c.get());
    }
}
