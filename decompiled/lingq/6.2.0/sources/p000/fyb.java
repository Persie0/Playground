package p000;

import androidx.compose.runtime.internal.C0282a;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fyb implements p9b {

    /* JADX INFO: renamed from: a */
    public static final C0282a f39940a = new C0282a(1667103911, false, new sd1(18));

    static {
        new C0282a(-1749618377, false, new td1(27));
    }

    /* JADX INFO: renamed from: a */
    public static int m12249a(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean[] mo4913b(String str);

    /* JADX INFO: renamed from: c */
    public int mo4914c() {
        return 10;
    }

    @Override // p000.p9b
    /* JADX INFO: renamed from: f */
    public ad0 mo4915f(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        if (str.isEmpty()) {
            C3386nv.m17626m("Found empty contents");
            return null;
        }
        int iMo4914c = mo4914c();
        EncodeHintType encodeHintType = EncodeHintType.MARGIN;
        if (enumMap.containsKey(encodeHintType)) {
            iMo4914c = Integer.parseInt(enumMap.get(encodeHintType).toString());
        }
        boolean[] zArrMo4913b = mo4913b(str);
        int length = zArrMo4913b.length;
        int i = iMo4914c + length;
        int iMax = Math.max(200, i);
        int iMax2 = Math.max(1, 200);
        int i2 = iMax / i;
        int i3 = (iMax - (length * i2)) / 2;
        ad0 ad0Var = new ad0(iMax, iMax2);
        int i4 = 0;
        while (i4 < length) {
            if (zArrMo4913b[i4]) {
                ad0Var.m274c(i3, 0, i2, iMax2);
            }
            i4++;
            i3 += i2;
        }
        return ad0Var;
    }
}
