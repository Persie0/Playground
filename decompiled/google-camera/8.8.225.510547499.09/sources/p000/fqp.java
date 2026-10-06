package p000;

import android.media.MediaCodec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fqp implements fqk {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ MediaCodec.BufferInfo f23241a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ MediaCodec f23242b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ int f23243c;

    public fqp(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
        this.f23241a = bufferInfo;
        this.f23242b = mediaCodec;
        this.f23243c = i;
    }

    @Override // p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23242b.releaseOutputBuffer(this.f23243c, false);
    }
}
