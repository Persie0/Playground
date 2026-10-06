package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lif implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f38298a;

    /* JADX INFO: renamed from: b */
    private final oju f38299b;

    /* JADX INFO: renamed from: c */
    private final oju f38300c;

    /* JADX INFO: renamed from: d */
    private final oju f38301d;

    public lif(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f38298a = ojuVar;
        this.f38299b = ojuVar2;
        this.f38300c = ojuVar3;
        this.f38301d = ojuVar4;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lie get() {
        return new lie((String) this.f38298a.get(), ((lix) this.f38299b).get(), (ksi) this.f38300c.get(), this.f38301d, (byte[]) null);
    }
}
