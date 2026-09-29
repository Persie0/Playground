package p340qf;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import nf.C7771b;
import p242lf.InterfaceC7358c;

/* JADX INFO: renamed from: qf.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8609l implements InterfaceC7358c {
    /* JADX INFO: renamed from: a */
    public static int m16825a(boolean[] zArr, int i10, int[] iArr, boolean z10) {
        int i11 = 0;
        for (int i12 : iArr) {
            int i13 = 0;
            while (i13 < i12) {
                zArr[i10] = z10;
                i13++;
                i10++;
            }
            i11 += i12;
            z10 = !z10;
        }
        return i11;
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean[] mo9302b(String str);

    /* JADX INFO: renamed from: c */
    public int mo16826c() {
        return 10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p242lf.InterfaceC7358c
    /* JADX INFO: renamed from: j0 */
    public C7771b mo9303j0(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        int iMo16826c = mo16826c();
        EncodeHintType encodeHintType = EncodeHintType.MARGIN;
        if (enumMap.containsKey(encodeHintType)) {
            iMo16826c = Integer.parseInt(enumMap.get(encodeHintType).toString());
        }
        boolean[] zArrMo9302b = mo9302b(str);
        int length = zArrMo9302b.length;
        int i10 = iMo16826c + length;
        int iMax = Math.max(200, i10);
        int iMax2 = Math.max(1, 200);
        int i11 = iMax / i10;
        int i12 = (iMax - (length * i11)) / 2;
        C7771b c7771b = new C7771b(iMax, iMax2);
        int i13 = 0;
        while (i13 < length) {
            if (zArrMo9302b[i13]) {
                c7771b.m15478d(i12, 0, i11, iMax2);
            }
            i13++;
            i12 += i11;
        }
        return c7771b;
    }
}
