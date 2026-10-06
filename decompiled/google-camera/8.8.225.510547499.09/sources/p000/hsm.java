package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hsm implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f29423a;

    public hsm(oju ojuVar) {
        this.f29423a = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static hsm m10702a(oju ojuVar) {
        return new hsm(ojuVar);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jfs get() {
        return new jfs(((eml) this.f29423a).get());
    }
}
