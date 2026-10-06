package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class nnj extends npb implements Runnable {

    /* JADX INFO: renamed from: a */
    nps f43939a;

    /* JADX INFO: renamed from: b */
    Class f43940b;

    /* JADX INFO: renamed from: c */
    Object f43941c;

    public nnj(nps npsVar, Class cls, Object obj) {
        npsVar.getClass();
        this.f43939a = npsVar;
        this.f43940b = cls;
        obj.getClass();
        this.f43941c = obj;
    }

    /* JADX INFO: renamed from: i */
    public static nps m17523i(nps npsVar, Class cls, mrf mrfVar, Executor executor) {
        nni nniVar = new nni(npsVar, cls, mrfVar);
        npsVar.mo2282d(nniVar, kxk.m14957C(executor, nniVar));
        return nniVar;
    }

    /* JADX INFO: renamed from: j */
    public static nps m17524j(nps npsVar, Class cls, nom nomVar, Executor executor) {
        nnh nnhVar = new nnh(npsVar, cls, nomVar);
        npsVar.mo2282d(nnhVar, kxk.m14957C(executor, nnhVar));
        return nnhVar;
    }

    @Override // p000.nnz
    /* JADX INFO: renamed from: bQ */
    protected final String mo14892bQ() {
        String str;
        nps npsVar = this.f43939a;
        Class cls = this.f43940b;
        Object obj = this.f43941c;
        String strBQ = super.mo14892bQ();
        if (npsVar != null) {
            str = "inputFuture=[" + npsVar.toString() + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strBQ != null) {
                return str.concat(strBQ);
            }
            return null;
        }
        return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // p000.nnz
    /* JADX INFO: renamed from: c */
    protected final void mo14893c() {
        m17546o(this.f43939a);
        this.f43939a = null;
        this.f43940b = null;
        this.f43941c = null;
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo17521g(Object obj, Throwable th);

    /* JADX INFO: renamed from: h */
    public abstract void mo17522h(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable e;
        Object objM14973S;
        nps npsVar = this.f43939a;
        Class cls = this.f43940b;
        Object obj = this.f43941c;
        if (((obj == null) || ((npsVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.f43939a = null;
        try {
            e = npsVar instanceof nqo ? ((nqo) npsVar).mo17544l() : null;
            objM14973S = e == null ? kxk.m14973S(npsVar) : null;
        } catch (Error e2) {
            e = e2;
            objM14973S = null;
        } catch (RuntimeException e3) {
            e = e3;
            objM14973S = null;
        } catch (ExecutionException e4) {
            Throwable cause = e4.getCause();
            if (cause == null) {
                e = new NullPointerException("Future type " + String.valueOf(npsVar.getClass()) + " threw " + String.valueOf(e4.getClass()) + " without a cause");
            } else {
                e = cause;
            }
            objM14973S = null;
        }
        if (e == null) {
            mo14894e(objM14973S);
            return;
        }
        if (!cls.isInstance(e)) {
            mo16665f(npsVar);
            return;
        }
        try {
            Object objMo17521g = mo17521g(obj, e);
            this.f43940b = null;
            this.f43941c = null;
            mo17522h(objMo17521g);
        } catch (Throwable th) {
            try {
                ntw.m17728n(th);
                mo8566a(th);
            } finally {
                this.f43940b = null;
                this.f43941c = null;
            }
        }
    }
}
