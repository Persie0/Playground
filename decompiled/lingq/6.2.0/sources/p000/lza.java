package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class lza extends qza {

    /* JADX INFO: renamed from: a */
    public final int f50361a;

    /* JADX INFO: renamed from: b */
    public final int f50362b;

    public lza(int i, int i2) {
        this.f50361a = i;
        this.f50362b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lza)) {
            return false;
        }
        lza lzaVar = (lza) obj;
        return this.f50361a == lzaVar.f50361a && this.f50362b == lzaVar.f50362b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f50362b) + (Integer.hashCode(this.f50361a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f50361a, this.f50362b, "OnRangeChanged(min=", ", max=", ")");
    }
}
