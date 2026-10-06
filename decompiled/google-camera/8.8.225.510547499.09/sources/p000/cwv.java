package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cwv implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f9901a;

    /* JADX INFO: renamed from: b */
    private final oju f9902b;

    /* JADX INFO: renamed from: c */
    private final oju f9903c;

    /* JADX INFO: renamed from: d */
    private final oju f9904d;

    public cwv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f9901a = ojuVar;
        this.f9902b = ojuVar2;
        this.f9903c = ojuVar3;
        this.f9904d = ojuVar4;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cww get() {
        cww cwwVar;
        ohb ohbVarM18485a = ohh.m18485a(this.f9901a);
        ohb ohbVarM18485a2 = ohh.m18485a(this.f9902b);
        crh crhVar = (crh) this.f9903c.get();
        dhv dhvVar = (dhv) this.f9904d.get();
        if (crhVar.mo5395a() == ikw.VIDEO) {
            dhx dhxVar = dhh.f11074a;
            dhvVar.mo6177e();
            cwwVar = (cww) ohbVarM18485a.get();
        } else {
            cwwVar = (cww) ohbVarM18485a2.get();
        }
        cwwVar.getClass();
        return cwwVar;
    }
}
