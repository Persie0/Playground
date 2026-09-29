package p340qf;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import nf.C7771b;

/* JADX INFO: renamed from: qf.q */
/* JADX INFO: loaded from: classes.dex */
public final class C8614q extends AbstractC8612o {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p340qf.AbstractC8609l
    /* JADX INFO: renamed from: b */
    public final boolean[] mo9302b(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + AbstractC8611n.m16828e(C8613p.m16829f(str));
            } catch (FormatException e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!AbstractC8611n.m16827d(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int iDigit = Character.digit(str.charAt(0), 10);
        if (iDigit != 0 && iDigit != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int i10 = C8613p.f46100f[iDigit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int iM16825a = AbstractC8609l.m16825a(zArr, 0, AbstractC8611n.f46095a, true) + 0;
        for (int i11 = 1; i11 <= 6; i11++) {
            int iDigit2 = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                iDigit2 += 10;
            }
            iM16825a += AbstractC8609l.m16825a(zArr, iM16825a, AbstractC8611n.f46099e[iDigit2], false);
        }
        AbstractC8609l.m16825a(zArr, iM16825a, AbstractC8611n.f46097c, false);
        return zArr;
    }

    @Override // p340qf.AbstractC8609l, p242lf.InterfaceC7358c
    /* JADX INFO: renamed from: j0 */
    public final C7771b mo9303j0(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat == BarcodeFormat.UPC_E) {
            return super.mo9303j0(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
