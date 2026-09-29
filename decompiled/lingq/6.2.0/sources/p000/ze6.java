package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ze6 extends hf6 {

    /* JADX INFO: renamed from: a */
    public final String f71459a;

    /* JADX INFO: renamed from: b */
    public final boolean f71460b;

    public ze6(String str, boolean z) {
        this.f71459a = str;
        this.f71460b = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m25569a() {
        return this.f71459a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m25570b() {
        return this.f71460b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze6)) {
            return false;
        }
        ze6 ze6Var = (ze6) obj;
        return fa4.m11650l(this.f71459a, ze6Var.f71459a) && this.f71460b == ze6Var.f71460b;
    }

    public final int hashCode() {
        String str = this.f71459a;
        return Boolean.hashCode(this.f71460b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Review(lotd=" + this.f71459a + ", isSRS=" + this.f71460b + ")";
    }
}
