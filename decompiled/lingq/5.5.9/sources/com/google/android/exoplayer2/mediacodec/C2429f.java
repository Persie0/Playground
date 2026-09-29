package com.google.android.exoplayer2.mediacodec;

import ae.C0062b;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import p218k9.C6633c;
import p479xa.C10134c0;
import p505ya.C10324f;

/* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2429f implements InterfaceC2426c {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f12624a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer[] f12625b;

    /* JADX INFO: renamed from: c */
    public ByteBuffer[] f12626c;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.f$a */
    public static class a implements InterfaceC2426c.b {
        /* JADX INFO: renamed from: b */
        public static MediaCodec m7203b(InterfaceC2426c.a aVar) throws IOException {
            aVar.f12610a.getClass();
            String str = aVar.f12610a.f12615a;
            C0062b.m315V("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            C0062b.m283K0();
            return mediaCodecCreateByCodecName;
        }
    }

    public C2429f(MediaCodec mediaCodec) {
        this.f12624a = mediaCodec;
        if (C10134c0.f51354a < 21) {
            this.f12625b = mediaCodec.getInputBuffers();
            this.f12626c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: a */
    public final void mo7178a() {
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: b */
    public final MediaFormat mo7179b() {
        return this.f12624a.getOutputFormat();
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: c */
    public final void mo7180c(Bundle bundle) {
        this.f12624a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: d */
    public final void mo7181d(int i10, long j10) {
        this.f12624a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: e */
    public final int mo7182e() {
        return this.f12624a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: f */
    public final int mo7183f(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.f12624a;
            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && C10134c0.f51354a < 21) {
                this.f12626c = mediaCodec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    public final void flush() {
        this.f12624a.flush();
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: g */
    public final void mo7184g(int i10, int i11, int i12, long j10) {
        this.f12624a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: h */
    public final void mo7185h(final InterfaceC2426c.c cVar, Handler handler) {
        this.f12624a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: y9.k
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                this.f51883a.getClass();
                C10324f.c cVar2 = (C10324f.c) cVar;
                cVar2.getClass();
                if (C10134c0.f51354a >= 30) {
                    cVar2.m19342a(j10);
                } else {
                    Handler handler2 = cVar2.f51961a;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j10 >> 32), (int) j10));
                }
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: i */
    public final void mo7186i(int i10, boolean z10) {
        this.f12624a.releaseOutputBuffer(i10, z10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: j */
    public final void mo7187j(int i10, C6633c c6633c, long j10) {
        this.f12624a.queueSecureInputBuffer(i10, 0, c6633c.f37600i, j10, 0);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: k */
    public final ByteBuffer mo7188k(int i10) {
        return C10134c0.f51354a >= 21 ? this.f12624a.getInputBuffer(i10) : this.f12625b[i10];
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: l */
    public final void mo7189l(Surface surface) {
        this.f12624a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: m */
    public final ByteBuffer mo7190m(int i10) {
        return C10134c0.f51354a >= 21 ? this.f12624a.getOutputBuffer(i10) : this.f12626c[i10];
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    public final void release() {
        this.f12625b = null;
        this.f12626c = null;
        this.f12624a.release();
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    public final void setVideoScalingMode(int i10) {
        this.f12624a.setVideoScalingMode(i10);
    }
}
