package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fvg implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f23626a;

    public fvg(oju ojuVar) {
        this.f23626a = ojuVar;
    }

    /* JADX INFO: renamed from: b */
    public static fvg m8825b(oju ojuVar) {
        return new fvg(ojuVar);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fvf get() {
        return new fvf(((kak) this.f23626a).get());
    }
}
