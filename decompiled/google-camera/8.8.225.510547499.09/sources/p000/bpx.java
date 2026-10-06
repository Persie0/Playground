package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class bpx implements Closeable {

    /* JADX INFO: renamed from: a */
    public final Charset f4125a;

    /* JADX INFO: renamed from: b */
    public int f4126b;

    /* JADX INFO: renamed from: c */
    private final InputStream f4127c;

    /* JADX INFO: renamed from: d */
    private byte[] f4128d;

    /* JADX INFO: renamed from: e */
    private int f4129e;

    public bpx(InputStream inputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(bpy.f4130a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f4127c = inputStream;
        this.f4125a = charset;
        this.f4128d = new byte[8192];
    }

    /* JADX INFO: renamed from: b */
    private final void m2899b() throws IOException {
        InputStream inputStream = this.f4127c;
        byte[] bArr = this.f4128d;
        int length = bArr.length;
        int i = inputStream.read(bArr, 0, 8192);
        if (i == -1) {
            throw new EOFException();
        }
        this.f4129e = 0;
        this.f4126b = i;
    }

    /* JADX INFO: renamed from: a */
    public final String m2900a() {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f4127c) {
            if (this.f4128d == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f4129e >= this.f4126b) {
                m2899b();
            }
            for (int i3 = this.f4129e; i3 != this.f4126b; i3++) {
                byte[] bArr2 = this.f4128d;
                if (bArr2[i3] == 10) {
                    int i4 = this.f4129e;
                    if (i3 != i4) {
                        i2 = i3 - 1;
                        if (bArr2[i2] != 13) {
                            i2 = i3;
                        }
                    } else {
                        i2 = i3;
                    }
                    String str = new String(bArr2, i4, i2 - i4, this.f4125a.name());
                    this.f4129e = i3 + 1;
                    return str;
                }
            }
            bpw bpwVar = new bpw(this, (this.f4126b - this.f4129e) + 80);
            loop1: while (true) {
                byte[] bArr3 = this.f4128d;
                int i5 = this.f4129e;
                bpwVar.write(bArr3, i5, this.f4126b - i5);
                this.f4126b = -1;
                m2899b();
                i = this.f4129e;
                while (i != this.f4126b) {
                    bArr = this.f4128d;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.f4129e;
            if (i != i6) {
                bpwVar.write(bArr, i6, i - i6);
            }
            this.f4129e = i + 1;
            return bpwVar.toString();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f4127c) {
            if (this.f4128d != null) {
                this.f4128d = null;
                this.f4127c.close();
            }
        }
    }
}
