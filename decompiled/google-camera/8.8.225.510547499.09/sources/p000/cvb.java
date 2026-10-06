package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvb implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f9758a;

    /* JADX INFO: renamed from: b */
    private final oju f9759b;

    /* JADX INFO: renamed from: c */
    private final oju f9760c;

    public cvb(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f9758a = ojuVar;
        this.f9759b = ojuVar2;
        this.f9760c = ojuVar3;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cva get() {
        return new cva(((ema) this.f9758a).get(), ((emm) this.f9759b).get(), (gyz) this.f9760c.get());
    }
}
