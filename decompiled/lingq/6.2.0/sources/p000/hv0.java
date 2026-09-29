package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class hv0 {

    /* JADX INFO: renamed from: a */
    public final long f42964a;

    /* JADX INFO: renamed from: b */
    public final long f42965b;

    /* JADX INFO: renamed from: c */
    public final long f42966c;

    /* JADX INFO: renamed from: d */
    public final long f42967d;

    /* JADX INFO: renamed from: e */
    public final long f42968e;

    /* JADX INFO: renamed from: f */
    public final boolean f42969f;

    public hv0(long j, long j2, long j3, long j4, long j5, boolean z) {
        this.f42964a = j;
        this.f42965b = j2;
        this.f42966c = j3;
        this.f42967d = j4;
        this.f42968e = j5;
        this.f42969f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv0)) {
            return false;
        }
        hv0 hv0Var = (hv0) obj;
        return aa1.m199c(this.f42964a, hv0Var.f42964a) && aa1.m199c(this.f42965b, hv0Var.f42965b) && aa1.m199c(this.f42966c, hv0Var.f42966c) && aa1.m199c(this.f42967d, hv0Var.f42967d) && aa1.m199c(this.f42968e, hv0Var.f42968e) && this.f42969f == hv0Var.f42969f;
    }

    public final int hashCode() {
        int i = aa1.f413l;
        return Boolean.hashCode(this.f42969f) + ux5.m22981d(this.f42968e, ux5.m22981d(this.f42967d, ux5.m22981d(this.f42966c, ux5.m22981d(this.f42965b, Long.hashCode(this.f42964a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM205i = aa1.m205i(this.f42964a);
        String strM205i2 = aa1.m205i(this.f42965b);
        String strM205i3 = aa1.m205i(this.f42966c);
        String strM205i4 = aa1.m205i(this.f42967d);
        String strM205i5 = aa1.m205i(this.f42968e);
        StringBuilder sbM23000w = ux5.m23000w("ChartStyle(primaryLineColor=", strM205i, ", secondaryLineColor=", strM205i2, ", axisColor=");
        AbstractC3393o1.m17725C(sbM23000w, strM205i3, ", gridLineColor=", strM205i4, ", labelColor=");
        sbM23000w.append(strM205i5);
        sbM23000w.append(", showAreaFill=");
        sbM23000w.append(this.f42969f);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
