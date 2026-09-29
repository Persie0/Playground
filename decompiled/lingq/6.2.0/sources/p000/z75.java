package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class z75 extends a85 {

    /* JADX INFO: renamed from: a */
    public final wy5 f71018a;

    /* JADX INFO: renamed from: b */
    public final wy5 f71019b;

    /* JADX INFO: renamed from: c */
    public final int f71020c;

    /* JADX INFO: renamed from: d */
    public final int f71021d;

    /* JADX INFO: renamed from: e */
    public final Integer f71022e;

    public z75(wy5 wy5Var, wy5 wy5Var2, int i, int i2) {
        this.f71018a = wy5Var;
        this.f71019b = wy5Var2;
        this.f71020c = i;
        this.f71021d = i2;
        int i3 = i - i2;
        this.f71022e = i3 <= 0 ? null : Integer.valueOf(i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z75)) {
            return false;
        }
        z75 z75Var = (z75) obj;
        return fa4.m11650l(this.f71018a, z75Var.f71018a) && this.f71019b.equals(z75Var.f71019b) && this.f71020c == z75Var.f71020c && this.f71021d == z75Var.f71021d;
    }

    public final int hashCode() {
        wy5 wy5Var = this.f71018a;
        return Integer.hashCode(this.f71021d) + wq1.m24106b(this.f71020c, (this.f71019b.hashCode() + ((wy5Var == null ? 0 : wy5Var.hashCode()) * 31)) * 31, 31);
    }

    public final String toString() {
        return "Success(currentLevel=" + this.f71018a + ", nextLevel=" + this.f71019b + ", goal=" + this.f71020c + ", progress=" + this.f71021d + ")";
    }
}
