package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gml implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f25598a;

    /* JADX INFO: renamed from: b */
    private final oju f25599b;

    /* JADX INFO: renamed from: c */
    private final oju f25600c;

    /* JADX INFO: renamed from: d */
    private final oju f25601d;

    public gml(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f25598a = ojuVar;
        this.f25599b = ojuVar2;
        this.f25600c = ojuVar3;
        this.f25601d = ojuVar4;
    }

    /* JADX INFO: renamed from: b */
    public static gml m9521b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new gml(ojuVar, ojuVar2, ojuVar3, ojuVar4);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gmk get() {
        return new gmk(((ikv) this.f25598a).m11415a(), (kfk) this.f25599b.get(), ((fxk) this.f25600c).get(), (jwn) this.f25601d.get());
    }
}
