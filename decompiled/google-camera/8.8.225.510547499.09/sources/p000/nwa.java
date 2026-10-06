package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p021j$.p024io.DesugarInputStream;
import p021j$.p024io.InputStreamRetargetInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nwa extends FilterInputStream implements InputStreamRetargetInterface {

    /* JADX INFO: renamed from: a */
    private int f44819a;

    public nwa(InputStream inputStream, int i) {
        super(inputStream);
        this.f44819a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f44819a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f44819a <= 0) {
            return -1;
        }
        int i = super.read();
        if (i >= 0) {
            this.f44819a--;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        int iSkip = (int) super.skip(Math.min(j, this.f44819a));
        if (iSkip >= 0) {
            this.f44819a -= iSkip;
        }
        return iSkip;
    }

    @Override // java.io.InputStream, p021j$.p024io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f44819a;
        if (i3 <= 0) {
            return -1;
        }
        int i4 = super.read(bArr, i, Math.min(i2, i3));
        if (i4 >= 0) {
            this.f44819a -= i4;
        }
        return i4;
    }
}
