package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class xc7 implements ad7 {

    /* JADX INFO: renamed from: a */
    public final int f68064a;

    /* JADX INFO: renamed from: b */
    public final int f68065b;

    public xc7(int i, int i2) {
        this.f68064a = i;
        this.f68065b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc7)) {
            return false;
        }
        xc7 xc7Var = (xc7) obj;
        return this.f68064a == xc7Var.f68064a && this.f68065b == xc7Var.f68065b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f68065b) + (Integer.hashCode(this.f68064a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f68064a, this.f68065b, "OnSwap(from=", ", to=", ")");
    }
}
