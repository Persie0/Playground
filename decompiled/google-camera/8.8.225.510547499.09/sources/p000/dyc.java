package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyc implements kba {

    /* JADX INFO: renamed from: a */
    private static final nbh f12873a = nbh.m17259h("com/google/android/apps/camera/framestore/audio/AudioSamplerImpl");

    /* JADX INFO: renamed from: b */
    private final lek f12874b;

    /* JADX INFO: renamed from: c */
    private final dxi f12875c;

    /* JADX INFO: renamed from: d */
    private final ScheduledExecutorService f12876d;

    /* JADX INFO: renamed from: e */
    private final long f12877e;

    /* JADX INFO: renamed from: f */
    private final AtomicBoolean f12878f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    private ScheduledFuture f12879g = null;

    public dyc(lek lekVar, dxi dxiVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.f12874b = lekVar;
        this.f12875c = dxiVar;
        this.f12877e = j;
        this.f12876d = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: c */
    private final void m6917c() {
        ScheduledFuture scheduledFuture = this.f12879g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f12879g = null;
            this.f12874b.mo15252d();
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6918a() {
        if (this.f12878f.get()) {
            ((nbe) ((nbe) f12873a.m17252c()).mo17276G((char) 1180)).mo17290o("Attempted to start audio sampler after it has been closed.");
        } else if (this.f12879g != null) {
            ((nbe) ((nbe) f12873a.m17252c()).mo17276G((char) 1179)).mo17290o("Sampler already started.");
        } else {
            this.f12874b.mo15251c();
            this.f12879g = this.f12876d.scheduleAtFixedRate(new drs(this.f12875c, 10), 0L, this.f12877e, TimeUnit.MICROSECONDS);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6919b() {
        m6917c();
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        m6917c();
        lek lekVar = this.f12874b;
        boolean z = lbo.f37882a;
        lekVar.close();
        this.f12878f.set(true);
    }
}
