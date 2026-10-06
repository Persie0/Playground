package p000;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.brotli.wrapper.dec.DecoderJNI;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pbl {

    /* JADX INFO: renamed from: a */
    public final long[] f47334a;

    /* JADX INFO: renamed from: b */
    public final ByteBuffer f47335b;

    /* JADX INFO: renamed from: c */
    public int f47336c = 3;

    public pbl() throws IOException {
        long[] jArr = {0, 16384, 0};
        this.f47334a = jArr;
        this.f47335b = DecoderJNI.nativeCreate(jArr);
        if (jArr[0] == 0) {
            throw new IOException("failed to initialize native brotli decoder");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m19300a() {
        long[] jArr = this.f47334a;
        if (jArr[0] == 0) {
            throw new IllegalStateException("brotli decoder is already destroyed");
        }
        DecoderJNI.nativeDestroy(jArr);
        this.f47334a[0] = 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m19301b() {
        int i;
        long j = this.f47334a[1];
        if (j == 1) {
            i = 2;
        } else if (j == 2) {
            i = 3;
        } else if (j == 3) {
            i = 4;
        } else {
            if (j != 4) {
                this.f47336c = 1;
                return;
            }
            i = 5;
        }
        this.f47336c = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m19302c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("negative block length");
        }
        long[] jArr = this.f47334a;
        if (jArr[0] == 0) {
            throw new IllegalStateException("brotli decoder is already destroyed");
        }
        int i2 = this.f47336c;
        if (i2 != 3) {
            if (i2 != 5) {
                throw new IllegalStateException("pushing input to decoder in " + lle.m15702v(i2) + " state");
            }
            if (i != 0) {
                throw new IllegalStateException("pushing input to decoder in OK state");
            }
        }
        DecoderJNI.nativePush(jArr, i);
        m19301b();
    }

    protected final void finalize() throws Throwable {
        if (this.f47334a[0] != 0) {
            m19300a();
        }
        super.finalize();
    }
}
