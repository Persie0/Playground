package p000;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ckd implements kba {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ grz f5967a;

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f5968b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c */
    private final ScheduledFuture f5969c;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    public ckd(grz grzVar, byte[] bArr) {
        this.f5967a = grzVar;
        this.f5969c = grzVar.f26199c.schedule(new cei(this, 14), 4000L, TimeUnit.MILLISECONDS);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        if (this.f5968b.getAndSet(false)) {
            this.f5969c.cancel(true);
            this.f5967a.m9695d();
        }
    }
}
