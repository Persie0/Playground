package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ehk implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f14045a;

    /* JADX INFO: renamed from: b */
    private final oju f14046b;

    public ehk(oju ojuVar, oju ojuVar2) {
        this.f14045a = ojuVar;
        this.f14046b = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public static ehk m7324a(oju ojuVar, oju ojuVar2) {
        return new ehk(ojuVar, ojuVar2);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long get() {
        return Long.valueOf(Math.max(1000000000L, ((((dhv) this.f14046b.get()).mo6184l(did.f11413X) ? ehj.f14044b : ehj.f14043a) * ((long) ((ebv) this.f14045a.get()).f13300b)) + jzn.m13810M(500)));
    }
}
