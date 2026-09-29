package no;

import dm.C5207g;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.C7166p;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: no.p1 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC7860p1<U, T extends U> extends C7166p<T> implements Runnable {

    /* JADX INFO: renamed from: d */
    public final long f42956d;

    /* JADX WARN: Illegal instructions before constructor call */
    public RunnableC7860p1(long j10, InterfaceC9968c<? super U> interfaceC9968c) {
        CoroutineContext coroutineContext = ((ContinuationImpl) interfaceC9968c).f38105b;
        C5207g.m11108c(coroutineContext);
        super(interfaceC9968c, coroutineContext);
        this.f42956d = j10;
    }

    @Override // no.AbstractC7813a, no.C7883z0
    /* JADX INFO: renamed from: W */
    public final String mo15545W() {
        return super.mo15545W() + "(timeMillis=" + this.f42956d + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        m15644p(new TimeoutCancellationException("Timed out waiting for " + this.f42956d + " ms", this));
    }
}
