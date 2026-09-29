package p000;

import androidx.compose.runtime.internal.C0282a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class syb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f61635a = new C0282a(-1802378087, false, new ud1(1));

    /* JADX INFO: renamed from: b */
    public static final C0282a f61636b = new C0282a(-1392982023, false, new ud1(2));

    /* JADX INFO: renamed from: c */
    public static final C0282a f61637c = new C0282a(-1802172056, false, new sd1(22));

    /* JADX INFO: renamed from: d */
    public static final C0282a f61638d = new C0282a(-1576995364, false, new vd1(0));

    /* JADX INFO: renamed from: a */
    public static ArrayList m21776a(byte[] bArr) {
        long jM21778c = (((long) m21778c(bArr)) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(jM21778c).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static long m21777b(byte b, byte b2) {
        int i;
        int i2;
        int i3 = b & 255;
        int i4 = b & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = 10000 << (i5 & 1);
        } else {
            i2 = i6 == 3 ? 60000 : 10000 << i6;
        }
        return ((long) i) * ((long) i2);
    }

    /* JADX INFO: renamed from: c */
    public static int m21778c(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m21779d(long j, long j2) {
        return j - j2 <= 80000;
    }

    /* JADX INFO: renamed from: e */
    public static int m21780e(ByteBuffer byteBuffer) {
        int i;
        if ((byteBuffer.get(5) & 2) == 0) {
            i = 0;
        } else {
            byte b = byteBuffer.get(26);
            int i2 = 28;
            int i3 = 28;
            for (int i4 = 0; i4 < b; i4++) {
                i3 += byteBuffer.get(i4 + 27);
            }
            byte b2 = byteBuffer.get(i3 + 26);
            for (int i5 = 0; i5 < b2; i5++) {
                i2 += byteBuffer.get(i3 + 27 + i5);
            }
            i = i3 + i2;
        }
        int i6 = byteBuffer.get(i + 26) + 27 + i;
        return (int) ((m21777b(byteBuffer.get(i6), byteBuffer.limit() - i6 > 1 ? byteBuffer.get(i6 + 1) : (byte) 0) * 48000) / 1000000);
    }

    /* JADX INFO: renamed from: f */
    public static int m21781f(ByteBuffer byteBuffer) {
        return (int) ((m21777b(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }
}
