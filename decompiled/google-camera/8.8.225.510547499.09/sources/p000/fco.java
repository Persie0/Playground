package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fco {

    /* JADX INFO: renamed from: a */
    public static final long f21270a = TimeUnit.SECONDS.toNanos(10);

    /* JADX INFO: renamed from: b */
    public final kbo f21271b;

    /* JADX INFO: renamed from: c */
    public final fcp f21272c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f21273d;

    public fco(fcp fcpVar, kbn kbnVar, ScheduledExecutorService scheduledExecutorService) {
        this.f21272c = fcpVar;
        this.f21271b = kbnVar.mo6314a("ProcessingEvent");
        this.f21273d = scheduledExecutorService;
    }
}
