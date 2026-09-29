package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class fq8 {

    /* JADX INFO: renamed from: a */
    public final int f39489a;

    /* JADX INFO: renamed from: b */
    public final String f39490b;

    public fq8(int i, String str) {
        str.getClass();
        this.f39489a = i;
        this.f39490b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq8)) {
            return false;
        }
        fq8 fq8Var = (fq8) obj;
        return this.f39489a == fq8Var.f39489a && fa4.m11650l(this.f39490b, fq8Var.f39490b);
    }

    public final int hashCode() {
        return this.f39490b.hashCode() + (Integer.hashCode(this.f39489a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f39489a, "SearchFilterSelectionSearchState(placeholder=", ", query=", this.f39490b, ")");
    }
}
