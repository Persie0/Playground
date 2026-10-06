package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cwr implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f9888a;

    /* JADX INFO: renamed from: b */
    private final oju f9889b;

    /* JADX INFO: renamed from: c */
    private final oju f9890c;

    public cwr(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f9888a = ojuVar;
        this.f9889b = ojuVar2;
        this.f9890c = ojuVar3;
    }

    /* JADX INFO: renamed from: a */
    public static cwr m5688a(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new cwr(ojuVar, ojuVar2, ojuVar3);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final djm get() {
        return new djm((hah) this.f9888a.get(), (khb) this.f9889b.get(), (dhv) this.f9890c.get(), (byte[]) null);
    }
}
