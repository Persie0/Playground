package p235l5;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l5.q */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC7270q implements Executor {

    /* JADX INFO: renamed from: b */
    public final Executor f40761b;

    /* JADX INFO: renamed from: c */
    public Runnable f40762c;

    /* JADX INFO: renamed from: a */
    public final ArrayDeque<a> f40760a = new ArrayDeque<>();

    /* JADX INFO: renamed from: d */
    public final Object f40763d = new Object();

    /* JADX INFO: renamed from: l5.q$a */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final ExecutorC7270q f40764a;

        /* JADX INFO: renamed from: b */
        public final Runnable f40765b;

        public a(ExecutorC7270q executorC7270q, Runnable runnable) {
            this.f40764a = executorC7270q;
            this.f40765b = runnable;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f40765b.run();
                synchronized (this.f40764a.f40763d) {
                    this.f40764a.m14660a();
                }
            } catch (Throwable th2) {
                synchronized (this.f40764a.f40763d) {
                    try {
                        this.f40764a.m14660a();
                        throw th2;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
    }

    public ExecutorC7270q(ExecutorService executorService) {
        this.f40761b = executorService;
    }

    /* JADX INFO: renamed from: a */
    public final void m14660a() {
        a aVarPoll = this.f40760a.poll();
        this.f40762c = aVarPoll;
        if (aVarPoll != null) {
            this.f40761b.execute(aVarPoll);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f40763d) {
            this.f40760a.add(new a(this, runnable));
            if (this.f40762c == null) {
                m14660a();
            }
        }
    }
}
