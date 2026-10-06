package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fsj implements fsd {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f23482a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f23483b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final kmd f23484c;

    /* JADX INFO: renamed from: d */
    public final MediaFormat f23485d;

    /* JADX INFO: renamed from: e */
    public final gqy f23486e;

    /* JADX INFO: renamed from: f */
    public final kbo f23487f;

    /* JADX INFO: renamed from: g */
    public final boolean f23488g;

    /* JADX INFO: renamed from: h */
    public final boolean f23489h;

    /* JADX INFO: renamed from: i */
    public final int f23490i;

    /* JADX INFO: renamed from: j */
    public final lby f23491j;

    /* JADX INFO: renamed from: k */
    public final gvw f23492k;

    /* JADX INFO: renamed from: l */
    private final Handler f23493l;

    public fsj(MediaFormat mediaFormat, Handler handler, gqy gqyVar, kmd kmdVar, lby lbyVar, dhv dhvVar, kbo kboVar, gvw gvwVar) {
        boolean z = false;
        this.f23485d = mediaFormat;
        this.f23493l = handler;
        this.f23486e = gqyVar;
        this.f23488g = dhvVar.mo6184l(dij.f11602z);
        this.f23489h = dhvVar.mo6184l(dij.f11551A);
        this.f23487f = kbs.m13951k(mediaFormat.getInteger("width") + "x" + mediaFormat.getInteger("height"), kboVar.mo6314a("MomentsTrackEncoder"));
        int integer = mediaFormat.getInteger("color-format");
        if (integer == 21 || integer == 2141391872) {
            z = true;
        }
        lku.m15669w(z);
        kbc kbcVar = dye.f12881a;
        this.f23490i = ((mediaFormat.getInteger("width") * mediaFormat.getInteger("height")) * 3) / 2;
        this.f23491j = lbyVar;
        this.f23484c = kmdVar;
        this.f23492k = gvwVar;
    }

    /* JADX INFO: renamed from: c */
    public static void m8780c(lfk lfkVar, MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        byteBufferAllocateDirect.put(byteBuffer);
        byteBufferAllocateDirect.rewind();
        lfkVar.mo8409b(byteBufferAllocateDirect, bufferInfo2);
    }

    @Override // p000.fsd
    /* JADX INFO: renamed from: a */
    public final fqu mo8765a(kyt kytVar, kay kayVar) {
        if (this.f23483b.get() > 0) {
            this.f23487f.mo13947i("Reached maximum number of active codecs running. Dropping moments track...");
            kytVar.close();
            return new fsq(1);
        }
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("video/avc");
            this.f23483b.incrementAndGet();
            this.f23487f.mo13940b("Created codec successfully; current count: " + this.f23483b.get());
            try {
                return new fsi(this, mediaCodecCreateEncoderByType, this.f23493l, kayVar).m8776a(kytVar);
            } catch (MediaCodec.CodecException e) {
                this.f23487f.mo13948j("Exception trying to launch encoder...", e);
                mediaCodecCreateEncoderByType.release();
                kytVar.close();
                this.f23483b.decrementAndGet();
                return new fsq(1);
            }
        } catch (IOException e2) {
            kytVar.close();
            throw new RuntimeException(e2);
        }
    }

    @Override // p000.fsd
    /* JADX INFO: renamed from: b */
    public final void mo8766b() {
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f23491j.close();
    }
}
