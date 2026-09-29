package p258m6;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: m6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7483c extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public final long f41363a;

    /* JADX INFO: renamed from: b */
    public int f41364b;

    public C7483c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f41363a = j10;
    }

    /* JADX INFO: renamed from: a */
    public final void m14871a(int i10) throws IOException {
        if (i10 >= 0) {
            this.f41364b += i10;
            return;
        }
        long j10 = this.f41364b;
        long j11 = this.f41363a;
        if (j11 - j10 <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j11 + ", but read: " + this.f41364b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() throws IOException {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return (int) Math.max(this.f41363a - ((long) this.f41364b), ((FilterInputStream) this).in.available());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() throws IOException {
        int i10;
        i10 = super.read();
        m14871a(i10 >= 0 ? 1 : -1);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        try {
            i12 = super.read(bArr, i10, i11);
            m14871a(i12);
        } finally {
        }
        return i12;
    }
}
