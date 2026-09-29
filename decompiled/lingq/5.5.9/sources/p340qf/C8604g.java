package p340qf;

import android.support.v4.media.session.C0166e;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import nf.C7771b;

/* JADX INFO: renamed from: qf.g */
/* JADX INFO: loaded from: classes.dex */
public final class C8604g extends AbstractC8609l {
    /* JADX INFO: renamed from: d */
    public static void m16822d(boolean[] zArr, int i10, int[] iArr) {
        int length = iArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i10 + 1;
            zArr[i10] = iArr[i11] != 0;
            i11++;
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m16823e(String str, int i10) {
        int iIndexOf = 0;
        int i11 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i11;
            i11++;
            if (i11 > i10) {
                i11 = 1;
            }
        }
        return iIndexOf % 47;
    }

    /* JADX INFO: renamed from: f */
    public static void m16824f(int[] iArr, int i10) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) == 0) {
                i12 = 0;
            }
            iArr[i11] = i12;
        }
    }

    @Override // p340qf.AbstractC8609l
    /* JADX INFO: renamed from: b */
    public final boolean[] mo9302b(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        int[] iArr = new int[9];
        int length2 = ((str.length() + 2 + 2) * 9) + 1;
        m16824f(iArr, C8603f.f46089a[47]);
        boolean[] zArr = new boolean[length2];
        m16822d(zArr, 0, iArr);
        int i10 = 9;
        for (int i11 = 0; i11 < length; i11++) {
            m16824f(iArr, C8603f.f46089a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i11))]);
            m16822d(zArr, i10, iArr);
            i10 += 9;
        }
        int iM16823e = m16823e(str, 20);
        int[] iArr2 = C8603f.f46089a;
        m16824f(iArr, iArr2[iM16823e]);
        m16822d(zArr, i10, iArr);
        int i12 = i10 + 9;
        StringBuilder sbM771r = C0166e.m771r(str);
        sbM771r.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iM16823e));
        m16824f(iArr, iArr2[m16823e(sbM771r.toString(), 15)]);
        m16822d(zArr, i12, iArr);
        int i13 = i12 + 9;
        m16824f(iArr, iArr2[47]);
        m16822d(zArr, i13, iArr);
        zArr[i13 + 9] = true;
        return zArr;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p340qf.AbstractC8609l, p242lf.InterfaceC7358c
    /* JADX INFO: renamed from: j0 */
    public final C7771b mo9303j0(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_93) {
            return super.mo9303j0(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
