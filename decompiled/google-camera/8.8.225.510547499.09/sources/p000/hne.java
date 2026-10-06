package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hne implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f28411a;

    /* JADX INFO: renamed from: b */
    private final oju f28412b;

    /* JADX INFO: renamed from: c */
    private final oju f28413c;

    public hne(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f28411a = ojuVar;
        this.f28412b = ojuVar2;
        this.f28413c = ojuVar3;
    }

    /* JADX INFO: renamed from: b */
    public static hne m10489b(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new hne(ojuVar, ojuVar2, ojuVar3);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hnd get() {
        return new hnd((jwn) this.f28411a.get(), (imu) this.f28412b.get(), (dhv) this.f28413c.get());
    }
}
