package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import p255m3.C7476b;

/* JADX INFO: renamed from: androidx.emoji2.text.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0900n {

    /* JADX INFO: renamed from: androidx.emoji2.text.n$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f6035a;

        public a(ByteBuffer byteBuffer) {
            this.f6035a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* JADX INFO: renamed from: a */
        public final long m3542a() throws IOException {
            return ((long) this.f6035a.getInt()) & 4294967295L;
        }

        /* JADX INFO: renamed from: b */
        public final void m3543b(int i10) throws IOException {
            ByteBuffer byteBuffer = this.f6035a;
            byteBuffer.position(byteBuffer.position() + i10);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static C7476b m3541a(MappedByteBuffer mappedByteBuffer) throws IOException {
        ByteBuffer byteBuffer;
        long jM3542a;
        int i10;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        a aVar = new a(byteBufferDuplicate);
        aVar.m3543b(4);
        int i11 = byteBufferDuplicate.getShort() & 65535;
        if (i11 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        aVar.m3543b(6);
        int i12 = 0;
        while (true) {
            byteBuffer = aVar.f6035a;
            if (i12 >= i11) {
                jM3542a = -1;
                break;
            }
            int i13 = byteBuffer.getInt();
            aVar.m3543b(4);
            jM3542a = aVar.m3542a();
            aVar.m3543b(4);
            if (1835365473 == i13) {
                break;
            }
            i12++;
        }
        if (jM3542a != -1) {
            aVar.m3543b((int) (jM3542a - ((long) byteBufferDuplicate.position())));
            aVar.m3543b(12);
            long jM3542a2 = aVar.m3542a();
            for (0; i10 < jM3542a2; i10 + 1) {
                int i14 = byteBuffer.getInt();
                long jM3542a3 = aVar.m3542a();
                aVar.m3542a();
                i10 = (1164798569 == i14 || 1701669481 == i14) ? 0 : i10 + 1;
                byteBufferDuplicate.position((int) (jM3542a3 + jM3542a));
                C7476b c7476b = new C7476b();
                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                c7476b.m14860b(byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position()), byteBufferDuplicate);
                return c7476b;
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
