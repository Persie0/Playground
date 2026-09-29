package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: gx */
/* JADX INFO: loaded from: classes2.dex */
public final class C3054gx extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b */
    public final HandlerThread f41441b;

    /* JADX INFO: renamed from: c */
    public Handler f41442c;

    /* JADX INFO: renamed from: h */
    public MediaFormat f41447h;

    /* JADX INFO: renamed from: i */
    public MediaFormat f41448i;

    /* JADX INFO: renamed from: j */
    public MediaCodec.CodecException f41449j;

    /* JADX INFO: renamed from: k */
    public MediaCodec.CryptoException f41450k;

    /* JADX INFO: renamed from: l */
    public long f41451l;

    /* JADX INFO: renamed from: m */
    public boolean f41452m;

    /* JADX INFO: renamed from: n */
    public IllegalStateException f41453n;

    /* JADX INFO: renamed from: o */
    public hi8 f41454o;

    /* JADX INFO: renamed from: a */
    public final Object f41440a = new Object();

    /* JADX INFO: renamed from: d */
    public final k80 f41443d = new k80();

    /* JADX INFO: renamed from: e */
    public final k80 f41444e = new k80();

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f41445f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f41446g = new ArrayDeque();

    public C3054gx(HandlerThread handlerThread) {
        this.f41441b = handlerThread;
    }

    /* JADX INFO: renamed from: a */
    public final void m12949a() {
        ArrayDeque arrayDeque = this.f41446g;
        if (!arrayDeque.isEmpty()) {
            this.f41448i = (MediaFormat) arrayDeque.getLast();
        }
        k80 k80Var = this.f41443d;
        k80Var.f46844b = k80Var.f46843a;
        k80 k80Var2 = this.f41444e;
        k80Var2.f46844b = k80Var2.f46843a;
        this.f41445f.clear();
        arrayDeque.clear();
    }

    /* JADX INFO: renamed from: b */
    public final void m12950b() {
        IllegalStateException illegalStateException = this.f41453n;
        if (illegalStateException != null) {
            this.f41453n = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.f41449j;
        if (codecException != null) {
            this.f41449j = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.f41450k;
        if (cryptoException == null) {
            return;
        }
        this.f41450k = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f41440a) {
            this.f41450k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f41440a) {
            this.f41449j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        mw2 mw2Var;
        synchronized (this.f41440a) {
            this.f41443d.m14978a(i);
            hi8 hi8Var = this.f41454o;
            if (hi8Var != null && (mw2Var = ((xt5) hi8Var.f42410b).f68749d0) != null) {
                mw2Var.m17064b();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        mw2 mw2Var;
        synchronized (this.f41440a) {
            try {
                MediaFormat mediaFormat = this.f41448i;
                if (mediaFormat != null) {
                    this.f41444e.m14978a(-2);
                    this.f41446g.add(mediaFormat);
                    this.f41448i = null;
                }
                this.f41444e.m14978a(i);
                this.f41445f.add(bufferInfo);
                hi8 hi8Var = this.f41454o;
                if (hi8Var != null && (mw2Var = ((xt5) hi8Var.f42410b).f68749d0) != null) {
                    mw2Var.m17064b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f41440a) {
            this.f41444e.m14978a(-2);
            this.f41446g.add(mediaFormat);
            this.f41448i = null;
        }
    }
}
