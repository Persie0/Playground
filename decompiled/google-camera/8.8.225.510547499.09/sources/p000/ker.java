package p000;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ker extends FilterOutputStream {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f35788a;

    public ker(OutputStream outputStream) {
        super(outputStream);
        this.f35788a = ByteBuffer.allocate(4);
    }

    /* JADX INFO: renamed from: a */
    public final void m14079a(int i) throws IOException {
        this.f35788a.rewind();
        this.f35788a.putInt(i);
        this.out.write(this.f35788a.array());
    }

    /* JADX INFO: renamed from: b */
    public final void m14080b(short s) throws IOException {
        this.f35788a.rewind();
        this.f35788a.putShort(s);
        this.out.write(this.f35788a.array(), 0, 2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
    }
}
