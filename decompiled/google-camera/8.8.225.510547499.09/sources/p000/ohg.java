package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ohg implements ohi {

    /* JADX INFO: renamed from: a */
    private oju f46008a;

    /* JADX INFO: renamed from: a */
    public static void m18484a(oju ojuVar, oju ojuVar2) {
        ohg ohgVar = (ohg) ojuVar;
        if (ohgVar.f46008a != null) {
            throw new IllegalStateException();
        }
        ohgVar.f46008a = ojuVar2;
    }

    @Override // p000.oju
    public final Object get() {
        oju ojuVar = this.f46008a;
        if (ojuVar != null) {
            return ojuVar.get();
        }
        throw new IllegalStateException();
    }
}
