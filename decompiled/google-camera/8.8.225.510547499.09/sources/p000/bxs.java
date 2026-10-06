package p000;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bxs extends MediaDataSource {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ByteBuffer f4722a;

    public bxs(ByteBuffer byteBuffer) {
        this.f4722a = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f4722a.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (j >= this.f4722a.limit()) {
            return -1;
        }
        this.f4722a.position((int) j);
        int iMin = Math.min(i2, this.f4722a.remaining());
        this.f4722a.get(bArr, i, iMin);
        return iMin;
    }
}
