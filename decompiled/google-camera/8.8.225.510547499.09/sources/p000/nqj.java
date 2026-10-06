package p000;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nqj extends npb {

    /* JADX INFO: renamed from: a */
    public nps f44062a;

    /* JADX INFO: renamed from: b */
    public ScheduledFuture f44063b;

    public nqj(nps npsVar) {
        npsVar.getClass();
        this.f44062a = npsVar;
    }

    @Override // p000.nnz
    /* JADX INFO: renamed from: bQ */
    protected final String mo14892bQ() {
        nps npsVar = this.f44062a;
        ScheduledFuture scheduledFuture = this.f44063b;
        if (npsVar == null) {
            return null;
        }
        String str = "inputFuture=[" + npsVar.toString() + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // p000.nnz
    /* JADX INFO: renamed from: c */
    protected final void mo14893c() {
        m17546o(this.f44062a);
        ScheduledFuture scheduledFuture = this.f44063b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f44062a = null;
        this.f44063b = null;
    }
}
