package p041c5;

import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.impl.utils.futures.C1268a;
import p026b5.AbstractC1314g;
import p532zd.InterfaceFutureC10478a;

/* JADX INFO: renamed from: c5.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1703c0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceFutureC10478a f9488a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RunnableC1707e0 f9489b;

    public RunnableC1703c0(RunnableC1707e0 runnableC1707e0, C1268a c1268a) {
        this.f9489b = runnableC1707e0;
        this.f9488a = c1268a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9489b.f9497K.f7924a instanceof AbstractFuture.C1262b) {
            return;
        }
        try {
            this.f9488a.get();
            AbstractC1314g.m4867d().mo4869a(RunnableC1707e0.f9493M, "Starting work for " + this.f9489b.f9502d.f37526c);
            RunnableC1707e0 runnableC1707e0 = this.f9489b;
            runnableC1707e0.f9497K.m4768k(runnableC1707e0.f9503e.mo4697c());
        } catch (Throwable th2) {
            this.f9489b.f9497K.m4767j(th2);
        }
    }
}
