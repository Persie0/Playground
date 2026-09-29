package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class z2b {

    /* JADX INFO: renamed from: a */
    public final String f70807a;

    /* JADX INFO: renamed from: b */
    public final String f70808b;

    public z2b(String str, String str2) {
        this.f70807a = str;
        this.f70808b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m25420a() {
        return this.f70808b;
    }

    /* JADX INFO: renamed from: b */
    public final String m25421b() {
        return this.f70807a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2b)) {
            return false;
        }
        z2b z2bVar = (z2b) obj;
        return fa4.m11650l(this.f70807a, z2bVar.f70807a) && fa4.m11650l(this.f70808b, z2bVar.f70808b);
    }

    public final int hashCode() {
        String str = this.f70807a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f70808b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ux5.m22991n("Web2WaveUserProperties(lingqUserId=", this.f70807a, ", lingqLoginCode=", this.f70808b, ")");
    }
}
