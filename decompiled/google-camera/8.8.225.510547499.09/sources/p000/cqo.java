package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cqo implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f9001a;

    /* JADX INFO: renamed from: b */
    private final oju f9002b;

    /* JADX INFO: renamed from: c */
    private final oju f9003c;

    public cqo(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f9001a = ojuVar;
        this.f9002b = ojuVar2;
        this.f9003c = ojuVar3;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final djm get() {
        return new djm((fcp) this.f9001a.get(), (jwn) this.f9002b.get(), (crh) this.f9003c.get());
    }
}
