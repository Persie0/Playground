package al;

import com.tonyodev.fetch2.fetch.ListenerCoordinator;
import p463wk.InterfaceC9964g;
import sl.C9072e;

/* JADX INFO: renamed from: al.k */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0124k implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ListenerCoordinator f323a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC9964g f324b;

    public RunnableC0124k(ListenerCoordinator listenerCoordinator, InterfaceC9964g interfaceC9964g) {
        this.f323a = listenerCoordinator;
        this.f324b = interfaceC9964g;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f323a.f32441a) {
            this.f324b.m18546b();
            C9072e c9072e = C9072e.f47360a;
        }
    }
}
