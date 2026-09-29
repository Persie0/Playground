package p000;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class x80 {

    /* JADX INFO: renamed from: a */
    public final String f67912a;

    /* JADX INFO: renamed from: b */
    public final char[] f67913b;

    /* JADX INFO: renamed from: c */
    public final int f67914c;

    /* JADX INFO: renamed from: d */
    public final int f67915d;

    /* JADX INFO: renamed from: e */
    public final int f67916e;

    /* JADX INFO: renamed from: f */
    public final int f67917f;

    /* JADX INFO: renamed from: g */
    public final byte[] f67918g;

    /* JADX INFO: renamed from: h */
    public final boolean f67919h;

    /* JADX WARN: Code duplicated, block: B:25:0x007c A[LOOP:0: B:23:0x0078->B:25:0x007c, LOOP_END] */
    public x80(String str, char[] cArr, byte[] bArr, boolean z) {
        int iNumberOfLeadingZeros;
        boolean[] zArr;
        this.f67912a = str;
        cArr.getClass();
        this.f67913b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (c84.f9702a[roundingMode2.ordinal()]) {
                    case 1:
                        oob.m18191b((length > 0) & (((length + (-1)) & length) == 0));
                    case 2:
                    case 3:
                        iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        break;
                    case 4:
                    case 5:
                        iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        iNumberOfLeadingZeros = (31 - iNumberOfLeadingZeros2) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros2) - length))) >>> 31);
                        break;
                    default:
                        uk9.m22780o();
                        break;
                }
                this.f67915d = iNumberOfLeadingZeros;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                int i = 1 << (3 - iNumberOfTrailingZeros);
                this.f67916e = i;
                this.f67917f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros;
                this.f67914c = cArr.length - 1;
                this.f67918g = bArr;
                zArr = new boolean[i];
                for (int i2 = 0; i2 < this.f67917f; i2++) {
                    int i3 = this.f67915d;
                    RoundingMode roundingMode3 = RoundingMode.CEILING;
                    zArr[ggd.m12592b(i2 * 8, i3)] = true;
                }
                this.f67919h = z;
            }
            C3386nv.m17626m(ux5.m22989l("x (", length, ") must be > 0"));
            iNumberOfLeadingZeros = 0;
            this.f67915d = iNumberOfLeadingZeros;
            int iNumberOfTrailingZeros2 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
            int i4 = 1 << (3 - iNumberOfTrailingZeros2);
            this.f67916e = i4;
            this.f67917f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros2;
            this.f67914c = cArr.length - 1;
            this.f67918g = bArr;
            zArr = new boolean[i4];
            while (i2 < this.f67917f) {
                int i5 = this.f67915d;
                RoundingMode roundingMode4 = RoundingMode.CEILING;
                zArr[ggd.m12592b(i2 * 8, i5)] = true;
            }
            this.f67919h = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x80)) {
            return false;
        }
        x80 x80Var = (x80) obj;
        return this.f67919h == x80Var.f67919h && Arrays.equals(this.f67913b, x80Var.f67913b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f67913b) + (this.f67919h ? 1231 : 1237);
    }

    public final String toString() {
        return this.f67912a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x80(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 128) {
                if (bArr[c] == -1) {
                    bArr[c] = (byte) i;
                } else {
                    C3386nv.m17626m(b34.m3207B("Duplicate character: %s", Character.valueOf(c)));
                    throw null;
                }
            } else {
                C3386nv.m17626m(b34.m3207B("Non-ASCII character: %s", Character.valueOf(c)));
                throw null;
            }
        }
        this(str, cArr, bArr, false);
    }
}
