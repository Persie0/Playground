package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gtb implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f26318a;

    /* JADX INFO: renamed from: b */
    private final oju f26319b;

    /* JADX INFO: renamed from: c */
    private final oju f26320c;

    public gtb(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f26318a = ojuVar;
        this.f26319b = ojuVar2;
        this.f26320c = ojuVar3;
    }

    /* JADX INFO: renamed from: b */
    public static gtb m9730b(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new gtb(ojuVar, ojuVar2, ojuVar3);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gta get() {
        return new gta(((cde) this.f26318a).m3490a().booleanValue(), ((cde) this.f26319b).m3490a().booleanValue(), ((cde) this.f26320c).m3490a().booleanValue());
    }
}
