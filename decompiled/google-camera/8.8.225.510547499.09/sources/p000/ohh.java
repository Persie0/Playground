package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ohh implements oju, ohb {

    /* JADX INFO: renamed from: a */
    private static final Object f46009a = new Object();

    /* JADX INFO: renamed from: b */
    private volatile oju f46010b;

    /* JADX INFO: renamed from: c */
    private volatile Object f46011c = f46009a;

    private ohh(oju ojuVar) {
        this.f46010b = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static ohb m18485a(oju ojuVar) {
        if (ojuVar instanceof ohb) {
            return (ohb) ojuVar;
        }
        ojuVar.getClass();
        return new ohh(ojuVar);
    }

    /* JADX INFO: renamed from: b */
    public static oju m18486b(oju ojuVar) {
        ojuVar.getClass();
        return ojuVar instanceof ohh ? ojuVar : new ohh(ojuVar);
    }

    @Override // p000.oju
    public final Object get() {
        Object obj = this.f46011c;
        Object obj2 = f46009a;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f46011c;
                if (obj == obj2) {
                    obj = this.f46010b.get();
                    Object obj3 = this.f46011c;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f46011c = obj;
                    this.f46010b = null;
                }
            }
        }
        return obj;
    }
}
