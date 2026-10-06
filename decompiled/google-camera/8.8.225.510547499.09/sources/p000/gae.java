package p000;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gae extends jvb {

    /* JADX INFO: renamed from: b */
    private static final nbh f24015b = nbh.m17259h("com/google/android/apps/camera/one/lifecycle/TwoStageShutdown");

    /* JADX INFO: renamed from: a */
    public final kbz f24016a;

    /* JADX INFO: renamed from: c */
    private final oju f24017c;

    /* JADX INFO: renamed from: d */
    private final AtomicBoolean f24018d;

    /* JADX INFO: renamed from: e */
    private final Optional f24019e;

    public gae(oju ojuVar, jvz jvzVar, Optional optional, kbz kbzVar) {
        super(jvzVar);
        this.f24017c = ojuVar;
        this.f24018d = new AtomicBoolean(false);
        this.f24019e = optional;
        this.f24016a = kbzVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m8994a() {
        Iterator it = ((Set) this.f24017c.get()).iterator();
        Throwable th = null;
        while (it.hasNext()) {
            try {
                ((gad) it.next()).run();
            } catch (Throwable th2) {
                th = th2;
                ((nbe) ((nbe) ((nbe) f24015b.m17251b()).mo17283h(th)).mo17276G((char) 2541)).mo17290o("Error thrown while running shutdown task");
            }
        }
        super.close();
        if (th != null) {
            throw new RuntimeException(th);
        }
    }

    @Override // p000.jvb
    /* JADX INFO: renamed from: b */
    public final boolean mo8995b() {
        return this.f24018d.get();
    }

    @Override // p000.jvb, p000.kba, java.lang.AutoCloseable
    public final void close() {
        if (this.f24018d.getAndSet(true)) {
            return;
        }
        if (this.f24019e.isPresent()) {
            ((ExecutorService) this.f24019e.get()).submit(new fzz(this, 2));
            return;
        }
        this.f24016a.mo13961e("Critical Path OneCamera Shutdown");
        m8994a();
        this.f24016a.mo13962f();
    }
}
