package p402u0;

import android.support.v4.media.C0141b;

/* JADX INFO: renamed from: u0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C9375r {

    /* JADX INFO: renamed from: a */
    public final double f48161a;

    /* JADX INFO: renamed from: b */
    public final double f48162b;

    /* JADX INFO: renamed from: c */
    public final double f48163c;

    /* JADX INFO: renamed from: d */
    public final double f48164d;

    /* JADX INFO: renamed from: e */
    public final double f48165e;

    /* JADX INFO: renamed from: f */
    public final double f48166f = 0.0d;

    /* JADX INFO: renamed from: g */
    public final double f48167g = 0.0d;

    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x009b  */
    /* JADX WARN: Code duplicated, block: B:73:0x00b9  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        if ((r6 == 0.0d) == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C9375r(double d10, double d11, double d12, double d13, double d14) {
        this.f48161a = d10;
        this.f48162b = d11;
        this.f48163c = d12;
        this.f48164d = d13;
        this.f48165e = d14;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(0.0d) || Double.isNaN(0.0d) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d) {
            if (!(d11 == 0.0d)) {
            }
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d14 >= 1.0d) {
            if (d13 == 0.0d) {
                throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
            }
        }
        if (d11 == 0.0d) {
            if (d13 == 0.0d) {
                throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
            }
        } else {
            if (d10 == 0.0d) {
                if (d13 == 0.0d) {
                    throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
                }
            }
        }
        if (d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d11 < 0.0d || d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9375r)) {
            return false;
        }
        C9375r c9375r = (C9375r) obj;
        return Double.compare(this.f48161a, c9375r.f48161a) == 0 && Double.compare(this.f48162b, c9375r.f48162b) == 0 && Double.compare(this.f48163c, c9375r.f48163c) == 0 && Double.compare(this.f48164d, c9375r.f48164d) == 0 && Double.compare(this.f48165e, c9375r.f48165e) == 0 && Double.compare(this.f48166f, c9375r.f48166f) == 0 && Double.compare(this.f48167g, c9375r.f48167g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f48167g) + C0141b.m609e(this.f48166f, C0141b.m609e(this.f48165e, C0141b.m609e(this.f48164d, C0141b.m609e(this.f48163c, C0141b.m609e(this.f48162b, Double.hashCode(this.f48161a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f48161a + ", a=" + this.f48162b + ", b=" + this.f48163c + ", c=" + this.f48164d + ", d=" + this.f48165e + ", e=" + this.f48166f + ", f=" + this.f48167g + ')';
    }
}
