package p000;

import com.google.common.p019io.ByteStreams;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p021j$.p024io.DesugarInputStream;
import p021j$.p024io.InputStreamRetargetInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kee extends FilterInputStream implements InputStreamRetargetInterface {

    /* JADX INFO: renamed from: a */
    public int f35715a;

    /* JADX INFO: renamed from: b */
    public final ByteBuffer f35716b;

    /* JADX INFO: renamed from: c */
    private final byte[] f35717c;

    protected kee(InputStream inputStream) {
        super(inputStream);
        this.f35715a = 0;
        byte[] bArr = new byte[8];
        this.f35717c = bArr;
        this.f35716b = ByteBuffer.wrap(bArr);
    }

    /* JADX INFO: renamed from: a */
    public final int m14016a() throws IOException {
        m14021f(this.f35717c, 4);
        this.f35716b.rewind();
        return this.f35716b.getInt();
    }

    /* JADX INFO: renamed from: b */
    public final int m14017b() {
        return (char) m14019d();
    }

    /* JADX INFO: renamed from: c */
    public final long m14018c() {
        return ((long) m14016a()) & 4294967295L;
    }

    /* JADX INFO: renamed from: d */
    public final short m14019d() throws IOException {
        m14021f(this.f35717c, 2);
        this.f35716b.rewind();
        return this.f35716b.getShort();
    }

    /* JADX INFO: renamed from: e */
    public final void m14020e(ByteOrder byteOrder) {
        this.f35716b.order(byteOrder);
    }

    /* JADX INFO: renamed from: f */
    public final void m14021f(byte[] bArr, int i) throws IOException {
        ByteStreams.readFully(this, bArr, 0, i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = this.in.read();
        this.f35715a += i >= 0 ? 1 : 0;
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = this.in.skip(j);
        this.f35715a += (int) jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream, p021j$.p024io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = this.in.read(bArr);
        this.f35715a += Math.max(i, 0);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.in.read(bArr, i, i2);
        this.f35715a += Math.max(i3, 0);
        return i3;
    }
}
