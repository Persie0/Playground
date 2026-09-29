package p000;

/* JADX INFO: loaded from: classes2.dex */
@ey8(with = a98.class)
public final class z88 {
    public static final y88 Companion = new y88();

    /* JADX INFO: renamed from: a */
    public final String f71092a;

    /* JADX INFO: renamed from: b */
    public final String f71093b;

    public z88(String str, String str2) {
        this.f71092a = str;
        this.f71093b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z88)) {
            return false;
        }
        z88 z88Var = (z88) obj;
        return fa4.m11650l(this.f71092a, z88Var.f71092a) && fa4.m11650l(this.f71093b, z88Var.f71093b);
    }

    public final int hashCode() {
        String str = this.f71092a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f71093b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ux5.m22991n("ResultFurigana(chunk=", this.f71092a, ", furigana=", this.f71093b, ")");
    }
}
