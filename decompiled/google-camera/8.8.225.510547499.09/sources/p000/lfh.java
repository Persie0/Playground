package p000;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lfh implements lfk {

    /* JADX INFO: renamed from: a */
    private final lfk f38123a;

    public lfh(lfk lfkVar) {
        this.f38123a = lfkVar;
    }

    @Override // p000.lfk
    /* JADX INFO: renamed from: b */
    public final void mo8409b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        lpe lpeVarM15802e = lpe.m15802e(byteBuffer, bufferInfo);
        this.f38123a.mo8409b((ByteBuffer) lpeVarM15802e.f38884c, (MediaCodec.BufferInfo) lpeVarM15802e.f38883b);
    }

    @Override // p000.lfk, java.lang.AutoCloseable
    public final void close() {
        this.f38123a.close();
    }
}
