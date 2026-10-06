package p000;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class npy extends npf implements ScheduledFuture, nps {

    /* JADX INFO: renamed from: a */
    private final ScheduledFuture f44042a;

    public npy(nps npsVar, ScheduledFuture scheduledFuture) {
        super(npsVar);
        this.f44042a = scheduledFuture;
    }

    @Override // p000.npe, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = super.cancel(z);
        if (zCancel) {
            this.f44042a.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f44042a.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f44042a.getDelay(timeUnit);
    }
}
