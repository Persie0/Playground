package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class iv2 extends ev2 {
    public iv2(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f37928a.mark(Integer.MAX_VALUE);
        } else {
            C3386nv.m17626m("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14156b(long j) throws IOException {
        int i = this.f37929b;
        if (i > j) {
            this.f37929b = 0;
            this.f37928a.reset();
        } else {
            j -= (long) i;
        }
        m11361a((int) j);
    }

    public iv2(byte[] bArr) {
        super(bArr);
        this.f37928a.mark(Integer.MAX_VALUE);
    }
}
