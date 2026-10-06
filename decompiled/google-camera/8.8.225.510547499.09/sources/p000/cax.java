package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p021j$.p024io.DesugarInputStream;
import p021j$.p024io.InputStreamRetargetInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cax extends FilterInputStream implements InputStreamRetargetInterface {

    /* JADX INFO: renamed from: a */
    private final long f4935a;

    /* JADX INFO: renamed from: b */
    private int f4936b;

    public cax(InputStream inputStream, long j) {
        super(inputStream);
        this.f4935a = j;
    }

    /* JADX INFO: renamed from: a */
    private final void m3369a(int i) throws IOException {
        if (i >= 0) {
            this.f4936b += i;
            return;
        }
        long j = this.f4935a;
        int i2 = this.f4936b;
        if (j - ((long) i2) <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j + ", but read: " + i2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f4935a - ((long) this.f4936b), this.in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        m3369a(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.InputStream, p021j$.p024io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        i3 = super.read(bArr, i, i2);
        m3369a(i3);
        return i3;
    }
}
