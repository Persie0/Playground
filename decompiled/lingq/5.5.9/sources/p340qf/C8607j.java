package p340qf;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import nf.C7771b;

/* JADX INFO: renamed from: qf.j */
/* JADX INFO: loaded from: classes.dex */
public final class C8607j extends AbstractC8612o {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p340qf.AbstractC8609l
    /* JADX INFO: renamed from: b */
    public final boolean[] mo9302b(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + AbstractC8611n.m16828e(str);
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
        boolean[] zArr = new boolean[67];
        int iM16825a = AbstractC8609l.m16825a(zArr, 0, AbstractC8611n.f46095a, true) + 0;
        for (int i10 = 0; i10 <= 3; i10++) {
            iM16825a += AbstractC8609l.m16825a(zArr, iM16825a, AbstractC8611n.f46098d[Character.digit(str.charAt(i10), 10)], false);
        }
        int iM16825a2 = AbstractC8609l.m16825a(zArr, iM16825a, AbstractC8611n.f46096b, false) + iM16825a;
        for (int i11 = 4; i11 <= 7; i11++) {
            iM16825a2 += AbstractC8609l.m16825a(zArr, iM16825a2, AbstractC8611n.f46098d[Character.digit(str.charAt(i11), 10)], true);
        }
        AbstractC8609l.m16825a(zArr, iM16825a2, AbstractC8611n.f46095a, true);
        return zArr;
    }

    @Override // p340qf.AbstractC8609l, p242lf.InterfaceC7358c
    /* JADX INFO: renamed from: j0 */
    public final C7771b mo9303j0(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.mo9303j0(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
