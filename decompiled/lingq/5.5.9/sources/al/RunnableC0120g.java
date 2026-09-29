package al;

import com.tonyodev.fetch2.Error;
import p122fl.InterfaceC5585h;

/* JADX INFO: renamed from: al.g */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0120g implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0121h f298a;

    public RunnableC0120g(C0121h c0121h) {
        this.f298a = c0121h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC5585h interfaceC5585h = this.f298a.f300b;
        if (interfaceC5585h != null) {
            interfaceC5585h.mo520d(Error.ENQUEUE_NOT_SUCCESSFUL);
        }
    }
}
