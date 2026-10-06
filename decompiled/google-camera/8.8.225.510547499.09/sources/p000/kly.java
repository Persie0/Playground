package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kly implements kqa, kpd {

    /* JADX INFO: renamed from: a */
    private final MediaMuxer f36508a;

    public kly(MediaMuxer mediaMuxer) {
        this.f36508a = mediaMuxer;
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: a */
    public final int mo14517a(MediaFormat mediaFormat) {
        return this.f36508a.addTrack(mediaFormat);
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: b */
    public final void mo14518b(String str, Object obj) {
        throw new UnsupportedOperationException("Can't write out metadata using the framework muxer.");
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: c */
    public final void mo14519c() {
        this.f36508a.release();
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: d */
    public final void mo14520d(float f, float f2) {
        this.f36508a.setLocation(f, f2);
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: e */
    public final void mo14521e(int i) {
        this.f36508a.setOrientationHint(i);
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: f */
    public final void mo14522f() {
        this.f36508a.start();
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: g */
    public final void mo14523g() {
        this.f36508a.stop();
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: h */
    public final void mo14524h(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f36508a.writeSampleData(i, byteBuffer, bufferInfo);
    }

    @Override // p000.kqa
    /* JADX INFO: renamed from: i */
    public final boolean mo14525i() {
        return false;
    }

    @Override // p000.kpd
    /* JADX INFO: renamed from: j */
    public final khb mo7254j() {
        return new khb(this.f36508a);
    }
}
