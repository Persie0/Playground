package p000;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fij implements kyt {

    /* JADX INFO: renamed from: a */
    private final kyt f22117a;

    public fij(kyt kytVar) {
        this.f22117a = kytVar;
    }

    @Override // p000.kyt
    /* JADX INFO: renamed from: a */
    public final void mo8408a(nps npsVar) {
        this.f22117a.mo8408a(npsVar);
    }

    @Override // p000.lfk
    /* JADX INFO: renamed from: b */
    public final void mo8409b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if ((bufferInfo.flags & Integer.MIN_VALUE) != 0) {
            long j = bufferInfo.presentationTimeUs;
        } else {
            this.f22117a.mo8409b(byteBuffer, bufferInfo);
        }
    }

    @Override // p000.lfk, java.lang.AutoCloseable
    public final void close() {
        this.f22117a.close();
    }
}
