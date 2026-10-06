package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ehv implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f14105a;

    public ehv(oju ojuVar) {
        this.f14105a = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static ehv m7334a(oju ojuVar) {
        return new ehv(ojuVar);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final cwd get() {
        return new cwd(((fww) this.f14105a).get());
    }
}
