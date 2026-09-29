package p504y9;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: y9.f */
/* JADX INFO: loaded from: classes.dex */
public final class C10313f extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b */
    public final HandlerThread f51858b;

    /* JADX INFO: renamed from: c */
    public Handler f51859c;

    /* JADX INFO: renamed from: h */
    public MediaFormat f51864h;

    /* JADX INFO: renamed from: i */
    public MediaFormat f51865i;

    /* JADX INFO: renamed from: j */
    public MediaCodec.CodecException f51866j;

    /* JADX INFO: renamed from: k */
    public long f51867k;

    /* JADX INFO: renamed from: l */
    public boolean f51868l;

    /* JADX INFO: renamed from: m */
    public IllegalStateException f51869m;

    /* JADX INFO: renamed from: a */
    public final Object f51857a = new Object();

    /* JADX INFO: renamed from: d */
    public final C10316i f51860d = new C10316i();

    /* JADX INFO: renamed from: e */
    public final C10316i f51861e = new C10316i();

    /* JADX INFO: renamed from: f */
    public final ArrayDeque<MediaCodec.BufferInfo> f51862f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g */
    public final ArrayDeque<MediaFormat> f51863g = new ArrayDeque<>();

    public C10313f(HandlerThread handlerThread) {
        this.f51858b = handlerThread;
    }

    /* JADX INFO: renamed from: a */
    public final void m19316a() {
        ArrayDeque<MediaFormat> arrayDeque = this.f51863g;
        if (!arrayDeque.isEmpty()) {
            this.f51865i = arrayDeque.getLast();
        }
        C10316i c10316i = this.f51860d;
        c10316i.f51876a = 0;
        c10316i.f51877b = -1;
        c10316i.f51878c = 0;
        C10316i c10316i2 = this.f51861e;
        c10316i2.f51876a = 0;
        c10316i2.f51877b = -1;
        c10316i2.f51878c = 0;
        this.f51862f.clear();
        arrayDeque.clear();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f51857a) {
            this.f51866j = codecException;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f51857a) {
            this.f51860d.m19318a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f51857a) {
            MediaFormat mediaFormat = this.f51865i;
            if (mediaFormat != null) {
                this.f51861e.m19318a(-2);
                this.f51863g.add(mediaFormat);
                this.f51865i = null;
            }
            this.f51861e.m19318a(i10);
            this.f51862f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f51857a) {
            this.f51861e.m19318a(-2);
            this.f51863g.add(mediaFormat);
            this.f51865i = null;
        }
    }
}
