package com.bumptech.glide.load.resource.bitmap;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p407u5.InterfaceC9451b;

/* JADX INFO: loaded from: classes.dex */
public final class RecyclableBufferedInputStream extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public volatile byte[] f10809a;

    /* JADX INFO: renamed from: b */
    public int f10810b;

    /* JADX INFO: renamed from: c */
    public int f10811c;

    /* JADX INFO: renamed from: d */
    public int f10812d;

    /* JADX INFO: renamed from: e */
    public int f10813e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC9451b f10814f;

    public static class InvalidMarkException extends IOException {
        public InvalidMarkException(String str) {
            super(str);
        }
    }

    public RecyclableBufferedInputStream(InputStream inputStream, InterfaceC9451b interfaceC9451b) {
        super(inputStream);
        this.f10812d = -1;
        this.f10814f = interfaceC9451b;
        this.f10809a = (byte[]) interfaceC9451b.mo17852d(65536, byte[].class);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public static void m6342l() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* JADX INFO: renamed from: a */
    public final int m6343a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f10812d;
        if (i10 != -1) {
            int i11 = this.f10813e - i10;
            int i12 = this.f10811c;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f10810b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f10814f.mo17852d(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f10809a = bArr2;
                    this.f10814f.mo17851c(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f10813e - this.f10812d;
                this.f10813e = i13;
                this.f10812d = 0;
                this.f10810b = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f10813e;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f10810b = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f10812d = -1;
            this.f10813e = 0;
            this.f10810b = i16;
        }
        return i16;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f10809a == null || inputStream == null) {
            m6342l();
            throw null;
        }
        return (this.f10810b - this.f10813e) + inputStream.available();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final synchronized void m6344b() {
        try {
            if (this.f10809a != null) {
                this.f10814f.mo17851c(this.f10809a);
                this.f10809a = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f10809a != null) {
            this.f10814f.mo17851c(this.f10809a);
            this.f10809a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f10811c = Math.max(this.f10811c, i10);
        this.f10812d = this.f10813e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() throws IOException {
        try {
            byte[] bArr = this.f10809a;
            InputStream inputStream = ((FilterInputStream) this).in;
            if (bArr == null || inputStream == null) {
                m6342l();
                throw null;
            }
            if (this.f10813e >= this.f10810b && m6343a(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.f10809a && (bArr = this.f10809a) == null) {
                m6342l();
                throw null;
            }
            int i10 = this.f10810b;
            int i11 = this.f10813e;
            if (i10 - i11 <= 0) {
                return -1;
            }
            this.f10813e = i11 + 1;
            return bArr[i11] & 255;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13;
        byte[] bArr2 = this.f10809a;
        if (bArr2 == null) {
            m6342l();
            throw null;
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m6342l();
            throw null;
        }
        int i14 = this.f10813e;
        int i15 = this.f10810b;
        if (i14 < i15) {
            int i16 = i15 - i14;
            if (i16 >= i11) {
                i16 = i11;
            }
            System.arraycopy(bArr2, i14, bArr, i10, i16);
            this.f10813e += i16;
            if (i16 == i11 || inputStream.available() == 0) {
                return i16;
            }
            i10 += i16;
            i12 = i11 - i16;
        } else {
            i12 = i11;
        }
        while (true) {
            int i17 = -1;
            if (this.f10812d == -1 && i12 >= bArr2.length) {
                i13 = inputStream.read(bArr, i10, i12);
                if (i13 == -1) {
                    if (i12 != i11) {
                        i17 = i11 - i12;
                    }
                    return i17;
                }
            } else {
                if (m6343a(inputStream, bArr2) == -1) {
                    if (i12 != i11) {
                        i17 = i11 - i12;
                    }
                    return i17;
                }
                if (bArr2 != this.f10809a && (bArr2 = this.f10809a) == null) {
                    m6342l();
                    throw null;
                }
                int i18 = this.f10810b;
                int i19 = this.f10813e;
                i13 = i18 - i19;
                if (i13 >= i12) {
                    i13 = i12;
                }
                System.arraycopy(bArr2, i19, bArr, i10, i13);
                this.f10813e += i13;
            }
            i12 -= i13;
            if (i12 == 0) {
                return i11;
            }
            if (inputStream.available() == 0) {
                return i11 - i12;
            }
            i10 += i13;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        try {
            if (this.f10809a == null) {
                throw new IOException("Stream is closed");
            }
            int i10 = this.f10812d;
            if (-1 == i10) {
                throw new InvalidMarkException("Mark has been invalidated, pos: " + this.f10813e + " markLimit: " + this.f10811c);
            }
            this.f10813e = i10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j10) throws IOException {
        if (j10 < 1) {
            return 0L;
        }
        try {
            byte[] bArr = this.f10809a;
            if (bArr == null) {
                m6342l();
                throw null;
            }
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream == null) {
                m6342l();
                throw null;
            }
            int i10 = this.f10810b;
            int i11 = this.f10813e;
            if (i10 - i11 >= j10) {
                this.f10813e = (int) (((long) i11) + j10);
                return j10;
            }
            long j11 = ((long) i10) - ((long) i11);
            this.f10813e = i10;
            if (this.f10812d == -1 || j10 > this.f10811c) {
                long jSkip = inputStream.skip(j10 - j11);
                if (jSkip > 0) {
                    this.f10812d = -1;
                }
                return j11 + jSkip;
            }
            if (m6343a(inputStream, bArr) == -1) {
                return j11;
            }
            int i12 = this.f10810b;
            int i13 = this.f10813e;
            if (i12 - i13 >= j10 - j11) {
                this.f10813e = (int) ((((long) i13) + j10) - j11);
                return j10;
            }
            long j12 = (j11 + ((long) i12)) - ((long) i13);
            this.f10813e = i12;
            return j12;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
