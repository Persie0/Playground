package p000;

import android.media.AudioFormat;
import androidx.wear.ambient.AmbientMode;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.p025io.UncheckedIOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cru implements kns, crw {

    /* JADX INFO: renamed from: a */
    public static final nbh f9175a = nbh.m17259h("com/google/android/apps/camera/camcorder/audio/processor/AudioProcessorImpl");

    /* JADX INFO: renamed from: k */
    private static final Duration f9176k = Duration.ofMillis(3000);

    /* JADX INFO: renamed from: l */
    private static final Duration f9177l = Duration.ofMillis(1000);

    /* JADX INFO: renamed from: m */
    private static final Duration f9178m = Duration.ofMillis(700);

    /* JADX INFO: renamed from: b */
    public final npu f9179b;

    /* JADX INFO: renamed from: c */
    public final npu f9180c;

    /* JADX INFO: renamed from: d */
    public final Object f9181d;

    /* JADX INFO: renamed from: e */
    public final nqf f9182e;

    /* JADX INFO: renamed from: f */
    public knr f9183f;

    /* JADX INFO: renamed from: g */
    public int f9184g;

    /* JADX INFO: renamed from: h */
    public crt f9185h;

    /* JADX INFO: renamed from: i */
    public final crn f9186i;

    /* JADX INFO: renamed from: j */
    public crp f9187j;

    /* JADX INFO: renamed from: n */
    private final ByteBuffer f9188n;

    /* JADX INFO: renamed from: o */
    private final int f9189o;

    /* JADX INFO: renamed from: p */
    private final hig f9190p;

    public cru(hig higVar, crn crnVar) {
        npu npuVarM15032y = kxk.m15032y(jzn.m13824l("AProcInput"));
        npu npuVarM15032y2 = kxk.m15032y(jzn.m13824l("AProcOutput"));
        this.f9181d = new Object();
        this.f9182e = nqf.m17621g();
        this.f9185h = crt.UNINITIALIZED;
        this.f9190p = higVar;
        this.f9186i = crnVar;
        this.f9179b = npuVarM15032y;
        this.f9180c = npuVarM15032y2;
        int iM14977W = kxk.m14977W(((((long) higVar.f27900e) * ((long) higVar.f27899d)) * higVar.f27898c.mo10346b().toMillis()) / 1000);
        lku.m15614I(iM14977W > 0, "Insufficient sample number per buffer");
        int i = iM14977W * jxl.ENCODING_PCM_16BIT.f35042f;
        this.f9189o = i;
        this.f9188n = ByteBuffer.allocate(i);
        higVar.f27901f = new AmbientMode.AmbientController(this);
    }

    /* JADX INFO: renamed from: d */
    public static final void m5431d(Runnable runnable, npu npuVar) {
        kxk.m14975U(npuVar.submit(runnable), new him(1), not.INSTANCE);
    }

    /* JADX INFO: renamed from: e */
    private final void m5432e() {
        try {
            this.f9182e.get(f9178m.toMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((nbe) ((nbe) ((nbe) f9175a.m17252c()).mo17283h(e)).mo17276G((char) 561)).mo17290o("Failed to get the process completed.");
        }
    }

    @Override // p000.kns
    /* JADX INFO: renamed from: a */
    public final knr mo5433a(knr knrVar) {
        this.f9183f = knrVar;
        AudioFormat audioFormatMo5427b = knrVar.mo5427b();
        int sampleRate = audioFormatMo5427b.getSampleRate() * audioFormatMo5427b.getChannelCount() * jxl.ENCODING_PCM_16BIT.f35042f;
        int i = sampleRate * 8;
        int millis = (int) ((((long) (i / 8)) * f9176k.toMillis()) / 1000);
        this.f9184g = millis;
        try {
            this.f9187j = new crp(i, millis);
            this.f9186i.f9153g = Duration.ofNanos((((long) this.f9189o) * 8000000000L) / ((long) i));
            synchronized (this.f9181d) {
                this.f9185h = crt.READY;
            }
            return new crs(knrVar, this, this.f9187j);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5434b(int i) {
        int i2 = i / this.f9189o;
        for (int i3 = 0; i3 < i2; i3++) {
            synchronized (this.f9181d) {
                if (this.f9185h != crt.STARTED) {
                    return;
                }
                this.f9188n.clear();
                knr knrVar = this.f9183f;
                ByteBuffer byteBuffer = this.f9188n;
                khb khbVarMo5430e = knrVar.mo5430e(byteBuffer, byteBuffer.remaining());
                if (khbVarMo5430e != null) {
                    hig higVar = this.f9190p;
                    if (higVar.f27898c.mo10354j(khbVarMo5430e.m14238c())) {
                        higVar.f27897b.m5444b(khbVarMo5430e.m14237b(), khbVarMo5430e.m14236a());
                    } else {
                        ((nbe) ((nbe) hig.f27896a.m17252c()).mo17276G(3635)).mo17292q(yTyWiTtGtnBhy.pIzdD, khbVarMo5430e.m14237b());
                    }
                    crn crnVar = this.f9186i;
                    long jM14237b = khbVarMo5430e.m14237b();
                    synchronized (crnVar.f9149c) {
                        crnVar.f9152f++;
                        if (!crnVar.f9148b.compareAndSet(true, false)) {
                            Duration durationOfNanos = Duration.ofNanos(jM14237b - crnVar.f9154h);
                            int nanos = (int) (durationOfNanos.minus(Duration.ofNanos((long) (crnVar.f9153g.toNanos() * 0.2f))).toNanos() / crnVar.f9153g.toNanos());
                            if (nanos > 0) {
                                crnVar.f9151e += nanos;
                                ((nbe) ((nbe) crn.f9147a.m17252c()).mo17276G(531)).mo17272C("Audio packet timestamp: %d. Expected frame duration: %d ns. Elapsed time: %d ns. Possible frame loss counts: %d", Long.valueOf(jM14237b), Long.valueOf(crnVar.f9153g.toNanos()), Long.valueOf(durationOfNanos.toNanos()), Integer.valueOf(nanos));
                            }
                            if (nanos > crnVar.f9150d) {
                                crnVar.f9150d = nanos;
                            }
                        }
                    }
                    crnVar.f9154h = jM14237b;
                } else if (this.f9183f.mo5426a() != 3) {
                    return;
                } else {
                    ((nbe) ((nbe) f9175a.m17252c()).mo17276G((char) 556)).mo17290o("Read buffer from audio stream, but the audio packet is null.");
                }
            }
        }
    }

    @Override // p000.crw
    /* JADX INFO: renamed from: c */
    public final void mo5435c() {
        synchronized (this.f9181d) {
            if (this.f9185h != crt.STARTED) {
                return;
            }
            this.f9185h = crt.f9171d;
            this.f9183f.mo5429d();
            this.f9190p.f27898c.mo10348d();
            m5432e();
            this.f9180c.shutdown();
            this.f9179b.shutdown();
            try {
                npu npuVar = this.f9180c;
                Duration duration = f9177l;
                npuVar.awaitTermination(duration.toMillis(), TimeUnit.MILLISECONDS);
                this.f9179b.awaitTermination(duration.toMillis(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                ((nbe) ((nbe) ((nbe) f9175a.m17251b()).mo17283h(e)).mo17276G((char) 557)).mo17290o("Failed to await termination for input and output executors.");
            }
            synchronized (this.f9181d) {
                this.f9185h = crt.STOPPED;
            }
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f9181d) {
            if (this.f9185h != crt.CLOSED) {
                mo5435c();
                this.f9183f.close();
                this.f9190p.close();
                this.f9185h = crt.CLOSED;
            }
        }
    }
}
