package p000;

import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lft implements lfu {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f38162a;

    /* JADX INFO: renamed from: b */
    private final Object f38163b;

    public lft(lfu lfuVar, int i) {
        this.f38162a = i;
        this.f38163b = lfuVar;
    }

    public lft(lfu[] lfuVarArr, int i) {
        this.f38162a = i;
        this.f38163b = lfuVarArr;
    }

    /* JADX INFO: renamed from: b */
    private static int m15288b(int i, int i2, int i3) {
        return Math.max(Math.max(i, i2), i3);
    }

    /* JADX INFO: renamed from: c */
    private static int m15289c(int i, int i2, int i3) {
        return Math.min(Math.min(i, i2), i3);
    }

    /* JADX INFO: renamed from: d */
    private final void m15290d(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (mo4711a(byteBuffer, byteBuffer2)) {
            return;
        }
        throw new IllegalArgumentException("MemCopier does not support copying from buffer '" + String.valueOf(byteBuffer) + "' to '" + String.valueOf(byteBuffer2) + "'!");
    }

    /* JADX INFO: renamed from: e */
    private static void m15291e(int i, int i2) {
        int i3;
        if (i2 < 0) {
            i3 = -i2;
        } else {
            i3 = i2;
            i2 = 0;
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException("Attempting to copy from negative buffer index " + i2 + "!");
        }
        if (i >= i3) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Attempting to copy " + i3 + " bytes at offset 0 on " + i + "-byte buffer!");
    }

    /* JADX INFO: renamed from: f */
    private static void m15292f() {
        throw new IllegalArgumentException("No MemCopier found to copy between buffers.");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lfu] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, lfu] */
    @Override // p000.lfu
    /* JADX INFO: renamed from: a */
    public final boolean mo4711a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        switch (this.f38162a) {
            case 0:
                return this.f38163b.mo4711a(byteBuffer, byteBuffer2);
            case 1:
                Object obj = this.f38163b;
                for (int i = 0; i < 3; i++) {
                    if (((lfu[]) obj)[i].mo4711a(byteBuffer, byteBuffer2)) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f38163b.mo4711a(byteBuffer, byteBuffer2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, lfu] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, lfu] */
    @Override // p000.lfu
    public final void copyBytes(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3) {
        switch (this.f38162a) {
            case 0:
                m15290d(byteBuffer, byteBuffer2);
                int iCapacity = byteBuffer.capacity();
                int iCapacity2 = byteBuffer2.capacity();
                m15291e(iCapacity, i3);
                m15291e(iCapacity2, i3);
                this.f38163b.copyBytes(byteBuffer, byteBuffer2, 0, 0, i3);
                break;
            case 1:
                Object obj = this.f38163b;
                for (int i4 = 0; i4 < 3; i4++) {
                    lfu lfuVar = ((lfu[]) obj)[i4];
                    if (lfuVar.mo4711a(byteBuffer, byteBuffer2)) {
                        lfuVar.copyBytes(byteBuffer, byteBuffer2, 0, 0, i3);
                    }
                    break;
                }
                m15292f();
                break;
            default:
                this.f38163b.copyBytes(byteBuffer, byteBuffer2, 0, 0, i3);
                break;
        }
    }

    public final String toString() {
        int i = this.f38162a;
        String str = gBCSQzBeB.vObekQVQ;
        switch (i) {
            case 0:
                return "checked[" + this.f38163b.toString() + str;
            case 1:
                return getClass().getSimpleName() + yTyWiTtGtnBhy.JzcgndQS + lyz.m16212h(",").m16215d(Arrays.asList((Object[]) this.f38163b)) + str;
            default:
                return "greedy[" + this.f38163b.toString() + str;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, lfu] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, lfu] */
    @Override // p000.lfu
    public final void copyBytes2D(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5, int i6) {
        switch (this.f38162a) {
            case 0:
                m15290d(byteBuffer, byteBuffer2);
                int iCapacity = byteBuffer.capacity();
                int iCapacity2 = byteBuffer2.capacity();
                m15291e(iCapacity, i2 * i5);
                m15291e(iCapacity2, i2 * i6);
                this.f38163b.copyBytes2D(byteBuffer, byteBuffer2, i, i2, 0, 0, i5, i6);
                break;
            case 1:
                Object obj = this.f38163b;
                for (int i7 = 0; i7 < 3; i7++) {
                    lfu lfuVar = ((lfu[]) obj)[i7];
                    if (lfuVar.mo4711a(byteBuffer, byteBuffer2)) {
                        lfuVar.copyBytes2D(byteBuffer, byteBuffer2, i, i2, 0, 0, i5, i6);
                    }
                    break;
                }
                m15292f();
                break;
            default:
                if (i5 == i6 && i5 == i) {
                    copyBytes(byteBuffer, byteBuffer2, 0, 0, i5 * i2);
                }
                this.f38163b.copyBytes2D(byteBuffer, byteBuffer2, i, i2, 0, 0, i5, i6);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, lfu] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, lfu] */
    @Override // p000.lfu
    public final void copyBytes2D(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.f38162a) {
            case 0:
                m15290d(byteBuffer, byteBuffer2);
                int iCapacity = byteBuffer.capacity();
                int iCapacity2 = byteBuffer2.capacity();
                int i9 = i - 1;
                int i10 = i5 * i9;
                int i11 = i2 - 1;
                int i12 = i7 * i11;
                int i13 = i12 + i10;
                int iM15289c = m15289c(i10, i12, i13);
                int iM15288b = m15288b(i10, i12, i13);
                m15291e(iCapacity, iM15289c);
                m15291e(iCapacity, iM15288b);
                int i14 = i8 * i11;
                int i15 = i14 + i9;
                int iM15289c2 = m15289c(i9, i14, i15);
                int iM15288b2 = m15288b(i9, i14, i15);
                m15291e(iCapacity2, iM15289c2);
                m15291e(iCapacity2, iM15288b2);
                this.f38163b.copyBytes2D(byteBuffer, byteBuffer2, i, i2, 0, 0, i5, 1, i7, i8);
                break;
            case 1:
                Object obj = this.f38163b;
                for (int i16 = 0; i16 < 3; i16++) {
                    lfu lfuVar = ((lfu[]) obj)[i16];
                    if (lfuVar.mo4711a(byteBuffer, byteBuffer2)) {
                        lfuVar.copyBytes2D(byteBuffer, byteBuffer2, i, i2, 0, 0, i5, 1, i7, i8);
                    }
                    break;
                }
                m15292f();
                break;
            default:
                if (i5 == 1) {
                    copyBytes2D(byteBuffer, byteBuffer2, i, i2, 0, 0, i7, i8);
                } else {
                    this.f38163b.copyBytes2D(byteBuffer, byteBuffer2, i, i2, 0, 0, i5, 1, i7, i8);
                }
                break;
        }
    }
}
