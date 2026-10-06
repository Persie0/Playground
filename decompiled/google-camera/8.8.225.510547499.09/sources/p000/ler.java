package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import com.google.android.material.behavior.iWN.zuAgeeF;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ler extends MediaCodec.Callback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ les f38078a;

    public ler(les lesVar) {
        this.f38078a = lesVar;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        if (codecException != null && codecException.isTransient()) {
            Log.w("AsynchMediaCodec", "Transient error occurred while processing data.", codecException);
        } else if (codecException == null || !codecException.isRecoverable()) {
            if (codecException != null) {
                Log.e("AsynchMediaCodec", "Unrecoverable error occurred while encoding data.", codecException);
                this.f38078a.f38083e.mo8566a(codecException);
            } else {
                Log.e("AsynchMediaCodec", zuAgeeF.Sqawz);
                this.f38078a.f38083e.mo8566a(new IllegalStateException(NptsKnlVczSZ.NlfpHCGguEPvsH));
            }
            this.f38078a.m15267e();
        } else {
            Log.w("AsynchMediaCodec", "Recoverable error occurred while encoding data.", codecException);
            this.f38078a.f38083e.mo8566a(codecException);
            this.f38078a.m15267e();
        }
        this.f38078a.f38080b.set(3);
        this.f38078a.f38093o.mo8418e(3);
        this.f38078a.f38085g.getAndSet(false);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f38078a) {
            if (this.f38078a.f38083e.isDone()) {
                return;
            }
            if (this.f38078a.f38084f.getAndSet(false)) {
                this.f38078a.m15269g(i);
            } else {
                this.f38078a.f38082d.addLast(Integer.valueOf(i));
                this.f38078a.f38093o.mo8414a(this.f38078a);
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f38078a) {
            if (this.f38078a.f38083e.isDone()) {
                return;
            }
            boolean z = this.f38078a.f38086h.get();
            int i2 = bufferInfo.flags & 2;
            try {
                if (bufferInfo.size > 0 && !z && i2 == 0 && (!this.f38078a.f38091m || (bufferInfo.flags & 4) == 0)) {
                    this.f38078a.f38093o.mo8416c(bufferInfo);
                    try {
                        lfp lfpVar = this.f38078a.f38092n;
                        les lesVar = this.f38078a;
                        MediaCodec.LinearBlock linearBlock = lesVar.f38091m ? mediaCodec.getOutputFrame(i).getLinearBlock() : null;
                        leq leqVar = new leq(lesVar, mediaCodec, linearBlock != null ? linearBlock.map() : mediaCodec.getOutputBuffer(i), bufferInfo, linearBlock, i);
                        synchronized (lesVar) {
                            lesVar.f38090l.add(leqVar);
                        }
                        lfpVar.mo15285a(leqVar);
                    } catch (MediaCodec.CodecException e) {
                        this.f38078a.f38088j.onError(mediaCodec, e);
                        return;
                    } catch (Throwable th) {
                        Log.e("AsynchMediaCodec", "Exception occurred while trying construct media data", th);
                        return;
                    }
                }
                mediaCodec.releaseOutputBuffer(i, false);
                this.f38078a.m15265c(bufferInfo);
            } catch (MediaCodec.CodecException e2) {
                this.f38078a.f38088j.onError(mediaCodec, e2);
            } catch (Throwable th2) {
                Log.e("AsynchMediaCodec", "Exception occurred while trying to release output buffer", th2);
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.f38078a.f38092n.mo15286b(mediaFormat);
    }
}
