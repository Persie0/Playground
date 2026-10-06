package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evc implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f20334a;

    /* JADX INFO: renamed from: b */
    private final oju f20335b;

    /* JADX INFO: renamed from: c */
    private final oju f20336c;

    public evc(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f20334a = ojuVar;
        this.f20335b = ojuVar2;
        this.f20336c = ojuVar3;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fvs get() {
        fvq fvqVar = (fvq) this.f20334a.get();
        oju ojuVar = this.f20335b;
        return fvqVar.mo8834a(((ewf) ojuVar).get(), ((dra) this.f20336c).m6617a(), new lqc(false), ikw.MOTION_BLUR);
    }
}
