package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fkc implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f22365a;

    /* JADX INFO: renamed from: b */
    private final oju f22366b;

    public fkc(oju ojuVar, oju ojuVar2) {
        this.f22365a = ojuVar;
        this.f22366b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fhb get() {
        dhv dhvVar = (dhv) this.f22365a.get();
        ((fja) this.f22366b).get();
        fhb fhbVar = dhvVar.mo6184l(dii.f11537m) ? fhb.GCA : fhb.FRAMEWORK;
        fhbVar.getClass();
        return fhbVar;
    }
}
