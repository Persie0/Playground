package ge;

import android.annotation.SuppressLint;
import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ge.h */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public final class ScheduledFutureC5784h<V> extends AbstractResolvableFuture<V> implements ScheduledFuture<V> {

    /* JADX INFO: renamed from: h */
    public final ScheduledFuture<?> f34986h;

    /* JADX INFO: renamed from: ge.h$a */
    public class a implements b<V> {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m12172a(Exception exc) {
            ScheduledFutureC5784h scheduledFutureC5784h = ScheduledFutureC5784h.this;
            scheduledFutureC5784h.getClass();
            if (AbstractResolvableFuture.f4754f.mo2635b(scheduledFutureC5784h, null, new AbstractResolvableFuture.Failure(exc))) {
                AbstractResolvableFuture.m2626i(scheduledFutureC5784h);
            }
        }
    }

    /* JADX INFO: renamed from: ge.h$b */
    public interface b<T> {
    }

    /* JADX INFO: renamed from: ge.h$c */
    public interface c<T> {
        /* JADX INFO: renamed from: a */
        ScheduledFuture mo12171a(a aVar);
    }

    public ScheduledFutureC5784h(c<V> cVar) {
        this.f34986h = cVar.mo12171a(new a());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f34986h.compareTo(delayed);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    /* JADX INFO: renamed from: g */
    public final void mo2630g() {
        ScheduledFuture<?> scheduledFuture = this.f34986h;
        Object obj = this.f4756a;
        scheduledFuture.cancel((obj instanceof AbstractResolvableFuture.C0718b) && ((AbstractResolvableFuture.C0718b) obj).f4762a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f34986h.getDelay(timeUnit);
    }
}
