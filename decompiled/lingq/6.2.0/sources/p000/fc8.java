package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class fc8 {

    /* JADX INFO: renamed from: a */
    public final int f38852a;

    /* JADX INFO: renamed from: b */
    public final cb8 f38853b;

    /* JADX INFO: renamed from: c */
    public final boolean f38854c;

    /* JADX INFO: renamed from: d */
    public final boolean f38855d;

    public fc8(int i, cb8 cb8Var, boolean z, boolean z2) {
        cb8Var.getClass();
        this.f38852a = i;
        this.f38853b = cb8Var;
        this.f38854c = z;
        this.f38855d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc8)) {
            return false;
        }
        fc8 fc8Var = (fc8) obj;
        return this.f38852a == fc8Var.f38852a && fa4.m11650l(this.f38853b, fc8Var.f38853b) && this.f38854c == fc8Var.f38854c && this.f38855d == fc8Var.f38855d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38855d) + g9a.m12428e((this.f38853b.hashCode() + (Integer.hashCode(this.f38852a) * 31)) * 31, 31, this.f38854c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewBottomBarButton(textRes=");
        sb.append(this.f38852a);
        sb.append(", action=");
        sb.append(this.f38853b);
        sb.append(", enabled=");
        return e65.m10875g(sb, this.f38854c, ", isPrimary=", this.f38855d, ")");
    }
}
