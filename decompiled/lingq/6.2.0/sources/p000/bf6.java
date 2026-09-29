package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class bf6 extends hf6 {

    /* JADX INFO: renamed from: a */
    public final String f8472a;

    /* JADX INFO: renamed from: b */
    public final String f8473b;

    public bf6(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f8472a = str;
        this.f8473b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m3684a() {
        return this.f8472a;
    }

    /* JADX INFO: renamed from: b */
    public final String m3685b() {
        return this.f8473b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf6)) {
            return false;
        }
        bf6 bf6Var = (bf6) obj;
        return fa4.m11650l(this.f8472a, bf6Var.f8472a) && fa4.m11650l(this.f8473b, bf6Var.f8473b);
    }

    public final int hashCode() {
        return this.f8473b.hashCode() + (this.f8472a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("Shelf(language=", this.f8472a, ", shelfCode=", this.f8473b, ")");
    }
}
