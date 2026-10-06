package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ckn {

    /* JADX INFO: renamed from: a */
    private static final nbh f5986a = nbh.m17259h("com/google/android/apps/camera/async/tt/ExecutorThrottler");

    /* JADX INFO: renamed from: b */
    private final ckp f5987b;

    /* JADX INFO: renamed from: c */
    private final ScheduledExecutorService f5988c;

    /* JADX INFO: renamed from: d */
    private final int f5989d;

    /* JADX INFO: renamed from: e */
    private final Map f5990e = new HashMap();

    /* JADX INFO: renamed from: f */
    private int f5991f = 0;

    public ckn(ckp ckpVar, ScheduledExecutorService scheduledExecutorService, int i) {
        this.f5987b = ckpVar;
        this.f5988c = scheduledExecutorService;
        this.f5989d = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m3839a() {
        this.f5988c.schedule(new cei(this, 16), 100L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m3840b() {
        Thread threadCurrentThread = Thread.currentThread();
        long id = threadCurrentThread.getId();
        Map map = this.f5990e;
        Long lValueOf = Long.valueOf(id);
        if (!map.containsKey(lValueOf)) {
            this.f5987b.m3842b();
            this.f5990e.put(lValueOf, threadCurrentThread.getName());
        }
        if (this.f5990e.size() == this.f5989d) {
            this.f5990e.values().iterator().next();
            return;
        }
        int i = this.f5991f + 1;
        this.f5991f = i;
        if (i >= 50) {
            ((nbe) ((nbe) f5986a.m17252c()).mo17276G((char) 206)).mo17290o("Failed to throttle the executor!");
        } else {
            this.f5988c.schedule(new cei(this, 16), 10L, TimeUnit.MILLISECONDS);
        }
    }
}
