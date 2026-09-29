package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class qs1 {

    /* JADX INFO: renamed from: a */
    public final String f58120a;

    /* JADX INFO: renamed from: b */
    public final String f58121b;

    /* JADX INFO: renamed from: c */
    public final boolean f58122c;

    /* JADX INFO: renamed from: d */
    public final int f58123d;

    public qs1(String str, int i, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f58120a = str;
        this.f58121b = str2;
        this.f58122c = z;
        this.f58123d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs1)) {
            return false;
        }
        qs1 qs1Var = (qs1) obj;
        return fa4.m11650l(this.f58120a, qs1Var.f58120a) && fa4.m11650l(this.f58121b, qs1Var.f58121b) && this.f58122c == qs1Var.f58122c && this.f58123d == qs1Var.f58123d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f58123d) + g9a.m12428e(ux5.m22980c(this.f58120a.hashCode() * 31, this.f58121b, 31), 31, this.f58122c);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("CupBadgeUi(title=", this.f58120a, ", caption=", this.f58121b, ", earned=");
        sbM23000w.append(this.f58122c);
        sbM23000w.append(", iconRes=");
        sbM23000w.append(this.f58123d);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
