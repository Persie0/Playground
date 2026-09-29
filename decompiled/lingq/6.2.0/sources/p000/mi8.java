package p000;

/* JADX INFO: loaded from: classes.dex */
public final class mi8 {

    /* JADX INFO: renamed from: a */
    public final float f51360a;

    /* JADX INFO: renamed from: b */
    public final float f51361b;

    /* JADX INFO: renamed from: c */
    public final float f51362c;

    /* JADX INFO: renamed from: d */
    public final float f51363d;

    /* JADX INFO: renamed from: e */
    public final long f51364e;

    /* JADX INFO: renamed from: f */
    public final long f51365f;

    /* JADX INFO: renamed from: g */
    public final long f51366g;

    /* JADX INFO: renamed from: h */
    public final long f51367h;

    static {
        omd.m18154j(0.0f, 0.0f, 0.0f, 0.0f, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    public mi8(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.f51360a = f;
        this.f51361b = f2;
        this.f51362c = f3;
        this.f51363d = f4;
        this.f51364e = j;
        this.f51365f = j2;
        this.f51366g = j3;
        this.f51367h = j4;
    }

    /* JADX INFO: renamed from: a */
    public final float m16845a() {
        return this.f51363d - this.f51361b;
    }

    /* JADX INFO: renamed from: b */
    public final float m16846b() {
        return this.f51362c - this.f51360a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi8)) {
            return false;
        }
        mi8 mi8Var = (mi8) obj;
        return Float.compare(this.f51360a, mi8Var.f51360a) == 0 && Float.compare(this.f51361b, mi8Var.f51361b) == 0 && Float.compare(this.f51362c, mi8Var.f51362c) == 0 && Float.compare(this.f51363d, mi8Var.f51363d) == 0 && AbstractC3352my.m17146y(this.f51364e, mi8Var.f51364e) && AbstractC3352my.m17146y(this.f51365f, mi8Var.f51365f) && AbstractC3352my.m17146y(this.f51366g, mi8Var.f51366g) && AbstractC3352my.m17146y(this.f51367h, mi8Var.f51367h);
    }

    public final int hashCode() {
        return Long.hashCode(this.f51367h) + ux5.m22981d(this.f51366g, ux5.m22981d(this.f51365f, ux5.m22981d(this.f51364e, wq1.m24105a(wq1.m24105a(wq1.m24105a(Float.hashCode(this.f51360a) * 31, this.f51361b, 31), this.f51362c, 31), this.f51363d, 31), 31), 31), 31);
    }

    public final String toString() {
        String str = do7.m10521H(this.f51360a) + ", " + do7.m10521H(this.f51361b) + ", " + do7.m10521H(this.f51362c) + ", " + do7.m10521H(this.f51363d);
        long j = this.f51364e;
        long j2 = this.f51365f;
        boolean zM17146y = AbstractC3352my.m17146y(j, j2);
        long j3 = this.f51366g;
        long j4 = this.f51367h;
        if (!zM17146y || !AbstractC3352my.m17146y(j2, j3) || !AbstractC3352my.m17146y(j3, j4)) {
            StringBuilder sbM17742q = AbstractC3393o1.m17742q("RoundRect(rect=", str, ", topLeft=");
            sbM17742q.append((Object) AbstractC3352my.m17127j0(j));
            sbM17742q.append(", topRight=");
            sbM17742q.append((Object) AbstractC3352my.m17127j0(j2));
            sbM17742q.append(", bottomRight=");
            sbM17742q.append((Object) AbstractC3352my.m17127j0(j3));
            sbM17742q.append(", bottomLeft=");
            sbM17742q.append((Object) AbstractC3352my.m17127j0(j4));
            sbM17742q.append(')');
            return sbM17742q.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder sbM17742q2 = AbstractC3393o1.m17742q("RoundRect(rect=", str, ", radius=");
            sbM17742q2.append(do7.m10521H(Float.intBitsToFloat(i)));
            sbM17742q2.append(')');
            return sbM17742q2.toString();
        }
        StringBuilder sbM17742q3 = AbstractC3393o1.m17742q("RoundRect(rect=", str, ", x=");
        sbM17742q3.append(do7.m10521H(Float.intBitsToFloat(i)));
        sbM17742q3.append(", y=");
        sbM17742q3.append(do7.m10521H(Float.intBitsToFloat(i2)));
        sbM17742q3.append(')');
        return sbM17742q3.toString();
    }
}
