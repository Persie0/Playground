package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class hel implements her {

    /* JADX INFO: renamed from: a */
    private ScheduledFuture f27471a;

    /* JADX INFO: renamed from: b */
    private final String f27472b;

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f27473c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    private boolean f27474d;

    /* JADX INFO: renamed from: e */
    private hev f27475e;

    /* JADX INFO: renamed from: f */
    private int f27476f;

    /* JADX INFO: renamed from: g */
    private int f27477g;

    /* JADX INFO: renamed from: h */
    private int f27478h;

    /* JADX INFO: renamed from: i */
    protected final ScheduledExecutorService f27479i;

    /* JADX INFO: renamed from: j */
    private int f27480j;

    /* JADX INFO: renamed from: k */
    private hew f27481k;

    /* JADX INFO: renamed from: l */
    private final jfs f27482l;

    public hel(ScheduledExecutorService scheduledExecutorService, jfs jfsVar, String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f27479i = scheduledExecutorService;
        this.f27482l = jfsVar;
        this.f27472b = str;
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: a */
    public final void mo3950a() {
        ScheduledFuture scheduledFuture = this.f27471a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: b */
    public final void mo3951b(hew hewVar) {
        this.f27481k = hewVar;
        hek hekVarMo6109d = mo6109d();
        hev hevVarM10160a = hekVarMo6109d.f27470c;
        Runnable runnable = hevVarM10160a.f27512h;
        if (runnable != null) {
            heu heuVarM10166b = hevVarM10160a.m10166b();
            heuVarM10166b.f27497f = new hea(this, runnable, 6);
            hevVarM10160a = heuVarM10166b.m10160a();
        }
        this.f27475e = hevVarM10160a;
        this.f27476f = hekVarMo6109d.f27468a;
        this.f27478h = hekVarMo6109d.f27469b;
    }

    @Override // p000.her
    /* JADX INFO: renamed from: c */
    public void mo3952c(kmd kmdVar) {
        m10158g();
        this.f27480j = 0;
    }

    /* JADX INFO: renamed from: d */
    protected abstract hek mo6109d();

    /* JADX INFO: renamed from: e */
    protected abstract boolean mo6110e(kpp kppVar);

    /* JADX INFO: renamed from: f */
    protected boolean mo8278f(kpp kppVar) {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m10158g() {
        hew hewVar;
        if (!this.f27473c.compareAndSet(true, false) || (hewVar = this.f27481k) == null) {
            return;
        }
        hewVar.mo10130a();
    }

    @Override // p000.her
    /* JADX INFO: renamed from: i */
    public final void mo3956i(kpp kppVar) {
        int iMin;
        hew hewVar;
        hew hewVar2;
        int i = this.f27477g + 1;
        this.f27477g = i;
        if (i < this.f27476f) {
            return;
        }
        this.f27477g = 0;
        if (mo8278f(kppVar)) {
            this.f27477g = this.f27476f;
            return;
        }
        if (mo6110e(kppVar)) {
            iMin = Math.min(this.f27480j + 1, this.f27478h);
            this.f27480j = iMin;
        } else {
            this.f27480j = 0;
            iMin = 0;
        }
        if (iMin == this.f27478h && !this.f27474d) {
            this.f27474d = true;
            if (this.f27482l.m13093ac(this.f27472b)) {
                if (!this.f27473c.compareAndSet(false, true) || (hewVar2 = this.f27481k) == null) {
                    return;
                }
                hewVar2.mo10131b(this.f27475e);
                return;
            }
        }
        if (!this.f27473c.compareAndSet(true, false) || (hewVar = this.f27481k) == null) {
            return;
        }
        long j = this.f27475e.f27505a;
        if (j == 0) {
            this.f27471a = this.f27479i.schedule(new gxw(hewVar, 16), 1000L, TimeUnit.MILLISECONDS);
        } else if (j > 0) {
            this.f27471a = this.f27479i.schedule(new gxw(hewVar, 16), j, TimeUnit.MILLISECONDS);
        } else {
            hewVar.mo10130a();
        }
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: v */
    public void mo3969v() {
        this.f27473c.set(false);
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: w */
    public void mo3970w() {
    }
}
