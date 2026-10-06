package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import p021j$.p024io.DesugarInputStream;
import p021j$.p024io.InputStreamRetargetInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cau extends InputStream implements InputStreamRetargetInterface {

    /* JADX INFO: renamed from: a */
    private final ByteBuffer f4930a;

    /* JADX INFO: renamed from: b */
    private int f4931b = -1;

    public cau(ByteBuffer byteBuffer) {
        this.f4930a = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f4930a.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.f4931b = this.f4930a.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f4930a.hasRemaining()) {
            return this.f4930a.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i = this.f4931b;
        if (i == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f4930a.position(i);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (!this.f4930a.hasRemaining()) {
            return -1L;
        }
        long jMin = Math.min(j, available());
        ByteBuffer byteBuffer = this.f4930a;
        byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
        return jMin;
    }

    @Override // java.io.InputStream, p021j$.p024io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (!this.f4930a.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i2, available());
        this.f4930a.get(bArr, i, iMin);
        return iMin;
    }
}
