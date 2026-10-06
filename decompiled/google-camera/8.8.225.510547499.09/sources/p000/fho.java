package p000;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fho implements kyt {

    /* JADX INFO: renamed from: a */
    private final kyt f22038a;

    /* JADX INFO: renamed from: b */
    private volatile boolean f22039b = false;

    public fho(kyt kytVar) {
        this.f22038a = kytVar;
    }

    @Override // p000.kyt
    /* JADX INFO: renamed from: a */
    public final void mo8408a(nps npsVar) {
        this.f22038a.mo8408a(npsVar);
    }

    @Override // p000.lfk
    /* JADX INFO: renamed from: b */
    public final void mo8409b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if ((bufferInfo.flags & 1) != 0) {
            this.f22039b = true;
        }
        if (this.f22039b) {
            this.f22038a.mo8409b(byteBuffer, bufferInfo);
        }
    }

    @Override // p000.lfk, java.lang.AutoCloseable
    public final void close() {
        this.f22038a.close();
    }
}
