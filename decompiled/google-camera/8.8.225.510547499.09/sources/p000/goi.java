package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class goi implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f25868a;

    /* JADX INFO: renamed from: b */
    private final oju f25869b;

    /* JADX INFO: renamed from: c */
    private final oju f25870c;

    /* JADX INFO: renamed from: d */
    private final oju f25871d;

    public goi(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f25868a = ojuVar;
        this.f25869b = ojuVar2;
        this.f25870c = ojuVar3;
        this.f25871d = ojuVar4;
    }

    /* JADX INFO: renamed from: a */
    public static goi m9576a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new goi(ojuVar, ojuVar2, ojuVar3, ojuVar4);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final djm get() {
        return new djm(this.f25868a, this.f25869b, this.f25871d, (byte[]) null);
    }
}
