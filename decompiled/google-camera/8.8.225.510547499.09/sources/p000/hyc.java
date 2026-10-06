package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hyc implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f29898a;

    /* JADX INFO: renamed from: b */
    private final oju f29899b;

    /* JADX INFO: renamed from: c */
    private final oju f29900c;

    public hyc(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f29898a = ojuVar;
        this.f29899b = ojuVar2;
        this.f29900c = ojuVar3;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final djm get() {
        return new djm(((ema) this.f29898a).get(), (ggm) this.f29899b.get(), (jwn) this.f29900c.get());
    }
}
