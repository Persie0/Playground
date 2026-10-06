package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fwl implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f23749a;

    /* JADX INFO: renamed from: b */
    private final oju f23750b;

    public fwl(oju ojuVar, oju ojuVar2) {
        this.f23749a = ojuVar;
        this.f23750b = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public static fwl m8899a(oju ojuVar, oju ojuVar2) {
        return new fwl(ojuVar, ojuVar2);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final bkn get() {
        return new bkn(((gcw) this.f23749a).m9065a(), ((ikv) this.f23750b).m11415a());
    }
}
