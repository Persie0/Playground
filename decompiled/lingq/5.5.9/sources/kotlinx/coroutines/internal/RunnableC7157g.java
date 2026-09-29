package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.scheduling.C7187k;
import no.C7817b0;
import no.C7843k;
import no.InterfaceC7820c0;
import no.InterfaceC7838i0;
import p338qd.C8573r0;
import sl.C9072e;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.g */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC7157g extends CoroutineDispatcher implements Runnable, InterfaceC7820c0 {

    /* JADX INFO: renamed from: c */
    public final CoroutineDispatcher f40424c;

    /* JADX INFO: renamed from: d */
    public final int f40425d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC7820c0 f40426e;

    /* JADX INFO: renamed from: f */
    public final C7159i<Runnable> f40427f;

    /* JADX INFO: renamed from: g */
    public final Object f40428g;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC7157g(C7187k c7187k, int i10) {
        this.f40424c = c7187k;
        this.f40425d = i10;
        InterfaceC7820c0 interfaceC7820c0 = c7187k instanceof InterfaceC7820c0 ? (InterfaceC7820c0) c7187k : null;
        this.f40426e = interfaceC7820c0 == null ? C7817b0.f42918a : interfaceC7820c0;
        this.f40427f = new C7159i<>();
        this.f40428g = new Object();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: A1 */
    public final void mo14310A1(CoroutineContext coroutineContext, Runnable runnable) {
        this.f40427f.m14448a(runnable);
        boolean z10 = true;
        if (!(this.runningWorkers >= this.f40425d)) {
            synchronized (this.f40428g) {
                if (this.runningWorkers >= this.f40425d) {
                    z10 = false;
                } else {
                    this.runningWorkers++;
                }
            }
            if (z10) {
                this.f40424c.mo14310A1(this, this);
            }
        }
    }

    @Override // no.InterfaceC7820c0
    /* JADX INFO: renamed from: G0 */
    public final InterfaceC7838i0 mo14318G0(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f40426e.mo14318G0(j10, runnable, coroutineContext);
    }

    @Override // no.InterfaceC7820c0
    /* JADX INFO: renamed from: q */
    public final void mo14319q(long j10, C7843k c7843k) {
        this.f40426e.mo14319q(j10, c7843k);
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            int i10 = 0;
            while (true) {
                Runnable runnableM14451d = this.f40427f.m14451d();
                if (runnableM14451d != null) {
                    try {
                        runnableM14451d.run();
                    } catch (Throwable th2) {
                        C8573r0.m16769x0(EmptyCoroutineContext.f38093a, th2);
                    }
                    i10++;
                    if (i10 >= 16 && this.f40424c.mo3964B1(this)) {
                        this.f40424c.mo2307z1(this, this);
                        return;
                    }
                }
            }
            synchronized (this.f40428g) {
                this.runningWorkers--;
                if (this.f40427f.m14450c() == 0) {
                    return;
                }
                this.runningWorkers++;
                C9072e c9072e = C9072e.f47360a;
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: z1 */
    public final void mo2307z1(CoroutineContext coroutineContext, Runnable runnable) {
        this.f40427f.m14448a(runnable);
        boolean z10 = true;
        if (this.runningWorkers >= this.f40425d) {
            return;
        }
        synchronized (this.f40428g) {
            try {
                if (this.runningWorkers >= this.f40425d) {
                    z10 = false;
                } else {
                    this.runningWorkers++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.f40424c.mo2307z1(this, this);
        }
    }
}
