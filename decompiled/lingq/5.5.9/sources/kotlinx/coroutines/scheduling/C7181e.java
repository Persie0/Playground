package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractC7092d;

/* JADX INFO: renamed from: kotlinx.coroutines.scheduling.e */
/* JADX INFO: loaded from: classes2.dex */
public class C7181e extends AbstractC7092d {

    /* JADX INFO: renamed from: c */
    public final CoroutineScheduler f40477c;

    public C7181e(int i10, int i11, long j10) {
        this.f40477c = new CoroutineScheduler(i10, i11, j10, "DefaultDispatcher");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: A1 */
    public final void mo14310A1(CoroutineContext coroutineContext, Runnable runnable) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.f40453h;
        this.f40477c.m14477b(runnable, C7186j.f40487f, true);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: z1 */
    public final void mo2307z1(CoroutineContext coroutineContext, Runnable runnable) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.f40453h;
        this.f40477c.m14477b(runnable, C7186j.f40487f, false);
    }
}
