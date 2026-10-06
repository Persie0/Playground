package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class knd implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f36586a;

    /* JADX INFO: renamed from: b */
    private final oju f36587b;

    /* JADX INFO: renamed from: c */
    private final oju f36588c;

    public knd(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f36586a = ojuVar;
        this.f36587b = ojuVar2;
        this.f36588c = ojuVar3;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final klv get() {
        klv klvVar = ((klw) this.f36586a).get();
        ((kbm) this.f36588c).get();
        return new klv(klvVar, 2);
    }
}
