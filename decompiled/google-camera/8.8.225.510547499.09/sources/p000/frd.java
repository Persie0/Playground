package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class frd implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f23288a;

    /* JADX INFO: renamed from: b */
    private final oju f23289b;

    /* JADX INFO: renamed from: c */
    private final oju f23290c;

    public frd(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f23288a = ojuVar;
        this.f23289b = ojuVar2;
        this.f23290c = ojuVar3;
    }

    /* JADX INFO: renamed from: a */
    public static frd m8712a(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new frd(ojuVar, ojuVar2, ojuVar3);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final frl get() {
        dhv dhvVar = (dhv) this.f23288a.get();
        frl frlVar = (frm) this.f23289b.get();
        fso fsoVar = (fso) this.f23290c.get();
        if (true != dhvVar.mo6184l(dij.f11601y)) {
            frlVar = fsoVar;
        }
        frlVar.getClass();
        return frlVar;
    }
}
