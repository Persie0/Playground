package p000;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class fx4 extends OutputStream {

    /* JADX INFO: renamed from: a */
    public long f39851a;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            v63.m23128b();
        } else {
            this.f39851a += (long) i2;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f39851a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f39851a++;
    }
}
