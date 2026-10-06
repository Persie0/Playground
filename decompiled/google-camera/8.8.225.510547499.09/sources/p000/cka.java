package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cka implements kba {

    /* JADX INFO: renamed from: a */
    public final nqf f5954a;

    /* JADX INFO: renamed from: b */
    public final nqf f5955b;

    /* JADX INFO: renamed from: c */
    public final nps f5956c;

    /* JADX INFO: renamed from: d */
    public final nps f5957d;

    public cka(ScheduledExecutorService scheduledExecutorService, nqf nqfVar, cdu cduVar) {
        nqf nqfVarM17621g = nqf.m17621g();
        this.f5954a = nqfVarM17621g;
        nqf nqfVarM17621g2 = nqf.m17621g();
        this.f5955b = nqfVarM17621g2;
        nps npsVarM17553i = nod.m17553i(kxk.m14959E(nqfVarM17621g2, nqfVarM17621g).m17605a(ljc.f38362b, not.INSTANCE), cgh.f5589e, not.INSTANCE);
        this.f5956c = npsVarM17553i;
        this.f5957d = nnj.m17523i(kxk.m14972R(npsVarM17553i, 4000L, TimeUnit.MILLISECONDS, scheduledExecutorService), Throwable.class, cgh.f5590f, not.INSTANCE);
        if (!nqfVar.isDone()) {
            nqfVar.mo16665f(nnj.m17523i(nod.m17553i(npsVarM17553i, cgh.f5591g, not.INSTANCE), Throwable.class, cgh.f5592h, not.INSTANCE));
        }
        cduVar.m3529i().m13537d(this);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        if (this.f5956c.isDone()) {
            return;
        }
        this.f5956c.cancel(true);
    }
}
