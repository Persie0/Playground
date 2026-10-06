package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cjm implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f5931a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f5932b;

    public cjm(oju ojuVar, int i) {
        this.f5932b = i;
        this.f5931a = ojuVar;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f5932b) {
            case 0:
                break;
        }
        return m3825a();
    }

    /* JADX INFO: renamed from: a */
    public final Executor m3825a() {
        switch (this.f5932b) {
            case 0:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f5931a.get();
                ScheduledExecutorService scheduledExecutorService2 = cje.f5921a;
                scheduledExecutorService.getClass();
                return scheduledExecutorService;
            default:
                ExecutorService executorServiceM3824a = ((cjj) this.f5931a).m3824a();
                ScheduledExecutorService scheduledExecutorService3 = cje.f5921a;
                return executorServiceM3824a;
        }
    }
}
