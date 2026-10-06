package p000;

import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fxs implements kba {

    /* JADX INFO: renamed from: d */
    private int f23814d;

    /* JADX INFO: renamed from: e */
    private final jwf f23815e;

    /* JADX INFO: renamed from: b */
    private final Object f23812b = new Object();

    /* JADX INFO: renamed from: f */
    private volatile boolean f23816f = false;

    /* JADX INFO: renamed from: c */
    private final Queue f23813c = new LinkedList();

    /* JADX INFO: renamed from: a */
    public final gdw f23811a = new gdw();

    public fxs(int i) {
        this.f23814d = i;
        this.f23815e = new jwf(Integer.valueOf(this.f23814d));
    }

    /* JADX INFO: renamed from: c */
    private final void m8938c(fxp fxpVar, gdu gduVar, nqf nqfVar) {
        kxk.m14975U(fxpVar.mo6600a(), new fxq(this, nqfVar, gduVar), not.INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    public final nps m8939a(fxp fxpVar) {
        if (this.f23816f) {
            return fxpVar.mo6601b();
        }
        nqf nqfVarM17621g = nqf.m17621g();
        gdw gdwVar = this.f23811a;
        synchronized (gdwVar.f24346a) {
            gdwVar.mo3415bf(Integer.valueOf(((Integer) gdwVar.f34942d).intValue() + 1));
        }
        gdv gdvVar = new gdv(gdwVar, 0);
        synchronized (this.f23812b) {
            if (this.f23814d <= 0) {
                this.f23813c.add(new fxr(fxpVar, gdvVar, nqfVarM17621g));
                return nqfVarM17621g;
            }
            lku.m15613H(this.f23813c.isEmpty());
            int i = this.f23814d - 1;
            this.f23814d = i;
            this.f23815e.mo3415bf(Integer.valueOf(i));
            m8938c(fxpVar, gdvVar, nqfVarM17621g);
            return nqfVarM17621g;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8940b() {
        synchronized (this.f23812b) {
            fxr fxrVar = (fxr) this.f23813c.poll();
            if (fxrVar == null) {
                int i = this.f23814d + 1;
                this.f23814d = i;
                this.f23815e.mo3415bf(Integer.valueOf(i));
            } else {
                m8938c(fxrVar.f23808a, fxrVar.f23809b, fxrVar.f23810c);
            }
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f23816f = true;
    }
}
