package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fkq implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f22403a;

    public fkq(oju ojuVar) {
        this.f22403a = ojuVar;
    }

    /* JADX INFO: renamed from: b */
    public static fkq m8526b(oju ojuVar) {
        return new fkq(ojuVar);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fkp get() {
        return new fkp((eat) this.f22403a.get());
    }
}
