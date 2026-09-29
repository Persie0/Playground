package p000;

import androidx.compose.runtime.internal.C0282a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jpb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f45981a = new C0282a(1925748367, false, new nd1(3));

    /* JADX INFO: renamed from: b */
    public static final C0282a f45982b = new C0282a(1167493615, false, new nd1(4));

    /* JADX INFO: renamed from: c */
    public static final C0282a f45983c = new C0282a(1619965588, false, new ld1(27));

    /* JADX INFO: renamed from: d */
    public static final C0282a f45984d = new C0282a(-1103766925, false, new ld1(28));

    /* JADX INFO: renamed from: e */
    public static final C0282a f45985e = new C0282a(-672990041, false, new ld1(29));

    /* JADX INFO: renamed from: a */
    public static ly5 m14583a(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            v63.m23133k("Cannot read metadata.");
            return null;
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    ly5 ly5Var = new ly5();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    ly5Var.f64232d = byteBufferDuplicate;
                    ly5Var.f64229a = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    ly5Var.f64230b = i6;
                    ly5Var.f64231c = ((ByteBuffer) ly5Var.f64232d).getShort(i6);
                    return ly5Var;
                }
            }
        }
        v63.m23133k("Cannot read metadata.");
        return null;
    }
}
