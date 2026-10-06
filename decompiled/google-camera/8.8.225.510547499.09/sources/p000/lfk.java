package p000;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface lfk extends AutoCloseable {
    /* JADX INFO: renamed from: b */
    void mo8409b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    @Override // java.lang.AutoCloseable
    void close();
}
