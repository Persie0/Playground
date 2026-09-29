package p000;

import com.lingq.core.domain.model.language.LanguageProgressChartEntry;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jx1 {

    /* JADX INFO: renamed from: a */
    public static final int[] f46335a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b */
    public static final int[] f46336b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c */
    public static final int[] f46337c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d */
    public static final int[] f46338d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e */
    public static final int[] f46339e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f */
    public static final int[] f46340f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: a */
    public static int m14735a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i = iPosition; i <= iLimit; i++) {
            String str = uma.f64080a;
            int iReverseBytes = byteBuffer.getInt(i + 4);
            if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                iReverseBytes = Integer.reverseBytes(iReverseBytes);
            }
            if ((iReverseBytes & (-2)) == -126718022) {
                return i - iPosition;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static int m14736b(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = f46336b[i];
        if (i4 == 44100) {
            return ((i2 % 2) + f46340f[i3]) * 2;
        }
        int i5 = f46339e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    /* JADX INFO: renamed from: c */
    public static int m14737c(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f46335a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    /* JADX INFO: renamed from: d */
    public static int m14738d(int i, ByteBuffer byteBuffer) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    /* JADX INFO: renamed from: e */
    public static final mc5 m14739e(long j, List list, boolean z) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                vz1.m23628e0();
                throw null;
            }
            LanguageProgressChartEntry languageProgressChartEntry = (LanguageProgressChartEntry) obj;
            arrayList.add(new lc5(languageProgressChartEntry.f19073c, i, (float) (z ? languageProgressChartEntry.f19075e : languageProgressChartEntry.f19074d)));
            i = i2;
        }
        return new mc5(j, arrayList);
    }
}
