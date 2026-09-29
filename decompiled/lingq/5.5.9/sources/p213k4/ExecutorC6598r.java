package p213k4;

import dm.C5207g;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p128g2.RunnableC5682t;
import sl.C9072e;

/* JADX INFO: renamed from: k4.r */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC6598r implements Executor {

    /* JADX INFO: renamed from: a */
    public final Executor f37495a;

    /* JADX INFO: renamed from: b */
    public final ArrayDeque<Runnable> f37496b;

    /* JADX INFO: renamed from: c */
    public Runnable f37497c;

    /* JADX INFO: renamed from: d */
    public final Object f37498d;

    public ExecutorC6598r(Executor executor) {
        C5207g.m11111f(executor, "executor");
        this.f37495a = executor;
        this.f37496b = new ArrayDeque<>();
        this.f37498d = new Object();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m13202a() {
        synchronized (this.f37498d) {
            Runnable runnablePoll = this.f37496b.poll();
            Runnable runnable = runnablePoll;
            this.f37497c = runnable;
            if (runnablePoll != null) {
                this.f37495a.execute(runnable);
            }
            C9072e c9072e = C9072e.f47360a;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C5207g.m11111f(runnable, "command");
        synchronized (this.f37498d) {
            this.f37496b.offer(new RunnableC5682t(runnable, 2, this));
            if (this.f37497c == null) {
                m13202a();
            }
            C9072e c9072e = C9072e.f47360a;
        }
    }
}
