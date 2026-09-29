package p000;

/* JADX INFO: loaded from: classes.dex */
public final class f95 extends h95 {

    /* JADX INFO: renamed from: b */
    public final int f38668b;

    /* JADX INFO: renamed from: c */
    public final int f38669c;

    /* JADX INFO: renamed from: d */
    public final int f38670d;

    /* JADX INFO: renamed from: e */
    public final int f38671e;

    /* JADX INFO: renamed from: f */
    public final String f38672f;

    /* JADX INFO: renamed from: g */
    public final int f38673g;

    /* JADX INFO: renamed from: h */
    public final boolean f38674h;

    /* JADX INFO: renamed from: i */
    public final String f38675i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f95(int i, int i2, int i3, int i4, String str, int i5, boolean z, int i6) {
        super("stats");
        i = (i6 & 1) != 0 ? 0 : i;
        i2 = (i6 & 2) != 0 ? 0 : i2;
        i3 = (i6 & 4) != 0 ? 0 : i3;
        i4 = (i6 & 8) != 0 ? 0 : i4;
        str = (i6 & 16) != 0 ? "" : str;
        i5 = (i6 & 32) != 0 ? 1 : i5;
        str.getClass();
        this.f38668b = i;
        this.f38669c = i2;
        this.f38670d = i3;
        this.f38671e = i4;
        this.f38672f = str;
        this.f38673g = i5;
        this.f38674h = z;
        this.f38675i = "stats";
    }

    @Override // p000.h95
    /* JADX INFO: renamed from: a */
    public final String mo188a() {
        return this.f38675i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f95)) {
            return false;
        }
        f95 f95Var = (f95) obj;
        return this.f38668b == f95Var.f38668b && this.f38669c == f95Var.f38669c && this.f38670d == f95Var.f38670d && this.f38671e == f95Var.f38671e && this.f38672f.equals(f95Var.f38672f) && this.f38673g == f95Var.f38673g && this.f38674h == f95Var.f38674h && this.f38675i.equals(f95Var.f38675i);
    }

    public final int hashCode() {
        return this.f38675i.hashCode() + g9a.m12428e(wq1.m24106b(this.f38673g, ux5.m22980c(wq1.m24106b(this.f38671e, wq1.m24106b(this.f38670d, wq1.m24106b(this.f38669c, Integer.hashCode(this.f38668b) * 31, 31), 31), 31), this.f38672f, 31), 31), 31, this.f38674h);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f38668b, this.f38669c, "Stats(days=", ", coins=", ", goal=");
        hn1.m13360j(this.f38670d, this.f38671e, ", wordsRead=", ", listeningTime=", sbM22994q);
        AbstractC3393o1.m17748w(this.f38673g, this.f38672f, ", activityID=", ", isLoading=", sbM22994q);
        sbM22994q.append(this.f38674h);
        sbM22994q.append(", key=");
        sbM22994q.append(this.f38675i);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }
}
