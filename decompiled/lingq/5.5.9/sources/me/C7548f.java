package me;

import android.support.v4.media.session.C0166e;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: me.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7548f implements Closeable {

    /* JADX INFO: renamed from: g */
    public static final Logger f41629g = Logger.getLogger(C7548f.class.getName());

    /* JADX INFO: renamed from: a */
    public final RandomAccessFile f41630a;

    /* JADX INFO: renamed from: b */
    public int f41631b;

    /* JADX INFO: renamed from: c */
    public int f41632c;

    /* JADX INFO: renamed from: d */
    public a f41633d;

    /* JADX INFO: renamed from: e */
    public a f41634e;

    /* JADX INFO: renamed from: f */
    public final byte[] f41635f;

    /* JADX INFO: renamed from: me.f$a */
    public static class a {

        /* JADX INFO: renamed from: c */
        public static final a f41636c = new a(0, 0);

        /* JADX INFO: renamed from: a */
        public final int f41637a;

        /* JADX INFO: renamed from: b */
        public final int f41638b;

        public a(int i10, int i11) {
            this.f41637a = i10;
            this.f41638b = i11;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.class.getSimpleName());
            sb2.append("[position = ");
            sb2.append(this.f41637a);
            sb2.append(", length = ");
            return C0166e.m768o(sb2, this.f41638b, "]");
        }
    }

    /* JADX INFO: renamed from: me.f$b */
    public final class b extends InputStream {

        /* JADX INFO: renamed from: a */
        public int f41639a;

        /* JADX INFO: renamed from: b */
        public int f41640b;

        public b(a aVar) {
            this.f41639a = C7548f.this.m15062G(aVar.f41637a + 4);
            this.f41640b = aVar.f41638b;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            if (this.f41640b == 0) {
                return -1;
            }
            C7548f c7548f = C7548f.this;
            c7548f.f41630a.seek(this.f41639a);
            int i10 = c7548f.f41630a.read();
            this.f41639a = c7548f.m15062G(this.f41639a + 1);
            this.f41640b--;
            return i10;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) throws IOException {
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f41640b;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            int i13 = this.f41639a;
            C7548f c7548f = C7548f.this;
            c7548f.m15068w(i13, i10, i11, bArr);
            this.f41639a = c7548f.m15062G(this.f41639a + i11);
            this.f41640b -= i11;
            return i11;
        }
    }

    public C7548f(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f41635f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 4; i10 < i12; i12 = 4) {
                    int i13 = iArr[i10];
                    bArr2[i11] = (byte) (i13 >> 24);
                    bArr2[i11 + 1] = (byte) (i13 >> 16);
                    bArr2[i11 + 2] = (byte) (i13 >> 8);
                    bArr2[i11 + 3] = (byte) i13;
                    i11 += 4;
                    i10++;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f41630a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iM15059q = m15059q(bArr, 0);
        this.f41631b = iM15059q;
        if (iM15059q > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f41631b + ", Actual length: " + randomAccessFile2.length());
        }
        this.f41632c = m15059q(bArr, 4);
        int iM15059q2 = m15059q(bArr, 8);
        int iM15059q3 = m15059q(bArr, 12);
        this.f41633d = m15066l(iM15059q2);
        this.f41634e = m15066l(iM15059q3);
    }

    /* JADX INFO: renamed from: q */
    public static int m15059q(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    /* JADX INFO: renamed from: C */
    public final void m15060C(int i10, int i11, byte[] bArr) throws IOException {
        int iM15062G = m15062G(i10);
        int i12 = iM15062G + i11;
        int i13 = this.f41631b;
        RandomAccessFile randomAccessFile = this.f41630a;
        if (i12 <= i13) {
            randomAccessFile.seek(iM15062G);
            randomAccessFile.write(bArr, 0, i11);
            return;
        }
        int i14 = i13 - iM15062G;
        randomAccessFile.seek(iM15062G);
        randomAccessFile.write(bArr, 0, i14);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, 0 + i14, i11 - i14);
    }

    /* JADX INFO: renamed from: E */
    public final int m15061E() {
        if (this.f41632c == 0) {
            return 16;
        }
        a aVar = this.f41634e;
        int i10 = aVar.f41637a;
        int i11 = this.f41633d.f41637a;
        return i10 >= i11 ? (i10 - i11) + 4 + aVar.f41638b + 16 : (((i10 + 4) + aVar.f41638b) + this.f41631b) - i11;
    }

    /* JADX INFO: renamed from: G */
    public final int m15062G(int i10) {
        int i11 = this.f41631b;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    /* JADX INFO: renamed from: H */
    public final void m15063H(int i10, int i11, int i12, int i13) throws IOException {
        int i14 = 0;
        int[] iArr = {i10, i11, i12, i13};
        int i15 = 0;
        while (true) {
            byte[] bArr = this.f41635f;
            if (i14 >= 4) {
                RandomAccessFile randomAccessFile = this.f41630a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                int i16 = iArr[i14];
                bArr[i15] = (byte) (i16 >> 24);
                bArr[i15 + 1] = (byte) (i16 >> 16);
                bArr[i15 + 2] = (byte) (i16 >> 8);
                bArr[i15 + 3] = (byte) i16;
                i15 += 4;
                i14++;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m15064a(byte[] bArr) throws IOException {
        boolean z10;
        int iM15062G;
        int length = bArr.length;
        synchronized (this) {
            if ((length | 0) >= 0) {
                if (length <= bArr.length - 0) {
                    m15065b(length);
                    synchronized (this) {
                        try {
                            z10 = this.f41632c == 0;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
        if (z10) {
            iM15062G = 16;
        } else {
            a aVar = this.f41634e;
            iM15062G = m15062G(aVar.f41637a + 4 + aVar.f41638b);
        }
        a aVar2 = new a(iM15062G, length);
        byte[] bArr2 = this.f41635f;
        bArr2[0] = (byte) (length >> 24);
        bArr2[1] = (byte) (length >> 16);
        bArr2[2] = (byte) (length >> 8);
        bArr2[3] = (byte) length;
        m15060C(iM15062G, 4, bArr2);
        m15060C(iM15062G + 4, length, bArr);
        m15063H(this.f41631b, this.f41632c + 1, z10 ? iM15062G : this.f41633d.f41637a, iM15062G);
        this.f41634e = aVar2;
        this.f41632c++;
        if (z10) {
            this.f41633d = aVar2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m15065b(int i10) throws IOException {
        int i11 = i10 + 4;
        int iM15061E = this.f41631b - m15061E();
        if (iM15061E >= i11) {
            return;
        }
        int i12 = this.f41631b;
        do {
            iM15061E += i12;
            i12 <<= 1;
        } while (iM15061E < i11);
        RandomAccessFile randomAccessFile = this.f41630a;
        randomAccessFile.setLength(i12);
        randomAccessFile.getChannel().force(true);
        a aVar = this.f41634e;
        int iM15062G = m15062G(aVar.f41637a + 4 + aVar.f41638b);
        if (iM15062G < this.f41633d.f41637a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f41631b);
            long j10 = iM15062G - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f41634e.f41637a;
        int i14 = this.f41633d.f41637a;
        if (i13 < i14) {
            int i15 = (this.f41631b + i13) - 16;
            m15063H(i12, this.f41632c, i14, i15);
            this.f41634e = new a(i15, this.f41634e.f41638b);
        } else {
            m15063H(i12, this.f41632c, i14, i13);
        }
        this.f41631b = i12;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        try {
            this.f41630a.close();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: l */
    public final a m15066l(int i10) throws IOException {
        if (i10 == 0) {
            return a.f41636c;
        }
        RandomAccessFile randomAccessFile = this.f41630a;
        randomAccessFile.seek(i10);
        return new a(i10, randomAccessFile.readInt());
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: r */
    public final synchronized void m15067r() throws IOException {
        int i10;
        try {
            synchronized (this) {
                try {
                    i10 = this.f41632c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        if (i10 == 1) {
            synchronized (this) {
                try {
                    m15063H(4096, 0, 0, 0);
                    this.f41632c = 0;
                    a aVar = a.f41636c;
                    this.f41633d = aVar;
                    this.f41634e = aVar;
                    if (this.f41631b > 4096) {
                        RandomAccessFile randomAccessFile = this.f41630a;
                        randomAccessFile.setLength(4096);
                        randomAccessFile.getChannel().force(true);
                    }
                    this.f41631b = 4096;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        } else {
            a aVar2 = this.f41633d;
            int iM15062G = m15062G(aVar2.f41637a + 4 + aVar2.f41638b);
            m15068w(iM15062G, 0, 4, this.f41635f);
            int iM15059q = m15059q(this.f41635f, 0);
            m15063H(this.f41631b, this.f41632c - 1, iM15062G, this.f41634e.f41637a);
            this.f41632c--;
            this.f41633d = new a(iM15062G, iM15059q);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C7548f.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f41631b);
        sb2.append(", size=");
        sb2.append(this.f41632c);
        sb2.append(", first=");
        sb2.append(this.f41633d);
        sb2.append(", last=");
        sb2.append(this.f41634e);
        sb2.append(", element lengths=[");
        try {
            synchronized (this) {
                int iM15062G = this.f41633d.f41637a;
                boolean z10 = true;
                for (int i10 = 0; i10 < this.f41632c; i10++) {
                    a aVarM15066l = m15066l(iM15062G);
                    new b(aVarM15066l);
                    int i11 = aVarM15066l.f41638b;
                    if (z10) {
                        z10 = false;
                    } else {
                        sb2.append(", ");
                    }
                    sb2.append(i11);
                    iM15062G = m15062G(aVarM15066l.f41637a + 4 + aVarM15066l.f41638b);
                }
            }
        } catch (IOException e10) {
            f41629g.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: w */
    public final void m15068w(int i10, int i11, int i12, byte[] bArr) throws IOException {
        int iM15062G = m15062G(i10);
        int i13 = iM15062G + i12;
        int i14 = this.f41631b;
        RandomAccessFile randomAccessFile = this.f41630a;
        if (i13 <= i14) {
            randomAccessFile.seek(iM15062G);
            randomAccessFile.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iM15062G;
        randomAccessFile.seek(iM15062G);
        randomAccessFile.readFully(bArr, i11, i15);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i11 + i15, i12 - i15);
    }
}
