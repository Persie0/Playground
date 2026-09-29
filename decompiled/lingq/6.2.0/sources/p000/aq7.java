package p000;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class aq7 implements Closeable {

    /* JADX INFO: renamed from: g */
    public static final Logger f7361g = Logger.getLogger(aq7.class.getName());

    /* JADX INFO: renamed from: a */
    public final RandomAccessFile f7362a;

    /* JADX INFO: renamed from: b */
    public int f7363b;

    /* JADX INFO: renamed from: c */
    public int f7364c;

    /* JADX INFO: renamed from: d */
    public xp7 f7365d;

    /* JADX INFO: renamed from: e */
    public xp7 f7366e;

    /* JADX INFO: renamed from: f */
    public final byte[] f7367f;

    public aq7(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f7367f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    m2979J(bArr2, i, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    v63.m23133k("Rename failed!");
                    throw null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f7362a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iM2980p = m2980p(0, bArr);
        this.f7363b = iM2980p;
        if (iM2980p <= randomAccessFile2.length()) {
            this.f7364c = m2980p(4, bArr);
            int iM2980p2 = m2980p(8, bArr);
            int iM2980p3 = m2980p(12, bArr);
            this.f7365d = m2986n(iM2980p2);
            this.f7366e = m2986n(iM2980p3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f7363b + ", Actual length: " + randomAccessFile2.length());
    }

    /* JADX INFO: renamed from: J */
    public static void m2979J(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* JADX INFO: renamed from: p */
    public static int m2980p(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* JADX INFO: renamed from: A */
    public final void m2981A(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.f7367f;
            if (i5 >= 4) {
                RandomAccessFile randomAccessFile = this.f7362a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                m2979J(bArr, i6, iArr[i5]);
                i6 += 4;
                i5++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2982a(byte[] bArr) {
        int iM2991z;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    m2983b(length);
                    boolean zM2985e = m2985e();
                    if (zM2985e) {
                        iM2991z = 16;
                    } else {
                        xp7 xp7Var = this.f7366e;
                        iM2991z = m2991z(xp7Var.f68498b + 4 + xp7Var.f68499c);
                    }
                    xp7 xp7Var2 = new xp7(iM2991z, length, 0);
                    m2979J(this.f7367f, 0, length);
                    m2989u(this.f7367f, iM2991z, 4);
                    m2989u(bArr, iM2991z + 4, length);
                    m2981A(this.f7363b, this.f7364c + 1, zM2985e ? iM2991z : this.f7365d.f68498b, iM2991z);
                    this.f7366e = xp7Var2;
                    this.f7364c++;
                    if (zM2985e) {
                        this.f7365d = xp7Var2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2983b(int i) throws IOException {
        int i2 = i + 4;
        int iM2990x = this.f7363b - m2990x();
        if (iM2990x >= i2) {
            return;
        }
        int i3 = this.f7363b;
        do {
            iM2990x += i3;
            i3 <<= 1;
        } while (iM2990x < i2);
        RandomAccessFile randomAccessFile = this.f7362a;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        xp7 xp7Var = this.f7366e;
        int iM2991z = m2991z(xp7Var.f68498b + 4 + xp7Var.f68499c);
        if (iM2991z < this.f7365d.f68498b) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f7363b);
            long j = iM2991z - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.f7366e.f68498b;
        int i5 = this.f7365d.f68498b;
        if (i4 < i5) {
            int i6 = (this.f7363b + i4) - 16;
            m2981A(i3, this.f7364c, i5, i6);
            this.f7366e = new xp7(i6, this.f7366e.f68499c, 0);
        } else {
            m2981A(i3, this.f7364c, i5, i4);
        }
        this.f7363b = i3;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m2984c(zp7 zp7Var) {
        int iM2991z = this.f7365d.f68498b;
        for (int i = 0; i < this.f7364c; i++) {
            xp7 xp7VarM2986n = m2986n(iM2991z);
            zp7Var.mo12101b(new yp7(this, xp7VarM2986n), xp7VarM2986n.f68499c);
            iM2991z = m2991z(xp7VarM2986n.f68498b + 4 + xp7VarM2986n.f68499c);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f7362a.close();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m2985e() {
        return this.f7364c == 0;
    }

    /* JADX INFO: renamed from: n */
    public final xp7 m2986n(int i) throws IOException {
        if (i == 0) {
            return xp7.f68496d;
        }
        RandomAccessFile randomAccessFile = this.f7362a;
        randomAccessFile.seek(i);
        return new xp7(i, randomAccessFile.readInt(), 0);
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m2987q() {
        if (m2985e()) {
            throw new NoSuchElementException();
        }
        if (this.f7364c == 1) {
            synchronized (this) {
                m2981A(4096, 0, 0, 0);
                this.f7364c = 0;
                xp7 xp7Var = xp7.f68496d;
                this.f7365d = xp7Var;
                this.f7366e = xp7Var;
                if (this.f7363b > 4096) {
                    RandomAccessFile randomAccessFile = this.f7362a;
                    randomAccessFile.setLength(4096L);
                    randomAccessFile.getChannel().force(true);
                }
                this.f7363b = 4096;
            }
        } else {
            xp7 xp7Var2 = this.f7365d;
            int iM2991z = m2991z(xp7Var2.f68498b + 4 + xp7Var2.f68499c);
            m2988r(iM2991z, this.f7367f, 0, 4);
            int iM2980p = m2980p(0, this.f7367f);
            m2981A(this.f7363b, this.f7364c - 1, iM2991z, this.f7366e.f68498b);
            this.f7364c--;
            this.f7365d = new xp7(iM2991z, iM2980p, 0);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m2988r(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iM2991z = m2991z(i);
        int i4 = iM2991z + i3;
        int i5 = this.f7363b;
        RandomAccessFile randomAccessFile = this.f7362a;
        if (i4 <= i5) {
            randomAccessFile.seek(iM2991z);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iM2991z;
        randomAccessFile.seek(iM2991z);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(aq7.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.f7363b);
        sb.append(", size=");
        sb.append(this.f7364c);
        sb.append(", first=");
        sb.append(this.f7365d);
        sb.append(", last=");
        sb.append(this.f7366e);
        sb.append(", element lengths=[");
        try {
            m2984c(new hg0(sb));
        } catch (IOException e) {
            f7361g.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m2989u(byte[] bArr, int i, int i2) throws IOException {
        int iM2991z = m2991z(i);
        int i3 = iM2991z + i2;
        int i4 = this.f7363b;
        RandomAccessFile randomAccessFile = this.f7362a;
        if (i3 <= i4) {
            randomAccessFile.seek(iM2991z);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - iM2991z;
        randomAccessFile.seek(iM2991z);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    /* JADX INFO: renamed from: x */
    public final int m2990x() {
        if (this.f7364c == 0) {
            return 16;
        }
        xp7 xp7Var = this.f7366e;
        int i = xp7Var.f68498b;
        int i2 = this.f7365d.f68498b;
        return i >= i2 ? (i - i2) + 4 + xp7Var.f68499c + 16 : (((i + 4) + xp7Var.f68499c) + this.f7363b) - i2;
    }

    /* JADX INFO: renamed from: z */
    public final int m2991z(int i) {
        int i2 = this.f7363b;
        return i < i2 ? i : (i + 16) - i2;
    }
}
