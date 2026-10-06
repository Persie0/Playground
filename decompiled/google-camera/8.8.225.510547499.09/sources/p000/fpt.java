package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpt implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f23139a;

    /* JADX INFO: renamed from: b */
    private final oju f23140b;

    public fpt(oju ojuVar, oju ojuVar2) {
        this.f23139a = ojuVar;
        this.f23140b = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public static fpt m8680a(oju ojuVar, oju ojuVar2) {
        return new fpt(ojuVar, ojuVar2);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final gtd get() {
        return new gtd(this.f23139a, this.f23140b, null);
    }
}
