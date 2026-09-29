package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class fm6 {

    /* JADX INFO: renamed from: a */
    public final int f39285a;

    /* JADX INFO: renamed from: b */
    public final int f39286b;

    public fm6(int i, int i2) {
        this.f39285a = i;
        this.f39286b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm6)) {
            return false;
        }
        fm6 fm6Var = (fm6) obj;
        return this.f39285a == fm6Var.f39285a && this.f39286b == fm6Var.f39286b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39286b) + (Integer.hashCode(this.f39285a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f39285a, this.f39286b, "NotEnoughBalanceDialogState(price=", ", balance=", ")");
    }
}
