package p000;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fih implements lfk {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ fii f22113a;

    public fih(fii fiiVar) {
        this.f22113a = fiiVar;
    }

    @Override // p000.lfk
    /* JADX INFO: renamed from: b */
    public final void mo8409b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f22113a.f22114a.mo8409b(byteBuffer, bufferInfo);
    }

    @Override // p000.lfk, java.lang.AutoCloseable
    public final void close() {
        this.f22113a.f22114a.close();
        this.f22113a.f22115b.mo14894e(new Object());
    }
}
