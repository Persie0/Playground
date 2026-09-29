package p000;

import com.google.zxing.FormatException;
import com.google.zxing.ReaderException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tea extends ayb {

    /* JADX INFO: renamed from: b */
    public static final int[] f62201b = {1, 1, 1};

    /* JADX INFO: renamed from: c */
    public static final int[] f62202c = {1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: d */
    public static final int[] f62203d = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: e */
    public static final int[][] f62204e;

    /* JADX INFO: renamed from: f */
    public static final int[][] f62205f;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f62204e = iArr;
        int[][] iArr2 = new int[20][];
        f62205f = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f62204e[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f62205f[i] = iArr4;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m22017a(String str) {
        int length = str.length();
        if (length != 0) {
            int i = length - 1;
            if (m22018b(str.subSequence(0, i)) == Character.digit(str.charAt(i), 10)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static int m22018b(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int iCharAt = charSequence.charAt(i2) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                FormatException formatException = FormatException.f13965c;
                if (ReaderException.f13966a) {
                    throw new FormatException();
                }
                throw FormatException.f13965c;
            }
            i += iCharAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int iCharAt2 = charSequence.charAt(i4) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                FormatException formatException2 = FormatException.f13965c;
                if (ReaderException.f13966a) {
                    throw new FormatException();
                }
                throw FormatException.f13965c;
            }
            i3 += iCharAt2;
        }
        return (1000 - i3) % 10;
    }
}
