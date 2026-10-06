package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hoy extends MediaCodec.Callback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ dhv f28700a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ hqo f28701b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ hpa f28702c;

    public hoy(hpa hpaVar, dhv dhvVar, hqo hqoVar) {
        this.f28702c = hpaVar;
        this.f28700a = dhvVar;
        this.f28701b = hqoVar;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        if (codecException.isTransient()) {
            ((nbe) ((nbe) hpa.f28726a.m17251b()).mo17276G(3807)).mo17273D("CheetahFrSelector failed due to error (%d), transient: %s, recoverable: %s, message: %s, info: %s)", Integer.valueOf(codecException.getErrorCode()), Boolean.valueOf(codecException.isTransient()), Boolean.valueOf(codecException.isRecoverable()), codecException.getMessage(), codecException.getDiagnosticInfo());
        } else {
            ((nbe) ((nbe) ((nbe) hpa.f28726a.m17251b()).mo17283h(codecException)).mo17276G(3808)).mo17273D("Stopping recording due to: CheetahFrSelector failed due to error (%d), transient: %s, recoverable: %s, message: %s, info: %s)", Integer.valueOf(codecException.getErrorCode()), Boolean.valueOf(codecException.isTransient()), Boolean.valueOf(codecException.isRecoverable()), codecException.getMessage(), codecException.getDiagnosticInfo());
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f28702c.f28750t) {
            hpa hpaVar = this.f28702c;
            jxj jxjVar = hpaVar.f28729C;
            jxjVar.getClass();
            hqq hqqVar = hpaVar.f28754x;
            hqqVar.getClass();
            jyx jyxVar = jxjVar.f35020a;
            jyxVar.getClass();
            dhv dhvVar = this.f28700a;
            dhw dhwVar = diy.f11744a;
            dhvVar.mo6175c();
            jyxVar.mo13755n(i, bufferInfo);
            if ((bufferInfo.flags & 2) == 0 && bufferInfo.size > 0) {
                this.f28702c.f28736f.set(TimeUnit.SECONDS.toMillis(this.f28702c.f28737g.incrementAndGet()) / ((long) this.f28701b.f29162h));
                this.f28702c.f28747q.set(TimeUnit.SECONDS.toMillis(this.f28702c.f28744n.incrementAndGet()) / ((long) this.f28701b.f29162h));
            }
            hqqVar.m10627h(this.f28702c.m10559d());
            hqqVar.m10629j(this.f28702c.m10558c());
            hqqVar.m10622c(this.f28702c.m10556a());
            hqqVar.m10623d(this.f28702c.m10557b());
            this.f28702c.m10567l();
            nqf nqfVar = this.f28702c.f28755y;
            if (nqfVar != null && !nqfVar.isDone() && this.f28702c.f28744n.get() > 1) {
                ((nbe) ((nbe) hpa.f28726a.m17252c()).mo17276G(3809)).mo17292q("At least %d frames are encoded. ", this.f28702c.f28744n.get());
                hpa hpaVar2 = this.f28702c;
                hpaVar2.f28755y.mo14894e(hpaVar2.f28728B);
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f28702c.f28750t) {
            jxj jxjVar = this.f28702c.f28729C;
            jxjVar.getClass();
            jyx jyxVar = jxjVar.f35020a;
            jyxVar.getClass();
            jyxVar.mo13753l(mediaCodec.getOutputFormat());
        }
    }
}
