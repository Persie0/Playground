package p000;

import java.util.LinkedList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gqq {

    /* JADX INFO: renamed from: a */
    public final kbo f26080a;

    /* JADX INFO: renamed from: d */
    public boolean f26083d;

    /* JADX INFO: renamed from: h */
    private final Runnable f26087h;

    /* JADX INFO: renamed from: c */
    public final LinkedList f26082c = new LinkedList();

    /* JADX INFO: renamed from: e */
    public boolean f26084e = false;

    /* JADX INFO: renamed from: f */
    public nqf f26085f = nqf.m17621g();

    /* JADX INFO: renamed from: b */
    public final Object f26081b = new Object();

    /* JADX INFO: renamed from: g */
    public int f26086g = 3;

    public gqq(kbn kbnVar, Runnable runnable) {
        this.f26087h = runnable;
        this.f26080a = kbnVar.mo6314a("ProcessingSvcMgr");
    }

    /* JADX INFO: renamed from: a */
    public final void m9649a(gqs gqsVar) {
        synchronized (this.f26081b) {
            if (this.f26082c.contains(gqsVar)) {
                throw new IllegalArgumentException("Task already enqueued");
            }
            this.f26082c.add(gqsVar);
            this.f26080a.mo13940b("Task added [" + String.valueOf(gqsVar) + "]. Queue size now: " + this.f26082c.size());
            if (!this.f26084e) {
                m9650b();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9650b() {
        synchronized (this.f26081b) {
            int i = this.f26086g;
            if (i == 3) {
                this.f26080a.mo13944f("Starting service (was DESTROYED)");
                this.f26087h.run();
                this.f26086g = 1;
            } else if (i == 2) {
                this.f26080a.mo13944f("Scheduling service restart, is shutting down");
                this.f26083d = true;
            }
        }
    }
}
