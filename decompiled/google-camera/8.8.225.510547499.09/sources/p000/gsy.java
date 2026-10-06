package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gsy implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f26304a;

    /* JADX INFO: renamed from: b */
    private final oju f26305b;

    /* JADX INFO: renamed from: c */
    private final oju f26306c;

    /* JADX INFO: renamed from: d */
    private final oju f26307d;

    public gsy(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f26304a = ojuVar;
        this.f26305b = ojuVar2;
        this.f26306c = ojuVar3;
        this.f26307d = ojuVar4;
    }

    /* JADX INFO: renamed from: b */
    public static gsy m9722b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new gsy(ojuVar, ojuVar2, ojuVar3, ojuVar4);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gsx get() {
        return new gsx(((cde) this.f26304a).m3490a().booleanValue(), ((cde) this.f26305b).m3490a().booleanValue(), ((cde) this.f26306c).m3490a().booleanValue(), ((cde) this.f26307d).m3490a().booleanValue());
    }
}
