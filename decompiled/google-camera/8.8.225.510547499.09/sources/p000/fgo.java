package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgo implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f21922a;

    public fgo(oju ojuVar) {
        this.f21922a = ojuVar;
    }

    /* JADX INFO: renamed from: b */
    public static fgo m8393b(oju ojuVar) {
        return new fgo(ojuVar);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fgn get() {
        return new fgn(((fkc) this.f21922a).get());
    }
}
