package p000;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaCodec;
import android.os.SystemClock;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import java.nio.ByteBuffer;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class hoj {

    /* JADX INFO: renamed from: a */
    public static final nbh f28576a = nbh.m17259h("com/google/android/apps/camera/timelapse/FrameSelector");

    /* JADX INFO: renamed from: A */
    public final SensorEventListener f28577A;

    /* JADX INFO: renamed from: B */
    public final Sensor f28578B;

    /* JADX INFO: renamed from: C */
    public hqs f28579C;

    /* JADX INFO: renamed from: D */
    public hqm f28580D;

    /* JADX INFO: renamed from: E */
    public hqq f28581E;

    /* JADX INFO: renamed from: G */
    public nqf f28583G;

    /* JADX INFO: renamed from: H */
    public hqo f28584H;

    /* JADX INFO: renamed from: I */
    public Timer f28585I;

    /* JADX INFO: renamed from: J */
    public jxj f28586J;

    /* JADX INFO: renamed from: K */
    public final drj f28587K;

    /* JADX INFO: renamed from: L */
    public final goy f28588L;

    /* JADX INFO: renamed from: M */
    public final djm f28589M;

    /* JADX INFO: renamed from: N */
    public AmbientModeSupport.AmbientController f28590N;

    /* JADX INFO: renamed from: O */
    private final long f28591O;

    /* JADX INFO: renamed from: u */
    public final dbr f28611u;

    /* JADX INFO: renamed from: v */
    public final dhv f28612v;

    /* JADX INFO: renamed from: x */
    public final oju f28614x;

    /* JADX INFO: renamed from: y */
    public final jww f28615y;

    /* JADX INFO: renamed from: z */
    public final SensorManager f28616z;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f28592b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f28593c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f28594d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f28595e = new AtomicBoolean(true);

    /* JADX INFO: renamed from: f */
    public final non f28596f = new non(null);

    /* JADX INFO: renamed from: g */
    public final AtomicInteger f28597g = new AtomicInteger(0);

    /* JADX INFO: renamed from: h */
    public final AtomicInteger f28598h = new AtomicInteger(0);

    /* JADX INFO: renamed from: i */
    public final AtomicLong f28599i = new AtomicLong(0);

    /* JADX INFO: renamed from: j */
    public final AtomicLong f28600j = new AtomicLong(0);

    /* JADX INFO: renamed from: k */
    public final AtomicLong f28601k = new AtomicLong(0);

    /* JADX INFO: renamed from: l */
    public final AtomicLong f28602l = new AtomicLong(0);

    /* JADX INFO: renamed from: m */
    public final AtomicLong f28603m = new AtomicLong(0);

    /* JADX INFO: renamed from: n */
    public final AtomicLong f28604n = new AtomicLong(0);

    /* JADX INFO: renamed from: o */
    public final AtomicLong f28605o = new AtomicLong(0);

    /* JADX INFO: renamed from: p */
    public final AtomicLong f28606p = new AtomicLong(0);

    /* JADX INFO: renamed from: q */
    public final AtomicLong f28607q = new AtomicLong(0);

    /* JADX INFO: renamed from: r */
    public final AtomicLong f28608r = new AtomicLong(0);

    /* JADX INFO: renamed from: s */
    public final AtomicLong f28609s = new AtomicLong(0);

    /* JADX INFO: renamed from: t */
    public final AtomicLong f28610t = new AtomicLong(0);

    /* JADX INFO: renamed from: w */
    public final Object f28613w = new Object();

    /* JADX INFO: renamed from: F */
    public mrm f28582F = mqu.f41450a;

    public hoj(cwd cwdVar, dbr dbrVar, oju ojuVar, dhv dhvVar, djm djmVar, drj drjVar, goy goyVar, jww jwwVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (dhvVar.mo6184l(diy.f11745b)) {
            this.f28591O = 33000L;
        } else {
            this.f28591O = 10000L;
        }
        this.f28611u = dbrVar;
        this.f28614x = ojuVar;
        this.f28612v = dhvVar;
        this.f28578B = cwdVar.m5649G().getDefaultSensor(4);
        this.f28616z = cwdVar.m5649G();
        this.f28589M = djmVar;
        this.f28587K = drjVar;
        this.f28588L = goyVar;
        this.f28615y = jwwVar;
        this.f28577A = new hpk(this, dbrVar, 1);
        this.f28584H = hqo.MANUAL_FPS_30_1X;
        this.f28583G = nqf.m17621g();
    }

    /* JADX INFO: renamed from: h */
    private static final void m10534h(key keyVar, kpw kpwVar) {
        kpwVar.close();
        keyVar.close();
    }

    /* JADX INFO: renamed from: a */
    public final long m10535a() {
        return this.f28599i.get();
    }

    /* JADX INFO: renamed from: b */
    public final long m10536b() {
        return this.f28600j.get() - this.f28599i.get();
    }

    /* JADX INFO: renamed from: c */
    public final long m10537c() {
        return TimeUnit.SECONDS.toMillis(this.f28600j.get()) / ((long) this.f28584H.f29162h);
    }

    /* JADX INFO: renamed from: d */
    public final long m10538d() {
        return this.f28601k.get();
    }

    /* JADX INFO: renamed from: e */
    final void m10539e() {
        if (this.f28589M.m6240o()) {
            Sensor sensor = this.f28578B;
            if (sensor != null) {
                this.f28616z.unregisterListener(this.f28577A, sensor);
            }
            hqs hqsVar = this.f28579C;
            hqsVar.getClass();
            hqsVar.mo10638c();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m10540f(long j, key keyVar, kpw kpwVar, mrm mrmVar, mrm mrmVar2) throws Throwable {
        boolean z;
        Object obj;
        hoj hojVar;
        boolean z2;
        hqm hqmVar;
        long micros;
        long micros2;
        hoj hojVar2 = this;
        if (!hojVar2.f28592b.get()) {
            if (!hojVar2.f28593c.get()) {
                m10534h(keyVar, kpwVar);
                return;
            } else if (mrmVar.mo16813g() && !((Boolean) mrmVar.mo16809c()).booleanValue()) {
                m10534h(keyVar, kpwVar);
                return;
            }
        }
        if (mrmVar.mo16813g() && hojVar2.f28598h.incrementAndGet() <= 1 && ((Boolean) mrmVar.mo16809c()).booleanValue()) {
            hojVar2.f28598h.get();
            m10534h(keyVar, kpwVar);
            return;
        }
        jxj jxjVar = hojVar2.f28586J;
        jxjVar.getClass();
        jyx jyxVar = jxjVar.f35020a;
        jyxVar.getClass();
        MediaCodec mediaCodecMo13743b = jyxVar.mo13743b();
        mediaCodecMo13743b.getClass();
        if (!hojVar2.f28592b.get()) {
            z = false;
        } else if (hojVar2.f28607q.get() > 0) {
            hojVar2.f28592b.set(false);
            z = true;
        } else {
            ((nbe) ((nbe) f28576a.m17252c()).mo17276G((char) 3784)).mo17290o("onImageAvailable() - Wait for at least one frame to stop recording.");
            z = false;
        }
        Object obj2 = hojVar2.f28613w;
        synchronized (obj2) {
            try {
                try {
                    AmbientModeSupport.AmbientController ambientController = hojVar2.f28590N;
                    ambientController.getClass();
                    hqo hqoVar = hojVar2.f28584H;
                    hqq hqqVar = hojVar2.f28581E;
                    hqqVar.getClass();
                    hqm hqmVar2 = hojVar2.f28580D;
                    hqmVar2.getClass();
                    double dM17567a = hojVar2.f28596f.m17567a();
                    hqn[] hqnVarArrValues = hqn.values();
                    int length = hqnVarArrValues.length;
                    int i = 0;
                    while (i < length) {
                        hqn hqnVar = hqnVarArrValues[i];
                        if (hqoVar.f29158d.containsKey(hqnVar) && ((Double) hqoVar.f29158d.get(hqnVar)).doubleValue() == dM17567a) {
                            if (!hojVar2.f28582F.mo16813g()) {
                                hqmVar2.m10611f(hqnVar);
                                hqmVar2.m10609d(hqnVar);
                            } else if (hojVar2.f28582F.mo16809c() != hqnVar) {
                                hqmVar2.m10609d(hqnVar);
                            }
                            hojVar2.f28582F = mrm.m16829i(hqnVar);
                            if (mrmVar2.mo16813g()) {
                                hqs hqsVar = hojVar2.f28579C;
                                hqsVar.getClass();
                                if (hqsVar.mo10639d()) {
                                    synchronized (hqmVar2.f29135a) {
                                        hqmVar2.f29143i = true;
                                    }
                                }
                            }
                            hqm hqmVar3 = hqmVar2;
                            hqo hqoVar2 = hqoVar;
                            hqq hqqVar2 = hqqVar;
                            AmbientModeSupport.AmbientController ambientController2 = ambientController;
                            obj = obj2;
                            try {
                                if (!m10541g(j, hqoVar.f29161g, dM17567a, z, mrmVar2)) {
                                    hojVar = hojVar2;
                                } else if (z) {
                                    hojVar2.f28594d.set(true);
                                    hojVar2.f28602l.incrementAndGet();
                                    hojVar = hojVar2;
                                } else {
                                    int iDequeueInputBuffer = mediaCodecMo13743b.dequeueInputBuffer(10000L);
                                    if (iDequeueInputBuffer >= 0) {
                                        ByteBuffer inputBuffer = mediaCodecMo13743b.getInputBuffer(iDequeueInputBuffer);
                                        if (inputBuffer != null) {
                                            inputBuffer.clear();
                                            inputBuffer.put(((kpv) kpwVar.mo7251g().get(0)).getBuffer());
                                            inputBuffer.put(((kpv) kpwVar.mo7251g().get(2)).getBuffer());
                                            long j2 = hojVar2.f28607q.get();
                                            int i2 = hqoVar2.f29162h;
                                            if (hojVar2.f28604n.get() == 0) {
                                                hojVar2.f28604n.set(TimeUnit.MILLISECONDS.toMicros(SystemClock.uptimeMillis()));
                                                micros2 = hojVar2.f28604n.get();
                                            } else {
                                                try {
                                                    micros2 = hojVar2.f28604n.get() + (TimeUnit.SECONDS.toMicros(j2) / ((long) i2));
                                                } catch (Throwable th) {
                                                    th = th;
                                                    throw th;
                                                }
                                            }
                                            mediaCodecMo13743b.queueInputBuffer(iDequeueInputBuffer, 0, inputBuffer.capacity(), micros2, 0);
                                            hojVar = this;
                                            hojVar.f28602l.incrementAndGet();
                                        }
                                        m10534h(keyVar, kpwVar);
                                        return;
                                    }
                                    hojVar = hojVar2;
                                }
                                if (hojVar.f28602l.get() > 0 || hojVar.f28594d.get()) {
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    int iDequeueOutputBuffer = mediaCodecMo13743b.dequeueOutputBuffer(bufferInfo, hojVar.f28591O);
                                    if (iDequeueOutputBuffer == -1) {
                                        ambientController2 = ambientController2;
                                        hqmVar = hqmVar3;
                                    } else if (iDequeueOutputBuffer == -2) {
                                        jyxVar.mo13753l(mediaCodecMo13743b.getOutputFormat());
                                        ambientController2 = ambientController2;
                                        hqmVar = hqmVar3;
                                    } else if (iDequeueOutputBuffer < 0) {
                                        ((nbe) ((nbe) f28576a.m17251b()).mo17276G(3792)).mo17291p("selectAndDropFrames() - Unexpected result during dequeueOutputBuffer: %d", iDequeueOutputBuffer);
                                        ambientController2 = ambientController2;
                                        hqmVar = hqmVar3;
                                    } else {
                                        if ((bufferInfo.flags & 2) != 0) {
                                            bufferInfo.size = 0;
                                        }
                                        if (bufferInfo.size != 0) {
                                            long j3 = hojVar.f28607q.get();
                                            int i3 = hqoVar2.f29162h;
                                            if (hojVar.f28603m.get() == 0) {
                                                hojVar.f28603m.set(TimeUnit.MILLISECONDS.toMicros(SystemClock.uptimeMillis()));
                                                micros = hojVar.f28603m.get();
                                            } else {
                                                micros = (TimeUnit.SECONDS.toMicros(j3) / ((long) i3)) + hojVar.f28603m.get();
                                            }
                                            bufferInfo.presentationTimeUs = micros;
                                            jyxVar.mo13755n(iDequeueOutputBuffer, bufferInfo);
                                            hojVar.f28601k.set(TimeUnit.SECONDS.toMillis(hojVar.f28599i.incrementAndGet()) / ((long) hqoVar2.f29162h));
                                            hojVar.f28610t.set(TimeUnit.SECONDS.toMillis(hojVar.f28607q.incrementAndGet()) / ((long) hqoVar2.f29162h));
                                            z2 = true;
                                        } else {
                                            ambientController2 = ambientController2;
                                            mediaCodecMo13743b.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                            z2 = false;
                                        }
                                        AtomicLong atomicLong = hojVar.f28602l;
                                        atomicLong.set(atomicLong.get() - 1);
                                        if (z2) {
                                            hqmVar = hqmVar3;
                                            hqmVar.m10608c(hqnVar);
                                        } else {
                                            hqmVar = hqmVar3;
                                        }
                                    }
                                    if (z) {
                                        ((nbe) ((nbe) f28576a.m17252c()).mo17276G((char) 3789)).mo17290o("Received Eos frame. Stop recording.");
                                        hojVar.f28593c.set(false);
                                        hojVar.f28594d.set(false);
                                        hqqVar2.m10627h(m10538d());
                                        hqqVar2.m10629j(m10537c());
                                        hqqVar2.m10622c(m10535a());
                                        hqqVar2.m10623d(m10536b());
                                        hqmVar.m10610e(TimeUnit.SECONDS.toMillis(hojVar.f28608r.get()) / ((long) hojVar.f28584H.f29162h));
                                        hqmVar.m10612g(hojVar.f28610t.get());
                                        hojVar.f28607q.get();
                                        hqmVar.m10613h();
                                        hojVar.f28608r.get();
                                        hojVar.f28607q.get();
                                        hqmVar.m10614i();
                                        nqf nqfVar = hojVar.f28583G;
                                        nqfVar.getClass();
                                        nqfVar.mo14894e(null);
                                    }
                                } else {
                                    ambientController2 = ambientController2;
                                    hqmVar = hqmVar3;
                                }
                                if (!z) {
                                    ambientController2.m1657g(hojVar.f28607q.get(), hqoVar2.f29162h);
                                    hojVar.f28600j.incrementAndGet();
                                    hqmVar.m10607b(hqnVar);
                                }
                                m10534h(keyVar, kpwVar);
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        i++;
                        hojVar2 = hojVar2;
                        hqmVar2 = hqmVar2;
                        dM17567a = dM17567a;
                        obj2 = obj2;
                        ambientController = ambientController;
                        hqqVar = hqqVar;
                        hqoVar = hqoVar;
                    }
                    throw new IllegalArgumentException("Capture rate " + dM17567a + yTyWiTtGtnBhy.bLUuiPVa);
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    final boolean m10541g(long j, int i, double d, boolean z, mrm mrmVar) {
        double d2 = i;
        Double.isNaN(d2);
        boolean zBooleanValue = j % ((long) ((int) (d2 / d))) == 0;
        if (mrmVar.mo16813g()) {
            if (!((Boolean) mrmVar.mo16809c()).booleanValue() && zBooleanValue) {
                ((nbe) ((nbe) f28576a.m17251b()).mo17276G((char) 3793)).mo17290o("The frame is not warped. Ignore");
            }
            zBooleanValue &= ((Boolean) mrmVar.mo16809c()).booleanValue();
        }
        return zBooleanValue || z || this.f28592b.get();
    }
}
