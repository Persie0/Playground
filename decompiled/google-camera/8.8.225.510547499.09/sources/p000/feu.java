package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class feu implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f21575a;

    /* JADX INFO: renamed from: b */
    private final oju f21576b;

    /* JADX INFO: renamed from: c */
    private final oju f21577c;

    public feu(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f21575a = ojuVar;
        this.f21576b = ojuVar2;
        this.f21577c = ojuVar3;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fet get() {
        dhv dhvVar = (dhv) this.f21575a.get();
        return new fet(dhvVar, ((dws) this.f21577c).m6830a());
    }
}
