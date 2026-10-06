package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hbn implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f27153a;

    /* JADX INFO: renamed from: b */
    private final oju f27154b;

    public hbn(oju ojuVar, oju ojuVar2) {
        this.f27153a = ojuVar;
        this.f27154b = ojuVar2;
    }

    /* JADX INFO: renamed from: b */
    public static hbn m10090b(oju ojuVar, oju ojuVar2) {
        return new hbn(ojuVar, ojuVar2);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hbm get() {
        return new hbm(((dww) this.f27153a).m6836a(), (hai) this.f27154b.get());
    }
}
