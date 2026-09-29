package p442vo;

import ae.C0062b;
import dm.C5207g;
import java.util.logging.Level;
import sl.C9072e;

/* JADX INFO: renamed from: vo.e */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC9769e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9768d f49851a;

    public RunnableC9769e(C9768d c9768d) {
        this.f49851a = c9768d;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC9765a abstractC9765aM18263c;
        long jMo18269c;
        while (true) {
            C9768d c9768d = this.f49851a;
            synchronized (c9768d) {
                try {
                    abstractC9765aM18263c = c9768d.m18263c();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (abstractC9765aM18263c == null) {
                return;
            }
            C9767c c9767c = abstractC9765aM18263c.f49831c;
            C5207g.m11108c(c9767c);
            C9768d c9768d2 = this.f49851a;
            C9768d.b bVar = C9768d.f49840h;
            boolean zIsLoggable = C9768d.f49842j.isLoggable(Level.FINE);
            if (zIsLoggable) {
                jMo18269c = c9767c.f49834a.f49843a.mo18269c();
                C0062b.m244A(abstractC9765aM18263c, c9767c, "starting");
            } else {
                jMo18269c = -1;
            }
            try {
                C9768d.m18261a(c9768d2, abstractC9765aM18263c);
                try {
                    C9072e c9072e = C9072e.f47360a;
                    if (zIsLoggable) {
                        C0062b.m244A(abstractC9765aM18263c, c9767c, C5207g.m11116k(C0062b.m310T0(c9767c.f49834a.f49843a.mo18269c() - jMo18269c), "finished run in "));
                    }
                } catch (Throwable th3) {
                    if (zIsLoggable) {
                        C0062b.m244A(abstractC9765aM18263c, c9767c, C5207g.m11116k(C0062b.m310T0(c9767c.f49834a.f49843a.mo18269c() - jMo18269c), "failed a run in "));
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                c9768d2.f49843a.execute(this);
                throw th4;
            }
        }
    }
}
