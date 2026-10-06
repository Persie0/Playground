package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class npi implements Runnable {

    /* JADX INFO: renamed from: a */
    final Future f44022a;

    /* JADX INFO: renamed from: b */
    final nph f44023b;

    public npi(Future future, nph nphVar) {
        this.f44022a = future;
        this.f44023b = nphVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thMo17544l;
        Object obj = this.f44022a;
        if ((obj instanceof nqo) && (thMo17544l = ((nqo) obj).mo17544l()) != null) {
            this.f44023b.mo3810a(thMo17544l);
            return;
        }
        try {
            this.f44023b.mo3811b(kxk.m14973S(this.f44022a));
        } catch (Error e) {
            e = e;
            this.f44023b.mo3810a(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.f44023b.mo3810a(e);
        } catch (ExecutionException e3) {
            this.f44023b.mo3810a(e3.getCause());
        }
    }

    public final String toString() {
        mrl mrlVarM16765d = mpw.m16765d(this);
        mrlVarM16765d.m16822a(this.f44023b);
        return mrlVarM16765d.toString();
    }
}
