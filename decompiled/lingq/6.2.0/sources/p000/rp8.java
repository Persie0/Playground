package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class rp8 extends sp8 {

    /* JADX INFO: renamed from: a */
    public final int f59685a;

    /* JADX INFO: renamed from: b */
    public final int f59686b;

    public rp8(int i, int i2) {
        this.f59685a = i;
        this.f59686b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp8)) {
            return false;
        }
        rp8 rp8Var = (rp8) obj;
        return this.f59685a == rp8Var.f59685a && this.f59686b == rp8Var.f59686b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59686b) + (Integer.hashCode(this.f59685a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f59685a, this.f59686b, "OnRangeChanged(min=", ", max=", ")");
    }
}
