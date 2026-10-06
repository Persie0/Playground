package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gkx implements kfb {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ gky f25402a;

    /* JADX INFO: renamed from: e */
    private final long f25406e;

    /* JADX INFO: renamed from: b */
    private final List f25403b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final AtomicInteger f25404c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d */
    private final AtomicInteger f25405d = new AtomicInteger(0);

    /* JADX INFO: renamed from: f */
    private boolean f25407f = true;

    public gkx(gky gkyVar, long j) {
        this.f25402a = gkyVar;
        this.f25406e = j;
    }

    /* JADX INFO: renamed from: a */
    public final List m9392a() throws InterruptedException {
        List list;
        try {
            synchronized (this) {
                while (this.f25407f) {
                    wait();
                }
                if (this.f25403b.isEmpty()) {
                    ((nbe) ((nbe) gky.f25408a.m17252c()).mo17276G(2904)).mo17290o("Unable to acquire any frame for this capture.");
                }
                list = this.f25403b;
            }
            return list;
        } catch (InterruptedException e) {
            ((nbe) ((nbe) gky.f25408a.m17251b()).mo17276G((char) 2903)).mo17290o("Interrupted when waiting on framebuffer listener to acquire frames.");
            synchronized (this) {
                this.f25407f = false;
                synchronized (this.f25402a.f25410c) {
                    gky gkyVar = this.f25402a;
                    gkyVar.f25412e.mo9412l(gkyVar.f25411d);
                    throw e;
                }
            }
        }
    }

    @Override // p000.kfb
    /* JADX INFO: renamed from: c */
    public final void mo3625c(kiq kiqVar) {
        synchronized (this) {
            if (this.f25407f) {
                kfd kfdVarM14358b = kiqVar.m14358b();
                if (kfdVarM14358b == null || kfdVarM14358b.f35812c <= this.f25406e) {
                    return;
                }
                int i = this.f25404c.get();
                gky gkyVar = this.f25402a;
                if (i >= gkyVar.f25409b) {
                    synchronized (gkyVar.f25410c) {
                        gky gkyVar2 = this.f25402a;
                        gkyVar2.f25412e.mo9412l(gkyVar2.f25411d);
                    }
                    synchronized (this) {
                        this.f25407f = false;
                        notifyAll();
                    }
                    return;
                }
                key keyVarM14357a = kiqVar.m14357a();
                this.f25404c.incrementAndGet();
                if (keyVarM14357a == null) {
                    ((nbe) ((nbe) gky.f25408a.m17252c()).mo17276G(2906)).mo17272C("Image not available %d (done: %s, metadata done: %s, images done: %s", Integer.valueOf(this.f25404c.get()), Boolean.valueOf(kiqVar.m14361e()), Boolean.valueOf(kiqVar.f36192a.m14290n()), Boolean.valueOf(kiqVar.m14362f()));
                    this.f25402a.f25413f.mo3415bf(null);
                    return;
                }
                this.f25403b.add(keyVarM14357a);
                this.f25402a.f25413f.mo3415bf(null);
                this.f25405d.incrementAndGet();
                keyVarM14357a.mo7049j();
                this.f25405d.get();
            }
        }
    }
}
