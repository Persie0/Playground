package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class irc implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f31851a;

    /* JADX INFO: renamed from: b */
    private final oju f31852b;

    /* JADX INFO: renamed from: c */
    private final oju f31853c;

    /* JADX INFO: renamed from: d */
    private final oju f31854d;

    /* JADX INFO: renamed from: e */
    private final oju f31855e;

    public irc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        this.f31851a = ojuVar;
        this.f31852b = ojuVar2;
        this.f31853c = ojuVar3;
        this.f31854d = ojuVar4;
        this.f31855e = ojuVar5;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final irb get() {
        ((dws) this.f31851a).m6830a();
        fba fbaVar = ((eru) this.f31852b).get();
        jvd jvdVar = (jvd) this.f31853c.get();
        kbo kboVar = ((kbm) this.f31854d).get();
        return new irb(fbaVar, jvdVar, kboVar);
    }
}
