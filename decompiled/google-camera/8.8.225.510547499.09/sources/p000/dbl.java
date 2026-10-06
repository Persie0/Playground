package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dbl implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f10383a;

    /* JADX INFO: renamed from: b */
    private final oju f10384b;

    /* JADX INFO: renamed from: c */
    private final oju f10385c;

    public dbl(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f10383a = ojuVar;
        this.f10384b = ojuVar2;
        this.f10385c = ojuVar3;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final djm get() {
        return new djm(((hfb) this.f10383a).m10179a(), (dhv) this.f10384b.get(), (crh) this.f10385c.get());
    }
}
