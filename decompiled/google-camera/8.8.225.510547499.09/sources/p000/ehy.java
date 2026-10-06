package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ehy implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f14113a;

    /* JADX INFO: renamed from: b */
    private final oju f14114b;

    /* JADX INFO: renamed from: c */
    private final oju f14115c;

    public ehy(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f14113a = ojuVar;
        this.f14114b = ojuVar2;
        this.f14115c = ojuVar3;
    }

    /* JADX INFO: renamed from: a */
    public static ehy m7338a(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new ehy(ojuVar, ojuVar2, ojuVar3);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1058va get() {
        return new C1058va((nsz) this.f14113a.get(), ((cen) this.f14114b).get(), (kbz) this.f14115c.get());
    }
}
