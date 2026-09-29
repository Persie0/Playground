package p241le;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: le.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7327c0 extends AbstractRunnableC7326c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f41033a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ExecutorService f41034b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f41035c = 2;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TimeUnit f41036d;

    public C7327c0(String str, ExecutorService executorService, TimeUnit timeUnit) {
        this.f41033a = str;
        this.f41034b = executorService;
        this.f41036d = timeUnit;
    }

    @Override // p241le.AbstractRunnableC7326c
    /* JADX INFO: renamed from: a */
    public final void mo14742a() {
        String str = this.f41033a;
        ExecutorService executorService = this.f41034b;
        try {
            String str2 = "Executing shutdown hook for " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            executorService.shutdown();
            if (executorService.awaitTermination(this.f41035c, this.f41036d)) {
                return;
            }
            String str3 = str + " did not shut down in the allocated time. Requesting immediate shutdown.";
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            String str4 = String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", str);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str4, null);
            }
            executorService.shutdownNow();
        }
    }
}
