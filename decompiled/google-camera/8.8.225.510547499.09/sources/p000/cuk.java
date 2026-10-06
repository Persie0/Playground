package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cuk {

    /* JADX INFO: renamed from: a */
    public final hxw f9640a;

    /* JADX INFO: renamed from: b */
    public final iqi f9641b;

    /* JADX INFO: renamed from: c */
    public final jvd f9642c;

    /* JADX INFO: renamed from: d */
    public final msd f9643d;

    /* JADX INFO: renamed from: f */
    private final Timer f9645f = new Timer();

    /* JADX INFO: renamed from: g */
    private final Map f9646g = new HashMap();

    /* JADX INFO: renamed from: e */
    public mrm f9644e = mqu.f41450a;

    /* JADX INFO: renamed from: h */
    private final TimerTask f9647h = new cuj(this);

    /* JADX INFO: renamed from: i */
    private Duration f9648i = Duration.ZERO;

    /* JADX INFO: renamed from: j */
    private int f9649j = -1;

    public cuk(hxw hxwVar, iqi iqiVar, jvd jvdVar, msd msdVar) {
        this.f9640a = hxwVar;
        this.f9641b = iqiVar;
        this.f9642c = jvdVar;
        this.f9643d = msdVar;
    }

    /* JADX INFO: renamed from: g */
    private final void m5527g(int i) {
        Duration durationOfMillis = Duration.ofMillis(this.f9643d.m16857a(TimeUnit.MILLISECONDS));
        this.f9646g.put(Integer.valueOf(i), durationOfMillis.minus(this.f9648i));
        this.f9648i = durationOfMillis;
    }

    /* JADX INFO: renamed from: a */
    public final long m5528a(int i) {
        Map map = this.f9646g;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            return this.f9643d.m16857a(TimeUnit.MILLISECONDS) - this.f9648i.toMillis();
        }
        Duration duration = (Duration) this.f9646g.get(numValueOf);
        duration.getClass();
        return duration.toMillis();
    }

    /* JADX INFO: renamed from: b */
    public final void m5529b(int i) {
        int i2 = this.f9649j;
        if (i2 != -1) {
            m5527g(i2);
        }
        this.f9649j = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m5530c() {
        msd msdVar = this.f9643d;
        if (msdVar.f41535a) {
            msdVar.m16861f();
            this.f9642c.m13541c(new cqr(this, 20));
            this.f9641b.mo11610l("/video_state_paused", -1L);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5531d() {
        msd msdVar = this.f9643d;
        if (msdVar.f41535a) {
            return;
        }
        msdVar.m16860e();
        this.f9642c.m13541c(new cui(this, 1));
        this.f9641b.mo11610l("/video_state_resumed", -1L);
    }

    /* JADX INFO: renamed from: e */
    public final void m5532e() {
        this.f9643d.m16860e();
        this.f9645f.scheduleAtFixedRate(this.f9647h, 0L, 1000L);
    }

    /* JADX INFO: renamed from: f */
    public final void m5533f() {
        msd msdVar = this.f9643d;
        if (msdVar.f41535a) {
            msdVar.m16861f();
        }
        this.f9644e = mqu.f41450a;
        m5527g(this.f9649j);
        this.f9641b.mo11610l("/video_state_stopped", -1L);
        this.f9645f.cancel();
        this.f9647h.cancel();
    }
}
