package p000;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class npe extends mvq implements Future {
    protected npe() {
    }

    @Override // p000.mvq
    /* JADX INFO: renamed from: a */
    protected /* bridge */ /* synthetic */ Object mo3816a() {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    protected abstract Future mo17601b();

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return mo17601b().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return mo17601b().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return mo17601b().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return mo17601b().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return mo17601b().get(j, timeUnit);
    }
}
