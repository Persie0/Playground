package no;

import dm.C5207g;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: no.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C7822d<T> extends AbstractC7813a<T> {

    /* JADX INFO: renamed from: c */
    public final Thread f42920c;

    /* JADX INFO: renamed from: d */
    public final AbstractC7847l0 f42921d;

    public C7822d(CoroutineContext coroutineContext, Thread thread, AbstractC7847l0 abstractC7847l0) {
        super(coroutineContext, true);
        this.f42920c = thread;
        this.f42921d = abstractC7847l0;
    }

    @Override // no.C7883z0
    /* JADX INFO: renamed from: n */
    public final void mo14466n(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f42920c;
        if (C5207g.m11106a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
