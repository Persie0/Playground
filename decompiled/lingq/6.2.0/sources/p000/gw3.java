package p000;

import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public abstract class gw3 {

    /* JADX INFO: renamed from: a */
    public static final ByteString f41422a;

    /* JADX INFO: renamed from: b */
    public static final String[] f41423b;

    /* JADX INFO: renamed from: c */
    public static final String[] f41424c;

    /* JADX INFO: renamed from: d */
    public static final String[] f41425d;

    static {
        ByteString byteString = ByteString.f54513d;
        f41422a = iy5.m14193h("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f41423b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f41424c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            binaryString.getClass();
            String strReplace = kcb.m15113d("%8s", binaryString).replace(' ', '0');
            strReplace.getClass();
            strArr[i] = strReplace;
        }
        f41425d = strArr;
        String[] strArr2 = f41424c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = AbstractC3393o1.m17738m(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = f41424c;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = AbstractC3393o1.m17738m(sb, strArr3[i4], "|PADDED");
        }
        int length = f41424c.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = f41424c;
            if (strArr4[i7] == null) {
                strArr4[i7] = f41425d[i7];
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m12930a(int i) {
        String[] strArr = f41423b;
        return i < strArr.length ? strArr[i] : kcb.m15113d("0x%02x", Integer.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0055  */
    /* JADX INFO: renamed from: b */
    public static String m12931b(boolean z, int i, int i2, int i3, int i4) {
        String strM4839V;
        String str;
        String strM12930a = m12930a(i3);
        if (i4 == 0) {
            strM4839V = "";
        } else {
            String[] strArr = f41425d;
            if (i3 == 2 || i3 == 3) {
                strM4839V = strArr[i4];
            } else if (i3 == 4 || i3 == 6) {
                strM4839V = i4 == 1 ? "ACK" : strArr[i4];
            } else if (i3 == 7 || i3 == 8) {
                strM4839V = strArr[i4];
            } else {
                String[] strArr2 = f41424c;
                if (i4 < strArr2.length) {
                    str = strArr2[i4];
                    str.getClass();
                } else {
                    str = strArr[i4];
                }
                if (i3 != 5 || (i4 & 4) == 0) {
                    strM4839V = (i3 != 0 || (i4 & 32) == 0) ? str : cl9.m4839V(str, "PRIORITY", "COMPRESSED");
                } else {
                    strM4839V = cl9.m4839V(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return kcb.m15113d("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strM12930a, strM4839V);
    }

    /* JADX INFO: renamed from: c */
    public static String m12932c(int i, int i2, long j, boolean z) {
        return kcb.m15113d("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), m12930a(8), Long.valueOf(j));
    }
}
