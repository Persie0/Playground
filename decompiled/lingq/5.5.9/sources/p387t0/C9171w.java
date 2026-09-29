package p387t0;

/* JADX INFO: renamed from: t0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C9171w implements Comparable<C9171w> {

    /* JADX INFO: renamed from: a */
    public static final a f47707a = new a();

    /* JADX INFO: renamed from: b */
    public static final float f47708b;

    /* JADX INFO: renamed from: t0.w$a */
    public static final class a {
    }

    static {
        m17504a(1.0f);
        m17504a(-1.0f);
        f47708b = Float.intBitsToFloat(1056964608);
    }

    /* JADX INFO: renamed from: a */
    public static short m17504a(float f3) {
        int i10;
        int i11;
        f47707a.getClass();
        int iFloatToRawIntBits = Float.floatToRawIntBits(f3);
        int i12 = iFloatToRawIntBits >>> 31;
        int i13 = (iFloatToRawIntBits >>> 23) & 255;
        int i14 = iFloatToRawIntBits & 8388607;
        int i15 = 31;
        int i16 = 0;
        if (i13 == 255) {
            if (i14 != 0) {
                i11 = 512;
                i16 = i11;
            }
            i10 = (i12 << 15) | (i15 << 10) | i16;
        } else {
            int i17 = (i13 - 127) + 15;
            if (i17 >= 31) {
                i15 = 49;
            } else if (i17 > 0) {
                i16 = i14 >> 13;
                if ((i14 & 4096) != 0) {
                    i10 = (((i17 << 10) | i16) + 1) | (i12 << 15);
                } else {
                    i15 = i17;
                }
            } else if (i17 >= -10) {
                int i18 = (i14 | 8388608) >> (1 - i17);
                if ((i18 & 4096) != 0) {
                    i18 += 8192;
                }
                i11 = i18 >> 13;
                i15 = 0;
                i16 = i11;
            } else {
                i15 = 0;
            }
            i10 = (i12 << 15) | (i15 << 10) | i16;
        }
        return (short) i10;
    }

    /* JADX INFO: renamed from: f */
    public static final float m17505f(short s10) {
        int i10;
        int i11;
        int i12;
        int i13 = s10 & 65535;
        int i14 = 32768 & i13;
        int i15 = (i13 >>> 10) & 31;
        int i16 = i13 & 1023;
        if (i15 != 0) {
            int i17 = i16 << 13;
            if (i15 == 31) {
                i10 = 255;
                if (i17 != 0) {
                    i17 |= 4194304;
                }
                int i18 = i10;
                i11 = i17;
                i12 = i18;
            } else {
                i10 = (i15 - 15) + 127;
            }
            int i19 = i10;
            i11 = i17;
            i12 = i19;
        } else {
            if (i16 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i16 + 1056964608) - f47708b;
                return i14 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i14 << 16) | i11);
    }
}
