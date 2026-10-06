package p000;

import android.util.Log;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class izk extends FutureTask {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ izl f32714a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izk(izl izlVar, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.f32714a = izlVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f32714a.f32715a.f32719c;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            Log.e("GAv4", "MeasurementExecutor: job failed with ".concat(String.valueOf(String.valueOf(th))));
        }
        super.setException(th);
    }
}
