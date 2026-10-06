package androidx.work;

import android.content.Context;
import p000.RunnableC0852nk;
import p000.axs;
import p000.ayb;
import p000.bev;
import p000.nps;
import p000.ols;
import p000.ooc;
import p000.oqo;
import p000.oqv;
import p000.ord;
import p000.osb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class CoroutineWorker extends ayb {

    /* JADX INFO: renamed from: a */
    public final osb f1792a;

    /* JADX INFO: renamed from: b */
    public final bev f1793b;

    /* JADX INFO: renamed from: g */
    private final oqo f1794g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f1792a = ooc.m18758x();
        bev bevVarM2275g = bev.m2275g();
        this.f1793b = bevVarM2275g;
        bevVarM2275g.mo2282d(new RunnableC0852nk(this, 20), this.f2706d.f1801f.f47802a);
        this.f1794g = ord.f46446a;
    }

    @Override // p000.ayb
    /* JADX INFO: renamed from: a */
    public final nps mo1695a() {
        ooc.m18746l(oqv.m18925f(this.f1794g.plus(this.f1792a)), null, new axs(this, null), 3);
        return this.f1793b;
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo1696b(ols olsVar);

    @Override // p000.ayb
    /* JADX INFO: renamed from: c */
    public final void mo1697c() {
        this.f1793b.cancel(false);
    }
}
