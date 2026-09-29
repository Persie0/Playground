package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class bm9 {

    /* JADX INFO: renamed from: a */
    public final String f8692a;

    /* JADX INFO: renamed from: b */
    public final int f8693b;

    /* JADX INFO: renamed from: c */
    public final int f8694c;

    /* JADX INFO: renamed from: d */
    public final String f8695d;

    public bm9(String str, int i, int i2, String str2) {
        this.f8692a = str;
        this.f8693b = i;
        this.f8694c = i2;
        this.f8695d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm9)) {
            return false;
        }
        bm9 bm9Var = (bm9) obj;
        return this.f8692a.equals(bm9Var.f8692a) && this.f8693b == bm9Var.f8693b && this.f8694c == bm9Var.f8694c && this.f8695d.equals(bm9Var.f8695d);
    }

    public final int hashCode() {
        return this.f8695d.hashCode() + wq1.m24106b(this.f8694c, wq1.m24106b(this.f8693b, this.f8692a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f8693b, "StyleOption(value=", this.f8692a, ", titleRes=", ", descriptionRes=");
        sbM17741p.append(this.f8694c);
        sbM17741p.append(", emoji=");
        sbM17741p.append(this.f8695d);
        sbM17741p.append(")");
        return sbM17741p.toString();
    }
}
