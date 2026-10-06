package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p021j$.p024io.DesugarInputStream;
import p021j$.p024io.InputStreamRetargetInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxm extends FilterInputStream implements InputStreamRetargetInterface {

    /* JADX INFO: renamed from: a */
    private volatile byte[] f4704a;

    /* JADX INFO: renamed from: b */
    private int f4705b;

    /* JADX INFO: renamed from: c */
    private int f4706c;

    /* JADX INFO: renamed from: d */
    private int f4707d;

    /* JADX INFO: renamed from: e */
    private int f4708e;

    /* JADX INFO: renamed from: f */
    private final btg f4709f;

    public bxm(InputStream inputStream, btg btgVar) {
        super(inputStream);
        this.f4707d = -1;
        this.f4709f = btgVar;
        this.f4704a = (byte[]) btgVar.mo3034a(65536, byte[].class);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0038  */
    /* JADX INFO: renamed from: c */
    private final int m3163c(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f4707d;
        if (i != -1) {
            int i2 = this.f4708e - i;
            int i3 = this.f4706c;
            if (i2 < i3) {
                if (i == 0) {
                    int length = bArr.length;
                    if (i3 <= length || this.f4705b != length) {
                        i = 0;
                        if (i > 0) {
                            System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                        }
                    } else {
                        btg btgVar = this.f4709f;
                        int i4 = length + length;
                        if (i4 <= i3) {
                            i3 = i4;
                        }
                        byte[] bArr2 = (byte[]) btgVar.mo3034a(i3, byte[].class);
                        System.arraycopy(bArr, 0, bArr2, 0, length);
                        this.f4704a = bArr2;
                        this.f4709f.mo3036c(bArr);
                        bArr = bArr2;
                    }
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i5 = this.f4708e - this.f4707d;
                this.f4708e = i5;
                this.f4707d = 0;
                this.f4705b = 0;
                int i6 = inputStream.read(bArr, i5, bArr.length - i5);
                int i7 = this.f4708e;
                if (i6 > 0) {
                    i7 += i6;
                }
                this.f4705b = i7;
                return i6;
            }
        }
        int i8 = inputStream.read(bArr);
        if (i8 > 0) {
            this.f4707d = -1;
            this.f4708e = 0;
            this.f4705b = i8;
        }
        return i8;
    }

    /* JADX INFO: renamed from: d */
    private static IOException m3164d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m3165a() {
        this.f4706c = this.f4704a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f4704a == null || inputStream == null) {
            throw m3164d();
        }
        return (this.f4705b - this.f4708e) + inputStream.available();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m3166b() {
        if (this.f4704a != null) {
            this.f4709f.mo3036c(this.f4704a);
            this.f4704a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f4704a != null) {
            this.f4709f.mo3036c(this.f4704a);
            this.f4704a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f4706c = Math.max(this.f4706c, i);
        this.f4707d = this.f4708e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f4704a;
        InputStream inputStream = this.in;
        if (bArr == null || inputStream == null) {
            throw m3164d();
        }
        if (this.f4708e >= this.f4705b && m3163c(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f4704a && (bArr = this.f4704a) == null) {
            throw m3164d();
        }
        int i = this.f4705b;
        int i2 = this.f4708e;
        if (i - i2 <= 0) {
            return -1;
        }
        this.f4708e = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f4704a == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f4707d;
        if (i == -1) {
            throw new bxl("Mark has been invalidated, pos: " + this.f4708e + " markLimit: " + this.f4706c);
        }
        this.f4708e = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f4704a;
        if (bArr == null) {
            throw m3164d();
        }
        InputStream inputStream = this.in;
        if (inputStream == null) {
            throw m3164d();
        }
        int i = this.f4705b;
        int i2 = this.f4708e;
        if (i - i2 >= j) {
            this.f4708e = (int) (((long) i2) + j);
            return j;
        }
        long j2 = i;
        long j3 = i2;
        this.f4708e = i;
        long j4 = j2 - j3;
        if (this.f4707d == -1 || j > this.f4706c) {
            long jSkip = inputStream.skip(j - j4);
            if (jSkip > 0) {
                this.f4707d = -1;
            }
            return j4 + jSkip;
        }
        if (m3163c(inputStream, bArr) != -1) {
            int i3 = this.f4705b;
            int i4 = this.f4708e;
            if (i3 - i4 >= j - j4) {
                this.f4708e = (int) ((((long) i4) + j) - j4);
                return j;
            }
            long j5 = j4 + ((long) i3);
            long j6 = i4;
            this.f4708e = i3;
            j4 = j5 - j6;
        }
        return j4;
    }

    @Override // java.io.InputStream, p021j$.p024io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.f4704a;
        if (bArr2 == null) {
            throw m3164d();
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = this.in;
        if (inputStream != null) {
            int i5 = this.f4708e;
            int i6 = this.f4705b;
            if (i5 < i6) {
                int i7 = i6 - i5;
                if (i7 >= i2) {
                    i7 = i2;
                }
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.f4708e += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.f4707d != -1 || i3 < bArr2.length) {
                    if (m3163c(inputStream, bArr2) == -1) {
                        if (i3 == i2) {
                            return -1;
                        }
                        return i2 - i3;
                    }
                    if (bArr2 != this.f4704a && (bArr2 = this.f4704a) == null) {
                        throw m3164d();
                    }
                    int i8 = this.f4705b;
                    int i9 = this.f4708e;
                    i4 = i8 - i9;
                    if (i4 >= i3) {
                        i4 = i3;
                    }
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.f4708e += i4;
                } else {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        if (i3 == i2) {
                            return -1;
                        }
                        i2 -= i3;
                    }
                    return i2;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        } else {
            throw m3164d();
        }
    }
}
