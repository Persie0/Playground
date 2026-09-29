package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class mua {

    /* JADX INFO: renamed from: a */
    public final int f51862a;

    /* JADX INFO: renamed from: b */
    public final int f51863b;

    /* JADX INFO: renamed from: c */
    public final int f51864c;

    /* JADX INFO: renamed from: d */
    public final int f51865d;

    /* JADX INFO: renamed from: e */
    public final int f51866e;

    /* JADX INFO: renamed from: f */
    public final int f51867f;

    public mua(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f51862a = i;
        this.f51863b = i2;
        this.f51864c = i3;
        this.f51865d = i4;
        this.f51866e = i5;
        this.f51867f = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mua)) {
            return false;
        }
        mua muaVar = (mua) obj;
        return this.f51862a == muaVar.f51862a && this.f51863b == muaVar.f51863b && this.f51864c == muaVar.f51864c && this.f51865d == muaVar.f51865d && this.f51866e == muaVar.f51866e && this.f51867f == muaVar.f51867f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f51867f) + wq1.m24106b(this.f51866e, wq1.m24106b(this.f51865d, wq1.m24106b(this.f51864c, wq1.m24106b(this.f51863b, Integer.hashCode(this.f51862a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f51862a, this.f51863b, "ViewPaddingState(left=", ", top=", ", right=");
        hn1.m13360j(this.f51864c, this.f51865d, ", bottom=", ", start=", sbM22994q);
        sbM22994q.append(this.f51866e);
        sbM22994q.append(", end=");
        sbM22994q.append(this.f51867f);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }
}
