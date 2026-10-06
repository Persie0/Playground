package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dki implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f11893a;

    public dki(oju ojuVar) {
        this.f11893a = ojuVar;
    }

    /* JADX INFO: renamed from: b */
    public static kbn m6309b(kbo kboVar) {
        return kboVar instanceof kbn ? (kbn) kboVar : new dkl(kboVar);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final kbn get() {
        return m6309b(((kbm) this.f11893a).get());
    }
}
