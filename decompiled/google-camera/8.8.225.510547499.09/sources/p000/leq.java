package p000;

import android.media.MediaCodec;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class leq implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ MediaCodec f38072a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ByteBuffer f38073b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MediaCodec.BufferInfo f38074c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ MediaCodec.LinearBlock f38075d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ int f38076e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ les f38077f;

    public leq(les lesVar, MediaCodec mediaCodec, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, MediaCodec.LinearBlock linearBlock, int i) {
        this.f38077f = lesVar;
        this.f38072a = mediaCodec;
        this.f38073b = byteBuffer;
        this.f38074c = bufferInfo;
        this.f38075d = linearBlock;
        this.f38076e = i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f38077f) {
            if (this.f38077f.f38090l.remove(this) && !this.f38077f.f38083e.isDone()) {
                MediaCodec.LinearBlock linearBlock = this.f38075d;
                if (linearBlock != null) {
                    linearBlock.recycle();
                }
                try {
                    try {
                        this.f38072a.releaseOutputBuffer(this.f38076e, false);
                        this.f38077f.f38093o.mo8415b(this.f38074c.presentationTimeUs);
                        this.f38077f.m15265c(this.f38074c);
                        return;
                    } catch (Throwable th) {
                        Log.e("AsynchMediaCodec", "Exception occurred while trying to release output buffer", th);
                        return;
                    }
                } catch (MediaCodec.CodecException e) {
                    les lesVar = this.f38077f;
                    lesVar.f38088j.onError(lesVar.f38079a, e);
                    return;
                }
            }
            Log.w("AsynchMediaCodec", "Trying to close output buffer at timestamp " + this.f38074c.presentationTimeUs + " but it has been closed or the codec has been stopped already");
        }
    }
}
