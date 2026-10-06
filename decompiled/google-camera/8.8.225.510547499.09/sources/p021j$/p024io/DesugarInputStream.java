package p021j$.p024io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class DesugarInputStream {
    public static long transferTo(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr, 0, 8192);
            if (i < 0) {
                return j;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }
}
