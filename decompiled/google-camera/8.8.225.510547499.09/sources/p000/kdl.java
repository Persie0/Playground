package p000;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class kdl implements kct, kba {

    /* JADX INFO: renamed from: d */
    private kdk f35651d;

    /* JADX INFO: renamed from: e */
    private kpj f35652e;

    /* JADX INFO: renamed from: h */
    private boolean f35655h;

    /* JADX INFO: renamed from: a */
    public final Object f35648a = new Object();

    /* JADX INFO: renamed from: c */
    public final Set f35650c = new HashSet();

    /* JADX INFO: renamed from: g */
    private final Queue f35654g = new LinkedList();

    /* JADX INFO: renamed from: b */
    public final CountDownLatch f35649b = new CountDownLatch(1);

    /* JADX INFO: renamed from: i */
    private int f35656i = 1;

    /* JADX INFO: renamed from: f */
    private boolean f35653f = false;

    /* JADX INFO: renamed from: f */
    private final void m13997f(boolean z) {
        kdk kdkVar;
        synchronized (this.f35648a) {
            this.f35655h = z | this.f35655h;
            if (!this.f35653f && !this.f35654g.isEmpty()) {
                this.f35653f = true;
                do {
                    synchronized (this.f35648a) {
                        if (this.f35654g.isEmpty()) {
                            if (this.f35655h) {
                                this.f35650c.clear();
                            }
                            this.f35653f = false;
                            return;
                        } else {
                            kdkVar = (kdk) this.f35654g.remove();
                            this.f35651d = kdkVar;
                            mws mwsVarM17095j = mws.m17095j(this.f35650c);
                            int size = mwsVarM17095j.size();
                            for (int i = 0; i < size; i++) {
                                kdkVar.mo13996a((kct) mwsVarM17095j.get(i));
                            }
                        }
                    }
                } while (kdkVar != null);
            }
        }
    }

    @Override // p000.kct
    /* JADX INFO: renamed from: a */
    public final void mo13971a() {
        boolean z;
        kpj kpjVar;
        synchronized (this.f35648a) {
            int i = this.f35656i;
            if (i == 1 || i == 2) {
                this.f35656i = 5;
                this.f35654g.add(new kdi(1));
                z = true;
            } else {
                z = false;
            }
            kpjVar = this.f35652e;
            if (kpjVar != null) {
                this.f35652e = null;
            } else {
                kpjVar = null;
            }
        }
        if (z) {
            m13997f(true);
        }
        if (kpjVar != null) {
            kpjVar.close();
        }
        this.f35649b.countDown();
    }

    @Override // p000.kct
    /* JADX INFO: renamed from: b */
    public final void mo13972b() {
        boolean z;
        synchronized (this.f35648a) {
            int i = this.f35656i;
            z = false;
            if (i == 1 || i == 2) {
                this.f35656i = 3;
                this.f35654g.add(new kdi(0));
                z = true;
            }
        }
        if (z) {
            m13997f(true);
        }
        mo13971a();
    }

    @Override // p000.kct
    /* JADX INFO: renamed from: c */
    public final void mo13973c(kcl kclVar) {
        boolean z;
        synchronized (this.f35648a) {
            int i = this.f35656i;
            if (i == 1 || i == 2) {
                this.f35656i = 4;
                this.f35654g.add(new kdj(kclVar, 1));
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            m13997f(true);
        }
        mo13971a();
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        mo13971a();
    }

    @Override // p000.kct
    /* JADX INFO: renamed from: d */
    public void mo13974d(kpj kpjVar) {
        boolean z;
        boolean z2;
        synchronized (this.f35648a) {
            z = true;
            if (this.f35656i == 1) {
                this.f35656i = 2;
                this.f35652e = new kdh(kpjVar, this);
                this.f35654g.add(new kdj(this.f35652e, 0));
                z2 = false;
            } else {
                z2 = true;
                z = false;
            }
        }
        if (z) {
            m13997f(false);
        }
        if (z2) {
            if (kpjVar != null) {
                kpjVar.close();
            }
            mo13971a();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m13998e(kct kctVar) {
        kdk kdkVar;
        synchronized (this.f35648a) {
            int i = this.f35656i;
            if (i != 3 && i != 4 && i != 5) {
                this.f35650c.add(kctVar);
            }
            kdkVar = this.f35651d;
        }
        if (kdkVar != null) {
            kdkVar.mo13996a(kctVar);
        }
    }
}
