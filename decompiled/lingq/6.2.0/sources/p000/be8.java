package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class be8 {

    /* JADX INFO: renamed from: a */
    public final int f8437a;

    /* JADX INFO: renamed from: b */
    public final int f8438b;

    public be8(int i, int i2) {
        this.f8437a = i;
        this.f8438b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be8)) {
            return false;
        }
        be8 be8Var = (be8) obj;
        return this.f8437a == be8Var.f8437a && this.f8438b == be8Var.f8438b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8438b) + (Integer.hashCode(this.f8437a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f8437a, this.f8438b, "ReviewProgressState(current=", ", total=", ")");
    }
}
