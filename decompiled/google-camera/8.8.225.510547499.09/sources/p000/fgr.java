package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgr implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f21932a;

    /* JADX INFO: renamed from: b */
    private final oju f21933b;

    public fgr(oju ojuVar, oju ojuVar2) {
        this.f21932a = ojuVar;
        this.f21933b = ojuVar2;
    }

    /* JADX INFO: renamed from: b */
    public static fgr m8396b(oju ojuVar, oju ojuVar2) {
        return new fgr(ojuVar, ojuVar2);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fgq get() {
        return new fgq((fgy) this.f21932a.get(), (fgh) this.f21933b.get());
    }
}
