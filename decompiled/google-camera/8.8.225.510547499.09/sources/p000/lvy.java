package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lvy {

    /* JADX INFO: renamed from: a */
    private final nxd f39419a;

    public lvy(nxd nxdVar) {
        this.f39419a = nxdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lvy) && ooc.m18737c(this.f39419a, ((lvy) obj).f39419a);
    }

    public final String toString() {
        return "F250Expiry(expiration=" + this.f39419a + ")";
    }

    public final int hashCode() {
        nxd nxdVar = this.f39419a;
        if (nxdVar.m18142ac()) {
            return nxdVar.m18134L();
        }
        int iM18134L = nxdVar.f44820aG;
        if (iM18134L == 0) {
            iM18134L = nxdVar.m18134L();
            nxdVar.f44820aG = iM18134L;
        }
        return iM18134L;
    }
}
