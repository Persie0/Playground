package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jzb extends MediaCodec.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jzd f35214a;

    public jzb(jzd jzdVar) {
        this.f35214a = jzdVar;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        String str = String.format("%s failed due to error (%d), transient: %s, recoverable: %s, message: %s, info: %s)", "AudioEncoder", Integer.valueOf(codecException.getErrorCode()), Boolean.valueOf(codecException.isTransient()), Boolean.valueOf(codecException.isRecoverable()), codecException.getMessage(), codecException.getDiagnosticInfo());
        if (codecException.isTransient()) {
            Log.e("AudioEncoder", str);
            return;
        }
        this.f35214a.f35219C = true;
        Log.e("AudioEncoder", "Stopping recording due to: ".concat(String.valueOf(str)), codecException);
        jzd jzdVar = this.f35214a;
        jzdVar.m13785g(new juz(this, 14), jzdVar.f35241c);
        this.f35214a.f35252n.m13792a(jzf.MEDIA_CODEC_ERROR_AUDIO);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        int i2;
        ByteBuffer inputBuffer;
        jzd jzdVar = this.f35214a;
        if (jzdVar.f35253o) {
            synchronized (jzdVar.f35244f) {
                jzd jzdVar2 = this.f35214a;
                if (!jzdVar2.f35222F) {
                    jzdVar2.f35224H.add(Integer.valueOf(i));
                    return;
                }
            }
        }
        if (this.f35214a.f35231O.isDone()) {
            return;
        }
        jzd jzdVar3 = this.f35214a;
        if (!jzdVar3.f35255q) {
            jzdVar3.m13785g(new RunnableC0904pi(this, mediaCodec, i, 17), jzdVar3.f35240b);
            return;
        }
        if (jzdVar3.f35247i.mo5426a() != 3) {
            return;
        }
        if (i < 0) {
            Log.e("AudioEncoder", "Index" + i + " is invalid");
            return;
        }
        synchronized (jzdVar3.f35245g) {
            Future future = jzdVar3.f35226J;
            if (future != null && !future.isDone()) {
                if (jzdVar3.f35228L == -1) {
                    jzdVar3.f35228L = i;
                    return;
                }
                if (jzdVar3.f35227K == -1 || SystemClock.elapsedRealtime() - jzdVar3.f35227K <= 50 || (inputBuffer = mediaCodec.getInputBuffer(i)) == null || inputBuffer.limit() <= 0) {
                    i2 = 0;
                } else {
                    byte[] bArr = jzdVar3.f35229M;
                    if (bArr == null || bArr.length != inputBuffer.limit()) {
                        jzdVar3.f35229M = new byte[inputBuffer.limit()];
                    }
                    byte[] bArr2 = jzdVar3.f35229M;
                    bArr2.getClass();
                    inputBuffer.put(bArr2);
                    inputBuffer.position(0);
                    int iLimit = inputBuffer.limit();
                    jzdVar3.f35257s += 25000;
                    jzdVar3.f35227K += 25;
                    i2 = iLimit;
                }
                mediaCodec.queueInputBuffer(i, 0, i2, jzdVar3.f35257s, 0);
                if (i2 == 0) {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException e) {
                    }
                }
                return;
            }
            jzdVar3.f35226J = jzdVar3.f35242d.submit(new RunnableC0904pi(jzdVar3, mediaCodec, i, 16));
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        jzd jzdVar = this.f35214a;
        if (jzdVar.f35253o) {
            synchronized (jzdVar.f35244f) {
                jzd jzdVar2 = this.f35214a;
                if (!jzdVar2.f35222F) {
                    jzdVar2.f35225I.add(Integer.valueOf(i));
                    return;
                }
            }
        }
        if (this.f35214a.f35231O.isDone()) {
            return;
        }
        jzd jzdVar3 = this.f35214a;
        jzdVar3.m13785g(new RunnableC0904pi(this, i, bufferInfo, 18), jzdVar3.f35241c);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        jzd jzdVar = this.f35214a;
        if (jzdVar.f35253o) {
            synchronized (jzdVar.f35244f) {
                jzd jzdVar2 = this.f35214a;
                if (!jzdVar2.f35222F) {
                    jzdVar2.f35223G = mediaFormat;
                    return;
                }
            }
        }
        this.f35214a.m13784f(mediaFormat);
    }
}
