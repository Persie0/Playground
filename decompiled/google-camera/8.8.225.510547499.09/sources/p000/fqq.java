package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fqq implements fqk {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ MediaCodec.BufferInfo f23244a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ MediaFormat f23245b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ByteBuffer f23246c;

    public fqq(MediaCodec.BufferInfo bufferInfo, MediaFormat mediaFormat, ByteBuffer byteBuffer) {
        this.f23244a = bufferInfo;
        this.f23245b = mediaFormat;
        this.f23246c = byteBuffer;
    }

    @Override // p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
