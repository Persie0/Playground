package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class by8 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9178a;

    /* JADX INFO: renamed from: b */
    public final Executor f9179b;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f9180c;

    /* JADX INFO: renamed from: d */
    public Runnable f9181d;

    /* JADX INFO: renamed from: e */
    public final Object f9182e;

    public by8(Executor executor, int i) {
        this.f9178a = i;
        switch (i) {
            case 1:
                executor.getClass();
                this.f9179b = executor;
                this.f9180c = new ArrayDeque();
                this.f9182e = new Object();
                break;
            default:
                this.f9179b = executor;
                this.f9180c = new ArrayDeque();
                this.f9182e = new Object();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4224a() {
        switch (this.f9178a) {
            case 0:
                Runnable runnable = (Runnable) this.f9180c.poll();
                this.f9181d = runnable;
                if (runnable != null) {
                    this.f9179b.execute(runnable);
                    return;
                }
                return;
            case 1:
                synchronized (this.f9182e) {
                    Object objPoll = this.f9180c.poll();
                    Runnable runnable2 = (Runnable) objPoll;
                    this.f9181d = runnable2;
                    if (objPoll != null) {
                        this.f9179b.execute(runnable2);
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f9182e) {
                    try {
                        Runnable runnable3 = (Runnable) this.f9180c.poll();
                        this.f9181d = runnable3;
                        if (runnable3 != null) {
                            ((qg2) this.f9179b).execute(runnable3);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f9178a) {
            case 0:
                synchronized (this.f9182e) {
                    try {
                        this.f9180c.add(new u62(this, runnable, false, 2));
                        if (this.f9181d == null) {
                            m4224a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 1:
                runnable.getClass();
                synchronized (this.f9182e) {
                    this.f9180c.offer(new ks6(4, runnable, this));
                    if (this.f9181d == null) {
                        m4224a();
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f9182e) {
                    try {
                        this.f9180c.add(new RunnableC0806bd(3, this, runnable));
                        if (this.f9181d == null) {
                            m4224a();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    public by8(qg2 qg2Var) {
        this.f9178a = 2;
        this.f9182e = new Object();
        this.f9180c = new ArrayDeque();
        this.f9179b = qg2Var;
    }
}
