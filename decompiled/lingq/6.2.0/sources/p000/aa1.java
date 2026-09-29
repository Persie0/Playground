package p000;

/* JADX INFO: loaded from: classes.dex */
public final class aa1 {

    /* JADX INFO: renamed from: b */
    public static final long f403b = d32.m10037f(4278190080L);

    /* JADX INFO: renamed from: c */
    public static final long f404c;

    /* JADX INFO: renamed from: d */
    public static final long f405d;

    /* JADX INFO: renamed from: e */
    public static final long f406e;

    /* JADX INFO: renamed from: f */
    public static final long f407f;

    /* JADX INFO: renamed from: g */
    public static final long f408g;

    /* JADX INFO: renamed from: h */
    public static final long f409h;

    /* JADX INFO: renamed from: i */
    public static final long f410i;

    /* JADX INFO: renamed from: j */
    public static final long f411j;

    /* JADX INFO: renamed from: k */
    public static final long f412k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f413l = 0;

    /* JADX INFO: renamed from: a */
    public final long f414a;

    static {
        d32.m10037f(4282664004L);
        f404c = d32.m10037f(4287137928L);
        f405d = d32.m10037f(4291611852L);
        f406e = d32.m10037f(4294967295L);
        f407f = d32.m10037f(4294901760L);
        f408g = d32.m10037f(4278255360L);
        f409h = d32.m10037f(4278190335L);
        f410i = d32.m10037f(4294967040L);
        d32.m10037f(4278255615L);
        d32.m10037f(4294902015L);
        f411j = d32.m10035e(0);
        float[] fArr = va1.f65096a;
        f412k = d32.m10033d(0.0f, 0.0f, 0.0f, 0.0f, va1.f65116u);
    }

    public /* synthetic */ aa1(long j) {
        this.f414a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final long m197a(long j, sa1 sa1Var) {
        ri1 ri1VarM24355l;
        sa1 sa1VarM202f = m202f(j);
        int i = sa1VarM202f.f60576c;
        int i2 = sa1Var.f60576c;
        if ((i | i2) < 0) {
            ri1VarM24355l = x74.m24355l(sa1VarM202f, sa1Var);
        } else {
            t56 t56Var = si1.f60887a;
            int i3 = i | (i2 << 6);
            Object objM10152b = t56Var.m10152b(i3);
            if (objM10152b == null) {
                objM10152b = x74.m24355l(sa1VarM202f, sa1Var);
                t56Var.m21850i(i3, objM10152b);
            }
            ri1VarM24355l = (ri1) objM10152b;
        }
        return ri1VarM24355l.mo19178a(j);
    }

    /* JADX INFO: renamed from: b */
    public static long m198b(float f, long j) {
        return d32.m10033d(m204h(j), m203g(j), m201e(j), f, m202f(j));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m199c(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: d */
    public static final float m200d(long j) {
        float fM10392d;
        float f;
        if ((63 & j) == 0) {
            fM10392d = (float) dha.m10392d((j >>> 56) & 255);
            f = 255.0f;
        } else {
            fM10392d = (float) dha.m10392d((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return fM10392d / f;
    }

    /* JADX INFO: renamed from: e */
    public static final float m201e(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) dha.m10392d((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - a73.f318a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: f */
    public static final sa1 m202f(long j) {
        float[] fArr = va1.f65096a;
        return va1.f65120y[(int) (j & 63)];
    }

    /* JADX INFO: renamed from: g */
    public static final float m203g(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) dha.m10392d((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - a73.f318a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: h */
    public static final float m204h(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) dha.m10392d((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - a73.f318a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: i */
    public static String m205i(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(m204h(j));
        sb.append(", ");
        sb.append(m203g(j));
        sb.append(", ");
        sb.append(m201e(j));
        sb.append(", ");
        sb.append(m200d(j));
        sb.append(", ");
        return ux5.m22992o(sb, m202f(j).f60574a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aa1) {
            return this.f414a == ((aa1) obj).f414a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f414a);
    }

    public final String toString() {
        return m205i(this.f414a);
    }
}
