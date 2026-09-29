package p258m6;

import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: m6.j */
/* JADX INFO: loaded from: classes.dex */
public final class C7490j extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public int f41379a;

    public C7490j(C7484d c7484d) {
        super(c7484d);
        this.f41379a = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: a */
    public final long m14878a(long j10) {
        int i10 = this.f41379a;
        if (i10 == 0) {
            return -1L;
        }
        if (i10 != Integer.MIN_VALUE && j10 > i10) {
            j10 = i10;
        }
        return j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int i10 = this.f41379a;
        return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
    }

    /* JADX INFO: renamed from: b */
    public final void m14879b(long j10) {
        int i10 = this.f41379a;
        if (i10 != Integer.MIN_VALUE && j10 != -1) {
            this.f41379a = (int) (((long) i10) - j10);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        super.mark(i10);
        this.f41379a = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (m14878a(1L) == -1) {
            return -1;
        }
        int i10 = super.read();
        m14879b(1L);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int iM14878a = (int) m14878a(i11);
        if (iM14878a == -1) {
            return -1;
        }
        int i12 = super.read(bArr, i10, iM14878a);
        m14879b(i12);
        return i12;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        super.reset();
        this.f41379a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long jM14878a = m14878a(j10);
        if (jM14878a == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM14878a);
        m14879b(jSkip);
        return jSkip;
    }
}
