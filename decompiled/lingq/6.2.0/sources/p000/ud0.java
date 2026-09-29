package p000;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class ud0 extends AbstractC0793b0 {

    /* JADX INFO: renamed from: f */
    public final Thread f63749f;

    /* JADX INFO: renamed from: g */
    public final yt2 f63750g;

    public ud0(kn1 kn1Var, Thread thread, yt2 yt2Var) {
        super(kn1Var, true);
        this.f63749f = thread;
        this.f63750g = yt2Var;
    }

    @Override // kotlinx.coroutines.C3213d
    /* JADX INFO: renamed from: t */
    public final void mo4900t(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f63749f;
        if (fa4.m11650l(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
