package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class vt3 {

    /* JADX INFO: renamed from: a */
    public final e28 f65874a;

    /* JADX INFO: renamed from: b */
    public final boolean f65875b;

    /* JADX INFO: renamed from: c */
    public final boolean f65876c;

    /* JADX INFO: renamed from: d */
    public final boolean f65877d;

    /* JADX INFO: renamed from: e */
    public final boolean f65878e;

    public vt3(e28 e28Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f65874a = e28Var;
        this.f65875b = z;
        this.f65876c = z2;
        this.f65877d = z3;
        this.f65878e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt3)) {
            return false;
        }
        vt3 vt3Var = (vt3) obj;
        return this.f65874a.equals(vt3Var.f65874a) && this.f65875b == vt3Var.f65875b && this.f65876c == vt3Var.f65876c && this.f65877d == vt3Var.f65877d && this.f65878e == vt3Var.f65878e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65878e) + g9a.m12428e(g9a.m12428e(g9a.m12428e(this.f65874a.hashCode() * 31, 31, this.f65875b), 31, this.f65876c), 31, this.f65877d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HingeInfo(bounds=");
        sb.append(this.f65874a);
        sb.append(", isFlat=");
        sb.append(this.f65875b);
        sb.append(", isVertical=");
        sb.append(this.f65876c);
        sb.append(", isSeparating=");
        sb.append(this.f65877d);
        sb.append(", isOccluding=");
        return ux5.m22993p(sb, this.f65878e, ')');
    }
}
