package p000;

import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nqm extends npb implements RunnableFuture {

    /* JADX INFO: renamed from: a */
    private volatile npr f44068a;

    public nqm(nol nolVar) {
        this.f44068a = new nqk(this, nolVar);
    }

    /* JADX INFO: renamed from: g */
    public static nqm m17622g(nol nolVar) {
        return new nqm(nolVar);
    }

    /* JADX INFO: renamed from: h */
    public static nqm m17623h(Callable callable) {
        return new nqm(callable);
    }

    /* JADX INFO: renamed from: i */
    public static nqm m17624i(Runnable runnable, Object obj) {
        return new nqm(Executors.callable(runnable, obj));
    }

    @Override // p000.nnz
    /* JADX INFO: renamed from: bQ */
    protected final String mo14892bQ() {
        npr nprVar = this.f44068a;
        if (nprVar == null) {
            return super.mo14892bQ();
        }
        return "task=[" + nprVar.toString() + VzWFSVj.LAAShJaBUKRRgRi;
    }

    @Override // p000.nnz
    /* JADX INFO: renamed from: c */
    protected final void mo14893c() {
        npr nprVar;
        if (m17547p() && (nprVar = this.f44068a) != null) {
            nprVar.m17614h();
        }
        this.f44068a = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        npr nprVar = this.f44068a;
        if (nprVar != null) {
            nprVar.run();
        }
        this.f44068a = null;
    }

    public nqm(Callable callable) {
        this.f44068a = new nql(this, callable);
    }
}
