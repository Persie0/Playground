package p000;

import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
class jvr extends npd implements RunnableScheduledFuture {

    /* JADX INFO: renamed from: a */
    private final RunnableScheduledFuture f34908a;

    public jvr(RunnableScheduledFuture runnableScheduledFuture) {
        super(runnableScheduledFuture);
        this.f34908a = runnableScheduledFuture;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f34908a.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f34908a.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return this.f34908a.isPeriodic();
    }

    public void run() {
        this.f34908a.run();
    }
}
