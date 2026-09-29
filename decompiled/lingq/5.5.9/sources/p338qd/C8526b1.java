package p338qd;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

/* JADX INFO: renamed from: qd.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8526b1 extends InputStream {

    /* JADX INFO: renamed from: a */
    public final Enumeration f45796a;

    /* JADX INFO: renamed from: b */
    public FileInputStream f45797b;

    public C8526b1(Enumeration enumeration) throws IOException {
        this.f45796a = enumeration;
        m16639a();
    }

    /* JADX INFO: renamed from: a */
    public final void m16639a() throws IOException {
        FileInputStream fileInputStream = this.f45797b;
        if (fileInputStream != null) {
            fileInputStream.close();
        }
        Enumeration enumeration = this.f45796a;
        if (enumeration.hasMoreElements()) {
            this.f45797b = new FileInputStream((File) enumeration.nextElement());
        } else {
            this.f45797b = null;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        FileInputStream fileInputStream = this.f45797b;
        if (fileInputStream != null) {
            fileInputStream.close();
            this.f45797b = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            FileInputStream fileInputStream = this.f45797b;
            if (fileInputStream == null) {
                return -1;
            }
            int i10 = fileInputStream.read();
            if (i10 != -1) {
                return i10;
            }
            m16639a();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f45797b == null) {
            return -1;
        }
        bArr.getClass();
        if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return 0;
        }
        do {
            int i12 = this.f45797b.read(bArr, i10, i11);
            if (i12 > 0) {
                return i12;
            }
            m16639a();
        } while (this.f45797b != null);
        return -1;
    }
}
