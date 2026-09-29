package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class vz9 extends be4 {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f66142j = AtomicIntegerFieldUpdater.newUpdater(vz9.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: h */
    public final Thread f66143h = Thread.currentThread();

    /* JADX INFO: renamed from: i */
    public ci2 f66144i;

    /* JADX INFO: renamed from: u */
    public static void m23659u(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // p000.be4
    /* JADX INFO: renamed from: r */
    public final boolean mo3669r() {
        return true;
    }

    @Override // p000.be4
    /* JADX INFO: renamed from: s */
    public final void mo3670s(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f66142j;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                m23659u(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.f66143h.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    /* JADX INFO: renamed from: t */
    public final void m23660t() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f66142j;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m23659u(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                ci2 ci2Var = this.f66144i;
                if (ci2Var != null) {
                    ci2Var.mo125a();
                    return;
                }
                return;
            }
        }
    }
}
