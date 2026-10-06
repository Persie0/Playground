package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ohn implements oju {

    /* JADX INFO: renamed from: a */
    private static final Object f46018a = new Object();

    /* JADX INFO: renamed from: b */
    private volatile oju f46019b;

    /* JADX INFO: renamed from: c */
    private volatile Object f46020c = f46018a;

    private ohn(oju ojuVar) {
        this.f46019b = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static oju m18492a(oju ojuVar) {
        if ((ojuVar instanceof ohn) || (ojuVar instanceof ohh)) {
            return ojuVar;
        }
        ojuVar.getClass();
        return new ohn(ojuVar);
    }

    @Override // p000.oju
    public final Object get() {
        Object obj = this.f46020c;
        if (obj != f46018a) {
            return obj;
        }
        oju ojuVar = this.f46019b;
        if (ojuVar == null) {
            return this.f46020c;
        }
        Object obj2 = ojuVar.get();
        this.f46020c = obj2;
        this.f46019b = null;
        return obj2;
    }
}
