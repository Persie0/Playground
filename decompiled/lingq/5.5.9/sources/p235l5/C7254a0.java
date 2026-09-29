package p235l5;

import java.util.HashMap;
import p026b5.AbstractC1314g;
import p041c5.C1702c;
import p214k5.C6610l;

/* JADX INFO: renamed from: l5.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7254a0 {

    /* JADX INFO: renamed from: e */
    public static final String f40736e = AbstractC1314g.m4868f("WorkTimer");

    /* JADX INFO: renamed from: a */
    public final C1702c f40737a;

    /* JADX INFO: renamed from: b */
    public final HashMap f40738b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f40739c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Object f40740d = new Object();

    /* JADX INFO: renamed from: l5.a0$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo4732a(C6610l c6610l);
    }

    /* JADX INFO: renamed from: l5.a0$b */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final C7254a0 f40741a;

        /* JADX INFO: renamed from: b */
        public final C6610l f40742b;

        public b(C7254a0 c7254a0, C6610l c6610l) {
            this.f40741a = c7254a0;
            this.f40742b = c6610l;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f40741a.f40740d) {
                if (((b) this.f40741a.f40738b.remove(this.f40742b)) != null) {
                    a aVar = (a) this.f40741a.f40739c.remove(this.f40742b);
                    if (aVar != null) {
                        aVar.mo4732a(this.f40742b);
                    }
                } else {
                    AbstractC1314g.m4867d().mo4869a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f40742b));
                }
            }
        }
    }

    public C7254a0(C1702c c1702c) {
        this.f40737a = c1702c;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m14601a(C6610l c6610l) {
        synchronized (this.f40740d) {
            if (((b) this.f40738b.remove(c6610l)) != null) {
                AbstractC1314g.m4867d().mo4869a(f40736e, "Stopping timer for " + c6610l);
                this.f40739c.remove(c6610l);
            }
        }
    }
}
