package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gkr implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f25342a;

    /* JADX INFO: renamed from: b */
    private final oju f25343b;

    /* JADX INFO: renamed from: c */
    private final oju f25344c;

    public gkr(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f25342a = ojuVar;
        this.f25343b = ojuVar2;
        this.f25344c = ojuVar3;
    }

    /* JADX INFO: renamed from: a */
    public static gkr m9373a(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new gkr(ojuVar, ojuVar2, ojuVar3);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1058va get() {
        return new C1058va(this.f25342a, this.f25343b, (mrm) this.f25344c.get());
    }
}
