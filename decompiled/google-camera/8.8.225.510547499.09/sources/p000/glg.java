package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class glg implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f25477a;

    /* JADX INFO: renamed from: b */
    private final oju f25478b;

    /* JADX INFO: renamed from: c */
    private final oju f25479c;

    public glg(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f25477a = ojuVar;
        this.f25478b = ojuVar2;
        this.f25479c = ojuVar3;
    }

    /* JADX INFO: renamed from: a */
    public static glg m9419a(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new glg(ojuVar, ojuVar2, ojuVar3);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1058va get() {
        return new C1058va(this.f25477a, this.f25478b, this.f25479c);
    }
}
