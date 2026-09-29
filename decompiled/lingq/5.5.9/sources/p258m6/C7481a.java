package p258m6;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: m6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7481a {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference<byte[]> f41356a = new AtomicReference<>();

    /* JADX INFO: renamed from: m6.a$a */
    public static class a extends InputStream {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f41357a;

        /* JADX INFO: renamed from: b */
        public int f41358b = -1;

        public a(ByteBuffer byteBuffer) {
            this.f41357a = byteBuffer;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f41357a.remaining();
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i10) {
            this.f41358b = this.f41357a.position();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            ByteBuffer byteBuffer = this.f41357a;
            if (byteBuffer.hasRemaining()) {
                return byteBuffer.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) {
            ByteBuffer byteBuffer = this.f41357a;
            if (!byteBuffer.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i11, available());
            byteBuffer.get(bArr, i10, iMin);
            return iMin;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() throws IOException {
            try {
                int i10 = this.f41358b;
                if (i10 == -1) {
                    throw new IOException("Cannot reset to unset mark position");
                }
                this.f41357a.position(i10);
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.InputStream
        public final long skip(long j10) {
            ByteBuffer byteBuffer = this.f41357a;
            if (!byteBuffer.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j10, available());
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }
    }

    /* JADX INFO: renamed from: m6.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f41359a;

        /* JADX INFO: renamed from: b */
        public final int f41360b;

        /* JADX INFO: renamed from: c */
        public final byte[] f41361c;

        public b(byte[] bArr, int i10, int i11) {
            this.f41361c = bArr;
            this.f41359a = i10;
            this.f41360b = i11;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public static MappedByteBuffer m14864a(File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        Throwable th2;
        FileChannel channel;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                channel = randomAccessFile.getChannel();
                try {
                    MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                    try {
                        channel.close();
                    } catch (IOException unused) {
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                    return mappedByteBufferLoad;
                } catch (Throwable th3) {
                    th2 = th3;
                    Throwable th4 = th2;
                    fileChannel = channel;
                    th = th4;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th2 = th5;
                channel = null;
            }
        } catch (Throwable th6) {
            th = th6;
            randomAccessFile = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static ByteBuffer m14865b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        AtomicReference<byte[]> atomicReference = f41356a;
        byte[] andSet = atomicReference.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i10 = inputStream.read(andSet);
            if (i10 < 0) {
                atomicReference.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return m14866c(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(andSet, 0, i10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static ByteBuffer m14866c(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    /* JADX INFO: renamed from: d */
    public static void m14867d(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile.getChannel();
                channel.write(byteBuffer);
                channel.force(false);
                channel.close();
                randomAccessFile.close();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }
}
