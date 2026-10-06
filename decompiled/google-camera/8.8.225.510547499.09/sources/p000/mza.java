package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class mza implements myx {
    public final boolean equals(Object obj) {
        if (obj instanceof myx) {
            myx myxVar = (myx) obj;
            if (mo17161a() == myxVar.mo17161a() && mpw.m16768g(mo17162b(), myxVar.mo17162b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object objB = mo17162b();
        return (objB == null ? 0 : objB.hashCode()) ^ mo17161a();
    }

    @Override // p000.myx
    public final String toString() {
        String strValueOf = String.valueOf(mo17162b());
        int iA = mo17161a();
        if (iA == 1) {
            return strValueOf;
        }
        return strValueOf + " x " + iA;
    }
}
