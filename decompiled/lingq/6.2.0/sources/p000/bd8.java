package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class bd8 {

    /* JADX INFO: renamed from: a */
    public final int f8388a;

    /* JADX INFO: renamed from: b */
    public final cb8 f8389b;

    /* JADX INFO: renamed from: c */
    public final boolean f8390c;

    /* JADX INFO: renamed from: d */
    public final boolean f8391d;

    public bd8(int i, cb8 cb8Var, boolean z, boolean z2) {
        cb8Var.getClass();
        this.f8388a = i;
        this.f8389b = cb8Var;
        this.f8390c = z;
        this.f8391d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd8)) {
            return false;
        }
        bd8 bd8Var = (bd8) obj;
        return this.f8388a == bd8Var.f8388a && fa4.m11650l(this.f8389b, bd8Var.f8389b) && this.f8390c == bd8Var.f8390c && this.f8391d == bd8Var.f8391d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8391d) + g9a.m12428e((this.f8389b.hashCode() + (Integer.hashCode(this.f8388a) * 31)) * 31, 31, this.f8390c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewControlButtonState(textRes=");
        sb.append(this.f8388a);
        sb.append(", action=");
        sb.append(this.f8389b);
        sb.append(", enabled=");
        return e65.m10875g(sb, this.f8390c, ", isPrimary=", this.f8391d, ")");
    }

    public /* synthetic */ bd8(int i, cb8 cb8Var, int i2) {
        this(i, cb8Var, true, (i2 & 8) == 0);
    }
}
