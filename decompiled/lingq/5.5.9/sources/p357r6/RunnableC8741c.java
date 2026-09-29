package p357r6;

import java.util.concurrent.Callable;
import p043c7.C1735a;

/* JADX INFO: renamed from: r6.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8741c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8740b.d f46365a;

    /* JADX INFO: renamed from: r6.c$a */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            RunnableC8741c runnableC8741c = RunnableC8741c.this;
            C8740b.d dVar = runnableC8741c.f46365a;
            C8740b.this.f46337I.m15822l0(dVar.f46361c);
            C8740b.d dVar2 = runnableC8741c.f46365a;
            C8740b.this.mo594d0();
            C8740b.this.m16979k0(dVar2.f46361c, dVar2.f46359a, dVar2.f46360b);
            return null;
        }
    }

    public RunnableC8741c(C8740b.d dVar) {
        this.f46365a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1735a.m5472a(C8740b.this.f46343d).m5474b().m6585b("queueEventWithDelay", new a());
    }
}
