package kotlinx.coroutines.scheduling;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: kotlinx.coroutines.scheduling.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C7187k extends CoroutineDispatcher {

    /* JADX INFO: renamed from: c */
    public static final C7187k f40489c = new C7187k();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: A1 */
    public final void mo14310A1(CoroutineContext coroutineContext, Runnable runnable) {
        C7178b c7178b = C7178b.f40475d;
        c7178b.f40477c.m14477b(runnable, C7186j.f40488g, true);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: z1 */
    public final void mo2307z1(CoroutineContext coroutineContext, Runnable runnable) {
        C7178b c7178b = C7178b.f40475d;
        c7178b.f40477c.m14477b(runnable, C7186j.f40488g, false);
    }
}
