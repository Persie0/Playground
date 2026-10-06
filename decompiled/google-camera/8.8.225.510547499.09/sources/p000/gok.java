package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gok implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f25878a;

    /* JADX INFO: renamed from: b */
    private final oju f25879b;

    /* JADX INFO: renamed from: c */
    private final oju f25880c;

    /* JADX INFO: renamed from: d */
    private final oju f25881d;

    /* JADX INFO: renamed from: e */
    private final oju f25882e;

    public gok(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        this.f25878a = ojuVar;
        this.f25879b = ojuVar2;
        this.f25880c = ojuVar3;
        this.f25881d = ojuVar4;
        this.f25882e = ojuVar5;
    }

    /* JADX INFO: renamed from: b */
    public static gok m9581b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new gok(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final goj get() {
        return new goj(((goi) this.f25878a).get(), (ecq) this.f25879b.get(), (gva) this.f25880c.get(), (dhv) this.f25881d.get(), (jvb) this.f25882e.get(), null, null, null, null, null);
    }
}
