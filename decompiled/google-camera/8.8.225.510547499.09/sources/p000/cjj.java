package p000;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cjj implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f5927a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f5928b;

    public cjj(oju ojuVar, int i) {
        this.f5928b = i;
        this.f5927a = ojuVar;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f5928b) {
            case 0:
                break;
            case 1:
                break;
        }
        return m3824a();
    }

    /* JADX INFO: renamed from: a */
    public final ExecutorService m3824a() {
        switch (this.f5928b) {
            case 0:
                return cje.m3820a((ScheduledExecutorService) this.f5927a.get());
            case 1:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f5927a.get();
                ScheduledExecutorService scheduledExecutorService2 = cje.f5921a;
                return new jvk(scheduledExecutorService);
            default:
                npu npuVar = (npu) this.f5927a.get();
                ScheduledExecutorService scheduledExecutorService3 = cje.f5921a;
                npuVar.getClass();
                return npuVar;
        }
    }
}
