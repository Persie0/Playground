package p000;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ops extends opp {

    /* JADX INFO: renamed from: b */
    public final orj f46402b;

    /* JADX INFO: renamed from: e */
    private final Thread f46403e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ops(oly olyVar, Thread thread, orj orjVar) {
        super(olyVar);
        olyVar.getClass();
        thread.getClass();
        this.f46403e = thread;
        this.f46402b = orjVar;
    }

    @Override // p000.osg
    /* JADX INFO: renamed from: cN */
    protected final boolean mo18866cN() {
        return true;
    }

    @Override // p000.osg
    /* JADX INFO: renamed from: f */
    protected final void mo18867f(Object obj) {
        if (ooc.m18737c(Thread.currentThread(), this.f46403e)) {
            return;
        }
        LockSupport.unpark(this.f46403e);
    }
}
