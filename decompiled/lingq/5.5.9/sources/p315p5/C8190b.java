package p315p5;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: p5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8190b implements Closeable {

    /* JADX INFO: renamed from: a */
    public final InputStream f44359a;

    /* JADX INFO: renamed from: b */
    public final Charset f44360b;

    /* JADX INFO: renamed from: c */
    public byte[] f44361c;

    /* JADX INFO: renamed from: d */
    public int f44362d;

    /* JADX INFO: renamed from: e */
    public int f44363e;

    /* JADX INFO: renamed from: p5.b$a */
    public class a extends ByteArrayOutputStream {
        public a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public final String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, C8190b.this.f44360b.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public C8190b(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(C8191c.f44365a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f44359a = fileInputStream;
        this.f44360b = charset;
        this.f44361c = new byte[8192];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: a */
    public final String m16313a() throws IOException {
        int i10;
        synchronized (this.f44359a) {
            byte[] bArr = this.f44361c;
            if (bArr == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f44362d >= this.f44363e) {
                int i11 = this.f44359a.read(bArr, 0, bArr.length);
                if (i11 == -1) {
                    throw new EOFException();
                }
                this.f44362d = 0;
                this.f44363e = i11;
            }
            for (int i12 = this.f44362d; i12 != this.f44363e; i12++) {
                byte[] bArr2 = this.f44361c;
                if (bArr2[i12] == 10) {
                    int i13 = this.f44362d;
                    if (i12 != i13) {
                        i10 = i12 - 1;
                        if (bArr2[i10] != 13) {
                            i10 = i12;
                        }
                    } else {
                        i10 = i12;
                    }
                    String str = new String(bArr2, i13, i10 - i13, this.f44360b.name());
                    this.f44362d = i12 + 1;
                    return str;
                }
            }
            a aVar = new a((this.f44363e - this.f44362d) + 80);
            while (true) {
                byte[] bArr3 = this.f44361c;
                int i14 = this.f44362d;
                aVar.write(bArr3, i14, this.f44363e - i14);
                this.f44363e = -1;
                byte[] bArr4 = this.f44361c;
                int i15 = this.f44359a.read(bArr4, 0, bArr4.length);
                if (i15 == -1) {
                    throw new EOFException();
                }
                this.f44362d = 0;
                this.f44363e = i15;
                for (int i16 = 0; i16 != this.f44363e; i16++) {
                    byte[] bArr5 = this.f44361c;
                    if (bArr5[i16] == 10) {
                        int i17 = this.f44362d;
                        if (i16 != i17) {
                            aVar.write(bArr5, i17, i16 - i17);
                        }
                        this.f44362d = i16 + 1;
                        return aVar.toString();
                    }
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.f44359a) {
            if (this.f44361c != null) {
                this.f44361c = null;
                this.f44359a.close();
            }
        }
    }
}
