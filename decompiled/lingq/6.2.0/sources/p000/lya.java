package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class lya {

    /* JADX INFO: renamed from: a */
    public final int f50318a;

    /* JADX INFO: renamed from: b */
    public final int f50319b;

    public lya(int i, int i2) {
        this.f50318a = i;
        this.f50319b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lya)) {
            return false;
        }
        lya lyaVar = (lya) obj;
        return this.f50318a == lyaVar.f50318a && this.f50319b == lyaVar.f50319b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f50319b) + (Integer.hashCode(this.f50318a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f50318a, this.f50319b, "OnRangeChanged(min=", ", max=", ")");
    }
}
