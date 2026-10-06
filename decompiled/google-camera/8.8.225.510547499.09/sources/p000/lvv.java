package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lvv {

    /* JADX INFO: renamed from: a */
    private final nxd f39416a;

    public lvv(nxd nxdVar) {
        this.f39416a = nxdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lvv) && ooc.m18737c(this.f39416a, ((lvv) obj).f39416a);
    }

    public final String toString() {
        return "AirlockFileExpiry(expiration=" + this.f39416a + ")";
    }

    public final int hashCode() {
        nxd nxdVar = this.f39416a;
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
