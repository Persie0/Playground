package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fum implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f23590a;

    /* JADX INFO: renamed from: b */
    private final oju f23591b;

    public fum(oju ojuVar, oju ojuVar2) {
        this.f23590a = ojuVar;
        this.f23591b = ojuVar2;
    }

    /* JADX INFO: renamed from: b */
    public static fum m8811b(oju ojuVar, oju ojuVar2) {
        return new fum(ojuVar, ojuVar2);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ful get() {
        return new ful((jwf) this.f23590a.get(), (jwn) this.f23591b.get());
    }
}
