package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class a42 extends tad {

    /* JADX INFO: renamed from: a */
    public final String f199a;

    /* JADX INFO: renamed from: b */
    public final Integer f200b;

    public a42(Integer num, String str) {
        this.f199a = str;
        this.f200b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a42)) {
            return false;
        }
        a42 a42Var = (a42) obj;
        return fa4.m11650l(this.f199a, a42Var.f199a) && fa4.m11650l(this.f200b, a42Var.f200b);
    }

    public final int hashCode() {
        String str = this.f199a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f200b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "Course(language=" + this.f199a + ", courseId=" + this.f200b + ")";
    }
}
