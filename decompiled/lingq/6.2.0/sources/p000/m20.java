package p000;

/* JADX INFO: loaded from: classes.dex */
public final class m20 {

    /* JADX INFO: renamed from: a */
    public final long f50442a;

    /* JADX INFO: renamed from: b */
    public final long f50443b;

    /* JADX INFO: renamed from: c */
    public final long f50444c;

    public m20(long j, long j2, long j3) {
        this.f50442a = j;
        this.f50443b = j2;
        this.f50444c = j3;
        long j4 = zx9.f72359c;
        if (zx9.m25846a(j, j4)) {
            C3386nv.m17626m("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
            throw null;
        }
        if (zx9.m25846a(j2, j4)) {
            C3386nv.m17626m("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
            throw null;
        }
        if (zx9.m25846a(j3, j4)) {
            C3386nv.m17626m("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
            throw null;
        }
        if (ay9.m3127a(zx9.m25847b(j), zx9.m25847b(j2))) {
            d32.m10010H(j, j2);
            if (Float.compare(zx9.m25848c(j), zx9.m25848c(j2)) > 0) {
                this.f50442a = j2;
            }
        }
        if (ay9.m3127a(zx9.m25847b(j3), 4294967296L)) {
            long jM10032c0 = d32.m10032c0(1.0E-4f, 4294967296L);
            d32.m10010H(j3, jM10032c0);
            if (Float.compare(zx9.m25848c(j3), zx9.m25848c(jM10032c0)) < 0) {
                C3386nv.m17626m("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
                throw null;
            }
        }
        if (zx9.m25848c(this.f50442a) < 0.0f) {
            C3386nv.m17626m("AutoSize.StepBased: minFontSize must not be negative");
            throw null;
        }
        if (zx9.m25848c(j2) >= 0.0f) {
            return;
        }
        C3386nv.m17626m("AutoSize.StepBased: maxFontSize must not be negative");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m16600a(rw9 rw9Var) {
        w46 w46Var = rw9Var.f59976b;
        long j = rw9Var.f59977c;
        qw9 qw9Var = rw9Var.f59975a;
        int i = qw9Var.f58300f;
        if (i == 1 || i == 3) {
            return ((float) ((int) (j >> 32))) < w46Var.f66379d || w46Var.f66378c || ((float) ((int) (j & 4294967295L))) < w46Var.f66380e;
        }
        if (i != 4 && i != 5 && i != 2) {
            v63.m23144v("TextOverflow type ", l70.m15920K(qw9Var.f58300f), " is not supported.");
            return false;
        }
        int i2 = w46Var.f66381f;
        if (i2 != 0) {
            if (i2 == 1) {
                return rw9Var.m20964k(0);
            }
            if (i == 4 || i == 5) {
                return ((float) ((int) (j >> 32))) < w46Var.f66379d || w46Var.f66378c || ((float) ((int) (j & 4294967295L))) < w46Var.f66380e;
            }
            if (i == 2) {
                return rw9Var.m20964k(i2 - 1);
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof m20)) {
            return false;
        }
        m20 m20Var = (m20) obj;
        return zx9.m25846a(m20Var.f50442a, this.f50442a) && zx9.m25846a(m20Var.f50443b, this.f50443b) && zx9.m25846a(m20Var.f50444c, this.f50444c);
    }

    public final int hashCode() {
        ay9[] ay9VarArr = zx9.f72358b;
        return Long.hashCode(this.f50444c) + ux5.m22981d(this.f50443b, Long.hashCode(this.f50442a) * 31, 31);
    }
}
