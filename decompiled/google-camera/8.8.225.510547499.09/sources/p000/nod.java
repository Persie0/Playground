package p000;

import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class nod extends npb implements Runnable {

    /* JADX INFO: renamed from: a */
    nps f43970a;

    /* JADX INFO: renamed from: b */
    Object f43971b;

    public nod(nps npsVar, Object obj) {
        npsVar.getClass();
        this.f43970a = npsVar;
        obj.getClass();
        this.f43971b = obj;
    }

    /* JADX INFO: renamed from: i */
    public static nps m17553i(nps npsVar, mrf mrfVar, Executor executor) {
        mrfVar.getClass();
        noc nocVar = new noc(npsVar, mrfVar);
        npsVar.mo2282d(nocVar, kxk.m14957C(executor, nocVar));
        return nocVar;
    }

    /* JADX INFO: renamed from: j */
    public static nps m17554j(nps npsVar, nom nomVar, Executor executor) {
        executor.getClass();
        nob nobVar = new nob(npsVar, nomVar);
        npsVar.mo2282d(nobVar, kxk.m14957C(executor, nobVar));
        return nobVar;
    }

    @Override // p000.nnz
    /* JADX INFO: renamed from: bQ */
    protected final String mo14892bQ() {
        String str;
        nps npsVar = this.f43970a;
        Object obj = this.f43971b;
        String strBQ = super.mo14892bQ();
        if (npsVar != null) {
            str = "inputFuture=[" + npsVar.toString() + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strBQ != null) {
                return str.concat(strBQ);
            }
            return null;
        }
        return str + "function=[" + obj.toString() + aJFPpVSaoDO.pMexPwr;
    }

    @Override // p000.nnz
    /* JADX INFO: renamed from: c */
    protected final void mo14893c() {
        m17546o(this.f43970a);
        this.f43970a = null;
        this.f43971b = null;
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo17551g(Object obj, Object obj2);

    /* JADX INFO: renamed from: h */
    public abstract void mo17552h(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        nps npsVar = this.f43970a;
        Object obj = this.f43971b;
        if ((isCancelled() | (npsVar == null)) || (obj == null)) {
            return;
        }
        this.f43970a = null;
        if (npsVar.isCancelled()) {
            mo16665f(npsVar);
            return;
        }
        try {
            try {
                Object objMo17551g = mo17551g(obj, kxk.m14973S(npsVar));
                this.f43971b = null;
                mo17552h(objMo17551g);
            } catch (Throwable th) {
                try {
                    ntw.m17728n(th);
                    mo8566a(th);
                } finally {
                    this.f43971b = null;
                }
            }
        } catch (Error e) {
            mo8566a(e);
        } catch (CancellationException e2) {
            cancel(false);
        } catch (RuntimeException e3) {
            mo8566a(e3);
        } catch (ExecutionException e4) {
            mo8566a(e4.getCause());
        }
    }
}
