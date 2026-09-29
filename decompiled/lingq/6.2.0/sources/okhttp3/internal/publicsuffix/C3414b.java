package okhttp3.internal.publicsuffix;

import okio.ByteString;
import p000.icb;
import p000.yu0;

/* JADX INFO: renamed from: okhttp3.internal.publicsuffix.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3414b {
    /* JADX INFO: renamed from: a */
    public static final String m18068a(ByteString byteString, ByteString[] byteStringArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        ByteString byteString2 = C3415c.f54509b;
        int iMo18078d = byteString.mo18078d();
        int i5 = 0;
        while (i5 < iMo18078d) {
            int i6 = (i5 + iMo18078d) / 2;
            while (i6 > -1 && byteString.mo18082i(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (byteString.mo18082i(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte bMo18082i = byteStringArr[i10].mo18082i(i11);
                    byte[] bArr = icb.f43946a;
                    int i13 = bMo18082i & 255;
                    z = z2;
                    i3 = i13;
                }
                byte bMo18082i2 = byteString.mo18082i(i7 + i12);
                byte[] bArr2 = icb.f43946a;
                i4 = i3 - (bMo18082i2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (byteStringArr[i10].mo18078d() != i11) {
                    z2 = z;
                } else {
                    if (i10 == byteStringArr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int iMo18078d2 = byteStringArr[i10].mo18078d() - i11;
                    int length = byteStringArr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        iMo18078d2 += byteStringArr[i15].mo18078d();
                    }
                    if (iMo18078d2 >= i14) {
                        if (iMo18078d2 <= i14) {
                            return byteString.mo18087o(i7, i9 + i7).mo18086n(yu0.f70463a);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            iMo18078d = i6;
        }
        return null;
    }
}
