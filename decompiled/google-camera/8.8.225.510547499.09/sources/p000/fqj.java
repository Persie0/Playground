package p000;

import android.hardware.HardwareBuffer;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import com.google.android.libraries.oliveoil.p018gl.EGLImage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fqj implements fql {

    /* JADX INFO: renamed from: b */
    private static final nbh f23227b = nbh.m17259h("com/google/android/apps/camera/moments/GLImageEncoder");

    /* JADX INFO: renamed from: a */
    public final ldx f23228a;

    /* JADX INFO: renamed from: c */
    private final MediaCodec f23229c;

    /* JADX INFO: renamed from: d */
    private final lby f23230d;

    /* JADX INFO: renamed from: e */
    private final lea f23231e;

    /* JADX INFO: renamed from: f */
    private boolean f23232f = false;

    public fqj(MediaCodec mediaCodec, MediaFormat mediaFormat, lby lbyVar, lea leaVar) {
        if (kpb.m14660a().f36768a) {
            ((nbe) ((nbe) f23227b.m17252c()).mo17276G((char) 2485)).mo17290o("Using GL-based image encoder on emulator can cause individual frames to fail to encode. Consider using a retryingEncoder wrapper.");
        }
        MediaFormat mediaFormat2 = new MediaFormat(mediaFormat);
        mediaFormat2.setInteger("latency", 1);
        mediaCodec.configure(mediaFormat2, (Surface) null, (MediaCrypto) null, 1);
        ldx ldxVarM15221k = ldx.m15221k(lbyVar, new leh(mediaCodec.createInputSurface()), kzh.m15087d(mediaFormat.getInteger("width"), mediaFormat.getInteger("height")));
        mediaCodec.start();
        this.f23230d = lbyVar;
        this.f23229c = mediaCodec;
        this.f23228a = ldxVarM15221k;
        this.f23231e = leaVar;
    }

    @Override // p000.fql
    /* JADX INFO: renamed from: a */
    public final synchronized fqk mo8707a(kpw kpwVar, bkn bknVar) {
        fqp fqpVar;
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.f23229c.setParameters(bundle);
        Object obj = bknVar.f3651a;
        long j = ((fqs) kpwVar).f23249a;
        HardwareBuffer hardwareBufferMo7250f = kpwVar.mo7250f();
        try {
            if (hardwareBufferMo7250f == null) {
                ((nbe) ((nbe) f23227b.m17252c()).mo17276G(2487)).mo17290o("Incoming image missing HardwareBuffer.");
            } else {
                EGLImage eGLImage = new EGLImage(hardwareBufferMo7250f);
                try {
                    lcy lcyVarM15192b = lcy.m15192b(this.f23230d, eGLImage);
                    try {
                        this.f23230d.execute(new eqd(this, j, 5));
                        this.f23231e.m15236f(lcyVarM15192b, this.f23228a, (float[]) obj);
                        lzd.m16234m(this.f23230d);
                        lcyVarM15192b.close();
                        eGLImage.close();
                        hardwareBufferMo7250f.close();
                    } catch (Throwable th) {
                        try {
                            lcyVarM15192b.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        eGLImage.close();
                    } catch (Throwable th4) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                    }
                    throw th3;
                }
            }
            this.f23232f = true;
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            while (true) {
                int iDequeueOutputBuffer = this.f23229c.dequeueOutputBuffer(bufferInfo, 5000000L);
                if (iDequeueOutputBuffer >= 0) {
                    if ((bufferInfo.flags & 2) != 0) {
                        this.f23229c.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    } else {
                        fqpVar = new fqp(bufferInfo, this.f23229c, iDequeueOutputBuffer);
                        if ((1 & fqpVar.f23241a.flags) == 0) {
                            fqpVar.close();
                            throw new IllegalStateException("Requested key-frame from codec, but codec did not provide it!");
                        }
                    }
                } else {
                    if (iDequeueOutputBuffer == -1) {
                        throw new IllegalStateException("Timed out waiting for encoder output!");
                    }
                    if (iDequeueOutputBuffer != -2) {
                        continue;
                    } else {
                        int integer = this.f23229c.getOutputFormat().getInteger("latency", -42);
                        if (integer > 0) {
                            if (integer != 1) {
                                throw new IllegalStateException("Media codec does not support low latency mode, and hence cannot be used for frame-by-frame encoding. Codec returned a latency of " + integer + ". Please choose a different codec!");
                            }
                        } else if (integer == -42) {
                            ((nbe) ((nbe) f23227b.m17252c()).mo17276G((char) 2486)).mo17290o(hIAHJKEnGsNbz.zMjIEwUBJxe);
                        }
                    }
                }
            }
        } catch (Throwable th5) {
            if (hardwareBufferMo7250f != null) {
                try {
                    hardwareBufferMo7250f.close();
                } catch (Throwable th6) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
                }
            }
            throw th5;
        }
        return fqpVar;
    }

    @Override // p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f23232f) {
            this.f23229c.signalEndOfInputStream();
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            while (true) {
                int iDequeueOutputBuffer = this.f23229c.dequeueOutputBuffer(bufferInfo, 5000000L);
                if ((bufferInfo.flags & 4) != 0) {
                    this.f23232f = false;
                    break;
                } else if (iDequeueOutputBuffer == -1) {
                    throw new IllegalStateException("Timed out waiting for encoder to close!");
                }
            }
        }
        this.f23228a.close();
        this.f23231e.close();
        this.f23229c.release();
    }
}
