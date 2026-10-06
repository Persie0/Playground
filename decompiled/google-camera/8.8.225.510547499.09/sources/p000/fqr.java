package p000;

import android.media.MediaCodec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fqr implements fqk {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ MediaCodec.BufferInfo f23247a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ fqk f23248b;

    public fqr(MediaCodec.BufferInfo bufferInfo, fqk fqkVar) {
        this.f23247a = bufferInfo;
        this.f23248b = fqkVar;
    }

    @Override // p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23248b.close();
    }
}
