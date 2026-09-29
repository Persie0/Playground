package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class kv2 extends InputStream {

    /* JADX INFO: renamed from: a */
    public final InputStream f48458a;

    /* JADX INFO: renamed from: b */
    public int f48459b = 1073741824;

    public kv2(InputStream inputStream) {
        this.f48458a = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f48459b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f48458a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f48458a.read();
        if (i == -1) {
            this.f48459b = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.f48458a.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = this.f48458a.read(bArr);
        if (i == -1) {
            this.f48459b = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f48458a.read(bArr, i, i2);
        if (i3 == -1) {
            this.f48459b = 0;
        }
        return i3;
    }
}
