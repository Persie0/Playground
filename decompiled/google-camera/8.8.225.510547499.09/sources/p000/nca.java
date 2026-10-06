package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class nca implements nbr {

    /* JADX INFO: renamed from: a */
    private final nbr f41976a;

    /* JADX INFO: renamed from: b */
    private final Object f41977b;

    public nca(nbr nbrVar, Object obj) {
        nea.m17397k(nbrVar, "log site key");
        this.f41976a = nbrVar;
        nea.m17397k(obj, "log site qualifier");
        this.f41977b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nca)) {
            return false;
        }
        nca ncaVar = (nca) obj;
        return this.f41976a.equals(ncaVar.f41976a) && this.f41977b.equals(ncaVar.f41977b);
    }

    public final int hashCode() {
        return this.f41976a.hashCode() ^ this.f41977b.hashCode();
    }

    public final String toString() {
        return "SpecializedLogSiteKey{ delegate='" + this.f41976a.toString() + "', qualifier='" + this.f41977b.toString() + "' }";
    }
}
