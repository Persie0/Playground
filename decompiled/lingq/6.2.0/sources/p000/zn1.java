package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class zn1 {

    /* JADX INFO: renamed from: a */
    public final int f71791a;

    /* JADX INFO: renamed from: b */
    public final String f71792b;

    public zn1(int i, String str) {
        this.f71791a = i;
        this.f71792b = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m25703a() {
        return this.f71791a;
    }

    /* JADX INFO: renamed from: b */
    public final String m25704b() {
        return this.f71792b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn1)) {
            return false;
        }
        zn1 zn1Var = (zn1) obj;
        return this.f71791a == zn1Var.f71791a && this.f71792b.equals(zn1Var.f71792b);
    }

    public final int hashCode() {
        return this.f71792b.hashCode() + (Integer.hashCode(this.f71791a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f71791a, "CourseAndCardsJoin(pk=", ", termWithLanguage=", this.f71792b, ")");
    }
}
