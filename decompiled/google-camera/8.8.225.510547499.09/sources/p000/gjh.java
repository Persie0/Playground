package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gjh implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f24977a;

    /* JADX INFO: renamed from: b */
    private final oju f24978b;

    /* JADX INFO: renamed from: c */
    private final oju f24979c;

    /* JADX INFO: renamed from: d */
    private final oju f24980d;

    public gjh(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f24977a = ojuVar;
        this.f24978b = ojuVar2;
        this.f24979c = ojuVar3;
        this.f24980d = ojuVar4;
    }

    /* JADX INFO: renamed from: a */
    public static gjh m9324a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new gjh(ojuVar, ojuVar2, ojuVar3, ojuVar4);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final glk get() {
        return new glk((kfk) this.f24977a.get(), (kgg) this.f24978b.get(), (kho) this.f24979c.get(), (fzu) this.f24980d.get());
    }
}
