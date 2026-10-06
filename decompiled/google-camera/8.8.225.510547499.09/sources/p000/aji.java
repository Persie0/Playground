package p000;

import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import p021j$.p024io.DesugarInputStream;
import p021j$.p024io.InputStreamRetargetInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aji extends InputStream implements DataInput, InputStreamRetargetInterface {

    /* JADX INFO: renamed from: a */
    protected final DataInputStream f492a;

    /* JADX INFO: renamed from: b */
    protected int f493b;

    /* JADX INFO: renamed from: c */
    public ByteOrder f494c;

    /* JADX INFO: renamed from: d */
    private byte[] f495d;

    public aji(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    /* JADX INFO: renamed from: a */
    public final long m804a() {
        return ((long) readInt()) & 4294967295L;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f492a.available();
    }

    /* JADX INFO: renamed from: b */
    public final void m805b(int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            int iSkip = (int) this.f492a.skip(i3);
            if (iSkip <= 0) {
                if (this.f495d == null) {
                    this.f495d = new byte[8192];
                }
                iSkip = this.f492a.read(this.f495d, 0, Math.min(8192, i3));
                if (iSkip == -1) {
                    throw new EOFException("Reached EOF while skipping " + i + " bytes.");
                }
            }
            i2 += iSkip;
        }
        this.f493b += i2;
    }

    /* JADX INFO: renamed from: c */
    public final void m806c(long j) throws IOException {
        long j2 = this.f493b;
        if (j2 > j) {
            this.f493b = 0;
            this.f492a.reset();
        } else {
            j -= j2;
        }
        m805b((int) j);
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f493b++;
        return this.f492a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f493b++;
        return this.f492a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws EOFException {
        this.f493b++;
        int i = this.f492a.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f493b += 2;
        return this.f492a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f493b += bArr.length;
        this.f492a.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f493b += 4;
        int i = this.f492a.read();
        int i2 = this.f492a.read();
        int i3 = this.f492a.read();
        int i4 = this.f492a.read();
        if ((i | i2 | i3 | i4) < 0) {
            throw new EOFException();
        }
        if (this.f494c == ByteOrder.LITTLE_ENDIAN) {
            return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        if (this.f494c == ByteOrder.BIG_ENDIAN) {
            return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid byte order: ");
        ByteOrder byteOrder = this.f494c;
        sb.append(byteOrder);
        throw new IOException("Invalid byte order: ".concat(String.valueOf(byteOrder)));
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        this.f493b += 8;
        int i = this.f492a.read();
        int i2 = this.f492a.read();
        int i3 = this.f492a.read();
        int i4 = this.f492a.read();
        int i5 = this.f492a.read();
        int i6 = this.f492a.read();
        int i7 = this.f492a.read();
        int i8 = this.f492a.read();
        if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
            throw new EOFException();
        }
        if (this.f494c == ByteOrder.LITTLE_ENDIAN) {
            return (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8) + ((long) i);
        }
        if (this.f494c != ByteOrder.BIG_ENDIAN) {
            StringBuilder sb = new StringBuilder();
            String str = gBCSQzBeB.cMQYJjjOKEXJUQt;
            sb.append(str);
            ByteOrder byteOrder = this.f494c;
            sb.append(byteOrder);
            throw new IOException(str.concat(String.valueOf(byteOrder)));
        }
        long j = ((long) i2) << 48;
        return (((long) i) << 56) + j + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8) + ((long) i8);
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f493b += 2;
        int i = this.f492a.read();
        int i2 = this.f492a.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        if (this.f494c == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i2 << 8) + i);
        }
        if (this.f494c == ByteOrder.BIG_ENDIAN) {
            return (short) ((i << 8) + i2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid byte order: ");
        ByteOrder byteOrder = this.f494c;
        sb.append(byteOrder);
        throw new IOException("Invalid byte order: ".concat(String.valueOf(byteOrder)));
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f493b += 2;
        return this.f492a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f493b++;
        return this.f492a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f493b += 2;
        int i = this.f492a.read();
        int i2 = this.f492a.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        if (this.f494c == ByteOrder.LITTLE_ENDIAN) {
            return (i2 << 8) + i;
        }
        if (this.f494c == ByteOrder.BIG_ENDIAN) {
            return (i << 8) + i2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid byte order: ");
        ByteOrder byteOrder = this.f494c;
        sb.append(byteOrder);
        throw new IOException("Invalid byte order: ".concat(String.valueOf(byteOrder)));
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    @Override // java.io.InputStream, p021j$.p024io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public aji(InputStream inputStream, ByteOrder byteOrder) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f492a = dataInputStream;
        dataInputStream.mark(0);
        this.f493b = 0;
        this.f494c = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f492a.read(bArr, i, i2);
        this.f493b += i3;
        return i3;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.f493b += i2;
        this.f492a.readFully(bArr, i, i2);
    }

    public aji(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }

    public aji(InputStream inputStream, byte[] bArr) {
        this(inputStream);
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
        this.f492a.mark(Integer.MAX_VALUE);
    }

    public aji(byte[] bArr, byte[] bArr2) {
        this(bArr);
        this.f492a.mark(Integer.MAX_VALUE);
    }
}
