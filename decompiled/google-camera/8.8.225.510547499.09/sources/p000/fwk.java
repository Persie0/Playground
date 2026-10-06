package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fwk implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f23747a;

    /* JADX INFO: renamed from: b */
    private final oju f23748b;

    public fwk(oju ojuVar, oju ojuVar2) {
        this.f23747a = ojuVar;
        this.f23748b = ojuVar2;
    }

    /* JADX INFO: renamed from: b */
    public static fwk m8897b(oju ojuVar, oju ojuVar2) {
        return new fwk(ojuVar, ojuVar2);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fwj get() {
        return new fwj(((gcw) this.f23747a).m9065a(), (jwf) this.f23748b.get());
    }
}
