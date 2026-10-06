package p000;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bqy extends OutputStream {

    /* JADX INFO: renamed from: a */
    private final OutputStream f4205a;

    /* JADX INFO: renamed from: b */
    private byte[] f4206b;

    /* JADX INFO: renamed from: c */
    private final btg f4207c;

    /* JADX INFO: renamed from: d */
    private int f4208d;

    public bqy(OutputStream outputStream, btg btgVar) {
        this.f4205a = outputStream;
        this.f4207c = btgVar;
        this.f4206b = (byte[]) btgVar.mo3034a(65536, byte[].class);
    }

    /* JADX INFO: renamed from: a */
    private final void m2943a() throws IOException {
        int i = this.f4208d;
        if (i > 0) {
            this.f4205a.write(this.f4206b, 0, i);
            this.f4208d = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m2944b() throws IOException {
        if (this.f4208d == this.f4206b.length) {
            m2943a();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            flush();
            this.f4205a.close();
            byte[] bArr = this.f4206b;
            if (bArr != null) {
                this.f4207c.mo3036c(bArr);
                this.f4206b = null;
            }
        } catch (Throwable th) {
            this.f4205a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        m2943a();
        this.f4205a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f4206b;
        int i2 = this.f4208d;
        this.f4208d = i2 + 1;
        bArr[i2] = (byte) i;
        m2944b();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f4208d;
            if (i6 == 0) {
                if (i4 >= this.f4206b.length) {
                    this.f4205a.write(bArr, i5, i4);
                    return;
                }
                i6 = 0;
            }
            int iMin = Math.min(i4, this.f4206b.length - i6);
            System.arraycopy(bArr, i5, this.f4206b, this.f4208d, iMin);
            this.f4208d += iMin;
            i3 += iMin;
            m2944b();
        } while (i3 < i2);
    }
}
