package p000;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class odb extends ycb {

    /* JADX INFO: renamed from: b */
    public final i44 f54233b;

    /* JADX INFO: renamed from: c */
    public final wr9 f54234c;

    /* JADX INFO: renamed from: d */
    public final ho5 f54235d;

    public odb(int i, i44 i44Var, wr9 wr9Var, ho5 ho5Var) {
        super(i);
        this.f54234c = wr9Var;
        this.f54233b = i44Var;
        this.f54235d = ho5Var;
        if (i == 2 && i44Var.f43480a) {
            C3386nv.m17626m("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // p000.qdb
    /* JADX INFO: renamed from: a */
    public final void mo13797a(Status status) {
        this.f54235d.getClass();
        this.f54234c.m24139c(lda.m16138x(status));
    }

    @Override // p000.qdb
    /* JADX INFO: renamed from: b */
    public final void mo13798b(Exception exc) {
        this.f54234c.m24139c(exc);
    }

    @Override // p000.qdb
    /* JADX INFO: renamed from: c */
    public final void mo13799c(qfa qfaVar, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) qfaVar.f57706b;
        wr9 wr9Var = this.f54234c;
        map.put(wr9Var, boolValueOf);
        wr9Var.f67208a.m22200o(new cdb(qfaVar, wr9Var));
    }

    @Override // p000.qdb
    /* JADX INFO: renamed from: d */
    public final void mo13800d(scb scbVar) throws DeadObjectException {
        wr9 wr9Var = this.f54234c;
        try {
            i44 i44Var = this.f54233b;
            ((a58) ((i44) i44Var.f43483d).f43482c).accept(scbVar.f60689g, wr9Var);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo13797a(qdb.m19873e(e2));
        } catch (RuntimeException e3) {
            wr9Var.m24139c(e3);
        }
    }

    @Override // p000.ycb
    /* JADX INFO: renamed from: f */
    public final Feature[] mo16787f(scb scbVar) {
        return (Feature[]) this.f54233b.f43482c;
    }

    @Override // p000.ycb
    /* JADX INFO: renamed from: g */
    public final boolean mo16788g(scb scbVar) {
        return this.f54233b.f43480a;
    }

    @Override // p000.ycb
    /* JADX INFO: renamed from: h */
    public final int mo16789h(scb scbVar) {
        return this.f54233b.f43481b;
    }
}
