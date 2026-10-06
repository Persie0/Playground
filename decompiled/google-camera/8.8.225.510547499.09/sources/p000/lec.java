package p000;

import androidx.wear.widget.iZcI.hiCTUJiAxf;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lec implements kyx {

    /* JADX INFO: renamed from: a */
    public final lbs f38019a;

    /* JADX INFO: renamed from: b */
    public final lay[] f38020b;

    /* JADX INFO: renamed from: c */
    public final int f38021c;

    /* JADX INFO: renamed from: d */
    private final int[] f38022d;

    public lec(lbs lbsVar, lay[] layVarArr, int[] iArr, int i) {
        lku.m15669w(layVarArr.length == iArr.length);
        this.f38019a = lbsVar;
        this.f38020b = layVarArr;
        this.f38022d = iArr;
        this.f38021c = i;
    }

    /* JADX INFO: renamed from: e */
    public static lec m15239e(lby lbyVar, led... ledVarArr) {
        int i = ledVarArr[0].f38023a;
        lay[] layVarArr = new lay[2];
        int[] iArr = new int[2];
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            led ledVar = ledVarArr[i3];
            lay layVar = ledVar.f38024b;
            int i4 = ledVar.f38025c;
            i2 += i4 * 32 * i;
            layVarArr[i3] = layVar;
            iArr[i3] = i4;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i2 / 8).order(ByteOrder.nativeOrder());
        for (int i5 = 0; i5 < 2; i5++) {
            led ledVar2 = ledVarArr[i5];
            for (int i6 = 0; i6 < i; i6++) {
                ledVar2.m15246c(i6, byteBufferOrder);
            }
        }
        byteBufferOrder.rewind();
        return new lec(lbs.m15151b(lbyVar, 34962, byteBufferOrder), layVarArr, iArr, i);
    }

    @Override // p000.kyx
    /* JADX INFO: renamed from: a */
    public final laa mo15079a() {
        return this.f38019a.mo15079a();
    }

    /* JADX INFO: renamed from: b */
    public final int m15240b(int i) {
        return (m15242d(i).mo15133a() * m15241c(i)) / 8;
    }

    /* JADX INFO: renamed from: c */
    public final int m15241c(int i) {
        return this.f38022d[i];
    }

    @Override // p000.kyx, p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f38019a.close();
    }

    /* JADX INFO: renamed from: d */
    public final lay m15242d(int i) {
        return this.f38020b[i];
    }

    public final String toString() {
        return "GLVertexArray{buffer=" + this.f38019a.toString() + ", types=" + Arrays.toString(this.f38020b) + ", dimensions=" + Arrays.toString(this.f38022d) + yTyWiTtGtnBhy.PKmD + this.f38021c + hiCTUJiAxf.ZXXzrxnkIKWFuY;
    }
}
