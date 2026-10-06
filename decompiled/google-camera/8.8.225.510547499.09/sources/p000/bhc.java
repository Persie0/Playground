package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bhc extends FutureTask {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ bhd f3265a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhc(bhd bhdVar, Callable callable) {
        super(callable);
        this.f3265a = bhdVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        if (isCancelled()) {
            return;
        }
        try {
            this.f3265a.m2458c((bhb) get());
        } catch (InterruptedException | ExecutionException e) {
            this.f3265a.m2458c(new bhb(e));
        }
    }
}
