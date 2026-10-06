package p000;

import android.graphics.Insets;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class acq {
    /* JADX INFO: renamed from: a */
    static Insets m215a(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    public static ByteBuffer m216b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.limit());
        int i = 0;
        for (int i2 = 0; i2 < byteBuffer.limit(); i2++) {
            if (byteBuffer.get(i2) != 3 || i < 2) {
                byteBufferAllocate.put(byteBuffer.get(i2));
            }
            i = byteBuffer.get(i2) == 0 ? i + 1 : 0;
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: c */
    public static List m217c(ByteBuffer byteBuffer) {
        if (byteBuffer.limit() == 0) {
            return mkv.m16498F();
        }
        ArrayList arrayList = new ArrayList();
        lku.m15669w(byteBuffer.getInt(0) == 1);
        int i = 4;
        int i2 = 0;
        for (int i3 = 4; i3 < byteBuffer.limit(); i3++) {
            if (byteBuffer.get(i3) == 1 && i2 >= 3) {
                arrayList.add(m218d(byteBuffer, i, (i3 - 3) - i));
                i = i3 + 1;
            }
            if (i3 == byteBuffer.limit() - 1) {
                arrayList.add(m218d(byteBuffer, i, byteBuffer.limit() - i));
            }
            i2 = byteBuffer.get(i3) == 0 ? i2 + 1 : 0;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    private static ByteBuffer m218d(ByteBuffer byteBuffer, int i, int i2) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.limit(i + i2);
        return byteBufferDuplicate.slice();
    }
}
