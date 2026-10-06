package p000;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aml extends FutureTask {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ amm f706a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aml(amm ammVar, Callable callable) {
        super(callable);
        this.f706a = ammVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        try {
            this.f706a.m959e(get());
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (CancellationException e2) {
            this.f706a.m959e(null);
        } catch (ExecutionException e3) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e3.getCause());
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
