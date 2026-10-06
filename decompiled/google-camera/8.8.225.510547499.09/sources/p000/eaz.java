package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eaz implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f13159a;

    /* JADX INFO: renamed from: b */
    private final oju f13160b;

    /* JADX INFO: renamed from: c */
    private final oju f13161c;

    /* JADX INFO: renamed from: d */
    private final oju f13162d;

    public eaz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f13159a = ojuVar;
        this.f13160b = ojuVar2;
        this.f13161c = ojuVar3;
        this.f13162d = ojuVar4;
    }

    /* JADX INFO: renamed from: a */
    public static eaz m7035a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new eaz(ojuVar, ojuVar2, ojuVar3, ojuVar4);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final bko get() {
        dhv dhvVar = (dhv) this.f13160b.get();
        return new bko(dhvVar, (byte[]) null);
    }
}
