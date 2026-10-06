package p000;

import com.google.android.material.snackbar.VMX.rgoX;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import org.brotli.wrapper.dec.DecoderJNI;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pbk {

    /* JADX INFO: renamed from: c */
    private static final ByteBuffer f47329c = ByteBuffer.allocate(0);

    /* JADX INFO: renamed from: a */
    ByteBuffer f47330a;

    /* JADX INFO: renamed from: b */
    boolean f47331b;

    /* JADX INFO: renamed from: d */
    private final ReadableByteChannel f47332d;

    /* JADX INFO: renamed from: e */
    private final pbl f47333e;

    public pbk(ReadableByteChannel readableByteChannel) {
        if (readableByteChannel == null) {
            throw new NullPointerException(rgoX.ebcGvm);
        }
        this.f47332d = readableByteChannel;
        this.f47333e = new pbl();
    }

    /* JADX INFO: renamed from: c */
    private final void m19297c(String str) throws IOException {
        try {
            m19299b();
        } catch (IOException e) {
        }
        throw new IOException(str);
    }

    /* JADX INFO: renamed from: a */
    final int m19298a() throws IOException {
        while (true) {
            ByteBuffer byteBuffer = this.f47330a;
            if (byteBuffer != null) {
                if (byteBuffer.hasRemaining()) {
                    return this.f47330a.remaining();
                }
                this.f47330a = null;
            }
            pbl pblVar = this.f47333e;
            int i = pblVar.f47336c;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            int i3 = -1;
            switch (i2) {
                case 1:
                    return -1;
                case 2:
                    ByteBuffer byteBuffer2 = pblVar.f47335b;
                    byteBuffer2.clear();
                    int i4 = this.f47332d.read(byteBuffer2);
                    if (i4 == -1) {
                        m19297c("unexpected end of input");
                    } else {
                        i3 = i4;
                    }
                    if (i3 == 0) {
                        this.f47330a = f47329c;
                        return 0;
                    }
                    this.f47333e.m19302c(i3);
                    break;
                case 3:
                    long[] jArr = pblVar.f47334a;
                    if (jArr[0] == 0) {
                        throw new IllegalStateException("brotli decoder is already destroyed");
                    }
                    if (i != 4 && jArr[2] == 0) {
                        throw new IllegalStateException("pulling output from decoder in " + lle.m15702v(i) + " state");
                    }
                    ByteBuffer byteBufferNativePull = DecoderJNI.nativePull(jArr);
                    pblVar.m19301b();
                    this.f47330a = byteBufferNativePull;
                    break;
                    break;
                case 4:
                    pblVar.m19302c(0);
                    break;
                default:
                    m19297c("corrupted input");
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    final void m19299b() {
        if (this.f47331b) {
            return;
        }
        this.f47331b = true;
        this.f47333e.m19300a();
        this.f47332d.close();
    }
}
