package p235l5;

import java.util.Set;
import p026b5.AbstractC1314g;
import p041c5.C1699a0;
import p041c5.C1719q;
import p041c5.C1722t;
import p041c5.RunnableC1707e0;

/* JADX INFO: renamed from: l5.s */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7272s implements Runnable {

    /* JADX INFO: renamed from: d */
    public static final String f40769d = AbstractC1314g.m4868f("StopWorkRunnable");

    /* JADX INFO: renamed from: a */
    public final C1699a0 f40770a;

    /* JADX INFO: renamed from: b */
    public final C1722t f40771b;

    /* JADX INFO: renamed from: c */
    public final boolean f40772c;

    public RunnableC7272s(C1699a0 c1699a0, C1722t c1722t, boolean z10) {
        this.f40770a = c1699a0;
        this.f40771b = c1722t;
        this.f40772c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM5453b;
        RunnableC1707e0 runnableC1707e0;
        if (this.f40772c) {
            C1719q c1719q = this.f40770a.f9480f;
            C1722t c1722t = this.f40771b;
            c1719q.getClass();
            String str = c1722t.f9553a.f37514a;
            synchronized (c1719q.f9548l) {
                try {
                    AbstractC1314g.m4867d().mo4869a(C1719q.f9536H, "Processor stopping foreground work " + str);
                    runnableC1707e0 = (RunnableC1707e0) c1719q.f9542f.remove(str);
                    if (runnableC1707e0 != null) {
                        c1719q.f9544h.remove(str);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            zM5453b = C1719q.m5453b(runnableC1707e0, str);
        } else {
            C1719q c1719q2 = this.f40770a.f9480f;
            C1722t c1722t2 = this.f40771b;
            c1719q2.getClass();
            String str2 = c1722t2.f9553a.f37514a;
            synchronized (c1719q2.f9548l) {
                try {
                    RunnableC1707e0 runnableC1707e1 = (RunnableC1707e0) c1719q2.f9543g.remove(str2);
                    if (runnableC1707e1 == null) {
                        AbstractC1314g.m4867d().mo4869a(C1719q.f9536H, "WorkerWrapper could not be found for " + str2);
                    } else {
                        Set set = (Set) c1719q2.f9544h.get(str2);
                        if (set != null && set.contains(c1722t2)) {
                            AbstractC1314g.m4867d().mo4869a(C1719q.f9536H, "Processor stopping background work " + str2);
                            c1719q2.f9544h.remove(str2);
                            zM5453b = C1719q.m5453b(runnableC1707e1, str2);
                        }
                    }
                    zM5453b = false;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        AbstractC1314g.m4867d().mo4869a(f40769d, "StopWorkRunnable for " + this.f40771b.f9553a.f37514a + "; Processor.stopWork = " + zM5453b);
    }
}
