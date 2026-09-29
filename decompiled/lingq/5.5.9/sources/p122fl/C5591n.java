package p122fl;

import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: fl.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C5591n extends AbstractC5588k {

    /* JADX INFO: renamed from: a */
    public final RandomAccessFile f34400a;

    public C5591n(RandomAccessFile randomAccessFile) throws IOException {
        this.f34400a = randomAccessFile;
        randomAccessFile.seek(0L);
    }

    @Override // p122fl.AbstractC5588k
    /* JADX INFO: renamed from: a */
    public final void mo11840a(long j10) throws IOException {
        this.f34400a.seek(j10);
    }

    @Override // p122fl.AbstractC5588k
    /* JADX INFO: renamed from: b */
    public final void mo11841b(byte[] bArr, int i10) throws IOException {
        this.f34400a.write(bArr, 0, i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f34400a.close();
    }

    @Override // p122fl.AbstractC5588k
    public final void flush() {
    }
}
