package p000;

import androidx.media3.common.C0713b;
import java.nio.ByteBuffer;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
public class m32 extends bj0 {

    /* JADX INFO: renamed from: c */
    public C0713b f50498c;

    /* JADX INFO: renamed from: d */
    public final xr1 f50499d = new xr1();

    /* JADX INFO: renamed from: e */
    public ByteBuffer f50500e;

    /* JADX INFO: renamed from: f */
    public boolean f50501f;

    /* JADX INFO: renamed from: g */
    public long f50502g;

    /* JADX INFO: renamed from: h */
    public ByteBuffer f50503h;

    /* JADX INFO: renamed from: i */
    public final int f50504i;

    static {
        qu5.m20178a("media3.decoder");
    }

    public m32(int i) {
        this.f50504i = i;
    }

    /* JADX INFO: renamed from: k */
    public void mo16607k() {
        this.f8576b = 0;
        ByteBuffer byteBuffer = this.f50500e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f50503h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f50501f = false;
    }

    /* JADX INFO: renamed from: m */
    public final ByteBuffer m16608m(final int i) {
        int i2 = this.f50504i;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f50500e;
        final int iCapacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new IllegalStateException(iCapacity, i) { // from class: androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException
            {
                super(ux5.m22987j(iCapacity, i, "Buffer too small (", " < ", ")"));
            }
        };
    }

    /* JADX INFO: renamed from: n */
    public final void m16609n(int i) {
        ByteBuffer byteBuffer = this.f50500e;
        if (byteBuffer == null) {
            this.f50500e = m16608m(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.f50500e = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM16608m = m16608m(i2);
        byteBufferM16608m.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM16608m.put(byteBuffer);
        }
        this.f50500e = byteBufferM16608m;
    }

    /* JADX INFO: renamed from: o */
    public final void m16610o() {
        ByteBuffer byteBuffer = this.f50500e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f50503h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
