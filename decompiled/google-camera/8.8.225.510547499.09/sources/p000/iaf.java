package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iaf implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f30137a;

    /* JADX INFO: renamed from: b */
    private final oju f30138b;

    /* JADX INFO: renamed from: c */
    private final oju f30139c;

    /* JADX INFO: renamed from: d */
    private final oju f30140d;

    /* JADX INFO: renamed from: e */
    private final oju f30141e;

    public iaf(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        this.f30137a = ojuVar;
        this.f30138b = ojuVar2;
        this.f30139c = ojuVar3;
        this.f30140d = ojuVar4;
        this.f30141e = ojuVar5;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lrd get() {
        return new lrd(((dws) this.f30137a).m6830a(), (hst) this.f30138b.get(), this.f30139c, ((Boolean) this.f30140d.get()).booleanValue(), (gvo) this.f30141e.get());
    }
}
