package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gke implements kba {

    /* JADX INFO: renamed from: b */
    public final gof f25248b;

    /* JADX INFO: renamed from: d */
    public goe f25250d;

    /* JADX INFO: renamed from: a */
    public final nqf f25247a = nqf.m17621g();

    /* JADX INFO: renamed from: c */
    public List f25249c = new ArrayList();

    public gke(gof gofVar) {
        this.f25248b = gofVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m9358a() {
        return this.f25249c.size();
    }

    /* JADX INFO: renamed from: b */
    public final void m9359b() {
        ((nbe) ((nbe) gkf.f25251a.m17252c()).mo17276G((char) 2787)).mo17290o("Aborting the ZSL async buffer.");
        close();
        synchronized (this.f25247a) {
            if (!this.f25247a.isDone()) {
                this.f25247a.cancel(true);
            }
        }
        Iterator it = this.f25249c.iterator();
        while (it.hasNext()) {
            ((key) it.next()).close();
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        goe goeVar = this.f25250d;
        if (goeVar != null) {
            goeVar.mo9302a();
        }
    }
}
