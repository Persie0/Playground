package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class led {

    /* JADX INFO: renamed from: a */
    public final int f38023a;

    /* JADX INFO: renamed from: b */
    public final lay f38024b;

    /* JADX INFO: renamed from: c */
    public final int f38025c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f38026d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ float[] f38027e;

    public led(int i, lay layVar, int i2, int i3, float[] fArr) {
        this.f38026d = i3;
        this.f38027e = fArr;
        this.f38023a = i;
        this.f38024b = layVar;
        this.f38025c = i2;
    }

    /* JADX INFO: renamed from: a */
    public static led m15243a(float... fArr) {
        return m15245d(fArr, 2);
    }

    /* JADX INFO: renamed from: b */
    public static led m15244b(float... fArr) {
        return m15245d(fArr, 4);
    }

    /* JADX INFO: renamed from: d */
    private static led m15245d(float[] fArr, int i) {
        int length = fArr.length;
        lku.m15669w(length % i == 0);
        return new led(length / i, lbk.f37875h, i, i, fArr);
    }

    /* JADX INFO: renamed from: c */
    public final void m15246c(int i, ByteBuffer byteBuffer) {
        int i2 = 0;
        while (true) {
            int i3 = this.f38026d;
            if (i2 >= i3) {
                return;
            }
            byteBuffer.putFloat(this.f38027e[(i3 * i) + i2]);
            i2++;
        }
    }

    public final String toString() {
        return "GLVertexData{vertexCount=" + this.f38023a + ", type=" + this.f38026d + "D float32}";
    }
}
