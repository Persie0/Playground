package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bct {

    /* JADX INFO: renamed from: a */
    public final String f2955a;

    /* JADX INFO: renamed from: b */
    public final int f2956b;

    public bct(String str, int i) {
        str.getClass();
        this.f2955a = str;
        this.f2956b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bct)) {
            return false;
        }
        bct bctVar = (bct) obj;
        return ooc.m18737c(this.f2955a, bctVar.f2955a) && this.f2956b == bctVar.f2956b;
    }

    public final int hashCode() {
        int iHashCode = this.f2955a.hashCode() * 31;
        int i = this.f2956b;
        C0158ej.m7380g(i);
        return iHashCode + i;
    }

    public final String toString() {
        return "IdAndState(id=" + this.f2955a + ", state=" + ((Object) C0158ej.m7378e(this.f2956b)) + ')';
    }
}
