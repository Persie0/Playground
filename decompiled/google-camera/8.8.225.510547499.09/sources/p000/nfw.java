package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p021j$.p024io.DesugarInputStream;
import p021j$.p024io.InputStreamRetargetInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nfw extends FilterInputStream implements InputStreamRetargetInterface {

    /* JADX INFO: renamed from: a */
    private long f42203a;

    /* JADX INFO: renamed from: b */
    private long f42204b;

    public nfw(InputStream inputStream, long j) {
        super(inputStream);
        this.f42204b = -1L;
        inputStream.getClass();
        lku.m15670x(j >= 0, "limit must be non-negative");
        this.f42203a = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(this.in.available(), this.f42203a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.f42204b = this.f42203a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f42203a == 0) {
            return -1;
        }
        int i = this.in.read();
        if (i != -1) {
            this.f42203a--;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f42204b == -1) {
            throw new IOException("Mark not set");
        }
        this.in.reset();
        this.f42203a = this.f42204b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = this.in.skip(Math.min(j, this.f42203a));
        this.f42203a -= jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream, p021j$.p024io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f42203a;
        if (j == 0) {
            return -1;
        }
        int i3 = this.in.read(bArr, i, (int) Math.min(i2, j));
        if (i3 != -1) {
            this.f42203a -= (long) i3;
        }
        return i3;
    }
}
