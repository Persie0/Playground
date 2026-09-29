package p402u0;

import androidx.activity.result.C0204c;
import dm.C5207g;
import p338qd.C8584v;

/* JADX INFO: renamed from: u0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9360c {

    /* JADX INFO: renamed from: a */
    public final String f48101a;

    /* JADX INFO: renamed from: b */
    public final long f48102b;

    /* JADX INFO: renamed from: c */
    public final int f48103c;

    public AbstractC9360c(String str, long j10, int i10) {
        this.f48101a = str;
        this.f48102b = j10;
        this.f48103c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract float[] mo17723a(float[] fArr);

    /* JADX INFO: renamed from: b */
    public abstract float mo17724b(int i10);

    /* JADX INFO: renamed from: c */
    public abstract float mo17725c(int i10);

    /* JADX INFO: renamed from: d */
    public boolean mo17726d() {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public long mo17727e(float f3, float f10, float f11) {
        float[] fArrMo17728f = mo17728f(new float[]{f3, f10, f11});
        return (((long) Float.floatToIntBits(fArrMo17728f[0])) << 32) | (((long) Float.floatToIntBits(fArrMo17728f[1])) & 4294967295L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean zM17721a = false;
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                AbstractC9360c abstractC9360c = (AbstractC9360c) obj;
                if (this.f48103c != abstractC9360c.f48103c) {
                    return false;
                }
                if (C5207g.m11106a(this.f48101a, abstractC9360c.f48101a)) {
                    zM17721a = C9359b.m17721a(this.f48102b, abstractC9360c.f48102b);
                }
            }
        }
        return zM17721a;
    }

    /* JADX INFO: renamed from: f */
    public abstract float[] mo17728f(float[] fArr);

    /* JADX INFO: renamed from: g */
    public float mo17729g(float f3, float f10, float f11) {
        return mo17728f(new float[]{f3, f10, f11})[2];
    }

    /* JADX INFO: renamed from: h */
    public long mo17730h(float f3, float f10, float f11, float f12, AbstractC9360c abstractC9360c) {
        C5207g.m11111f(abstractC9360c, "colorSpace");
        int i10 = C9359b.f48100e;
        float[] fArr = new float[(int) (this.f48102b >> 32)];
        fArr[0] = f3;
        fArr[1] = f10;
        fArr[2] = f11;
        float[] fArrMo17723a = mo17723a(fArr);
        return C8584v.m16782g(fArrMo17723a[0], fArrMo17723a[1], fArrMo17723a[2], f12, abstractC9360c);
    }

    public int hashCode() {
        int iHashCode = this.f48101a.hashCode() * 31;
        int i10 = C9359b.f48100e;
        return C0204c.m847f(this.f48102b, iHashCode, 31) + this.f48103c;
    }

    public final String toString() {
        return this.f48101a + " (id=" + this.f48103c + ", model=" + ((Object) C9359b.m17722b(this.f48102b)) + ')';
    }
}
