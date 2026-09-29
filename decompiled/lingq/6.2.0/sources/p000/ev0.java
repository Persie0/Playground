package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ev0 {

    /* JADX INFO: renamed from: a */
    public final String f37922a;

    /* JADX INFO: renamed from: b */
    public final String f37923b;

    /* JADX INFO: renamed from: c */
    public final int f37924c;

    /* JADX INFO: renamed from: d */
    public final int f37925d;

    /* JADX INFO: renamed from: e */
    public final float f37926e;

    /* JADX INFO: renamed from: f */
    public final long f37927f;

    public ev0(String str, String str2, int i, int i2, float f, long j) {
        str.getClass();
        str2.getClass();
        this.f37922a = str;
        this.f37923b = str2;
        this.f37924c = i;
        this.f37925d = i2;
        this.f37926e = f;
        this.f37927f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev0)) {
            return false;
        }
        ev0 ev0Var = (ev0) obj;
        return fa4.m11650l(this.f37922a, ev0Var.f37922a) && fa4.m11650l(this.f37923b, ev0Var.f37923b) && this.f37924c == ev0Var.f37924c && this.f37925d == ev0Var.f37925d && xj2.m24560b(this.f37926e, ev0Var.f37926e) && aa1.m199c(this.f37927f, ev0Var.f37927f);
    }

    public final int hashCode() {
        int iM24105a = wq1.m24105a(wq1.m24106b(this.f37925d, wq1.m24106b(this.f37924c, ux5.m22980c(this.f37922a.hashCode() * 31, this.f37923b, 31), 31), 31), this.f37926e, 31);
        int i = aa1.f413l;
        return Long.hashCode(this.f37927f) + iM24105a;
    }

    public final String toString() {
        String strM24561c = xj2.m24561c(this.f37926e);
        String strM205i = aa1.m205i(this.f37927f);
        StringBuilder sbM23000w = ux5.m23000w("ChartLegendData(primaryLabel=", this.f37922a, ", secondaryLabel=", this.f37923b, ", primaryFace=");
        hn1.m13360j(this.f37924c, this.f37925d, ", secondaryFace=", ", imageSize=", sbM23000w);
        return wq1.m24125u(sbM23000w, strM24561c, ", labelColor=", strM205i, ")");
    }
}
