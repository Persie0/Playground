package p258m6;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: m6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7484d extends InputStream {

    /* JADX INFO: renamed from: c */
    public static final ArrayDeque f41365c;

    /* JADX INFO: renamed from: a */
    public InputStream f41366a;

    /* JADX INFO: renamed from: b */
    public IOException f41367b;

    static {
        char[] cArr = C7492l.f41383a;
        f41365c = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.f41366a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f41366a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.f41366a.mark(i10);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f41366a.markSupported();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f41366a.read();
        } catch (IOException e10) {
            this.f41367b = e10;
            throw e10;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f41366a.read(bArr);
        } catch (IOException e10) {
            this.f41367b = e10;
            throw e10;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f41366a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f41367b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.f41366a.reset();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        try {
            return this.f41366a.skip(j10);
        } catch (IOException e10) {
            this.f41367b = e10;
            throw e10;
        }
    }
}
