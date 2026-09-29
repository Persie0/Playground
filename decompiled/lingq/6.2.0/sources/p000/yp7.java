package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public final class yp7 extends InputStream {

    /* JADX INFO: renamed from: a */
    public int f70259a;

    /* JADX INFO: renamed from: b */
    public int f70260b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq7 f70261c;

    public yp7(aq7 aq7Var, xp7 xp7Var) {
        this.f70261c = aq7Var;
        this.f70259a = aq7Var.m2991z(xp7Var.f68498b + 4);
        this.f70260b = xp7Var.f68499c;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            C3386nv.m17635v("buffer");
            return 0;
        }
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.f70260b;
        if (i3 <= 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int i4 = this.f70259a;
        aq7 aq7Var = this.f70261c;
        aq7Var.m2988r(i4, bArr, i, i2);
        this.f70259a = aq7Var.m2991z(this.f70259a + i2);
        this.f70260b -= i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        aq7 aq7Var = this.f70261c;
        RandomAccessFile randomAccessFile = aq7Var.f7362a;
        if (this.f70260b == 0) {
            return -1;
        }
        randomAccessFile.seek(this.f70259a);
        int i = randomAccessFile.read();
        this.f70259a = aq7Var.m2991z(this.f70259a + 1);
        this.f70260b--;
        return i;
    }
}
