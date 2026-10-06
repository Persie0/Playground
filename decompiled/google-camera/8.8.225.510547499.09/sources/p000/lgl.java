package p000;

import android.app.Activity;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lgl implements Executor, lhr {

    /* JADX INFO: renamed from: a */
    private final npv f38214a;

    /* JADX INFO: renamed from: b */
    private final lhz f38215b;

    /* JADX INFO: renamed from: c */
    private final ConcurrentLinkedQueue f38216c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: d */
    private volatile boolean f38217d = false;

    /* JADX INFO: renamed from: e */
    private final AtomicBoolean f38218e = new AtomicBoolean();

    public lgl(npv npvVar, lhz lhzVar) {
        this.f38214a = npvVar;
        this.f38215b = lhzVar;
        Object obj = ((lhz) lhzVar.f38277a).f38277a;
        int i = lia.f38278c;
        if (((lia) obj).f38280b.get() > 0) {
            m15317d();
        } else {
            lhzVar.m15360a(this);
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m15316c() {
        while (true) {
            Runnable runnable = (Runnable) this.f38216c.poll();
            if (runnable == null) {
                return;
            } else {
                this.f38214a.execute(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m15317d() {
        this.f38214a.schedule(new kij(this, 7), 3000L, TimeUnit.MILLISECONDS);
    }

    @Override // p000.lhr
    /* JADX INFO: renamed from: a */
    public final void mo15318a(Activity activity) {
        this.f38215b.m15361b(this);
        m15317d();
    }

    /* JADX INFO: renamed from: b */
    public final void m15319b() {
        this.f38217d = true;
        m15316c();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.f38217d) {
            this.f38214a.execute(runnable);
            return;
        }
        this.f38216c.add(runnable);
        if (this.f38217d) {
            m15316c();
        } else {
            if (this.f38218e.getAndSet(true)) {
                return;
            }
            this.f38214a.schedule(new kij(this, 6), 7000L, TimeUnit.MILLISECONDS);
        }
    }
}
