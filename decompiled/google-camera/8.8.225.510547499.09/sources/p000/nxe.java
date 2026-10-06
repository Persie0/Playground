package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nxe {

    /* JADX INFO: renamed from: a */
    private final Object f44902a;

    /* JADX INFO: renamed from: b */
    private final int f44903b;

    public nxe(Object obj, int i) {
        this.f44902a = obj;
        this.f44903b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nxe)) {
            return false;
        }
        nxe nxeVar = (nxe) obj;
        return this.f44902a == nxeVar.f44902a && this.f44903b == nxeVar.f44903b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f44902a) * 65535) + this.f44903b;
    }
}
