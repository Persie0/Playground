package p000;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class idb extends qdb {

    /* JADX INFO: renamed from: b */
    public final g90 f44005b;

    public idb(int i, g90 g90Var) {
        super(i);
        this.f44005b = g90Var;
    }

    @Override // p000.qdb
    /* JADX INFO: renamed from: a */
    public final void mo13797a(Status status) {
        try {
            this.f44005b.m12419h(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // p000.qdb
    /* JADX INFO: renamed from: b */
    public final void mo13798b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.f44005b.m12419h(new Status(10, AbstractC3393o1.m17739n(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ": ", localizedMessage), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // p000.qdb
    /* JADX INFO: renamed from: c */
    public final void mo13799c(qfa qfaVar, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) qfaVar.f57705a;
        g90 g90Var = this.f44005b;
        map.put(g90Var, boolValueOf);
        g90Var.m5283a(new zdb(qfaVar, g90Var));
    }

    @Override // p000.qdb
    /* JADX INFO: renamed from: d */
    public final void mo13800d(scb scbVar) throws DeadObjectException {
        try {
            g90 g90Var = this.f44005b;
            co3 co3Var = scbVar.f60689g;
            g90Var.getClass();
            try {
                g90Var.mo4602g(co3Var);
            } catch (DeadObjectException e) {
                g90Var.m12419h(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e2) {
                g90Var.m12419h(new Status(8, e2.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e3) {
            mo13798b(e3);
        }
    }
}
