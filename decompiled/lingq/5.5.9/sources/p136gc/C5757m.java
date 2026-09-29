package p136gc;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;
import p152hb.RunnableC5959c1;

/* JADX INFO: renamed from: gc.m */
/* JADX INFO: loaded from: classes.dex */
public final class C5757m implements InterfaceC5749e, InterfaceC5748d, InterfaceC5746b, InterfaceC5758n {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34828a;

    /* JADX INFO: renamed from: b */
    public final Executor f34829b;

    /* JADX INFO: renamed from: c */
    public final Object f34830c;

    /* JADX INFO: renamed from: d */
    public final Object f34831d;

    public C5757m(Executor executor, InterfaceC5745a interfaceC5745a, C5761q c5761q) {
        this.f34828a = 0;
        this.f34829b = executor;
        this.f34830c = interfaceC5745a;
        this.f34831d = c5761q;
    }

    public C5757m(Executor executor, InterfaceC5747c interfaceC5747c) {
        this.f34828a = 1;
        this.f34830c = new Object();
        this.f34829b = executor;
        this.f34831d = interfaceC5747c;
    }

    public C5757m(Executor executor, InterfaceC5749e interfaceC5749e) {
        this.f34828a = 2;
        this.f34830c = new Object();
        this.f34829b = executor;
        this.f34831d = interfaceC5749e;
    }

    @Override // p136gc.InterfaceC5749e
    /* JADX INFO: renamed from: a */
    public final void mo12098a(Object obj) {
        ((C5761q) this.f34831d).m12123q(obj);
    }

    @Override // p136gc.InterfaceC5748d
    /* JADX INFO: renamed from: b */
    public final void mo12097b(Exception exc) {
        ((C5761q) this.f34831d).m12122p(exc);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p136gc.InterfaceC5758n
    /* JADX INFO: renamed from: c */
    public final void mo12118c(AbstractC5751g abstractC5751g) {
        switch (this.f34828a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                this.f34829b.execute(new RunnableC5959c1(this, abstractC5751g, 2));
                return;
            case 1:
                synchronized (this.f34830c) {
                    if (((InterfaceC5747c) this.f34831d) == null) {
                        return;
                    }
                    this.f34829b.execute(new RunnableC5959c1(this, abstractC5751g, 3));
                    return;
                }
            default:
                if (abstractC5751g.mo12111m()) {
                    synchronized (this.f34830c) {
                        if (((InterfaceC5749e) this.f34831d) != null) {
                            this.f34829b.execute(new RunnableC5959c1(this, abstractC5751g, 4));
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // p136gc.InterfaceC5746b
    /* JADX INFO: renamed from: d */
    public final void mo12096d() {
        ((C5761q) this.f34831d).m12124r();
    }
}
