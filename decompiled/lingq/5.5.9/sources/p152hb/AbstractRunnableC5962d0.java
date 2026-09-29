package p152hb;

/* JADX INFO: renamed from: hb.d0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC5962d0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5966e0 f35454a;

    public /* synthetic */ AbstractRunnableC5962d0(C5966e0 c5966e0) {
        this.f35454a = c5966e0;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo12406a();

    @Override // java.lang.Runnable
    public final void run() {
        C5966e0 c5966e0 = this.f35454a;
        c5966e0.f35464b.lock();
        try {
            try {
                if (Thread.interrupted()) {
                    c5966e0.f35464b.unlock();
                    return;
                } else {
                    mo12406a();
                    c5966e0.f35464b.unlock();
                    return;
                }
            } catch (RuntimeException e10) {
                HandlerC5987l0 handlerC5987l0 = c5966e0.f35463a.f35534e;
                handlerC5987l0.sendMessage(handlerC5987l0.obtainMessage(2, e10));
                c5966e0.f35464b.unlock();
                return;
            }
        } catch (Throwable th2) {
            c5966e0.f35464b.unlock();
            throw th2;
        }
        c5966e0.f35464b.unlock();
        throw th2;
    }
}
