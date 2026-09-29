package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ke6 extends hf6 {

    /* JADX INFO: renamed from: a */
    public final String f47095a;

    /* JADX INFO: renamed from: b */
    public final int f47096b;

    public ke6(String str, int i) {
        str.getClass();
        this.f47095a = str;
        this.f47096b = i;
    }

    /* JADX INFO: renamed from: a */
    public final String m15160a() {
        return this.f47095a;
    }

    /* JADX INFO: renamed from: b */
    public final int m15161b() {
        return this.f47096b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke6)) {
            return false;
        }
        ke6 ke6Var = (ke6) obj;
        return fa4.m11650l(this.f47095a, ke6Var.f47095a) && this.f47096b == ke6Var.f47096b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f47096b) + (this.f47095a.hashCode() * 31);
    }

    public final String toString() {
        return "GuidedCourse(language=" + this.f47095a + ", level=" + this.f47096b + ")";
    }
}
