package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ntb implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f44467a;

    /* JADX INFO: renamed from: b */
    private final oju f44468b;

    public ntb(oju ojuVar, oju ojuVar2) {
        this.f44467a = ojuVar;
        this.f44468b = ojuVar2;
    }

    /* JADX INFO: renamed from: b */
    public static ntb m17689b(oju ojuVar, oju ojuVar2) {
        return new ntb(ojuVar, ojuVar2);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nta get() {
        return new nta(((fxk) this.f44467a).get(), ((kak) this.f44468b).get());
    }
}
