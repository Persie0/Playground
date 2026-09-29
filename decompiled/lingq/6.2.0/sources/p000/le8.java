package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class le8 extends oe8 {

    /* JADX INFO: renamed from: a */
    public final int f49559a;

    /* JADX INFO: renamed from: b */
    public final int f49560b;

    public le8(int i, int i2) {
        this.f49559a = i;
        this.f49560b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le8)) {
            return false;
        }
        le8 le8Var = (le8) obj;
        return this.f49559a == le8Var.f49559a && this.f49560b == le8Var.f49560b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f49560b) + (Integer.hashCode(this.f49559a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f49559a, this.f49560b, "Header(result=", ", total=", ")");
    }
}
