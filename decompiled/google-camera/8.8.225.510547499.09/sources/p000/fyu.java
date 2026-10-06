package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fyu implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f23940a;

    /* JADX INFO: renamed from: b */
    private final oju f23941b;

    public fyu(oju ojuVar, oju ojuVar2) {
        this.f23940a = ojuVar;
        this.f23941b = ojuVar2;
    }

    /* JADX INFO: renamed from: b */
    public static fyu m8960b(oju ojuVar, oju ojuVar2) {
        return new fyu(ojuVar, ojuVar2);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fyt get() {
        return new fyw((C1058va) this.f23941b.get(), null, null, null);
    }
}
