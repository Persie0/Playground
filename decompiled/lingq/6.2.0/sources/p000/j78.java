package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class j78 extends k78 {

    /* JADX INFO: renamed from: a */
    public final int f45161a;

    /* JADX INFO: renamed from: b */
    public final int f45162b;

    public j78(int i, int i2) {
        this.f45161a = i;
        this.f45162b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j78)) {
            return false;
        }
        j78 j78Var = (j78) obj;
        return this.f45161a == j78Var.f45161a && this.f45162b == j78Var.f45162b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f45162b) + (Integer.hashCode(this.f45161a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f45161a, this.f45162b, "NotEnoughBalance(price=", ", balance=", ")");
    }
}
