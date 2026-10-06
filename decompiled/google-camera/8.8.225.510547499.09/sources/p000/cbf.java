package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p021j$.p024io.DesugarInputStream;
import p021j$.p024io.InputStreamRetargetInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cbf extends FilterInputStream implements InputStreamRetargetInterface {

    /* JADX INFO: renamed from: a */
    private int f4950a;

    public cbf(InputStream inputStream) {
        super(inputStream);
        this.f4950a = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: a */
    private final long m3377a(long j) {
        int i = this.f4950a;
        if (i == 0) {
            return -1L;
        }
        if (i != Integer.MIN_VALUE) {
            long j2 = i;
            if (j > j2) {
                return j2;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: b */
    private final void m3378b(long j) {
        int i = this.f4950a;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f4950a = (int) (((long) i) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.f4950a;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.f4950a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (m3377a(1L) == -1) {
            return -1;
        }
        int i = super.read();
        m3378b(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f4950a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jM3377a = m3377a(j);
        if (jM3377a == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM3377a);
        m3378b(jSkip);
        return jSkip;
    }

    @Override // java.io.InputStream, p021j$.p024io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iM3377a = (int) m3377a(i2);
        if (iM3377a == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iM3377a);
        m3378b(i3);
        return i3;
    }
}
