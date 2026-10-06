package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fxy implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f23835a;

    /* JADX INFO: renamed from: b */
    private final oju f23836b;

    public fxy(oju ojuVar, oju ojuVar2) {
        this.f23835a = ojuVar;
        this.f23836b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gve get() {
        dhv dhvVar = (dhv) this.f23835a.get();
        ((dws) this.f23836b).m6830a();
        gvf gvfVar = dhvVar.mo6184l(dib.f11297bD) ? new gvf(1) : new gvf(0);
        dhvVar.mo6178f();
        return gvfVar;
    }
}
