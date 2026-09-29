package p000;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cd1 implements uo7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9904a;

    public /* synthetic */ cd1(int i) {
        this.f9904a = i;
    }

    @Override // p000.uo7
    public final Object get() {
        switch (this.f9904a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                ds4 ds4Var = ExecutorsRegistrar.f13631a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                builderDetectNetwork.detectResourceMismatches();
                builderDetectNetwork.detectUnbufferedIo();
                return new ma2(Executors.newFixedThreadPool(4, new sx1("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f13634d.get());
            case 2:
                ds4 ds4Var2 = ExecutorsRegistrar.f13631a;
                return new ma2(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new sx1("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f13634d.get());
            case 3:
                ds4 ds4Var3 = ExecutorsRegistrar.f13631a;
                return new ma2(Executors.newCachedThreadPool(new sx1("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f13634d.get());
            case 4:
                ds4 ds4Var4 = ExecutorsRegistrar.f13631a;
                return Executors.newSingleThreadScheduledExecutor(new sx1("Firebase Scheduler", 0, null));
            case 5:
                return Executors.newSingleThreadScheduledExecutor();
            case 6:
                return GaugeManager.lambda$new$0();
            case 7:
                return GaugeManager.lambda$new$1();
            default:
                Random random = h58.f41804j;
            case 8:
                return null;
        }
    }
}
