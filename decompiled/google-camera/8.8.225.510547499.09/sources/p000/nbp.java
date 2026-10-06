package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class nbp extends nbq {

    /* JADX INFO: renamed from: d */
    private final int f41954d;

    /* JADX INFO: renamed from: f */
    private int f41956f = 0;

    /* JADX INFO: renamed from: b */
    private final String f41952b = "A";

    /* JADX INFO: renamed from: c */
    private final String f41953c = "a";

    /* JADX INFO: renamed from: e */
    private final String f41955e = "PG";

    public nbp(int i) {
        this.f41954d = i;
    }

    @Override // p000.nbq
    /* JADX INFO: renamed from: a */
    public final int mo17302a() {
        return (char) this.f41954d;
    }

    @Override // p000.nbq
    /* JADX INFO: renamed from: b */
    public final String mo17303b() {
        return this.f41952b.replace('/', '.');
    }

    @Override // p000.nbq
    /* JADX INFO: renamed from: c */
    public final String mo17304c() {
        return this.f41955e;
    }

    @Override // p000.nbq
    /* JADX INFO: renamed from: d */
    public final String mo17305d() {
        return this.f41953c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nbp) {
            nbp nbpVar = (nbp) obj;
            if (this.f41952b.equals(nbpVar.f41952b) && this.f41953c.equals(nbpVar.f41953c) && this.f41954d == nbpVar.f41954d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f41956f;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((this.f41952b.hashCode() + 4867) * 31) + this.f41953c.hashCode()) * 31) + this.f41954d;
        this.f41956f = iHashCode;
        return iHashCode;
    }
}
