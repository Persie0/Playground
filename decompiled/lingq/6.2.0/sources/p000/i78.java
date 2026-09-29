package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class i78 extends k78 {

    /* JADX INFO: renamed from: a */
    public final int f43629a;

    /* JADX INFO: renamed from: b */
    public final int f43630b;

    public i78(int i, int i2) {
        this.f43629a = i;
        this.f43630b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i78)) {
            return false;
        }
        i78 i78Var = (i78) obj;
        return this.f43629a == i78Var.f43629a && this.f43630b == i78Var.f43630b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43630b) + (Integer.hashCode(this.f43629a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f43629a, this.f43630b, "CanPurchase(price=", ", balance=", ")");
    }
}
