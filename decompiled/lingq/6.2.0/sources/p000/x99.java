package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class x99 {

    /* JADX INFO: renamed from: a */
    public final int f67980a;

    /* JADX INFO: renamed from: b */
    public final int f67981b;

    public x99(int i, int i2) {
        this.f67980a = i;
        this.f67981b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x99)) {
            return false;
        }
        x99 x99Var = (x99) obj;
        return this.f67980a == x99Var.f67980a && this.f67981b == x99Var.f67981b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67981b) + (Integer.hashCode(this.f67980a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f67980a, this.f67981b, "SkritterExportSummary(added=", ", skipped=", ")");
    }
}
