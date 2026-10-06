package p000;

import android.hardware.camera2.CaptureResult;
import android.os.SystemClock;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cug extends kfv {

    /* JADX INFO: renamed from: i */
    private static final nbh f9601i = nbh.m17259h(xRFdVyfdeve.HIQZqk);

    /* JADX INFO: renamed from: j */
    private static final Long f9602j = 4000L;

    /* JADX INFO: renamed from: A */
    private final long f9603A;

    /* JADX INFO: renamed from: B */
    private boolean f9604B;

    /* JADX INFO: renamed from: C */
    private boolean f9605C;

    /* JADX INFO: renamed from: D */
    private long f9606D;

    /* JADX INFO: renamed from: a */
    public long f9607a;

    /* JADX INFO: renamed from: c */
    public final csn f9609c;

    /* JADX INFO: renamed from: d */
    public final csl f9610d;

    /* JADX INFO: renamed from: e */
    public final cxk f9611e;

    /* JADX INFO: renamed from: f */
    public final kbz f9612f;

    /* JADX INFO: renamed from: g */
    public final czr f9613g;

    /* JADX INFO: renamed from: h */
    public final bko f9614h;

    /* JADX INFO: renamed from: k */
    private long f9615k;

    /* JADX INFO: renamed from: l */
    private long f9616l;

    /* JADX INFO: renamed from: m */
    private long f9617m;

    /* JADX INFO: renamed from: n */
    private long f9618n;

    /* JADX INFO: renamed from: p */
    private long f9620p;

    /* JADX INFO: renamed from: q */
    private int f9621q;

    /* JADX INFO: renamed from: r */
    private int f9622r;

    /* JADX INFO: renamed from: s */
    private long f9623s;

    /* JADX INFO: renamed from: t */
    private long f9624t;

    /* JADX INFO: renamed from: v */
    private final dhv f9626v;

    /* JADX INFO: renamed from: w */
    private final Optional f9627w;

    /* JADX INFO: renamed from: y */
    private final AtomicBoolean f9629y;

    /* JADX INFO: renamed from: z */
    private final long f9630z;

    /* JADX INFO: renamed from: o */
    private long f9619o = -1;

    /* JADX INFO: renamed from: u */
    private final Queue f9625u = new ArrayDeque();

    /* JADX INFO: renamed from: b */
    public final Deque f9608b = new ArrayDeque();

    /* JADX INFO: renamed from: x */
    private final AtomicBoolean f9628x = new AtomicBoolean(true);

    public cug(csn csnVar, bko bkoVar, dhv dhvVar, czr czrVar, csl cslVar, cxk cxkVar, kbz kbzVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        long j;
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.f9629y = atomicBoolean;
        this.f9609c = csnVar;
        this.f9626v = dhvVar;
        this.f9610d = cslVar;
        this.f9611e = cxkVar;
        this.f9612f = kbzVar;
        jxn jxnVar = csnVar.f9338c;
        long j2 = jxnVar != jxn.FPS_AUTO ? 1000000 / ((long) jxnVar.f35058i) : -1L;
        this.f9630z = j2;
        if (jxnVar.m13657e()) {
            j = j2 / 4;
        } else {
            f9602j.longValue();
            j = 4000;
        }
        this.f9603A = j;
        this.f9614h = bkoVar;
        this.f9613g = czrVar;
        dhx dhxVar = dhh.f11074a;
        this.f9627w = Optional.empty();
        this.f9615k = 1000000 / jxnVar.f35058i;
        if (jxnVar.m13657e()) {
            atomicBoolean.set(false);
        }
    }

    /* JADX INFO: renamed from: p */
    private final synchronized boolean m5517p(long j) {
        while (!this.f9608b.isEmpty()) {
            mzj mzjVar = (mzj) this.f9608b.peek();
            mzjVar.getClass();
            if (!mzjVar.mo8324a(Long.valueOf(j))) {
                if (mzjVar.m17183l() && ((Long) mzjVar.m17180i()).longValue() > j) {
                    break;
                }
                this.f9608b.poll();
            } else {
                return true;
            }
        }
        return false;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final synchronized void mo3408bu(kpp kppVar) {
        Long l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
        l.getClass();
        long jLongValue = l.longValue() / 1000;
        Long l2 = (Long) kppVar.mo9517d(CaptureResult.SENSOR_FRAME_DURATION);
        l2.getClass();
        long jLongValue2 = l2.longValue();
        lku.m15614I(jLongValue2 > 0, "Sensor frame duration should be > 0");
        long j = this.f9630z;
        if (j == -1) {
            j = jLongValue2 / 1000;
        }
        if (!m5517p(jLongValue)) {
            this.f9625u.offer(new cuf(jLongValue - this.f9607a, j));
        }
        if (!this.f9629y.get()) {
            long jB = kppVar.mo9515b();
            if (this.f9619o == jB) {
                this.f9629y.set(true);
                while (this.f9625u.size() > 2) {
                    this.f9625u.poll();
                }
            } else {
                this.f9619o = jB;
            }
            return;
        }
        if (this.f9625u.size() > 100 || !this.f9609c.f9329A) {
            while (!this.f9625u.isEmpty()) {
                this.f9620p++;
                cuf cufVar = (cuf) this.f9625u.poll();
                cufVar.getClass();
                m5522k(cufVar.f9599a, cufVar.f9600b);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized int m5518g() {
        return this.f9621q;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized int m5519h() {
        return this.f9622r;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized long m5520i() {
        return this.f9620p;
    }

    /* JADX INFO: renamed from: j */
    final synchronized void m5521j() {
        while (!this.f9625u.isEmpty()) {
            cuf cufVar = (cuf) this.f9625u.peek();
            cufVar.getClass();
            if (cufVar.f9599a - this.f9603A > this.f9623s) {
                break;
            }
            cuf cufVar2 = (cuf) this.f9625u.poll();
            cufVar2.getClass();
            long j = this.f9624t;
            long j2 = cufVar2.f9599a;
            if (j - j2 <= this.f9603A) {
                if (!this.f9604B) {
                    this.f9604B = true;
                }
                this.f9620p++;
                m5522k(j2, cufVar2.f9600b);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    final synchronized void m5522k(long j, long j2) {
        int i = 0;
        int i2 = 1;
        if (!this.f9628x.compareAndSet(true, false) && j > this.f9618n) {
            long j3 = j - this.f9617m;
            long j4 = this.f9616l;
            long j5 = this.f9615k;
            lku.m15614I(j5 > 0, "expectedDelayUs should be > 0");
            int i3 = (int) ((j3 - j4) / j5);
            if (i3 < 0 || i3 > 1000) {
                ((nbe) ((nbe) f9601i.m17251b()).mo17276G(652)).mo17272C("Likely error in frame drop calculation: %d = (%d - %d) / %d", Integer.valueOf(i3), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5));
            }
            if (j2 <= this.f9615k || i3 != 1) {
                this.f9622r += i3;
                this.f9627w.ifPresent(new cue(this, i3, i2));
                if (i3 > this.f9621q) {
                    this.f9621q = i3;
                    this.f9626v.mo6173a(dhh.f11098k).ifPresent(new cue(this, i3, i));
                }
                ((nbe) ((nbe) f9601i.m17252c()).mo17276G(656)).mo17272C(voNZjxiJou.FDwfLvHGuhB, Long.valueOf(j), Long.valueOf(1000000 / j2), Long.valueOf(j3), Integer.valueOf(i3));
            }
        }
        long j6 = (long) (j2 * 0.4f);
        this.f9616l = j6;
        this.f9615k = j2;
        this.f9617m = j;
        this.f9618n = j + j2 + j6;
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m5523l(long j) {
        if (!this.f9605C) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
            long jUptimeMillis = SystemClock.uptimeMillis();
            Long.signum(jUptimeMillis);
            this.f9606D = jElapsedRealtimeNanos - (jUptimeMillis * 1000);
            this.f9605C = true;
        }
        long jM13655a = (j / ((long) this.f9609c.f9338c.m13655a())) + this.f9606D;
        this.f9623s = jM13655a;
        if (this.f9624t == 0) {
            this.f9624t = jM13655a;
        }
        m5521j();
    }
}
