package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fzi implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f23975a;

    public fzi(oju ojuVar) {
        this.f23975a = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static fzi m8972a(oju ojuVar) {
        return new fzi(ojuVar);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final bkn get() {
        return new bkn(((ohm) this.f23975a).get());
    }
}
