package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class csi implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f9242a;

    /* JADX INFO: renamed from: b */
    private final oju f9243b;

    /* JADX INFO: renamed from: c */
    private final oju f9244c;

    public csi(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f9242a = ojuVar;
        this.f9243b = ojuVar2;
        this.f9244c = ojuVar3;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final djm get() {
        jxt jxtVar = (jxt) this.f9242a.get();
        return new djm(jxtVar, (kms) this.f9244c.get());
    }
}
