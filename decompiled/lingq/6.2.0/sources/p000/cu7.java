package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class cu7 implements du7 {

    /* JADX INFO: renamed from: a */
    public final int f34548a;

    /* JADX INFO: renamed from: b */
    public final int f34549b;

    /* JADX INFO: renamed from: c */
    public final int f34550c;

    public cu7(int i, int i2, int i3) {
        this.f34548a = i;
        this.f34549b = i2;
        this.f34550c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu7)) {
            return false;
        }
        cu7 cu7Var = (cu7) obj;
        return this.f34548a == cu7Var.f34548a && this.f34549b == cu7Var.f34549b && this.f34550c == cu7Var.f34550c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34550c) + wq1.m24106b(this.f34549b, Integer.hashCode(this.f34548a) * 31, 31);
    }

    public final String toString() {
        return wq1.m24123s(ux5.m22994q(this.f34548a, this.f34549b, "Success(totalPages=", ", currentPage=", ", completedPages="), this.f34550c, ")");
    }
}
