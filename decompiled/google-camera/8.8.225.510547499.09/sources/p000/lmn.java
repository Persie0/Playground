package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lmn {

    /* JADX INFO: renamed from: a */
    public static volatile mrm f38695a = null;

    /* JADX INFO: renamed from: a */
    public static boolean m15733a(ByteBuffer byteBuffer, int i) {
        while (byteBuffer.hasRemaining()) {
            if (i <= 0) {
                return true;
            }
            if (byteBuffer.get() == 32) {
                i--;
            }
        }
        return i == 0;
    }
}
