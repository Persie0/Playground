package p000;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class mdb extends ycb {

    /* JADX INFO: renamed from: b */
    public final wr9 f51187b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f51188c;

    /* JADX INFO: renamed from: d */
    public final Object f51189d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mdb(qg5 qg5Var, wr9 wr9Var) {
        this(4, wr9Var);
        this.f51188c = 1;
        this.f51189d = qg5Var;
    }

    /* JADX INFO: renamed from: i */
    private final /* bridge */ /* synthetic */ void m16785i(qfa qfaVar, boolean z) {
    }

    /* JADX INFO: renamed from: j */
    private final /* bridge */ /* synthetic */ void m16786j(qfa qfaVar, boolean z) {
    }

    @Override // p000.qdb
    /* JADX INFO: renamed from: a */
    public final void mo13797a(Status status) {
        this.f51187b.m24139c(new ApiException(status));
    }

    @Override // p000.qdb
    /* JADX INFO: renamed from: b */
    public final void mo13798b(Exception exc) {
        this.f51187b.m24139c(exc);
    }

    @Override // p000.qdb
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo13799c(qfa qfaVar, boolean z) {
        int i = this.f51188c;
    }

    @Override // p000.qdb
    /* JADX INFO: renamed from: d */
    public final void mo13800d(scb scbVar) throws DeadObjectException {
        try {
            m16790k(scbVar);
        } catch (DeadObjectException e) {
            mo13797a(qdb.m19873e(e));
            throw e;
        } catch (RemoteException e2) {
            mo13797a(qdb.m19873e(e2));
        } catch (RuntimeException e3) {
            this.f51187b.m24139c(e3);
        }
    }

    @Override // p000.ycb
    /* JADX INFO: renamed from: f */
    public final Feature[] mo16787f(scb scbVar) {
        int i = this.f51188c;
        Object obj = this.f51189d;
        switch (i) {
            case 0:
                return (Feature[]) ((bdb) obj).f8400a.f52586d;
            default:
                bdb bdbVar = (bdb) scbVar.f60693k.get((qg5) obj);
                if (bdbVar == null) {
                    return null;
                }
                return (Feature[]) bdbVar.f8400a.f52586d;
        }
    }

    @Override // p000.ycb
    /* JADX INFO: renamed from: g */
    public final boolean mo16788g(scb scbVar) {
        int i = this.f51188c;
        Object obj = this.f51189d;
        switch (i) {
            case 0:
                return ((bdb) obj).f8400a.f52584b;
            default:
                bdb bdbVar = (bdb) scbVar.f60693k.get((qg5) obj);
                return bdbVar != null && bdbVar.f8400a.f52584b;
        }
    }

    @Override // p000.ycb
    /* JADX INFO: renamed from: h */
    public final int mo16789h(scb scbVar) {
        switch (this.f51188c) {
            case 0:
                return 0;
            default:
                return ((bdb) scbVar.f60693k.get((qg5) this.f51189d)) != null ? 0 : -1;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m16790k(scb scbVar) {
        switch (this.f51188c) {
            case 0:
                bdb bdbVar = (bdb) this.f51189d;
                nc0 nc0Var = bdbVar.f8400a;
                nc0Var.m17332i(scbVar.f60689g, this.f51187b);
                qg5 qg5Var = (qg5) ((wo3) nc0Var.f52585c).f67120b;
                if (qg5Var != null) {
                    scbVar.f60693k.put(qg5Var, bdbVar);
                }
                break;
            default:
                bdb bdbVar2 = (bdb) scbVar.f60693k.remove((qg5) this.f51189d);
                if (bdbVar2 == null) {
                    this.f51187b.m24140d(Boolean.FALSE);
                } else {
                    ((b48) bdbVar2.f8401b.f9946c).f7930b.accept(scbVar.f60689g, this.f51187b);
                    ((wo3) bdbVar2.f8400a.f52585c).f67120b = null;
                }
                break;
        }
    }

    public mdb(int i, wr9 wr9Var) {
        super(i);
        this.f51187b = wr9Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mdb(bdb bdbVar, wr9 wr9Var) {
        this(3, wr9Var);
        this.f51188c = 0;
        this.f51189d = bdbVar;
    }
}
