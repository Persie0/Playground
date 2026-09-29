package p542zo;

import dm.C5207g;
import mo.C7661i;
import okio.ByteString;
import to.C9347b;

/* JADX INFO: renamed from: zo.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C10561c {

    /* JADX INFO: renamed from: a */
    public static final C10561c f52657a = new C10561c();

    /* JADX INFO: renamed from: b */
    public static final ByteString f52658b;

    /* JADX INFO: renamed from: c */
    public static final String[] f52659c;

    /* JADX INFO: renamed from: d */
    public static final String[] f52660d;

    /* JADX INFO: renamed from: e */
    public static final String[] f52661e;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        ByteString byteString = ByteString.f43897d;
        f52658b = ByteString.C8082a.m16001c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f52659c = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f52660d = new String[64];
        String[] strArr = new String[256];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            String binaryString = Integer.toBinaryString(i11);
            C5207g.m11110e(binaryString, "toBinaryString(it)");
            strArr[i11] = C7661i.m15253S2(C9347b.m17702i("%8s", binaryString), ' ', '0');
        }
        f52661e = strArr;
        String[] strArr2 = f52660d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        strArr2[9] = C5207g.m11116k("|PADDED", "END_STREAM");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i12 = 0;
        while (i12 < 3) {
            int i13 = iArr2[i12];
            i12++;
            int i14 = iArr[0];
            String[] strArr3 = f52660d;
            int i15 = i14 | i13;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) strArr3[i14]);
            sb2.append('|');
            sb2.append((Object) strArr3[i13]);
            strArr3[i15] = sb2.toString();
            strArr3[i15 | 8] = ((Object) strArr3[i14]) + '|' + ((Object) strArr3[i13]) + "|PADDED";
        }
        int length = f52660d.length;
        while (i10 < length) {
            int i16 = i10 + 1;
            String[] strArr4 = f52660d;
            if (strArr4[i10] == null) {
                strArr4[i10] = f52661e[i10];
            }
            i10 = i16;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX INFO: renamed from: a */
    public static String m19539a(boolean z10, int i10, int i11, int i12, int i13) {
        String strM15254T2;
        String str;
        String[] strArr = f52659c;
        String strM17702i = i12 < strArr.length ? strArr[i12] : C9347b.m17702i("0x%02x", Integer.valueOf(i12));
        if (i13 == 0) {
            strM15254T2 = "";
        } else {
            String[] strArr2 = f52661e;
            if (i12 == 2 || i12 == 3) {
                strM15254T2 = strArr2[i13];
            } else if (i12 == 4 || i12 == 6) {
                strM15254T2 = i13 == 1 ? "ACK" : strArr2[i13];
            } else if (i12 == 7 || i12 == 8) {
                strM15254T2 = strArr2[i13];
            } else {
                String[] strArr3 = f52660d;
                if (i13 < strArr3.length) {
                    str = strArr3[i13];
                    C5207g.m11108c(str);
                } else {
                    str = strArr2[i13];
                }
                if (i12 != 5 || (i13 & 4) == 0) {
                    strM15254T2 = (i12 != 0 || (i13 & 32) == 0) ? str : C7661i.m15254T2(str, "PRIORITY", "COMPRESSED");
                } else {
                    strM15254T2 = C7661i.m15254T2(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return C9347b.m17702i("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), strM17702i, strM15254T2);
    }
}
