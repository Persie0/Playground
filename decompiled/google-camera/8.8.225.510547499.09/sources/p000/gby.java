package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gby implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f24148a;

    /* JADX INFO: renamed from: b */
    private final oju f24149b;

    /* JADX INFO: renamed from: c */
    private final oju f24150c;

    /* JADX INFO: renamed from: d */
    private final oju f24151d;

    public gby(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f24148a = ojuVar;
        this.f24149b = ojuVar2;
        this.f24150c = ojuVar3;
        this.f24151d = ojuVar4;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ggx get() {
        dhv dhvVar = (dhv) this.f24148a.get();
        msi msiVar = (msi) this.f24149b.get();
        ggx ggxVar = ((ghl) this.f24150c).get();
        ghg ghgVar = (ghg) this.f24151d.get();
        if (!((Boolean) msiVar.mo6051a()).booleanValue() || dhvVar.mo6184l(did.f11393D)) {
            ggxVar = ghgVar;
        }
        ggxVar.getClass();
        return ggxVar;
    }
}
