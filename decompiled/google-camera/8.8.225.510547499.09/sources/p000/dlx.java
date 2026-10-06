package p000;

import android.database.sqlite.SQLiteException;
import com.google.android.apps.camera.debug.shottracker.p009db.ShotDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p021j$.time.Clock;
import p021j$.time.Duration;
import p021j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dlx implements dlv {

    /* JADX INFO: renamed from: a */
    static final Duration f11993a = Duration.ofMinutes(2);

    /* JADX INFO: renamed from: b */
    static final Duration f11994b = Duration.ofHours(6);

    /* JADX INFO: renamed from: c */
    public static final Duration f11995c = Duration.ofHours(36);

    /* JADX INFO: renamed from: d */
    public final kbo f11996d;

    /* JADX INFO: renamed from: e */
    public final Clock f11997e;

    /* JADX INFO: renamed from: f */
    public ShotDatabase f11998f;

    /* JADX INFO: renamed from: g */
    public dlz f11999g;

    /* JADX INFO: renamed from: h */
    public dmi f12000h;

    /* JADX INFO: renamed from: i */
    private final npv f12001i;

    /* JADX INFO: renamed from: j */
    private final Executor f12002j;

    /* JADX INFO: renamed from: k */
    private long f12003k = f11993a.getSeconds();

    public dlx(npv npvVar, Executor executor, Clock clock, kbo kboVar, oju ojuVar) {
        this.f11996d = kboVar.mo6314a("ShotTracker");
        this.f12001i = npvVar;
        this.f12002j = executor;
        this.f11997e = clock;
        executor.execute(new bmj(this, kboVar, ojuVar, 13));
    }

    /* JADX INFO: renamed from: j */
    public static dmn m6377j(long j, Instant instant, String str) {
        dmn dmnVar = new dmn();
        dmnVar.f12034b = j;
        dmnVar.f12033a = 0;
        dmnVar.f12035c = instant.toEpochMilli();
        dmnVar.f12036d = str;
        return dmnVar;
    }

    /* JADX INFO: renamed from: k */
    public static String m6378k(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dmn dmnVar = (dmn) it.next();
            sb.append(dmnVar.f12034b);
            sb.append(' ');
            sb.append(Instant.ofEpochMilli(dmnVar.f12035c));
            sb.append(": ");
            sb.append(dmnVar.f12036d);
            sb.append('\n');
        }
        return sb.toString();
    }

    @Override // p000.dlv
    /* JADX INFO: renamed from: a */
    public final nps mo6368a() {
        return this.f12001i.submit(new bdv(this, 4));
    }

    @Override // p000.dlv
    /* JADX INFO: renamed from: b */
    public final void mo6369b(long j, Instant instant) {
        this.f12002j.execute(new dcr(this, j, instant, 5));
    }

    @Override // p000.dlv
    /* JADX INFO: renamed from: c */
    public final void mo6370c(long j, Instant instant) {
        this.f12002j.execute(new dcr(this, j, instant, 9));
    }

    @Override // p000.dlv
    /* JADX INFO: renamed from: d */
    public final void mo6371d(long j, Instant instant, String str) {
        this.f12002j.execute(new frn(this, j, instant, str, 1));
    }

    @Override // p000.dlv
    /* JADX INFO: renamed from: e */
    public final void mo6372e(long j, Instant instant) {
        this.f12002j.execute(new dcr(this, j, instant, 6));
    }

    @Override // p000.dlv
    /* JADX INFO: renamed from: f */
    public final void mo6373f(long j, Instant instant) {
        this.f12002j.execute(new dcr(this, j, instant, 4));
    }

    @Override // p000.dlv
    /* JADX INFO: renamed from: g */
    public final void mo6374g(long j, Instant instant) {
        this.f12002j.execute(new dcr(this, j, instant, 7));
    }

    @Override // p000.dlv
    /* JADX INFO: renamed from: h */
    public final void mo6375h(long j, Instant instant) {
        this.f12002j.execute(new dcr(this, j, instant, 8));
    }

    @Override // p000.dlv
    /* JADX INFO: renamed from: i */
    public final void mo6376i(gyv gyvVar, Instant instant, gyw gywVar) {
        gyvVar.getClass();
        this.f12002j.execute(new apv(this, gyvVar, instant, gywVar, 5));
    }

    /* JADX INFO: renamed from: l */
    public final void m6379l(long j, Instant instant, String str) {
        try {
            int iMo6382a = this.f11999g.mo6382a(j, instant.toEpochMilli());
            if (iMo6382a == 1) {
                this.f12000h.mo6398b(m6377j(j, instant, str));
            } else {
                this.f11996d.mo13942d(kfv.m14168E("logImpl updated %d rows for id=%d with time=%s (expected 1)", Integer.valueOf(iMo6382a), Long.valueOf(j), instant));
            }
        } catch (SQLiteException e) {
            this.f11996d.mo13943e(kfv.m14168E("SQLite error in logImpl for id=%d time=%s msg='%s'", Long.valueOf(j), instant, str), e);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m6380m() {
        this.f12001i.schedule(new dgt(this, 8), this.f12003k, TimeUnit.SECONDS);
        this.f12003k = f11994b.getSeconds();
    }
}
