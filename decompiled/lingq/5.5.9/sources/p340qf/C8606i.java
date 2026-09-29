package p340qf;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import nf.C7771b;

/* JADX INFO: renamed from: qf.i */
/* JADX INFO: loaded from: classes.dex */
public final class C8606i extends AbstractC8612o {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p340qf.AbstractC8609l
    /* JADX INFO: renamed from: b */
    public final boolean[] mo9302b(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + AbstractC8611n.m16828e(str);
            } catch (FormatException e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!AbstractC8611n.m16827d(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int i10 = C8605h.f46090f[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iM16825a = AbstractC8609l.m16825a(zArr, 0, AbstractC8611n.f46095a, true) + 0;
        for (int i11 = 1; i11 <= 6; i11++) {
            int iDigit = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                iDigit += 10;
            }
            iM16825a += AbstractC8609l.m16825a(zArr, iM16825a, AbstractC8611n.f46099e[iDigit], false);
        }
        int iM16825a2 = AbstractC8609l.m16825a(zArr, iM16825a, AbstractC8611n.f46096b, false) + iM16825a;
        for (int i12 = 7; i12 <= 12; i12++) {
            iM16825a2 += AbstractC8609l.m16825a(zArr, iM16825a2, AbstractC8611n.f46098d[Character.digit(str.charAt(i12), 10)], true);
        }
        AbstractC8609l.m16825a(zArr, iM16825a2, AbstractC8611n.f46095a, true);
        return zArr;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p340qf.AbstractC8609l, p242lf.InterfaceC7358c
    /* JADX INFO: renamed from: j0 */
    public final C7771b mo9303j0(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_13) {
            return super.mo9303j0(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
