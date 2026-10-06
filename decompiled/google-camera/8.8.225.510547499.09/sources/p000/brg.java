package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p021j$.p024io.DesugarInputStream;
import p021j$.p024io.InputStreamRetargetInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class brg extends FilterInputStream implements InputStreamRetargetInterface {

    /* JADX INFO: renamed from: a */
    private static final byte[] f4217a = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: b */
    private static final int f4218b = 31;

    /* JADX INFO: renamed from: c */
    private final byte f4219c;

    /* JADX INFO: renamed from: d */
    private int f4220d;

    public brg(InputStream inputStream, int i) {
        super(inputStream);
        if (i >= -1 && i <= 8) {
            this.f4219c = (byte) i;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f4220d;
        if (i3 < 2 || i3 > (i2 = f4218b)) {
            i = super.read();
        } else {
            i = i3 == i2 ? this.f4219c : f4217a[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f4220d++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.f4220d = (int) (((long) this.f4220d) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.InputStream, p021j$.p024io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f4220d;
        int i5 = f4218b;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f4219c;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(f4217a, this.f4220d - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.f4220d += i3;
        }
        return i3;
    }
}
