package p136gc;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;
import p289o5.RunnableC7930j;
import p289o5.RunnableC7933m;

/* JADX INFO: renamed from: gc.l */
/* JADX INFO: loaded from: classes.dex */
public final class C5756l implements InterfaceC5758n, InterfaceC5749e, InterfaceC5748d, InterfaceC5746b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34824a;

    /* JADX INFO: renamed from: b */
    public final Executor f34825b;

    /* JADX INFO: renamed from: c */
    public final Object f34826c;

    /* JADX INFO: renamed from: d */
    public final Object f34827d;

    public C5756l(ExecutorC5760p executorC5760p, InterfaceC5746b interfaceC5746b) {
        this.f34824a = 1;
        this.f34826c = new Object();
        this.f34825b = executorC5760p;
        this.f34827d = interfaceC5746b;
    }

    public C5756l(ExecutorC5760p executorC5760p, InterfaceC5748d interfaceC5748d) {
        this.f34824a = 2;
        this.f34826c = new Object();
        this.f34825b = executorC5760p;
        this.f34827d = interfaceC5748d;
    }

    public /* synthetic */ C5756l(Executor executor, Object obj, C5761q c5761q, int i10) {
        this.f34824a = i10;
        this.f34825b = executor;
        this.f34826c = obj;
        this.f34827d = c5761q;
    }

    @Override // p136gc.InterfaceC5749e
    /* JADX INFO: renamed from: a */
    public final void mo12098a(Object obj) {
        ((C5761q) this.f34827d).m12123q(obj);
    }

    @Override // p136gc.InterfaceC5748d
    /* JADX INFO: renamed from: b */
    public final void mo12097b(Exception exc) {
        ((C5761q) this.f34827d).m12122p(exc);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p136gc.InterfaceC5758n
    /* JADX INFO: renamed from: c */
    public final void mo12118c(AbstractC5751g abstractC5751g) {
        switch (this.f34824a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                this.f34825b.execute(new RunnableC7933m(this, abstractC5751g, 8));
                return;
            case 1:
                if (abstractC5751g.mo12109k()) {
                    synchronized (this.f34826c) {
                        try {
                            if (((InterfaceC5746b) this.f34827d) != null) {
                                this.f34825b.execute(new RunnableC7930j(6, this));
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
                return;
            case 2:
                if (abstractC5751g.mo12111m() || abstractC5751g.mo12109k()) {
                    return;
                }
                synchronized (this.f34826c) {
                    if (((InterfaceC5748d) this.f34827d) != null) {
                        this.f34825b.execute(new RunnableC7933m(this, abstractC5751g, 9));
                    }
                }
                return;
            default:
                this.f34825b.execute(new RunnableC7933m(this, abstractC5751g, 10));
                return;
        }
    }

    @Override // p136gc.InterfaceC5746b
    /* JADX INFO: renamed from: d */
    public final void mo12096d() {
        ((C5761q) this.f34827d).m12124r();
    }
}
