package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import p021j$.p024io.DesugarInputStream;
import p021j$.p024io.InputStreamRetargetInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pbj extends InputStream implements InputStreamRetargetInterface {

    /* JADX INFO: renamed from: a */
    private final pbk f47328a;

    public pbj(InputStream inputStream) {
        this.f47328a = new pbk(Channels.newChannel(inputStream));
    }

    @Override // java.io.InputStream
    public final int available() {
        ByteBuffer byteBuffer = this.f47328a.f47330a;
        if (byteBuffer != null) {
            return byteBuffer.remaining();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f47328a.m19299b();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int iM19298a;
        if (this.f47328a.f47331b) {
            throw new IOException("read after close");
        }
        do {
            iM19298a = this.f47328a.m19298a();
        } while (iM19298a == 0);
        if (iM19298a == -1) {
            return -1;
        }
        return this.f47328a.f47330a.get() & 255;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        if (this.f47328a.f47331b) {
            throw new IOException("read after close");
        }
        long j2 = 0;
        while (j > 0 && this.f47328a.m19298a() != -1) {
            int iMin = (int) Math.min(j, this.f47328a.f47330a.remaining());
            pbk pbkVar = this.f47328a;
            ByteBuffer byteBuffer = pbkVar.f47330a;
            byteBuffer.position(byteBuffer.position() + iMin);
            if (!pbkVar.f47330a.hasRemaining()) {
                pbkVar.f47330a = null;
            }
            long j3 = iMin;
            j2 += j3;
            j -= j3;
        }
        return j2;
    }

    @Override // java.io.InputStream, p021j$.p024io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        pbk pbkVar = this.f47328a;
        if (pbkVar.f47331b) {
            throw new IOException("read after close");
        }
        if (pbkVar.m19298a() == -1) {
            return -1;
        }
        int i3 = 0;
        while (i2 > 0) {
            int iMin = Math.min(i2, this.f47328a.f47330a.remaining());
            this.f47328a.f47330a.get(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
            i3 += iMin;
            if (this.f47328a.m19298a() == -1) {
                break;
            }
        }
        return i3;
    }
}
