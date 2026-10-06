package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class epi implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f14976a;

    /* JADX INFO: renamed from: b */
    private final oju f14977b;

    /* JADX INFO: renamed from: c */
    private final oju f14978c;

    public epi(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f14976a = ojuVar;
        this.f14977b = ojuVar2;
        this.f14978c = ojuVar3;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final kfc get() {
        kfk kfkVar = (kfk) this.f14976a.get();
        mrm mrmVar = (mrm) this.f14977b.get();
        jvb jvbVar = (jvb) this.f14978c.get();
        kfkVar.getClass();
        mrm mrmVarMo16808b = mrmVar.mo16808b(new ceg(kfkVar, 18)).mo16808b(new ceg(kfkVar, 19));
        lku.m15614I(mrmVarMo16808b.mo16813g(), "Analysis stream not present.");
        kfc kfcVar = (kfc) mrmVarMo16808b.mo16809c();
        jvbVar.m13537d(kfcVar);
        return kfcVar;
    }
}
