package p000;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfi extends OutputStream {

    /* JADX INFO: renamed from: a */
    public int f3090a = 0;

    /* JADX INFO: renamed from: b */
    private final OutputStream f3091b;

    public bfi(OutputStream outputStream) {
        this.f3091b = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f3091b.write(i);
        this.f3090a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f3091b.write(bArr);
        this.f3090a += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f3091b.write(bArr, i, i2);
        this.f3090a += i2;
    }
}
