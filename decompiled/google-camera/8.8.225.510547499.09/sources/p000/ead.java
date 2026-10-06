package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ead {

    /* JADX INFO: renamed from: a */
    public final lby f13038a;

    /* JADX INFO: renamed from: b */
    public final int f13039b;

    /* JADX INFO: renamed from: c */
    public final float[] f13040c;

    /* JADX INFO: renamed from: d */
    public final float[] f13041d;

    /* JADX INFO: renamed from: e */
    private final short[] f13042e;

    public ead(lby lbyVar, int i) {
        lku.m15613H(i > 0);
        this.f13038a = lbyVar;
        this.f13039b = i;
        short[] sArr = new short[i * 6];
        for (int i2 = 0; i2 < i + i; i2++) {
            for (int i3 = 0; i3 < 3; i3++) {
                sArr[(i2 * 3) + i3] = (short) (i2 + i3);
            }
        }
        this.f13042e = sArr;
        int i4 = i + 1;
        this.f13041d = m6993c(-1.0f, 1.0f, -1.0f, i4, 4);
        this.f13040c = m6993c(0.0f, 0.0f, 1.0f, i4, 2);
    }

    /* JADX INFO: renamed from: c */
    private static float[] m6993c(float f, float f2, float f3, int i, int i2) {
        float[] fArr = new float[(i + i) * i2];
        float f4 = f2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            float f5 = f;
            int i5 = 0;
            while (true) {
                if (i5 < 2) {
                    fArr[i3] = f5;
                    fArr[i3 + 1] = f4;
                    f5 += 1.0f - f;
                    if (i2 > 2) {
                        for (int i6 = 2; i6 < i2 - 1; i6 = 3) {
                            fArr[i3 + 2] = 0.0f;
                        }
                        fArr[(i3 + i2) - 1] = 1.0f;
                    }
                    i3 += i2;
                    i5++;
                }
            }
            f4 += (f3 - f2) / (i - 1);
        }
        return fArr;
    }

    /* JADX INFO: renamed from: a */
    public final ldf m6994a() {
        lby lbyVar = this.f13038a;
        short[] sArr = this.f13042e;
        int length = sArr.length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(length + length).order(ByteOrder.nativeOrder());
        byteBufferOrder.asShortBuffer().put(sArr);
        return new ldf(lbs.m15151b(lbyVar, 34963, byteBufferOrder), length);
    }

    /* JADX INFO: renamed from: b */
    public final lec m6995b(List list) {
        lku.m15613H(list.size() == this.f13039b);
        float[] fArr = this.f13041d;
        float[] fArr2 = new float[fArr.length];
        int size = list.size();
        int i = 0;
        while (i <= size) {
            lbp lbpVar = i > 0 ? (lbp) list.get(i - 1) : (lbp) list.get(0);
            int i2 = i * 8;
            for (int i3 = 0; i3 < 2; i3++) {
                int i4 = (i3 * 4) + i2;
                float f = fArr[i4];
                float[] fArr3 = lbpVar.f37887c;
                int i5 = i4 + 1;
                int i6 = i4 + 3;
                fArr2[i4] = (f * fArr3[0]) + (fArr[i5] * fArr3[1]) + (fArr[i6] * fArr3[2]);
                fArr2[i5] = (fArr[i4] * fArr3[3]) + (fArr[i5] * fArr3[4]) + (fArr[i6] * fArr3[5]);
                fArr2[i4 + 2] = 0.0f;
                fArr2[i6] = (fArr[i4] * fArr3[6]) + (fArr[i5] * fArr3[7]) + (fArr[i6] * fArr3[8]);
            }
            i++;
        }
        return lec.m15239e(this.f13038a, led.m15244b(fArr2), led.m15243a(this.f13040c));
    }
}
