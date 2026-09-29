package p000;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class sk0 extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        bna.m3983x(i, i2 + i, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
    }
}
