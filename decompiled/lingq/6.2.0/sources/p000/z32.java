package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class z32 extends tad {

    /* JADX INFO: renamed from: a */
    public final String f70826a;

    /* JADX INFO: renamed from: b */
    public final String f70827b;

    public z32(String str, String str2) {
        this.f70826a = str;
        this.f70827b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z32)) {
            return false;
        }
        z32 z32Var = (z32) obj;
        return fa4.m11650l(this.f70826a, z32Var.f70826a) && fa4.m11650l(this.f70827b, z32Var.f70827b);
    }

    public final int hashCode() {
        String str = this.f70826a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f70827b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ux5.m22991n("Collections(language=", this.f70826a, ", shelfCode=", this.f70827b, ")");
    }
}
