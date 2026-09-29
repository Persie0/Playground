package p338qd;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: qd.x */
/* JADX INFO: loaded from: classes.dex */
public final class C8590x extends InputStream {

    /* JADX INFO: renamed from: a */
    public final InputStream f46037a;

    /* JADX INFO: renamed from: b */
    public long f46038b;

    public C8590x(FileInputStream fileInputStream, long j10) {
        this.f46037a = fileInputStream;
        this.f46038b = j10;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f46037a.close();
        this.f46038b = 0L;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        long j10 = this.f46038b;
        if (j10 <= 0) {
            return -1;
        }
        this.f46038b = j10 - 1;
        return this.f46037a.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f46038b;
        if (j10 <= 0) {
            return -1;
        }
        int i12 = this.f46037a.read(bArr, i10, (int) Math.min(i11, j10));
        if (i12 != -1) {
            this.f46038b -= (long) i12;
        }
        return i12;
    }
}
