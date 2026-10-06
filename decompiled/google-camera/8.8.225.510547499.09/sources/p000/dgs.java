package p000;

import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dgs implements hes, dgn {

    /* JADX INFO: renamed from: a */
    public int f10960a;

    /* JADX INFO: renamed from: b */
    public long f10961b;

    /* JADX INFO: renamed from: d */
    private final String f10963d;

    /* JADX INFO: renamed from: e */
    private boolean f10964e;

    /* JADX INFO: renamed from: f */
    private ScheduledFuture f10965f;

    /* JADX INFO: renamed from: h */
    private hev f10967h;

    /* JADX INFO: renamed from: i */
    private int f10968i;

    /* JADX INFO: renamed from: j */
    private ScheduledFuture f10969j;

    /* JADX INFO: renamed from: k */
    private hew f10970k;

    /* JADX INFO: renamed from: m */
    private final jfs f10972m;

    /* JADX INFO: renamed from: l */
    private final AtomicBoolean f10971l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    private final ScheduledExecutorService f10962c = jzn.m13828p("CoachSDProcessor");

    /* JADX INFO: renamed from: g */
    private final AtomicBoolean f10966g = new AtomicBoolean(false);

    public dgs(jfs jfsVar, String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f10972m = jfsVar;
        this.f10963d = str;
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: a */
    public final void mo3950a() {
        ScheduledFuture scheduledFuture = this.f10965f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledFuture scheduledFuture2 = this.f10969j;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
        }
        this.f10962c.shutdownNow();
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: b */
    public final void mo3951b(hew hewVar) {
        this.f10970k = hewVar;
        dgr dgrVarMo6120c = mo6120c();
        hev hevVar = dgrVarMo6120c.f10959b;
        Runnable runnable = hevVar.f27512h;
        if (runnable != null) {
            heu heuVarM10166b = hevVar.m10166b();
            heuVarM10166b.f27497f = new dgq(hewVar, runnable, 0);
            this.f10967h = heuVarM10166b.m10160a();
        } else {
            this.f10967h = hevVar;
        }
        this.f10968i = dgrVarMo6120c.f10958a;
    }

    @Override // p000.dgn
    /* JADX INFO: renamed from: bq */
    public final void mo6081bq(long j, Map map) {
        int iMin;
        if (this.f10971l.get()) {
            return;
        }
        this.f10961b = SystemClock.elapsedRealtime();
        if (mo6122e(map)) {
            iMin = Math.min(this.f10960a + 1, this.f10968i);
            this.f10960a = iMin;
        } else {
            this.f10960a = 0;
            iMin = 0;
        }
        if (iMin == this.f10968i && !this.f10964e) {
            this.f10964e = true;
            if (this.f10972m.m13093ac(this.f10963d)) {
                if (this.f10966g.compareAndSet(false, true)) {
                    hew hewVar = this.f10970k;
                    if (hewVar != null) {
                        hewVar.mo10131b(this.f10967h);
                    }
                    this.f10969j = this.f10962c.scheduleAtFixedRate(new dfq(this, 18), 5000L, 5000L, TimeUnit.MILLISECONDS);
                    return;
                }
                return;
            }
        }
        m6121d();
    }

    /* JADX INFO: renamed from: c */
    protected abstract dgr mo6120c();

    /* JADX INFO: renamed from: d */
    public final void m6121d() {
        if (this.f10966g.compareAndSet(true, false)) {
            hew hewVar = this.f10970k;
            if (hewVar != null) {
                if (this.f10967h.f27505a == 0) {
                    this.f10965f = this.f10962c.schedule(new dfq(hewVar, 17), 1000L, TimeUnit.MILLISECONDS);
                } else {
                    hewVar.mo10130a();
                }
            }
            ScheduledFuture scheduledFuture = this.f10969j;
            scheduledFuture.getClass();
            scheduledFuture.cancel(false);
            this.f10969j = null;
        }
    }

    /* JADX INFO: renamed from: e */
    protected abstract boolean mo6122e(Map map);

    @Override // p000.hes
    /* JADX INFO: renamed from: v */
    public final void mo3969v() {
        this.f10971l.set(true);
        this.f10966g.set(false);
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: w */
    public final void mo3970w() {
        this.f10971l.set(false);
    }
}
